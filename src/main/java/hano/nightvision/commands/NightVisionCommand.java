package hano.nightvision.commands;

import hano.nightvision.HanoNightVision;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class NightVisionCommand implements CommandExecutor {

    private final HanoNightVision plugin;

    public NightVisionCommand(HanoNightVision plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (args.length == 0) {
            return handleSelfToggle(sender);
        } else {
            return handleOtherToggle(sender, args);
        }
    }

    private boolean handleSelfToggle(CommandSender sender) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(plugin.getMessage("player-only-command"));
            return true;
        }

        Player player = (Player) sender;
        if (!player.hasPermission("hano.nightvision.use")) {
            player.sendMessage(plugin.getMessage("no-permission"));
            return true;
        }

        toggleNightVision(player);

        if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
            player.sendMessage(plugin.getMessage("self-enabled"));
        } else {
            player.sendMessage(plugin.getMessage("self-disabled"));
        }
        return true;
    }

    private boolean handleOtherToggle(CommandSender sender, String[] args) {
        if (!sender.hasPermission("hano.nightvision.other")) {
            sender.sendMessage(plugin.getMessage("no-permission"));
            return true;
        }

        Player target = Bukkit.getPlayer(args[0]);
        if (target == null) {
            sender.sendMessage(plugin.getMessage("player-not-found"));
            return true;
        }

        toggleNightVision(target);

        if (target.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
            sender.sendMessage(plugin.getMessage("other-enabled").replace("{player}", target.getName()));
            target.sendMessage(plugin.getMessage("toggled-by-other-on").replace("{sender}", sender.getName()));
        } else {
            sender.sendMessage(plugin.getMessage("other-disabled").replace("{player}", target.getName()));
            target.sendMessage(plugin.getMessage("toggled-by-other-off").replace("{sender}", sender.getName()));
        }

        return true;
    }

    private void toggleNightVision(Player player) {
        if (player.hasPotionEffect(PotionEffectType.NIGHT_VISION)) {
            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
        } else {
            player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 0, false, false));
        }
    }
}

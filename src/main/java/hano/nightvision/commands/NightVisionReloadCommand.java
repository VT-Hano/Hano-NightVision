package hano.nightvision.commands;

import hano.nightvision.HanoNightVision;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class NightVisionReloadCommand implements CommandExecutor {

    private final HanoNightVision plugin;

    public NightVisionReloadCommand(HanoNightVision plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, @NotNull Command command, @NotNull String label, String[] args) {
        if (!sender.hasPermission("hano.nightvision.reload")) {
            sender.sendMessage(plugin.getMessage("no-permission"));
            return true;
        }

        plugin.reloadConfig();
        sender.sendMessage(plugin.getMessage("config-reloaded"));

        return true;
    }
}
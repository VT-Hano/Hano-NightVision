package hano.nightvision;

import hano.nightvision.commands.NightVisionCommand;
import hano.nightvision.commands.NightVisionReloadCommand;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class HanoNightVision extends JavaPlugin {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        registerCommands();
        getLogger().info("Hano-NightVision successfully enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("<red>Hano-NightVision successfully disabled!");
    }

    public void registerCommands() {
        String mainCommandName = getConfig().getString("command.name", "hano-nightvision");
        Objects.requireNonNull(getCommand(mainCommandName)).setExecutor(new NightVisionCommand(this));
        Objects.requireNonNull(getCommand(mainCommandName)).setAliases(getConfig().getStringList("command.aliases"));

        Objects.requireNonNull(getCommand("hano-nv-reload")).setExecutor(new NightVisionReloadCommand(this));
    }

    public String getMessage(String path) {
        String message = getConfig().getString("messages." + path, "&cMessage not found: " + path);
        String prefix = getConfig().getString("messages.prefix", "");
        return ChatColor.translateAlternateColorCodes('&', prefix + message);
    }
}

-----

# Hano-NightVision

A simple yet powerful plugin that allows players and administrators to easily manage the Night Vision effect on your Paper/Spigot server.

-----

## ✨ Features

  * **Toggle for Yourself**: Players can quickly toggle the night vision effect on or off for themselves.
  * **Toggle for Others**: Administrators can enable or disable the effect for any other player on the server.
  * **Fully Configurable**: All commands, aliases, and messages can be configured in the `config.yml` file.
  * **Color Code Support**: Easily customize message colors using Minecraft's color codes (`&a`, `&c`, etc.).
  * **Reload Command**: Reload the plugin's configuration in-game without needing to restart the server.
  * **Permission Based**: Every feature is controlled by a permission system, making it easy to manage access for different player groups.

-----

## 🎮 Commands & Permissions

### Commands

| Command | Aliases (Default) | Description |
| --- | --- | --- |
| `/hano-nightvision` | `/nv`, `/hano-nv` | Toggles the night vision effect for yourself. |
| `/hano-nightvision <player>` | `/nv <player>` | Toggles the night vision effect for another player. |
| `/hano-nv-reload` | `/nvrl` | Reloads the plugin's configuration file. |

### Permissions

| Permission | Description | Default |
| --- | --- | --- |
| `hano.nightvision.use` | Allows a player to use the command to toggle Night Vision for themselves. | OP |
| `hano.nightvision.other` | Allows a player to toggle Night Vision for others. | OP |
| `hano.nightvision.reload` | Allows a player to use the reload command. | OP |

-----

## 🛠️ Installation

1.  Download the latest `Hano-NightVision-x.x.x.jar` file.
2.  Place the `.jar` file into your Paper/Spigot server's `plugins` directory.
3.  Restart or reload your server.
4.  (Optional) Edit the `plugins/Hano-NightVision/config.yml` file to your liking, then use the `/nvrl` command to apply the changes.

-----

## ⚙️ Configuration

You can customize everything in the `config.yml` file. Below is the default configuration:

```yaml
# config.yml
command:
  name: "hano-nightvision"
  aliases: ["nv", "hano-nv"]

messages:
  prefix: "&7[&aHano-NightVision&7] "
  no-permission: "&cYou do not have permission to use this command."
  player-only-command: "&cThis command can only be used by players."
  player-not-found: "&cPlayer not found."
  config-reloaded: "&aConfiguration reloaded successfully!"
  
  self-enabled: "&aNight vision has been enabled."
  self-disabled: "&cNight vision has been disabled."

  other-enabled: "&aEnabled night vision for &e{player}&a."
  other-disabled: "&cDisabled night vision for &e{player}&c."

  toggled-by-other-on: "&aYour night vision has been enabled by &e{sender}&a."
  toggled-by-other-off: "&cYour night vision has been disabled by &e{sender}&c."
```

-----

## 🧑‍💻 Author

Plugin created by **Hano**.

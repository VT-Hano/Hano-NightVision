
-----

# Hano-NightVision

Một plugin đơn giản nhưng mạnh mẽ cho phép người chơi và quản trị viên dễ dàng quản lý hiệu ứng nhìn trong bóng tối (Night Vision) trên máy chủ Paper/Spigot.

-----

## ✨ Tính năng

  * **Bật/Tắt cho bản thân**: Người chơi có thể tự bật hoặc tắt hiệu ứng nhìn trong bóng tối một cách nhanh chóng.
  * **Bật/Tắt cho người khác**: Quản trị viên có thể bật hoặc tắt hiệu ứng này cho bất kỳ người chơi nào khác trên máy chủ.
  * **Tùy chỉnh hoàn toàn**: Tất cả các lệnh, bí danh (aliases) và tin nhắn đều có thể được cấu hình trong file `config.yml`.
  * **Hỗ trợ mã màu**: Dễ dàng tùy chỉnh màu sắc cho các tin nhắn bằng cách sử dụng mã màu của Minecraft (`&a`, `&c`, v.v.).
  * **Lệnh tải lại (Reload)**: Tải lại cấu hình plugin ngay trong game mà không cần khởi động lại máy chủ.
  * **Dựa trên quyền hạn**: Mọi tính năng đều được kiểm soát bởi hệ thống quyền (permissions), giúp bạn dễ dàng phân quyền cho các nhóm người chơi.

-----

## 🎮 Lệnh & Quyền hạn

### Lệnh

| Lệnh | Bí danh (Mặc định) | Mô tả |
| --- | --- | --- |
| `/hano-nightvision` | `/nv`, `/hano-nv` | Bật hoặc tắt hiệu ứng nhìn trong bóng tối cho chính bạn. |
| `/hano-nightvision <player>` | `/nv <player>` | Bật hoặc tắt hiệu ứng nhìn trong bóng tối cho một người chơi khác. |
| `/hano-nv-reload` | `/nvrl` | Tải lại file cấu hình của plugin. |

### Quyền hạn (Permissions)

| Quyền | Mô tả | Mặc định |
| --- | --- | --- |
| `hano.nightvision.use` | Cho phép người chơi sử dụng lệnh để bật/tắt Night Vision cho chính mình. | OP |
| `hano.nightvision.other` | Cho phép người chơi bật/tắt Night Vision cho người khác. | OP |
| `hano.nightvision.reload` | Cho phép người chơi sử dụng lệnh tải lại cấu hình. | OP |

-----

## 🛠️ Cài đặt

1.  Tải file `Hano-NightVision-x.x.x.jar` mới nhất.
2.  Đặt file `.jar` vào thư mục `plugins` của máy chủ Paper/Spigot của bạn.
3.  Khởi động lại hoặc tải lại máy chủ.
4.  (Tùy chọn) Chỉnh sửa file `plugins/Hano-NightVision/config.yml` theo ý muốn của bạn và sau đó dùng lệnh `/nvrl` để áp dụng thay đổi.

-----

## ⚙️ Cấu hình

Bạn có thể tùy chỉnh mọi thứ trong file `config.yml`. Dưới đây là cấu hình mặc định:

```yaml
# config.yml
command:
  name: "hano-nightvision"
  aliases: ["nv", "hano-nv"]

messages:
  prefix: "&7[&aHano-NightVision&7] "
  no-permission: "&cBạn không có quyền để sử dụng lệnh này."
  player-only-command: "&cLệnh này chỉ có thể được sử dụng bởi người chơi."
  player-not-found: "&cKhông tìm thấy người chơi này."
  config-reloaded: "&aĐã tải lại cấu hình thành công!"
  
  self-enabled: "&aĐã bật chế độ nhìn trong bóng tối."
  self-disabled: "&cĐã tắt chế độ nhìn trong bóng tối."

  other-enabled: "&aĐã bật chế độ nhìn trong bóng tối cho &e{player}&a."
  other-disabled: "&cĐã tắt chế độ nhìn trong bóng tối cho &e{player}&c."

  toggled-by-other-on: "&aBạn đã được bật chế độ nhìn trong bóng tối bởi &e{sender}&a."
  toggled-by-other-off: "&cChế độ nhìn trong bóng tối của bạn đã bị tắt bởi &e{sender}&c."
```

-----

## 🧑‍💻 Tác giả

Plugin được tạo bởi **Hano**.

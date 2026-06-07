# VideoFree - 自由视频播放器

## 📱 功能特性

- 🎬 支持 MP4、M3U8 (HLS)、WebM 等常见视频格式
- 🔗 直接粘贴视频 URL 即可播放
- 📋 自动保存播放历史
- 🖼 支持画中画模式
- ⚡ 倍速播放 (0.5x ~ 2.0x)
- 🔁 循环播放
- 📡 支持浏览器投屏
- 📲 PWA 安装到手机，像原生 App 一样使用

---

## 📲 如何安装到安卓手机

### 方法一：GitHub Pages 部署（推荐，免费）

**第 1 步：上传到 GitHub**
1. 打开 https://github.com 登录你的账号
2. 点击右上角 "+" → "New repository"
3. 仓库名填写 `videofree`，选择 Public，点击 Create
4. 点击 "uploading an existing file"，将 `video-player` 文件夹里的所有文件拖进去
5. 点击 "Commit changes"

**第 2 步：开启 GitHub Pages**
1. 进入仓库 → Settings → Pages
2. Source 选择 "Deploy from a branch"，Branch 选择 "main"，文件夹选 "/ (root)"
3. 点击 Save，等待 1-2 分钟
4. 页面会显示网址：`https://你的用户名.github.io/videofree`

**第 3 步：在安卓手机上安装**
1. 用手机 Chrome 浏览器打开上面的网址
2. 等待页面加载完成
3. 点击地址栏右侧的 "⋮" 菜单 → **"添加到主屏幕"** 或 **"安装应用"**
4. 确认安装，桌面就会出现 VideoFree 图标
5. 点击图标即可像普通 App 一样使用！

---

### 方法二：Netlify 部署（备选）

1. 打开 https://app.netlify.com
2. 注册后点击 "Deploy manually"，将 `video-player` 文件夹拖入
3. 获得网址后，在手机 Chrome 中打开并添加到主屏幕

---

### 方法三：本地局域网测试

1. 电脑和手机连同一个 WiFi
2. 电脑打开终端，进入 `video-player` 文件夹
3. 运行：
   ```
   npx serve .
   ```
4. 终端会显示局域网地址，如 `http://192.168.1.100:3000`
5. 手机浏览器打开该地址即可

---

## 🎮 使用说明

| 操作 | 说明 |
|------|------|
| 输入 URL | 粘贴视频直链或 m3u8 地址，点播放 |
| 快速链接 | 点击预设测试链接体验 |
| 画中画 | 播放后点 🖼 按钮，视频悬浮在其他 App 上 |
| 倍速 | 点击 1.0x 按钮循环切换播放速度 |
| 历史记录 | 自动保存，点击可重新播放 |

---

## ⚠️ 注意事项

- 视频播放依赖源地址可用性，请确保输入的 URL 可访问
- iOS Safari 对 HLS 支持更好；Android Chrome 部分 HLS 流可能需要自动加载 hls.js
- 投屏功能需要 Chrome 浏览器且与投屏设备在同一网络
- PWA 安装需要 HTTPS（GitHub Pages 和 Netlify 自动提供）

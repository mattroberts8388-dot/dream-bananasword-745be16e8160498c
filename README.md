# Banana Sword

A simple Fabric mod for Minecraft 1.20.1 that adds a **Banana Sword** — a sword with a
green shaft and a yellow blade that deals a total of **10 damage to villagers** (and other
merchants). Against everything else it behaves like a normal iron-tier sword.

## What it does
- Adds one item: **Banana Sword** (found in its own creative tab).
- When you hit a villager/merchant, the hit is boosted so the villager takes 10 damage total.
- Green banana-stalk shaft, bright yellow banana blade.

## How to get a .jar without installing Java (GitHub builds it for free)

You do **not** need to install Java or any tools. GitHub will compile the mod for you.

1. **Create a GitHub account** at https://github.com (free).
2. Click the **+** in the top-right → **New repository**. Give it any name (e.g. `banana-sword`), then click **Create repository**.
3. On the new empty repo page, click the link **"uploading an existing file"**.
4. **Extract** the ZIP you downloaded (double-click it) so you get a normal folder.
5. **macOS users — IMPORTANT:** the `.github` folder is **hidden** by default in Finder.
   Press **Cmd + Shift + .** (period) in Finder to reveal hidden files. If you skip this,
   the `.github` folder will NOT be uploaded, the build will never run, and you'll get no .jar.
6. Open the extracted folder and select **ALL files and folders INSIDE it** — including the
   hidden `.github` folder. Do **not** drag the outer folder itself; drag its **contents**.
7. Drag everything into the GitHub upload page.
8. Scroll down and click **Commit changes**.
9. Click the **Actions** tab at the top of your repo. You'll see a build running.
10. Wait about **2 minutes** for it to finish (green check mark).
11. Click the finished workflow run, scroll to **Artifacts**, and download **mod-jar**.
12. Unzip it to get the `.jar`. Copy that `.jar` into your `.minecraft/mods/` folder.

Make sure you have **Fabric Loader** and the **Fabric API** installed for Minecraft 1.20.1.

## License
MIT
package edu.mills.cs180a.ellensfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class EllensFirstPlugin extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().info("EllensFirstPlugin.onEnable has been invoked!");
  }

  @Override
  public void onDisable() {
    getLogger().info("EllensFirstPlugin.onDisable has been invoked!");
  }
}

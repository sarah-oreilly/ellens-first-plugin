package edu.mills.cs180a.sarahsfirstplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class SarahsFirstPlugin extends JavaPlugin {
  @Override
  public void onEnable() {
    getLogger().info("SarahsFirstPlugin.onEnable has been invoked!");
  }

  @Override
  public void onDisable() {
    getLogger().info("SarahsFirstPlugin.onDisable has been invoked!");
  }
}

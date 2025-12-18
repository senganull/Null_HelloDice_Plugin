package com.github.senganull;

import org.bukkit.plugin.java.JavaPlugin;

public final class Null_HelloDice_Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("正常に起動しました。");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("正常に停止しました。");
    }
}

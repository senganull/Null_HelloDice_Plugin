package com.github.senganull;

import org.bukkit.plugin.java.JavaPlugin;

public final class Null_HelloDice_Plugin extends JavaPlugin {

    // @Overrideとは「アノテーション（注釈）」 と呼ばれるもので、Javaコンパイラ（翻訳機）に対する
    // 「これは親クラスにあるメソッドを上書き（改造）したものですよ」という合図
    @Override
    public void onEnable() {
        // Plugin startup logic
        // ログには「緊急（Error）」「警告（Warning）」「通常情報（Info）」などのランクがある
        getLogger().info("正常に起動しました。");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("正常に停止しました。");
    }
}

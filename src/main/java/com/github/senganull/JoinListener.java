package com.github.senganull;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        Component welcomeMessage = Component.text("サーバーへようこそ! ", NamedTextColor.GREEN)
                .append(Component.text(player.getName(), NamedTextColor.GOLD))
                .append(Component.text(" さん!", NamedTextColor.GREEN));
        player.sendMessage(welcomeMessage);

        Component joinMessage = Component.text("➕ ", NamedTextColor.YELLOW)
                .append(Component.text(player.getName(), NamedTextColor.GOLD))
                .append(Component.text(" が参加しました", NamedTextColor.YELLOW));

        event.joinMessage(joinMessage);
    }
}

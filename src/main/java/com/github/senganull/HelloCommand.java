package com.github.senganull;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HelloCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        // プレイヤーかどうかの確認
        if (!(sender instanceof Player)) {
            sender.sendMessage(Component.text("このコマンドはプレイヤーのみ実行可能です。", NamedTextColor.RED));
            return true;
        }

        Player player = (Player) sender;

        Component message = Component.text("こんにちは！ ", NamedTextColor.AQUA)
                .append(Component.text(player.getName(), NamedTextColor.GOLD))
                .append(Component.text(" さん！今日も元気ですね！", NamedTextColor.AQUA));

        player.sendMessage(message);

        return true;
    }
}

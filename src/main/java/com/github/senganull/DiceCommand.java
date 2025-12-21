package com.github.senganull;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class DiceCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        //プレイヤーの確認
        if (!(sender instanceof Player)) {
            sender.sendMessage(Component.text("このコマンドはプレイヤーのみ実行可能です。"));
            return true;
        }

        //Player型にキャスト
        Player player = (Player) sender;

        //乱数を生成
        Random random = new Random();
        int result = random.nextInt(6) + 1;

        // 結果表示
        Component message = Component.text("🎲 サイコロの結果: ", NamedTextColor.YELLOW)
                .append(Component.text(String.valueOf(result), NamedTextColor.GOLD, net.kyori.adventure.text.format.TextDecoration.BOLD));

        player.sendMessage(message);

        // サウンドを再生
        player.playSound(player.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 1.0f, 1.0f);

        return true;
    }
}

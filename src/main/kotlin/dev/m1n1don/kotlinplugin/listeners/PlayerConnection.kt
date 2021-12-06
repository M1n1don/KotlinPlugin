package dev.m1n1don.kotlinplugin.listeners

import org.bukkit.ChatColor
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent

class PlayerConnection : Listener
{
    @EventHandler
    fun onPlayerJoin(e: PlayerJoinEvent)
    {
        val player: Player = e.player

        e.joinMessage = "${ChatColor.GOLD}${player.name} ${ChatColor.YELLOW}がサーバーに参加しました！"
    }

    @EventHandler
    fun onPlayerQuit(e: PlayerQuitEvent)
    {
        val player: Player = e.player

        e.quitMessage = "${ChatColor.WHITE}${player.name} ${ChatColor.RED}がサーバーから退出しました。"
    }
}
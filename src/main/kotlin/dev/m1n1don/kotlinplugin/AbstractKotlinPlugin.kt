package dev.m1n1don.kotlinplugin

import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin

abstract class AbstractKotlinPlugin : JavaPlugin()
{
    protected fun registerListeners(vararg listeners: Listener)
    {
        listeners.forEach { server.pluginManager.registerEvents(it, this) }
    }
}
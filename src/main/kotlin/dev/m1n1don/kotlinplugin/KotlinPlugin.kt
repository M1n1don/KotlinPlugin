package dev.m1n1don.kotlinplugin

import dev.m1n1don.kotlinplugin.listeners.PlayerConnection

class KotlinPlugin : AbstractKotlinPlugin()
{
    companion object
    {
        lateinit var plugin: KotlinPlugin
    }

    override fun onEnable()
    {
        plugin = this

        registerListeners(
                PlayerConnection()
        )
    }
}
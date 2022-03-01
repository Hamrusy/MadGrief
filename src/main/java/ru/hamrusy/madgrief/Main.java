package ru.hamrusy.madgrief;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import ru.hamrusy.madgrief.listeners.PistonsListener;

public final class Main extends JavaPlugin {
    private static Main instance;
    private static FileConfiguration config;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents((Listener)new PistonsListener(), (Plugin)this);
    }
}

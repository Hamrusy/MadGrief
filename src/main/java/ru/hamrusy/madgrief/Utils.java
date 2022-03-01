package ru.hamrusy.madgrief;

import org.bukkit.configuration.file.FileConfiguration;

public class Utils {
    private static FileConfiguration config;

    public Utils() {
    }

    public static FileConfiguration getConfig() {
        return config != null ? config : (config = Config.getFile("config.yml"));
    }
}

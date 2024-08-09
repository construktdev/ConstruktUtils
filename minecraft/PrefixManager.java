package de.construkter.utils.minecraft;

import de.construkter.utils.color.ColorManager;

public class PrefixManager {
    public static String coinsPrefix(){
        return ColorManager.DARK_CYAN + "[" + ColorManager.GOLD + "§bCoin-System" + ColorManager.DARK_CYAN + "] ";
    }

    public static String PluginPrefix(){
        return ColorManager.DARK_CYAN + "[" + ColorManager.GOLD + "§bConstrukter.de" + ColorManager.DARK_CYAN + "] ";
    }

    public static String errorPrefix() {
        return ColorManager.DARK_RED + "§b[" + ColorManager.RED + "!" + ColorManager.DARK_RED + "§b] ";
    }

    public static String adminMessage() {
        return errorPrefix() + "" + ColorManager.RED + "§b[" + ColorManager.RED + "Official Admin Message" + ColorManager.RED + "§b] ";
    }
}

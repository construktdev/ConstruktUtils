package de.construkter.utils.time;

import de.construkter.utils.color.ColorManager;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Timestamp {
    public static String getTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        try {
            return LocalDateTime.now().format(formatter);
        } catch (DateTimeException e) {
           return "[!] Time Error:\n" + e.getMessage();
        }
    }

    public static String getTimestamp(boolean formatted, boolean colored) {
        if (formatted && colored) {
            return ColorManager.CYAN + "[" + ColorManager.BLUE + getTime() + ColorManager.CYAN + "]";
        } else if (formatted && !colored) {
            return "[" + getTime() + "]";
        } else if (!formatted && colored) {
            return ColorManager.BLUE + getTime();
        } else {
            return getTime();
        }
    }
}

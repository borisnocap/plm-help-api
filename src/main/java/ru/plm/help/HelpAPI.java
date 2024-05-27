package ru.plm.help;

import net.kyori.adventure.text.TextComponent;

public interface HelpAPI {

    void registerCommandHelp(String command, String permission, TextComponent specialDescription, String... usage);
}

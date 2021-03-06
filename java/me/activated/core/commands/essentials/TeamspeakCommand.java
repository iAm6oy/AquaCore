package me.activated.core.commands.essentials;

import me.activated.core.enums.Language;
import me.activated.core.utilities.command.BaseCommand;
import me.activated.core.utilities.command.Command;
import me.activated.core.utilities.command.CommandArgs;

public class TeamspeakCommand extends BaseCommand {

    @Command(name = "teamspeak", aliases = "ts")
    public void onCommand(CommandArgs command) {
        command.getPlayer().sendMessage(Language.TEAMSPEAK.toString());
    }
}

package objects;

import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;

import java.util.List;

public interface ICommand {

    void handler(List<String> args, GuildMessageReceivedEvent event);

    String getHelp();

    String getInvoke();

}

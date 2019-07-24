package commands;

import com.sun.org.apache.bcel.internal.classfile.Constant;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import objects.ICommand;

import java.util.List;

public class pingCommand implements ICommand {


    @Override
    public void handler(List<String> args, GuildMessageReceivedEvent event) {
        event.getChannel().sendMessage("Pong").queue(message ->
                message.editMessageFormat("Ping: %sms", event.getJDA().getPing()).queue());
        //CRIAR EMBED PARA EXIBIR AS MENSAGENS BONITINHAS HAHA;
    }

    @Override
    public String getHelp() {
        return "Pong!\n" +
                "Usage: `" + Constants.PREFIX + getInvoke() + "`";
    }

    @Override
    public String getInvoke() {
        return "ping";
    }
}

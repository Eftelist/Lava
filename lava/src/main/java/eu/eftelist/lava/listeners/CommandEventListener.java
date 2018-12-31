package eu.eftelist.lava.listeners;

import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import eu.eftelist.lava.abstracts.LavaPlugin;
import eu.eftelist.lava.interfaces.BukkitEvent;
import eu.eftelist.lava.maps.CommandMap;

public class CommandEventListener implements BukkitEvent<PlayerCommandPreprocessEvent> {

    private CommandMap commandMap;

	public CommandEventListener(LavaPlugin plugin){
        this.commandMap = plugin.getCommandMap();
    }

    @Override
    public void handle(PlayerCommandPreprocessEvent t) {
        String command = t.getMessage().split(" ")[0].replace("/", "");
        String[] _args = t.getMessage().split(" ");
        String[] args = new String[0];
        if(_args.length > 0){
            for (int i = 1; i < _args.length; i++) {
                args[i] = _args[i];
            }
        }
        if(commandMap.containsKey(command)){
            t.setCancelled(true);
            commandMap.getValue(command).handle(t.getPlayer(),args);
        }
    }

}
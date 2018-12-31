package eu.eftelist.lava.abstracts;

import org.bukkit.event.Event;

import eu.eftelist.lava.interfaces.BukkitEvent;
import eu.eftelist.lava.interfaces.Disposable;
import eu.eftelist.lava.maps.CommandMap;

public abstract class Module implements Disposable {

    private LavaPlugin plugin;
    private CommandMap commandMap;

    public Module(LavaPlugin plugin){
        this.plugin = plugin;
        this.commandMap = plugin.getCommandMap();
    }

    public void registerCommand(Command command){
        this.commandMap.put(command.getLabel(), command);
    }

    public <T extends Event> void registerEvent(BukkitEvent<T> event){
        this.plugin.getServer().getPluginManager().registerEvents(event, plugin);
    }

    public abstract void load();
}
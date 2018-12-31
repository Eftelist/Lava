package eu.eftelist.lava.modules;

import org.bukkit.Bukkit;

import eu.eftelist.lava.abstracts.LavaPlugin;
import eu.eftelist.lava.abstracts.Module;
import eu.eftelist.lava.listeners.CommandEventListener;

public class DefaultLavaModule extends Module {

    public DefaultLavaModule(LavaPlugin plugin){
        super(plugin);
    }

    @Override
    public void load(){
        Bukkit.getServer().getPluginManager().registerEvents(new CommandEventListener(getPlugin()),getPlugin());
    }

    @Override
    public void dispose() {
        
    }
}
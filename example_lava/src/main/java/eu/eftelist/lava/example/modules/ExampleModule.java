package eu.eftelist.lava.example.modules;

import org.bukkit.event.player.PlayerJoinEvent;

import eu.eftelist.lava.abstracts.LavaPlugin;
import eu.eftelist.lava.abstracts.Module;

public class ExampleModule extends Module {

    public ExampleModule(LavaPlugin plugin){
        super(plugin);
    }

    @Override
    public void load() {
        registerEvent((PlayerJoinEvent event) -> {
            event.getPlayer().sendMessage("Hi from ExampleModule");
        });
    }

    @Override
    public void dispose() {
        
    }
}
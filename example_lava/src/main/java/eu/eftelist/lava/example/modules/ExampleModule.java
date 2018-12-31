package eu.eftelist.lava.example.modules;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

import eu.eftelist.lava.abstracts.Command;
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
        registerCommand(new Command("test"){
            @Override
            public void handle(Player player, String[] args) {
                player.sendMessage("hi");
            }
        });
    }

    @Override
    public void dispose() {
        
    }
}
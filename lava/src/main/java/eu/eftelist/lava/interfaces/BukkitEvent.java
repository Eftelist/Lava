package eu.eftelist.lava.interfaces;

import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

@FunctionalInterface
public interface BukkitEvent<T extends Event> extends Listener {

    @EventHandler
    void handle(T t);
}
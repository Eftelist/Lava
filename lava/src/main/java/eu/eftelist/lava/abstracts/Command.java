package eu.eftelist.lava.abstracts;

import org.bukkit.entity.Player;

public abstract class Command {

    private String label;

    public Command(String label){
        this.label = label;
    }

    /**
     * Handles command abstract
     */
    public abstract void handle(Player player, String[] args);

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }
}
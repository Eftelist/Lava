package eu.eftelist.lava.abstracts;

import org.bukkit.plugin.java.JavaPlugin;

import eu.eftelist.lava.interfaces.Disposable;
import eu.eftelist.lava.interfaces.Module;
import eu.eftelist.lava.maps.ModuleMap;
import eu.eftelist.utils.fastjava.ActionMap;

public abstract class LavaPlugin extends JavaPlugin implements Disposable {

    private LavaPlugin instance = null;
    private ActionMap<Module> modules = new ModuleMap();

    @Override
    public void onEnable() {
        instance = this;
        onStartup();
    }

    @Override
    public void onDisable() {
        modules.dispose();
        dispose();
        instance = null;
    }

    /**
     * @return the instance
     */
    public LavaPlugin getInstance() {
        return instance;
    }

    /**
     * @return the modules
     */
    public ActionMap<Module> getModules() {
        return modules;
    }

    /**
     * This will load everything on startup of a LavaPlugin
     */
    public abstract void onStartup();
}
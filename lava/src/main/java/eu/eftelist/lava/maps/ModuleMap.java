package eu.eftelist.lava.maps;

import eu.eftelist.utils.fastjava.ActionMap;
import eu.eftelist.lava.interfaces.Module;

public class ModuleMap extends ActionMap<Module> {

    @Override
    public void onAdd(String key, Module value) {
        value.load();
    }

    @Override
    public void dispose() {
        getValues().forEach(Module::dispose);
    }
}
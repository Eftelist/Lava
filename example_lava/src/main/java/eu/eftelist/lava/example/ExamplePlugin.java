package eu.eftelist.lava.example;

import eu.eftelist.lava.abstracts.LavaPlugin;
import eu.eftelist.lava.example.modules.ExampleModule;

public class ExamplePlugin extends LavaPlugin {

    @Override
    public void onStartup() {
        getModules().put("test", new ExampleModule());
    }

    @Override
    public void dispose(){
        
    }

}
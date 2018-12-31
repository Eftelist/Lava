package eu.eftelist.utils.fastjava;

import java.util.ArrayList;
import java.util.HashMap;

import eu.eftelist.lava.interfaces.Disposable;

public abstract class ActionMap<T> implements Disposable {

    private HashMap<String, T> map = new HashMap<>();

    /**
     * Puts a key and value into the map
     * @param key
     * @param value
     */
    public void put(String key, T value){
        map.put(key,value);
        onAdd(key, value);
    }

    /**
     * @param key
     * @return Key exist (true / false)
     */
    public boolean containsKey(String key){
        return map.containsKey(key);
    }

    /**
     * @param key
     * @return T value
     */
    public T getValue(String key){
        return map.get(key);
    }

    /**
     * @return Values in the map
     */
    public ArrayList<T> getValues(){
        return new ArrayList<>(map.values());
    }

    public abstract void onAdd(String key, T value);
}
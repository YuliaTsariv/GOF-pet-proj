package com.example.demo.GOF.factory;

public class ConfigFactory {
    public static Game getConfig(ConfigType type, String name, Long id){
        if(type.equals(ConfigType.ROUND)) {
            return new Round(name, id);
        }
        if(type.equals(ConfigType.SESSION)) {
            return new Session(name, id);
        }
        return null;
    }
}

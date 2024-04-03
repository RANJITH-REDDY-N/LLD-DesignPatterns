package prototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class Register {
    private Map<String, Classmate> register;

    public Register(){
        register = new HashMap<>();
    }
    public void add(Classmate classmate){
        register.put(classmate.getModelName(), classmate);
    }
    public Classmate get(Classmate classmate){
        return register.get(classmate.getModelName());
    }

    public void remove(Classmate classmate){
        register.remove(classmate.getModelName());
    }
}

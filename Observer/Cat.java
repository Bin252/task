package Observer;

import java.util.ArrayList;
import java.util.List;

public class Cat {

    private List<Observer> observers;

    private String name;

    public Cat(String name) {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    public void cry() {
        System.out.println(name + "£º ß÷¡«¡«¡«ß÷¡«¡«¡«");
        for (Observer o : observers) {
            o.response(new Event(name));
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern;

import java.util.ArrayList;

/**
 *
 * @author youssef
 */
public abstract class Subject {
    private ArrayList<Observer> observer=new ArrayList<>();
    public abstract void setState(boolean b);
    public abstract boolean getState();
    public void attatch(Observer observer) {
        this.observer.add(observer);
    }
    public void notifyAllObservers() {
        for(int i=0;i<observer.size();i++) {
            observer.get(i).update();
        }
    }
}

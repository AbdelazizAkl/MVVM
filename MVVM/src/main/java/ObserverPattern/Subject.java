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
public interface Subject {

    public abstract void setState(boolean b);

    public abstract boolean getState();

    public void attatch(Observer observer);

    public void notifyAllObservers();

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModel;

import ObserverPattern.Observer;
import ObserverPattern.Subject;
import java.sql.*;

/**
 *
 * @author youssef
 */
public class ViewProductViewModel extends Observer{
    
    public ViewProductViewModel(Subject subject) {
       this.subject=subject;
       subject.attatch(this);
    }
    @Override
    public void update() {
    boolean state=subject.getVisualState();
    
}
}

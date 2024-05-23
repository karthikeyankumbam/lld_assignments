package com.practice.Assignments.lld2.day142behaviouraldp.stock_observer;



public class TaskManager extends Publisher{


    public void assignTask(Long taskId, Long userId) {
        notifyObservers(taskId, userId); // Assigns a task and notifies all observers
    }
}

package com.observer.demoobserver.subject;

import com.observer.demoobserver.model.WeatherData;
import com.observer.demoobserver.observer.Observer;

import java.util.List;

public interface Subject <T> {

    void registerObserver(Observer<T> observer);

    void removeObserver(Observer<T> observer);

    void notifyObservers();

    List<Observer<T>> getObservers();
}

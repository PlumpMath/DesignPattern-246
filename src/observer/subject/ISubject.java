package observer.subject;

import observer.observer.IObserver;

/**
 * Created by Rick on 2017/3/9.
 */
public interface ISubject {
    void registerObserver(IObserver o);

    void removeObserver(IObserver o);

    void notifyObservers();

}

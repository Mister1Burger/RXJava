package home.rxjavatest;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;

/**
 * Created by java on 06.09.2017.
 */

public class SecondTestClass {
    private boolean flag;

    public Observable<Boolean> isFlag() {
        return Observable.just(flag);
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Observable<List<Car>> getCars(boolean flag) {

        List<Car> carList = new ArrayList<>();
        if (flag = true) {

            return Observable.just(carList)
                    .doOnNext(cars -> cars.add(new Car("Black", 180)))
                    .doOnNext(cars -> cars.add(new Car("Blue", 140)))
                    .doOnNext(cars -> cars.add(new Car("Green", 150)))
                    .doOnNext(cars -> cars.add(new Car("Yellow", 160)));


        } else {
            return Observable.error(new NullPointerException("Null"));
        }

    }
}

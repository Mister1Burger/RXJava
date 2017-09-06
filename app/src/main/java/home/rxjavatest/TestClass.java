package home.rxjavatest;


import java.util.ArrayList;
import java.util.List;


import io.reactivex.Observable;
import io.reactivex.ObservableSource;

public class TestClass {



    public Observable<List<Gun>> getGuns() {

        List<Gun> gunList = new ArrayList<>();

        return Observable.just(gunList)
                .doOnNext(guns -> guns.add(new Gun("4,5mm", 256)))
                .doOnNext(guns -> guns.add(new Gun("5,5mm", 156)))
                .doOnNext(guns -> guns.add(new Gun("6,35mm", 56)))
                .onErrorResumeNext((ObservableSource<? extends List<Gun>>) throwable -> Observable.error((Throwable) throwable));

    }


}

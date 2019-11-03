package com.example.myapplication.network;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class SchedulerUtils {

    /**
     * Create a transformer to compose an Observable to subscribe on separate thread and observe it
     * in UI thread
     *
     * @param <T> Rule of Observable object
     */
    public static <T> ObservableTransformer<T, T> applyAsyncSchedulers() {
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(Observable<T> observable) {
                return observable.subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

//        public static <T> Function<BaseResponse<T>, Observable<T>> convertDataFlatMap() {
//            return new Function<BaseResponse<T>, Observable<T>>() {
//                @Override
//                public Observable<T> apply(BaseResponse<T> response) {
//                    if (!ApiConstant.SUCCESS_CODE.equals(response.getStatus())) {
//                        BaseErrorResponse baseErrorResponse = new BaseErrorResponse();
//                        baseErrorResponse.setError(response.getStatus(),
//                                response.getMessage());
//                        return Observable.error(BaseException.toServerError(baseErrorResponse));
//                    }
//
//                    T data = response.getData();
//                    if (null == data) {
//                        return Observable.empty();
//                    }
//
//                    return Observable.just(response.getData());
//                }
//            };
//        }
}

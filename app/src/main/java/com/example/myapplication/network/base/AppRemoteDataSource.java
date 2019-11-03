package com.example.myapplication.network.base;

public class AppRemoteDataSource extends BaseRemote {

        private volatile static AppRemoteDataSource instance;

        public AppRemoteDataSource() {

        }

        public static AppRemoteDataSource getInstance() {
            if (instance == null) {
                instance = new AppRemoteDataSource();
            }

            return instance;
        }


//        public Observable<GetUserResponse> getUser(String token) {
//            return create(AppService.class)
//                    .getUser(token,null)
//                    .flatMap(SchedulerUtils.convertDataFlatMap())
//                    .compose(SchedulerUtils.applyAsyncSchedulers());
//        }
//
//        public Observable<GetUserResponse> getUser(String token, String idDetail) {
//            return create(AppService.class)
//                    .getUser(token,idDetail)
//                    .flatMap(SchedulerUtils.convertDataFlatMap())
//                    .compose(SchedulerUtils.applyAsyncSchedulers());
//        }
}

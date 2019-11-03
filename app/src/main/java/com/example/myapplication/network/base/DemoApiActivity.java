package com.example.myapplication.network.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import io.reactivex.disposables.CompositeDisposable;

public class DemoApiActivity extends AppCompatActivity {

    private CompositeDisposable mCompositeDisposable = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_demo_api);
        AppRemoteDataSource appRemoteDataSource = AppRemoteDataSource.getInstance();
//        R02Subscribe<GetUserResponse> disposable = appRemoteDataSource.getUser("eyJhbGciOiJSUzI1NiIsImtpZCI6ImVlMjc0MWQ0MWY5ZDQzZmFiMWU2MjhhODVlZmI0MmE4OGVmMzIyOWYiLCJ0eXAiOiJKV1QifQ.eyJuYW1lIjoiRG8gRHVjIiwicGljdHVyZSI6Imh0dHBzOi8vZ3JhcGguZmFjZWJvb2suY29tLzM2ODEwODIwNzExNDUyNy9waWN0dXJlIiwiaXNzIjoiaHR0cHM6Ly9zZWN1cmV0b2tlbi5nb29nbGUuY29tL21lZXR5LWRldiIsImF1ZCI6Im1lZXR5LWRldiIsImF1dGhfdGltZSI6MTU2ODgxODc1NiwidXNlcl9pZCI6InpXNlpOcWRvYjVSeldibnFYREJ5RW5PUTJyTTIiLCJzdWIiOiJ6VzZaTnFkb2I1UnpXYm5xWERCeUVuT1Eyck0yIiwiaWF0IjoxNTY4ODE4OTAzLCJleHAiOjE1Njg4MjI1MDMsImVtYWlsIjoiZ29lY292bnRlc3RlckBnbWFpbC5jb20iLCJlbWFpbF92ZXJpZmllZCI6ZmFsc2UsImZpcmViYXNlIjp7ImlkZW50aXRpZXMiOnsiZmFjZWJvb2suY29tIjpbIjM2ODEwODIwNzExNDUyNyJdLCJlbWFpbCI6WyJnb2Vjb3ZudGVzdGVyQGdtYWlsLmNvbSJdfSwic2lnbl9pbl9wcm92aWRlciI6ImZhY2Vib29rLmNvbSJ9fQ.R7GxNHCn6BrlllCpqlnrl7re-x83ffAJ6eT6ueN-y6byVtmcYD6I10f879hkGeM8QjoCAvRj3fpssEL_t49lGHl7nQ-CGOnO-cOj4V_XsmlbyFMyKNzuGSG3tX3OJDLCo8x-0pkX_FBZ3x6fdiiG-rMZ69fSsEZ4sJ8EmRQO9vmhDrLlMXzlYYQ2tgTdcfnqrb14K0Yvhxp6OObB55IThX8aPT2E6jpAqgn9x3xS6QcPlQdHIMhKb9sK6ggArt-EPIED34VgMUSx3LySohcDDjawVILxAj-Zi_o-mSvJS0izwjmKBiro-O0YEopHi_VvJ_44O-FmweWxTltwp6lXGg").subscribeWith(new R02Subscribe<GetUserResponse>() {
//            @Override
//            public void onSuccess(GetUserResponse object) {
//                Log.d("getUsergetUser",object.getUserName());
//            }
//
//            @Override
//            public void onError(BaseException error) {
//                Log.d("getUsergetUser",error.getMessage());
//            }
//        });
//        mCompositeDisposable.add(disposable);
    }
}

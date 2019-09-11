package com.browser.aa.ui;

import android.support.annotation.NonNull;

import com.browser.aa.mvp.BaseTiActivity;
import com.browser.aa.mvp.BaseTiPresenter;
import com.browser.aa.mvp.BaseTiView;

public class BaseActivity extends BaseTiActivity<BaseTiPresenter<BaseTiView>, BaseTiView> implements BaseTiView {

    @NonNull
    @Override
    public BaseTiPresenter providePresenter() {
        return new BaseTiPresenter();
    }

}

package com.browser.aa.ui;

import android.support.annotation.NonNull;

import com.browser.aa.mvp.BaseTiFragment;
import com.browser.aa.mvp.BaseTiPresenter;
import com.browser.aa.mvp.BaseTiView;

public class BaseFragment extends BaseTiFragment<BaseTiPresenter<BaseTiView>, BaseTiView> implements BaseTiView {

    @NonNull
    @Override
    public BaseTiPresenter providePresenter() {
        return new BaseTiPresenter();
    }

}

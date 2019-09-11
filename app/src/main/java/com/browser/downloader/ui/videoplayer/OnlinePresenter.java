package com.browser.downloader.ui.videoplayer;

import com.browser.aa.mvp.BaseTiPresenter;
import com.browser.downloader.AppApplication;
import com.browser.downloader.data.local.PreferencesManager;
import com.browser.downloader.data.model.Video;

import java.util.ArrayList;

import javax.inject.Inject;

public class OnlinePresenter extends BaseTiPresenter<OnlineView> {

    @Inject
    PreferencesManager mPreferencesManager;

    public OnlinePresenter() {
        AppApplication.getInstance().getComponent().inject(this);
    }

    public ArrayList<Video> getSavedVideos() {
        return mPreferencesManager.getSavedVideos();
    }
}

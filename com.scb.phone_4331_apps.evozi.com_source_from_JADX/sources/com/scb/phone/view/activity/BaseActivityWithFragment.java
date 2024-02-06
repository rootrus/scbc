package com.scb.phone.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.AlertController$RecycleListView;

public abstract class BaseActivityWithFragment extends BaseActivity {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract Fragment mo13702x50fd9e4a();

    /* access modifiers changed from: protected */
    public int MediaSessionCompat$Token() {
        return R.layout.f77942131493019;
    }

    /* access modifiers changed from: protected */
    public abstract String au_();

    public String av_() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(MediaSessionCompat$Token());
        try {
            ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        } catch (IllegalArgumentException unused) {
            Log.e("Unable to bind view", "Layout should have a view container with id = container");
        }
        setStackedBackground();
        getSupportFragmentManager().read().write(R.id.container, mo13702x50fd9e4a(), av_()).write();
    }

    public void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(au_());
        setTabContainer();
    }
}

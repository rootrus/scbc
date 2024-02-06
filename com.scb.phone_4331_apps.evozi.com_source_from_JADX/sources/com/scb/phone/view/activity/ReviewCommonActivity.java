package com.scb.phone.view.activity;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ReviewCommonFragment;
import p040o.AlertController$RecycleListView;
import p040o.ForwardingService;

public abstract class ReviewCommonActivity extends BaseActivity implements ReviewCommonFragment.read {
    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract String mo13826x50fd9e4a();

    /* access modifiers changed from: protected */
    public abstract void MediaSessionCompat$ResultReceiverWrapper();

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79672131493192);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(mo13826x50fd9e4a());
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(mo13826x50fd9e4a());
    }

    public final void write(ForwardingService forwardingService) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, ReviewCommonFragment.MediaBrowserCompat$CustomActionResultReceiver(forwardingService)).write();
    }

    public final void MediaSessionCompat$Token() {
        MediaSessionCompat$ResultReceiverWrapper();
    }
}

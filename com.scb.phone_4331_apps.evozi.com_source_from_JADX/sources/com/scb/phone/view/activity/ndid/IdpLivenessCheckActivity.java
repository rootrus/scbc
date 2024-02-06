package com.scb.phone.view.activity.ndid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p040o.C4066bA;
import p040o.C4120bw;
import p040o.CalendarPagerView;
import p040o.HmlPinActivity;

public class IdpLivenessCheckActivity extends BaseLivenessCheckActivity {
    @HmlPinActivity
    public C4120bw livenessCheckPresenter;

    public static Intent IconCompatParcelizer(Context context, String str) {
        return new Intent(context, IdpLivenessCheckActivity.class).putExtra("com.scb.phone.EXTRA_REQUEST_ID", str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.livenessCheckPresenter.MediaBrowserCompat$ItemReceiver(getIntent().getStringExtra("com.scb.phone.EXTRA_REQUEST_ID"));
        CalendarPagerView.LayoutParams.IconCompatParcelizer(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.livenessCheckPresenter.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final C4066bA MediaSessionCompat$Token() {
        return this.livenessCheckPresenter;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
    }

    public final void MediaSessionCompat$QueueItem() {
        super.MediaSessionCompat$QueueItem();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        super.AppCompatDelegateImpl$ListMenuDecorView();
    }
}

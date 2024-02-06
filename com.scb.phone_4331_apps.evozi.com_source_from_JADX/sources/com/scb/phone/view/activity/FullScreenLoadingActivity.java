package com.scb.phone.view.activity;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import com.scb.phone.R;
import com.scb.phone.data.network.service.NTBTileService;
import p040o.HmlPinActivity;

public final class FullScreenLoadingActivity extends BaseActivity {

    public static final class write {
        public NTBTileService MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        @HmlPinActivity
        public write(NTBTileService nTBTileService) {
            this.MediaBrowserCompat$ItemReceiver = nTBTileService;
        }
    }

    public final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        overridePendingTransition(R.anim.f64132130771980, R.anim.f64142130771981);
        AlertController$RecycleListView();
        new Handler().postDelayed(new read(this), 1000);
    }

    static final class read implements Runnable {
        private /* synthetic */ FullScreenLoadingActivity MediaBrowserCompat$CustomActionResultReceiver;

        read(FullScreenLoadingActivity fullScreenLoadingActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = fullScreenLoadingActivity;
        }

        public final void run() {
            this.MediaBrowserCompat$CustomActionResultReceiver.aj_();
            this.MediaBrowserCompat$CustomActionResultReceiver.finish();
        }
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.f64132130771980, R.anim.f64142130771981);
    }

    public final void onDestroy() {
        super.onDestroy();
    }
}

package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.data.network.service.TransferService;
import com.scb.phone.view.activity.BaseActivity;
import p040o.HmlPinActivity;
import p040o.KtaPassportExtractor_Factory;
import p040o.onGetStartedClick;
import p040o.zzct;

public abstract class BaseHmlLandingActivity extends BaseActivity implements KtaPassportExtractor_Factory {
    public void read() {
    }

    public static final class write {
        public TransferService MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        @HmlPinActivity
        public write(TransferService transferService) {
            this.MediaBrowserCompat$ItemReceiver = transferService;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77942131493019);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_landing_title));
        setTabContainer();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "customerType");
        mo13676d_("p10x1_landing");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.hml_landing_title));
        setTabContainer();
    }

    public void IconCompatParcelizer(zzct.zza zza) {
        onGetStartedClick.write((Object) zza, "customerType");
        onGetStartedClick.write((Object) zza, "customerType");
    }
}

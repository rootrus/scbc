package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.HmlPinActivity;
import p040o.Page;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setCompatPressedTranslationZResource;
import p040o.setProjectProvider;
import p040o.writeUInt64NoTag;

public abstract class HmlBaseSuccessActivity extends BaseActivity implements setProjectProvider {
    @HmlPinActivity
    public Page.Side presenter;

    public abstract String MediaSessionCompat$QueueItem();

    public void read() {
    }

    public void write() {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77952131493020);
        Page.Side side = this.presenter;
        if (side == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        side.MediaBrowserCompat$ItemReceiver(this);
        Page.Side side2 = this.presenter;
        if (side2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = true;
        if (side2.RatingCompat != null) {
            side2.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer write = new Page.Side.write(side2);
        if (side2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write.IconCompatParcelizer(side2.RatingCompat);
        }
        setCompatPressedTranslationZResource setcompatpressedtranslationzresource = side2.IconCompatParcelizer;
        setcompatpressedtranslationzresource.write(setcompatpressedtranslationzresource.MediaBrowserCompat$CustomActionResultReceiver(), new Page.Side.IconCompatParcelizer(side2));
    }

    public final void read(boolean z) {
        ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
        zsyr2kArr[0] = new ZSYR2K("user_type", MediaSessionCompat$QueueItem());
        zsyr2kArr[1] = new ZSYR2K("loan_type", z ? "business_owner" : "consumer");
        this.scbAnalytics.write("p10x1_successful", zsyr2kArr);
    }
}

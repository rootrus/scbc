package com.scb.phone.view.activity.juristic;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.forgotpin.PinLockActivity;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.AlertController$RecycleListView;
import p040o.C7131hE;
import p040o.DocumentBaseOverlayView_Factory;
import p040o.MerchantService;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;

public abstract class BaseJuristicPinActivity extends BaseActivity implements MerchantService, C7131hE {
    @BindView
    public CustomKeypad customKeypad;
    @BindView
    public CustomPinInput customPinInput;
    @BindView
    public TextView textLabelTop;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract DocumentBaseOverlayView_Factory<?> mo34046x50fd9e4a();

    public abstract void MediaSessionCompat$ResultReceiverWrapper();

    /* renamed from: P_ */
    public final void mo13717P_() {
    }

    public final void al_() {
    }

    public void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f78462131493071);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        setStackedBackground();
        MediaSessionCompat$QueueItem();
        MediaSessionCompat$ResultReceiverWrapper();
    }

    public void MediaSessionCompat$QueueItem() {
        setTabContainer();
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.setPinInputListener(this);
        CustomKeypad customKeypad2 = this.customKeypad;
        if (customKeypad2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customKeypad");
        }
        CustomPinInput customPinInput3 = this.customPinInput;
        if (customPinInput3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customKeypad2.setKeypadListener(customPinInput3);
        customKeypad2.setEnabledLines(true);
    }

    public final void read() {
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void onDestroy() {
        CustomPinInput customPinInput2 = this.customPinInput;
        if (customPinInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinInput2.setPinInputListener((MerchantService) null);
        mo34046x50fd9e4a().onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "pin");
        DocumentBaseOverlayView_Factory<?> MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo34046x50fd9e4a();
        onGetStartedClick.write((Object) str, "pin");
        boolean z = true;
        if (!(str.length() == 0) && str.length() >= 6) {
            if (MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.RatingCompat == null) {
                z = false;
            }
            if (z) {
                MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.RatingCompat.AlertController$RecycleListView();
            }
            MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.write(str);
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        write(this, R.id.view_group_root, str, getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            PinLockActivity.read(this);
        } else {
            setShowingForActionMode();
        }
    }

    public void onBackPressed() {
        finish();
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }
}

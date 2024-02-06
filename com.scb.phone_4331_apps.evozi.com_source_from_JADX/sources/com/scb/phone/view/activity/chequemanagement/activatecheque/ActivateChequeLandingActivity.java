package com.scb.phone.view.activity.chequemanagement.activatecheque;

import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chequemanagement.activatecheque.ActivateChequeInputFragment;
import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.ConstructorConstructor;
import p040o.ConstructorConstructor$1$MediaBrowserCompat$ItemReceiver;
import p040o.HmlPinActivity;

public class ActivateChequeLandingActivity extends BaseActivity implements CheckCaptureModule_GetIJsonExactionHelperKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public ConstructorConstructor.C31971 presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f76672131492892);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.activate_cheque);
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ConstructorConstructor.C31971 r4 = this.presenter;
        r4.read.read("DISPLAY_ORDER_CHEQUE");
        r4.read.IconCompatParcelizer(new ConstructorConstructor$1$MediaBrowserCompat$ItemReceiver(r4));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.activate_cheque);
        setTabContainer();
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container_activate_cheque, ActivateChequeInputFragment.MediaBrowserCompat$ItemReceiver(i)).write();
    }
}

package com.scb.phone.view.activity.transferandpay;

import android.app.Activity;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;
import p040o.AlertController$RecycleListView;
import p040o.C4316e;
import p040o.HmlPinActivity;
import p040o.StreetViewPanoramaFragment;

public class CardPaySelectedActivity extends BaseActivity {
    @HmlPinActivity
    public C4316e.C43203 cardPaySelectedPresenter;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76952131492920);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        StreetViewPanoramaFragment.zzb zzb = StreetViewPanoramaFragment.zzb.PROFILE;
        super.setStackedBackground();
        setTitle(R.string.bill_payment_tab);
        setTabContainer();
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, BillPaymentTabFragment.MediaBrowserCompat$CustomActionResultReceiver(zzb, "")).write();
    }

    public void onDestroy() {
        this.cardPaySelectedPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.bill_payment_tab);
        setTabContainer();
    }
}

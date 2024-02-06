package com.scb.phone.view.activity.bankingaccount;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C7171im;
import p040o.C7175io;
import p040o.getTimeOut;
import p040o.setChildDrawingOrderCallback;

public class BankingActionActivity extends BaseActivity {
    private BulkTransferDeepLinkActivity MediaMetadataCompat;
    @BindView
    public ViewGroup tutorialView;

    public final int ExpandedMenuView() {
        return R.style.f95782131820795;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaMetadataCompat = setChildDrawingOrderCallback.IconCompatParcelizer(this, new IntentFilter("com.scb.phone/BROADCAST_SHOW_BANKING_ACTION_TUTORIAL")).subscribe(new C7175io(this), C7171im.MediaBrowserCompat$ItemReceiver);
        setContentView(R.layout.f76712131492896);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("bankingservices_landing");
    }

    public void onBackPressed() {
        if (this.tutorialView.getVisibility() != 0) {
            super.onBackPressed();
        } else {
            this.tutorialView.animate().alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new getTimeOut(this));
        }
    }

    public void onDestroy() {
        super.onDestroy();
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaMetadataCompat;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaMetadataCompat.dispose();
        }
    }

    @OnClick
    public void onClickTutorial() {
        this.tutorialView.animate().alpha(BitmapDescriptorFactory.HUE_RED).withEndAction(new getTimeOut(this));
    }
}

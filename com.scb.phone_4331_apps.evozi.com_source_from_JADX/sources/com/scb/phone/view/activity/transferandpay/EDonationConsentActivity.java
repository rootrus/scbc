package com.scb.phone.view.activity.transferandpay;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.fragment.TermsConditionsFragment;
import p040o.C7430sE;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCreditLimitFragment;
import p040o.HmlPinActivity;
import p040o.StreetViewPanoramaFragment;
import p040o.getIdManager;
import p040o.getTopLeftCornerWidth;
import p040o.sE$MediaBrowserCompat$ItemReceiver;

public class EDonationConsentActivity extends BaseActivityWithFragment implements FragmentBuilder_BindCreditLimitFragment, getTopLeftCornerWidth.PlaybackStateCompat {
    @HmlPinActivity
    public C7430sE presenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setBackground((Drawable) null);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C7430sE sEVar = this.presenter;
        if (sEVar.RatingCompat != null) {
            sEVar.RatingCompat.AlertController$RecycleListView();
        }
        sEVar.read.MediaBrowserCompat$CustomActionResultReceiver();
        sEVar.read.IconCompatParcelizer(new sE$MediaBrowserCompat$ItemReceiver(sEVar, (byte) 0));
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return TermsConditionsFragment.IconCompatParcelizer((getIdManager) null);
    }

    public final String au_() {
        return getString(R.string.edonation_consent_title);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.presenter.read((CrashlyticsReport.Session.Event.Application.Execution) getIntent().getParcelableExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY"), true);
    }

    public final void MediaSessionCompat$QueueItem() {
        this.presenter.read((CrashlyticsReport.Session.Event.Application.Execution) getIntent().getParcelableExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY"), false);
    }

    public final void MediaBrowserCompat$ItemReceiver(getIdManager getidmanager) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsConditionsFragment.IconCompatParcelizer(getidmanager)).write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RatingCompat(false);
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        boolean z;
        if (execution == null || execution.setHasDecor == null) {
            z = true;
        } else {
            z = execution.setHasDecor.read;
        }
        BillPaymentActivity.MediaBrowserCompat$ItemReceiver(this, StreetViewPanoramaFragment.zzb.SCAN, execution, read("source", ""), z);
        finish();
    }
}

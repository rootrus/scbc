package com.scb.phone.view.activity.transferandpay.billpayment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.scb.phone.R;
import com.scb.phone.view.activity.BasePartialSearchActivity;
import com.scb.phone.view.adapter.transferandpay.billpayment.BillPaymentSearchAdapter;
import p040o.C1152x3c012820;
import p040o.C7481sx;
import p040o.CheckEligibilityActivity;
import p040o.CodedOutputStream;
import p040o.CrashlyticsReport;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.TestActivity;
import p040o.onGetStartedClick;

public final class BillPaymentSearchActivity extends BasePartialSearchActivity<CrashlyticsReport.Session.Event.Application.Execution, BillPaymentSearchAdapter.BillPaymentSearchViewHolder> {
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @HmlPinActivity
    public C7481sx presenter;

    public BillPaymentSearchActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final /* synthetic */ void read(Object obj) {
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        onGetStartedClick.write((Object) execution, "item");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_PARTIAL_SEARCH_DISPLAY", execution);
        setResult(-1, intent);
        finish();
    }

    public final CodedOutputStream.OutOfSpaceException<C1152x3c012820> MediaSessionCompat$Token() {
        C7481sx sxVar = this.presenter;
        if (sxVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return sxVar;
    }

    public final void MediaSessionCompat$QueueItem() {
        MediaBrowserCompat$CustomActionResultReceiver(R.drawable.thumb_empty_state, getString(R.string.auto_biller_search_not_found_title), getString(R.string.auto_biller_search_not_found_description));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13737x50fd9e4a() {
        MediaBrowserCompat$CustomActionResultReceiver(R.drawable.icon_easycash_empty, getString(R.string.auto_biller_search_error_title), getString(R.string.auto_biller_search_error_description));
    }

    public static final <T extends Parcelable> T read(Intent intent) {
        Bundle extras;
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return extras.getParcelable("EXTRA_PARTIAL_SEARCH_DISPLAY");
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<BillPaymentSearchAdapter> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new BillPaymentSearchAdapter();
        }
    }

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, BillPaymentSearchActivity.class);
    }

    public final TestActivity<CrashlyticsReport.Session.Event.Application.Execution, BillPaymentSearchAdapter.BillPaymentSearchViewHolder> MediaSessionCompat$ResultReceiverWrapper() {
        return (BillPaymentSearchAdapter) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

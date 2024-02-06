package com.scb.phone.view.activity.directdebit;

import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.BasePartialSearchActivity;
import com.scb.phone.view.adapter.transferandpay.billpayment.BillPaymentSearchAdapter;
import p040o.C1152x3c012820;
import p040o.CodedOutputStream;
import p040o.CrashlyticsReport;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.TestActivity;
import p040o.nativeProcess;
import p040o.onGetStartedClick;

public final class DirectDebitBillerSearchActivity extends BasePartialSearchActivity<CrashlyticsReport.Session.Event.Application.Execution, BillPaymentSearchAdapter.BillPaymentSearchViewHolder> {
    public static final C5594x294c4ffb MediaBrowserCompat$MediaItem = new C5594x294c4ffb((byte) 0);
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @HmlPinActivity
    public nativeProcess presenter;

    public DirectDebitBillerSearchActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = DirectDebitBillerSearchActivity$MediaBrowserCompat$ItemReceiver.read;
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
        nativeProcess nativeprocess = this.presenter;
        if (nativeprocess == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return nativeprocess;
    }

    public final void MediaSessionCompat$QueueItem() {
        MediaBrowserCompat$CustomActionResultReceiver(R.drawable.thumb_empty_state, getString(R.string.auto_biller_search_not_found_title), getString(R.string.auto_biller_search_not_found_description));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo13737x50fd9e4a() {
        MediaBrowserCompat$CustomActionResultReceiver(R.drawable.icon_easycash_empty, getString(R.string.auto_biller_search_error_title), getString(R.string.auto_biller_search_error_description));
    }

    public final TestActivity<CrashlyticsReport.Session.Event.Application.Execution, BillPaymentSearchAdapter.BillPaymentSearchViewHolder> MediaSessionCompat$ResultReceiverWrapper() {
        return (BillPaymentSearchAdapter) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

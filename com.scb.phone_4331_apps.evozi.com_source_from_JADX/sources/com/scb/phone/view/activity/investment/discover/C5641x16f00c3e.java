package com.scb.phone.view.activity.investment.discover;

import android.view.View;
import android.widget.AdapterView;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.captureReportData;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5641x16f00c3e implements AdapterView.OnItemSelectedListener {
    private final FundFactSheetActivity<captureReportData, HmlVerifyPhoneValidateOtpActivity> write;

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public C5641x16f00c3e(FundFactSheetActivity<? super captureReportData, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "func");
        this.write = fundFactSheetActivity;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Object obj = null;
        Object itemAtPosition = adapterView != null ? adapterView.getItemAtPosition(i) : null;
        if (itemAtPosition instanceof captureReportData) {
            obj = itemAtPosition;
        }
        this.write.invoke((captureReportData) obj);
    }
}

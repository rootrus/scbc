package com.scb.phone.view.activity.investment.scbs;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.transferandpay.BillPaymentTabFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.CrashlyticsReport;
import p040o.LogFileManager;
import p040o.StreetViewPanoramaFragment;

public class ScbsInputActivity extends BaseActivityWithFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public final int MediaSessionCompat$Token() {
        return R.layout.f77942131493019;
    }

    public static Intent write(Context context, CrashlyticsReport.Session.Event.Application.Execution execution) {
        Intent intent = new Intent(context, ScbsInputActivity.class);
        intent.putExtra("KEY_BILL_PAYMENT_DISPLAY", execution);
        return intent;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return BillPaymentTabFragment.IconCompatParcelizer(StreetViewPanoramaFragment.zzb.PROFILE, (CrashlyticsReport.Session.Event.Application.Execution) getIntent().getParcelableExtra("KEY_BILL_PAYMENT_DISPLAY"), (LogFileManager.C35981) null, (String) null, true);
    }

    public final String au_() {
        return getString(R.string.case_deposit_button);
    }
}

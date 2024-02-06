package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlAboutFragment;
import java.util.ArrayList;
import p040o.getCreateReportSpiCall;

public class HmlRepaymentAboutActivity extends BaseActivityWithFragment {
    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return new Intent(context, HmlRepaymentAboutActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new getCreateReportSpiCall(getString(R.string.hml_summary_repayment_about_title), getString(R.string.hml_summary_repayment_about_intro)));
        arrayList.add(new getCreateReportSpiCall(getString(R.string.hml_summary_repayment_about_monthly), getString(R.string.hml_summary_repayment_about_monthly_info)));
        arrayList.add(new getCreateReportSpiCall(getString(R.string.hml_summary_reapyment_about_biweekly), getString(R.string.hml_summary_reapyment_about_biweekly_info)));
        arrayList.add(new getCreateReportSpiCall(getString(R.string.hml_summary_repayment_about_remark), getString(R.string.hml_summary_repayment_about_remark_info)));
        return HmlAboutFragment.write(arrayList);
    }

    public final String au_() {
        return getString(R.string.hml_summary_repayment_about);
    }
}

package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlAboutFragment;
import java.util.ArrayList;
import p040o.getCreateReportSpiCall;

public class HmlMonthlyIncomeAboutActivity extends BaseActivityWithFragment {
    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, HmlMonthlyIncomeAboutActivity.class);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new getCreateReportSpiCall(getString(R.string.hml_monthly_income_about_title), getString(R.string.hml_monthly_income_about_intro)));
        arrayList.add(new getCreateReportSpiCall((String) null, getString(R.string.hml_monthly_income_about_steps)));
        return HmlAboutFragment.write(arrayList);
    }

    public final String au_() {
        return getString(R.string.hml_monthly_income_about);
    }
}

package com.scb.phone.view.activity.hml;

import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlETBLoanSetupFragment;
import p040o.onGetStartedClick;

public class HmlETBLoanSetupActivity extends BaseActivityWithFragment {
    public static final HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: setContentView */
    public HmlETBLoanSetupFragment mo13702x50fd9e4a() {
        HmlETBLoanSetupFragment.write write = HmlETBLoanSetupFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlETBLoanSetupFragment();
    }

    public final String au_() {
        String string = getString(R.string.hml_loan_setup_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_loan_setup_title)");
        return string;
    }
}

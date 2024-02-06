package com.scb.phone.view.activity.hml;

import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlNTBApplyLoanEntryFragment;
import p040o.onGetStartedClick;

public final class HmlNTBApplyLoanEntryActivity extends BaseActivityWithFragment {
    public static final HmlNTBApplyLoanEntryActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new HmlNTBApplyLoanEntryActivity$MediaBrowserCompat$ItemReceiver((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        HmlNTBApplyLoanEntryFragment.IconCompatParcelizer iconCompatParcelizer = HmlNTBApplyLoanEntryFragment.MediaBrowserCompat$CustomActionResultReceiver;
        return new HmlNTBApplyLoanEntryFragment();
    }

    public final String au_() {
        String string = getString(R.string.hml_ntb_your_loan_entry_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_ntb_your_loan_entry_title)");
        return string;
    }
}

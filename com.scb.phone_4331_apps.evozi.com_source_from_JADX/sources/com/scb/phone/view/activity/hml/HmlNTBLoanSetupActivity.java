package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlNTBLoanSetupFragment;
import p040o.HmlPinActivity;
import p040o.IPassportExtractorListener;
import p040o.ZSYR2K;
import p040o.getMacAddress;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class HmlNTBLoanSetupActivity extends BaseActivityWithFragment implements IPassportExtractorListener {
    public static final HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public getMacAddress presenter;

    public final int MediaSessionCompat$Token() {
        return R.layout.f77952131493020;
    }

    public final void onBackPressed() {
    }

    public final String au_() {
        String string = getString(R.string.hml_loan_setup_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_loan_setup_title)");
        return string;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getMacAddress getmacaddress = this.presenter;
        if (getmacaddress == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getmacaddress.MediaBrowserCompat$ItemReceiver(this);
        getMacAddress getmacaddress2 = this.presenter;
        if (getmacaddress2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer write = new getMacAddress.write(getmacaddress2);
        if (getmacaddress2.RatingCompat != null) {
            write.IconCompatParcelizer(getmacaddress2.RatingCompat);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "customerType");
        this.scbAnalytics.write("p10x1_loan_setup", new ZSYR2K("user_type", "ntb"));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlNTBLoanSetupFragment.read read = HmlNTBLoanSetupFragment.IconCompatParcelizer;
        return new HmlNTBLoanSetupFragment();
    }
}

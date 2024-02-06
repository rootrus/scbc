package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.HmlNoDepositAccountFragment;
import p040o.onGetStartedClick;

public final class HmlNoDepositAccountActivity extends BaseActivityWithFragment {
    public static final C5620xe00a0a13 MediaBrowserCompat$SearchResultReceiver = new C5620xe00a0a13((byte) 0);

    public final int MediaSessionCompat$Token() {
        return R.layout.f77942131493019;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setPrimaryBackground();
    }

    public final String au_() {
        String string = getString(R.string.hml_no_deposit_account_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_no_deposit_account_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ Fragment mo13702x50fd9e4a() {
        HmlNoDepositAccountFragment.read read = HmlNoDepositAccountFragment.IconCompatParcelizer;
        return new HmlNoDepositAccountFragment();
    }
}

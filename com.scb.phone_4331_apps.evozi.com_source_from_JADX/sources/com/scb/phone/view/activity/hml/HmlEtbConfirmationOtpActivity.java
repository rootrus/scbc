package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.fragment.hml.C5991xba8fa764;
import com.scb.phone.view.fragment.hml.HmlMobileListFragment;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import p040o.BaselineLayout;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.CustomAdvertisingIdClient;
import p040o.CustomAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.addNode;
import p040o.onGetStartedClick;

public final class HmlEtbConfirmationOtpActivity extends BaseOtpActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final HmlEtbConfirmationOtpActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new HmlEtbConfirmationOtpActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public CustomAdvertisingIdClient.C3280b presenter;

    public final MobileListFragment RatingCompat(String str) {
        onGetStartedClick.write((Object) str, "labelBelow");
        C5991xba8fa764 hmlMobileListFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlMobileListFragment.IconCompatParcelizer;
        HmlMobileListFragment hmlMobileListFragment = new HmlMobileListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_LABEL_BELOW", str);
        hmlMobileListFragment.setArguments(bundle);
        return hmlMobileListFragment;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CustomAdvertisingIdClient.C3280b bVar = this.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bVar.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        CustomAdvertisingIdClient.C3280b bVar = this.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("CONSENTS", false);
        onGetStartedClick.write((Object) str, "tokenUuid");
        onGetStartedClick.write((Object) str2, "otp");
        if (bVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            bVar.RatingCompat.AlertController$RecycleListView();
        }
        addNode addnode = bVar.MediaBrowserCompat$ItemReceiver;
        FundActionsSuccessActivity customAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver = new CustomAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver(bVar);
        FundFactSheetActivity write = new CustomAdvertisingIdClient.C3280b.write(bVar);
        onGetStartedClick.write((Object) customAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver, "onSuccess");
        onGetStartedClick.write((Object) write, "onError");
        onGetStartedClick.write((Object) str, "tokenUuid");
        onGetStartedClick.write((Object) str2, "otp");
        addnode.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(customAdvertisingIdClient$b$MediaBrowserCompat$ItemReceiver, write, new BaselineLayout.write(str2, str, booleanExtra), addnode.MediaBrowserCompat$ItemReceiver);
    }

    public final String MediaSessionCompat$Token() {
        String string = getString(R.string.hml_otp_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_otp_title)");
        return string;
    }
}

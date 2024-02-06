package com.scb.phone.view.fragment.bankingagent;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.HmlPinActivity;
import p040o.SettingsSpiCall;
import p040o.onGetStartedClick;

public final class BankingAgentsFragment extends BaseBankingAgentsFragment {
    public static final C5857x430481b1 IconCompatParcelizer = new C5857x430481b1((byte) 0);
    @HmlPinActivity
    public SettingsSpiCall presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f85732131493800, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        SettingsSpiCall settingsSpiCall = this.presenter;
        if (settingsSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsSpiCall.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("com.scb.phone.EXTRA_POSTING_TYPE")) == null)) {
            SettingsSpiCall settingsSpiCall2 = this.presenter;
            if (settingsSpiCall2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) string, "it");
            onGetStartedClick.write((Object) string, "postingType");
            settingsSpiCall2.write = string;
            settingsSpiCall2.read();
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        SettingsSpiCall settingsSpiCall = this.presenter;
        if (settingsSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsSpiCall.read();
    }

    public final void onDestroy() {
        SettingsSpiCall settingsSpiCall = this.presenter;
        if (settingsSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        settingsSpiCall.onDestroy();
        super.onDestroy();
    }
}

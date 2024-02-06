package com.scb.phone.view.fragment.bankingagent;

import android.os.Bundle;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.bankingagent.BankingAgentsFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5857x430481b1 {
    private C5857x430481b1() {
    }

    public /* synthetic */ C5857x430481b1(byte b) {
        this();
    }

    public static BankingAgentsFragment MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "postingType");
        BankingAgentsFragment bankingAgentsFragment = new BankingAgentsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.EXTRA_POSTING_TYPE", str);
        bankingAgentsFragment.setArguments(bundle);
        return bankingAgentsFragment;
    }
}

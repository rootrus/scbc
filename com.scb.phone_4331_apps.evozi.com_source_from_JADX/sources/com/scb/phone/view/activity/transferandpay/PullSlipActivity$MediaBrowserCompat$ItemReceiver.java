package com.scb.phone.view.activity.transferandpay;

import com.scb.phone.view.activity.transferandpay.billpayment.C5720x28eb755c;
import java.util.List;
import p040o.onGetStartedClick;

public final class PullSlipActivity$MediaBrowserCompat$ItemReceiver {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<C5720x28eb755c> read;
    public final String write;

    private PullSlipActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public PullSlipActivity$MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, List<C5720x28eb755c> list) {
        onGetStartedClick.write((Object) str, "nextPageOffset");
        onGetStartedClick.write((Object) str2, "lastPageOffset");
        onGetStartedClick.write((Object) str3, "endOfListFlag");
        onGetStartedClick.write((Object) list, "txnList");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.read = list;
    }
}

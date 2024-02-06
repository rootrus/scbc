package com.scb.phone.view.fragment.prepaid.activation;

import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import p040o.Iterables;
import p040o.onGetStartedClick;
import p040o.standardStartAndWait;

public final class PrepaidActivationSuccessFragment$MediaBrowserCompat$ItemReceiver extends PurchaseSuccessFragment.PurchaseScreenshotDisplay {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrepaidActivationSuccessFragment$MediaBrowserCompat$ItemReceiver(String str, standardStartAndWait standardstartandwait, boolean z, Iterables.C352414 r12, boolean z2) {
        super(R.layout.f91942131494421, str, standardstartandwait, z, r12, z2);
        onGetStartedClick.write((Object) str, "filename");
        onGetStartedClick.write((Object) r12, "factory");
    }
}

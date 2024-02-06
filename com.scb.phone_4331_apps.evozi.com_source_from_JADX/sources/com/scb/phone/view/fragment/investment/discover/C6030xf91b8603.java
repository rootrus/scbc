package com.scb.phone.view.fragment.investment.discover;

import android.view.View;
import p040o.FragmentBuilder_BindBaseRemittanceDetailsFragment;
import p040o.UserLogout;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.fragment.investment.discover.DiscoverFundFilterFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6030xf91b8603 implements View.OnClickListener {
    private /* synthetic */ DiscoverFundFilterFragment read;

    C6030xf91b8603(DiscoverFundFilterFragment discoverFundFilterFragment) {
        this.read = discoverFundFilterFragment;
    }

    public final void onClick(View view) {
        UserLogout userLogout = this.read.presenter;
        if (userLogout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        userLogout.write = null;
        FragmentBuilder_BindBaseRemittanceDetailsFragment IconCompatParcelizer = this.read.IconCompatParcelizer;
        if (IconCompatParcelizer != null) {
            UserLogout userLogout2 = this.read.presenter;
            if (userLogout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            IconCompatParcelizer.IconCompatParcelizer(userLogout2.write);
        }
    }
}

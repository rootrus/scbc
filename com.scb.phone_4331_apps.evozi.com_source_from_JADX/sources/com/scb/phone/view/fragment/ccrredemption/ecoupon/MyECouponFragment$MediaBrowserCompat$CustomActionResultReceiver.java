package com.scb.phone.view.fragment.ccrredemption.ecoupon;

import androidx.recyclerview.widget.RecyclerView;
import p040o.onGetStartedClick;

final class MyECouponFragment$MediaBrowserCompat$CustomActionResultReceiver implements Runnable {
    private /* synthetic */ MyECouponFragment IconCompatParcelizer;

    MyECouponFragment$MediaBrowserCompat$CustomActionResultReceiver(MyECouponFragment myECouponFragment) {
        this.IconCompatParcelizer = myECouponFragment;
    }

    public final void run() {
        RecyclerView recyclerView = this.IconCompatParcelizer.rvCouponList;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvCouponList");
        }
        recyclerView.scrollBy(MyECouponFragment.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer), MyECouponFragment.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer));
    }
}

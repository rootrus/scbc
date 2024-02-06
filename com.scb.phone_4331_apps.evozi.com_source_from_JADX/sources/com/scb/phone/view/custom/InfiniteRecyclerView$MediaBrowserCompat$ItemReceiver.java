package com.scb.phone.view.custom;

import androidx.recyclerview.widget.RecyclerView;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.EkycService;
import p040o.onGetStartedClick;
import p040o.setStatusBarBackgroundColor;

final class InfiniteRecyclerView$MediaBrowserCompat$ItemReceiver<T> implements DebitCardMarketConductDeepLinkActivity<Long> {
    private /* synthetic */ InfiniteRecyclerView MediaBrowserCompat$CustomActionResultReceiver;

    InfiniteRecyclerView$MediaBrowserCompat$ItemReceiver(InfiniteRecyclerView infiniteRecyclerView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = infiniteRecyclerView;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        if (iconCompatParcelizer != null) {
            int IconCompatParcelizer = iconCompatParcelizer.IconCompatParcelizer();
            if (!this.MediaBrowserCompat$CustomActionResultReceiver.setTabContainer && IconCompatParcelizer > 1) {
                InfiniteRecyclerView infiniteRecyclerView = this.MediaBrowserCompat$CustomActionResultReceiver;
                RecyclerView recyclerView = infiniteRecyclerView;
                setStatusBarBackgroundColor IconCompatParcelizer2 = InfiniteRecyclerView.IconCompatParcelizer(infiniteRecyclerView);
                onGetStartedClick.write((Object) recyclerView, "recyclerView");
                onGetStartedClick.write((Object) IconCompatParcelizer2, "helper");
                infiniteRecyclerView.RatingCompat(EkycService.read.IconCompatParcelizer(recyclerView, IconCompatParcelizer2) + 1);
            }
        }
    }
}

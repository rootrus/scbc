package com.scb.phone.view.adapter.investment.discover;

import java.util.List;
import java.util.Map;
import p040o.dump;

public final class DiscoverFundFilterAdapter$MediaBrowserCompat$ItemReceiver implements dump {
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    private DiscoverFundFilterAdapter$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ DiscoverFundFilterAdapter$MediaBrowserCompat$ItemReceiver(List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        this.MediaBrowserCompat$CustomActionResultReceiver.add(((Map.Entry) obj).getKey());
    }
}

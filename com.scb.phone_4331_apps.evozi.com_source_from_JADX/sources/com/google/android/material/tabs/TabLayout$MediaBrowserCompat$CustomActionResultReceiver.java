package com.google.android.material.tabs;

import android.database.DataSetObserver;

class TabLayout$MediaBrowserCompat$CustomActionResultReceiver extends DataSetObserver {
    private /* synthetic */ TabLayout MediaBrowserCompat$ItemReceiver;

    TabLayout$MediaBrowserCompat$CustomActionResultReceiver(TabLayout tabLayout) {
        this.MediaBrowserCompat$ItemReceiver = tabLayout;
    }

    public final void onChanged() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }

    public final void onInvalidated() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }
}

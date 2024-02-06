package com.thunderhead;

import java.lang.ref.WeakReference;

class MiniOptimizationViewController$MediaBrowserCompat$ItemReceiver implements Runnable {
    private final boolean IconCompatParcelizer;
    private WeakReference<MiniOptimizationViewController> MediaBrowserCompat$CustomActionResultReceiver;

    MiniOptimizationViewController$MediaBrowserCompat$ItemReceiver(MiniOptimizationViewController miniOptimizationViewController, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(miniOptimizationViewController);
        this.IconCompatParcelizer = z;
    }

    public final void run() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.get().IconCompatParcelizer(true, this.IconCompatParcelizer);
            if (this.MediaBrowserCompat$CustomActionResultReceiver.get().MediaBrowserCompat$ItemReceiver != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.get().MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat();
            }
        }
    }
}

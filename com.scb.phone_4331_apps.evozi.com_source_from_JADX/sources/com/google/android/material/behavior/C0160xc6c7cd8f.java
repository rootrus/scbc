package com.google.android.material.behavior;

import android.view.View;
import p040o.SwitchCompat;

/* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$MediaBrowserCompat$CustomActionResultReceiver */
class C0160xc6c7cd8f implements Runnable {
    private final boolean MediaBrowserCompat$ItemReceiver;
    private final View read;
    private /* synthetic */ SwipeDismissBehavior write;

    C0160xc6c7cd8f(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.write = swipeDismissBehavior;
        this.read = view;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final void run() {
        if (this.write.MediaBrowserCompat$MediaItem != null && this.write.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()) {
            SwitchCompat.MediaBrowserCompat$ItemReceiver(this.read, (Runnable) this);
        } else if (this.MediaBrowserCompat$ItemReceiver && this.write.read != null) {
            this.write.read.read(this.read);
        }
    }
}

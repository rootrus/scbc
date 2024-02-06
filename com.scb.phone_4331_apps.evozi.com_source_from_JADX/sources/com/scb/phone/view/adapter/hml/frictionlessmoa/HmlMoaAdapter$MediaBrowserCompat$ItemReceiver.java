package com.scb.phone.view.adapter.hml.frictionlessmoa;

import android.view.View;

final class HmlMoaAdapter$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ HmlMoaAdapter write;

    HmlMoaAdapter$MediaBrowserCompat$ItemReceiver(HmlMoaAdapter hmlMoaAdapter, int i) {
        this.write = hmlMoaAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != this.write.MediaBrowserCompat$ItemReceiver) {
            if (this.write.MediaBrowserCompat$ItemReceiver != -1) {
                this.write.read.get(this.write.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver = false;
            }
            this.write.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.write.read.get(this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver = true;
        }
        this.write.IconCompatParcelizer.write();
        this.write.write.invoke(this.write.read.get(this.write.MediaBrowserCompat$ItemReceiver));
    }
}

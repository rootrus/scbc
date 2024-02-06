package com.scb.phone.view.adapter.transferandpay;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.HistoryAdapter;
import p040o.setFrames;

final class HistoryAdapter$ChildViewHolder$MediaBrowserCompat$ItemReceiver implements View.OnClickListener {
    private /* synthetic */ setFrames IconCompatParcelizer;
    private /* synthetic */ HistoryAdapter.ChildViewHolder write;

    HistoryAdapter$ChildViewHolder$MediaBrowserCompat$ItemReceiver(HistoryAdapter.ChildViewHolder childViewHolder, setFrames setframes) {
        this.write = childViewHolder;
        this.IconCompatParcelizer = setframes;
    }

    public final void onClick(View view) {
        this.write.PlaybackStateCompat.MediaBrowserCompat$MediaItem.invoke(this.IconCompatParcelizer);
    }
}

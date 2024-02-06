package com.scb.phone.view.activity.mwpartner;

import android.content.DialogInterface;
import android.os.Build;
import p040o.HistoryAdapter$GroupFooterViewHolder_ViewBinding;

final class MwPinShopLocationActivity$MediaSessionCompat$QueueItem implements DialogInterface.OnClickListener {
    private /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver;

    MwPinShopLocationActivity$MediaSessionCompat$QueueItem(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.MediaBrowserCompat$ItemReceiver = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding;
        if (Build.VERSION.SDK_INT >= 23 && (historyAdapter$GroupFooterViewHolder_ViewBinding = this.MediaBrowserCompat$ItemReceiver) != null) {
            historyAdapter$GroupFooterViewHolder_ViewBinding.read();
        }
    }
}

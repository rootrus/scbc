package com.scb.phone.view.adapter.search;

import android.view.View;
import p040o.FundFactSheetActivity;

/* renamed from: com.scb.phone.view.adapter.search.SequentialSearchAdapter$ItemViewHolder$MediaBrowserCompat$ItemReceiver */
final class C5783x5cd5ccdc implements View.OnClickListener {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ FundFactSheetActivity write;

    C5783x5cd5ccdc(FundFactSheetActivity fundFactSheetActivity, String str) {
        this.write = fundFactSheetActivity;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final void onClick(View view) {
        this.write.invoke(this.MediaBrowserCompat$ItemReceiver);
    }
}

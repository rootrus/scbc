package com.scb.phone.view.adapter.easycash.viewholder;

import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import java.util.List;
import p040o.FundFactSheetActivity;

/* renamed from: com.scb.phone.view.adapter.easycash.viewholder.AccountRepaymentSelectorViewHolder$MediaBrowserCompat$ItemReceiver */
final class C5747x29a3ab92 implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
    private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    C5747x29a3ab92(List list, FundFactSheetActivity fundFactSheetActivity) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.invoke(this.MediaBrowserCompat$ItemReceiver.get(i));
    }
}

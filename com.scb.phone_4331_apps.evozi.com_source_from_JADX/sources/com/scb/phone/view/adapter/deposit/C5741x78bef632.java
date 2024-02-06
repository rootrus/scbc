package com.scb.phone.view.adapter.deposit;

import android.view.View;
import p040o.access$1900;

/* renamed from: com.scb.phone.view.adapter.deposit.DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType$MediaBrowserCompat$ItemReceiver */
final class C5741x78bef632 implements View.OnClickListener {
    private /* synthetic */ access$1900 IconCompatParcelizer;
    private /* synthetic */ C5742x6445dbf5 read;

    C5741x78bef632(C5742x6445dbf5 depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver, access$1900 access_1900) {
        this.read = depositOpenAccountSelectionAdapter$MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = access_1900;
    }

    public final void onClick(View view) {
        this.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}

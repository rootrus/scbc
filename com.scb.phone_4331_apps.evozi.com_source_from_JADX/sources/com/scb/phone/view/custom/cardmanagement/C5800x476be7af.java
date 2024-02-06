package com.scb.phone.view.custom.cardmanagement;

import android.view.View;
import com.scb.phone.view.custom.cardmanagement.CustomStatementChannelViewComponent;

/* renamed from: com.scb.phone.view.custom.cardmanagement.CustomStatementChannelViewComponent$MediaBrowserCompat$ItemReceiver */
final class C5800x476be7af implements View.OnClickListener {
    private /* synthetic */ CustomStatementChannelViewComponent read;

    C5800x476be7af(CustomStatementChannelViewComponent customStatementChannelViewComponent) {
        this.read = customStatementChannelViewComponent;
    }

    public final void onClick(View view) {
        CustomStatementChannelViewComponent.IconCompatParcelizer read2 = this.read.IconCompatParcelizer;
        if (read2 != null) {
            read2.MediaBrowserCompat$CustomActionResultReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}

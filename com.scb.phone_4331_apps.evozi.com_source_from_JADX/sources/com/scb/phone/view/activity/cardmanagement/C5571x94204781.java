package com.scb.phone.view.activity.cardmanagement;

import android.content.DialogInterface;
import p040o.IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: com.scb.phone.view.activity.cardmanagement.TermAndConditionStatementChannelActivity$MediaBrowserCompat$SearchResultReceiver */
final class C5571x94204781 implements DialogInterface.OnClickListener {
    private /* synthetic */ IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver write;

    C5571x94204781(IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.write.MediaBrowserCompat$ItemReceiver();
    }
}

package com.scb.phone.view.fragment.ntb.touchpoint;

import android.content.DialogInterface;
import p040o.C4252dJ;
import p040o.dJ$MediaBrowserCompat$MediaItem;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.fragment.ntb.touchpoint.TouchPointWifiSettingsFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6113x4afbfe07 implements DialogInterface.OnClickListener {
    private /* synthetic */ TouchPointWifiSettingsFragment MediaBrowserCompat$CustomActionResultReceiver;

    C6113x4afbfe07(TouchPointWifiSettingsFragment touchPointWifiSettingsFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = touchPointWifiSettingsFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        C4252dJ dJVar = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
        if (dJVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = dJ$MediaBrowserCompat$MediaItem.write;
        if (dJVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(dJVar.RatingCompat);
        }
    }
}

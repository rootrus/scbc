package com.scb.phone.view.activity.profile_management.manageaccountinbound;

import android.content.DialogInterface;
import p040o.getCountryShortFieldName;
import p040o.getUiOrientation;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.profile_management.manageaccountinbound.ManageAccountInboundActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5706x6186c42d implements DialogInterface.OnClickListener {
    private /* synthetic */ getUiOrientation MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ ManageAccountInboundActivity read;

    C5706x6186c42d(ManageAccountInboundActivity manageAccountInboundActivity, getUiOrientation getuiorientation) {
        this.read = manageAccountInboundActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = getuiorientation;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getCountryShortFieldName getcountryshortfieldname = this.read.presenter;
        if (getcountryshortfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getUiOrientation getuiorientation = this.MediaBrowserCompat$CustomActionResultReceiver;
        getuiorientation.MediaBrowserCompat$ItemReceiver = true;
        getcountryshortfieldname.MediaBrowserCompat$CustomActionResultReceiver(getuiorientation);
        dialogInterface.dismiss();
    }
}

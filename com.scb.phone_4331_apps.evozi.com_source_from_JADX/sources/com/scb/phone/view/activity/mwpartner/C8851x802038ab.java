package com.scb.phone.view.activity.mwpartner;

import android.content.DialogInterface;
import p040o.C4093bd;
import p040o.CharMatcher;
import p040o.bd$MediaBrowserCompat$ItemReceiver;
import p040o.newLatLngZoom;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C8851x802038ab implements DialogInterface.OnClickListener {
    private /* synthetic */ MwPinShopLocationActivity read;

    C8851x802038ab(MwPinShopLocationActivity mwPinShopLocationActivity) {
        this.read = mwPinShopLocationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4093bd bdVar = this.read.presenter;
        if (bdVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boolean z = false;
        bdVar.MediaBrowserCompat$ItemReceiver = new newLatLngZoom((byte) 0);
        if (bdVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            bdVar.RatingCompat.AlertController$RecycleListView();
        }
        CharMatcher.And and = bdVar.IconCompatParcelizer;
        newLatLngZoom newlatlngzoom = bdVar.MediaBrowserCompat$ItemReceiver;
        if (newlatlngzoom == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mwLocation");
        }
        and.read(and.MediaBrowserCompat$CustomActionResultReceiver(newlatlngzoom), new C4093bd.IconCompatParcelizer(bdVar), new bd$MediaBrowserCompat$ItemReceiver(bdVar));
    }
}

package com.scb.phone.view.activity.additionaldocument;

import android.content.Context;
import p040o.BillerDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;
import p040o.zzvb;

final class CropDocumentActivity$MediaBrowserCompat$SearchResultReceiver<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
    private /* synthetic */ CropDocumentActivity MediaBrowserCompat$ItemReceiver;

    CropDocumentActivity$MediaBrowserCompat$SearchResultReceiver(CropDocumentActivity cropDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = cropDocumentActivity;
    }

    public final /* synthetic */ Object write(Object obj) {
        zzvb zzvb = (zzvb) obj;
        onGetStartedClick.write((Object) zzvb, "processedImage");
        return FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver((Context) this.MediaBrowserCompat$ItemReceiver, zzvb.read);
    }
}

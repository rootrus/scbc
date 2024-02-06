package com.scb.phone.view.activity.additionaldocument;

import android.content.Context;
import p040o.BillerDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;
import p040o.zzvb;

/* renamed from: com.scb.phone.view.activity.additionaldocument.CropDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C8702xba928327<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
    private /* synthetic */ CropDocumentActivity IconCompatParcelizer;
    private /* synthetic */ String write;

    C8702xba928327(CropDocumentActivity cropDocumentActivity, String str) {
        this.IconCompatParcelizer = cropDocumentActivity;
        this.write = str;
    }

    public final /* synthetic */ Object write(Object obj) {
        zzvb zzvb = (zzvb) obj;
        onGetStartedClick.write((Object) zzvb, "processedImage");
        return FragmentBuilder_BindDepositSelectorFragment.read((Context) this.IconCompatParcelizer, zzvb.read, this.write);
    }
}

package com.scb.phone.view.activity.additionaldocument;

import android.content.Context;
import android.graphics.Bitmap;
import p040o.BillerDeepLinkActivity;
import p040o.DirectDebitDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.onGetStartedClick;

/* renamed from: com.scb.phone.view.activity.additionaldocument.ReviewDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C8706xae0289ef<T, R> implements DirectDebitDeepLinkActivity<T, BillerDeepLinkActivity<? extends R>> {
    private /* synthetic */ ReviewDocumentActivity MediaBrowserCompat$ItemReceiver;

    C8706xae0289ef(ReviewDocumentActivity reviewDocumentActivity) {
        this.MediaBrowserCompat$ItemReceiver = reviewDocumentActivity;
    }

    public final /* synthetic */ Object write(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        onGetStartedClick.write((Object) bitmap, "bitmap");
        return FragmentBuilder_BindDepositSelectorFragment.read((Context) this.MediaBrowserCompat$ItemReceiver, bitmap);
    }
}

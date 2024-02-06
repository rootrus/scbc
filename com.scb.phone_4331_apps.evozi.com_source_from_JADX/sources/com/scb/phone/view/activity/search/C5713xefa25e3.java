package com.scb.phone.view.activity.search;

import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;
import p040o.getAllowReturnTransitionOverlap;
import p040o.zzvo;

/* renamed from: com.scb.phone.view.activity.search.SequentialSearchActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5713xefa25e3 implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ EasycashCommonReviewFragment.IconCompatParcelizer read;

    private C5713xefa25e3() {
    }

    public /* synthetic */ C5713xefa25e3(EasycashCommonReviewFragment.IconCompatParcelizer iconCompatParcelizer, String str) {
        this.read = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final boolean write(Object obj) {
        return EasycashCommonReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(((zzvo) obj).MediaDescriptionCompat, this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

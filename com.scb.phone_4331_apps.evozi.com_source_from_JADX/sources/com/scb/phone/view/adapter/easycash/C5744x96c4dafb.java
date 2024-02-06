package com.scb.phone.view.adapter.easycash;

import com.scb.phone.view.fragment.hml.businessowner.HmlNtbBusinessOccupationInfoFragment;
import java.util.concurrent.Callable;

/* renamed from: com.scb.phone.view.adapter.easycash.EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder$MediaBrowserCompat$ItemReceiver */
public final class C5744x96c4dafb implements Callable {
    private final /* synthetic */ HmlNtbBusinessOccupationInfoFragment.write IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    private C5744x96c4dafb() {
    }

    public /* synthetic */ C5744x96c4dafb(HmlNtbBusinessOccupationInfoFragment.write write2, String str, int i, int i2) {
        this.IconCompatParcelizer = write2;
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }

    public final Object call() {
        return this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}

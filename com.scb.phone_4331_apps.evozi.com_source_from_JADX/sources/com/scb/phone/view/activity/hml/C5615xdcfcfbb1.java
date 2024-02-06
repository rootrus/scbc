package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import p040o.FragmentBuilder_BindDealsBuyReviewFragment;
import p040o.zzwd;

/* renamed from: com.scb.phone.view.activity.hml.HmlNTBDocumentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5615xdcfcfbb1 {
    private C5615xdcfcfbb1() {
    }

    public /* synthetic */ C5615xdcfcfbb1(byte b) {
        this();
    }

    public static Intent IconCompatParcelizer(Context context, boolean z, String str, zzwd zzwd) {
        Intent intent = new Intent(context, HmlNTBDocumentInstructionsActivity.class);
        intent.putExtra("SHOW_NEXT_BUTTON_KEY", z);
        intent.putExtra("UPLOAD_METHOD", zzwd);
        FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer iconCompatParcelizer = FragmentBuilder_BindDealsBuyReviewFragment.Companion;
        intent.putExtra(FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(), str);
        return intent;
    }
}

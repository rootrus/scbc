package com.scb.phone.view.activity.additionaldocument;

import android.content.Context;
import android.content.Intent;
import p040o.FragmentBuilder_BindDealsBuyReviewFragment;
import p040o.zzwd;

/* renamed from: com.scb.phone.view.activity.additionaldocument.DocumentInstructionsActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5560x96251bfc {
    private C5560x96251bfc() {
    }

    public /* synthetic */ C5560x96251bfc(byte b) {
        this();
    }

    public static Intent write(Context context, boolean z, String str, zzwd zzwd) {
        Intent intent = new Intent(context, DocumentInstructionsActivity.class);
        intent.putExtra("SHOW_NEXT_BUTTON_KEY", z);
        intent.putExtra("UPLOAD_METHOD", zzwd);
        FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer iconCompatParcelizer = FragmentBuilder_BindDealsBuyReviewFragment.Companion;
        intent.putExtra(FragmentBuilder_BindDealsBuyReviewFragment.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(), str);
        return intent;
    }
}

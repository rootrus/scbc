package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.view.activity.findus.FindUsActivity;

/* renamed from: com.scb.phone.view.fragment.hml.HmlNoDepositAccountFragment$MediaBrowserCompat$CustomActionResultReceiver */
final class C6004x979a6f94 implements View.OnClickListener {
    private /* synthetic */ HmlNoDepositAccountFragment write;

    C6004x979a6f94(HmlNoDepositAccountFragment hmlNoDepositAccountFragment) {
        this.write = hmlNoDepositAccountFragment;
    }

    public final void onClick(View view) {
        FindUsActivity.MediaBrowserCompat$CustomActionResultReceiver(this.write.getContext(), false);
    }
}

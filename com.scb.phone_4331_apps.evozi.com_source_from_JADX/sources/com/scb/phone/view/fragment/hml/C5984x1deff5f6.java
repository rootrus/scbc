package com.scb.phone.view.fragment.hml;

import android.content.DialogInterface;

/* renamed from: com.scb.phone.view.fragment.hml.HmlDocumentListFragment$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
final class C5984x1deff5f6 implements DialogInterface.OnClickListener {
    private /* synthetic */ HmlDocumentListFragment write;

    C5984x1deff5f6(HmlDocumentListFragment hmlDocumentListFragment) {
        this.write = hmlDocumentListFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        HmlDocumentListFragment.read(this.write);
    }
}

package com.scb.phone.view.fragment.dji;

import android.view.View;
import p040o.KtaIdExtractor_Factory;

/* renamed from: com.scb.phone.view.fragment.dji.DeejungInstallmentTransactionFragment$MediaBrowserCompat$ItemReceiver */
final class C5913xd7e52b79 implements View.OnClickListener {
    private /* synthetic */ DeejungInstallmentTransactionFragment IconCompatParcelizer;

    C5913xd7e52b79(DeejungInstallmentTransactionFragment deejungInstallmentTransactionFragment) {
        this.IconCompatParcelizer = deejungInstallmentTransactionFragment;
    }

    public final void onClick(View view) {
        KtaIdExtractor_Factory write = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (write != null) {
            write.MediaBrowserCompat$ItemReceiver();
        }
    }
}

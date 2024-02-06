package com.scb.phone.view.fragment.deposit;

import android.view.View;
import com.pdfview.PDFView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DepositMarketConductFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DepositMarketConductFragment MediaBrowserCompat$ItemReceiver;

    public DepositMarketConductFragment_ViewBinding(DepositMarketConductFragment depositMarketConductFragment, View view) {
        super(depositMarketConductFragment, view);
        this.MediaBrowserCompat$ItemReceiver = depositMarketConductFragment;
        depositMarketConductFragment.pdfView = (PDFView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pdf_container, "field 'pdfView'", PDFView.class);
    }

    public final void read() {
        DepositMarketConductFragment depositMarketConductFragment = this.MediaBrowserCompat$ItemReceiver;
        if (depositMarketConductFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            depositMarketConductFragment.pdfView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

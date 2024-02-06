package com.scb.phone.view.fragment.debitcard;

import android.view.View;
import android.widget.FrameLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DebitCardSaleSheetFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DebitCardSaleSheetFragment IconCompatParcelizer;

    public DebitCardSaleSheetFragment_ViewBinding(DebitCardSaleSheetFragment debitCardSaleSheetFragment, View view) {
        super(debitCardSaleSheetFragment, view);
        this.IconCompatParcelizer = debitCardSaleSheetFragment;
        debitCardSaleSheetFragment.pdfView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pdf_container, "field 'pdfView'", FrameLayout.class);
    }

    public final void read() {
        DebitCardSaleSheetFragment debitCardSaleSheetFragment = this.IconCompatParcelizer;
        if (debitCardSaleSheetFragment != null) {
            this.IconCompatParcelizer = null;
            debitCardSaleSheetFragment.pdfView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

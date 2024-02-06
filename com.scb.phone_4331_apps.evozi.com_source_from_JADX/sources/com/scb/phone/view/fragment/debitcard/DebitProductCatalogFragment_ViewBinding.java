package com.scb.phone.view.fragment.debitcard;

import android.view.View;
import android.widget.FrameLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class DebitProductCatalogFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private DebitProductCatalogFragment write;

    public DebitProductCatalogFragment_ViewBinding(final DebitProductCatalogFragment debitProductCatalogFragment, View view) {
        super(debitProductCatalogFragment, view);
        this.write = debitProductCatalogFragment;
        debitProductCatalogFragment.pdfView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pdf_container, "field 'pdfView'", FrameLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'nextButton'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                DebitProductCatalogFragment.this.nextButton(view);
            }
        });
    }

    public final void read() {
        DebitProductCatalogFragment debitProductCatalogFragment = this.write;
        if (debitProductCatalogFragment != null) {
            this.write = null;
            debitProductCatalogFragment.pdfView = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

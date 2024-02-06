package com.scb.phone.view.fragment.investment;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PdfViewerFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PdfViewerFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public PdfViewerFragment_ViewBinding(final PdfViewerFragment pdfViewerFragment, View view) {
        super(pdfViewerFragment, view);
        this.MediaBrowserCompat$ItemReceiver = pdfViewerFragment;
        pdfViewerFragment.pdfView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pdf_container, "field 'pdfView'", FrameLayout.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_next, "field 'buttonNext' and method 'onNextButtonClick'");
        pdfViewerFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer, R.id.bt_next, "field 'buttonNext'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PdfViewerFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        PdfViewerFragment pdfViewerFragment = this.MediaBrowserCompat$ItemReceiver;
        if (pdfViewerFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            pdfViewerFragment.pdfView = null;
            pdfViewerFragment.buttonNext = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

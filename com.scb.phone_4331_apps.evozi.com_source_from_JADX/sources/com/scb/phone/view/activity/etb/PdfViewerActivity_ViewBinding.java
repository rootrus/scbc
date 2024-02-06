package com.scb.phone.view.activity.etb;

import android.view.View;
import android.webkit.WebView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class PdfViewerActivity_ViewBinding extends BaseActivity_ViewBinding {
    private PdfViewerActivity MediaBrowserCompat$ItemReceiver;

    public PdfViewerActivity_ViewBinding(PdfViewerActivity pdfViewerActivity, View view) {
        super(pdfViewerActivity, view);
        this.MediaBrowserCompat$ItemReceiver = pdfViewerActivity;
        pdfViewerActivity.webView = (WebView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pdf_container, "field 'webView'", WebView.class);
    }

    public final void read() {
        PdfViewerActivity pdfViewerActivity = this.MediaBrowserCompat$ItemReceiver;
        if (pdfViewerActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            pdfViewerActivity.webView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

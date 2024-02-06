package com.scb.phone.view.fragment.chequemanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onStart;

public class ChequeScreenshotFragment_ViewBinding extends BaseChequeReviewFragment_ViewBinding {
    private ChequeScreenshotFragment MediaBrowserCompat$CustomActionResultReceiver;

    public ChequeScreenshotFragment_ViewBinding(ChequeScreenshotFragment chequeScreenshotFragment, View view) {
        super(chequeScreenshotFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = chequeScreenshotFragment;
        chequeScreenshotFragment.titleSuccessTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_success_title, "field 'titleSuccessTextView'", TextView.class);
        chequeScreenshotFragment.refIdTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_reference_id, "field 'refIdTextView'", TextView.class);
        chequeScreenshotFragment.dateTimeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'dateTimeTextView'", TextView.class);
    }

    public final void read() {
        ChequeScreenshotFragment chequeScreenshotFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (chequeScreenshotFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            chequeScreenshotFragment.titleSuccessTextView = null;
            chequeScreenshotFragment.refIdTextView = null;
            chequeScreenshotFragment.dateTimeTextView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

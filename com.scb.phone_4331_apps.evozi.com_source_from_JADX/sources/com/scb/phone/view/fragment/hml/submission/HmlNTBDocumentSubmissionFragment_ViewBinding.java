package com.scb.phone.view.fragment.hml.submission;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public final class HmlNTBDocumentSubmissionFragment_ViewBinding extends HmlDocumentSubmissionFragment_ViewBinding {
    private HmlNTBDocumentSubmissionFragment MediaBrowserCompat$ItemReceiver;

    public HmlNTBDocumentSubmissionFragment_ViewBinding(HmlNTBDocumentSubmissionFragment hmlNTBDocumentSubmissionFragment, View view) {
        super(hmlNTBDocumentSubmissionFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlNTBDocumentSubmissionFragment;
        hmlNTBDocumentSubmissionFragment.breadcrumbsNtb = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.breadcrumbs_ntb, "field 'breadcrumbsNtb'", ProgressStateBar.class);
    }

    public final void read() {
        HmlNTBDocumentSubmissionFragment hmlNTBDocumentSubmissionFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlNTBDocumentSubmissionFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlNTBDocumentSubmissionFragment.breadcrumbsNtb = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

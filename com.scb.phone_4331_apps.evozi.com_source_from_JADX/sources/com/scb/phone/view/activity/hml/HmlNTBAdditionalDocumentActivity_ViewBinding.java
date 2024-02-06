package com.scb.phone.view.activity.hml;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.ProgressStateBar;
import p040o.onStart;

public final class HmlNTBAdditionalDocumentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private HmlNTBAdditionalDocumentActivity write;

    public HmlNTBAdditionalDocumentActivity_ViewBinding(HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity, View view) {
        super(hmlNTBAdditionalDocumentActivity, view);
        this.write = hmlNTBAdditionalDocumentActivity;
        hmlNTBAdditionalDocumentActivity.breadcrumbsNtb = (ProgressStateBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.breadcrumbs_ntb, "field 'breadcrumbsNtb'", ProgressStateBar.class);
    }

    public final void read() {
        HmlNTBAdditionalDocumentActivity hmlNTBAdditionalDocumentActivity = this.write;
        if (hmlNTBAdditionalDocumentActivity != null) {
            this.write = null;
            hmlNTBAdditionalDocumentActivity.breadcrumbsNtb = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

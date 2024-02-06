package com.scb.phone.view.custom.additionaldocument;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public final class DocumentUploadedCustomView_ViewBinding implements Unbinder {
    private DocumentUploadedCustomView write;

    public DocumentUploadedCustomView_ViewBinding(DocumentUploadedCustomView documentUploadedCustomView, View view) {
        this.write = documentUploadedCustomView;
        documentUploadedCustomView.deleteIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_delete_button, "field 'deleteIcon'", ImageView.class);
        documentUploadedCustomView.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_document_name, "field 'name'", TextView.class);
    }

    public final void read() {
        DocumentUploadedCustomView documentUploadedCustomView = this.write;
        if (documentUploadedCustomView != null) {
            this.write = null;
            documentUploadedCustomView.deleteIcon = null;
            documentUploadedCustomView.name = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.custom.additionaldocument;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import p040o.onStart;

public final class DocumentInstructionsDetailCustomView_ViewBinding implements Unbinder {
    private DocumentInstructionsDetailCustomView MediaBrowserCompat$CustomActionResultReceiver;

    public DocumentInstructionsDetailCustomView_ViewBinding(DocumentInstructionsDetailCustomView documentInstructionsDetailCustomView, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = documentInstructionsDetailCustomView;
        documentInstructionsDetailCustomView.iconTop = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon, "field 'iconTop'", ImageView.class);
        documentInstructionsDetailCustomView.iconBottom = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.icon2, "field 'iconBottom'", ImageView.class);
        documentInstructionsDetailCustomView.detailText = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.detail, "field 'detailText'", ThaiTextView.class);
    }

    public final void read() {
        DocumentInstructionsDetailCustomView documentInstructionsDetailCustomView = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (documentInstructionsDetailCustomView != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            documentInstructionsDetailCustomView.iconTop = null;
            documentInstructionsDetailCustomView.iconBottom = null;
            documentInstructionsDetailCustomView.detailText = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

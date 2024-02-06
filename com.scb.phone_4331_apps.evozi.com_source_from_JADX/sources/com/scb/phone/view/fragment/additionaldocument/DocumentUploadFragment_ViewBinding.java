package com.scb.phone.view.fragment.additionaldocument;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class DocumentUploadFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DocumentUploadFragment MediaBrowserCompat$ItemReceiver;

    public DocumentUploadFragment_ViewBinding(DocumentUploadFragment documentUploadFragment, View view) {
        super(documentUploadFragment, view);
        this.MediaBrowserCompat$ItemReceiver = documentUploadFragment;
        documentUploadFragment.headerText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title, "field 'headerText'", TextView.class);
        documentUploadFragment.sectionList = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_list, "field 'sectionList'", LinearLayout.class);
        documentUploadFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_button, "field 'nextButton'", Button.class);
    }

    public final void read() {
        DocumentUploadFragment documentUploadFragment = this.MediaBrowserCompat$ItemReceiver;
        if (documentUploadFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            documentUploadFragment.headerText = null;
            documentUploadFragment.sectionList = null;
            documentUploadFragment.nextButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

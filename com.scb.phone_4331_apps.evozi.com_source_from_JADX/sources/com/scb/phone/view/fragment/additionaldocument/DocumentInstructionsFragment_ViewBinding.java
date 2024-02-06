package com.scb.phone.view.fragment.additionaldocument;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class DocumentInstructionsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private DocumentInstructionsFragment write;

    public DocumentInstructionsFragment_ViewBinding(DocumentInstructionsFragment documentInstructionsFragment, View view) {
        super(documentInstructionsFragment, view);
        this.write = documentInstructionsFragment;
        documentInstructionsFragment.detailsList = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.details_list, "field 'detailsList'", LinearLayout.class);
        documentInstructionsFragment.thumbnail = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.thumbnail, "field 'thumbnail'", ImageView.class);
        documentInstructionsFragment.headerText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text, "field 'headerText'", TextView.class);
        documentInstructionsFragment.descriptionText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text, "field 'descriptionText'", TextView.class);
        documentInstructionsFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_button, "field 'nextButton'", Button.class);
        documentInstructionsFragment.listTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.details_title_list_text, "field 'listTitle'", TextView.class);
    }

    public final void read() {
        DocumentInstructionsFragment documentInstructionsFragment = this.write;
        if (documentInstructionsFragment != null) {
            this.write = null;
            documentInstructionsFragment.detailsList = null;
            documentInstructionsFragment.thumbnail = null;
            documentInstructionsFragment.headerText = null;
            documentInstructionsFragment.descriptionText = null;
            documentInstructionsFragment.nextButton = null;
            documentInstructionsFragment.listTitle = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

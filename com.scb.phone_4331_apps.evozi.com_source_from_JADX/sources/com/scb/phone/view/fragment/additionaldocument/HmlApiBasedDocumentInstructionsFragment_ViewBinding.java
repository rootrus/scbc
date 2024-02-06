package com.scb.phone.view.fragment.additionaldocument;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class HmlApiBasedDocumentInstructionsFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlApiBasedDocumentInstructionsFragment MediaBrowserCompat$ItemReceiver;

    public HmlApiBasedDocumentInstructionsFragment_ViewBinding(HmlApiBasedDocumentInstructionsFragment hmlApiBasedDocumentInstructionsFragment, View view) {
        super(hmlApiBasedDocumentInstructionsFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlApiBasedDocumentInstructionsFragment;
        hmlApiBasedDocumentInstructionsFragment.detailsList = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.details_list, "field 'detailsList'", LinearLayout.class);
        hmlApiBasedDocumentInstructionsFragment.thumbnail = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.thumbnail, "field 'thumbnail'", ImageView.class);
        hmlApiBasedDocumentInstructionsFragment.headerText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text, "field 'headerText'", TextView.class);
        hmlApiBasedDocumentInstructionsFragment.descriptionText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text, "field 'descriptionText'", TextView.class);
        hmlApiBasedDocumentInstructionsFragment.nextButton = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.next_button, "field 'nextButton'", Button.class);
    }

    public final void read() {
        HmlApiBasedDocumentInstructionsFragment hmlApiBasedDocumentInstructionsFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlApiBasedDocumentInstructionsFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlApiBasedDocumentInstructionsFragment.detailsList = null;
            hmlApiBasedDocumentInstructionsFragment.thumbnail = null;
            hmlApiBasedDocumentInstructionsFragment.headerText = null;
            hmlApiBasedDocumentInstructionsFragment.descriptionText = null;
            hmlApiBasedDocumentInstructionsFragment.nextButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

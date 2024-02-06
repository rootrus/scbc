package com.scb.phone.view.fragment.hml.submission;

import android.view.View;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlDocumentReviewTutorialFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlDocumentReviewTutorialFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public HmlDocumentReviewTutorialFragment_ViewBinding(final HmlDocumentReviewTutorialFragment hmlDocumentReviewTutorialFragment, View view) {
        super(hmlDocumentReviewTutorialFragment, view);
        this.IconCompatParcelizer = hmlDocumentReviewTutorialFragment;
        hmlDocumentReviewTutorialFragment.documentDoImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_document_do, "field 'documentDoImage'", ImageView.class);
        hmlDocumentReviewTutorialFragment.documentDontImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_document_dont, "field 'documentDontImage'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onNextButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlDocumentReviewTutorialFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        HmlDocumentReviewTutorialFragment hmlDocumentReviewTutorialFragment = this.IconCompatParcelizer;
        if (hmlDocumentReviewTutorialFragment != null) {
            this.IconCompatParcelizer = null;
            hmlDocumentReviewTutorialFragment.documentDoImage = null;
            hmlDocumentReviewTutorialFragment.documentDontImage = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

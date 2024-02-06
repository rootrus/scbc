package com.scb.phone.view.fragment.hml.submission;

import android.view.View;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlDocumentCropTutorialFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlDocumentCropTutorialFragment write;

    public HmlDocumentCropTutorialFragment_ViewBinding(final HmlDocumentCropTutorialFragment hmlDocumentCropTutorialFragment, View view) {
        super(hmlDocumentCropTutorialFragment, view);
        this.write = hmlDocumentCropTutorialFragment;
        hmlDocumentCropTutorialFragment.documentDoImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_document_do, "field 'documentDoImage'", ImageView.class);
        hmlDocumentCropTutorialFragment.documentDontImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_document_dont, "field 'documentDontImage'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onNextButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlDocumentCropTutorialFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        HmlDocumentCropTutorialFragment hmlDocumentCropTutorialFragment = this.write;
        if (hmlDocumentCropTutorialFragment != null) {
            this.write = null;
            hmlDocumentCropTutorialFragment.documentDoImage = null;
            hmlDocumentCropTutorialFragment.documentDontImage = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.fragment.hml.submission;

import android.view.View;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.custom.hml.CustomTutorialImageAndText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlDocumentKofaxTutorialFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlDocumentKofaxTutorialFragment MediaBrowserCompat$ItemReceiver;

    public HmlDocumentKofaxTutorialFragment_ViewBinding(final HmlDocumentKofaxTutorialFragment hmlDocumentKofaxTutorialFragment, View view) {
        super(hmlDocumentKofaxTutorialFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentKofaxTutorialFragment;
        hmlDocumentKofaxTutorialFragment.dontImage1 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_1, "field 'dontImage1'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage2 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_2, "field 'dontImage2'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage3 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_3, "field 'dontImage3'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage4 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_4, "field 'dontImage4'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage5 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_5, "field 'dontImage5'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage6 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_6, "field 'dontImage6'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage7 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_7, "field 'dontImage7'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage8 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_8, "field 'dontImage8'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage9 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_9, "field 'dontImage9'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.dontImage10 = (CustomTutorialImageAndText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_dont_image_10, "field 'dontImage10'", CustomTutorialImageAndText.class);
        hmlDocumentKofaxTutorialFragment.documentDoImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_document_do, "field 'documentDoImage'", ImageView.class);
        hmlDocumentKofaxTutorialFragment.perfectExampleImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_perfect_example, "field 'perfectExampleImage'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onNextButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlDocumentKofaxTutorialFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        HmlDocumentKofaxTutorialFragment hmlDocumentKofaxTutorialFragment = this.MediaBrowserCompat$ItemReceiver;
        if (hmlDocumentKofaxTutorialFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            hmlDocumentKofaxTutorialFragment.dontImage1 = null;
            hmlDocumentKofaxTutorialFragment.dontImage2 = null;
            hmlDocumentKofaxTutorialFragment.dontImage3 = null;
            hmlDocumentKofaxTutorialFragment.dontImage4 = null;
            hmlDocumentKofaxTutorialFragment.dontImage5 = null;
            hmlDocumentKofaxTutorialFragment.dontImage6 = null;
            hmlDocumentKofaxTutorialFragment.dontImage7 = null;
            hmlDocumentKofaxTutorialFragment.dontImage8 = null;
            hmlDocumentKofaxTutorialFragment.dontImage9 = null;
            hmlDocumentKofaxTutorialFragment.dontImage10 = null;
            hmlDocumentKofaxTutorialFragment.documentDoImage = null;
            hmlDocumentKofaxTutorialFragment.perfectExampleImage = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

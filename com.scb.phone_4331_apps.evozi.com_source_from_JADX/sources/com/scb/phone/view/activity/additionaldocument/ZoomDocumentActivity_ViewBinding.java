package com.scb.phone.view.activity.additionaldocument;

import android.view.View;
import com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ZoomDocumentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ZoomDocumentActivity write;

    public ZoomDocumentActivity_ViewBinding(final ZoomDocumentActivity zoomDocumentActivity, View view) {
        super(zoomDocumentActivity, view);
        this.write = zoomDocumentActivity;
        zoomDocumentActivity.imageReview = (ImgReviewEditCntrl) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_review, "field 'imageReview'", ImgReviewEditCntrl.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.tv_done, "method 'onDoneClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ZoomDocumentActivity.this.onDoneClicked();
            }
        });
    }

    public final void read() {
        ZoomDocumentActivity zoomDocumentActivity = this.write;
        if (zoomDocumentActivity != null) {
            this.write = null;
            zoomDocumentActivity.imageReview = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

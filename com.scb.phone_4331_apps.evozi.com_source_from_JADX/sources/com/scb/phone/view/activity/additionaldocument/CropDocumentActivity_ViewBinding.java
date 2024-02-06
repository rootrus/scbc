package com.scb.phone.view.activity.additionaldocument;

import android.view.View;
import android.widget.TextView;
import com.kofax.kmc.kui.uicontrols.ImgReviewEditCntrl;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CropDocumentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private CropDocumentActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public CropDocumentActivity_ViewBinding(final CropDocumentActivity cropDocumentActivity, View view) {
        super(cropDocumentActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = cropDocumentActivity;
        cropDocumentActivity.imageReview = (ImgReviewEditCntrl) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_review, "field 'imageReview'", ImgReviewEditCntrl.class);
        cropDocumentActivity.rootView = onStart.IconCompatParcelizer(view, R.id.root, "field 'rootView'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_see_instructions, "field 'seeInstructionsButton' and method 'onSeeInstructionsClicked'");
        cropDocumentActivity.seeInstructionsButton = (TextView) onStart.write(IconCompatParcelizer2, R.id.tv_see_instructions, "field 'seeInstructionsButton'", TextView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CropDocumentActivity.this.onSeeInstructionsClicked();
            }
        });
        cropDocumentActivity.instructionsInfoText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_instructions, "field 'instructionsInfoText'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_retake, "field 'retakeButton' and method 'onRetakeClicked'");
        cropDocumentActivity.retakeButton = (TextView) onStart.write(IconCompatParcelizer3, R.id.tv_retake, "field 'retakeButton'", TextView.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CropDocumentActivity.this.onRetakeClicked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_crop, "method 'onDoneClicked'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CropDocumentActivity.this.onDoneClicked();
            }
        });
    }

    public final void read() {
        CropDocumentActivity cropDocumentActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (cropDocumentActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            cropDocumentActivity.imageReview = null;
            cropDocumentActivity.rootView = null;
            cropDocumentActivity.seeInstructionsButton = null;
            cropDocumentActivity.instructionsInfoText = null;
            cropDocumentActivity.retakeButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

package com.scb.phone.view.activity.additionaldocument;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kofax.kmc.kui.uicontrols.ImageCaptureView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CaptureDocumentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CaptureDocumentActivity MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaDescriptionCompat;
    private View write;

    public CaptureDocumentActivity_ViewBinding(final CaptureDocumentActivity captureDocumentActivity, View view) {
        super(captureDocumentActivity, view);
        this.MediaBrowserCompat$ItemReceiver = captureDocumentActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_capture_button, "field 'captureButton' and method 'onCaptureClicked'");
        captureDocumentActivity.captureButton = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_capture_button, "field 'captureButton'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CaptureDocumentActivity.this.onCaptureClicked();
            }
        });
        captureDocumentActivity.imageCaptureView = (ImageCaptureView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cv_capture_view, "field 'imageCaptureView'", ImageCaptureView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_see_instructions, "field 'seeInstructionsText' and method 'onSeeInstructionsClicked'");
        captureDocumentActivity.seeInstructionsText = (TextView) onStart.write(IconCompatParcelizer3, R.id.tv_see_instructions, "field 'seeInstructionsText'", TextView.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CaptureDocumentActivity.this.onSeeInstructionsClicked();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.iv_coachmark, "field 'coachmarkImage' and method 'onCoachMarkClicked'");
        captureDocumentActivity.coachmarkImage = (ImageView) onStart.write(IconCompatParcelizer4, R.id.iv_coachmark, "field 'coachmarkImage'", ImageView.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CaptureDocumentActivity.this.onCoachMarkClicked();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.iv_flashlight, "method 'onFlashLightClicked'");
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CaptureDocumentActivity.this.onFlashLightClicked();
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view, R.id.tv_back, "method 'onBackClicked'");
        this.MediaDescriptionCompat = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CaptureDocumentActivity.this.onBackClicked();
            }
        });
    }

    public final void read() {
        CaptureDocumentActivity captureDocumentActivity = this.MediaBrowserCompat$ItemReceiver;
        if (captureDocumentActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            captureDocumentActivity.captureButton = null;
            captureDocumentActivity.imageCaptureView = null;
            captureDocumentActivity.seeInstructionsText = null;
            captureDocumentActivity.coachmarkImage = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

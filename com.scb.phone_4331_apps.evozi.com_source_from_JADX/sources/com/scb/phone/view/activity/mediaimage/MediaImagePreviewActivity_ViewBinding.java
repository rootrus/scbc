package com.scb.phone.view.activity.mediaimage;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.util.plugins.camera.view.CropOverlayView;
import com.scb.phone.view.util.plugins.camera.view.ScaleImageView;
import p040o.onCreateDialog;
import p040o.onStart;

public class MediaImagePreviewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MediaImagePreviewActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public MediaImagePreviewActivity_ViewBinding(final MediaImagePreviewActivity mediaImagePreviewActivity, View view) {
        super(mediaImagePreviewActivity, view);
        this.IconCompatParcelizer = mediaImagePreviewActivity;
        mediaImagePreviewActivity.scaleImageView = (ScaleImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.profile_image, "field 'scaleImageView'", ScaleImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.profile_image_choose, "field 'choosePicture' and method 'uploadCroppedImage'");
        mediaImagePreviewActivity.choosePicture = (TextView) onStart.write(IconCompatParcelizer2, R.id.profile_image_choose, "field 'choosePicture'", TextView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MediaImagePreviewActivity.this.uploadCroppedImage();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.profile_image_cancel, "field 'cancelPicture' and method 'closeActivity'");
        mediaImagePreviewActivity.cancelPicture = (TextView) onStart.write(IconCompatParcelizer3, R.id.profile_image_cancel, "field 'cancelPicture'", TextView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MediaImagePreviewActivity.this.closeActivity();
            }
        });
        mediaImagePreviewActivity.cropOverlayView = (CropOverlayView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.profile_crop_overlay, "field 'cropOverlayView'", CropOverlayView.class);
    }

    public final void read() {
        MediaImagePreviewActivity mediaImagePreviewActivity = this.IconCompatParcelizer;
        if (mediaImagePreviewActivity != null) {
            this.IconCompatParcelizer = null;
            mediaImagePreviewActivity.scaleImageView = null;
            mediaImagePreviewActivity.choosePicture = null;
            mediaImagePreviewActivity.cancelPicture = null;
            mediaImagePreviewActivity.cropOverlayView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

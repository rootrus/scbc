package com.scb.phone.view.activity.transferandpay;

import android.view.View;
import android.widget.RelativeLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.camera.CameraSourcePreview;
import p040o.onCreateDialog;
import p040o.onStart;

public class ScanPaymentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private ScanPaymentActivity write;

    public ScanPaymentActivity_ViewBinding(final ScanPaymentActivity scanPaymentActivity, View view) {
        super(scanPaymentActivity, view);
        this.write = scanPaymentActivity;
        scanPaymentActivity.mPreview = (CameraSourcePreview) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.preview, "field 'mPreview'", CameraSourcePreview.class);
        scanPaymentActivity.layoutCamera = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_camera, "field 'layoutCamera'", RelativeLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_flashlight, "method 'onFlashButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScanPaymentActivity.this.onFlashButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_album, "method 'onAlbumButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ScanPaymentActivity.this.onAlbumButtonClicked();
            }
        });
    }

    public final void read() {
        ScanPaymentActivity scanPaymentActivity = this.write;
        if (scanPaymentActivity != null) {
            this.write = null;
            scanPaymentActivity.mPreview = null;
            scanPaymentActivity.layoutCamera = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

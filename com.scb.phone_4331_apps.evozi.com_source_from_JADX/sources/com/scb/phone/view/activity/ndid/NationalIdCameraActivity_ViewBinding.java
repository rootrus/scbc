package com.scb.phone.view.activity.ndid;

import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.ndid.OverlayNationalIdFocus;
import p040o.onCreateDialog;
import p040o.onStart;

public class NationalIdCameraActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private NationalIdCameraActivity write;

    public NationalIdCameraActivity_ViewBinding(final NationalIdCameraActivity nationalIdCameraActivity, View view) {
        super(nationalIdCameraActivity, view);
        this.write = nationalIdCameraActivity;
        nationalIdCameraActivity.textureView = (TextureView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.textureView, "field 'textureView'", TextureView.class);
        nationalIdCameraActivity.surfaceView = (SurfaceView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.surfaceView, "field 'surfaceView'", SurfaceView.class);
        nationalIdCameraActivity.overlay = (OverlayNationalIdFocus) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay, "field 'overlay'", OverlayNationalIdFocus.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.iv_capture, "field 'ivCapture' and method 'onClick'");
        nationalIdCameraActivity.ivCapture = (ImageView) onStart.write(IconCompatParcelizer, R.id.iv_capture, "field 'ivCapture'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NationalIdCameraActivity.this.onClick();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_arrow_back, "field 'ivArrowBack' and method 'onNavigateBack'");
        nationalIdCameraActivity.ivArrowBack = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_arrow_back, "field 'ivArrowBack'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NationalIdCameraActivity.this.onNavigateBack();
            }
        });
        nationalIdCameraActivity.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title, "field 'tvTitle'", TextView.class);
    }

    public final void read() {
        NationalIdCameraActivity nationalIdCameraActivity = this.write;
        if (nationalIdCameraActivity != null) {
            this.write = null;
            nationalIdCameraActivity.textureView = null;
            nationalIdCameraActivity.surfaceView = null;
            nationalIdCameraActivity.overlay = null;
            nationalIdCameraActivity.ivCapture = null;
            nationalIdCameraActivity.ivArrowBack = null;
            nationalIdCameraActivity.tvTitle = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

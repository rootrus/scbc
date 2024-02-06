package p040o;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: o.MediaImageService */
public final class MediaImageService implements SurfaceHolder.Callback, Camera.PreviewCallback {
    public Camera.Parameters IconCompatParcelizer;
    public Camera MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver = 1;
    public IconCompatParcelizer MediaBrowserCompat$MediaItem;
    public SurfaceHolder RatingCompat;
    public int read;
    public Context write;

    /* renamed from: o.MediaImageService$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void write(byte[] bArr);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public MediaImageService(Context context) {
        this.write = context;
    }

    public final void IconCompatParcelizer() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            try {
                this.read = FragmentBuilder_BindEEasycashFeaturesLoanInformationFragment.write(this.write, this.MediaBrowserCompat$ItemReceiver);
                this.MediaBrowserCompat$CustomActionResultReceiver.setPreviewDisplay(this.RatingCompat);
                this.MediaBrowserCompat$CustomActionResultReceiver.setDisplayOrientation(this.read);
                this.MediaBrowserCompat$CustomActionResultReceiver.setPreviewCallback(this);
                this.MediaBrowserCompat$CustomActionResultReceiver.startPreview();
            } catch (IOException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Camera camera = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (camera != null) {
            if (camera != null) {
                camera.stopPreview();
            }
            IconCompatParcelizer();
        }
    }

    public final void onPreviewFrame(byte[] bArr, Camera camera) {
        this.MediaBrowserCompat$MediaItem.write(bArr);
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Camera camera = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (camera != null) {
            camera.stopPreview();
        }
        try {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.release();
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
        this.RatingCompat.removeCallback(this);
    }
}

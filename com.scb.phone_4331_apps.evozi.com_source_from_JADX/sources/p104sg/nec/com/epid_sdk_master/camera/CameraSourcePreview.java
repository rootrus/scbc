package p104sg.nec.com.epid_sdk_master.camera;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.google.android.gms.common.images.Size;
import com.google.android.gms.vision.CameraSource;
import java.io.IOException;

/* renamed from: sg.nec.com.epid_sdk_master.camera.CameraSourcePreview */
public class CameraSourcePreview extends ViewGroup {
    private boolean IconCompatParcelizer = false;
    private GraphicOverlay MediaBrowserCompat$CustomActionResultReceiver;
    public CameraSource MediaBrowserCompat$ItemReceiver;
    private SurfaceView RatingCompat;
    private Context read;
    /* access modifiers changed from: private */
    public boolean write = false;

    public CameraSourcePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = context;
        SurfaceView surfaceView = new SurfaceView(context);
        this.RatingCompat = surfaceView;
        surfaceView.getHolder().addCallback(new read(this, (byte) 0));
        addView(this.RatingCompat);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CameraSource cameraSource, GraphicOverlay graphicOverlay) throws IOException {
        CameraSource cameraSource2;
        this.MediaBrowserCompat$CustomActionResultReceiver = graphicOverlay;
        if (cameraSource == null && (cameraSource2 = this.MediaBrowserCompat$ItemReceiver) != null) {
            cameraSource2.stop();
        }
        this.MediaBrowserCompat$ItemReceiver = cameraSource;
        if (cameraSource != null) {
            this.IconCompatParcelizer = true;
            IconCompatParcelizer();
        }
    }

    /* access modifiers changed from: private */
    public void IconCompatParcelizer() throws IOException {
        if (this.IconCompatParcelizer && this.write) {
            this.MediaBrowserCompat$ItemReceiver.start(this.RatingCompat.getHolder());
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                Size previewSize = this.MediaBrowserCompat$ItemReceiver.getPreviewSize();
                int min = Math.min(previewSize.getWidth(), previewSize.getHeight());
                int max = Math.max(previewSize.getWidth(), previewSize.getHeight());
                if (MediaBrowserCompat$ItemReceiver()) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.setCameraInfo(min, max, this.MediaBrowserCompat$ItemReceiver.getCameraFacing());
                } else {
                    this.MediaBrowserCompat$CustomActionResultReceiver.setCameraInfo(max, min, this.MediaBrowserCompat$ItemReceiver.getCameraFacing());
                }
                GraphicOverlay graphicOverlay = this.MediaBrowserCompat$CustomActionResultReceiver;
                synchronized (graphicOverlay.IconCompatParcelizer) {
                    graphicOverlay.MediaBrowserCompat$CustomActionResultReceiver.clear();
                }
                graphicOverlay.postInvalidate();
            }
            this.IconCompatParcelizer = false;
        }
    }

    /* renamed from: sg.nec.com.epid_sdk_master.camera.CameraSourcePreview$read */
    class read implements SurfaceHolder.Callback {
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        private read() {
        }

        /* synthetic */ read(CameraSourcePreview cameraSourcePreview, byte b) {
            this();
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            boolean unused = CameraSourcePreview.this.write = true;
            try {
                CameraSourcePreview.this.IconCompatParcelizer();
            } catch (IOException e) {
                Log.e("CameraSourcePreview", "Could not start camera source.", e);
            }
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            boolean unused = CameraSourcePreview.this.write = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Size previewSize;
        CameraSource cameraSource = this.MediaBrowserCompat$ItemReceiver;
        if (cameraSource == null || (previewSize = cameraSource.getPreviewSize()) == null) {
            i6 = 1920;
            i5 = 1080;
        } else {
            i6 = previewSize.getWidth();
            i5 = previewSize.getHeight();
        }
        if (!MediaBrowserCompat$ItemReceiver()) {
            int i9 = i6;
            i6 = i5;
            i5 = i9;
        }
        int i10 = i3 - i;
        int i11 = i4 - i2;
        float f = (float) i5;
        float f2 = ((float) i10) / f;
        float f3 = (float) i6;
        float f4 = ((float) i11) / f3;
        if (f2 > f4) {
            int i12 = (int) (f3 * f2);
            i11 = i12;
            i8 = (i12 - i11) / 2;
            i7 = 0;
        } else {
            int i13 = (int) (f * f4);
            i7 = (i13 - i10) / 2;
            i10 = i13;
            i8 = 0;
        }
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            getChildAt(i14).layout(-i7, -i8, i10 - i7, i11 - i8);
        }
        try {
            IconCompatParcelizer();
        } catch (IOException e) {
            Log.e("CameraSourcePreview", "Could not start camera source.", e);
        }
    }

    private boolean MediaBrowserCompat$ItemReceiver() {
        int i = this.read.getResources().getConfiguration().orientation;
        if (i == 2) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        Log.d("CameraSourcePreview", "isPortraitMode returning false by default");
        return false;
    }
}

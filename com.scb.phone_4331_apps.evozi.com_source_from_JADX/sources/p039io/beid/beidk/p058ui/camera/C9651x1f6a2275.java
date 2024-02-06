package p039io.beid.beidk.p058ui.camera;

import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;

/* renamed from: io.beid.beidk.ui.camera.CameraSourcePreview$MediaBrowserCompat$CustomActionResultReceiver */
class C9651x1f6a2275 implements SurfaceHolder.Callback {
    private /* synthetic */ CameraSourcePreview write;

    private C9651x1f6a2275(CameraSourcePreview cameraSourcePreview) {
        this.write = cameraSourcePreview;
    }

    /* synthetic */ C9651x1f6a2275(CameraSourcePreview cameraSourcePreview, byte b) {
        this(cameraSourcePreview);
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        String str;
        boolean unused = this.write.write = true;
        try {
            this.write.read();
        } catch (SecurityException e) {
            e = e;
            str = "Do not have permission to start the camera";
            Log.e("CameraSourcePreview", str, e);
        } catch (IOException e2) {
            e = e2;
            str = "Could not start camera source.";
            Log.e("CameraSourcePreview", str, e);
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        boolean unused = this.write.write = false;
    }
}

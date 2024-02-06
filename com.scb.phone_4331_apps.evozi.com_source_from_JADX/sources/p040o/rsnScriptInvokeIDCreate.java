package p040o;

import android.hardware.Camera;
import android.util.Log;

/* renamed from: o.rsnScriptInvokeIDCreate */
public final class rsnScriptInvokeIDCreate {
    private static final String MediaBrowserCompat$ItemReceiver = rsnScriptInvokeIDCreate.class.getName();

    private rsnScriptInvokeIDCreate() {
    }

    public static int IconCompatParcelizer(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            Log.w(MediaBrowserCompat$ItemReceiver, "No cameras!");
            return -1;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            return i;
        }
        if (z) {
            return -1;
        }
        return 0;
    }

    public static Camera write(int i) {
        int IconCompatParcelizer = IconCompatParcelizer(i);
        if (IconCompatParcelizer == -1) {
            return null;
        }
        return Camera.open(IconCompatParcelizer);
    }
}

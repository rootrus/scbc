package p040o;

import android.hardware.Camera;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import p040o.CHER;

/* renamed from: o.rsnScriptInvoke */
public final class rsnScriptInvoke {
    static {
        Pattern.compile(";");
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Camera.Parameters parameters, CHER.read read, boolean z) {
        String str;
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (z || read == CHER.read.AUTO) {
            str = MediaBrowserCompat$ItemReceiver("focus mode", supportedFocusModes, "auto");
        } else if (read == CHER.read.CONTINUOUS) {
            str = MediaBrowserCompat$ItemReceiver("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto");
        } else if (read == CHER.read.INFINITY) {
            str = MediaBrowserCompat$ItemReceiver("focus mode", supportedFocusModes, "infinity");
        } else {
            str = read == CHER.read.MACRO ? MediaBrowserCompat$ItemReceiver("focus mode", supportedFocusModes, "macro") : null;
        }
        if (!z && str == null) {
            str = MediaBrowserCompat$ItemReceiver("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFocusMode())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Focus mode already set to ");
            sb.append(str);
            Log.i("CameraConfiguration", sb.toString());
            return;
        }
        parameters.setFocusMode(str);
    }

    public static void read(Camera.Parameters parameters, boolean z) {
        String str;
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        if (z) {
            str = MediaBrowserCompat$ItemReceiver("flash mode", supportedFlashModes, "torch", "on");
        } else {
            str = MediaBrowserCompat$ItemReceiver("flash mode", supportedFlashModes, "off");
        }
        if (str == null) {
            return;
        }
        if (str.equals(parameters.getFlashMode())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Flash mode already set to ");
            sb.append(str);
            Log.i("CameraConfiguration", sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting flash mode to ");
        sb2.append(str);
        Log.i("CameraConfiguration", sb2.toString());
        parameters.setFlashMode(str);
    }

    private static String MediaBrowserCompat$ItemReceiver(String str, Collection<String> collection, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Requesting ");
        sb.append(str);
        sb.append(" value from among: ");
        sb.append(Arrays.toString(strArr));
        Log.i("CameraConfiguration", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Supported ");
        sb2.append(str);
        sb2.append(" values: ");
        sb2.append(collection);
        Log.i("CameraConfiguration", sb2.toString());
        if (collection != null) {
            for (String str2 : strArr) {
                if (collection.contains(str2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can set ");
                    sb3.append(str);
                    sb3.append(" to: ");
                    sb3.append(str2);
                    Log.i("CameraConfiguration", sb3.toString());
                    return str2;
                }
            }
        }
        Log.i("CameraConfiguration", "No supported values match");
        return null;
    }

    private static String IconCompatParcelizer(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Camera.Parameters parameters) {
        int[] iArr;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        StringBuilder sb = new StringBuilder();
        sb.append("Supported FPS ranges: ");
        sb.append(IconCompatParcelizer(supportedPreviewFpsRange));
        Log.i("CameraConfiguration", sb.toString());
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                iArr = null;
                if (!it.hasNext()) {
                    break;
                }
                iArr = it.next();
                int i = iArr[0];
                int i2 = iArr[1];
                if (i >= 10000 && i2 <= 20000) {
                    break;
                }
            }
            if (iArr == null) {
                Log.i("CameraConfiguration", "No suitable FPS range?");
                return;
            }
            int[] iArr2 = new int[2];
            parameters.getPreviewFpsRange(iArr2);
            if (Arrays.equals(iArr2, iArr)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FPS range already set to ");
                sb2.append(Arrays.toString(iArr));
                Log.i("CameraConfiguration", sb2.toString());
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting FPS range to ");
            sb3.append(Arrays.toString(iArr));
            Log.i("CameraConfiguration", sb3.toString());
            parameters.setPreviewFpsRange(iArr[0], iArr[1]);
        }
    }
}

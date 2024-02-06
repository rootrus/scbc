package p040o;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.ScriptGroup;
import p040o.zzge;

/* renamed from: o.FragmentBuilder_BindEEasycashFeaturesLoanInformationFragment */
public final class FragmentBuilder_BindEEasycashFeaturesLoanInformationFragment {
    public zzge.zzf.read IconCompatParcelizer;
    public execute MediaBrowserCompat$CustomActionResultReceiver;
    public access$002 MediaBrowserCompat$ItemReceiver;
    public ScriptGroup.Binding read;
    public int write = -1;

    public static int write(Context context, int i) {
        int i2 = 0;
        if (context == null) {
            return 0;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(i, cameraInfo);
        int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                i2 = 90;
            } else if (rotation == 2) {
                i2 = CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256;
            } else if (rotation == 3) {
                i2 = 270;
            }
        }
        if (cameraInfo.facing == 1) {
            return (360 - ((cameraInfo.orientation + i2) % 360)) % 360;
        }
        return ((cameraInfo.orientation - i2) + 360) % 360;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("\n ecLevel: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("\n version: ");
        sb.append(this.read);
        sb.append("\n maskPattern: ");
        sb.append(this.write);
        if (this.IconCompatParcelizer == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.IconCompatParcelizer);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}

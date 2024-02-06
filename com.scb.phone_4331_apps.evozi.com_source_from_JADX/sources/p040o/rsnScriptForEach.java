package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.rsnScriptForEach */
public class rsnScriptForEach {
    public final float MediaBrowserCompat$CustomActionResultReceiver;
    public final float read;

    public rsnScriptForEach(float f, float f2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = f;
        this.read = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsnScriptForEach)) {
            return false;
        }
        rsnScriptForEach rsnscriptforeach = (rsnScriptForEach) obj;
        return this.MediaBrowserCompat$CustomActionResultReceiver == rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver && this.read == rsnscriptforeach.read;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.MediaBrowserCompat$CustomActionResultReceiver) * 31) + Float.floatToIntBits(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(',');
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }

    public static void IconCompatParcelizer(rsnScriptForEach[] rsnscriptforeachArr) {
        rsnScriptForEach rsnscriptforeach;
        rsnScriptForEach rsnscriptforeach2;
        rsnScriptForEach rsnscriptforeach3;
        float IconCompatParcelizer = IconCompatParcelizer(rsnscriptforeachArr[0], rsnscriptforeachArr[1]);
        float IconCompatParcelizer2 = IconCompatParcelizer(rsnscriptforeachArr[1], rsnscriptforeachArr[2]);
        float IconCompatParcelizer3 = IconCompatParcelizer(rsnscriptforeachArr[0], rsnscriptforeachArr[2]);
        if (IconCompatParcelizer2 >= IconCompatParcelizer && IconCompatParcelizer2 >= IconCompatParcelizer3) {
            rsnscriptforeach3 = rsnscriptforeachArr[0];
            rsnscriptforeach2 = rsnscriptforeachArr[1];
            rsnscriptforeach = rsnscriptforeachArr[2];
        } else if (IconCompatParcelizer3 < IconCompatParcelizer2 || IconCompatParcelizer3 < IconCompatParcelizer) {
            rsnscriptforeach3 = rsnscriptforeachArr[2];
            rsnscriptforeach2 = rsnscriptforeachArr[0];
            rsnscriptforeach = rsnscriptforeachArr[1];
        } else {
            rsnscriptforeach3 = rsnscriptforeachArr[1];
            rsnscriptforeach2 = rsnscriptforeachArr[0];
            rsnscriptforeach = rsnscriptforeachArr[2];
        }
        float f = rsnscriptforeach3.MediaBrowserCompat$CustomActionResultReceiver;
        float f2 = rsnscriptforeach3.read;
        if (((rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver - f) * (rsnscriptforeach2.read - f2)) - ((rsnscriptforeach.read - f2) * (rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver - f)) < BitmapDescriptorFactory.HUE_RED) {
            rsnScriptForEach rsnscriptforeach4 = rsnscriptforeach;
            rsnscriptforeach = rsnscriptforeach2;
            rsnscriptforeach2 = rsnscriptforeach4;
        }
        rsnscriptforeachArr[0] = rsnscriptforeach2;
        rsnscriptforeachArr[1] = rsnscriptforeach3;
        rsnscriptforeachArr[2] = rsnscriptforeach;
    }

    public static float IconCompatParcelizer(rsnScriptForEach rsnscriptforeach, rsnScriptForEach rsnscriptforeach2) {
        float f = rsnscriptforeach.MediaBrowserCompat$CustomActionResultReceiver;
        float f2 = rsnscriptforeach.read;
        float f3 = f - rsnscriptforeach2.MediaBrowserCompat$CustomActionResultReceiver;
        float f4 = f2 - rsnscriptforeach2.read;
        return (float) Math.sqrt((double) ((f3 * f3) + (f4 * f4)));
    }
}

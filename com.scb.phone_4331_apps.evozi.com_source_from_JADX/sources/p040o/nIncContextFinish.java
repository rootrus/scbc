package p040o;

import android.graphics.Matrix;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.nIncContextFinish */
public final class nIncContextFinish {
    public float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    public float MediaBrowserCompat$CustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
    final List<write> MediaBrowserCompat$ItemReceiver;
    public float read = BitmapDescriptorFactory.HUE_RED;
    public float write = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: o.nIncContextFinish$write */
    public static abstract class write {
        protected final Matrix MediaBrowserCompat$ItemReceiver = new Matrix();

        public abstract void write(Matrix matrix, Path path);
    }

    public nIncContextFinish() {
        ArrayList arrayList = new ArrayList();
        this.MediaBrowserCompat$ItemReceiver = arrayList;
        arrayList.clear();
    }

    public final void read(float f) {
        read read2 = new read();
        read2.IconCompatParcelizer = f;
        read2.write = BitmapDescriptorFactory.HUE_RED;
        this.MediaBrowserCompat$ItemReceiver.add(read2);
        this.write = f;
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(float f, float f2, float f3, float f4, float f5, float f6) {
        nIncContextFinish$MediaBrowserCompat$CustomActionResultReceiver ninccontextfinish_mediabrowsercompat_customactionresultreceiver = new nIncContextFinish$MediaBrowserCompat$CustomActionResultReceiver(f, f2, f3, f4);
        ninccontextfinish_mediabrowsercompat_customactionresultreceiver.read = f5;
        ninccontextfinish_mediabrowsercompat_customactionresultreceiver.write = f6;
        this.MediaBrowserCompat$ItemReceiver.add(ninccontextfinish_mediabrowsercompat_customactionresultreceiver);
        double d = (double) (f5 + f6);
        this.write = ((f + f3) * 0.5f) + (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d))));
        this.IconCompatParcelizer = ((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d))));
    }

    public final void MediaBrowserCompat$ItemReceiver(Matrix matrix, Path path) {
        int size = this.MediaBrowserCompat$ItemReceiver.size();
        for (int i = 0; i < size; i++) {
            this.MediaBrowserCompat$ItemReceiver.get(i).write(matrix, path);
        }
    }

    /* renamed from: o.nIncContextFinish$read */
    public static class read extends write {
        float IconCompatParcelizer;
        float write;

        public final void write(Matrix matrix, Path path) {
            Matrix matrix2 = this.MediaBrowserCompat$ItemReceiver;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.IconCompatParcelizer, BitmapDescriptorFactory.HUE_RED);
            path.transform(matrix);
        }
    }
}

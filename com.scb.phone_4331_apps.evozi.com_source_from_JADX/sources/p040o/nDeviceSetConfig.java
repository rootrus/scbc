package p040o;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p040o.nDeviceCreate;

/* renamed from: o.nDeviceSetConfig */
public interface nDeviceSetConfig extends nDeviceCreate.write {
    void IconCompatParcelizer();

    void MediaBrowserCompat$CustomActionResultReceiver();

    read read();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(read read2);

    int write();

    /* renamed from: o.nDeviceSetConfig$read */
    public static class read {
        public float MediaBrowserCompat$CustomActionResultReceiver;
        public float MediaBrowserCompat$ItemReceiver;
        public float read;

        /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }

        public read(float f, float f2, float f3) {
            this.MediaBrowserCompat$CustomActionResultReceiver = f;
            this.MediaBrowserCompat$ItemReceiver = f2;
            this.read = f3;
        }

        public read(read read2) {
            this(read2.MediaBrowserCompat$CustomActionResultReceiver, read2.MediaBrowserCompat$ItemReceiver, read2.read);
        }
    }

    /* renamed from: o.nDeviceSetConfig$IconCompatParcelizer */
    public static class IconCompatParcelizer extends Property<nDeviceSetConfig, read> {
        public static final Property<nDeviceSetConfig, read> read = new IconCompatParcelizer("circularReveal");

        public final /* synthetic */ Object get(Object obj) {
            return ((nDeviceSetConfig) obj).read();
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ((nDeviceSetConfig) obj).setRevealInfo((read) obj2);
        }

        private IconCompatParcelizer(String str) {
            super(read.class, str);
        }
    }

    /* renamed from: o.nDeviceSetConfig$write */
    public static class write implements TypeEvaluator<read> {
        public static final TypeEvaluator<read> MediaBrowserCompat$CustomActionResultReceiver = new write();
        private final read IconCompatParcelizer = new read((byte) 0);

        public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
            read read = (read) obj;
            read read2 = (read) obj2;
            read read3 = this.IconCompatParcelizer;
            float f2 = 1.0f - f;
            float f3 = (read.MediaBrowserCompat$CustomActionResultReceiver * f2) + (read2.MediaBrowserCompat$CustomActionResultReceiver * f);
            float f4 = read.MediaBrowserCompat$ItemReceiver;
            float f5 = read.read;
            read3.MediaBrowserCompat$CustomActionResultReceiver = f3;
            read3.MediaBrowserCompat$ItemReceiver = (f4 * f2) + (read2.MediaBrowserCompat$ItemReceiver * f);
            read3.read = (f2 * f5) + (f * read2.read);
            return this.IconCompatParcelizer;
        }
    }
}

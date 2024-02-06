package p040o;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: o.setOrientation */
public final class setOrientation {
    static final CheckCaptureModule_GetIExtractionServerKtaFactory IconCompatParcelizer;
    private static final setOrientation read = new setOrientation();

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            IconCompatParcelizer = new setOrientation$MediaBrowserCompat$ItemReceiver();
        } else {
            IconCompatParcelizer = new IconCompatParcelizer();
        }
    }

    /* renamed from: o.setOrientation$IconCompatParcelizer */
    static class IconCompatParcelizer implements CheckCaptureModule_GetIExtractionServerKtaFactory {
        private setVerticalGravity write = new setVerticalGravity(new Locale[0]);

        IconCompatParcelizer() {
        }

        public void MediaBrowserCompat$ItemReceiver(Locale... localeArr) {
            this.write = new setVerticalGravity(localeArr);
        }

        public Object write() {
            return this.write;
        }

        public Locale write(int i) {
            setVerticalGravity setverticalgravity = this.write;
            if (i >= 0) {
                Locale[] localeArr = setverticalgravity.MediaBrowserCompat$ItemReceiver;
                if (i < localeArr.length) {
                    return localeArr[i];
                }
            }
            return null;
        }

        public int read() {
            return this.write.MediaBrowserCompat$ItemReceiver.length;
        }

        public boolean equals(Object obj) {
            return this.write.equals(((setOrientation) obj).IconCompatParcelizer());
        }

        public int hashCode() {
            return this.write.hashCode();
        }

        public String toString() {
            return this.write.toString();
        }
    }

    private setOrientation() {
    }

    public static setOrientation write(Object obj) {
        setOrientation setorientation = new setOrientation();
        if (obj instanceof LocaleList) {
            setorientation.MediaBrowserCompat$ItemReceiver((LocaleList) obj);
        }
        return setorientation;
    }

    public final Object IconCompatParcelizer() {
        return IconCompatParcelizer.write();
    }

    public static setOrientation read(Locale... localeArr) {
        setOrientation setorientation = new setOrientation();
        setorientation.IconCompatParcelizer(localeArr);
        return setorientation;
    }

    public final Locale MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return IconCompatParcelizer.write(i);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return IconCompatParcelizer.read();
    }

    public final boolean equals(Object obj) {
        return IconCompatParcelizer.equals(obj);
    }

    public final int hashCode() {
        return IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        return IconCompatParcelizer.toString();
    }

    private void MediaBrowserCompat$ItemReceiver(LocaleList localeList) {
        int size = localeList.size();
        if (size > 0) {
            Locale[] localeArr = new Locale[size];
            for (int i = 0; i < size; i++) {
                localeArr[i] = localeList.get(i);
            }
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(localeArr);
        }
    }

    private void IconCompatParcelizer(Locale... localeArr) {
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(localeArr);
    }
}

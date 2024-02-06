package p040o;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: o.setOrientation$MediaBrowserCompat$ItemReceiver */
class setOrientation$MediaBrowserCompat$ItemReceiver implements CheckCaptureModule_GetIExtractionServerKtaFactory {
    private LocaleList MediaBrowserCompat$ItemReceiver = new LocaleList(new Locale[0]);

    setOrientation$MediaBrowserCompat$ItemReceiver() {
    }

    public void MediaBrowserCompat$ItemReceiver(Locale... localeArr) {
        this.MediaBrowserCompat$ItemReceiver = new LocaleList(localeArr);
    }

    public Object write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public Locale write(int i) {
        return this.MediaBrowserCompat$ItemReceiver.get(i);
    }

    public int read() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public boolean equals(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.equals(((setOrientation) obj).IconCompatParcelizer());
    }

    public int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    public String toString() {
        return this.MediaBrowserCompat$ItemReceiver.toString();
    }
}

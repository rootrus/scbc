package p040o;

import java.io.IOException;
import java.io.InputStream;
import p040o.CheckParameters;
import p040o.onCreateContextMenu;

/* renamed from: o.onMultiWindowModeChanged */
public final class onMultiWindowModeChanged implements onCreateContextMenu<InputStream> {
    private final onStateNotSaved MediaBrowserCompat$ItemReceiver;

    onMultiWindowModeChanged(InputStream inputStream, CheckParameters.CheckCountry checkCountry) {
        onStateNotSaved onstatenotsaved = new onStateNotSaved(inputStream, checkCountry);
        this.MediaBrowserCompat$ItemReceiver = onstatenotsaved;
        onstatenotsaved.mark(5242880);
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
    }

    /* renamed from: o.onMultiWindowModeChanged$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements onCreateContextMenu.read<InputStream> {
        private final CheckParameters.CheckCountry write;

        public final /* synthetic */ onCreateContextMenu MediaBrowserCompat$ItemReceiver(Object obj) {
            return new onMultiWindowModeChanged((InputStream) obj, this.write);
        }

        public IconCompatParcelizer(CheckParameters.CheckCountry checkCountry) {
            this.write = checkCountry;
        }

        public final Class<InputStream> MediaBrowserCompat$ItemReceiver() {
            return InputStream.class;
        }
    }

    public final /* synthetic */ Object read() throws IOException {
        this.MediaBrowserCompat$ItemReceiver.reset();
        return this.MediaBrowserCompat$ItemReceiver;
    }
}

package p040o;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: o.startIntentSenderFromFragment */
public final class startIntentSenderFromFragment implements isVisible<Bitmap, Bitmap> {
    public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(Object obj, onActivityResult onactivityresult) throws IOException {
        return true;
    }

    public final /* synthetic */ performOptionsMenuClosed MediaBrowserCompat$CustomActionResultReceiver(Object obj, int i, int i2, onActivityResult onactivityresult) throws IOException {
        return new write((Bitmap) obj);
    }

    /* renamed from: o.startIntentSenderFromFragment$write */
    static final class write implements performOptionsMenuClosed<Bitmap> {
        private final Bitmap MediaBrowserCompat$ItemReceiver;

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        write(Bitmap bitmap) {
            this.MediaBrowserCompat$ItemReceiver = bitmap;
        }

        public final Class<Bitmap> IconCompatParcelizer() {
            return Bitmap.class;
        }

        public final int read() {
            return LinearLayoutManager.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        }

        public final /* bridge */ /* synthetic */ Object write() {
            return this.MediaBrowserCompat$ItemReceiver;
        }
    }
}

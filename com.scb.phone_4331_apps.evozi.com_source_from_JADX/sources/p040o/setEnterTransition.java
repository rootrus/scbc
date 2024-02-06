package p040o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import p040o.onCreateOptionsMenu;

/* renamed from: o.setEnterTransition */
public final class setEnterTransition implements setSharedElementEnterTransition<File, ByteBuffer> {
    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        File file = (File) obj;
        return new C1536x6a517a85(new unregisterListener(file), new IconCompatParcelizer(file));
    }

    /* renamed from: o.setEnterTransition$IconCompatParcelizer */
    static final class IconCompatParcelizer implements onCreateOptionsMenu<ByteBuffer> {
        private final File read;

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        public final void read() {
        }

        IconCompatParcelizer(File file) {
            this.read = file;
        }

        public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super ByteBuffer> iconCompatParcelizer) {
            try {
                iconCompatParcelizer.read(stopLoading.read(this.read));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(e);
            }
        }

        public final Class<ByteBuffer> write() {
            return ByteBuffer.class;
        }

        public final isPostponed MediaBrowserCompat$ItemReceiver() {
            return isPostponed.LOCAL;
        }
    }
}

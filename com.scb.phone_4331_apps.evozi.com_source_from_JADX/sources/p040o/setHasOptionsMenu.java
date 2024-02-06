package p040o;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p040o.onCreateOptionsMenu;

/* renamed from: o.setHasOptionsMenu */
public final class setHasOptionsMenu<Data> implements setSharedElementEnterTransition<File, Data> {
    private final setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<Data> write;

    public final /* bridge */ /* synthetic */ boolean write(Object obj) {
        return true;
    }

    public final /* synthetic */ C1536x6a517a85 IconCompatParcelizer(Object obj, int i, int i2, onActivityResult onactivityresult) {
        File file = (File) obj;
        return new C1536x6a517a85(new unregisterListener(file), new write(file, this.write));
    }

    public setHasOptionsMenu(setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<Data> sethasoptionsmenu_mediabrowsercompat_itemreceiver) {
        this.write = sethasoptionsmenu_mediabrowsercompat_itemreceiver;
    }

    /* renamed from: o.setHasOptionsMenu$write */
    static final class write<Data> implements onCreateOptionsMenu<Data> {
        private final setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<Data> MediaBrowserCompat$CustomActionResultReceiver;
        private final File MediaBrowserCompat$ItemReceiver;
        private Data write;

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        write(File file, setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<Data> sethasoptionsmenu_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$ItemReceiver = file;
            this.MediaBrowserCompat$CustomActionResultReceiver = sethasoptionsmenu_mediabrowsercompat_itemreceiver;
        }

        public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super Data> iconCompatParcelizer) {
            try {
                Data read = this.MediaBrowserCompat$CustomActionResultReceiver.read(this.MediaBrowserCompat$ItemReceiver);
                this.write = read;
                iconCompatParcelizer.read(read);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(e);
            }
        }

        public final void read() {
            Data data = this.write;
            if (data != null) {
                try {
                    this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(data);
                } catch (IOException unused) {
                }
            }
        }

        public final Class<Data> write() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        }

        public final isPostponed MediaBrowserCompat$ItemReceiver() {
            return isPostponed.LOCAL;
        }
    }

    /* renamed from: o.setHasOptionsMenu$IconCompatParcelizer */
    public static class IconCompatParcelizer extends setHasOptionsMenu$MediaBrowserCompat$CustomActionResultReceiver<InputStream> {
        public IconCompatParcelizer() {
            super(new setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<InputStream>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) throws IOException {
                    ((InputStream) obj).close();
                }

                public final Class<InputStream> IconCompatParcelizer() {
                    return InputStream.class;
                }

                public final /* synthetic */ Object read(File file) throws FileNotFoundException {
                    return new FileInputStream(file);
                }
            });
        }
    }

    /* renamed from: o.setHasOptionsMenu$read */
    public static class read extends setHasOptionsMenu$MediaBrowserCompat$CustomActionResultReceiver<ParcelFileDescriptor> {
        public read() {
            super(new setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<ParcelFileDescriptor>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) throws IOException {
                    ((ParcelFileDescriptor) obj).close();
                }

                public final Class<ParcelFileDescriptor> IconCompatParcelizer() {
                    return ParcelFileDescriptor.class;
                }

                public final /* synthetic */ Object read(File file) throws FileNotFoundException {
                    return ParcelFileDescriptor.open(file, 268435456);
                }
            });
        }
    }
}

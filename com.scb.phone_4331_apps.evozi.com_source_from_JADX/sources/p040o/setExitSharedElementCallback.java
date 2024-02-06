package p040o;

import java.io.IOException;
import p040o.onCreateOptionsMenu;

/* renamed from: o.setExitSharedElementCallback */
public final class setExitSharedElementCallback<Model, Data> implements setSharedElementEnterTransition<Model, Data> {
    private final read<Data> IconCompatParcelizer;

    /* renamed from: o.setExitSharedElementCallback$read */
    public interface read<Data> {
        Class<Data> IconCompatParcelizer();

        Data IconCompatParcelizer(String str) throws IllegalArgumentException;

        void MediaBrowserCompat$ItemReceiver(Data data) throws IOException;
    }

    public setExitSharedElementCallback(read<Data> read2) {
        this.IconCompatParcelizer = read2;
    }

    public final C1536x6a517a85<Data> IconCompatParcelizer(Model model, int i, int i2, onActivityResult onactivityresult) {
        return new C1536x6a517a85<>(new unregisterListener(model), new IconCompatParcelizer(model.toString(), this.IconCompatParcelizer));
    }

    public final boolean write(Model model) {
        return model.toString().startsWith("data:image");
    }

    /* renamed from: o.setExitSharedElementCallback$IconCompatParcelizer */
    static final class IconCompatParcelizer<Data> implements onCreateOptionsMenu<Data> {
        private Data IconCompatParcelizer;
        private final read<Data> read;
        private final String write;

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        IconCompatParcelizer(String str, read<Data> read2) {
            this.write = str;
            this.read = read2;
        }

        public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super Data> iconCompatParcelizer) {
            try {
                Data IconCompatParcelizer2 = this.read.IconCompatParcelizer(this.write);
                this.IconCompatParcelizer = IconCompatParcelizer2;
                iconCompatParcelizer.read(IconCompatParcelizer2);
            } catch (IllegalArgumentException e) {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(e);
            }
        }

        public final void read() {
            try {
                this.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
            } catch (IOException unused) {
            }
        }

        public final Class<Data> write() {
            return this.read.IconCompatParcelizer();
        }

        public final isPostponed MediaBrowserCompat$ItemReceiver() {
            return isPostponed.LOCAL;
        }
    }
}

package p040o;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040o.onCreateOptionsMenu;
import p040o.setOnCloseListener;

/* renamed from: o.setReturnTransition */
final class setReturnTransition<Model, Data> implements setSharedElementEnterTransition<Model, Data> {
    private final setOnCloseListener.read<List<Throwable>> MediaBrowserCompat$ItemReceiver;
    private final List<setSharedElementEnterTransition<Model, Data>> write;

    setReturnTransition(List<setSharedElementEnterTransition<Model, Data>> list, setOnCloseListener.read<List<Throwable>> read) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final C1536x6a517a85<Data> IconCompatParcelizer(Model model, int i, int i2, onActivityResult onactivityresult) {
        C1536x6a517a85 IconCompatParcelizer;
        int size = this.write.size();
        ArrayList arrayList = new ArrayList(size);
        isStateSaved isstatesaved = null;
        for (int i3 = 0; i3 < size; i3++) {
            setSharedElementEnterTransition setsharedelemententertransition = this.write.get(i3);
            if (setsharedelemententertransition.write(model) && (IconCompatParcelizer = setsharedelemententertransition.IconCompatParcelizer(model, i, i2, onactivityresult)) != null) {
                isstatesaved = IconCompatParcelizer.read;
                arrayList.add(IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
            }
        }
        if (arrayList.isEmpty() || isstatesaved == null) {
            return null;
        }
        return new C1536x6a517a85<>(isstatesaved, new write(arrayList, this.MediaBrowserCompat$ItemReceiver));
    }

    public final boolean write(Model model) {
        for (setSharedElementEnterTransition<Model, Data> write2 : this.write) {
            if (write2.write(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        sb.append(Arrays.toString(this.write.toArray()));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: o.setReturnTransition$write */
    static class write<Data> implements onCreateOptionsMenu<Data>, onCreateOptionsMenu.IconCompatParcelizer<Data> {
        private onCreateOptionsMenu.IconCompatParcelizer<? super Data> IconCompatParcelizer;
        private boolean MediaBrowserCompat$CustomActionResultReceiver;
        private int MediaBrowserCompat$ItemReceiver;
        private hasOptionsMenu MediaDescriptionCompat;
        private final setOnCloseListener.read<List<Throwable>> RatingCompat;
        private List<Throwable> read;
        private final List<onCreateOptionsMenu<Data>> write;

        write(List<onCreateOptionsMenu<Data>> list, setOnCloseListener.read<List<Throwable>> read2) {
            this.RatingCompat = read2;
            if (!list.isEmpty()) {
                this.write = list;
                this.MediaBrowserCompat$ItemReceiver = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public final void IconCompatParcelizer(hasOptionsMenu hasoptionsmenu, onCreateOptionsMenu.IconCompatParcelizer<? super Data> iconCompatParcelizer) {
            this.MediaDescriptionCompat = hasoptionsmenu;
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.read = this.RatingCompat.read();
            this.write.get(this.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer(hasoptionsmenu, this);
            if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final void read() {
            List<Throwable> list = this.read;
            if (list != null) {
                this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(list);
            }
            this.read = null;
            for (onCreateOptionsMenu<Data> read2 : this.write) {
                read2.read();
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            for (onCreateOptionsMenu<Data> MediaBrowserCompat$CustomActionResultReceiver2 : this.write) {
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        public final Class<Data> write() {
            return this.write.get(0).write();
        }

        public final isPostponed MediaBrowserCompat$ItemReceiver() {
            return this.write.get(0).MediaBrowserCompat$ItemReceiver();
        }

        public final void read(Data data) {
            if (data != null) {
                this.IconCompatParcelizer.read(data);
            } else {
                IconCompatParcelizer();
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
            List<Throwable> list = this.read;
            if (list != null) {
                list.add(exc);
                IconCompatParcelizer();
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }

        private void IconCompatParcelizer() {
            if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
                if (this.MediaBrowserCompat$ItemReceiver < this.write.size() - 1) {
                    this.MediaBrowserCompat$ItemReceiver++;
                    IconCompatParcelizer(this.MediaDescriptionCompat, this.IconCompatParcelizer);
                } else if (this.read != null) {
                    this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.read)));
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
        }
    }
}

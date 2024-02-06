package p040o;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p040o.setOnCloseListener;

/* renamed from: o.performLowMemory */
public final class performLowMemory<Data, ResourceType, Transcode> {
    private final List<? extends performCreateView<Data, ResourceType, Transcode>> IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final setOnCloseListener.read<List<Throwable>> read;

    public performLowMemory(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<performCreateView<Data, ResourceType, Transcode>> list, setOnCloseListener.read<List<Throwable>> read2) {
        this.read = read2;
        if (!list.isEmpty()) {
            this.IconCompatParcelizer = list;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed LoadPath{");
            sb.append(cls.getSimpleName());
            sb.append("->");
            sb.append(cls2.getSimpleName());
            sb.append("->");
            sb.append(cls3.getSimpleName());
            sb.append("}");
            this.MediaBrowserCompat$ItemReceiver = sb.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final performOptionsMenuClosed<Transcode> write(onCreateContextMenu<Data> oncreatecontextmenu, onActivityResult onactivityresult, int i, int i2, performCreateView$MediaBrowserCompat$CustomActionResultReceiver<ResourceType> performcreateview_mediabrowsercompat_customactionresultreceiver) throws GlideException {
        List<Throwable> read2 = this.read.read();
        if (read2 != null) {
            List list = read2;
            try {
                return read(oncreatecontextmenu, onactivityresult, i, i2, performcreateview_mediabrowsercompat_customactionresultreceiver, list);
            } finally {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(list);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    private performOptionsMenuClosed<Transcode> read(onCreateContextMenu<Data> oncreatecontextmenu, onActivityResult onactivityresult, int i, int i2, performCreateView$MediaBrowserCompat$CustomActionResultReceiver<ResourceType> performcreateview_mediabrowsercompat_customactionresultreceiver, List<Throwable> list) throws GlideException {
        int size = this.IconCompatParcelizer.size();
        performOptionsMenuClosed<Transcode> performoptionsmenuclosed = null;
        for (int i3 = 0; i3 < size; i3++) {
            performCreateView performcreateview = (performCreateView) this.IconCompatParcelizer.get(i3);
            try {
                performoptionsmenuclosed = performcreateview.write.MediaBrowserCompat$ItemReceiver(performcreateview_mediabrowsercompat_customactionresultreceiver.read(performcreateview.MediaBrowserCompat$ItemReceiver(oncreatecontextmenu, i, i2, onactivityresult)), onactivityresult);
            } catch (GlideException e) {
                list.add(e);
            }
            if (performoptionsmenuclosed != null) {
                break;
            }
        }
        if (performoptionsmenuclosed != null) {
            return performoptionsmenuclosed;
        }
        throw new GlideException(this.MediaBrowserCompat$ItemReceiver, (List<Throwable>) new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.IconCompatParcelizer.toArray()));
        sb.append('}');
        return sb.toString();
    }
}

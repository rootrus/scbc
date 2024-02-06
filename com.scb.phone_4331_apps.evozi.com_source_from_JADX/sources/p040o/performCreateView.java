package p040o;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p040o.setOnCloseListener;

/* renamed from: o.performCreateView */
public final class performCreateView<DataType, ResourceType, Transcode> {
    private final List<? extends isVisible<DataType, ResourceType>> IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final Class<DataType> MediaBrowserCompat$ItemReceiver;
    private final setOnCloseListener.read<List<Throwable>> read;
    final ReflectiveGenericLifecycleObserver<ResourceType, Transcode> write;

    public performCreateView(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends isVisible<DataType, ResourceType>> list, ReflectiveGenericLifecycleObserver<ResourceType, Transcode> reflectiveGenericLifecycleObserver, setOnCloseListener.read<List<Throwable>> read2) {
        this.MediaBrowserCompat$ItemReceiver = cls;
        this.IconCompatParcelizer = list;
        this.write = reflectiveGenericLifecycleObserver;
        this.read = read2;
        StringBuilder sb = new StringBuilder();
        sb.append("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final performOptionsMenuClosed<ResourceType> MediaBrowserCompat$ItemReceiver(onCreateContextMenu<DataType> oncreatecontextmenu, int i, int i2, onActivityResult onactivityresult) throws GlideException {
        List<Throwable> read2 = this.read.read();
        if (read2 != null) {
            List list = read2;
            try {
                return MediaBrowserCompat$CustomActionResultReceiver(oncreatecontextmenu, i, i2, onactivityresult, list);
            } finally {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(list);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    private performOptionsMenuClosed<ResourceType> MediaBrowserCompat$CustomActionResultReceiver(onCreateContextMenu<DataType> oncreatecontextmenu, int i, int i2, onActivityResult onactivityresult, List<Throwable> list) throws GlideException {
        int size = this.IconCompatParcelizer.size();
        performOptionsMenuClosed<ResourceType> performoptionsmenuclosed = null;
        for (int i3 = 0; i3 < size; i3++) {
            isVisible isvisible = (isVisible) this.IconCompatParcelizer.get(i3);
            try {
                if (isvisible.IconCompatParcelizer(oncreatecontextmenu.read(), onactivityresult)) {
                    performoptionsmenuclosed = isvisible.MediaBrowserCompat$CustomActionResultReceiver(oncreatecontextmenu.read(), i, i2, onactivityresult);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to decode data for ");
                    sb.append(isvisible);
                    Log.v("DecodePath", sb.toString(), e);
                }
                list.add(e);
            }
            if (performoptionsmenuclosed != null) {
                break;
            }
        }
        if (performoptionsmenuclosed != null) {
            return performoptionsmenuclosed;
        }
        throw new GlideException(this.MediaBrowserCompat$CustomActionResultReceiver, (List<Throwable>) new ArrayList(list));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DecodePath{ dataClass=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", decoders=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transcoder=");
        sb.append(this.write);
        sb.append('}');
        return sb.toString();
    }
}

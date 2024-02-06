package p040o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/* renamed from: o.DraggableFloatingActionButton */
public final class DraggableFloatingActionButton implements CustomDoubleCircleBorderView {
    public LinkedList<CustomDoubleCircleBorderView> MediaBrowserCompat$CustomActionResultReceiver;
    public volatile boolean read;

    public DraggableFloatingActionButton() {
    }

    public DraggableFloatingActionButton(CustomDoubleCircleBorderView... customDoubleCircleBorderViewArr) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new LinkedList<>(Arrays.asList(customDoubleCircleBorderViewArr));
    }

    public DraggableFloatingActionButton(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
        LinkedList<CustomDoubleCircleBorderView> linkedList = new LinkedList<>();
        this.MediaBrowserCompat$CustomActionResultReceiver = linkedList;
        linkedList.add(customDoubleCircleBorderView);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final void MediaBrowserCompat$ItemReceiver(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
        if (!customDoubleCircleBorderView.MediaBrowserCompat$ItemReceiver()) {
            if (!this.read) {
                synchronized (this) {
                    if (!this.read) {
                        LinkedList<CustomDoubleCircleBorderView> linkedList = this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (linkedList == null) {
                            linkedList = new LinkedList<>();
                            this.MediaBrowserCompat$CustomActionResultReceiver = linkedList;
                        }
                        linkedList.add(customDoubleCircleBorderView);
                        return;
                    }
                }
            }
            customDoubleCircleBorderView.write();
        }
    }

    public final void write() {
        if (!this.read) {
            synchronized (this) {
                if (!this.read) {
                    this.read = true;
                    LinkedList<CustomDoubleCircleBorderView> linkedList = this.MediaBrowserCompat$CustomActionResultReceiver;
                    this.MediaBrowserCompat$CustomActionResultReceiver = null;
                    MediaBrowserCompat$CustomActionResultReceiver(linkedList);
                }
            }
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Collection<CustomDoubleCircleBorderView> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (CustomDoubleCircleBorderView write : collection) {
                try {
                    write.write();
                } catch (Throwable th) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
            AlertController$RecycleListView.read((List<? extends Throwable>) arrayList);
        }
    }
}

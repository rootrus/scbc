package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: o.setIconBottom */
public final class setIconBottom implements CustomDoubleCircleBorderView {
    public volatile boolean MediaBrowserCompat$ItemReceiver;
    private Set<CustomDoubleCircleBorderView> write;

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(CustomDoubleCircleBorderView customDoubleCircleBorderView) {
        if (!customDoubleCircleBorderView.MediaBrowserCompat$ItemReceiver()) {
            if (!this.MediaBrowserCompat$ItemReceiver) {
                synchronized (this) {
                    if (!this.MediaBrowserCompat$ItemReceiver) {
                        if (this.write == null) {
                            this.write = new HashSet(4);
                        }
                        this.write.add(customDoubleCircleBorderView);
                        return;
                    }
                }
            }
            customDoubleCircleBorderView.write();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r2.write();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.CustomDoubleCircleBorderView r2) {
        /*
            r1 = this;
            boolean r0 = r1.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0020
            monitor-enter(r1)
            boolean r0 = r1.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x001b
            java.util.Set<o.CustomDoubleCircleBorderView> r0 = r1.write     // Catch:{ all -> 0x001d }
            if (r0 != 0) goto L_0x000e
            goto L_0x001b
        L_0x000e:
            java.util.Set<o.CustomDoubleCircleBorderView> r0 = r1.write     // Catch:{ all -> 0x001d }
            boolean r0 = r0.remove(r2)     // Catch:{ all -> 0x001d }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0020
            r2.write()
            return
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setIconBottom.read(o.CustomDoubleCircleBorderView):void");
    }

    public final void write() {
        if (!this.MediaBrowserCompat$ItemReceiver) {
            synchronized (this) {
                if (!this.MediaBrowserCompat$ItemReceiver) {
                    this.MediaBrowserCompat$ItemReceiver = true;
                    Set<CustomDoubleCircleBorderView> set = this.write;
                    this.write = null;
                    read((Collection<CustomDoubleCircleBorderView>) set);
                }
            }
        }
    }

    private static void read(Collection<CustomDoubleCircleBorderView> collection) {
        if (collection != null) {
            ArrayList arrayList = null;
            for (CustomDoubleCircleBorderView write2 : collection) {
                try {
                    write2.write();
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

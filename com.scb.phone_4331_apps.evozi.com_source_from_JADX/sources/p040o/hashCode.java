package p040o;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.Glide;
import java.util.concurrent.CopyOnWriteArrayList;
import p040o.loadInBackground;
import p040o.onDestroyView;

/* renamed from: o.hashCode */
public class hashCode implements ComponentCallbacks2, executePendingTask {
    private static final isReset MediaMetadataCompat;
    Glide IconCompatParcelizer;
    final CopyOnWriteArrayList<deliverCancellation<Object>> MediaBrowserCompat$CustomActionResultReceiver;
    final onDestroyView$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
    private final Handler MediaBrowserCompat$MediaItem;
    private final loadInBackground MediaBrowserCompat$SearchResultReceiver;
    private final Runnable MediaDescriptionCompat;
    private final ICheckDeserializer MediaSessionCompat$QueueItem;
    private isReset MediaSessionCompat$Token;
    private Context RatingCompat;
    final ICheckExtractorListener read;
    final onDestroyView.read write;

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
    }

    static {
        isReset isreset = (isReset) new isReset().IconCompatParcelizer((Class<?>) Bitmap.class);
        isreset.RatingCompat = true;
        MediaMetadataCompat = isreset;
        ((isReset) new isReset().IconCompatParcelizer((Class<?>) setUseDefaultMargins.class)).RatingCompat = true;
        ((isReset) ((isReset) new isReset().MediaBrowserCompat$CustomActionResultReceiver(performCreate.write)).MediaBrowserCompat$ItemReceiver(hasOptionsMenu.LOW)).read(true);
    }

    public hashCode(Glide glide, ICheckExtractorListener iCheckExtractorListener, ICheckDeserializer iCheckDeserializer, Context context) {
        this(glide, iCheckExtractorListener, iCheckDeserializer, new onDestroyView$MediaBrowserCompat$CustomActionResultReceiver(), glide.IconCompatParcelizer, context);
    }

    private hashCode(Glide glide, ICheckExtractorListener iCheckExtractorListener, ICheckDeserializer iCheckDeserializer, onDestroyView$MediaBrowserCompat$CustomActionResultReceiver ondestroyview_mediabrowsercompat_customactionresultreceiver, getUsable getusable, Context context) {
        this.write = new onDestroyView.read();
        this.MediaDescriptionCompat = new Runnable() {
            public final void run() {
                hashCode.this.read.read(hashCode.this);
            }
        };
        this.MediaBrowserCompat$MediaItem = new Handler(Looper.getMainLooper());
        this.IconCompatParcelizer = glide;
        this.read = iCheckExtractorListener;
        this.MediaSessionCompat$QueueItem = iCheckDeserializer;
        this.MediaBrowserCompat$ItemReceiver = ondestroyview_mediabrowsercompat_customactionresultreceiver;
        this.RatingCompat = context;
        this.MediaBrowserCompat$SearchResultReceiver = getusable.MediaBrowserCompat$CustomActionResultReceiver(context.getApplicationContext(), new write(ondestroyview_mediabrowsercompat_customactionresultreceiver));
        if (LinearLayoutManager.write()) {
            this.MediaBrowserCompat$MediaItem.post(this.MediaDescriptionCompat);
        } else {
            iCheckExtractorListener.read(this);
        }
        iCheckExtractorListener.read(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = new CopyOnWriteArrayList<>(glide.read.IconCompatParcelizer);
        isReset IconCompatParcelizer2 = glide.read.IconCompatParcelizer();
        synchronized (this) {
            this.MediaSessionCompat$Token = (isReset) ((isReset) IconCompatParcelizer2.clone()).IconCompatParcelizer();
        }
        synchronized (glide.MediaBrowserCompat$ItemReceiver) {
            if (!glide.MediaBrowserCompat$ItemReceiver.contains(this)) {
                glide.MediaBrowserCompat$ItemReceiver.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onStart() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x003d }
            o.onDestroyView$MediaBrowserCompat$CustomActionResultReceiver r0 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x003a }
            r1 = 0
            r0.IconCompatParcelizer = r1     // Catch:{ all -> 0x003a }
            java.util.Set<o.commitContentChanged> r1 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x003a }
            java.util.List r1 = p040o.LinearLayoutManager.write(r1)     // Catch:{ all -> 0x003a }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003a }
        L_0x0011:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003a }
            o.commitContentChanged r2 = (p040o.commitContentChanged) r2     // Catch:{ all -> 0x003a }
            boolean r3 = r2.MediaBrowserCompat$ItemReceiver()     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0011
            boolean r3 = r2.IconCompatParcelizer()     // Catch:{ all -> 0x003a }
            if (r3 != 0) goto L_0x0011
            r2.read()     // Catch:{ all -> 0x003a }
            goto L_0x0011
        L_0x002d:
            java.util.List<o.commitContentChanged> r0 = r0.read     // Catch:{ all -> 0x003a }
            r0.clear()     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            o.onDestroyView$read r0 = r4.write     // Catch:{ all -> 0x003d }
            r0.onStart()     // Catch:{ all -> 0x003d }
            monitor-exit(r4)
            return
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.hashCode.onStart():void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onStop() {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0037 }
            o.onDestroyView$MediaBrowserCompat$CustomActionResultReceiver r0 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0034 }
            r1 = 1
            r0.IconCompatParcelizer = r1     // Catch:{ all -> 0x0034 }
            java.util.Set<o.commitContentChanged> r1 = r0.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0034 }
            java.util.List r1 = p040o.LinearLayoutManager.write(r1)     // Catch:{ all -> 0x0034 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0034 }
        L_0x0011:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x002c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0034 }
            o.commitContentChanged r2 = (p040o.commitContentChanged) r2     // Catch:{ all -> 0x0034 }
            boolean r3 = r2.IconCompatParcelizer()     // Catch:{ all -> 0x0034 }
            if (r3 == 0) goto L_0x0011
            r2.MediaDescriptionCompat()     // Catch:{ all -> 0x0034 }
            java.util.List<o.commitContentChanged> r3 = r0.read     // Catch:{ all -> 0x0034 }
            r3.add(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0011
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            o.onDestroyView$read r0 = r4.write     // Catch:{ all -> 0x0037 }
            r0.onStop()     // Catch:{ all -> 0x0037 }
            monitor-exit(r4)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.hashCode.onStop():void");
    }

    public final void onDestroy() {
        synchronized (this) {
            this.write.onDestroy();
            for (T t : LinearLayoutManager.write(this.write.MediaBrowserCompat$ItemReceiver)) {
                if (t != null) {
                    MediaBrowserCompat$CustomActionResultReceiver(t);
                }
            }
            this.write.MediaBrowserCompat$ItemReceiver.clear();
            onDestroyView$MediaBrowserCompat$CustomActionResultReceiver ondestroyview_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
            for (T MediaBrowserCompat$CustomActionResultReceiver2 : LinearLayoutManager.write(ondestroyview_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
                ondestroyview_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2);
            }
            ondestroyview_mediabrowsercompat_customactionresultreceiver.read.clear();
            this.read.write(this);
            this.read.write(this.MediaBrowserCompat$SearchResultReceiver);
            this.MediaBrowserCompat$MediaItem.removeCallbacks(this.MediaDescriptionCompat);
            Glide glide = this.IconCompatParcelizer;
            synchronized (glide.MediaBrowserCompat$ItemReceiver) {
                if (glide.MediaBrowserCompat$ItemReceiver.contains(this)) {
                    glide.MediaBrowserCompat$ItemReceiver.remove(this);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            }
        }
    }

    public final getViewModelStore<Bitmap> read() {
        return new getViewModelStore(this.IconCompatParcelizer, this, Bitmap.class, this.RatingCompat).MediaBrowserCompat$ItemReceiver((abandon<?>) MediaMetadataCompat);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(onAbandon<?> onabandon) {
        boolean MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(onabandon);
        commitContentChanged read2 = onabandon.read();
        if (!MediaBrowserCompat$ItemReceiver2 && !this.IconCompatParcelizer.IconCompatParcelizer(onabandon) && read2 != null) {
            onabandon.MediaBrowserCompat$ItemReceiver((commitContentChanged) null);
            read2.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(onAbandon<?> onabandon) {
        synchronized (this) {
            commitContentChanged read2 = onabandon.read();
            if (read2 == null) {
                return true;
            }
            if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(read2)) {
                return false;
            }
            this.write.MediaBrowserCompat$ItemReceiver.remove(onabandon);
            onabandon.MediaBrowserCompat$ItemReceiver((commitContentChanged) null);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final isReset IconCompatParcelizer() {
        isReset isreset;
        synchronized (this) {
            isreset = this.MediaSessionCompat$Token;
        }
        return isreset;
    }

    public String toString() {
        String obj;
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("{tracker=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", treeNode=");
            sb.append(this.MediaSessionCompat$QueueItem);
            sb.append("}");
            obj = sb.toString();
        }
        return obj;
    }

    /* renamed from: o.hashCode$write */
    class write implements loadInBackground.write {
        private final onDestroyView$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

        write(onDestroyView$MediaBrowserCompat$CustomActionResultReceiver ondestroyview_mediabrowsercompat_customactionresultreceiver) {
            this.IconCompatParcelizer = ondestroyview_mediabrowsercompat_customactionresultreceiver;
        }

        public final void read(boolean z) {
            if (z) {
                synchronized (hashCode.this) {
                    onDestroyView$MediaBrowserCompat$CustomActionResultReceiver ondestroyview_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
                    for (T t : LinearLayoutManager.write(ondestroyview_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver)) {
                        if (!t.MediaBrowserCompat$ItemReceiver() && !t.write()) {
                            t.MediaBrowserCompat$CustomActionResultReceiver();
                            if (!ondestroyview_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) {
                                t.read();
                            } else {
                                ondestroyview_mediabrowsercompat_customactionresultreceiver.read.add(t);
                            }
                        }
                    }
                }
            }
        }
    }

    public final getViewModelStore<Drawable> IconCompatParcelizer(Drawable drawable) {
        return new getViewModelStore(this.IconCompatParcelizer, this, Drawable.class, this.RatingCompat).IconCompatParcelizer(drawable);
    }

    public final getViewModelStore<Drawable> MediaBrowserCompat$ItemReceiver(String str) {
        getViewModelStore<Drawable> getviewmodelstore = new getViewModelStore<>(this.IconCompatParcelizer, this, Drawable.class, this.RatingCompat);
        getviewmodelstore.MediaBrowserCompat$ItemReceiver = str;
        getviewmodelstore.IconCompatParcelizer = true;
        return getviewmodelstore;
    }
}

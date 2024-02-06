package p040o;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.performDetach;
import p040o.setAccessibilityDelegateCompat;
import p040o.setClipToPadding;
import p040o.setOnCloseListener;

/* renamed from: o.performConfigurationChanged */
public final class performConfigurationChanged<R> implements C1412x63fe9c89<R>, setAccessibilityDelegateCompat.write {
    private static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer();
    private performOptionsMenuClosed<?> AlertController$RecycleListView;
    private final setClipToPadding AppCompatActivity;
    private boolean AppCompatDelegateImpl$ListMenuDecorView;
    private boolean AppCompatDialogFragment;
    performContextItemSelected<R> IconCompatParcelizer;
    private final setOnCloseListener.read<performConfigurationChanged<?>> Keep;
    final setAnimatingAway MediaBrowserCompat$CustomActionResultReceiver;
    final write MediaBrowserCompat$ItemReceiver;
    GlideException MediaBrowserCompat$MediaItem;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private boolean f2616x50fd9e4a;
    private final injectRttiCheckDeserializer MediaDescriptionCompat;
    private final setAnimatingAway MediaMetadataCompat;
    private boolean MediaSessionCompat$QueueItem;
    private boolean MediaSessionCompat$ResultReceiverWrapper;
    private volatile boolean MediaSessionCompat$Token;
    private isStateSaved ParcelableVolumeInfo;
    private final AtomicInteger PlaybackStateCompat;
    private final performDetach.write PlaybackStateCompat$CustomAction;
    public boolean RatingCompat;
    isPostponed read;
    private final setAnimatingAway setBackgroundResource;
    private final setAnimatingAway setHasDecor;
    performDetach<?> write;

    performConfigurationChanged(setAnimatingAway setanimatingaway, setAnimatingAway setanimatingaway2, setAnimatingAway setanimatingaway3, setAnimatingAway setanimatingaway4, injectRttiCheckDeserializer injectrtticheckdeserializer, performDetach.write write2, setOnCloseListener.read<performConfigurationChanged<?>> read2) {
        this(setanimatingaway, setanimatingaway2, setanimatingaway3, setanimatingaway4, injectrtticheckdeserializer, write2, read2, MediaBrowserCompat$SearchResultReceiver);
    }

    private performConfigurationChanged(setAnimatingAway setanimatingaway, setAnimatingAway setanimatingaway2, setAnimatingAway setanimatingaway3, setAnimatingAway setanimatingaway4, injectRttiCheckDeserializer injectrtticheckdeserializer, performDetach.write write2, setOnCloseListener.read<performConfigurationChanged<?>> read2, IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = new write();
        this.AppCompatActivity = new setClipToPadding.write();
        this.PlaybackStateCompat = new AtomicInteger();
        this.MediaBrowserCompat$CustomActionResultReceiver = setanimatingaway;
        this.setHasDecor = setanimatingaway2;
        this.setBackgroundResource = setanimatingaway3;
        this.MediaMetadataCompat = setanimatingaway4;
        this.MediaDescriptionCompat = injectrtticheckdeserializer;
        this.PlaybackStateCompat$CustomAction = write2;
        this.Keep = read2;
    }

    /* access modifiers changed from: package-private */
    public final performConfigurationChanged<R> read(isStateSaved isstatesaved, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (this) {
            this.ParcelableVolumeInfo = isstatesaved;
            this.MediaSessionCompat$QueueItem = z;
            this.AppCompatDialogFragment = z2;
            this.AppCompatDelegateImpl$ListMenuDecorView = z3;
            this.RatingCompat = z4;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(KtaJsonCheck ktaJsonCheck, Executor executor) {
        synchronized (this) {
            this.AppCompatActivity.write();
            this.MediaBrowserCompat$ItemReceiver.write.add(new performConfigurationChanged$MediaBrowserCompat$ItemReceiver(ktaJsonCheck, executor));
            if (this.MediaSessionCompat$ResultReceiverWrapper) {
                read(1);
                executor.execute(new read(ktaJsonCheck));
            } else if (this.f2616x50fd9e4a) {
                read(1);
                executor.execute(new C1410xadac082c(this, ktaJsonCheck));
            } else if (!(!this.MediaSessionCompat$Token)) {
                throw new IllegalArgumentException("Cannot add callbacks to a cancelled EngineJob");
            }
        }
    }

    public final void read(KtaJsonCheck ktaJsonCheck) {
        synchronized (this) {
            this.AppCompatActivity.write();
            this.MediaBrowserCompat$ItemReceiver.write.remove(new performConfigurationChanged$MediaBrowserCompat$ItemReceiver(ktaJsonCheck, AudioAttributesImplBaseParcelizer.MediaBrowserCompat$CustomActionResultReceiver()));
            if (this.MediaBrowserCompat$ItemReceiver.write.isEmpty()) {
                boolean z = false;
                if (!(this.f2616x50fd9e4a || this.MediaSessionCompat$ResultReceiverWrapper || this.MediaSessionCompat$Token)) {
                    this.MediaSessionCompat$Token = true;
                    performContextItemSelected<R> performcontextitemselected = this.IconCompatParcelizer;
                    performcontextitemselected.MediaDescriptionCompat = true;
                    onResume onresume = performcontextitemselected.MediaBrowserCompat$ItemReceiver;
                    if (onresume != null) {
                        onresume.read();
                    }
                    this.MediaDescriptionCompat.read(this, this.ParcelableVolumeInfo);
                }
                if (this.MediaSessionCompat$ResultReceiverWrapper || this.f2616x50fd9e4a) {
                    z = true;
                }
                if (z && this.PlaybackStateCompat.get() == 0) {
                    MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final setAnimatingAway IconCompatParcelizer() {
        if (this.AppCompatDialogFragment) {
            return this.setBackgroundResource;
        }
        return this.AppCompatDelegateImpl$ListMenuDecorView ? this.MediaMetadataCompat : this.setHasDecor;
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        performDetach<?> performdetach;
        synchronized (this) {
            this.AppCompatActivity.write();
            boolean z = false;
            if (this.f2616x50fd9e4a || this.MediaSessionCompat$ResultReceiverWrapper || this.MediaSessionCompat$Token) {
                int decrementAndGet = this.PlaybackStateCompat.decrementAndGet();
                if (decrementAndGet >= 0) {
                    z = true;
                }
                if (!z) {
                    throw new IllegalArgumentException("Can't decrement below 0");
                } else if (decrementAndGet == 0) {
                    performdetach = this.write;
                    MediaBrowserCompat$CustomActionResultReceiver();
                } else {
                    performdetach = null;
                }
            } else {
                throw new IllegalArgumentException("Not yet complete!");
            }
        }
        if (performdetach != null) {
            performdetach.MediaMetadataCompat();
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        synchronized (this) {
            if (this.ParcelableVolumeInfo != null) {
                this.MediaBrowserCompat$ItemReceiver.write.clear();
                this.ParcelableVolumeInfo = null;
                this.write = null;
                this.AlertController$RecycleListView = null;
                this.f2616x50fd9e4a = false;
                this.MediaSessionCompat$Token = false;
                this.MediaSessionCompat$ResultReceiverWrapper = false;
                performContextItemSelected<R> performcontextitemselected = this.IconCompatParcelizer;
                if (performcontextitemselected.PlaybackStateCompat$CustomAction.IconCompatParcelizer(false)) {
                    performcontextitemselected.write();
                }
                this.IconCompatParcelizer = null;
                this.MediaBrowserCompat$MediaItem = null;
                this.read = null;
                this.Keep.MediaBrowserCompat$CustomActionResultReceiver(this);
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r6.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(r6, r7, r8);
        r7 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        if (r7.hasNext() == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r8 = r7.next();
        r8.read.execute(new p040o.performConfigurationChanged.read(r6, r8.write));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
        write();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.performOptionsMenuClosed<R> r7, p040o.isPostponed r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.AlertController$RecycleListView = r7     // Catch:{ all -> 0x0092 }
            r6.read = r8     // Catch:{ all -> 0x0092 }
            monitor-exit(r6)
            monitor-enter(r6)
            o.setClipToPadding r7 = r6.AppCompatActivity     // Catch:{ all -> 0x008f }
            r7.write()     // Catch:{ all -> 0x008f }
            boolean r7 = r6.MediaSessionCompat$Token     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x001a
            o.performOptionsMenuClosed<?> r7 = r6.AlertController$RecycleListView     // Catch:{ all -> 0x008f }
            r7.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x008f }
            r6.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x008f }
            monitor-exit(r6)
            return
        L_0x001a:
            o.performConfigurationChanged$write r7 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x008f }
            java.util.List<o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver> r7 = r7.write     // Catch:{ all -> 0x008f }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x0087
            boolean r7 = r6.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x007f
            o.performOptionsMenuClosed<?> r1 = r6.AlertController$RecycleListView     // Catch:{ all -> 0x008f }
            boolean r2 = r6.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x008f }
            o.isStateSaved r4 = r6.ParcelableVolumeInfo     // Catch:{ all -> 0x008f }
            o.performDetach$write r5 = r6.PlaybackStateCompat$CustomAction     // Catch:{ all -> 0x008f }
            o.performDetach r7 = new o.performDetach     // Catch:{ all -> 0x008f }
            r3 = 1
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x008f }
            r6.write = r7     // Catch:{ all -> 0x008f }
            r7 = 1
            r6.MediaSessionCompat$ResultReceiverWrapper = r7     // Catch:{ all -> 0x008f }
            o.performConfigurationChanged$write r8 = r6.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x008f }
            o.performConfigurationChanged$write r0 = new o.performConfigurationChanged$write     // Catch:{ all -> 0x008f }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x008f }
            java.util.List<o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver> r8 = r8.write     // Catch:{ all -> 0x008f }
            r1.<init>(r8)     // Catch:{ all -> 0x008f }
            r0.<init>(r1)     // Catch:{ all -> 0x008f }
            java.util.List<o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver> r8 = r0.write     // Catch:{ all -> 0x008f }
            int r8 = r8.size()     // Catch:{ all -> 0x008f }
            int r8 = r8 + r7
            r6.read((int) r8)     // Catch:{ all -> 0x008f }
            o.isStateSaved r7 = r6.ParcelableVolumeInfo     // Catch:{ all -> 0x008f }
            o.performDetach<?> r8 = r6.write     // Catch:{ all -> 0x008f }
            monitor-exit(r6)
            o.injectRttiCheckDeserializer r1 = r6.MediaDescriptionCompat
            r1.MediaBrowserCompat$ItemReceiver(r6, r7, r8)
            java.util.Iterator r7 = r0.iterator()
        L_0x0062:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x007b
            java.lang.Object r8 = r7.next()
            o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver r8 = (p040o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver) r8
            java.util.concurrent.Executor r0 = r8.read
            o.performConfigurationChanged$read r1 = new o.performConfigurationChanged$read
            o.KtaJsonCheck r8 = r8.write
            r1.<init>(r8)
            r0.execute(r1)
            goto L_0x0062
        L_0x007b:
            r6.write()
            return
        L_0x007f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008f }
            java.lang.String r8 = "Already have resource"
            r7.<init>(r8)     // Catch:{ all -> 0x008f }
            throw r7     // Catch:{ all -> 0x008f }
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x008f }
            java.lang.String r8 = "Received a resource without any callbacks to notify"
            r7.<init>(r8)     // Catch:{ all -> 0x008f }
            throw r7     // Catch:{ all -> 0x008f }
        L_0x008f:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0092:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.performConfigurationChanged.IconCompatParcelizer(o.performOptionsMenuClosed, o.isPostponed):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        r4.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(r4, r0, (p040o.performDetach<?>) null);
        r5 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r5.hasNext() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r0 = r5.next();
        r0.read.execute(new p040o.C1410xadac082c(r4, r0.write));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        write();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(com.bumptech.glide.load.engine.GlideException r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.MediaBrowserCompat$MediaItem = r5     // Catch:{ all -> 0x0079 }
            monitor-exit(r4)
            monitor-enter(r4)
            o.setClipToPadding r5 = r4.AppCompatActivity     // Catch:{ all -> 0x0076 }
            r5.write()     // Catch:{ all -> 0x0076 }
            boolean r5 = r4.MediaSessionCompat$Token     // Catch:{ all -> 0x0076 }
            if (r5 == 0) goto L_0x0013
            r4.MediaBrowserCompat$CustomActionResultReceiver()     // Catch:{ all -> 0x0076 }
            monitor-exit(r4)
            return
        L_0x0013:
            o.performConfigurationChanged$write r5 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0076 }
            java.util.List<o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver> r5 = r5.write     // Catch:{ all -> 0x0076 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0076 }
            if (r5 != 0) goto L_0x006e
            boolean r5 = r4.f2616x50fd9e4a     // Catch:{ all -> 0x0076 }
            if (r5 != 0) goto L_0x0066
            r5 = 1
            r4.f2616x50fd9e4a = r5     // Catch:{ all -> 0x0076 }
            o.isStateSaved r0 = r4.ParcelableVolumeInfo     // Catch:{ all -> 0x0076 }
            o.performConfigurationChanged$write r1 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0076 }
            o.performConfigurationChanged$write r2 = new o.performConfigurationChanged$write     // Catch:{ all -> 0x0076 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0076 }
            java.util.List<o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver> r1 = r1.write     // Catch:{ all -> 0x0076 }
            r3.<init>(r1)     // Catch:{ all -> 0x0076 }
            r2.<init>(r3)     // Catch:{ all -> 0x0076 }
            java.util.List<o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver> r1 = r2.write     // Catch:{ all -> 0x0076 }
            int r1 = r1.size()     // Catch:{ all -> 0x0076 }
            int r1 = r1 + r5
            r4.read((int) r1)     // Catch:{ all -> 0x0076 }
            monitor-exit(r4)
            o.injectRttiCheckDeserializer r5 = r4.MediaDescriptionCompat
            r1 = 0
            r5.MediaBrowserCompat$ItemReceiver(r4, r0, r1)
            java.util.Iterator r5 = r2.iterator()
        L_0x0049:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r5.next()
            o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver r0 = (p040o.performConfigurationChanged$MediaBrowserCompat$ItemReceiver) r0
            java.util.concurrent.Executor r1 = r0.read
            o.performConfigurationChanged$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.performConfigurationChanged$MediaBrowserCompat$CustomActionResultReceiver
            o.KtaJsonCheck r0 = r0.write
            r2.<init>(r4, r0)
            r1.execute(r2)
            goto L_0x0049
        L_0x0062:
            r4.write()
            return
        L_0x0066:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = "Already failed once"
            r5.<init>(r0)     // Catch:{ all -> 0x0076 }
            throw r5     // Catch:{ all -> 0x0076 }
        L_0x006e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = "Received an exception without any callbacks to notify"
            r5.<init>(r0)     // Catch:{ all -> 0x0076 }
            throw r5     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x0079:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.performConfigurationChanged.IconCompatParcelizer(com.bumptech.glide.load.engine.GlideException):void");
    }

    public final void IconCompatParcelizer(performContextItemSelected<?> performcontextitemselected) {
        IconCompatParcelizer().execute(performcontextitemselected);
    }

    public final setClipToPadding MediaBrowserCompat$ItemReceiver() {
        return this.AppCompatActivity;
    }

    /* renamed from: o.performConfigurationChanged$read */
    class read implements Runnable {
        private final KtaJsonCheck IconCompatParcelizer;

        read(KtaJsonCheck ktaJsonCheck) {
            this.IconCompatParcelizer = ktaJsonCheck;
        }

        public final void run() {
            synchronized (this.IconCompatParcelizer.RatingCompat()) {
                synchronized (performConfigurationChanged.this) {
                    if (performConfigurationChanged.this.MediaBrowserCompat$ItemReceiver.write.contains(new performConfigurationChanged$MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, AudioAttributesImplBaseParcelizer.MediaBrowserCompat$CustomActionResultReceiver()))) {
                        performConfigurationChanged.this.write.MediaBrowserCompat$ItemReceiver();
                        performConfigurationChanged performconfigurationchanged = performConfigurationChanged.this;
                        try {
                            this.IconCompatParcelizer.read(performconfigurationchanged.write, performconfigurationchanged.read);
                            performConfigurationChanged.this.read(this.IconCompatParcelizer);
                        } catch (Throwable th) {
                            throw new onOptionsMenuClosed(th);
                        }
                    }
                    performConfigurationChanged.this.write();
                }
            }
        }
    }

    /* renamed from: o.performConfigurationChanged$write */
    static final class write implements Iterable<performConfigurationChanged$MediaBrowserCompat$ItemReceiver> {
        final List<performConfigurationChanged$MediaBrowserCompat$ItemReceiver> write;

        write() {
            this(new ArrayList(2));
        }

        write(List<performConfigurationChanged$MediaBrowserCompat$ItemReceiver> list) {
            this.write = list;
        }

        public final Iterator<performConfigurationChanged$MediaBrowserCompat$ItemReceiver> iterator() {
            return this.write.iterator();
        }
    }

    /* renamed from: o.performConfigurationChanged$IconCompatParcelizer */
    static class IconCompatParcelizer {
        IconCompatParcelizer() {
        }
    }

    private void read(int i) {
        synchronized (this) {
            if (!(this.f2616x50fd9e4a || this.MediaSessionCompat$ResultReceiverWrapper || this.MediaSessionCompat$Token)) {
                throw new IllegalArgumentException("Not yet complete!");
            } else if (this.PlaybackStateCompat.getAndAdd(i) == 0 && this.write != null) {
                this.write.MediaBrowserCompat$ItemReceiver();
            }
        }
    }
}

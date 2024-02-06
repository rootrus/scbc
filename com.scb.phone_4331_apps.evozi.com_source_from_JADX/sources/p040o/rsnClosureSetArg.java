package p040o;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p040o.IdCaptureBackActivity_MembersInjector;

/* renamed from: o.rsnClosureSetArg */
public final class rsnClosureSetArg<T extends IdCaptureBackActivity_MembersInjector> implements rsnClosureSetGlobal<T> {
    private final setSupportAllCaps<Integer, Set<? extends rsnClosureCreate<T>>> MediaBrowserCompat$CustomActionResultReceiver = new setSupportAllCaps<>(5);
    private final ReadWriteLock read = new ReentrantReadWriteLock();
    private final rsnClosureSetGlobal<T> write;

    public rsnClosureSetArg(rsnClosureSetGlobal<T> rsnclosuresetglobal) {
        this.write = rsnclosuresetglobal;
    }

    public final void IconCompatParcelizer(Collection<T> collection) {
        this.write.IconCompatParcelizer(collection);
        this.MediaBrowserCompat$CustomActionResultReceiver.evictAll();
    }

    public final void read() {
        this.write.read();
        this.MediaBrowserCompat$CustomActionResultReceiver.evictAll();
    }

    public final Set<? extends rsnClosureCreate<T>> MediaBrowserCompat$CustomActionResultReceiver(double d) {
        int i = (int) d;
        Set<? extends rsnClosureCreate<T>> IconCompatParcelizer = IconCompatParcelizer(i);
        int i2 = i + 1;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i2)) == null) {
            new Thread(new rsnClosureSetArg$MediaBrowserCompat$ItemReceiver(this, i2)).start();
        }
        int i3 = i - 1;
        if (this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i3)) == null) {
            new Thread(new rsnClosureSetArg$MediaBrowserCompat$ItemReceiver(this, i3)).start();
        }
        return IconCompatParcelizer;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    public final Set<? extends rsnClosureCreate<T>> IconCompatParcelizer(int i) {
        this.read.readLock().lock();
        Set<? extends rsnClosureCreate<T>> set = this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
        this.read.readLock().unlock();
        if (set == null) {
            this.read.writeLock().lock();
            set = this.MediaBrowserCompat$CustomActionResultReceiver.get(Integer.valueOf(i));
            if (set == null) {
                set = this.write.MediaBrowserCompat$CustomActionResultReceiver((double) i);
                this.MediaBrowserCompat$CustomActionResultReceiver.put(Integer.valueOf(i), set);
            }
            this.read.writeLock().unlock();
        }
        return set;
    }
}

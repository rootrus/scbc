package p040o;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.CameraApi2$CameraHardwareNotSupportException;
import p040o.CameraSource;
import p043rx.exceptions.OnErrorThrowable;

/* renamed from: o.setDynamicIcons */
public final class setDynamicIcons extends CameraApi2$CameraHardwareNotSupportException implements CustomInformationList_ViewBinding {
    static final write IconCompatParcelizer;
    private static final TimeUnit read = TimeUnit.SECONDS;
    private static IconCompatParcelizer write;
    private AtomicReference<IconCompatParcelizer> MediaBrowserCompat$CustomActionResultReceiver = new AtomicReference<>(write);
    private ThreadFactory MediaBrowserCompat$ItemReceiver;

    static {
        write write2 = new write(setDrawableBitmap.MediaBrowserCompat$ItemReceiver);
        IconCompatParcelizer = write2;
        write2.write = true;
        write2.MediaBrowserCompat$ItemReceiver.shutdownNow();
        setSelectedTextView.read(write2.MediaBrowserCompat$ItemReceiver);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer((ThreadFactory) null, 0, (TimeUnit) null);
        write = iconCompatParcelizer;
        iconCompatParcelizer.write();
    }

    /* renamed from: o.setDynamicIcons$default  reason: invalid class name */
    public final class Cdefault<T> implements CameraSource.CameraSourceException.IconCompatParcelizer<Boolean, T> {
        final setInnerColors<? super T, Boolean> read;
        final boolean write = true;

        public final /* synthetic */ Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            final CustomCheckboxGroupView_ViewBinding customCheckboxGroupView_ViewBinding = (CustomCheckboxGroupView_ViewBinding) obj;
            final setContainer setcontainer = new setContainer(customCheckboxGroupView_ViewBinding);
            C74565 r1 = new CustomCheckboxGroupView_ViewBinding<T>() {
                private boolean MediaBrowserCompat$ItemReceiver;
                private boolean write;

                public final void IconCompatParcelizer(T t) {
                    this.MediaBrowserCompat$ItemReceiver = true;
                    try {
                        if (Cdefault.this.read.MediaBrowserCompat$CustomActionResultReceiver(t).booleanValue() && !this.write) {
                            this.write = true;
                            setcontainer.MediaBrowserCompat$ItemReceiver(Boolean.FALSE);
                            write();
                        }
                    } catch (Throwable th) {
                        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(th);
                        IconCompatParcelizer(OnErrorThrowable.write(th, t));
                    }
                }

                public final void IconCompatParcelizer(Throwable th) {
                    customCheckboxGroupView_ViewBinding.IconCompatParcelizer(th);
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver() {
                    if (!this.write) {
                        this.write = true;
                        if (this.MediaBrowserCompat$ItemReceiver) {
                            setcontainer.MediaBrowserCompat$ItemReceiver(Boolean.FALSE);
                        } else {
                            setcontainer.MediaBrowserCompat$ItemReceiver(Boolean.TRUE);
                        }
                    }
                }
            };
            customCheckboxGroupView_ViewBinding.read.MediaBrowserCompat$ItemReceiver(r1);
            customCheckboxGroupView_ViewBinding.write(setcontainer);
            return r1;
        }

        public Cdefault(setInnerColors<? super T, Boolean> setinnercolors) {
            this.read = setinnercolors;
        }
    }

    /* renamed from: o.setDynamicIcons$IconCompatParcelizer */
    static final class IconCompatParcelizer implements Runnable {
        private final ScheduledExecutorService IconCompatParcelizer;
        final long MediaBrowserCompat$CustomActionResultReceiver;
        final ConcurrentLinkedQueue<write> MediaBrowserCompat$ItemReceiver;
        private final ThreadFactory MediaBrowserCompat$SearchResultReceiver;
        private setIconBottom read;
        private final Future<?> write;

        IconCompatParcelizer(final ThreadFactory threadFactory, long j, TimeUnit timeUnit) {
            ScheduledFuture<?> scheduledFuture;
            this.MediaBrowserCompat$SearchResultReceiver = threadFactory;
            this.MediaBrowserCompat$CustomActionResultReceiver = timeUnit != null ? timeUnit.toNanos(j) : 0;
            this.MediaBrowserCompat$ItemReceiver = new ConcurrentLinkedQueue<>();
            this.read = new setIconBottom();
            ScheduledExecutorService scheduledExecutorService = null;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, new ThreadFactory() {
                    public final Thread newThread(Runnable runnable) {
                        Thread newThread = threadFactory.newThread(runnable);
                        StringBuilder sb = new StringBuilder();
                        sb.append(newThread.getName());
                        sb.append(" (Evictor)");
                        newThread.setName(sb.toString());
                        return newThread;
                    }
                });
                setSelectedTextView.IconCompatParcelizer(scheduledExecutorService);
                long j2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, j2, j2, TimeUnit.NANOSECONDS);
            } else {
                scheduledFuture = null;
            }
            this.IconCompatParcelizer = scheduledExecutorService;
            this.write = scheduledFuture;
        }

        /* access modifiers changed from: package-private */
        public final write read() {
            if (this.read.MediaBrowserCompat$ItemReceiver) {
                return setDynamicIcons.IconCompatParcelizer;
            }
            while (!this.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                write poll = this.MediaBrowserCompat$ItemReceiver.poll();
                if (poll != null) {
                    return poll;
                }
            }
            write write2 = new write(this.MediaBrowserCompat$SearchResultReceiver);
            this.read.MediaBrowserCompat$ItemReceiver(write2);
            return write2;
        }

        /* access modifiers changed from: package-private */
        public final void write() {
            try {
                if (this.write != null) {
                    this.write.cancel(true);
                }
                if (this.IconCompatParcelizer != null) {
                    this.IconCompatParcelizer.shutdownNow();
                }
            } finally {
                this.read.write();
            }
        }

        public final void run() {
            if (!this.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<write> it = this.MediaBrowserCompat$ItemReceiver.iterator();
                while (it.hasNext()) {
                    write next = it.next();
                    if (next.read > nanoTime) {
                        return;
                    }
                    if (this.MediaBrowserCompat$ItemReceiver.remove(next)) {
                        this.read.read((CustomDoubleCircleBorderView) next);
                    }
                }
            }
        }
    }

    public setDynamicIcons(ThreadFactory threadFactory) {
        this.MediaBrowserCompat$ItemReceiver = threadFactory;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, 60, read);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(write, iconCompatParcelizer)) {
            iconCompatParcelizer.write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        IconCompatParcelizer iconCompatParcelizer;
        IconCompatParcelizer iconCompatParcelizer2;
        do {
            iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.get();
            iconCompatParcelizer2 = write;
            if (iconCompatParcelizer == iconCompatParcelizer2) {
                return;
            }
        } while (!this.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(iconCompatParcelizer, iconCompatParcelizer2));
        iconCompatParcelizer.write();
    }

    public final CameraApi2$CameraHardwareNotSupportException.write IconCompatParcelizer() {
        return new setDynamicIcons$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.get());
    }

    /* renamed from: o.setDynamicIcons$write */
    static final class write extends setSelectedTextView {
        long read = 0;

        write(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}

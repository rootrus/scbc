package p040o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p040o.BankingAgentDeepLinkActivity;

/* renamed from: o.onButtonSettingsClick */
public final class onButtonSettingsClick extends BankingAgentDeepLinkActivity {
    private static write MediaBrowserCompat$CustomActionResultReceiver;
    private static onCheckboxChanged MediaBrowserCompat$ItemReceiver;
    static final IconCompatParcelizer read;
    private static int write;
    private AtomicReference<write> MediaBrowserCompat$MediaItem;
    private ThreadFactory MediaDescriptionCompat;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx2.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        write = availableProcessors;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(new onCheckboxChanged("RxComputationShutdown"));
        read = iconCompatParcelizer;
        iconCompatParcelizer.dispose();
        onCheckboxChanged oncheckboxchanged = new onCheckboxChanged("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        MediaBrowserCompat$ItemReceiver = oncheckboxchanged;
        write write2 = new write(0, oncheckboxchanged);
        MediaBrowserCompat$CustomActionResultReceiver = write2;
        for (IconCompatParcelizer dispose : write2.MediaBrowserCompat$ItemReceiver) {
            dispose.dispose();
        }
    }

    /* renamed from: o.onButtonSettingsClick$write */
    static final class write {
        private long IconCompatParcelizer;
        private int MediaBrowserCompat$CustomActionResultReceiver;
        final IconCompatParcelizer[] MediaBrowserCompat$ItemReceiver;

        write(int i, ThreadFactory threadFactory) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.MediaBrowserCompat$ItemReceiver[i2] = new IconCompatParcelizer(threadFactory);
            }
        }

        public final IconCompatParcelizer write() {
            int i = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i == 0) {
                return onButtonSettingsClick.read;
            }
            IconCompatParcelizer[] iconCompatParcelizerArr = this.MediaBrowserCompat$ItemReceiver;
            long j = this.IconCompatParcelizer;
            this.IconCompatParcelizer = 1 + j;
            return iconCompatParcelizerArr[(int) (j % ((long) i))];
        }
    }

    public onButtonSettingsClick() {
        this(MediaBrowserCompat$ItemReceiver);
    }

    private onButtonSettingsClick(ThreadFactory threadFactory) {
        this.MediaDescriptionCompat = threadFactory;
        this.MediaBrowserCompat$MediaItem = new AtomicReference<>(MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final BankingAgentDeepLinkActivity.read write() {
        return new onButtonSettingsClick$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem.get().write());
    }

    public final BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.MediaBrowserCompat$MediaItem.get().write().write(runnable, j, timeUnit);
    }

    public final BulkTransferDeepLinkActivity write(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return this.MediaBrowserCompat$MediaItem.get().write().MediaBrowserCompat$CustomActionResultReceiver(runnable, j, j2, timeUnit);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        write write2 = new write(write, this.MediaDescriptionCompat);
        if (!this.MediaBrowserCompat$MediaItem.compareAndSet(MediaBrowserCompat$CustomActionResultReceiver, write2)) {
            for (IconCompatParcelizer dispose : write2.MediaBrowserCompat$ItemReceiver) {
                dispose.dispose();
            }
        }
    }

    /* renamed from: o.onButtonSettingsClick$IconCompatParcelizer */
    static final class IconCompatParcelizer extends onBtnAcceptClicked {
        IconCompatParcelizer(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }
}

package p040o;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: o.onCheckboxChanged */
public final class onCheckboxChanged extends AtomicLong implements ThreadFactory {
    private int IconCompatParcelizer;
    private boolean MediaBrowserCompat$ItemReceiver;
    private String write;

    public onCheckboxChanged(String str) {
        this(str, 5, false);
    }

    public onCheckboxChanged(String str, int i) {
        this(str, i, false);
    }

    public onCheckboxChanged(String str, int i, boolean z) {
        this.write = str;
        this.IconCompatParcelizer = i;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder sb = new StringBuilder(this.write);
        sb.append('-');
        sb.append(incrementAndGet());
        String obj = sb.toString();
        Thread iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver ? new IconCompatParcelizer(runnable, obj) : new Thread(runnable, obj);
        iconCompatParcelizer.setPriority(this.IconCompatParcelizer);
        iconCompatParcelizer.setDaemon(true);
        return iconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RxThreadFactory[");
        sb.append(this.write);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: o.onCheckboxChanged$IconCompatParcelizer */
    static final class IconCompatParcelizer extends Thread {
        IconCompatParcelizer(Runnable runnable, String str) {
            super(runnable, str);
        }
    }
}

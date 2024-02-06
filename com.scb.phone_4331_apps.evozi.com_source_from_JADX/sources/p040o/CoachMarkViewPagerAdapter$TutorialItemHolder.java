package p040o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.CoachMarkViewPagerAdapter$TutorialItemHolder */
public abstract class CoachMarkViewPagerAdapter$TutorialItemHolder<T, C> {
    public long IconCompatParcelizer = Long.MAX_VALUE;
    public final C MediaBrowserCompat$CustomActionResultReceiver;
    public final long MediaBrowserCompat$MediaItem = Long.MAX_VALUE;
    public volatile Object MediaMetadataCompat;
    private final String read;
    public final T write;

    public CoachMarkViewPagerAdapter$TutorialItemHolder(String str, T t, C c, long j, TimeUnit timeUnit) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(t, "Route");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(c, "Connection");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(timeUnit, "Time unit");
        this.read = str;
        this.write = t;
        this.MediaBrowserCompat$CustomActionResultReceiver = c;
        System.currentTimeMillis();
    }

    public final long read() {
        long j;
        synchronized (this) {
            j = this.IconCompatParcelizer;
        }
        return j;
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(long j) {
        boolean z;
        synchronized (this) {
            z = j >= this.IconCompatParcelizer;
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[id:");
        sb.append(this.read);
        sb.append("][route:");
        sb.append(this.write);
        sb.append("][state:");
        sb.append(this.MediaMetadataCompat);
        sb.append("]");
        return sb.toString();
    }
}

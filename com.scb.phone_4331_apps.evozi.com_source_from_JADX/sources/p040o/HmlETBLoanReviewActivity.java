package p040o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.HmlETBLoanReviewActivity */
public final class HmlETBLoanReviewActivity<T> {
    private TimeUnit MediaBrowserCompat$CustomActionResultReceiver;
    public final long MediaBrowserCompat$ItemReceiver;
    public final T read;

    public HmlETBLoanReviewActivity(T t, long j, TimeUnit timeUnit) {
        this.read = t;
        this.MediaBrowserCompat$ItemReceiver = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = (TimeUnit) HmlLatestPersonalInformationDeepLinkActivity.write(timeUnit, "unit is null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HmlETBLoanReviewActivity)) {
            return false;
        }
        HmlETBLoanReviewActivity hmlETBLoanReviewActivity = (HmlETBLoanReviewActivity) obj;
        if (!HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) hmlETBLoanReviewActivity.read) || this.MediaBrowserCompat$ItemReceiver != hmlETBLoanReviewActivity.MediaBrowserCompat$ItemReceiver || !HmlLatestPersonalInformationDeepLinkActivity.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) hmlETBLoanReviewActivity.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        T t = this.read;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.MediaBrowserCompat$ItemReceiver;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Timed[time=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", unit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", value=");
        sb.append(this.read);
        sb.append("]");
        return sb.toString();
    }
}

package p040o;

/* renamed from: o.HmlNTBeKYCLandingActivity */
public final class HmlNTBeKYCLandingActivity<T> {
    public final T IconCompatParcelizer;
    public final int MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HmlNTBeKYCLandingActivity)) {
            return false;
        }
        HmlNTBeKYCLandingActivity hmlNTBeKYCLandingActivity = (HmlNTBeKYCLandingActivity) obj;
        return this.MediaBrowserCompat$ItemReceiver == hmlNTBeKYCLandingActivity.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) hmlNTBeKYCLandingActivity.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        T t = this.IconCompatParcelizer;
        return (i * 31) + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IndexedValue(index=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", value=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public HmlNTBeKYCLandingActivity(int i, T t) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.IconCompatParcelizer = t;
    }
}

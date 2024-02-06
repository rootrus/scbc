package p040o;

/* renamed from: o.ChubbReviewActivity */
public final class ChubbReviewActivity {
    public final int MediaBrowserCompat$ItemReceiver;
    public final int write;

    public ChubbReviewActivity(int i, int i2) {
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChubbReviewActivity)) {
            return false;
        }
        ChubbReviewActivity chubbReviewActivity = (ChubbReviewActivity) obj;
        return this.MediaBrowserCompat$ItemReceiver == chubbReviewActivity.MediaBrowserCompat$ItemReceiver && this.write == chubbReviewActivity.write;
    }

    public final int hashCode() {
        int i = this.write;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        return i ^ ((i2 << 16) | (i2 >>> 16));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("x");
        sb.append(this.write);
        return sb.toString();
    }
}

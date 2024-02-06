package p040o;

import java.io.Serializable;

/* renamed from: o.HmlVerifyEmailSuccessfulActivity */
public final class HmlVerifyEmailSuccessfulActivity<A, B> implements Serializable {
    public final A MediaBrowserCompat$CustomActionResultReceiver;
    public final B write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HmlVerifyEmailSuccessfulActivity)) {
            return false;
        }
        HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) hmlVerifyEmailSuccessfulActivity.write);
    }

    public final int hashCode() {
        A a = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = a != null ? a.hashCode() : 0;
        B b = this.write;
        if (b != null) {
            i = b.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public HmlVerifyEmailSuccessfulActivity(A a, B b) {
        this.MediaBrowserCompat$CustomActionResultReceiver = a;
        this.write = b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}

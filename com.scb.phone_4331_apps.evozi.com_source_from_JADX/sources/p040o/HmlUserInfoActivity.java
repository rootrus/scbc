package p040o;

import java.io.Serializable;

/* renamed from: o.HmlUserInfoActivity */
public final class HmlUserInfoActivity<T> implements HmlVerifyEmailActivity<T>, Serializable {
    private final T MediaBrowserCompat$CustomActionResultReceiver;

    public HmlUserInfoActivity(T t) {
        this.MediaBrowserCompat$CustomActionResultReceiver = t;
    }

    public final T MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        return String.valueOf(MediaBrowserCompat$CustomActionResultReceiver());
    }
}

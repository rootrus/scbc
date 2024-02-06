package p040o;

import java.lang.Comparable;
import p040o.NtbOpenAccountLandingActivity;

/* renamed from: o.NTBPartnerWebViewActivity */
public class NTBPartnerWebViewActivity<T extends NtbOpenAccountLandingActivity & Comparable<? super T>> {
    public T[] MediaBrowserCompat$CustomActionResultReceiver;
    public volatile int _size = 0;

    public final T MediaBrowserCompat$ItemReceiver(int i) {
        boolean z = false;
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(this._size > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (tArr == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        this._size--;
        if (i < this._size) {
            MediaBrowserCompat$CustomActionResultReceiver(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                if (t == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                Comparable comparable = (Comparable) t;
                T t2 = tArr[i2];
                if (t2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (comparable.compareTo(t2) < 0) {
                    MediaBrowserCompat$CustomActionResultReceiver(i, i2);
                    read(i2);
                }
            }
            MediaBrowserCompat$CustomActionResultReceiver(i);
        }
        T t3 = tArr[this._size];
        if (t3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        if (MwChangeCasaSuccessActivity.write()) {
            if (t3.read() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.IconCompatParcelizer((NTBPartnerWebViewActivity<?>) null);
        t3.MediaBrowserCompat$CustomActionResultReceiver(-1);
        tArr[this._size] = null;
        return t3;
    }

    public final void read(int i) {
        while (i > 0) {
            T[] tArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (tArr == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            if (t == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i];
            if (t2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            if (comparable.compareTo(t2) > 0) {
                MediaBrowserCompat$CustomActionResultReceiver(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        T[] tArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (tArr == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        T t = tArr[i2];
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        T t2 = tArr[i];
        if (t2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        tArr[i] = t;
        tArr[i2] = t2;
        t.MediaBrowserCompat$CustomActionResultReceiver(i);
        t2.MediaBrowserCompat$CustomActionResultReceiver(i2);
    }

    public final T read() {
        T t;
        synchronized (this) {
            T[] tArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            t = tArr != null ? tArr[0] : null;
        }
        return t;
    }

    public final T write() {
        T MediaBrowserCompat$ItemReceiver;
        synchronized (this) {
            MediaBrowserCompat$ItemReceiver = this._size > 0 ? MediaBrowserCompat$ItemReceiver(0) : null;
        }
        return MediaBrowserCompat$ItemReceiver;
    }

    public final boolean IconCompatParcelizer(T t) {
        boolean z;
        onGetStartedClick.write((Object) t, "node");
        synchronized (this) {
            z = false;
            if (t.read() != null) {
                int MediaBrowserCompat$ItemReceiver = t.MediaBrowserCompat$ItemReceiver();
                if (MwChangeCasaSuccessActivity.write()) {
                    if (MediaBrowserCompat$ItemReceiver >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
                z = true;
            }
        }
        return z;
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        while (true) {
            int i2 = (i << 1) + 1;
            if (i2 < this._size) {
                T[] tArr = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (tArr == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                int i3 = i2 + 1;
                if (i3 < this._size) {
                    T t = tArr[i3];
                    if (t == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    if (comparable.compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                if (t3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i2];
                if (t4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (comparable2.compareTo(t4) > 0) {
                    MediaBrowserCompat$CustomActionResultReceiver(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}

package p040o;

import android.text.TextUtils;
import java.security.MessageDigest;

/* renamed from: o.noteStateNotSaved */
public final class noteStateNotSaved<T> {
    private static final noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<Object> MediaBrowserCompat$ItemReceiver = new noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<Object>() {
        public final void write(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    };
    final String IconCompatParcelizer;
    final noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<T> MediaBrowserCompat$CustomActionResultReceiver;
    public final T read;
    volatile byte[] write;

    public static <T> noteStateNotSaved<T> read(String str) {
        return new noteStateNotSaved<>(str, (Object) null, MediaBrowserCompat$ItemReceiver);
    }

    public static <T> noteStateNotSaved<T> MediaBrowserCompat$CustomActionResultReceiver(String str, T t) {
        return new noteStateNotSaved<>(str, t, MediaBrowserCompat$ItemReceiver);
    }

    public static <T> noteStateNotSaved<T> read(String str, T t, noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<T> notestatenotsaved_mediabrowsercompat_customactionresultreceiver) {
        return new noteStateNotSaved<>(str, t, notestatenotsaved_mediabrowsercompat_customactionresultreceiver);
    }

    private noteStateNotSaved(String str, T t, noteStateNotSaved$MediaBrowserCompat$CustomActionResultReceiver<T> notestatenotsaved_mediabrowsercompat_customactionresultreceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.IconCompatParcelizer = str;
            this.read = t;
            if (notestatenotsaved_mediabrowsercompat_customactionresultreceiver != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = notestatenotsaved_mediabrowsercompat_customactionresultreceiver;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof noteStateNotSaved) {
            return this.IconCompatParcelizer.equals(((noteStateNotSaved) obj).IconCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{key='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

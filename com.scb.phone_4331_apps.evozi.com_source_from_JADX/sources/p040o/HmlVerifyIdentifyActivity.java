package p040o;

import java.io.Serializable;

/* renamed from: o.HmlVerifyIdentifyActivity */
public final class HmlVerifyIdentifyActivity<T> implements Serializable {
    public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer((byte) 0);

    public static Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        return obj;
    }

    public final int hashCode() {
        return 0;
    }

    public static final boolean write(Object obj) {
        return !(obj instanceof write);
    }

    public static final boolean MediaBrowserCompat$ItemReceiver(Object obj) {
        return obj instanceof write;
    }

    public static final Throwable IconCompatParcelizer(Object obj) {
        if (obj instanceof write) {
            return ((write) obj).read;
        }
        return null;
    }

    /* renamed from: o.HmlVerifyIdentifyActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* renamed from: o.HmlVerifyIdentifyActivity$write */
    public static final class write implements Serializable {
        public final Throwable read;

        public write(Throwable th) {
            onGetStartedClick.write((Object) th, "exception");
            this.read = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((write) obj).read);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(");
            sb.append(this.read);
            sb.append(')');
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof HmlVerifyIdentifyActivity) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) null, (Object) null);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Success(");
        sb.append((Object) null);
        sb.append(')');
        return sb.toString();
    }
}

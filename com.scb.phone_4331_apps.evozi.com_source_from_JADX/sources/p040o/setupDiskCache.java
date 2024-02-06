package p040o;

import java.util.Arrays;
import p040o.rsnSystemGetPointerSize;

/* renamed from: o.setupDiskCache */
final class setupDiskCache extends rsnSystemGetPointerSize {
    private final byte[] MediaBrowserCompat$CustomActionResultReceiver;
    private final Iterable<loadProjectionNormalized> write;

    /* synthetic */ setupDiskCache(Iterable iterable, byte[] bArr, byte b) {
        this(iterable, bArr);
    }

    private setupDiskCache(Iterable<loadProjectionNormalized> iterable, byte[] bArr) {
        this.write = iterable;
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr;
    }

    public final Iterable<loadProjectionNormalized> write() {
        return this.write;
    }

    public final byte[] read() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BackendRequest{events=");
        sb.append(this.write);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.MediaBrowserCompat$CustomActionResultReceiver));
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rsnSystemGetPointerSize)) {
            return false;
        }
        rsnSystemGetPointerSize rsnsystemgetpointersize = (rsnSystemGetPointerSize) obj;
        if (this.write.equals(rsnsystemgetpointersize.write())) {
            if (Arrays.equals(this.MediaBrowserCompat$CustomActionResultReceiver, rsnsystemgetpointersize instanceof setupDiskCache ? ((setupDiskCache) rsnsystemgetpointersize).MediaBrowserCompat$CustomActionResultReceiver : rsnsystemgetpointersize.read())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.write.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.setupDiskCache$read */
    public static final class read extends rsnSystemGetPointerSize.write {
        private byte[] IconCompatParcelizer;
        private Iterable<loadProjectionNormalized> write;

        public final rsnSystemGetPointerSize.write read(Iterable<loadProjectionNormalized> iterable) {
            this.write = iterable;
            return this;
        }

        public final rsnSystemGetPointerSize.write MediaBrowserCompat$ItemReceiver(byte[] bArr) {
            this.IconCompatParcelizer = bArr;
            return this;
        }

        public final rsnSystemGetPointerSize MediaBrowserCompat$CustomActionResultReceiver() {
            String str;
            if (this.write == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" events");
                str = sb.toString();
            } else {
                str = "";
            }
            if (str.isEmpty()) {
                return new setupDiskCache(this.write, this.IconCompatParcelizer, (byte) 0);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }
    }
}

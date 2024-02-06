package p040o;

import java.util.Set;
import p040o.nAllocationCreateFromBitmap;

/* renamed from: o.nAllocationCreateFromAssetStream */
final class nAllocationCreateFromAssetStream extends nAllocationCreateFromBitmap.write {
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    private final long MediaBrowserCompat$ItemReceiver;
    private final Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> write;

    /* synthetic */ nAllocationCreateFromAssetStream(long j, long j2, Set set, byte b) {
        this(j, j2, set);
    }

    private nAllocationCreateFromAssetStream(long j, long j2, Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> set) {
        this.MediaBrowserCompat$ItemReceiver = j;
        this.MediaBrowserCompat$CustomActionResultReceiver = j2;
        this.write = set;
    }

    /* access modifiers changed from: package-private */
    public final long IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final long write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: package-private */
    public final Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> read() {
        return this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ConfigValue{delta=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", maxAllowedDelay=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", flags=");
        sb.append(this.write);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nAllocationCreateFromBitmap.write)) {
            return false;
        }
        nAllocationCreateFromBitmap.write write2 = (nAllocationCreateFromBitmap.write) obj;
        if (this.MediaBrowserCompat$ItemReceiver == write2.IconCompatParcelizer() && this.MediaBrowserCompat$CustomActionResultReceiver == write2.write() && this.write.equals(write2.read())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.MediaBrowserCompat$ItemReceiver;
        long j2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.write.hashCode();
    }

    /* renamed from: o.nAllocationCreateFromAssetStream$write */
    public static final class write extends C7268x86142dba {
        private Long MediaBrowserCompat$CustomActionResultReceiver;
        public Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> read;
        private Long write;

        public final C7268x86142dba IconCompatParcelizer(long j) {
            this.MediaBrowserCompat$CustomActionResultReceiver = Long.valueOf(j);
            return this;
        }

        public final C7268x86142dba write() {
            this.write = 86400000L;
            return this;
        }

        public final C7268x86142dba MediaBrowserCompat$CustomActionResultReceiver(Set<nAllocationCreateFromBitmap$MediaBrowserCompat$ItemReceiver> set) {
            if (set != null) {
                this.read = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public final nAllocationCreateFromBitmap.write MediaBrowserCompat$CustomActionResultReceiver() {
            String str;
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" delta");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.write == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" maxAllowedDelay");
                str = sb2.toString();
            }
            if (this.read == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" flags");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new nAllocationCreateFromAssetStream(this.MediaBrowserCompat$CustomActionResultReceiver.longValue(), this.write.longValue(), this.read, (byte) 0);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }
}

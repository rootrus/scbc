package p040o;

import org.bouncycastle.asn1.x509.DisplayText;
import p040o.nAllocationData3D;

/* renamed from: o.nAllocationData1D */
final class nAllocationData1D extends nAllocationData3D {
    private final int IconCompatParcelizer;
    private final int MediaBrowserCompat$ItemReceiver;
    private final long MediaMetadataCompat;
    private final long read;
    private final int write;

    /* synthetic */ nAllocationData1D(long j, int i, int i2, long j2, int i3, byte b) {
        this(j, i, i2, j2, i3);
    }

    private nAllocationData1D(long j, int i, int i2, long j2, int i3) {
        this.MediaMetadataCompat = j;
        this.write = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.read = j2;
        this.IconCompatParcelizer = i3;
    }

    /* access modifiers changed from: package-private */
    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaMetadataCompat;
    }

    /* access modifiers changed from: package-private */
    public final int read() {
        return this.write;
    }

    /* access modifiers changed from: package-private */
    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final long MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    /* access modifiers changed from: package-private */
    public final int write() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", loadBatchSize=");
        sb.append(this.write);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", eventCleanUpAge=");
        sb.append(this.read);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nAllocationData3D)) {
            return false;
        }
        nAllocationData3D nallocationdata3d = (nAllocationData3D) obj;
        if (this.MediaMetadataCompat == nallocationdata3d.MediaBrowserCompat$CustomActionResultReceiver() && this.write == nallocationdata3d.read() && this.MediaBrowserCompat$ItemReceiver == nallocationdata3d.IconCompatParcelizer() && this.read == nallocationdata3d.MediaBrowserCompat$ItemReceiver() && this.IconCompatParcelizer == nallocationdata3d.write()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.MediaMetadataCompat;
        int i = this.write;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        long j2 = this.read;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.IconCompatParcelizer;
    }

    /* renamed from: o.nAllocationData1D$IconCompatParcelizer */
    static final class IconCompatParcelizer extends nAllocationData3D.read {
        private Long IconCompatParcelizer;
        private Integer MediaBrowserCompat$CustomActionResultReceiver;
        private Integer MediaBrowserCompat$ItemReceiver;
        private Integer read;
        private Long write;

        IconCompatParcelizer() {
        }

        /* access modifiers changed from: package-private */
        public final nAllocationData3D.read MediaBrowserCompat$MediaItem() {
            this.IconCompatParcelizer = 10485760L;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final nAllocationData3D.read MediaBrowserCompat$CustomActionResultReceiver() {
            this.read = Integer.valueOf(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
            return this;
        }

        /* access modifiers changed from: package-private */
        public final nAllocationData3D.read read() {
            this.MediaBrowserCompat$ItemReceiver = 10000;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final nAllocationData3D.read write() {
            this.write = 604800000L;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final nAllocationData3D.read IconCompatParcelizer() {
            this.MediaBrowserCompat$CustomActionResultReceiver = 81920;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final nAllocationData3D MediaBrowserCompat$ItemReceiver() {
            String str;
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" maxStorageSizeInBytes");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.read == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" loadBatchSize");
                str = sb2.toString();
            }
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" criticalSectionEnterTimeoutMs");
                str = sb3.toString();
            }
            if (this.write == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" eventCleanUpAge");
                str = sb4.toString();
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" maxBlobByteSizePerRow");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new nAllocationData1D(this.IconCompatParcelizer.longValue(), this.read.intValue(), this.MediaBrowserCompat$ItemReceiver.intValue(), this.write.longValue(), this.MediaBrowserCompat$CustomActionResultReceiver.intValue(), (byte) 0);
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }
}

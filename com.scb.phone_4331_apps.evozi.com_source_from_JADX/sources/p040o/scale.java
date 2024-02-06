package p040o;

import java.util.List;
import p040o.computeCofactor;

/* renamed from: o.scale */
final class scale extends computeCofactor {
    private final long IconCompatParcelizer;
    private final C10885rotate MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final inverse MediaBrowserCompat$SearchResultReceiver;
    private final List<Matrix3f> MediaDescriptionCompat;
    private final Integer read;
    private final long write;

    /* renamed from: o.scale$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends computeCofactor.read {
        private Integer IconCompatParcelizer;
        private Long MediaBrowserCompat$CustomActionResultReceiver;
        private Long MediaBrowserCompat$ItemReceiver;
        private inverse MediaBrowserCompat$MediaItem;
        private List<Matrix3f> MediaBrowserCompat$SearchResultReceiver;
        private String read;
        private C10885rotate write;

        public final computeCofactor.read MediaBrowserCompat$ItemReceiver(long j) {
            this.MediaBrowserCompat$CustomActionResultReceiver = Long.valueOf(j);
            return this;
        }

        public final computeCofactor.read read(long j) {
            this.MediaBrowserCompat$ItemReceiver = Long.valueOf(j);
            return this;
        }

        public final computeCofactor.read read(C10885rotate rotate) {
            this.write = rotate;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final computeCofactor.read MediaBrowserCompat$ItemReceiver(Integer num) {
            this.IconCompatParcelizer = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final computeCofactor.read IconCompatParcelizer(String str) {
            this.read = str;
            return this;
        }

        public final computeCofactor.read MediaBrowserCompat$ItemReceiver(List<Matrix3f> list) {
            this.MediaBrowserCompat$SearchResultReceiver = list;
            return this;
        }

        public final computeCofactor.read MediaBrowserCompat$CustomActionResultReceiver(inverse inverse) {
            this.MediaBrowserCompat$MediaItem = inverse;
            return this;
        }

        public final computeCofactor write() {
            String str;
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" requestTimeMs");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" requestUptimeMs");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new scale(this.MediaBrowserCompat$CustomActionResultReceiver.longValue(), this.MediaBrowserCompat$ItemReceiver.longValue(), this.write, this.IconCompatParcelizer, this.read, this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$MediaItem);
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ scale(long j, long j2, C10885rotate rotate, Integer num, String str, List list, inverse inverse) {
        this.write = j;
        this.IconCompatParcelizer = j2;
        this.MediaBrowserCompat$CustomActionResultReceiver = rotate;
        this.read = num;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaDescriptionCompat = list;
        this.MediaBrowserCompat$SearchResultReceiver = inverse;
    }

    public final C10885rotate IconCompatParcelizer() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final inverse MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final Integer MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final long MediaDescriptionCompat() {
        return this.write;
    }

    public final long MediaMetadataCompat() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        C10885rotate rotate;
        Integer num;
        String str;
        List<Matrix3f> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof computeCofactor)) {
            return false;
        }
        computeCofactor computecofactor = (computeCofactor) obj;
        if (this.write == computecofactor.MediaDescriptionCompat() && this.IconCompatParcelizer == computecofactor.MediaMetadataCompat() && ((rotate = this.MediaBrowserCompat$CustomActionResultReceiver) != null ? rotate.equals(((scale) computecofactor).MediaBrowserCompat$CustomActionResultReceiver) : ((scale) computecofactor).MediaBrowserCompat$CustomActionResultReceiver == null) && ((num = this.read) != null ? num.equals(((scale) computecofactor).read) : ((scale) computecofactor).read == null) && ((str = this.MediaBrowserCompat$ItemReceiver) != null ? str.equals(((scale) computecofactor).MediaBrowserCompat$ItemReceiver) : ((scale) computecofactor).MediaBrowserCompat$ItemReceiver == null) && ((list = this.MediaDescriptionCompat) != null ? list.equals(((scale) computecofactor).MediaDescriptionCompat) : ((scale) computecofactor).MediaDescriptionCompat == null)) {
            inverse inverse = this.MediaBrowserCompat$SearchResultReceiver;
            if (inverse == null) {
                if (((scale) computecofactor).MediaBrowserCompat$SearchResultReceiver == null) {
                    return true;
                }
            } else if (inverse.equals(((scale) computecofactor).MediaBrowserCompat$SearchResultReceiver)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.write;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.IconCompatParcelizer;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        C10885rotate rotate = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = 0;
        int hashCode = rotate == null ? 0 : rotate.hashCode();
        Integer num = this.read;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str == null ? 0 : str.hashCode();
        List<Matrix3f> list = this.MediaDescriptionCompat;
        int hashCode4 = list == null ? 0 : list.hashCode();
        inverse inverse = this.MediaBrowserCompat$SearchResultReceiver;
        if (inverse != null) {
            i3 = inverse.hashCode();
        }
        return ((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i3;
    }

    public final String read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogRequest{requestTimeMs=");
        sb.append(this.write);
        sb.append(", requestUptimeMs=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", clientInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", logSource=");
        sb.append(this.read);
        sb.append(", logSourceName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", logEvents=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", qosTier=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append("}");
        return sb.toString();
    }

    public final List<Matrix3f> write() {
        return this.MediaDescriptionCompat;
    }
}

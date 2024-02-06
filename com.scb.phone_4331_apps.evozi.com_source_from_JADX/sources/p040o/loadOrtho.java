package p040o;

import java.util.Map;
import p040o.loadProjectionNormalized;

/* renamed from: o.loadOrtho */
final class loadOrtho extends loadProjectionNormalized {
    private final String IconCompatParcelizer;
    private final Map<String, String> MediaBrowserCompat$CustomActionResultReceiver;
    private final Integer MediaBrowserCompat$ItemReceiver;
    private final long MediaMetadataCompat;
    private final long read;
    private final RSIllegalArgumentException write;

    /* synthetic */ loadOrtho(String str, Integer num, RSIllegalArgumentException rSIllegalArgumentException, long j, long j2, Map map, byte b) {
        this(str, num, rSIllegalArgumentException, j, j2, map);
    }

    private loadOrtho(String str, Integer num, RSIllegalArgumentException rSIllegalArgumentException, long j, long j2, Map<String, String> map) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = num;
        this.write = rSIllegalArgumentException;
        this.read = j;
        this.MediaMetadataCompat = j2;
        this.MediaBrowserCompat$CustomActionResultReceiver = map;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final Integer read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final RSIllegalArgumentException IconCompatParcelizer() {
        return this.write;
    }

    public final long MediaBrowserCompat$ItemReceiver() {
        return this.read;
    }

    public final long RatingCompat() {
        return this.MediaMetadataCompat;
    }

    /* access modifiers changed from: protected */
    public final Map<String, String> write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EventInternal{transportName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", code=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", encodedPayload=");
        sb.append(this.write);
        sb.append(", eventMillis=");
        sb.append(this.read);
        sb.append(", uptimeMillis=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", autoMetadata=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof loadProjectionNormalized)) {
            return false;
        }
        loadProjectionNormalized loadprojectionnormalized = (loadProjectionNormalized) obj;
        if (!this.IconCompatParcelizer.equals(loadprojectionnormalized.MediaBrowserCompat$CustomActionResultReceiver()) || ((num = this.MediaBrowserCompat$ItemReceiver) != null ? !num.equals(loadprojectionnormalized.read()) : loadprojectionnormalized.read() != null) || !this.write.equals(loadprojectionnormalized.IconCompatParcelizer()) || this.read != loadprojectionnormalized.MediaBrowserCompat$ItemReceiver() || this.MediaMetadataCompat != loadprojectionnormalized.RatingCompat() || !this.MediaBrowserCompat$CustomActionResultReceiver.equals(loadprojectionnormalized.write())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.IconCompatParcelizer.hashCode();
        Integer num = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.write.hashCode();
        long j = this.read;
        long j2 = this.MediaMetadataCompat;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
    }

    /* renamed from: o.loadOrtho$write */
    public static final class write extends loadProjectionNormalized.IconCompatParcelizer {
        private Integer IconCompatParcelizer;
        public Map<String, String> MediaBrowserCompat$CustomActionResultReceiver;
        private RSIllegalArgumentException MediaBrowserCompat$ItemReceiver;
        private Long RatingCompat;
        private Long read;
        String write;

        public final loadProjectionNormalized.IconCompatParcelizer write(String str) {
            if (str != null) {
                this.write = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }

        public final loadProjectionNormalized.IconCompatParcelizer write(Integer num) {
            this.IconCompatParcelizer = num;
            return this;
        }

        public final loadProjectionNormalized.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(RSIllegalArgumentException rSIllegalArgumentException) {
            if (rSIllegalArgumentException != null) {
                this.MediaBrowserCompat$ItemReceiver = rSIllegalArgumentException;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }

        public final loadProjectionNormalized.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(long j) {
            this.read = Long.valueOf(j);
            return this;
        }

        public final loadProjectionNormalized.IconCompatParcelizer write(long j) {
            this.RatingCompat = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: protected */
        public final loadProjectionNormalized.IconCompatParcelizer MediaBrowserCompat$ItemReceiver(Map<String, String> map) {
            this.MediaBrowserCompat$CustomActionResultReceiver = map;
            return this;
        }

        /* access modifiers changed from: protected */
        public final Map<String, String> MediaBrowserCompat$CustomActionResultReceiver() {
            Map<String, String> map = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        public final loadProjectionNormalized IconCompatParcelizer() {
            String str;
            if (this.write == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" transportName");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.MediaBrowserCompat$ItemReceiver == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" encodedPayload");
                str = sb2.toString();
            }
            if (this.read == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventMillis");
                str = sb3.toString();
            }
            if (this.RatingCompat == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" uptimeMillis");
                str = sb4.toString();
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" autoMetadata");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                return new loadOrtho(this.write, this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver, this.read.longValue(), this.RatingCompat.longValue(), this.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }
}

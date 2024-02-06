package p040o;

import java.util.Arrays;
import p040o.Matrix3f;

/* renamed from: o.loadScale */
final class loadScale extends Matrix3f {
    private final byte[] IconCompatParcelizer;
    private final long MediaBrowserCompat$CustomActionResultReceiver;
    private final long MediaBrowserCompat$ItemReceiver;
    private final loadTranslate MediaDescriptionCompat;
    private final long MediaMetadataCompat;
    private final Integer read;
    private final String write;

    /* renamed from: o.loadScale$write */
    public static final class write extends Matrix3f.IconCompatParcelizer {
        private Long IconCompatParcelizer;
        private String MediaBrowserCompat$CustomActionResultReceiver;
        private byte[] MediaBrowserCompat$ItemReceiver;
        private loadTranslate MediaMetadataCompat;
        private Long RatingCompat;
        private Integer read;
        private Long write;

        public final Matrix3f.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(long j) {
            this.RatingCompat = Long.valueOf(j);
            return this;
        }

        public final Matrix3f.IconCompatParcelizer MediaBrowserCompat$ItemReceiver(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        public final Matrix3f.IconCompatParcelizer read(long j) {
            this.write = Long.valueOf(j);
            return this;
        }

        public final Matrix3f.IconCompatParcelizer read(Integer num) {
            this.read = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Matrix3f.IconCompatParcelizer MediaBrowserCompat$ItemReceiver(byte[] bArr) {
            this.MediaBrowserCompat$ItemReceiver = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public final Matrix3f.IconCompatParcelizer read(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            return this;
        }

        public final Matrix3f.IconCompatParcelizer read(loadTranslate loadtranslate) {
            this.MediaMetadataCompat = loadtranslate;
            return this;
        }

        public final Matrix3f write() {
            String str;
            if (this.IconCompatParcelizer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" eventTimeMs");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.write == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" eventUptimeMs");
                str = sb2.toString();
            }
            if (this.RatingCompat == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" timezoneOffsetSeconds");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new loadScale(this.IconCompatParcelizer.longValue(), this.read, this.write.longValue(), this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$CustomActionResultReceiver, this.RatingCompat.longValue(), this.MediaMetadataCompat);
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ loadScale(long j, Integer num, long j2, byte[] bArr, String str, long j3, loadTranslate loadtranslate) {
        this.MediaBrowserCompat$CustomActionResultReceiver = j;
        this.read = num;
        this.MediaBrowserCompat$ItemReceiver = j2;
        this.IconCompatParcelizer = bArr;
        this.write = str;
        this.MediaMetadataCompat = j3;
        this.MediaDescriptionCompat = loadtranslate;
    }

    public final long IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final loadTranslate MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    public final byte[] MediaBrowserCompat$ItemReceiver() {
        return this.IconCompatParcelizer;
    }

    public final long MediaBrowserCompat$SearchResultReceiver() {
        return this.MediaMetadataCompat;
    }

    public final String MediaMetadataCompat() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Matrix3f)) {
            return false;
        }
        Matrix3f matrix3f = (Matrix3f) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == matrix3f.write() && ((num = this.read) != null ? num.equals(((loadScale) matrix3f).read) : ((loadScale) matrix3f).read == null) && this.MediaBrowserCompat$ItemReceiver == matrix3f.IconCompatParcelizer()) {
            if (Arrays.equals(this.IconCompatParcelizer, matrix3f instanceof loadScale ? ((loadScale) matrix3f).IconCompatParcelizer : matrix3f.MediaBrowserCompat$ItemReceiver()) && ((str = this.write) != null ? str.equals(((loadScale) matrix3f).write) : ((loadScale) matrix3f).write == null) && this.MediaMetadataCompat == matrix3f.MediaBrowserCompat$SearchResultReceiver()) {
                loadTranslate loadtranslate = this.MediaDescriptionCompat;
                if (loadtranslate == null) {
                    if (((loadScale) matrix3f).MediaDescriptionCompat == null) {
                        return true;
                    }
                } else if (loadtranslate.equals(((loadScale) matrix3f).MediaDescriptionCompat)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = (int) (j ^ (j >>> 32));
        Integer num = this.read;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.MediaBrowserCompat$ItemReceiver;
        int i3 = (int) (j2 ^ (j2 >>> 32));
        int hashCode2 = Arrays.hashCode(this.IconCompatParcelizer);
        String str = this.write;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.MediaMetadataCompat;
        int i4 = (int) (j3 ^ (j3 >>> 32));
        loadTranslate loadtranslate = this.MediaDescriptionCompat;
        if (loadtranslate != null) {
            i2 = loadtranslate.hashCode();
        }
        return ((((((((((((i ^ 1000003) * 1000003) ^ hashCode) * 1000003) ^ i3) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i4) * 1000003) ^ i2;
    }

    public final Integer read() {
        return this.read;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogEvent{eventTimeMs=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", eventCode=");
        sb.append(this.read);
        sb.append(", eventUptimeMs=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.IconCompatParcelizer));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.write);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", networkConnectionInfo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append("}");
        return sb.toString();
    }

    public final long write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }
}

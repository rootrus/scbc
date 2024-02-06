package p040o;

import java.util.List;

/* renamed from: o.logHealthData */
public final class logHealthData extends getConditionalUserProperties {
    public List<getGmpAppId> RatingCompat;

    /* synthetic */ logHealthData(read read2, byte b) {
        this(read2);
    }

    private logHealthData(read read2) {
        super(read2);
        this.IconCompatParcelizer = null;
        this.RatingCompat = read2.MediaMetadataCompat;
    }

    /* renamed from: o.logHealthData$read */
    public static final class read extends C9962x621ef0db {
        public List<getGmpAppId> MediaMetadataCompat;

        public final /* synthetic */ getConditionalUserProperties read() {
            return new logHealthData(this, (byte) 0);
        }
    }
}

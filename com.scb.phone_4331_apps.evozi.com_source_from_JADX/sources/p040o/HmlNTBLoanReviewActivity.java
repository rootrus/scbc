package p040o;

import java.util.HashMap;
import java.util.Map;
import p039io.realm.internal.OsObjectSchemaInfo;
import p039io.realm.internal.Property;

/* renamed from: o.HmlNTBLoanReviewActivity */
public abstract class HmlNTBLoanReviewActivity {
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public Map<String, read> MediaDescriptionCompat;
    public Map<String, read> MediaMetadataCompat;
    public Map<String, String> RatingCompat;

    public /* synthetic */ HmlNTBLoanReviewActivity() {
    }

    /* renamed from: o.HmlNTBLoanReviewActivity$read */
    public static final class read {
        String IconCompatParcelizer;
        HmlNTBAdditionalDocumentActivity_ViewBinding read;
        long write;

        public /* synthetic */ read() {
        }

        private read(long j, HmlNTBAdditionalDocumentActivity_ViewBinding hmlNTBAdditionalDocumentActivity_ViewBinding, String str) {
            this.write = j;
            this.read = hmlNTBAdditionalDocumentActivity_ViewBinding;
            this.IconCompatParcelizer = str;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ColumnDetails[");
            sb.append(this.write);
            sb.append(", ");
            sb.append(this.read);
            sb.append(", ");
            sb.append(this.IconCompatParcelizer);
            sb.append("]");
            return sb.toString();
        }

        read(Property property) {
            this(Property.nativeGetColumnIndex(property.MediaBrowserCompat$CustomActionResultReceiver), Property.write(Property.nativeGetType(property.MediaBrowserCompat$CustomActionResultReceiver)), Property.nativeGetLinkedObjectName(property.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    public HmlNTBLoanReviewActivity(int i) {
        this(i, true);
    }

    public HmlNTBLoanReviewActivity(byte b) {
        this(0, false);
    }

    private HmlNTBLoanReviewActivity(int i, boolean z) {
        this.MediaDescriptionCompat = new HashMap(i);
        this.MediaMetadataCompat = new HashMap(i);
        this.RatingCompat = new HashMap(i);
        this.MediaBrowserCompat$SearchResultReceiver = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mutable=");
        sb2.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(sb2.toString());
        sb.append(",");
        boolean z = false;
        if (this.MediaDescriptionCompat != null) {
            sb.append("JavaFieldNames=[");
            boolean z2 = false;
            for (Map.Entry next : this.MediaDescriptionCompat.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append((String) next.getKey());
                sb.append("->");
                sb.append(next.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        if (this.MediaMetadataCompat != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry next2 : this.MediaMetadataCompat.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append((String) next2.getKey());
                sb.append("->");
                sb.append(next2.getValue());
                z = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final long MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property property = new Property(OsObjectSchemaInfo.nativeGetProperty(osObjectSchemaInfo.write, str2));
        read read2 = new read(property);
        this.MediaDescriptionCompat.put(str, read2);
        this.MediaMetadataCompat.put(str2, read2);
        this.RatingCompat.put(str, str2);
        return Property.nativeGetColumnIndex(property.MediaBrowserCompat$CustomActionResultReceiver);
    }
}

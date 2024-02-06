package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getCurrentKeyframe */
public final class getCurrentKeyframe {
    @SerializedName("requireIssuerFlag")
    public final int IconCompatParcelizer;
    @SerializedName("applicationExpiryDate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("documents")
    public final List<getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver> read;
    @SerializedName("documentValidation")
    public final write write;

    /* renamed from: o.getCurrentKeyframe$write */
    public static final class write {
        @SerializedName("maxAmount")
        public final int IconCompatParcelizer;
        @SerializedName("maxSize")
        public final int read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return this.read == write.read && this.IconCompatParcelizer == write.IconCompatParcelizer;
        }

        public final int hashCode() {
            return (this.read * 31) + this.IconCompatParcelizer;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HMLDocumentValidationEntity(maxSize=");
            sb.append(this.read);
            sb.append(", maxAmount=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentKeyframe)) {
            return false;
        }
        getCurrentKeyframe getcurrentkeyframe = (getCurrentKeyframe) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcurrentkeyframe.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcurrentkeyframe.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcurrentkeyframe.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcurrentkeyframe.write) && this.IconCompatParcelizer == getcurrentkeyframe.IconCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver> list = this.read;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        write write2 = this.write;
        if (write2 != null) {
            i = write2.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HMLDocumentUploadsEntity(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", documents=");
        sb.append(this.read);
        sb.append(", applicationExpiryDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", documentValidation=");
        sb.append(this.write);
        sb.append(", requireIssuerFlag=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

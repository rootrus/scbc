package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getStart */
public final class getStart {
    @SerializedName("skipDocumentUploadFlag")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("requireIssuerFlag")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("skipSelectMOAScreen")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStart)) {
            return false;
        }
        getStart getstart = (getStart) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getstart.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getstart.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getstart.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CustomerOccupationUpdateFlagEntity(skipDocumentUploadFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", skipSelectMOAScreen=");
        sb.append(this.read);
        sb.append(", requireIssuerFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getActivityConfidence */
public final class getActivityConfidence {
    @SerializedName("issueDate")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("number")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("laserCode")
    private final String read;
    @SerializedName("expiryDate")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getActivityConfidence)) {
            return false;
        }
        getActivityConfidence getactivityconfidence = (getActivityConfidence) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getactivityconfidence.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getactivityconfidence.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getactivityconfidence.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getactivityconfidence.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NTBCitizenIDRequest(number=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", laserCode=");
        sb.append(this.read);
        sb.append(", issueDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", expiryDate=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getActivityConfidence(String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.write = str4;
    }
}

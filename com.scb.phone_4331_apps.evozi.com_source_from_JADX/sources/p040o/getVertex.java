package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getVertex */
public final class getVertex {
    @SerializedName("approvalEstimatedTime")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("approvalEstimatedTimeDetail")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("applicationId")
    public final String read;
    @SerializedName("applicationDateTime")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getVertex)) {
            return false;
        }
        getVertex getvertex = (getVertex) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getvertex.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getvertex.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getvertex.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getvertex.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOtpSubmissionEntity(applicationDateTime=");
        sb.append(this.write);
        sb.append(", applicationId=");
        sb.append(this.read);
        sb.append(", approvalEstimatedTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", approvalEstimatedTimeDetail=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

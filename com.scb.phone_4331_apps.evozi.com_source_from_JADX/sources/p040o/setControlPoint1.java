package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setControlPoint1 */
public final class setControlPoint1 {
    @SerializedName("disburseTnCFlag")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("advertisingId")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setControlPoint1)) {
            return false;
        }
        setControlPoint1 setcontrolpoint1 = (setControlPoint1) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcontrolpoint1.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcontrolpoint1.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcontrolpoint1.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOtpConfirmationRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", disburseTnCFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", advertisingId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setControlPoint1(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) str2, "disburseTnCFlag");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
    }
}

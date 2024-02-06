package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setScale */
public final class setScale {
    @SerializedName("remark")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("additionalInfo")
    public final setPerformanceTrackingEnabled MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionId")
    public final String read;
    @SerializedName("transactionDateTime")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setScale)) {
            return false;
        }
        setScale setscale = (setScale) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setscale.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setscale.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setscale.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setscale.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        setPerformanceTrackingEnabled setperformancetrackingenabled = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = setperformancetrackingenabled != null ? setperformancetrackingenabled.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardActivationConfirmationEntity(transactionDateTime=");
        sb.append(this.write);
        sb.append(", transactionId=");
        sb.append(this.read);
        sb.append(", additionalInfo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

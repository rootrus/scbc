package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getLinearKeyframeProgress */
public final class getLinearKeyframeProgress {
    @SerializedName("additionalInfo")
    public final getLinearKeyframeProgress$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("remark")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionDateTime")
    public final String read;
    @SerializedName("transactionId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLinearKeyframeProgress)) {
            return false;
        }
        getLinearKeyframeProgress getlinearkeyframeprogress = (getLinearKeyframeProgress) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlinearkeyframeprogress.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlinearkeyframeprogress.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlinearkeyframeprogress.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlinearkeyframeprogress.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        getLinearKeyframeProgress$MediaBrowserCompat$ItemReceiver getlinearkeyframeprogress_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = getlinearkeyframeprogress_mediabrowsercompat_itemreceiver != null ? getlinearkeyframeprogress_mediabrowsercompat_itemreceiver.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidActivationOtpConfirmEntity(transactionId=");
        sb.append(this.write);
        sb.append(", transactionDateTime=");
        sb.append(this.read);
        sb.append(", additionalInfo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remark=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

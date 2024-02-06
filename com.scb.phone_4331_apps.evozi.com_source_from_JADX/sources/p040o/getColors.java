package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getColors */
public final class getColors {
    @SerializedName("accountTypeDesc")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("nickname")
    public final String read;
    @SerializedName("isSelected")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getColors)) {
            return false;
        }
        getColors getcolors = (getColors) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcolors.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcolors.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcolors.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcolors.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDepositListEntity(accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountTypeDesc=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", nickName=");
        sb.append(this.read);
        sb.append(", isSelected=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

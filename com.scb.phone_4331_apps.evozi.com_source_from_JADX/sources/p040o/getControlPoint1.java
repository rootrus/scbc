package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getControlPoint1 */
public final class getControlPoint1 {
    @SerializedName("bankLogo")
    public final String IconCompatParcelizer;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("bankAbbrev")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("bankCode")
    public final String read;
    @SerializedName("id")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getControlPoint1)) {
            return false;
        }
        getControlPoint1 getcontrolpoint1 = (getControlPoint1) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcontrolpoint1.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcontrolpoint1.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcontrolpoint1.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcontrolpoint1.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcontrolpoint1.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOperatingAccountEntity(id=");
        sb.append(this.write);
        sb.append(", bankCode=");
        sb.append(this.read);
        sb.append(", bankAbbrev=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", bankLogo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

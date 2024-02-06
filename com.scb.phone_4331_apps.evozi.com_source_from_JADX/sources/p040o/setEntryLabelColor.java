package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setEntryLabelColor */
public final class setEntryLabelColor {
    @SerializedName("name")
    public final String IconCompatParcelizer;
    @SerializedName("logo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNumber")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setEntryLabelColor)) {
            return false;
        }
        setEntryLabelColor setentrylabelcolor = (setEntryLabelColor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setentrylabelcolor.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setentrylabelcolor.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setentrylabelcolor.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountFromEntity(logo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountNumber=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

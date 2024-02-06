package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createSubmap */
public final class createSubmap {
    @SerializedName("currencyCode")
    public final String IconCompatParcelizer;
    @SerializedName("countryName")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("agentType")
    public final String read;
    @SerializedName("channelType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createSubmap)) {
            return false;
        }
        createSubmap createsubmap = (createSubmap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) createsubmap.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) createsubmap.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) createsubmap.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) createsubmap.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RemittanceCountryInfoRequest(countryName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", channelType=");
        sb.append(this.write);
        sb.append(", agentType=");
        sb.append(this.read);
        sb.append(", currencyCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public createSubmap(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "countryName");
        onGetStartedClick.write((Object) str2, "channelType");
        onGetStartedClick.write((Object) str3, "agentType");
        onGetStartedClick.write((Object) str4, "currencyCode");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
    }
}

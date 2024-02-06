package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardSubList */
public final class standardSubList {
    @SerializedName("tokenId")
    private final String IconCompatParcelizer;
    @SerializedName("currentAddressFlag")
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardSubList)) {
            return false;
        }
        standardSubList standardsublist = (standardSubList) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) standardsublist.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardsublist.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressDetailsRequest(tokenId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currentAddressFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public standardSubList(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenId");
        onGetStartedClick.write((Object) str2, "currentAddressFlag");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}

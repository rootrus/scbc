package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.skipName */
public final class skipName {
    @SerializedName("name")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("referenceNumber")
    public final String read;
    @SerializedName("applicationId")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skipName)) {
            return false;
        }
        skipName skipname = (skipName) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) skipname.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) skipname.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) skipname.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressRequestProductResponseEntity(name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", referenceNumber=");
        sb.append(this.read);
        sb.append(", applicationId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

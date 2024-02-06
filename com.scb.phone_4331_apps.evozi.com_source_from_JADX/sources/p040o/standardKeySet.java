package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardKeySet */
public final class standardKeySet {
    @SerializedName("cardRef")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNo")
    private final String read;
    @SerializedName("applicationId")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardKeySet)) {
            return false;
        }
        standardKeySet standardkeyset = (standardKeySet) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardkeyset.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardkeyset.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardkeyset.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressProductAddressRequest(applicationId=");
        sb.append(this.write);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", cardRef=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public standardKeySet(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "applicationId");
        this.write = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }
}

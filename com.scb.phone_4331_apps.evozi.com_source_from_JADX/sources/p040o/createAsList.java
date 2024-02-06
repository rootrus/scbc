package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createAsList */
public final class createAsList {
    @SerializedName("encryptPin")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("e2eeSid")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("preregistrationTokenId")
    private final String read;
    @SerializedName("juristicState")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof createAsList)) {
            return false;
        }
        createAsList createaslist = (createAsList) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) createaslist.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) createaslist.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) createaslist.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) createaslist.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicPinRequest(e2eeSid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", encryptPin=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", juristicState=");
        sb.append(this.write);
        sb.append(", preregistrationTokenId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public createAsList(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "e2eeSid");
        onGetStartedClick.write((Object) str2, "encryptPin");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
        this.read = str4;
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getTransitionType */
public final class getTransitionType {
    @SerializedName("thaiLastName")
    private String IconCompatParcelizer;
    @SerializedName("citizenship")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("citizenId")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("thaiFirstName")
    private String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTransitionType)) {
            return false;
        }
        getTransitionType gettransitiontype = (getTransitionType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettransitiontype.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettransitiontype.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gettransitiontype.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) gettransitiontype.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpouseInfo(citizenship=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", thaiFirstName=");
        sb.append(this.read);
        sb.append(", thaiLastName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", citizenId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getTransitionType(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "citizenship");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
    }
}

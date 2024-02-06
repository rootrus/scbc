package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardAddAll */
public final class standardAddAll {
    @SerializedName("taxId")
    private final String IconCompatParcelizer;
    @SerializedName("ota")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("juristicState")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNo")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardAddAll)) {
            return false;
        }
        standardAddAll standardaddall = (standardAddAll) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) standardaddall.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardaddall.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardaddall.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) standardaddall.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicVerifyUserRequest(taxId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", juristicState=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountNo=");
        sb.append(this.read);
        sb.append(", ota=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public standardAddAll(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "taxId");
        onGetStartedClick.write((Object) str2, "juristicState");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}

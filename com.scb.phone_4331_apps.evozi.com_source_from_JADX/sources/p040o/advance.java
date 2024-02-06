package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.advance */
public final class advance {
    @SerializedName("productType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("duration")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("loanAmount")
    private final String read;
    @SerializedName("tilesVersion")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof advance)) {
            return false;
        }
        advance advance = (advance) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) advance.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) advance.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) advance.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) advance.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashMCMCCalculationRequest(loanAmount=");
        sb.append(this.read);
        sb.append(", duration=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tilesVersion=");
        sb.append(this.write);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public advance(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "loanAmount");
        onGetStartedClick.write((Object) str2, "duration");
        onGetStartedClick.write((Object) str3, "tilesVersion");
        onGetStartedClick.write((Object) str4, "productType");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}

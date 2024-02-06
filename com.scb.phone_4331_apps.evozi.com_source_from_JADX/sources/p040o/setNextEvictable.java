package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setNextEvictable */
public final class setNextEvictable {
    @SerializedName("loanAmount")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productType")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("maximumCreditLimit")
    public String read;
    @SerializedName("minimumCreditLimit")
    public String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setNextEvictable)) {
            return false;
        }
        setNextEvictable setnextevictable = (setNextEvictable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setnextevictable.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setnextevictable.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setnextevictable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setnextevictable.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
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
        sb.append("ProductCalculationRequest(productType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", minimumCreditLimit=");
        sb.append(this.write);
        sb.append(", maximumCreditLimit=");
        sb.append(this.read);
        sb.append(", loanAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setNextEvictable(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "productType");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getNext */
public final class getNext {
    @SerializedName("ncbTransactionId")
    private final String IconCompatParcelizer;
    @SerializedName("ncbAcceptedFlag")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tilesVersion")
    private final String read;
    @SerializedName("productType")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getNext)) {
            return false;
        }
        getNext getnext = (getNext) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getnext.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getnext.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getnext.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getnext.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("PostNCBRequest(productType=");
        sb.append(this.write);
        sb.append(", ncbAcceptedFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tilesVersion=");
        sb.append(this.read);
        sb.append(", ncbTransactionId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public getNext(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "ncbAcceptedFlag");
        onGetStartedClick.write((Object) str3, "tilesVersion");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
    }
}

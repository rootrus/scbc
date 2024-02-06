package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getHash */
public final class getHash {
    @SerializedName("uuid")
    private final String IconCompatParcelizer;
    @SerializedName("productType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productProgram")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getHash)) {
            return false;
        }
        getHash gethash = (getHash) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) gethash.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gethash.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gethash.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NcbMultiproductDetailRequest(uuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productProgram=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getHash(String str, String str2, String str3) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }
}

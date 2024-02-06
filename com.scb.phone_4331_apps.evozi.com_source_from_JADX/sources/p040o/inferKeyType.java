package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.inferKeyType */
public final class inferKeyType {
    @SerializedName("productTypeCode")
    private final String IconCompatParcelizer;
    @SerializedName("branchCode")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountBranch")
    private final String read;
    @SerializedName("accountName")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inferKeyType)) {
            return false;
        }
        inferKeyType inferkeytype = (inferKeyType) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) inferkeytype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) inferkeytype.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) inferkeytype.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) inferkeytype.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) inferkeytype.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountRegistrationRequest(accountName=");
        sb.append(this.write);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountBranch=");
        sb.append(this.read);
        sb.append(", branchCode=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productTypeCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public inferKeyType(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "accountName");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "accountBranch");
        onGetStartedClick.write((Object) str4, "branchCode");
        onGetStartedClick.write((Object) str5, "productTypeCode");
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.IconCompatParcelizer = str5;
    }
}

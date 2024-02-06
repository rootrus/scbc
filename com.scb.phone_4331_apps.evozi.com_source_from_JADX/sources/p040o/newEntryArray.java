package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.newEntryArray */
public final class newEntryArray {
    @SerializedName("isReferral")
    private final String IconCompatParcelizer;
    @SerializedName("productType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tilesVersion")
    public String read = null;
    @SerializedName("monthlyIncome")
    private String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof newEntryArray)) {
            return false;
        }
        newEntryArray newentryarray = (newEntryArray) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) newentryarray.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) newentryarray.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) newentryarray.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) newentryarray.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
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
        sb.append("EasycashCardInfoInitRequest(productType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isReferral=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", monthlyIncome=");
        sb.append(this.write);
        sb.append(", tilesVersion=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public newEntryArray(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "productType");
        onGetStartedClick.write((Object) str2, "isReferral");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
    }
}

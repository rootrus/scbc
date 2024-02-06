package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.endObject */
public final class endObject {
    @SerializedName("applicationId")
    public final String IconCompatParcelizer;
    @SerializedName("cardMask")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("productType")
    public final skipValue MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final Integer read;
    @SerializedName("cardRefNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof endObject)) {
            return false;
        }
        endObject endobject = (endObject) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) endobject.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) endobject.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) endobject.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) endobject.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) endobject.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        Integer num = this.read;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.IconCompatParcelizer;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        skipValue skipvalue = this.MediaBrowserCompat$ItemReceiver;
        if (skipvalue != null) {
            i = skipvalue.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressCardListEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", applicationId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardRefNo=");
        sb.append(this.write);
        sb.append(", cardMask=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", productType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

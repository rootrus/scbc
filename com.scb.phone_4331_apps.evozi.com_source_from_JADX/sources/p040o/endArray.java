package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.endArray */
public final class endArray {
    @SerializedName("cardMask")
    public final String IconCompatParcelizer;
    @SerializedName("applicationId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("cardRefNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final Integer read;
    @SerializedName("productName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof endArray)) {
            return false;
        }
        endArray endarray = (endArray) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) endarray.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) endarray.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) endarray.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) endarray.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) endarray.write);
    }

    public final int hashCode() {
        Integer num = this.read;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressDebitCardListEntity(sortSequence=");
        sb.append(this.read);
        sb.append(", applicationId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardRefNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cardMask=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productName=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getWarnings */
public final class getWarnings {
    @SerializedName("productCode")
    public final String IconCompatParcelizer;
    @SerializedName("name")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("imageURL")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final int RatingCompat;
    @SerializedName("accountType")
    public final String read;
    @SerializedName("desc")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getWarnings)) {
            return false;
        }
        getWarnings getwarnings = (getWarnings) obj;
        return this.RatingCompat == getwarnings.RatingCompat && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getwarnings.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getwarnings.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getwarnings.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getwarnings.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getwarnings.IconCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.RatingCompat;
        String str = this.read;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return (((((((((i * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DepositAccountEntity(sortSequence=");
        sb.append(this.RatingCompat);
        sb.append(", accountType=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", desc=");
        sb.append(this.write);
        sb.append(", imageURL=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

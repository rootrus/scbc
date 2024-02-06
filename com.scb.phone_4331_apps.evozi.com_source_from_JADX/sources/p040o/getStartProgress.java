package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getStartProgress */
public final class getStartProgress {
    @SerializedName("branchCode")
    public final String IconCompatParcelizer;
    @SerializedName("accountBranch")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sortSequence")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("accountNickname")
    public final String read;
    @SerializedName("productTypeCode")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getStartProgress)) {
            return false;
        }
        getStartProgress getstartprogress = (getStartProgress) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getstartprogress.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getstartprogress.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getstartprogress.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getstartprogress.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getstartprogress.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getstartprogress.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", accountNickname=");
        sb.append(this.read);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountBranch=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", branchCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productTypeCode=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

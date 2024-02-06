package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getIntrinsicWidth */
public final class getIntrinsicWidth extends getIntrinsicHeight {
    @SerializedName("dateOfBirth")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("ncbAcceptedFlag")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("ncbGrade")
    public final String MediaMetadataCompat;
    @SerializedName("expectedMonthlyPayment")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getIntrinsicWidth)) {
            return false;
        }
        getIntrinsicWidth getintrinsicwidth = (getIntrinsicWidth) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getintrinsicwidth.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getintrinsicwidth.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getintrinsicwidth.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getintrinsicwidth.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaMetadataCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashCreditPowerNCBInquiryEntity(expectedMonthlyPayment=");
        sb.append(this.write);
        sb.append(", dateOfBirth=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", ncbGrade=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ncbAcceptedFlag=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }
}

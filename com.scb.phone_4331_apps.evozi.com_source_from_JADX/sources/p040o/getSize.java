package p040o;

import com.google.gson.annotations.SerializedName;
import p040o.DocumentData;

/* renamed from: o.getSize */
public final class getSize {
    @SerializedName("applicationUuid")
    public final String IconCompatParcelizer;
    @SerializedName("confirmDateTime")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("confirmationStatus")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("selectedProduct")
    public final DocumentData.Justification MediaBrowserCompat$MediaItem;
    @SerializedName("refId")
    public final String MediaDescriptionCompat;
    @SerializedName("repaymentAccount")
    public final isAnimating MediaMetadataCompat;
    @SerializedName("receivingAccount")
    public final isAnimating read;
    @SerializedName("customerContactInfo")
    public final getSize$MediaBrowserCompat$ItemReceiver write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSize)) {
            return false;
        }
        getSize getsize = (getSize) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getsize.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getsize.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getsize.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getsize.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getsize.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getsize.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getsize.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getsize.write);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        DocumentData.Justification justification = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = justification != null ? justification.hashCode() : 0;
        isAnimating isanimating = this.read;
        int hashCode6 = isanimating != null ? isanimating.hashCode() : 0;
        isAnimating isanimating2 = this.MediaMetadataCompat;
        int hashCode7 = isanimating2 != null ? isanimating2.hashCode() : 0;
        getSize$MediaBrowserCompat$ItemReceiver getsize_mediabrowsercompat_itemreceiver = this.write;
        if (getsize_mediabrowsercompat_itemreceiver != null) {
            i = getsize_mediabrowsercompat_itemreceiver.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlSetupResultEntity(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", confirmDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", refId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", confirmationStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", selectedProduct=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", receivingAccount=");
        sb.append(this.read);
        sb.append(", repaymentAccount=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", customerContactInfo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

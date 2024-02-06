package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.immediateFuture */
public final class immediateFuture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new immediateFuture$MediaBrowserCompat$ItemReceiver();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final makeChecked MediaBrowserCompat$MediaItem;
    public final String MediaDescriptionCompat;
    public final boolean MediaMetadataCompat;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof immediateFuture)) {
            return false;
        }
        immediateFuture immediatefuture = (immediateFuture) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) immediatefuture.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) immediatefuture.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) immediatefuture.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) immediatefuture.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) immediatefuture.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) immediatefuture.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) immediatefuture.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) immediatefuture.MediaBrowserCompat$MediaItem) && this.MediaMetadataCompat == immediatefuture.MediaMetadataCompat;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaDescriptionCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.write;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        makeChecked makechecked = this.MediaBrowserCompat$MediaItem;
        if (makechecked != null) {
            i = makechecked.hashCode();
        }
        boolean z = this.MediaMetadataCompat;
        if (z) {
            z = true;
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdBannerDisplay(adsId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", adsName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", imageUrl=");
        sb.append(this.RatingCompat);
        sb.append(", deeplinkUrl=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", header=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", buttonText=");
        sb.append(this.write);
        sb.append(", formatType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", showCloseButton=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.read);
        parcel.writeString(this.write);
        parcel.writeString(this.MediaBrowserCompat$MediaItem.name());
        parcel.writeInt(this.MediaMetadataCompat ? 1 : 0);
    }

    public immediateFuture(String str, String str2, String str3, String str4, String str5, String str6, String str7, makeChecked makechecked, boolean z) {
        onGetStartedClick.write((Object) str, "adsId");
        onGetStartedClick.write((Object) str2, "adsName");
        onGetStartedClick.write((Object) str3, "imageUrl");
        onGetStartedClick.write((Object) str4, "deeplinkUrl");
        onGetStartedClick.write((Object) makechecked, "formatType");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.RatingCompat = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaDescriptionCompat = str5;
        this.read = str6;
        this.write = str7;
        this.MediaBrowserCompat$MediaItem = makechecked;
        this.MediaMetadataCompat = z;
    }

    public /* synthetic */ immediateFuture(String str, String str2, String str3, String str4, String str5, String str6, String str7, makeChecked makechecked) {
        this(str, str2, str3, str4, str5, str6, str7, makechecked, true);
    }
}

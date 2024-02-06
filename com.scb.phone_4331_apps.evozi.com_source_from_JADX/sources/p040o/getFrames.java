package p040o;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.getFrames */
public final class getFrames implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getFrames$MediaBrowserCompat$CustomActionResultReceiver();
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaMetadataCompat;
    private final ComponentFactory RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFrames)) {
            return false;
        }
        getFrames getframes = (getFrames) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getframes.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getframes.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getframes.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getframes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getframes.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getframes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getframes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getframes.RatingCompat);
    }

    public final int hashCode() {
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        ComponentFactory componentFactory = this.RatingCompat;
        if (componentFactory != null) {
            i = componentFactory.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchaseCcSofVerificationDisplay(transactionToken=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", partnerSubType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", cardIconUrl=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", fee=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", cardHolderName=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", email=");
        sb.append(this.write);
        sb.append(", remark=");
        sb.append(this.read);
        sb.append(", merchantMetaData=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeParcelable(this.RatingCompat, i);
    }

    public getFrames(String str, String str2, String str3, String str4, String str5, String str6, String str7, ComponentFactory componentFactory) {
        onGetStartedClick.write((Object) str, "transactionToken");
        onGetStartedClick.write((Object) str2, "partnerSubType");
        onGetStartedClick.write((Object) str3, "cardIconUrl");
        onGetStartedClick.write((Object) str4, "fee");
        onGetStartedClick.write((Object) str5, "cardHolderName");
        this.MediaMetadataCompat = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.write = str6;
        this.read = str7;
        this.RatingCompat = componentFactory;
    }
}

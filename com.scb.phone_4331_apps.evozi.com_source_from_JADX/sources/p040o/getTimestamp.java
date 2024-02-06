package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.getTimestamp */
public final class getTimestamp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new getTimestamp$MediaBrowserCompat$ItemReceiver();
    public final double IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final double MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final List<String> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2857x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    private final String MediaSessionCompat$ResultReceiverWrapper;
    public final double RatingCompat;
    public final String read;
    public final String write;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getTimestamp)) {
            return false;
        }
        getTimestamp gettimestamp = (getTimestamp) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) gettimestamp.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) gettimestamp.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) gettimestamp.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) gettimestamp.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) gettimestamp.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$ResultReceiverWrapper, (Object) gettimestamp.MediaSessionCompat$ResultReceiverWrapper) && Double.compare(this.IconCompatParcelizer, gettimestamp.IconCompatParcelizer) == 0 && Double.compare(this.RatingCompat, gettimestamp.RatingCompat) == 0 && Double.compare(this.MediaBrowserCompat$ItemReceiver, gettimestamp.MediaBrowserCompat$ItemReceiver) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) gettimestamp.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2857x50fd9e4a, (Object) gettimestamp.f2857x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) gettimestamp.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.IconCompatParcelizer);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.RatingCompat);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaBrowserCompat$ItemReceiver);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        List<String> list = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = list != null ? list.hashCode() : 0;
        String str7 = this.f2857x50fd9e4a;
        int hashCode8 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaMetadataCompat;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidRequestVerificationDisplay(requestType=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", accountNo=");
        sb.append(this.write);
        sb.append(", accountName=");
        sb.append(this.read);
        sb.append(", displayName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", prepaidCardName=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", fee=");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append(", annualFee=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", issuingFee=");
        sb.append(this.RatingCompat);
        sb.append(", deliveryFee=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", mailingAddress=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", transactionToken=");
        sb.append(this.f2857x50fd9e4a);
        sb.append(", personalInfoRemark=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        onGetStartedClick.write((Object) parcel, "parcel");
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeDouble(this.IconCompatParcelizer);
        parcel.writeDouble(this.RatingCompat);
        parcel.writeDouble(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeStringList(this.MediaBrowserCompat$SearchResultReceiver);
        parcel.writeString(this.f2857x50fd9e4a);
        parcel.writeString(this.MediaMetadataCompat);
    }

    public getTimestamp(String str, String str2, String str3, String str4, String str5, String str6, double d, double d2, double d3, List<String> list, String str7, String str8) {
        String str9 = str5;
        String str10 = str6;
        List<String> list2 = list;
        String str11 = str7;
        String str12 = str8;
        onGetStartedClick.write((Object) str, "requestType");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "accountName");
        onGetStartedClick.write((Object) str4, "displayName");
        onGetStartedClick.write((Object) str9, "prepaidCardName");
        onGetStartedClick.write((Object) str10, "fee");
        onGetStartedClick.write((Object) list2, "mailingAddress");
        onGetStartedClick.write((Object) str11, "transactionToken");
        onGetStartedClick.write((Object) str12, "personalInfoRemark");
        this.MediaDescriptionCompat = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$MediaItem = str9;
        this.MediaSessionCompat$ResultReceiverWrapper = str10;
        this.IconCompatParcelizer = d;
        this.RatingCompat = d2;
        this.MediaBrowserCompat$ItemReceiver = d3;
        this.MediaBrowserCompat$SearchResultReceiver = list2;
        this.f2857x50fd9e4a = str11;
        this.MediaMetadataCompat = str12;
    }
}

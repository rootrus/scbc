package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: o.AutoValue_CrashlyticsReport_CustomAttribute */
public class AutoValue_CrashlyticsReport_CustomAttribute extends remainingCapacity implements Parcelable {
    public static final Parcelable.Creator<AutoValue_CrashlyticsReport_CustomAttribute> CREATOR = new Parcelable.Creator<AutoValue_CrashlyticsReport_CustomAttribute>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new AutoValue_CrashlyticsReport_CustomAttribute(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new AutoValue_CrashlyticsReport_CustomAttribute[i];
        }
    };
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2671x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public String MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public String PlaybackStateCompat;
    public String RatingCompat;
    public List<String> read;

    public int describeContents() {
        return 0;
    }

    public AutoValue_CrashlyticsReport_CustomAttribute() {
    }

    protected AutoValue_CrashlyticsReport_CustomAttribute(Parcel parcel) {
        this.Keep = parcel.readString();
        this.PlaybackStateCompat = parcel.readString();
        this.MediaDescriptionCompat = parcel.readString();
        this.MediaSessionCompat$QueueItem = parcel.readString();
        this.RatingCompat = parcel.readString();
        this.ParcelableVolumeInfo = parcel.readString();
        this.MediaMetadataCompat = parcel.readString();
        this.MediaSessionCompat$ResultReceiverWrapper = parcel.readString();
        this.MediaBrowserCompat$CustomActionResultReceiver = parcel.readString();
        this.MediaSessionCompat$Token = parcel.readString();
        this.MediaBrowserCompat$ItemReceiver = parcel.readString();
        this.MediaBrowserCompat$MediaItem = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        this.f2671x50fd9e4a = parcel.readString();
        this.read = parcel.createStringArrayList();
        this.MediaBrowserCompat$SearchResultReceiver = parcel.readString();
    }

    /* renamed from: o.AutoValue_CrashlyticsReport_CustomAttribute$Builder */
    public final class Builder extends remainingCapacity {
        public setSession IconCompatParcelizer;
        public AutoValue_CrashlyticsReport_CustomAttribute Keep;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public AutoValue_CrashlyticsReport_CustomAttribute MediaBrowserCompat$ItemReceiver;
        public setKey MediaBrowserCompat$MediaItem;
        public C30581 MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public getOrgId f2672x50fd9e4a;
        public AutoValue_CrashlyticsReport_CustomAttribute MediaDescriptionCompat;
        public setPlatform MediaMetadataCompat;
        public String MediaSessionCompat$QueueItem;
        public setOrgId MediaSessionCompat$ResultReceiverWrapper;
        public String MediaSessionCompat$Token;
        public boolean ParcelableVolumeInfo;
        public List<String> RatingCompat;
        public C10863setSdkVersion read;

        public static Builder read() {
            return new Builder();
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.Keep);
        parcel.writeString(this.PlaybackStateCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(this.MediaSessionCompat$QueueItem);
        parcel.writeString(this.RatingCompat);
        parcel.writeString(this.ParcelableVolumeInfo);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.MediaSessionCompat$ResultReceiverWrapper);
        parcel.writeString(this.MediaBrowserCompat$CustomActionResultReceiver);
        parcel.writeString(this.MediaSessionCompat$Token);
        parcel.writeString(this.MediaBrowserCompat$ItemReceiver);
        parcel.writeString(this.MediaBrowserCompat$MediaItem);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.f2671x50fd9e4a);
        parcel.writeStringList(this.read);
        parcel.writeString(this.MediaBrowserCompat$SearchResultReceiver);
    }

    public static AutoValue_CrashlyticsReport_CustomAttribute read() {
        return new AutoValue_CrashlyticsReport_CustomAttribute();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = (AutoValue_CrashlyticsReport_CustomAttribute) obj;
        String str = this.Keep;
        if (str == null ? autoValue_CrashlyticsReport_CustomAttribute.Keep != null : !str.equals(autoValue_CrashlyticsReport_CustomAttribute.Keep)) {
            return false;
        }
        String str2 = this.PlaybackStateCompat;
        if (str2 == null ? autoValue_CrashlyticsReport_CustomAttribute.PlaybackStateCompat != null : !str2.equals(autoValue_CrashlyticsReport_CustomAttribute.PlaybackStateCompat)) {
            return false;
        }
        String str3 = this.MediaDescriptionCompat;
        if (str3 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat != null : !str3.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat)) {
            return false;
        }
        String str4 = this.MediaSessionCompat$QueueItem;
        if (str4 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$QueueItem != null : !str4.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$QueueItem)) {
            return false;
        }
        String str5 = this.RatingCompat;
        if (str5 == null ? autoValue_CrashlyticsReport_CustomAttribute.RatingCompat != null : !str5.equals(autoValue_CrashlyticsReport_CustomAttribute.RatingCompat)) {
            return false;
        }
        String str6 = this.ParcelableVolumeInfo;
        if (str6 == null ? autoValue_CrashlyticsReport_CustomAttribute.ParcelableVolumeInfo != null : !str6.equals(autoValue_CrashlyticsReport_CustomAttribute.ParcelableVolumeInfo)) {
            return false;
        }
        String str7 = this.MediaMetadataCompat;
        if (str7 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaMetadataCompat != null : !str7.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaMetadataCompat)) {
            return false;
        }
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str8 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$ResultReceiverWrapper != null : !str8.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str9 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver != null : !str9.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str10 = this.MediaSessionCompat$Token;
        if (str10 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$Token != null : !str10.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$Token)) {
            return false;
        }
        String str11 = this.MediaBrowserCompat$ItemReceiver;
        if (str11 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$ItemReceiver != null : !str11.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str12 = this.MediaBrowserCompat$MediaItem;
        if (str12 == null ? autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem != null : !str12.equals(autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str13 = this.IconCompatParcelizer;
        if (str13 == null ? autoValue_CrashlyticsReport_CustomAttribute.IconCompatParcelizer != null : !str13.equals(autoValue_CrashlyticsReport_CustomAttribute.IconCompatParcelizer)) {
            return false;
        }
        String str14 = this.f2671x50fd9e4a;
        if (str14 == null ? autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a != null : !str14.equals(autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a)) {
            return false;
        }
        List<String> list = this.read;
        if (list == null ? autoValue_CrashlyticsReport_CustomAttribute.read != null : !list.equals(autoValue_CrashlyticsReport_CustomAttribute.read)) {
            return false;
        }
        String str15 = this.MediaBrowserCompat$SearchResultReceiver;
        String str16 = autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$SearchResultReceiver;
        if (str15 != null) {
            return str15.equals(str16);
        }
        if (str16 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.Keep;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.PlaybackStateCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaSessionCompat$QueueItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.ParcelableVolumeInfo;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$Token;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaBrowserCompat$MediaItem;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        String str13 = this.IconCompatParcelizer;
        int hashCode13 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.f2671x50fd9e4a;
        int hashCode14 = str14 != null ? str14.hashCode() : 0;
        List<String> list = this.read;
        int hashCode15 = list != null ? list.hashCode() : 0;
        String str15 = this.MediaBrowserCompat$SearchResultReceiver;
        return (((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + (str15 != null ? str15.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EkycAddressDisplay{floorNumber='");
        sb.append(this.Keep);
        sb.append('\'');
        sb.append(", unitNumber='");
        sb.append(this.PlaybackStateCompat);
        sb.append('\'');
        sb.append(", addressNumber='");
        sb.append(this.MediaDescriptionCompat);
        sb.append('\'');
        sb.append(", addressVillage='");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append('\'');
        sb.append(", addressMoo='");
        sb.append(this.RatingCompat);
        sb.append('\'');
        sb.append(", addressTrok='");
        sb.append(this.ParcelableVolumeInfo);
        sb.append('\'');
        sb.append(", addressSoi='");
        sb.append(this.MediaMetadataCompat);
        sb.append('\'');
        sb.append(", addressThanon='");
        sb.append(this.MediaSessionCompat$ResultReceiverWrapper);
        sb.append('\'');
        sb.append(", addressDistrict='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", addressState='");
        sb.append(this.MediaSessionCompat$Token);
        sb.append('\'');
        sb.append(", addressAmphur='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append(", addressProvince='");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append('\'');
        sb.append(", addressCountryCode='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", addressZipCode='");
        sb.append(this.f2671x50fd9e4a);
        sb.append('\'');
        sb.append(", addressFormatted=");
        sb.append(this.read);
        sb.append(", addressFormattedString='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

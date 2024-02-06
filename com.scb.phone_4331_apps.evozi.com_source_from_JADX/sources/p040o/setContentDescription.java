package p040o;

import java.util.List;

/* renamed from: o.setContentDescription */
public final class setContentDescription {
    public final List<String> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final zzui<String> MediaBrowserCompat$ItemReceiver;
    public final zzui<String> MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String f2935x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$Token;
    public final String ParcelableVolumeInfo;
    public final String RatingCompat;
    public final zzui<String> read;
    public final String write;

    /* renamed from: o.setContentDescription$write */
    public enum write {
        WORK,
        MAILING,
        HOME,
        BUSINESS
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setContentDescription)) {
            return false;
        }
        setContentDescription setcontentdescription = (setContentDescription) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$QueueItem, (Object) setcontentdescription.MediaSessionCompat$QueueItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.f2935x50fd9e4a, (Object) setcontentdescription.f2935x50fd9e4a) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.ParcelableVolumeInfo, (Object) setcontentdescription.ParcelableVolumeInfo) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcontentdescription.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setcontentdescription.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcontentdescription.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setcontentdescription.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setcontentdescription.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setcontentdescription.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) setcontentdescription.MediaSessionCompat$Token) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcontentdescription.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcontentdescription.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setcontentdescription.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcontentdescription.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaSessionCompat$QueueItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f2935x50fd9e4a;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ParcelableVolumeInfo;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.RatingCompat;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$Token;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        zzui<String> zzui = this.MediaBrowserCompat$ItemReceiver;
        int hashCode11 = zzui != null ? zzui.hashCode() : 0;
        zzui<String> zzui2 = this.read;
        int hashCode12 = zzui2 != null ? zzui2.hashCode() : 0;
        zzui<String> zzui3 = this.MediaBrowserCompat$MediaItem;
        int hashCode13 = zzui3 != null ? zzui3.hashCode() : 0;
        List<String> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address(floorNumber=");
        sb.append(this.MediaSessionCompat$QueueItem);
        sb.append(", formatCode=");
        sb.append(this.f2935x50fd9e4a);
        sb.append(", unitNumber=");
        sb.append(this.ParcelableVolumeInfo);
        sb.append(", addressNumber=");
        sb.append(this.write);
        sb.append(", addressVillage=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", addressMoo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", addressTrok=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", addressSoi=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", addressThanon=");
        sb.append(this.RatingCompat);
        sb.append(", addressZipCode=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(", addressDistrict=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", addressAmphur=");
        sb.append(this.read);
        sb.append(", addressProvince=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", addressFormatted=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setContentDescription(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, zzui<String> zzui, zzui<String> zzui2, zzui<String> zzui3, List<String> list) {
        onGetStartedClick.write((Object) list, "addressFormatted");
        this.MediaSessionCompat$QueueItem = str;
        this.f2935x50fd9e4a = str2;
        this.ParcelableVolumeInfo = str3;
        this.write = str4;
        this.MediaMetadataCompat = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.MediaDescriptionCompat = str7;
        this.MediaBrowserCompat$SearchResultReceiver = str8;
        this.RatingCompat = str9;
        this.MediaSessionCompat$Token = str10;
        this.MediaBrowserCompat$ItemReceiver = zzui;
        this.read = zzui2;
        this.MediaBrowserCompat$MediaItem = zzui3;
        this.IconCompatParcelizer = list;
    }
}

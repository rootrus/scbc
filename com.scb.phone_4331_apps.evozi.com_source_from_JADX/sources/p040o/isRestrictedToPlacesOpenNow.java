package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.isRestrictedToPlacesOpenNow */
public class isRestrictedToPlacesOpenNow extends zzuk {
    @SerializedName("adsType")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("id")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("linkTH")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("url")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("name")
    public String MediaDescriptionCompat;
    @SerializedName("urlEN")
    public String MediaMetadataCompat;
    @SerializedName("mboxName")
    public String RatingCompat;
    @SerializedName("fontColor")
    public String read;
    @SerializedName("linkEN")
    public String write;

    public /* synthetic */ isRestrictedToPlacesOpenNow() {
    }

    public isRestrictedToPlacesOpenNow(String str, String str2, String str3, String str4, String str5) {
        this.MediaDescriptionCompat = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.MediaMetadataCompat = str4;
        this.read = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = (isRestrictedToPlacesOpenNow) obj;
        String str = this.MediaDescriptionCompat;
        if (str == null ? isrestrictedtoplacesopennow.MediaDescriptionCompat != null : !str.equals(isrestrictedtoplacesopennow.MediaDescriptionCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver != null : !str2.equals(isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null ? isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver != null : !str3.equals(isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str4 = this.MediaMetadataCompat;
        if (str4 == null ? isrestrictedtoplacesopennow.MediaMetadataCompat != null : !str4.equals(isrestrictedtoplacesopennow.MediaMetadataCompat)) {
            return false;
        }
        String str5 = this.read;
        if (str5 == null ? isrestrictedtoplacesopennow.read != null : !str5.equals(isrestrictedtoplacesopennow.read)) {
            return false;
        }
        String str6 = this.write;
        if (str6 == null ? isrestrictedtoplacesopennow.write != null : !str6.equals(isrestrictedtoplacesopennow.write)) {
            return false;
        }
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str7 == null ? isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver != null : !str7.equals(isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str8 = this.RatingCompat;
        if (str8 == null ? isrestrictedtoplacesopennow.RatingCompat != null : !str8.equals(isrestrictedtoplacesopennow.RatingCompat)) {
            return false;
        }
        String str9 = this.MediaBrowserCompat$MediaItem;
        String str10 = isrestrictedtoplacesopennow.MediaBrowserCompat$MediaItem;
        if (str9 != null) {
            return str9.equals(str10);
        }
        if (str10 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$MediaItem;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.RatingCompat;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }
}

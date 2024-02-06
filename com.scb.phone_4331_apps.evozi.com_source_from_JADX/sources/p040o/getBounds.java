package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getBounds */
public class getBounds {
    @SerializedName("language")
    public String IconCompatParcelizer;
    @SerializedName("email")
    public String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("lastName")
    public String MediaBrowserCompat$ItemReceiver;
    @SerializedName("mobileNo")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("pinFlag")
    public String MediaMetadataCompat;
    @SerializedName("name")
    public String RatingCompat;
    @SerializedName("ekyc")
    public getCharacters read;
    @SerializedName("avatar")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getBounds getbounds = (getBounds) obj;
        String str = this.RatingCompat;
        if (str == null ? getbounds.RatingCompat != null : !str.equals(getbounds.RatingCompat)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? getbounds.MediaBrowserCompat$ItemReceiver != null : !str2.equals(getbounds.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 == null ? getbounds.MediaBrowserCompat$CustomActionResultReceiver != null : !str3.equals(getbounds.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$MediaItem;
        if (str4 == null ? getbounds.MediaBrowserCompat$MediaItem != null : !str4.equals(getbounds.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str5 = this.IconCompatParcelizer;
        if (str5 == null ? getbounds.IconCompatParcelizer != null : !str5.equals(getbounds.IconCompatParcelizer)) {
            return false;
        }
        String str6 = this.write;
        if (str6 == null ? getbounds.write != null : !str6.equals(getbounds.write)) {
            return false;
        }
        String str7 = this.MediaMetadataCompat;
        if (str7 == null ? getbounds.MediaMetadataCompat != null : !str7.equals(getbounds.MediaMetadataCompat)) {
            return false;
        }
        getCharacters getcharacters = this.read;
        getCharacters getcharacters2 = getbounds.read;
        if (getcharacters != null) {
            return getcharacters.equals(getcharacters2);
        }
        if (getcharacters2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.RatingCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$MediaItem;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.write;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        getCharacters getcharacters = this.read;
        if (getcharacters != null) {
            i = getcharacters.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }
}

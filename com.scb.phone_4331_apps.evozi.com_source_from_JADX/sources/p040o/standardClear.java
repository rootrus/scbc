package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.standardClear */
public final class standardClear {
    @SerializedName("deviceId")
    private String IconCompatParcelizer;
    @SerializedName("jailbreak")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("deviceToken")
    private String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tokenType")
    private String MediaBrowserCompat$MediaItem;
    @SerializedName("mobileNo")
    private String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("preregistrationTokenId")
    private String MediaDescriptionCompat;
    @SerializedName("os")
    private String MediaMetadataCompat;
    @SerializedName("model")
    private String RatingCompat;
    @SerializedName("juristicState")
    private String read;
    @SerializedName("brand")
    private String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardClear)) {
            return false;
        }
        standardClear standardclear = (standardClear) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) standardclear.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) standardclear.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardclear.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) standardclear.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) standardclear.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) standardclear.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardclear.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) standardclear.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardclear.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) standardclear.MediaBrowserCompat$MediaItem);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.RatingCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaDescriptionCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaBrowserCompat$MediaItem;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicVerifyOtpRequest(deviceId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", brand=");
        sb.append(this.write);
        sb.append(", model=");
        sb.append(this.RatingCompat);
        sb.append(", os=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", jailbreak=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", juristicState=");
        sb.append(this.read);
        sb.append(", preregistrationTokenId=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", deviceToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tokenType=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(")");
        return sb.toString();
    }

    public standardClear(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        onGetStartedClick.write((Object) str, "deviceId");
        onGetStartedClick.write((Object) str2, "mobileNo");
        onGetStartedClick.write((Object) str7, "juristicState");
        onGetStartedClick.write((Object) str8, "preregistrationTokenId");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.write = str3;
        this.RatingCompat = str4;
        this.MediaMetadataCompat = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.read = str7;
        this.MediaDescriptionCompat = str8;
        this.MediaBrowserCompat$ItemReceiver = str9;
        this.MediaBrowserCompat$MediaItem = str10;
    }
}

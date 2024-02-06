package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getLatLngBoundsForCameraTarget */
public final class getLatLngBoundsForCameraTarget {
    @SerializedName("brand")
    private final String IconCompatParcelizer;
    @SerializedName("jailbreak")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("encryptPin")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("tcAccept")
    private final addCopies MediaBrowserCompat$MediaItem;
    @SerializedName("mobileNo")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("tag")
    private final String MediaDescriptionCompat;
    @SerializedName("model")
    private final String MediaMetadataCompat;
    @SerializedName("tilesVersion")
    private final String MediaSessionCompat$Token;
    @SerializedName("os")
    private final String RatingCompat;
    @SerializedName("e2eeSid")
    private final String read;
    @SerializedName("deviceId")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getLatLngBoundsForCameraTarget)) {
            return false;
        }
        getLatLngBoundsForCameraTarget getlatlngboundsforcameratarget = (getLatLngBoundsForCameraTarget) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getlatlngboundsforcameratarget.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getlatlngboundsforcameratarget.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getlatlngboundsforcameratarget.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getlatlngboundsforcameratarget.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getlatlngboundsforcameratarget.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getlatlngboundsforcameratarget.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getlatlngboundsforcameratarget.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getlatlngboundsforcameratarget.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getlatlngboundsforcameratarget.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getlatlngboundsforcameratarget.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaSessionCompat$Token, (Object) getlatlngboundsforcameratarget.MediaSessionCompat$Token);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaMetadataCompat;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.read;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        addCopies addcopies = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = addcopies != null ? addcopies.hashCode() : 0;
        String str9 = this.MediaDescriptionCompat;
        int hashCode10 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$Token;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return (((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RegistrationNewPinRequest(deviceId=");
        sb.append(this.write);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", brand=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", model=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", os=");
        sb.append(this.RatingCompat);
        sb.append(", jailbreak=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", e2eeSid=");
        sb.append(this.read);
        sb.append(", encryptPin=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tcAccept=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", tag=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", tilesVersion=");
        sb.append(this.MediaSessionCompat$Token);
        sb.append(")");
        return sb.toString();
    }

    public getLatLngBoundsForCameraTarget(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, addCopies addcopies, String str9, String str10) {
        onGetStartedClick.write((Object) str, "deviceId");
        onGetStartedClick.write((Object) str3, "brand");
        onGetStartedClick.write((Object) str4, "model");
        onGetStartedClick.write((Object) str5, "os");
        onGetStartedClick.write((Object) str6, "jailbreak");
        onGetStartedClick.write((Object) str7, "e2eeSid");
        onGetStartedClick.write((Object) str8, "encryptPin");
        onGetStartedClick.write((Object) str10, "tilesVersion");
        this.write = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.MediaMetadataCompat = str4;
        this.RatingCompat = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
        this.read = str7;
        this.MediaBrowserCompat$ItemReceiver = str8;
        this.MediaBrowserCompat$MediaItem = addcopies;
        this.MediaDescriptionCompat = str9;
        this.MediaSessionCompat$Token = str10;
    }
}

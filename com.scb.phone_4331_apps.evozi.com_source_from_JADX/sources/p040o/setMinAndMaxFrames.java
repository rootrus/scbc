package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setMinAndMaxFrames */
public final class setMinAndMaxFrames {
    @SerializedName("applicationDisplayNameTh")
    String IconCompatParcelizer;
    @SerializedName("icon")
    String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("application")
    String MediaBrowserCompat$ItemReceiver;
    @SerializedName("organization")
    String MediaBrowserCompat$MediaItem;
    @SerializedName("organizationDisplayNameEn")
    String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("organizationDisplayNameTh")
    String MediaDescriptionCompat;
    @SerializedName("organizationId")
    String RatingCompat;
    @SerializedName("applicationDisplayNameEn")
    String read;
    @SerializedName("applicationId")
    String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMinAndMaxFrames)) {
            return false;
        }
        setMinAndMaxFrames setminandmaxframes = (setMinAndMaxFrames) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setminandmaxframes.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setminandmaxframes.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setminandmaxframes.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setminandmaxframes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setminandmaxframes.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setminandmaxframes.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setminandmaxframes.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setminandmaxframes.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setminandmaxframes.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$MediaItem;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaDescriptionCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InformationEntity(application=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", applicationDisplayNameTh=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", applicationDisplayNameEn=");
        sb.append(this.read);
        sb.append(", applicationId=");
        sb.append(this.write);
        sb.append(", organization=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", organizationDisplayNameTh=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", organizationDisplayNameEn=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", organizationId=");
        sb.append(this.RatingCompat);
        sb.append(", icon=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

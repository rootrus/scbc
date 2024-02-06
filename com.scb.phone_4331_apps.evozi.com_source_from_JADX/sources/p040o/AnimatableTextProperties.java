package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.AnimatableTextProperties */
public final class AnimatableTextProperties {
    @SerializedName("maximumPrincipal")
    public final String IconCompatParcelizer;
    @SerializedName("simulatorDescription")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("principalStepSize")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("simulatorTitle")
    public final String MediaDescriptionCompat;
    @SerializedName("simulatorEnableFlag")
    public final String RatingCompat;
    @SerializedName("minimumPrincipal")
    public final String read;
    @SerializedName("iconPath")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnimatableTextProperties)) {
            return false;
        }
        AnimatableTextProperties animatableTextProperties = (AnimatableTextProperties) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) animatableTextProperties.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) animatableTextProperties.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) animatableTextProperties.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) animatableTextProperties.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) animatableTextProperties.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) animatableTextProperties.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) animatableTextProperties.RatingCompat);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.RatingCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpsellConfigEntity(iconPath=");
        sb.append(this.write);
        sb.append(", simulatorTitle=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", simulatorDescription=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", minimumPrincipal=");
        sb.append(this.read);
        sb.append(", maximumPrincipal=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", principalStepSize=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", simulatorEnableFlag=");
        sb.append(this.RatingCompat);
        sb.append(")");
        return sb.toString();
    }
}

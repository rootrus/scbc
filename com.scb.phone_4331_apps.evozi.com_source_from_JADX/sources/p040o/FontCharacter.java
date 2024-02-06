package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.FontCharacter */
public final class FontCharacter {
    @SerializedName("backgroundImageUrl")
    public final getInterpolatedCurrentKeyframeProgress IconCompatParcelizer;
    @SerializedName("gracePeriodHideFlag")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("installmentFrequency")
    public final List<FontAssetManager> MediaBrowserCompat$ItemReceiver;
    @SerializedName("productCatalogue")
    public final getEndPoint MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("minimumPrincipal")
    public final double MediaDescriptionCompat;
    @SerializedName("principalStepSize")
    public final double MediaMetadataCompat;
    @SerializedName("title")
    public final String RatingCompat;
    @SerializedName("description")
    public final String read;
    @SerializedName("maximumPrincipal")
    public final double write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FontCharacter)) {
            return false;
        }
        FontCharacter fontCharacter = (FontCharacter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fontCharacter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) fontCharacter.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fontCharacter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fontCharacter.MediaBrowserCompat$CustomActionResultReceiver) && Double.compare(this.MediaDescriptionCompat, fontCharacter.MediaDescriptionCompat) == 0 && Double.compare(this.write, fontCharacter.write) == 0 && Double.compare(this.MediaMetadataCompat, fontCharacter.MediaMetadataCompat) == 0 && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fontCharacter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) fontCharacter.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        getInterpolatedCurrentKeyframeProgress getinterpolatedcurrentkeyframeprogress = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = getinterpolatedcurrentkeyframeprogress != null ? getinterpolatedcurrentkeyframeprogress.hashCode() : 0;
        String str = this.RatingCompat;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        long doubleToLongBits = Double.doubleToLongBits(this.MediaDescriptionCompat);
        int i2 = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.write);
        int i3 = (int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32));
        long doubleToLongBits3 = Double.doubleToLongBits(this.MediaMetadataCompat);
        int i4 = (int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32));
        List<FontAssetManager> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = list != null ? list.hashCode() : 0;
        getEndPoint getendpoint = this.MediaBrowserCompat$SearchResultReceiver;
        if (getendpoint != null) {
            i = getendpoint.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlSimulatorEntity(background=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", title=");
        sb.append(this.RatingCompat);
        sb.append(", description=");
        sb.append(this.read);
        sb.append(", gracePeriodHideFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", minimumPrincipal=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", maximumPrincipal=");
        sb.append(this.write);
        sb.append(", principalStepSize=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", installmentFrequency=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", productCatalogue=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

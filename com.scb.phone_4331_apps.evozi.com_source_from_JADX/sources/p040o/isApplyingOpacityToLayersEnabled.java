package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.isApplyingOpacityToLayersEnabled */
public final class isApplyingOpacityToLayersEnabled {
    @SerializedName("accountSubTypeDesc")
    public final String IconCompatParcelizer;
    @SerializedName("accountName")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountTypeDesc")
    public final String MediaDescriptionCompat;
    @SerializedName("allowTag")
    public final List<String> MediaMetadataCompat;
    @SerializedName("nickname")
    public final String RatingCompat;
    @SerializedName("accountSubType")
    public final String read;
    @SerializedName("accountType")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isApplyingOpacityToLayersEnabled)) {
            return false;
        }
        isApplyingOpacityToLayersEnabled isapplyingopacitytolayersenabled = (isApplyingOpacityToLayersEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) isapplyingopacitytolayersenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) isapplyingopacitytolayersenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) isapplyingopacitytolayersenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) isapplyingopacitytolayersenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) isapplyingopacitytolayersenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) isapplyingopacitytolayersenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) isapplyingopacitytolayersenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) isapplyingopacitytolayersenabled.MediaMetadataCompat);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaDescriptionCompat;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        List<String> list = this.MediaMetadataCompat;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashAccountEntity(accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountType=");
        sb.append(this.write);
        sb.append(", accountTypeDesc=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", accountSubType=");
        sb.append(this.read);
        sb.append(", accountSubTypeDesc=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", nickname=");
        sb.append(this.RatingCompat);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", allowTag=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }
}

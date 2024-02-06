package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.setColorFilter */
public final class setColorFilter {
    @SerializedName("accountSubType")
    public final String IconCompatParcelizer;
    @SerializedName("accountNo")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountSubTypeDesc")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("debitCards")
    public final List<getTypeface> MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("nickname")
    public final String MediaDescriptionCompat;
    @SerializedName("accountTypeDesc")
    public final String RatingCompat;
    @SerializedName("accountType")
    public final String read;
    @SerializedName("accountName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setColorFilter)) {
            return false;
        }
        setColorFilter setcolorfilter = (setColorFilter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcolorfilter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcolorfilter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcolorfilter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setcolorfilter.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcolorfilter.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setcolorfilter.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setcolorfilter.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setcolorfilter.MediaDescriptionCompat);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        List<getTypeface> list = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode7 = list != null ? list.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashFeatureAccountEntity(accountName=");
        sb.append(this.write);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountSubType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountSubTypeDesc=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountType=");
        sb.append(this.read);
        sb.append(", accountTypeDesc=");
        sb.append(this.RatingCompat);
        sb.append(", debitCards=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", nickname=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(")");
        return sb.toString();
    }
}

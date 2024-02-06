package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.Comparator;
import java.util.List;
import p040o.zzcb;

/* renamed from: o.updateBounds */
public final class updateBounds {
    @SerializedName("flowType")
    public final String IconCompatParcelizer;
    @SerializedName("minimumIncome")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("monthlyIncome")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("state")
    public final String MediaBrowserCompat$MediaItem;
    @SerializedName("tiles")
    public final List<endAnimation> MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("productGroup")
    public final String MediaMetadataCompat;
    @SerializedName("repaymentAbility")
    public final String RatingCompat;
    @SerializedName("ncbConsent")
    public final String read;
    @SerializedName("minimumAmount")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateBounds)) {
            return false;
        }
        updateBounds updatebounds = (updateBounds) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) updatebounds.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) updatebounds.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) updatebounds.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) updatebounds.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) updatebounds.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) updatebounds.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) updatebounds.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) updatebounds.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) updatebounds.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.read;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.RatingCompat;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        List<endAnimation> list = this.MediaBrowserCompat$SearchResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditPowerLandingEntity(minimumIncome=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", minimumAmount=");
        sb.append(this.write);
        sb.append(", state=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", flowType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productGroup=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", ncbConsent=");
        sb.append(this.read);
        sb.append(", monthlyIncome=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentAbility=");
        sb.append(this.RatingCompat);
        sb.append(", tiles=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.updateBounds$write */
    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable comparable = ((zzcb.zzf) t).f2986x50fd9e4a;
            Comparable comparable2 = ((zzcb.zzf) t2).f2986x50fd9e4a;
            if (comparable == comparable2) {
                return 0;
            }
            if (comparable == null) {
                return -1;
            }
            if (comparable2 == null) {
                return 1;
            }
            return comparable.compareTo(comparable2);
        }
    }
}

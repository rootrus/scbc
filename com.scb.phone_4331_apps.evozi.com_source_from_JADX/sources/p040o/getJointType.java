package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* renamed from: o.getJointType */
public final class getJointType {
    public final boolean IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final List<String> MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final String RatingCompat;
    public final boolean read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getJointType)) {
            return false;
        }
        getJointType getjointtype = (getJointType) obj;
        return this.IconCompatParcelizer == getjointtype.IconCompatParcelizer && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) getjointtype.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getjointtype.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getjointtype.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getjointtype.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) getjointtype.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getjointtype.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getjointtype.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) getjointtype.MediaDescriptionCompat) && this.read == getjointtype.read;
    }

    public final int hashCode() {
        boolean z = this.IconCompatParcelizer;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        String str = this.MediaMetadataCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = list != null ? list.hashCode() : 0;
        String str6 = this.write;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaDescriptionCompat;
        if (str7 != null) {
            i = str7.hashCode();
        }
        boolean z3 = this.read;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((((((((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyBody(isSeparatorVisible=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", paddingTop=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", paddingBottom=");
        sb.append(this.RatingCompat);
        sb.append(", type=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", label=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", value=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", descriptions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", image=");
        sb.append(this.write);
        sb.append(", qrString=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", isHiddenInSlip=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getJointType(boolean z, String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7, boolean z2) {
        onGetStartedClick.write((Object) str, "paddingTop");
        onGetStartedClick.write((Object) str2, "paddingBottom");
        onGetStartedClick.write((Object) str3, "type");
        onGetStartedClick.write((Object) str4, "label");
        onGetStartedClick.write((Object) str5, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        onGetStartedClick.write((Object) list, "descriptions");
        onGetStartedClick.write((Object) str6, "image");
        onGetStartedClick.write((Object) str7, "qrString");
        this.IconCompatParcelizer = z;
        this.MediaMetadataCompat = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$MediaItem = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$SearchResultReceiver = str5;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.write = str6;
        this.MediaDescriptionCompat = str7;
        this.read = z2;
    }
}

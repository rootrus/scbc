package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.onVisibilityChanged */
public final class onVisibilityChanged {
    @SerializedName("image")
    public String IconCompatParcelizer;
    @SerializedName("isHiddenInSlip")
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("description")
    public List<String> MediaBrowserCompat$ItemReceiver;
    @SerializedName("qrString")
    public String MediaBrowserCompat$MediaItem;
    @SerializedName("type")
    public String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("paddingTop")
    public String MediaDescriptionCompat;
    @SerializedName("value")
    public String MediaMetadataCompat;
    @SerializedName("paddingBottom")
    public String RatingCompat;
    @SerializedName("label")
    public String read;
    @SerializedName("hasSeparator")
    public boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onVisibilityChanged)) {
            return false;
        }
        onVisibilityChanged onvisibilitychanged = (onVisibilityChanged) obj;
        return this.write == onvisibilitychanged.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) onvisibilitychanged.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) onvisibilitychanged.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) onvisibilitychanged.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onvisibilitychanged.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) onvisibilitychanged.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onvisibilitychanged.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onvisibilitychanged.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) onvisibilitychanged.MediaBrowserCompat$MediaItem) && this.MediaBrowserCompat$CustomActionResultReceiver == onvisibilitychanged.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        boolean z = this.write;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        String str = this.MediaDescriptionCompat;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaMetadataCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode6 = list != null ? list.hashCode() : 0;
        String str6 = this.IconCompatParcelizer;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$MediaItem;
        if (str7 != null) {
            i = str7.hashCode();
        }
        boolean z3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((((((((((((z ? 1 : 0) * true) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyBodyEntity(isSeparatorVisible=");
        sb.append(this.write);
        sb.append(", paddingTop=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", paddingBottom=");
        sb.append(this.RatingCompat);
        sb.append(", type=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", label=");
        sb.append(this.read);
        sb.append(", value=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", descriptions=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", image=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", qrString=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", isHiddenInSlip=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private onVisibilityChanged(String str, String str2, String str3, String str4, String str5, List<String> list, String str6, String str7) {
        onGetStartedClick.write((Object) str, "paddingTop");
        onGetStartedClick.write((Object) str2, "paddingBottom");
        onGetStartedClick.write((Object) str3, "type");
        onGetStartedClick.write((Object) str4, "label");
        onGetStartedClick.write((Object) str5, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        onGetStartedClick.write((Object) list, "descriptions");
        onGetStartedClick.write((Object) str6, "image");
        onGetStartedClick.write((Object) str7, "qrString");
        this.write = false;
        this.MediaDescriptionCompat = str;
        this.RatingCompat = str2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.read = str4;
        this.MediaMetadataCompat = str5;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.IconCompatParcelizer = str6;
        this.MediaBrowserCompat$MediaItem = str7;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    public onVisibilityChanged() {
        this("", "", "", "", "", new ArrayList(), "", "");
    }
}

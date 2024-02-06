package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.buildCompositionLayer */
public final class buildCompositionLayer {
    @SerializedName("provinceNameEN")
    final String IconCompatParcelizer;
    @SerializedName("provinceNameTH")
    final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buildCompositionLayer)) {
            return false;
        }
        buildCompositionLayer buildcompositionlayer = (buildCompositionLayer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) buildcompositionlayer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) buildcompositionlayer.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProvinceEntity(provinceNameTH=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", provinceNameEN=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

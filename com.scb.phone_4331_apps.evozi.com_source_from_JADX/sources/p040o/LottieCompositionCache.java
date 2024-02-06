package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.LottieCompositionCache */
public final class LottieCompositionCache {
    @SerializedName("unit")
    public final String IconCompatParcelizer;
    @SerializedName("perUnit")
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieCompositionCache)) {
            return false;
        }
        LottieCompositionCache lottieCompositionCache = (LottieCompositionCache) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lottieCompositionCache.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) lottieCompositionCache.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentFrequencyEntity(unit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", perUnit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

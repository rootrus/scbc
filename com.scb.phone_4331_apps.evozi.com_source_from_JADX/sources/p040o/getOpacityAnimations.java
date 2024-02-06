package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getOpacityAnimations */
public final class getOpacityAnimations {
    @SerializedName("tnc")
    private final String IconCompatParcelizer;
    @SerializedName("model")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("crossSell")
    private final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOpacityAnimations)) {
            return false;
        }
        getOpacityAnimations getopacityanimations = (getOpacityAnimations) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getopacityanimations.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getopacityanimations.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getopacityanimations.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlConsentFlagsRequest(tnc=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", model=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", crossSell=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

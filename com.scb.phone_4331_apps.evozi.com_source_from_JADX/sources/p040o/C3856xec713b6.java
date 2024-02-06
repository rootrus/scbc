package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.TextKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3856xec713b6 {
    @SerializedName("imagePath")
    public final String IconCompatParcelizer;
    @SerializedName("details")
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3856xec713b6)) {
            return false;
        }
        C3856xec713b6 textKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver = (C3856xec713b6) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) textKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) textKeyframeAnimation$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("Instruction(imagePath=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", details=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

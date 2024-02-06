package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.getOverallProgress */
public final class getOverallProgress {
    @SerializedName("cardMask")
    public final String IconCompatParcelizer;
    @SerializedName("allowTag")
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("transactionToken")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getOverallProgress)) {
            return false;
        }
        getOverallProgress getoverallprogress = (getOverallProgress) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getoverallprogress.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getoverallprogress.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getoverallprogress.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrepaidActivationVerificationEntity(cardMask=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionToken=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", allowTag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

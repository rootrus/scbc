package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.removeAnimatorUpdateListener */
public final class removeAnimatorUpdateListener {
    @SerializedName("referenceAccounts")
    public final List<isApplyingOpacityToLayersEnabled> read;
    @SerializedName("display")
    public final List<isLooping> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeAnimatorUpdateListener)) {
            return false;
        }
        removeAnimatorUpdateListener removeanimatorupdatelistener = (removeAnimatorUpdateListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removeanimatorupdatelistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) removeanimatorupdatelistener.read);
    }

    public final int hashCode() {
        List<isLooping> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<isApplyingOpacityToLayersEnabled> list2 = this.read;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashFeatureOperativeAccountEntity(display=");
        sb.append(this.write);
        sb.append(", referenceAccounts=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

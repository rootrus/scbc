package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.removeLottieOnCompositionLoadedListener */
public final class removeLottieOnCompositionLoadedListener {
    @SerializedName("body")
    public final List<onVisibilityChanged> IconCompatParcelizer;
    @SerializedName("footer")
    public final List<removeAllUpdateListeners> MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("themeFlag")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("header")
    public final removeUpdateListener write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeLottieOnCompositionLoadedListener)) {
            return false;
        }
        removeLottieOnCompositionLoadedListener removelottieoncompositionloadedlistener = (removeLottieOnCompositionLoadedListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removelottieoncompositionloadedlistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removelottieoncompositionloadedlistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removelottieoncompositionloadedlistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) removelottieoncompositionloadedlistener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        removeUpdateListener removeupdatelistener = this.write;
        int hashCode2 = removeupdatelistener != null ? removeupdatelistener.hashCode() : 0;
        List<onVisibilityChanged> list = this.IconCompatParcelizer;
        int hashCode3 = list != null ? list.hashCode() : 0;
        List<removeAllUpdateListeners> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartySlipEntity(themeFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", header=");
        sb.append(this.write);
        sb.append(", body=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", footer=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public removeLottieOnCompositionLoadedListener(String str, removeUpdateListener removeupdatelistener, List<onVisibilityChanged> list, List<removeAllUpdateListeners> list2) {
        onGetStartedClick.write((Object) str, "themeFlag");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = removeupdatelistener;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
    }
}

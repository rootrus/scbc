package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.isCollected */
public final class isCollected {
    @SerializedName("channel")
    private final String IconCompatParcelizer;
    @SerializedName("requestType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("consent")
    private final List<expires> read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isCollected)) {
            return false;
        }
        isCollected iscollected = (isCollected) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iscollected.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iscollected.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iscollected.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<expires> list = this.read;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CSentPrivacyRequest(channel=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", consent=");
        sb.append(this.read);
        sb.append(", requestType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public isCollected(String str, List<expires> list, String str2) {
        onGetStartedClick.write((Object) str, "channel");
        onGetStartedClick.write((Object) list, "consent");
        this.IconCompatParcelizer = str;
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public /* synthetic */ isCollected(String str, List list) {
        this(str, list, (String) null);
    }
}

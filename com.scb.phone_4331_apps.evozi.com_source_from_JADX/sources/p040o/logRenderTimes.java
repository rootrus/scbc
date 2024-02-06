package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.logRenderTimes */
public final class logRenderTimes {
    @SerializedName("descriptionHeader")
    public final String IconCompatParcelizer;
    @SerializedName("header")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("description")
    public final List<clearRenderTimes> MediaBrowserCompat$ItemReceiver;
    @SerializedName("eligibility")
    public final List<removeFrameListener> write;

    public logRenderTimes() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof logRenderTimes)) {
            return false;
        }
        logRenderTimes logrendertimes = (logRenderTimes) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) logrendertimes.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) logrendertimes.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) logrendertimes.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) logrendertimes.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<removeFrameListener> list = this.write;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        List<clearRenderTimes> list2 = this.MediaBrowserCompat$ItemReceiver;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CheckEligibilityEntity(header=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", eligibility=");
        sb.append(this.write);
        sb.append(", descriptionHeader=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    private logRenderTimes(String str, List<removeFrameListener> list, String str2, List<clearRenderTimes> list2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.write = null;
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    private /* synthetic */ logRenderTimes(byte b) {
        this((String) null, (List<removeFrameListener>) null, (String) null, (List<clearRenderTimes>) null);
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ForwardingSortedSetMultimap */
public final class ForwardingSortedSetMultimap {
    @SerializedName("tilesVersion")
    public String MediaBrowserCompat$CustomActionResultReceiver = null;
    @SerializedName("requestId")
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForwardingSortedSetMultimap)) {
            return false;
        }
        ForwardingSortedSetMultimap forwardingSortedSetMultimap = (ForwardingSortedSetMultimap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) forwardingSortedSetMultimap.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) forwardingSortedSetMultimap.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("NdidIdpVerificationRequest(requestId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", tilesVersion=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public ForwardingSortedSetMultimap(String str) {
        onGetStartedClick.write((Object) str, "requestId");
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}

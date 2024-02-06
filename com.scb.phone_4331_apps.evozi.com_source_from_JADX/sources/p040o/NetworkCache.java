package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.NetworkCache */
public final class NetworkCache {
    @SerializedName("question")
    public final String IconCompatParcelizer;
    @SerializedName("questionNumber")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("section")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkCache)) {
            return false;
        }
        NetworkCache networkCache = (NetworkCache) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) networkCache.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) networkCache.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) networkCache.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SummaryQuestionEntity(section=");
        sb.append(this.read);
        sb.append(", questionNumber=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", question=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getResultFromConnection */
public final class getResultFromConnection {
    @SerializedName("insightHeader")
    public final String IconCompatParcelizer;
    @SerializedName("newInsightFlag")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getResultFromConnection)) {
            return false;
        }
        getResultFromConnection getresultfromconnection = (getResultFromConnection) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getresultfromconnection.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getresultfromconnection.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JustForYouInsightHeaderResponseEntity(newInsightFlag=");
        sb.append(this.read);
        sb.append(", insightHeader=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

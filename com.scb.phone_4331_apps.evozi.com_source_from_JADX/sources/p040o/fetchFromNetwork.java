package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fetchFromNetwork */
public final class fetchFromNetwork {
    @SerializedName("email")
    public final String IconCompatParcelizer;
    @SerializedName("transactionDateTime")
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fetchFromNetwork)) {
            return false;
        }
        fetchFromNetwork fetchfromnetwork = (fetchFromNetwork) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fetchfromnetwork.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) fetchfromnetwork.MediaBrowserCompat$CustomActionResultReceiver);
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
        sb.append("JuristicRequestFormResponseEntity(email=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", transactionDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

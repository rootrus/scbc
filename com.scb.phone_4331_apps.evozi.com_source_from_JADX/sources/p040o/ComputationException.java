package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ComputationException */
public final class ComputationException {
    @SerializedName("postingType")
    private final String IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ComputationException) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((ComputationException) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GetBankingAgentsRequest(postingType=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}

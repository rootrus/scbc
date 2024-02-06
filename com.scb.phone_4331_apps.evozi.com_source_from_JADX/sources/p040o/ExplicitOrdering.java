package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ExplicitOrdering */
public final class ExplicitOrdering {
    @SerializedName("resetPinTokenId")
    private String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ExplicitOrdering) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((ExplicitOrdering) obj).write);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicResetPinOtpRequest(resetPinTokenId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public ExplicitOrdering(String str) {
        onGetStartedClick.write((Object) str, "resetPinTokenId");
        this.write = str;
    }
}

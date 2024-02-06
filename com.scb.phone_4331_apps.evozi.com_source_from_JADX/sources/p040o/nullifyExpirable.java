package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.nullifyExpirable */
public final class nullifyExpirable {
    @SerializedName("transactionToken")
    private final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof nullifyExpirable) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((nullifyExpirable) obj).write);
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
        sb.append("CloseAccountConfirmationRequest(transactionToken=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public nullifyExpirable(String str) {
        onGetStartedClick.write((Object) str, "transactionToken");
        this.write = str;
    }
}

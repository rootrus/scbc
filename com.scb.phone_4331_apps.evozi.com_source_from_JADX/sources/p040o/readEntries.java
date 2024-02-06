package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.readEntries */
public final class readEntries {
    @SerializedName("transactionToken")
    private String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof readEntries) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((readEntries) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitRegistrationConfirmRequest(transactionToken=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public readEntries(String str) {
        onGetStartedClick.write((Object) str, "transactionToken");
        this.read = str;
    }
}

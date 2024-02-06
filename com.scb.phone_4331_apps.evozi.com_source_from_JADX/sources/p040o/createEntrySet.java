package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.createEntrySet */
public final class createEntrySet {
    @SerializedName("accountNo")
    private final String write;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof createEntrySet) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((createEntrySet) obj).write);
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
        sb.append("AccountNo(accountNo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public createEntrySet(String str) {
        this.write = str;
    }
}

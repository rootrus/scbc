package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fromJsonStringSync */
public final class fromJsonStringSync extends zzuk {
    @SerializedName("transactionToken")
    public final String read;
    @SerializedName("accountFromName")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromJsonStringSync)) {
            return false;
        }
        fromJsonStringSync fromjsonstringsync = (fromJsonStringSync) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromjsonstringsync.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fromjsonstringsync.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitVerificationEntity(transactionToken=");
        sb.append(this.read);
        sb.append(", accountFromName=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.fromJsonReaderSync */
public final class fromJsonReaderSync {
    @SerializedName("transactionId")
    public final String read;
    @SerializedName("transactionDateTime")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fromJsonReaderSync)) {
            return false;
        }
        fromJsonReaderSync fromjsonreadersync = (fromJsonReaderSync) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) fromjsonreadersync.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fromjsonreadersync.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DirectDebitConfirmRegistrationEntity(transactionDateTime=");
        sb.append(this.write);
        sb.append(", transactionId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

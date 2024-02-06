package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.uncaughtException */
public final class uncaughtException {
    @SerializedName("accountNumber")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("bankCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountName")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uncaughtException)) {
            return false;
        }
        uncaughtException uncaughtexception = (uncaughtException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) uncaughtexception.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) uncaughtexception.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) uncaughtexception.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountEntity(accountNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountName=");
        sb.append(this.write);
        sb.append(", bankCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

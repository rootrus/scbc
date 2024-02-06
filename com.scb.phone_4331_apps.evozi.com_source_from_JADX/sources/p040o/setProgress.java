package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setProgress */
public final class setProgress {
    @SerializedName("transactionId")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("transactionDateTime")
    public final String read;
    @SerializedName("remainingBalance")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setProgress)) {
            return false;
        }
        setProgress setprogress = (setProgress) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setprogress.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setprogress.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setprogress.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardConfirmationEntity(transactionDateTime=");
        sb.append(this.read);
        sb.append(", transactionId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", remainingBalance=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

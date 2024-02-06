package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.applyTrimPathIfNeeded */
public final class applyTrimPathIfNeeded {
    @SerializedName("accountNumber")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("name")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("logo")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof applyTrimPathIfNeeded)) {
            return false;
        }
        applyTrimPathIfNeeded applytrimpathifneeded = (applyTrimPathIfNeeded) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) applytrimpathifneeded.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) applytrimpathifneeded.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) applytrimpathifneeded.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountFromEntity(logo=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", accountNumber=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

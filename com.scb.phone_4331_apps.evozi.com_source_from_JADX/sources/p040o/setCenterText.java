package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setCenterText */
public final class setCenterText {
    @SerializedName("registrationMethod")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("migrationFlag")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCenterText)) {
            return false;
        }
        setCenterText setcentertext = (setCenterText) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcentertext.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcentertext.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("ResetPinEntity(registrationMethod=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", migrationFlag=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

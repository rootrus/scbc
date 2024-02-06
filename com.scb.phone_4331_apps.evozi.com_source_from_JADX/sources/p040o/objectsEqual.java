package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.objectsEqual */
public final class objectsEqual {
    @SerializedName("expiryDate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("laserCode")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("number")
    public final String read;
    @SerializedName("issueDate")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof objectsEqual)) {
            return false;
        }
        objectsEqual objectsequal = (objectsEqual) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) objectsequal.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) objectsequal.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) objectsequal.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) objectsequal.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NTBCitizenIDEntity(number=");
        sb.append(this.read);
        sb.append(", laserCode=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", issueDate=");
        sb.append(this.write);
        sb.append(", expiryDate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

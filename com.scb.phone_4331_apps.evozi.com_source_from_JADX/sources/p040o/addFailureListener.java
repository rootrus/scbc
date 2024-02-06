package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.addFailureListener */
public final class addFailureListener {
    @SerializedName("header")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("description")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addFailureListener)) {
            return false;
        }
        addFailureListener addfailurelistener = (addFailureListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) addfailurelistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) addfailurelistener.write);
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
        sb.append("EasycashDisclaimerEntity(header=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", description=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setIsDiscrete */
public final class setIsDiscrete {
    @SerializedName("applicationStatus")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setIsDiscrete)) {
            return false;
        }
        setIsDiscrete setisdiscrete = (setIsDiscrete) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setisdiscrete.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setisdiscrete.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("HmlApplicationStatus(applicationStatus=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", applicationUuid=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.IgnoredPropertyException */
public final class IgnoredPropertyException {
    @SerializedName("type")
    private final PINBlockException MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("sortSequence")
    public final int MediaBrowserCompat$ItemReceiver;
    @SerializedName("branch")
    public final PINBlockException read;
    @SerializedName("clientNo")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IgnoredPropertyException)) {
            return false;
        }
        IgnoredPropertyException ignoredPropertyException = (IgnoredPropertyException) obj;
        return this.MediaBrowserCompat$ItemReceiver == ignoredPropertyException.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ignoredPropertyException.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ignoredPropertyException.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ignoredPropertyException.read);
    }

    public final int hashCode() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        String str = this.write;
        int i2 = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        PINBlockException pINBlockException = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = pINBlockException != null ? pINBlockException.hashCode() : 0;
        PINBlockException pINBlockException2 = this.read;
        if (pINBlockException2 != null) {
            i2 = pINBlockException2.hashCode();
        }
        return (((((i * 31) + hashCode) * 31) + hashCode2) * 31) + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnregisteredClientEntity(sortSequence=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", clientNo=");
        sb.append(this.write);
        sb.append(", type=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", branch=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }
}

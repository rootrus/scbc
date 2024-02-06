package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.ImageProcessingException */
public final class ImageProcessingException {
    @SerializedName("description")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("code")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageProcessingException)) {
            return false;
        }
        ImageProcessingException imageProcessingException = (ImageProcessingException) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) imageProcessingException.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) imageProcessingException.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductType(code=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

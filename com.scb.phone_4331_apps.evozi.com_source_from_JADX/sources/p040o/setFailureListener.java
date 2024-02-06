package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setFailureListener */
public final class setFailureListener extends setCurrentItemInternal {
    @SerializedName("mediumContent")
    final String IconCompatParcelizer;
    @SerializedName("originalContent")
    final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("shortContent")
    final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setFailureListener)) {
            return false;
        }
        setFailureListener setfailurelistener = (setFailureListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setfailurelistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setfailurelistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setfailurelistener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContentUrlEntity(shortContent=");
        sb.append(this.read);
        sb.append(", mediumContent=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", originalContent=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDefaultFontFileExtension */
public final class setDefaultFontFileExtension {
    @SerializedName("applicationStatus")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("applicationUuid")
    public final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDefaultFontFileExtension)) {
            return false;
        }
        setDefaultFontFileExtension setdefaultfontfileextension = (setDefaultFontFileExtension) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setdefaultfontfileextension.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdefaultfontfileextension.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("HmlLoanOfferStatusEntity(applicationStatus=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", applicationUuid=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }
}

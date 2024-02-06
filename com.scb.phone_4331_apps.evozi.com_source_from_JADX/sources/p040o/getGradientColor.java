package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getGradientColor */
public final class getGradientColor {
    @SerializedName(alternate = {"interestRate"}, value = "rate")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("duration")
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getGradientColor)) {
            return false;
        }
        getGradientColor getgradientcolor = (getGradientColor) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getgradientcolor.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getgradientcolor.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlInterestRateEntity(duration=");
        sb.append(this.read);
        sb.append(", rate=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

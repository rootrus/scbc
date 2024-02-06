package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setShowDividerVertical */
public final class setShowDividerVertical {
    @SerializedName("cashBalanceDisclaimer")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("symbolList")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("disclaimerDate")
    public final String read;
    @SerializedName("disclaimer")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setShowDividerVertical)) {
            return false;
        }
        setShowDividerVertical setshowdividervertical = (setShowDividerVertical) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setshowdividervertical.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setshowdividervertical.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setshowdividervertical.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setshowdividervertical.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LabelsEntity(disclaimer=");
        sb.append(this.write);
        sb.append(", disclaimerDate=");
        sb.append(this.read);
        sb.append(", symbolList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", cashBalanceDisclaimer=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

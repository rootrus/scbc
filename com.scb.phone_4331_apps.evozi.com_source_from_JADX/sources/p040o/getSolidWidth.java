package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getSolidWidth */
public final class getSolidWidth {
    @SerializedName("branch")
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("name")
    public final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("no")
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getSolidWidth)) {
            return false;
        }
        getSolidWidth getsolidwidth = (getSolidWidth) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getsolidwidth.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getsolidwidth.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getsolidwidth.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountReviewEntity(name=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", number=");
        sb.append(this.write);
        sb.append(", branch=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

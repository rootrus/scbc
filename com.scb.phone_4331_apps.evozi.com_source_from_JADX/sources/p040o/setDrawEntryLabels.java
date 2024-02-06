package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setDrawEntryLabels */
public final class setDrawEntryLabels {
    @SerializedName("email")
    private final String IconCompatParcelizer;
    @SerializedName("emailNotificationFlag")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("emailVerificationFlag")
    private final String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDrawEntryLabels)) {
            return false;
        }
        setDrawEntryLabels setdrawentrylabels = (setDrawEntryLabels) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setdrawentrylabels.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setdrawentrylabels.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setdrawentrylabels.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpdateEmailEntity(email=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", emailVerificationFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", emailNotificationFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

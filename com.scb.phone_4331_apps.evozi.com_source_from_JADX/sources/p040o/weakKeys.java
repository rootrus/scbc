package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.weakKeys */
public final class weakKeys {
    @SerializedName("applicationUuid")
    private final String IconCompatParcelizer = null;
    @SerializedName("eventNotificationPolicyId")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof weakKeys)) {
            return false;
        }
        weakKeys weakkeys = (weakKeys) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) weakkeys.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) weakkeys.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
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
        sb.append("LoanOriginationOtpRequest(applicationUuid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", eventNotificationPolicyId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public weakKeys(String str, String str2) {
        onGetStartedClick.write((Object) str2, "eventNotificationPolicyId");
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}

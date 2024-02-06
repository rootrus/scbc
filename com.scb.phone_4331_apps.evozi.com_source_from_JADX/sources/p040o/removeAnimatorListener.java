package p040o;

import com.google.gson.annotations.SerializedName;
import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.removeAnimatorListener */
public final class removeAnimatorListener {
    @SerializedName("function")
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("transactionId")
    private String MediaBrowserCompat$ItemReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeAnimatorListener)) {
            return false;
        }
        removeAnimatorListener removeanimatorlistener = (removeAnimatorListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) removeanimatorlistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) removeanimatorlistener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
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
        sb.append("ThirdPartyGenerateBodyEntity(transactionId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", function=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public removeAnimatorListener(String str, String str2) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        onGetStartedClick.write((Object) str2, "function");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}

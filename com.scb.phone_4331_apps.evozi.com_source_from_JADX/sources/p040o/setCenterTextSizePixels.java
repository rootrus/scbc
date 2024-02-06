package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.setCenterTextSizePixels */
public final class setCenterTextSizePixels {
    @SerializedName("tcAcceptRequired")
    public final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof setCenterTextSizePixels) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((setCenterTextSizePixels) obj).MediaBrowserCompat$CustomActionResultReceiver);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ResetPinRegistrationVerificationEntity(tcAcceptRequired=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

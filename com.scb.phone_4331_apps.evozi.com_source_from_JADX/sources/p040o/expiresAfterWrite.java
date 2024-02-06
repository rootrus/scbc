package p040o;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;

/* renamed from: o.expiresAfterWrite */
public final class expiresAfterWrite {
    @SerializedName("value")
    private final String IconCompatParcelizer;
    @SerializedName("key")
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof expiresAfterWrite)) {
            return false;
        }
        expiresAfterWrite expiresafterwrite = (expiresAfterWrite) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) expiresafterwrite.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) expiresafterwrite.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScopesRequest(key=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", value=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public expiresAfterWrite(String str, String str2) {
        onGetStartedClick.write((Object) str, "key");
        onGetStartedClick.write((Object) str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
    }
}

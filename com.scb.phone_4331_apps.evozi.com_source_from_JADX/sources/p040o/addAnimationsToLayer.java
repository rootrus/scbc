package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.addAnimationsToLayer */
public final class addAnimationsToLayer {
    @SerializedName("applicationUuid")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("operatingAccount")
    private final applyValueCallback write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addAnimationsToLayer)) {
            return false;
        }
        addAnimationsToLayer addanimationstolayer = (addAnimationsToLayer) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) addanimationstolayer.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) addanimationstolayer.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        applyValueCallback applyvaluecallback = this.write;
        if (applyvaluecallback != null) {
            i = applyvaluecallback.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlEditOperatingAccountRequest(applicationUuid=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", operatingAccount=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public addAnimationsToLayer(String str, applyValueCallback applyvaluecallback) {
        onGetStartedClick.write((Object) str, "applicationUuid");
        onGetStartedClick.write((Object) applyvaluecallback, "operatingAccount");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = applyvaluecallback;
    }
}

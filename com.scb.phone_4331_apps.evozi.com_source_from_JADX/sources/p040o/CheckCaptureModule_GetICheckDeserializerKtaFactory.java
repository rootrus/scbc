package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.CheckCaptureModule_GetICheckDeserializerKtaFactory */
public final class CheckCaptureModule_GetICheckDeserializerKtaFactory {
    @SerializedName("introduction")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("img")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckCaptureModule_GetICheckDeserializerKtaFactory)) {
            return false;
        }
        CheckCaptureModule_GetICheckDeserializerKtaFactory checkCaptureModule_GetICheckDeserializerKtaFactory = (CheckCaptureModule_GetICheckDeserializerKtaFactory) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) checkCaptureModule_GetICheckDeserializerKtaFactory.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) checkCaptureModule_GetICheckDeserializerKtaFactory.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
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
        sb.append("SalesforceContentDisplay(img=");
        sb.append(this.write);
        sb.append(", introduction=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }
}

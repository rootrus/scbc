package p040o;

import p039io.beid.beidk.definitions.BeIDParams;

/* renamed from: o.setOnMapLoadedCallback */
public final class setOnMapLoadedCallback {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnMapLoadedCallback)) {
            return false;
        }
        setOnMapLoadedCallback setonmaploadedcallback = (setOnMapLoadedCallback) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setonmaploadedcallback.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setonmaploadedcallback.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PayNowConfirmation(transactionDateTime=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transactionId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setOnMapLoadedCallback(String str, String str2) {
        onGetStartedClick.write((Object) str, "transactionDateTime");
        onGetStartedClick.write((Object) str2, BeIDParams.BEID_TRANSACTION_ID);
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }
}

package p040o;

/* renamed from: o.SettingsClient */
public final class SettingsClient {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsClient)) {
            return false;
        }
        SettingsClient settingsClient = (SettingsClient) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) settingsClient.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) settingsClient.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) settingsClient.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PurchasePaymentDetails(payType=");
        sb.append(this.read);
        sb.append(", accountNo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", name=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public SettingsClient(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "payType");
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "name");
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }
}

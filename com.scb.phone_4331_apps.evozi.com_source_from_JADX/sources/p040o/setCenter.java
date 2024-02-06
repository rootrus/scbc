package p040o;

/* renamed from: o.setCenter */
public final class setCenter {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setCenter)) {
            return false;
        }
        setCenter setcenter = (setCenter) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setcenter.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setcenter.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setcenter.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setcenter.read);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardResetPinEncryptedResponse(encryptedPIN=");
        sb.append(this.write);
        sb.append(", e2eeSid=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", serverRandom=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", pubKeyIndex=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setCenter(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "encryptedPIN");
        onGetStartedClick.write((Object) str2, "e2eeSid");
        onGetStartedClick.write((Object) str3, "serverRandom");
        onGetStartedClick.write((Object) str4, "pubKeyIndex");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = str4;
    }
}

package p040o;

/* renamed from: o.setOnCameraMoveCanceledListener */
public final class setOnCameraMoveCanceledListener {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnCameraMoveCanceledListener)) {
            return false;
        }
        setOnCameraMoveCanceledListener setoncameramovecanceledlistener = (setOnCameraMoveCanceledListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setoncameramovecanceledlistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setoncameramovecanceledlistener.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setoncameramovecanceledlistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setoncameramovecanceledlistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setoncameramovecanceledlistener.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtraData(merchantId=");
        sb.append(this.read);
        sb.append(", merchantName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", merchantTerminalId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", urlLogo=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setOnCameraMoveCanceledListener(String str, String str2, String str3, String str4, String str5) {
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.write = str5;
    }
}

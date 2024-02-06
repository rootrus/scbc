package p040o;

/* renamed from: o.setRequestId */
public final class setRequestId {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setRequestId)) {
            return false;
        }
        setRequestId setrequestid = (setRequestId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setrequestid.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setrequestid.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setrequestid.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setrequestid.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setrequestid.read);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExtraData(merchantId=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", merchantName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", merchantTerminalId=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transNo=");
        sb.append(this.write);
        sb.append(", urlLogo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setRequestId(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "merchantId");
        onGetStartedClick.write((Object) str2, "merchantName");
        onGetStartedClick.write((Object) str3, "merchantTerminalId");
        onGetStartedClick.write((Object) str4, "transNo");
        onGetStartedClick.write((Object) str5, "urlLogo");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
        this.read = str5;
    }
}

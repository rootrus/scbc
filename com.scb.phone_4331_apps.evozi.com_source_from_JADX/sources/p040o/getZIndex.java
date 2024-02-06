package p040o;

/* renamed from: o.getZIndex */
public final class getZIndex {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public getZIndex() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getZIndex)) {
            return false;
        }
        getZIndex getzindex = (getZIndex) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getzindex.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getzindex.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getzindex.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getzindex.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getzindex.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyHeader(txnDateTime=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", txnNote=");
        sb.append(this.read);
        sb.append(", txnRefId=");
        sb.append(this.write);
        sb.append(", txnTitle=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", txnType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getZIndex(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "txnDateTime");
        onGetStartedClick.write((Object) str2, "txnNote");
        onGetStartedClick.write((Object) str3, "txnRefId");
        onGetStartedClick.write((Object) str4, "txnTitle");
        onGetStartedClick.write((Object) str5, "txnType");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
        this.MediaBrowserCompat$CustomActionResultReceiver = str5;
    }

    private /* synthetic */ getZIndex(byte b) {
        this("", "", "", "", "");
    }
}

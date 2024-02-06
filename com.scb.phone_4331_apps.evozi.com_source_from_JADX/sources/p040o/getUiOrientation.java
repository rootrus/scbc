package p040o;

/* renamed from: o.getUiOrientation */
public final class getUiOrientation {
    public final String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public final int MediaBrowserCompat$SearchResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getUiOrientation)) {
            return false;
        }
        getUiOrientation getuiorientation = (getUiOrientation) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getuiorientation.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getuiorientation.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getuiorientation.read) && this.MediaBrowserCompat$SearchResultReceiver == getuiorientation.MediaBrowserCompat$SearchResultReceiver && this.MediaBrowserCompat$ItemReceiver == getuiorientation.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getuiorientation.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$SearchResultReceiver;
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i2) * 31) + (z ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountInboundDisplay(accountNo=");
        sb.append(this.write);
        sb.append(", productTypeCode=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", productTypeDescription=");
        sb.append(this.read);
        sb.append(", sortSequence=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", isChecked=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", nickName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getUiOrientation(String str, String str2, String str3, int i, boolean z, String str4) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) str2, "productTypeCode");
        onGetStartedClick.write((Object) str3, "productTypeDescription");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$SearchResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}

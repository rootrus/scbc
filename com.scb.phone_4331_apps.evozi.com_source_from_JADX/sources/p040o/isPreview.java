package p040o;

/* renamed from: o.isPreview */
public final class isPreview {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public isPreview() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isPreview)) {
            return false;
        }
        isPreview ispreview = (isPreview) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) ispreview.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ispreview.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ispreview.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ispreview.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UnbillInfoResponse(merchName=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", microRef=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", transDate=");
        sb.append(this.read);
        sb.append(", postDate=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private isPreview(String str, String str2, String str3, String str4) {
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.read = null;
        this.IconCompatParcelizer = null;
    }

    public /* synthetic */ isPreview(byte b) {
        this((String) null, (String) null, (String) null, (String) null);
    }
}

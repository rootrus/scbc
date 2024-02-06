package p040o;

/* renamed from: o.setMockMode */
public final class setMockMode {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;

    public setMockMode() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMockMode)) {
            return false;
        }
        setMockMode setmockmode = (setMockMode) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setmockmode.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setmockmode.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setmockmode.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ThirdPartyFooter(type=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", text=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", image=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setMockMode(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "type");
        onGetStartedClick.write((Object) str2, "text");
        onGetStartedClick.write((Object) str3, "image");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = str3;
    }

    private /* synthetic */ setMockMode(byte b) {
        this("", "", "");
    }
}

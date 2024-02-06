package p040o;

/* renamed from: o.getCompassEnabled */
public final class getCompassEnabled {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final String write;

    public getCompassEnabled() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCompassEnabled)) {
            return false;
        }
        getCompassEnabled getcompassenabled = (getCompassEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcompassenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcompassenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcompassenabled.write);
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
        sb.append("AllowAddDevice(nameTH=");
        sb.append(this.read);
        sb.append(", nameEN=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", profilePhotoPath=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getCompassEnabled(String str, String str2, String str3) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }

    private /* synthetic */ getCompassEnabled(byte b) {
        this((String) null, (String) null, (String) null);
    }
}

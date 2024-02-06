package p040o;

/* renamed from: o.setOnCameraMoveListener */
public final class setOnCameraMoveListener {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnCameraMoveListener)) {
            return false;
        }
        setOnCameraMoveListener setoncameramovelistener = (setOnCameraMoveListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setoncameramovelistener.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setoncameramovelistener.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setoncameramovelistener.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountFrom(logo=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", name=");
        sb.append(this.write);
        sb.append(", accountNumber=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setOnCameraMoveListener(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "logo");
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str3, "accountNumber");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.read = str3;
    }
}

package p040o;

/* renamed from: o.setOnInfoWindowClickListener */
public final class setOnInfoWindowClickListener {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setOnInfoWindowClickListener)) {
            return false;
        }
        setOnInfoWindowClickListener setoninfowindowclicklistener = (setOnInfoWindowClickListener) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setoninfowindowclicklistener.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setoninfowindowclicklistener.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setoninfowindowclicklistener.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountTo(logo=");
        sb.append(this.read);
        sb.append(", name=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", promptpayID=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setOnInfoWindowClickListener(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "logo");
        onGetStartedClick.write((Object) str2, "name");
        onGetStartedClick.write((Object) str3, "promptpayID");
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}

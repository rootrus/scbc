package p040o;

/* renamed from: o.setLatLngBounds */
public final class setLatLngBounds {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setLatLngBounds)) {
            return false;
        }
        setLatLngBounds setlatlngbounds = (setLatLngBounds) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setlatlngbounds.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setlatlngbounds.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setlatlngbounds.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressRequestProductResponse(name=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", referenceNumber=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", applicationId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public setLatLngBounds(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) str2, "referenceNumber");
        onGetStartedClick.write((Object) str3, "applicationId");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }
}

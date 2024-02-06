package p040o;

/* renamed from: o.PlaceSelectionListener */
public final class PlaceSelectionListener {
    public final String read;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PlaceSelectionListener) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) ((PlaceSelectionListener) obj).read);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.read;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressProductListResponse(tokenId=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public PlaceSelectionListener(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        this.read = str;
    }
}

package p040o;

/* renamed from: o.setMenuVisibility$MediaBrowserCompat$ItemReceiver */
final class setMenuVisibility$MediaBrowserCompat$ItemReceiver implements getTransit {
    private final String IconCompatParcelizer;

    setMenuVisibility$MediaBrowserCompat$ItemReceiver(String str) {
        this.IconCompatParcelizer = str;
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StringHeaderFactory{value='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof setMenuVisibility$MediaBrowserCompat$ItemReceiver) {
            return this.IconCompatParcelizer.equals(((setMenuVisibility$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }
}

package p040o;

/* renamed from: o.setClickable */
public final class setClickable {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setClickable)) {
            return false;
        }
        setClickable setclickable = (setClickable) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setclickable.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setclickable.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setclickable.write);
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
        sb.append("ContentUrl(shortContent=");
        sb.append(this.read);
        sb.append(", mediumContent=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", originalContent=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public setClickable(String str, String str2, String str3) {
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = str3;
    }
}

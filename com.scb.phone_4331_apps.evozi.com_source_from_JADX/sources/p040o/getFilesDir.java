package p040o;

/* renamed from: o.getFilesDir */
public final class getFilesDir {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFilesDir)) {
            return false;
        }
        getFilesDir getfilesdir = (getFilesDir) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getfilesdir.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getfilesdir.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public getFilesDir(String str, String str2) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "description");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
    }

    public final String toString() {
        return this.read;
    }
}

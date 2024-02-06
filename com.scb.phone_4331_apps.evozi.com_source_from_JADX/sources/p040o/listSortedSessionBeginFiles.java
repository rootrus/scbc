package p040o;

/* renamed from: o.listSortedSessionBeginFiles */
public final class listSortedSessionBeginFiles {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof listSortedSessionBeginFiles)) {
            return false;
        }
        listSortedSessionBeginFiles listsortedsessionbeginfiles = (listSortedSessionBeginFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) listsortedsessionbeginfiles.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) listsortedsessionbeginfiles.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) listsortedsessionbeginfiles.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) listsortedsessionbeginfiles.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlCitizenIdDisplay(number=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", laserCode=");
        sb.append(this.write);
        sb.append(", issueDate=");
        sb.append(this.read);
        sb.append(", expiryDate=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public listSortedSessionBeginFiles(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str4, "expiryDate");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.read = str3;
        this.MediaBrowserCompat$ItemReceiver = str4;
    }
}

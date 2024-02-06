package p040o;

/* renamed from: o.firebaseCrashExists */
public final class firebaseCrashExists implements listSessionPartFilesFor {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof firebaseCrashExists)) {
            return false;
        }
        firebaseCrashExists firebasecrashexists = (firebaseCrashExists) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) firebasecrashexists.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) firebasecrashexists.write) && this.MediaBrowserCompat$ItemReceiver == firebasecrashexists.MediaBrowserCompat$ItemReceiver;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        return (((hashCode * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompanyItemDisplay(companyId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", companyName=");
        sb.append(this.write);
        sb.append(", isTrigger=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public firebaseCrashExists(String str, String str2, boolean z) {
        onGetStartedClick.write((Object) str, "companyId");
        onGetStartedClick.write((Object) str2, "companyName");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return getCurrentSessionId.ITEM.viewType;
    }
}

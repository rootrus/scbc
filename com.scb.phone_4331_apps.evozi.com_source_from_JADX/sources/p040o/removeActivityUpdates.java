package p040o;

/* renamed from: o.removeActivityUpdates */
public final class removeActivityUpdates {
    public final String IconCompatParcelizer;
    public final String write;

    public removeActivityUpdates() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof removeActivityUpdates)) {
            return false;
        }
        removeActivityUpdates removeactivityupdates = (removeActivityUpdates) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) removeactivityupdates.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) removeactivityupdates.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ReceivingAccount(name=");
        sb.append(this.write);
        sb.append(", number=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public removeActivityUpdates(String str, String str2) {
        this.write = str;
        this.IconCompatParcelizer = str2;
    }

    private /* synthetic */ removeActivityUpdates(byte b) {
        this("", "");
    }
}

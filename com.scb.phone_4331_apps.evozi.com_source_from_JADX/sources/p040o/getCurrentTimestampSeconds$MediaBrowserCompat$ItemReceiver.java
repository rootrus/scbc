package p040o;

/* renamed from: o.getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver */
public final class getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver {
    public final Boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final Boolean read;

    public getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver getcurrenttimestampseconds_mediabrowsercompat_itemreceiver = (getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver) obj;
        return this.MediaBrowserCompat$ItemReceiver == getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcurrenttimestampseconds_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            z = true;
        }
        Boolean bool = this.read;
        int i = 0;
        int hashCode = bool != null ? bool.hashCode() : 0;
        Boolean bool2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return ((((z ? 1 : 0) * true) + hashCode) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivilegedProfession(isPrivileged=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isDoctor=");
        sb.append(this.read);
        sb.append(", isDentist=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver(boolean z, Boolean bool, Boolean bool2) {
        this.MediaBrowserCompat$ItemReceiver = z;
        this.read = bool;
        this.MediaBrowserCompat$CustomActionResultReceiver = bool2;
    }

    private /* synthetic */ getCurrentTimestampSeconds$MediaBrowserCompat$ItemReceiver(byte b) {
        this(false, (Boolean) null, (Boolean) null);
    }
}

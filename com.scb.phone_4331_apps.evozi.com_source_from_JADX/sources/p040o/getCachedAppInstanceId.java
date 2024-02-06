package p040o;

/* renamed from: o.getCachedAppInstanceId */
public final class getCachedAppInstanceId {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    public /* synthetic */ getCachedAppInstanceId(getCachedAppInstanceId$MediaBrowserCompat$ItemReceiver getcachedappinstanceid_mediabrowsercompat_itemreceiver, byte b) {
        this(getcachedappinstanceid_mediabrowsercompat_itemreceiver);
    }

    private getCachedAppInstanceId(getCachedAppInstanceId$MediaBrowserCompat$ItemReceiver getcachedappinstanceid_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getcachedappinstanceid_mediabrowsercompat_itemreceiver.write;
        this.MediaBrowserCompat$ItemReceiver = getcachedappinstanceid_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        this.read = getcachedappinstanceid_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getCachedAppInstanceId getcachedappinstanceid = (getCachedAppInstanceId) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? getcachedappinstanceid.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(getcachedappinstanceid.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? getcachedappinstanceid.MediaBrowserCompat$ItemReceiver != null : !str2.equals(getcachedappinstanceid.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.read;
        String str4 = getcachedappinstanceid.read;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}

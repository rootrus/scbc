package p040o;

/* renamed from: o.initForTests */
public final class initForTests extends getUserProperties {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    /* synthetic */ initForTests(initForTests$MediaBrowserCompat$CustomActionResultReceiver initfortests_mediabrowsercompat_customactionresultreceiver, byte b) {
        this(initfortests_mediabrowsercompat_customactionresultreceiver);
    }

    private initForTests(initForTests$MediaBrowserCompat$CustomActionResultReceiver initfortests_mediabrowsercompat_customactionresultreceiver) {
        super(initfortests_mediabrowsercompat_customactionresultreceiver);
        this.MediaBrowserCompat$CustomActionResultReceiver = initfortests_mediabrowsercompat_customactionresultreceiver.read;
        this.MediaBrowserCompat$ItemReceiver = initfortests_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = initfortests_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        initForTests initfortests = (initForTests) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str == null ? initfortests.MediaBrowserCompat$CustomActionResultReceiver != null : !str.equals(initfortests.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 == null ? initfortests.MediaBrowserCompat$ItemReceiver != null : !str2.equals(initfortests.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        String str3 = this.read;
        String str4 = initfortests.read;
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

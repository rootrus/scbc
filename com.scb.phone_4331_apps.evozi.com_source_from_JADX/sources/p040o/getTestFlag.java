package p040o;

/* renamed from: o.getTestFlag */
public final class getTestFlag {
    public getGmpAppId MediaBrowserCompat$ItemReceiver;
    public String read;
    public String write;

    public /* synthetic */ getTestFlag(read read2, byte b) {
        this(read2);
    }

    private getTestFlag(read read2) {
        this.write = read2.MediaBrowserCompat$ItemReceiver;
        this.read = read2.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* renamed from: o.getTestFlag$read */
    public static final class read {
        public String IconCompatParcelizer;
        public getGmpAppId MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ read(byte b) {
            this();
        }

        private read() {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getTestFlag gettestflag = (getTestFlag) obj;
        String str = this.write;
        if (str == null ? gettestflag.write != null : !str.equals(gettestflag.write)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? gettestflag.read != null : !str2.equals(gettestflag.read)) {
            return false;
        }
        getGmpAppId getgmpappid = this.MediaBrowserCompat$ItemReceiver;
        getGmpAppId getgmpappid2 = gettestflag.MediaBrowserCompat$ItemReceiver;
        if (getgmpappid != null) {
            return getgmpappid.equals(getgmpappid2);
        }
        if (getgmpappid2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        getGmpAppId getgmpappid = this.MediaBrowserCompat$ItemReceiver;
        if (getgmpappid != null) {
            i = getgmpappid.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}

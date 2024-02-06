package p040o;

/* renamed from: o.immediateFailedCheckedFuture */
public final class immediateFailedCheckedFuture extends remainingCapacity {
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String read;

    /* renamed from: o.immediateFailedCheckedFuture$read */
    public static final class read {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public String read;
    }

    public /* synthetic */ immediateFailedCheckedFuture(read read2, byte b) {
        this(read2);
    }

    public static read IconCompatParcelizer() {
        return new read();
    }

    private immediateFailedCheckedFuture(read read2) {
        this.IconCompatParcelizer = read2.read;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.MediaBrowserCompat$CustomActionResultReceiver;
        this.read = read2.IconCompatParcelizer;
        this.MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        immediateFailedCheckedFuture immediatefailedcheckedfuture = (immediateFailedCheckedFuture) obj;
        String str = this.IconCompatParcelizer;
        if (str == null ? immediatefailedcheckedfuture.IconCompatParcelizer != null : !str.equals(immediatefailedcheckedfuture.IconCompatParcelizer)) {
            return false;
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 == null ? immediatefailedcheckedfuture.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(immediatefailedcheckedfuture.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        String str3 = this.read;
        if (str3 == null ? immediatefailedcheckedfuture.read != null : !str3.equals(immediatefailedcheckedfuture.read)) {
            return false;
        }
        String str4 = this.MediaBrowserCompat$ItemReceiver;
        String str5 = immediatefailedcheckedfuture.MediaBrowserCompat$ItemReceiver;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
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
        sb.append("TermsAndConditionsDisplay{title='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", description='");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('\'');
        sb.append(", positiveText='");
        sb.append(this.read);
        sb.append('\'');
        sb.append(", negativeText='");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}

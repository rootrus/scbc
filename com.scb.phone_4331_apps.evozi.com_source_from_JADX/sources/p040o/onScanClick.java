package p040o;

/* renamed from: o.onScanClick */
public abstract class onScanClick {
    private onScanClick() {
    }

    public /* synthetic */ onScanClick(byte b) {
        this();
    }

    /* renamed from: o.onScanClick$write */
    public static final class write extends onScanClick {
        final String IconCompatParcelizer;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((write) obj).IconCompatParcelizer);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Clear(sharedPreferenceName=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(String str) {
            super((byte) 0);
            onGetStartedClick.write((Object) str, "sharedPreferenceName");
            this.IconCompatParcelizer = str;
        }
    }
}

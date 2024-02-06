package p040o;

import java.util.List;

/* renamed from: o.zzwb */
public final class zzwb {
    public final List<read> MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final zzwb$MediaBrowserCompat$CustomActionResultReceiver write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwb)) {
            return false;
        }
        zzwb zzwb = (zzwb) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzwb.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzwb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzwb.read);
    }

    public final int hashCode() {
        zzwb$MediaBrowserCompat$CustomActionResultReceiver zzwb_mediabrowsercompat_customactionresultreceiver = this.write;
        int i = 0;
        int hashCode = zzwb_mediabrowsercompat_customactionresultreceiver != null ? zzwb_mediabrowsercompat_customactionresultreceiver.hashCode() : 0;
        List<read> list = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str = this.read;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDocumentInstructions(instruction=");
        sb.append(this.write);
        sb.append(", tips=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", header=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public zzwb(zzwb$MediaBrowserCompat$CustomActionResultReceiver zzwb_mediabrowsercompat_customactionresultreceiver, List<read> list, String str) {
        onGetStartedClick.write((Object) zzwb_mediabrowsercompat_customactionresultreceiver, "instruction");
        onGetStartedClick.write((Object) list, "tips");
        onGetStartedClick.write((Object) str, "header");
        this.write = zzwb_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = str;
    }

    /* renamed from: o.zzwb$read */
    public static final class read {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) read.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) read.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) read.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Tip(primaryIconPath=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", description=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", secondaryIconPath=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        public read(String str, String str2, String str3) {
            onGetStartedClick.write((Object) str, "primaryIconPath");
            onGetStartedClick.write((Object) str2, "description");
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.IconCompatParcelizer = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
        }
    }
}

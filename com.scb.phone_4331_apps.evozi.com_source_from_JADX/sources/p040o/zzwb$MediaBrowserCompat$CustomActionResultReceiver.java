package p040o;

import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.zzwb$MediaBrowserCompat$CustomActionResultReceiver */
public final class zzwb$MediaBrowserCompat$CustomActionResultReceiver {
    public final String IconCompatParcelizer;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzwb$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        zzwb$MediaBrowserCompat$CustomActionResultReceiver zzwb_mediabrowsercompat_customactionresultreceiver = (zzwb$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzwb_mediabrowsercompat_customactionresultreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzwb_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer);
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
        sb.append("Instruction(imagePath=");
        sb.append(this.write);
        sb.append(", details=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzwb$MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "imagePath");
        onGetStartedClick.write((Object) str2, ErrorBundle.DETAIL_ENTRY);
        this.write = str;
        this.IconCompatParcelizer = str2;
    }
}

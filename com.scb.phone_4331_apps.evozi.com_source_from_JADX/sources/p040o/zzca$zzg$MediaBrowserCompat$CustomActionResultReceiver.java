package p040o;

/* renamed from: o.zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver */
public final class zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver {
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    public zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver zzca_zzg_mediabrowsercompat_customactionresultreceiver = (zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzca_zzg_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver) && this.MediaBrowserCompat$CustomActionResultReceiver == zzca_zzg_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode = str != null ? str.hashCode() : 0;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (z) {
            z = true;
        }
        return (hashCode * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact(companyPhone=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", isBusinessAddressFilled=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver(String str, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    public /* synthetic */ zzca$zzg$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this((String) null, false);
    }
}

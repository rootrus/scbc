package p040o;

/* renamed from: o.zzca$zzg$MediaBrowserCompat$ItemReceiver */
public final class zzca$zzg$MediaBrowserCompat$ItemReceiver {
    public boolean IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public boolean MediaBrowserCompat$ItemReceiver;

    public zzca$zzg$MediaBrowserCompat$ItemReceiver() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzca$zzg$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        zzca$zzg$MediaBrowserCompat$ItemReceiver zzca_zzg_mediabrowsercompat_itemreceiver = (zzca$zzg$MediaBrowserCompat$ItemReceiver) obj;
        return this.MediaBrowserCompat$ItemReceiver == zzca_zzg_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver && this.IconCompatParcelizer == zzca_zzg_mediabrowsercompat_itemreceiver.IconCompatParcelizer && this.MediaBrowserCompat$CustomActionResultReceiver == zzca_zzg_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        boolean z = this.MediaBrowserCompat$ItemReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.IconCompatParcelizer;
        if (z3) {
            z3 = true;
        }
        boolean z4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (!z4) {
            z2 = z4;
        }
        return ((((z ? 1 : 0) * true) + (z3 ? 1 : 0)) * 31) + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PrivilegedProfession(flag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", doctor=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", dentist=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    private zzca$zzg$MediaBrowserCompat$ItemReceiver(boolean z, boolean z2, boolean z3) {
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = false;
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
    }

    public /* synthetic */ zzca$zzg$MediaBrowserCompat$ItemReceiver(byte b) {
        this(false, false, false);
    }
}

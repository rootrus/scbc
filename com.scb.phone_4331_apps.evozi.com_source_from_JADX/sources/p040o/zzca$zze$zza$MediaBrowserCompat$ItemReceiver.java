package p040o;

/* renamed from: o.zzca$zze$zza$MediaBrowserCompat$ItemReceiver */
public final class zzca$zze$zza$MediaBrowserCompat$ItemReceiver {
    public final String IconCompatParcelizer;
    public final setContentDescription MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzca$zze$zza$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        zzca$zze$zza$MediaBrowserCompat$ItemReceiver zzca_zze_zza_mediabrowsercompat_itemreceiver = (zzca$zze$zza$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzca_zze_zza_mediabrowsercompat_itemreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzca_zze_zza_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        setContentDescription setcontentdescription = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setcontentdescription != null) {
            i = setcontentdescription.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contact(companyPhone=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", businessAddress=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzca$zze$zza$MediaBrowserCompat$ItemReceiver(String str, setContentDescription setcontentdescription) {
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = setcontentdescription;
    }
}

package p040o;

/* renamed from: o.zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver */
public final class zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver = (zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzjx_zze_zza_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.write;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Installment(code=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", description=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", unit=");
        sb.append(this.read);
        sb.append(", perUnit=");
        sb.append(this.write);
        sb.append(", everyUnit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzjx$zze$zza$MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "description");
        onGetStartedClick.write((Object) str3, "unit");
        onGetStartedClick.write((Object) str4, "perUnit");
        onGetStartedClick.write((Object) str5, "everyUnit");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.write = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
    }
}

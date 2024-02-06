package p040o;

/* renamed from: o.zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver */
public final class zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver = (zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzcz_zzc_zza_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MainOperatingAccount(accountNo=");
        sb.append(this.write);
        sb.append(", accountName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public zzcz$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) str2, "accountName");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }
}

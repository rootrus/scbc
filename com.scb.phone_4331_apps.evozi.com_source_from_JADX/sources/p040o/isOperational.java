package p040o;

import p040o.zzjx;

/* renamed from: o.isOperational */
public final class isOperational {
    public final zzjx.zzd IconCompatParcelizer;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof isOperational) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) ((isOperational) obj).IconCompatParcelizer);
        }
        return true;
    }

    public final int hashCode() {
        zzjx.zzd zzd = this.IconCompatParcelizer;
        if (zzd != null) {
            return zzd.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlValidationConfig(operatingAccount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public isOperational(zzjx.zzd zzd) {
        onGetStartedClick.write((Object) zzd, "operatingAccount");
        this.IconCompatParcelizer = zzd;
    }
}

package p040o;

/* renamed from: o.zzxb */
public final class zzxb {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxb)) {
            return false;
        }
        zzxb zzxb = (zzxb) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzxb.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzxb.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzxb.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzxb.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) zzxb.write);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AgentValidation(transactionLimit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", agentLimit=");
        sb.append(this.read);
        sb.append(", customerLimit=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", remainingLimit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tokenId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public zzxb(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, "transactionLimit");
        onGetStartedClick.write((Object) str2, "agentLimit");
        onGetStartedClick.write((Object) str3, "customerLimit");
        onGetStartedClick.write((Object) str4, "remainingLimit");
        onGetStartedClick.write((Object) str5, "tokenId");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.IconCompatParcelizer = str4;
        this.write = str5;
    }
}

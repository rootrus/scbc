package p040o;

/* renamed from: o.FusedLocationProviderApi */
public final class FusedLocationProviderApi {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FusedLocationProviderApi)) {
            return false;
        }
        FusedLocationProviderApi fusedLocationProviderApi = (FusedLocationProviderApi) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) fusedLocationProviderApi.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) fusedLocationProviderApi.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) fusedLocationProviderApi.read) && this.write == fusedLocationProviderApi.write;
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        boolean z = this.write;
        if (z) {
            z = true;
        }
        return (((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlDepositList(accountNo=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountTypeDesc=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", nickname=");
        sb.append(this.read);
        sb.append(", isSelected=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public FusedLocationProviderApi(String str, String str2, String str3, boolean z) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) str2, "accountTypeDesc");
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = str3;
        this.write = z;
    }
}

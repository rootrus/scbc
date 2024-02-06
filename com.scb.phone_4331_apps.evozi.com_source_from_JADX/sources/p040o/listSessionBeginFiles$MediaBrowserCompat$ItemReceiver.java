package p040o;

/* renamed from: o.listSessionBeginFiles$MediaBrowserCompat$ItemReceiver */
public final class listSessionBeginFiles$MediaBrowserCompat$ItemReceiver {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final Boolean MediaBrowserCompat$ItemReceiver;
    public final String read;
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof listSessionBeginFiles$MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        listSessionBeginFiles$MediaBrowserCompat$ItemReceiver listsessionbeginfiles_mediabrowsercompat_itemreceiver = (listSessionBeginFiles$MediaBrowserCompat$ItemReceiver) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) listsessionbeginfiles_mediabrowsercompat_itemreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) listsessionbeginfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) listsessionbeginfiles_mediabrowsercompat_itemreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) listsessionbeginfiles_mediabrowsercompat_itemreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) listsessionbeginfiles_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        Boolean bool = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = bool != null ? bool.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SpouseInfo(citizenship=");
        sb.append(this.write);
        sb.append(", isTh=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", thaiFirstName=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", thaiLastName=");
        sb.append(this.read);
        sb.append(", citizenId=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public listSessionBeginFiles$MediaBrowserCompat$ItemReceiver(String str, Boolean bool, String str2, String str3, String str4) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = bool;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}

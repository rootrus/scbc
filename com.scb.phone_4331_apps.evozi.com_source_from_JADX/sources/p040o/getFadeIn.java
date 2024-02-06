package p040o;

import java.util.List;

/* renamed from: o.getFadeIn */
public final class getFadeIn {
    public final List<getCenter> IconCompatParcelizer;
    public final boolean MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    private final int MediaMetadataCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getFadeIn)) {
            return false;
        }
        getFadeIn getfadein = (getFadeIn) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getfadein.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getfadein.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getfadein.write) && this.MediaBrowserCompat$CustomActionResultReceiver == getfadein.MediaBrowserCompat$CustomActionResultReceiver && this.MediaBrowserCompat$ItemReceiver == getfadein.MediaBrowserCompat$ItemReceiver && this.MediaMetadataCompat == getfadein.MediaMetadataCompat;
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<getCenter> list = this.IconCompatParcelizer;
        int hashCode2 = list != null ? list.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        boolean z3 = this.MediaBrowserCompat$ItemReceiver;
        if (!z3) {
            z2 = z3;
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + this.MediaMetadataCompat;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DebitCardDepositAccount(accountNo=");
        sb.append(this.read);
        sb.append(", cardList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", accountFromName=");
        sb.append(this.write);
        sb.append(", newFlag=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", replaceFlag=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", numberOfDebitCard=");
        sb.append(this.MediaMetadataCompat);
        sb.append(")");
        return sb.toString();
    }

    private getFadeIn(String str, List<getCenter> list, String str2, boolean z, boolean z2, int i) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) list, "cardList");
        onGetStartedClick.write((Object) str2, "accountFromName");
        this.read = str;
        this.IconCompatParcelizer = list;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.MediaBrowserCompat$ItemReceiver = z2;
        this.MediaMetadataCompat = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ getFadeIn(String str, List list, String str2, boolean z, boolean z2, int i, int i2) {
        this(str, list, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? 0 : i);
    }
}

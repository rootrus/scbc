package p040o;

import java.util.List;

/* renamed from: o.zzsi */
public final class zzsi {
    public final String IconCompatParcelizer;
    public zzvm MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final Double MediaBrowserCompat$MediaItem;
    public final List<zzsf> read;
    private final boolean write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsi)) {
            return false;
        }
        zzsi zzsi = (zzsi) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) zzsi.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) zzsi.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) zzsi.MediaBrowserCompat$MediaItem) && this.write == zzsi.write && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) zzsi.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) zzsi.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<zzsf> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        zzvm zzvm = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode2 = zzvm != null ? zzvm.hashCode() : 0;
        Double d = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = d != null ? d.hashCode() : 0;
        boolean z = this.write;
        if (z) {
            z = true;
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (z ? 1 : 0)) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CreditCardSummaryList(cards=");
        sb.append(this.read);
        sb.append(", ad=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", totalCreditUsed=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", isTotalFromAllAccounts=");
        sb.append(this.write);
        sb.append(", defaultCardRefNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", disclaimerText=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public zzsi(List<? extends zzsf> list, zzvm zzvm, Double d, boolean z, String str, String str2) {
        onGetStartedClick.write((Object) list, "cards");
        this.read = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = zzvm;
        this.MediaBrowserCompat$MediaItem = d;
        this.write = z;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
    }
}

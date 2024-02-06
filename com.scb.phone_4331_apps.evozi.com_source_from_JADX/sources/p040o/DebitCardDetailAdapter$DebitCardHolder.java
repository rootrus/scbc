package p040o;

/* renamed from: o.DebitCardDetailAdapter$DebitCardHolder */
public final class DebitCardDetailAdapter$DebitCardHolder {
    final String IconCompatParcelizer;
    final String MediaBrowserCompat$ItemReceiver;

    public DebitCardDetailAdapter$DebitCardHolder(String str, String str2) {
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(": ");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }
}

package p040o;

import java.util.Locale;

/* renamed from: o.EasyAppTermsAndConditionsActivity */
public final class EasyAppTermsAndConditionsActivity {
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final boolean MediaBrowserCompat$ItemReceiver;
    public final int read;
    public final String write;

    public EasyAppTermsAndConditionsActivity(String str, int i, String str2, boolean z) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Host");
        DepositTransactionAdapter$GroupItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(i, "Port");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str2, "Path");
        this.MediaBrowserCompat$CustomActionResultReceiver = str.toLowerCase(Locale.ROOT);
        this.read = i;
        if (!FatcaQuestionnaireAdapter$ViewHolder.read(str2)) {
            this.write = str2;
        } else {
            this.write = "/";
        }
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.MediaBrowserCompat$ItemReceiver) {
            sb.append("(secure)");
        }
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(':');
        sb.append(Integer.toString(this.read));
        sb.append(this.write);
        sb.append(']');
        return sb.toString();
    }
}

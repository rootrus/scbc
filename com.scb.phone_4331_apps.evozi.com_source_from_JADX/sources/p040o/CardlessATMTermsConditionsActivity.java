package p040o;

/* renamed from: o.CardlessATMTermsConditionsActivity */
public abstract class CardlessATMTermsConditionsActivity implements PrepaidResetOtpActivity {
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public PrepaidRequestMarketConductActivity MediaBrowserCompat$ItemReceiver;
    public PrepaidRequestMarketConductActivity write;

    protected CardlessATMTermsConditionsActivity() {
    }

    public final PrepaidRequestMarketConductActivity read() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final PrepaidRequestMarketConductActivity IconCompatParcelizer() {
        return this.write;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(String str) {
        this.MediaBrowserCompat$ItemReceiver = str != null ? new ManageChequeAdapter$ManageChequeHolder_ViewBinding("Content-Type", str) : null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            sb.append("Content-Type: ");
            sb.append(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver());
            sb.append(',');
        }
        if (this.write != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.write.MediaBrowserCompat$ItemReceiver());
            sb.append(',');
        }
        long MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2 >= 0) {
            sb.append("Content-Length: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
            sb.append(',');
        }
        sb.append("Chunked: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(']');
        return sb.toString();
    }
}

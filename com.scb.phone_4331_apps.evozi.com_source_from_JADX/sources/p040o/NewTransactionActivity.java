package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.NewTransactionActivity */
public class NewTransactionActivity implements PrepaidResetOtpActivity {
    public PrepaidResetOtpActivity read;

    public NewTransactionActivity(PrepaidResetOtpActivity prepaidResetOtpActivity) {
        this.read = (PrepaidResetOtpActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidResetOtpActivity, "Wrapped entity");
    }

    public boolean MediaBrowserCompat$SearchResultReceiver() {
        return this.read.MediaBrowserCompat$SearchResultReceiver();
    }

    public boolean MediaBrowserCompat$ItemReceiver() {
        return this.read.MediaBrowserCompat$ItemReceiver();
    }

    public long MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final PrepaidRequestMarketConductActivity read() {
        return this.read.read();
    }

    public final PrepaidRequestMarketConductActivity IconCompatParcelizer() {
        return this.read.IconCompatParcelizer();
    }

    public InputStream write() throws IOException {
        return this.read.write();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream) throws IOException {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(outputStream);
    }

    public boolean MediaBrowserCompat$MediaItem() {
        return this.read.MediaBrowserCompat$MediaItem();
    }
}

package p040o;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.CardlessATMActivity */
public final class CardlessATMActivity extends NewTransactionActivity {
    private final byte[] MediaBrowserCompat$CustomActionResultReceiver;

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return true;
    }

    public CardlessATMActivity(PrepaidResetOtpActivity prepaidResetOtpActivity) throws IOException {
        super(prepaidResetOtpActivity);
        if (!prepaidResetOtpActivity.MediaBrowserCompat$SearchResultReceiver() || prepaidResetOtpActivity.MediaBrowserCompat$CustomActionResultReceiver() < 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            prepaidResetOtpActivity.MediaBrowserCompat$CustomActionResultReceiver(byteArrayOutputStream);
            byteArrayOutputStream.flush();
            this.MediaBrowserCompat$CustomActionResultReceiver = byteArrayOutputStream.toByteArray();
            return;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        return bArr != null ? (long) bArr.length : super.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final InputStream write() throws IOException {
        return this.MediaBrowserCompat$CustomActionResultReceiver != null ? new ByteArrayInputStream(this.MediaBrowserCompat$CustomActionResultReceiver) : super.write();
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver == null && super.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(outputStream, "Output stream");
        byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bArr != null) {
            outputStream.write(bArr);
        } else {
            super.MediaBrowserCompat$CustomActionResultReceiver(outputStream);
        }
    }

    public final boolean MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$CustomActionResultReceiver == null && super.MediaBrowserCompat$MediaItem();
    }
}

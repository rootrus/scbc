package p040o;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.validateTRMM */
final class validateTRMM extends FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final Context read;

    validateTRMM(Context context, String str) {
        this.read = context;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void initializeProviders() {
        InputStream inputStream = null;
        try {
            inputStream = this.read.getAssets().open(this.MediaBrowserCompat$CustomActionResultReceiver);
            HistoryAdapter$GroupErrorViewHolder historyAdapter$GroupErrorViewHolder = new HistoryAdapter$GroupErrorViewHolder(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            HistoryAdapter$GroupItemViewHolder.registerProvider(historyAdapter$GroupErrorViewHolder);
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(" missing from assets");
            throw new IllegalStateException(sb.toString(), e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}

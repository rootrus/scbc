package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: o.CardPaySelectedActivity */
public final class CardPaySelectedActivity extends CardlessATMTermsConditionsActivity {
    public InputStream IconCompatParcelizer;
    public long read = -1;

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return false;
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read;
    }

    public final InputStream write() throws IllegalStateException {
        if (this.IconCompatParcelizer != null) {
            return this.IconCompatParcelizer;
        }
        throw new IllegalStateException("Content has not been provided");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(outputStream, "Output stream");
        InputStream write = write();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read2 = write.read(bArr);
                if (read2 != -1) {
                    outputStream.write(bArr, 0, read2);
                } else {
                    return;
                }
            }
        } finally {
            write.close();
        }
    }

    public final boolean MediaBrowserCompat$MediaItem() {
        InputStream inputStream = this.IconCompatParcelizer;
        return (inputStream == null || inputStream == CategoriesListAdapter$CategoryViewHolder.IconCompatParcelizer) ? false : true;
    }
}

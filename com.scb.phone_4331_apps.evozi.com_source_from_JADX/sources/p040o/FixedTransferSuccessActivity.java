package p040o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

/* renamed from: o.FixedTransferSuccessActivity */
public class FixedTransferSuccessActivity extends CardlessATMTermsConditionsActivity implements Cloneable {
    private byte[] read;

    public final boolean MediaBrowserCompat$MediaItem() {
        return false;
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        return true;
    }

    public FixedTransferSuccessActivity(String str, FavouriteSelectedActivity favouriteSelectedActivity) throws UnsupportedCharsetException {
        Charset charset;
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Source string");
        if (favouriteSelectedActivity != null) {
            charset = favouriteSelectedActivity.read;
        } else {
            charset = null;
        }
        this.read = str.getBytes(charset == null ? CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver : charset);
        if (favouriteSelectedActivity != null) {
            IconCompatParcelizer(favouriteSelectedActivity.toString());
        }
    }

    public FixedTransferSuccessActivity(String str) throws UnsupportedEncodingException {
        this(str, FavouriteSelectedActivity.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver() {
        return (long) this.read.length;
    }

    public final InputStream write() throws IOException {
        return new ByteArrayInputStream(this.read);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(outputStream, "Output stream");
        outputStream.write(this.read);
        outputStream.flush();
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

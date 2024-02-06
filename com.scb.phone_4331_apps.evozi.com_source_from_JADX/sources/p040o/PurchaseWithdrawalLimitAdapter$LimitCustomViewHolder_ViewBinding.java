package p040o;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: o.PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding */
public final class PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding extends PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder {
    private final byte[] MediaBrowserCompat$CustomActionResultReceiver;

    public final String MediaBrowserCompat$ItemReceiver() {
        return "8bit";
    }

    public final String write() {
        return null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    private PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding(String str, String str2, Charset charset) throws UnsupportedEncodingException {
        this(str, CreditCardDetailUnbilledAdapter$ParentViewHolder.MediaBrowserCompat$CustomActionResultReceiver(str2, charset == null ? CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer : charset));
    }

    @Deprecated
    public PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding(String str, Charset charset) throws UnsupportedEncodingException {
        this(str, "text/plain", charset);
    }

    private PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder_ViewBinding(String str, CreditCardDetailUnbilledAdapter$ParentViewHolder creditCardDetailUnbilledAdapter$ParentViewHolder) {
        super(creditCardDetailUnbilledAdapter$ParentViewHolder);
        C6431x12296157.write(str, "Text");
        Charset charset = creditCardDetailUnbilledAdapter$ParentViewHolder.IconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = str.getBytes(charset == null ? CreditCardDetailUnbilledAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer : charset);
    }

    public final void MediaBrowserCompat$ItemReceiver(OutputStream outputStream) throws IOException {
        C6431x12296157.write(outputStream, "Output stream");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.MediaBrowserCompat$CustomActionResultReceiver);
        byte[] bArr = new byte[4096];
        while (true) {
            int read = byteArrayInputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    public final long read() {
        return (long) this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }
}

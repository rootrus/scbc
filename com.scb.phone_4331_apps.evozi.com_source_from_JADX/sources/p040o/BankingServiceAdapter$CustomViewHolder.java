package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.BankingServiceAdapter$CustomViewHolder */
public final class BankingServiceAdapter$CustomViewHolder extends PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder {
    private final byte[] IconCompatParcelizer;
    private final String write;

    public final String MediaBrowserCompat$CustomActionResultReceiver() {
        return null;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return "binary";
    }

    @Deprecated
    public BankingServiceAdapter$CustomViewHolder(byte[] bArr, String str, String str2) {
        this(bArr, CreditCardDetailUnbilledAdapter$ParentViewHolder.IconCompatParcelizer(str), str2);
    }

    private BankingServiceAdapter$CustomViewHolder(byte[] bArr, CreditCardDetailUnbilledAdapter$ParentViewHolder creditCardDetailUnbilledAdapter$ParentViewHolder, String str) {
        super(creditCardDetailUnbilledAdapter$ParentViewHolder);
        C6431x12296157.write(bArr, "byte[]");
        this.IconCompatParcelizer = bArr;
        this.write = str;
    }

    public final String write() {
        return this.write;
    }

    public final void MediaBrowserCompat$ItemReceiver(OutputStream outputStream) throws IOException {
        outputStream.write(this.IconCompatParcelizer);
    }

    public final long read() {
        return (long) this.IconCompatParcelizer.length;
    }
}

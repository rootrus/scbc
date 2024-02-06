package p040o;

import org.apache.http.impl.auth.NTLMEngineException;
import p040o.RtpEBillPaymentDetailActivity;

/* renamed from: o.RtpEBillPaymentDetailActivity$MediaBrowserCompat$SearchResultReceiver */
class C9817x44565b56 extends RtpEBillPaymentDetailActivity.IconCompatParcelizer {
    byte[] MediaBrowserCompat$CustomActionResultReceiver;
    byte[] MediaBrowserCompat$SearchResultReceiver;
    String read;
    int write;

    C9817x44565b56(String str) throws NTLMEngineException {
        this(SetupQuickTopUpActivity.MediaBrowserCompat$ItemReceiver(str.getBytes(RtpEBillPaymentDetailActivity.read)));
    }

    private C9817x44565b56(byte[] bArr) throws NTLMEngineException {
        super(bArr);
        byte[] bArr2 = new byte[8];
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr2;
        MediaBrowserCompat$CustomActionResultReceiver(bArr2);
        this.write = IconCompatParcelizer(20);
        this.read = null;
        if (IconCompatParcelizer() >= 20) {
            byte[] read2 = read(12);
            if (read2.length != 0) {
                this.read = new String(read2, RtpEBillPaymentDetailActivity.MediaBrowserCompat$ItemReceiver(this.write));
            }
        }
        this.MediaBrowserCompat$SearchResultReceiver = null;
        if (IconCompatParcelizer() >= 48) {
            byte[] read3 = read(40);
            if (read3.length != 0) {
                this.MediaBrowserCompat$SearchResultReceiver = read3;
            }
        }
    }
}

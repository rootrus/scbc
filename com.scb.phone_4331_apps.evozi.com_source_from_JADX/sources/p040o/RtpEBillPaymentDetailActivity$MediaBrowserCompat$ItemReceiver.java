package p040o;

import java.security.MessageDigest;

/* renamed from: o.RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver */
class RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver {
    byte[] MediaBrowserCompat$ItemReceiver = new byte[64];
    MessageDigest read;
    private byte[] write = new byte[64];

    RtpEBillPaymentDetailActivity$MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        MessageDigest read2 = RtpEBillPaymentDetailActivity.read();
        this.read = read2;
        int length = bArr.length;
        if (length > 64) {
            read2.update(bArr);
            bArr = this.read.digest();
            length = bArr.length;
        }
        int i = 0;
        while (i < length) {
            this.write[i] = (byte) (54 ^ bArr[i]);
            this.MediaBrowserCompat$ItemReceiver[i] = (byte) (92 ^ bArr[i]);
            i++;
        }
        while (i < 64) {
            this.write[i] = 54;
            this.MediaBrowserCompat$ItemReceiver[i] = 92;
            i++;
        }
        this.read.reset();
        this.read.update(this.write);
    }
}

package p040o;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

/* renamed from: o.NsipPartnerPaymentReviewActivity */
public interface NsipPartnerPaymentReviewActivity extends PinChangeActivity, WritableByteChannel {
    NsipPartnerPaymentReviewActivity IconCompatParcelizer(int i) throws IOException;

    NsipPartnerPaymentReviewActivity IconCompatParcelizer(SCBUniversalWebViewActivity_ViewBinding sCBUniversalWebViewActivity_ViewBinding) throws IOException;

    NsipPartnerPaymentReviewActivity IconCompatParcelizer(byte[] bArr, int i, int i2) throws IOException;

    long MediaBrowserCompat$CustomActionResultReceiver(HowToAddAccountStep2Activity howToAddAccountStep2Activity) throws IOException;

    NsipPartnerPaymentReviewActivity MediaBrowserCompat$CustomActionResultReceiver(String str) throws IOException;

    NsipPartnerPaymentReviewActivity MediaBrowserCompat$ItemReceiver(int i) throws IOException;

    NsipPartnerPaymentReviewActivity MediaBrowserCompat$MediaItem(int i) throws IOException;

    SCBUniversalWebViewActivity MediaMetadataCompat();

    NsipPartnerPaymentReviewActivity MediaSessionCompat$ResultReceiverWrapper(long j) throws IOException;

    NsipPartnerPaymentReviewActivity RatingCompat(long j) throws IOException;

    void flush() throws IOException;

    NsipPartnerPaymentReviewActivity read() throws IOException;

    NsipPartnerPaymentReviewActivity write() throws IOException;

    NsipPartnerPaymentReviewActivity write(String str, int i, int i2) throws IOException;

    NsipPartnerPaymentReviewActivity write(byte[] bArr) throws IOException;
}

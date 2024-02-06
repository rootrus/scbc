package p040o;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.NsipPartnerPaymentSuccessActivity */
final class NsipPartnerPaymentSuccessActivity implements HowToAddAccountStep2Activity {
    private final InputStream MediaBrowserCompat$CustomActionResultReceiver;
    private final PinChangeActivity_ViewBinding MediaBrowserCompat$ItemReceiver;

    public NsipPartnerPaymentSuccessActivity(InputStream inputStream, PinChangeActivity_ViewBinding pinChangeActivity_ViewBinding) {
        onGetStartedClick.write((Object) inputStream, "input");
        onGetStartedClick.write((Object) pinChangeActivity_ViewBinding, "timeout");
        this.MediaBrowserCompat$CustomActionResultReceiver = inputStream;
        this.MediaBrowserCompat$ItemReceiver = pinChangeActivity_ViewBinding;
    }

    public final long read(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
        onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.MediaBrowserCompat$ItemReceiver.throwIfReached();
                PersonalizeActivity MediaBrowserCompat$CustomActionResultReceiver2 = sCBUniversalWebViewActivity.MediaBrowserCompat$CustomActionResultReceiver(1);
                int read = this.MediaBrowserCompat$CustomActionResultReceiver.read(MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2.write, (int) Math.min(j, (long) (8192 - MediaBrowserCompat$CustomActionResultReceiver2.write)));
                if (read == -1) {
                    return -1;
                }
                MediaBrowserCompat$CustomActionResultReceiver2.write += read;
                long j2 = (long) read;
                sCBUniversalWebViewActivity.read += j2;
                return j2;
            } catch (AssertionError e) {
                if (onSubmit.write(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public final void close() {
        this.MediaBrowserCompat$CustomActionResultReceiver.close();
    }

    public final PinChangeActivity_ViewBinding timeout() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("source(");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(')');
        return sb.toString();
    }
}

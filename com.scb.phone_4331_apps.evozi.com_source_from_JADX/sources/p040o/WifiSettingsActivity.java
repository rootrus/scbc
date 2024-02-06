package p040o;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.ProtocolException;

@Deprecated
/* renamed from: o.WifiSettingsActivity */
public final class WifiSettingsActivity extends C9665x53ba63f5 implements PrepaidResetPinSuccessActivity_ViewBinding {
    private PrepaidResetOtpActivity MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public boolean read;

    public WifiSettingsActivity(PrepaidResetPinSuccessActivity_ViewBinding prepaidResetPinSuccessActivity_ViewBinding) throws ProtocolException {
        super(prepaidResetPinSuccessActivity_ViewBinding);
        PrepaidResetOtpActivity IconCompatParcelizer = prepaidResetPinSuccessActivity_ViewBinding.IconCompatParcelizer();
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer != null ? new read(IconCompatParcelizer) : null;
        this.read = false;
    }

    public final PrepaidResetOtpActivity IconCompatParcelizer() {
        return this.MediaBrowserCompat$SearchResultReceiver;
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        PrepaidRequestMarketConductActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver("Expect");
        return MediaBrowserCompat$CustomActionResultReceiver != null && "100-continue".equalsIgnoreCase(MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver());
    }

    public final boolean MediaMetadataCompat() {
        PrepaidResetOtpActivity prepaidResetOtpActivity = this.MediaBrowserCompat$SearchResultReceiver;
        return prepaidResetOtpActivity == null || prepaidResetOtpActivity.MediaBrowserCompat$SearchResultReceiver() || !this.read;
    }

    /* renamed from: o.WifiSettingsActivity$read */
    class read extends NewTransactionActivity {
        read(PrepaidResetOtpActivity prepaidResetOtpActivity) {
            super(prepaidResetOtpActivity);
        }

        public final InputStream write() throws IOException {
            boolean unused = WifiSettingsActivity.this.read = true;
            return super.write();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(OutputStream outputStream) throws IOException {
            boolean unused = WifiSettingsActivity.this.read = true;
            super.MediaBrowserCompat$CustomActionResultReceiver(outputStream);
        }
    }
}

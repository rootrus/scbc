package p040o;

import android.app.KeyguardManager;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import com.scb.phone.view.activity.prelogin.FingerprintHelperInterface;
import java.security.KeyStore;
import javax.crypto.Cipher;

/* renamed from: o.getSelectedDate */
public final class getSelectedDate extends FingerprintManager.AuthenticationCallback implements FingerprintHelperInterface {
    public FingerprintHelperInterface.IconCompatParcelizer IconCompatParcelizer;
    public final FingerprintManager MediaBrowserCompat$CustomActionResultReceiver;
    public Cipher MediaBrowserCompat$ItemReceiver;
    private final KeyguardManager MediaBrowserCompat$MediaItem;
    public KeyStore read;
    public CancellationSignal write;

    @HmlPinActivity
    public getSelectedDate(KeyguardManager keyguardManager, FingerprintManager fingerprintManager) {
        this.MediaBrowserCompat$MediaItem = keyguardManager;
        this.MediaBrowserCompat$CustomActionResultReceiver = fingerprintManager;
    }

    public final boolean IconCompatParcelizer() {
        KeyguardManager keyguardManager = this.MediaBrowserCompat$MediaItem;
        if (keyguardManager == null || this.MediaBrowserCompat$CustomActionResultReceiver == null || !keyguardManager.isKeyguardSecure() || !this.MediaBrowserCompat$CustomActionResultReceiver.isHardwareDetected()) {
            return false;
        }
        return true;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        super.onAuthenticationError(i, charSequence);
        FingerprintHelperInterface.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer(new FingerprintHelperInterface.FingerprintException(charSequence.toString()));
            this.IconCompatParcelizer = null;
        }
    }

    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        super.onAuthenticationHelp(i, charSequence);
        FingerprintHelperInterface.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(charSequence.toString());
        }
    }

    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        super.onAuthenticationSucceeded(authenticationResult);
        FingerprintHelperInterface.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
            this.IconCompatParcelizer = null;
        }
    }

    public final void onAuthenticationFailed() {
        super.onAuthenticationFailed();
        FingerprintHelperInterface.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver("Fingerprint is valid but not recognized.");
        }
    }
}

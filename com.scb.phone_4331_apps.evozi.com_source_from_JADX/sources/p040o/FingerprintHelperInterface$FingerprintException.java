package p040o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.FingerprintHelperInterface$FingerprintException */
final class FingerprintHelperInterface$FingerprintException extends PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding {
    private final Logger MediaBrowserCompat$ItemReceiver = Logger.getLogger("o.onSubmit");
    private final Socket read;

    public FingerprintHelperInterface$FingerprintException(Socket socket) {
        onGetStartedClick.write((Object) socket, "socket");
        this.read = socket;
    }

    /* access modifiers changed from: protected */
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    public final void timedOut() {
        try {
            this.read.close();
        } catch (Exception e) {
            Logger logger = this.MediaBrowserCompat$ItemReceiver;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to close timed out socket ");
            sb.append(this.read);
            logger.log(level, sb.toString(), e);
        } catch (AssertionError e2) {
            if (onSubmit.write(e2)) {
                Logger logger2 = this.MediaBrowserCompat$ItemReceiver;
                Level level2 = Level.WARNING;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to close timed out socket ");
                sb2.append(this.read);
                logger2.log(level2, sb2.toString(), e2);
                return;
            }
            throw e2;
        }
    }
}

package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import p040o.MwChangeCasaSuccessActivity;

public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    public final Throwable fillInStackTrace() {
        if (MwChangeCasaSuccessActivity.MediaBrowserCompat$ItemReceiver()) {
            super.fillInStackTrace();
        }
        return this;
    }
}

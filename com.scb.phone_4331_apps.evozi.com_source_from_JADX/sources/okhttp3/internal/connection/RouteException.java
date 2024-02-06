package okhttp3.internal.connection;

import java.io.IOException;
import p040o.onGetStartedClick;

public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        onGetStartedClick.write((Object) iOException, "firstConnectException");
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }

    public final void addConnectException(IOException iOException) {
        onGetStartedClick.write((Object) iOException, "e");
        this.firstConnectException.addSuppressed(iOException);
        this.lastConnectException = iOException;
    }
}

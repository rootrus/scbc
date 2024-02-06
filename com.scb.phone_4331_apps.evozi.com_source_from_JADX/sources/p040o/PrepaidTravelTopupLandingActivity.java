package p040o;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: o.PrepaidTravelTopupLandingActivity */
public class PrepaidTravelTopupLandingActivity implements PrepaidTravelCoachMarkActivity_ViewBinding, Serializable {
    private transient Logger write;

    public final void write(Object obj) {
        write(Level.FINE, String.valueOf(obj), (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj, Throwable th) {
        write(Level.FINE, String.valueOf(obj), th);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        write(Level.SEVERE, String.valueOf(obj), (Throwable) null);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        write(Level.INFO, String.valueOf(obj), (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj) {
        write(Level.WARNING, String.valueOf(obj), (Throwable) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj, Throwable th) {
        write(Level.WARNING, String.valueOf(obj), th);
    }

    public final boolean IconCompatParcelizer() {
        if (this.write == null) {
            this.write = Logger.getLogger((String) null);
        }
        return this.write.isLoggable(Level.FINE);
    }

    public final boolean read() {
        if (this.write == null) {
            this.write = Logger.getLogger((String) null);
        }
        return this.write.isLoggable(Level.SEVERE);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        if (this.write == null) {
            this.write = Logger.getLogger((String) null);
        }
        return this.write.isLoggable(Level.INFO);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.write == null) {
            this.write = Logger.getLogger((String) null);
        }
        return this.write.isLoggable(Level.WARNING);
    }

    private void write(Level level, String str, Throwable th) {
        if (this.write == null) {
            this.write = Logger.getLogger((String) null);
        }
        Logger logger = this.write;
        if (logger.isLoggable(level)) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String methodName = (stackTrace == null || stackTrace.length <= 2) ? "unknown" : stackTrace[2].getMethodName();
            if (th == null) {
                logger.logp(level, (String) null, methodName, str);
            } else {
                logger.logp(level, (String) null, methodName, str, th);
            }
        }
    }
}

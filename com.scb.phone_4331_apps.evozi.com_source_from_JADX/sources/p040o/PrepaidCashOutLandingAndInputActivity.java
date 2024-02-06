package p040o;

import java.io.Serializable;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/* renamed from: o.PrepaidCashOutLandingAndInputActivity */
public class PrepaidCashOutLandingAndInputActivity implements PrepaidTravelCoachMarkActivity_ViewBinding, Serializable {
    private static /* synthetic */ Class IconCompatParcelizer;
    private static /* synthetic */ Class MediaBrowserCompat$CustomActionResultReceiver;
    private static final String MediaBrowserCompat$ItemReceiver;
    private static /* synthetic */ Class write;
    private volatile transient Logger read = null;

    static {
        Class cls;
        Class cls2 = write;
        if (cls2 == null) {
            cls2 = MediaBrowserCompat$CustomActionResultReceiver("o.PrepaidCashOutLandingAndInputActivity");
            write = cls2;
        }
        MediaBrowserCompat$ItemReceiver = cls2.getName();
        Class cls3 = MediaBrowserCompat$CustomActionResultReceiver;
        if (cls3 == null) {
            cls3 = MediaBrowserCompat$CustomActionResultReceiver("org.apache.log4j.Priority");
            MediaBrowserCompat$CustomActionResultReceiver = cls3;
        }
        Class cls4 = IconCompatParcelizer;
        if (cls4 == null) {
            cls4 = MediaBrowserCompat$CustomActionResultReceiver("org.apache.log4j.Level");
            IconCompatParcelizer = cls4;
        }
        if (cls3.isAssignableFrom(cls4)) {
            try {
                if (IconCompatParcelizer == null) {
                    cls = MediaBrowserCompat$CustomActionResultReceiver("org.apache.log4j.Level");
                    IconCompatParcelizer = cls;
                } else {
                    cls = IconCompatParcelizer;
                }
                cls.getDeclaredField("TRACE").get((Object) null);
            } catch (Exception unused) {
                Level level = Level.DEBUG;
            }
        } else {
            throw new InstantiationError("Log4J 1.2 not available");
        }
    }

    private static /* synthetic */ Class MediaBrowserCompat$CustomActionResultReceiver(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError(e.getMessage());
        }
    }

    public final void write(Object obj) {
        write().log(MediaBrowserCompat$ItemReceiver, Level.DEBUG, obj, (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj, Throwable th) {
        write().log(MediaBrowserCompat$ItemReceiver, Level.DEBUG, obj, th);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        write().log(MediaBrowserCompat$ItemReceiver, Level.INFO, obj, (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj) {
        write().log(MediaBrowserCompat$ItemReceiver, Level.WARN, obj, (Throwable) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj, Throwable th) {
        write().log(MediaBrowserCompat$ItemReceiver, Level.WARN, obj, th);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        write().log(MediaBrowserCompat$ItemReceiver, Level.ERROR, obj, (Throwable) null);
    }

    private Logger write() {
        Logger logger = this.read;
        if (logger == null) {
            synchronized (this) {
                logger = this.read;
                if (logger == null) {
                    logger = Logger.getLogger((String) null);
                    this.read = logger;
                }
            }
        }
        return logger;
    }

    public final boolean IconCompatParcelizer() {
        return write().isDebugEnabled();
    }

    public final boolean read() {
        return write().isEnabledFor(Level.ERROR);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return write().isInfoEnabled();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return write().isEnabledFor(Level.WARN);
    }
}

package p040o;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* renamed from: o.PrepaidTravelForeignCurrencyWalletDetailActivity_ViewBinding */
public class PrepaidTravelForeignCurrencyWalletDetailActivity_ViewBinding implements PrepaidTravelCoachMarkActivity_ViewBinding, Serializable {
    private transient Logger IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private boolean MediaBrowserCompat$ItemReceiver;
    private String read;

    private void write() {
        try {
            Throwable th = new Throwable();
            th.fillInStackTrace();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.getBuffer().toString(), "\n");
            stringTokenizer.nextToken();
            String nextToken = stringTokenizer.nextToken();
            while (nextToken.indexOf(getClass().getName()) == -1) {
                nextToken = stringTokenizer.nextToken();
            }
            while (nextToken.indexOf(getClass().getName()) >= 0) {
                nextToken = stringTokenizer.nextToken();
            }
            String substring = nextToken.substring(nextToken.indexOf("at ") + 3, nextToken.indexOf(40));
            int lastIndexOf = substring.lastIndexOf(46);
            this.MediaBrowserCompat$CustomActionResultReceiver = substring.substring(0, lastIndexOf);
            this.read = substring.substring(lastIndexOf + 1);
        } catch (Exception unused) {
        }
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public final void write(Object obj) {
        IconCompatParcelizer(Level.FINE, String.valueOf(obj), (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj, Throwable th) {
        IconCompatParcelizer(Level.FINE, String.valueOf(obj), th);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        IconCompatParcelizer(Level.SEVERE, String.valueOf(obj), (Throwable) null);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        IconCompatParcelizer(Level.INFO, String.valueOf(obj), (Throwable) null);
    }

    public final void IconCompatParcelizer(Object obj) {
        IconCompatParcelizer(Level.WARNING, String.valueOf(obj), (Throwable) null);
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj, Throwable th) {
        IconCompatParcelizer(Level.WARNING, String.valueOf(obj), th);
    }

    private void IconCompatParcelizer(Level level, String str, Throwable th) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Logger.getLogger((String) null);
        }
        if (this.IconCompatParcelizer.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, str);
            if (!this.MediaBrowserCompat$ItemReceiver) {
                write();
            }
            logRecord.setSourceClassName(this.MediaBrowserCompat$CustomActionResultReceiver);
            logRecord.setSourceMethodName(this.read);
            if (th != null) {
                logRecord.setThrown(th);
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = Logger.getLogger((String) null);
            }
            this.IconCompatParcelizer.log(logRecord);
        }
    }

    public final boolean IconCompatParcelizer() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Logger.getLogger((String) null);
        }
        return this.IconCompatParcelizer.isLoggable(Level.FINE);
    }

    public final boolean read() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Logger.getLogger((String) null);
        }
        return this.IconCompatParcelizer.isLoggable(Level.SEVERE);
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Logger.getLogger((String) null);
        }
        return this.IconCompatParcelizer.isLoggable(Level.INFO);
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = Logger.getLogger((String) null);
        }
        return this.IconCompatParcelizer.isLoggable(Level.WARNING);
    }
}

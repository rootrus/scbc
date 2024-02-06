package p040o;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.kony.sdk.client.KonyLogger;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: o.CHPR */
class CHPR implements Application.ActivityLifecycleCallbacks {
    public static final String IconCompatParcelizer = CHPR.class.getName();
    private static CHPR write;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    public List<read> MediaBrowserCompat$ItemReceiver = new CopyOnWriteArrayList();
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$MediaItem = true;
    private Handler read = new Handler();

    /* renamed from: o.CHPR$read */
    public interface read {
        void read();

        void write();
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    CHPR() {
    }

    public static CHPR MediaBrowserCompat$ItemReceiver(Context context) {
        if (write == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof Application) {
                Application application = (Application) applicationContext;
                if (write == null) {
                    CHPR chpr = new CHPR();
                    write = chpr;
                    application.registerActivityLifecycleCallbacks(chpr);
                }
            } else {
                throw new IllegalStateException("Foreground is not initialised and cannot obtain the Application object");
            }
        }
        return write;
    }

    public void onActivityResumed(Activity activity) {
        this.MediaBrowserCompat$MediaItem = false;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        if (!z) {
            KonyLogger.read(IconCompatParcelizer, "went foreground");
            for (read read2 : this.MediaBrowserCompat$ItemReceiver) {
                try {
                    read2.read();
                } catch (Exception e) {
                    KonyLogger.write(IconCompatParcelizer, "Listener threw exception!", e);
                }
            }
            return;
        }
        KonyLogger.read(IconCompatParcelizer, "still foreground");
    }

    public void onActivityPaused(Activity activity) {
        this.MediaBrowserCompat$MediaItem = true;
        this.read.postDelayed(new Runnable() {
            public final void run() {
                if (!CHPR.this.MediaBrowserCompat$CustomActionResultReceiver || !CHPR.this.MediaBrowserCompat$MediaItem) {
                    KonyLogger.read(CHPR.IconCompatParcelizer, "still foreground");
                    return;
                }
                boolean unused = CHPR.this.MediaBrowserCompat$CustomActionResultReceiver = false;
                KonyLogger.read(CHPR.IconCompatParcelizer, "went background");
                for (read write : CHPR.this.MediaBrowserCompat$ItemReceiver) {
                    try {
                        write.write();
                    } catch (Exception e) {
                        KonyLogger.write(CHPR.IconCompatParcelizer, "Listener threw exception!", e);
                    }
                }
            }
        }, 500);
    }

    public void onActivityStopped(Activity activity) {
        write();
    }

    public void onActivityDestroyed(Activity activity) {
        write();
    }

    private static void write() {
        Vector vector = (Vector) CSYR2K.MediaBrowserCompat$ItemReceiver.read("customevents");
        if (vector == null) {
            vector = new Vector();
        }
        for (int i = 0; i < CTBSV.IconCompatParcelizer.size(); i++) {
            vector.add(CTBSV.IconCompatParcelizer.elementAt(i));
        }
        CSYR2K.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("customevents");
        CSYR2K.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("customeventscount");
        CSYR2K.MediaBrowserCompat$ItemReceiver.read("customevents", vector);
        CSYR2K.MediaBrowserCompat$ItemReceiver.read("customeventscount", Integer.valueOf(CTBSV.write));
        CTBSV.MediaBrowserCompat$CustomActionResultReceiver.clear();
        CTBSV.IconCompatParcelizer.clear();
    }
}

package p040o;

/* renamed from: o.nScriptGroup2Execute */
public abstract class nScriptGroup2Execute implements Runnable {
    public final nScriptSetTimeZone<?> MediaBrowserCompat$CustomActionResultReceiver;

    nScriptGroup2Execute() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
    }

    public nScriptGroup2Execute(nScriptSetTimeZone<?> nscriptsettimezone) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nscriptsettimezone;
    }

    /* access modifiers changed from: protected */
    public abstract void write();

    public final void run() {
        try {
            write();
        } catch (Exception e) {
            nScriptSetTimeZone<?> nscriptsettimezone = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (nscriptsettimezone != null) {
                nscriptsettimezone.MediaBrowserCompat$ItemReceiver.write(e);
            }
        }
    }
}

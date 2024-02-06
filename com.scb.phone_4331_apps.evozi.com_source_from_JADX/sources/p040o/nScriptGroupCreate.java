package p040o;

import com.google.android.play.core.internal.C0191aa;
import p040o.ScriptIntrinsicConvolve5x5;

/* renamed from: o.nScriptGroupCreate */
public final class nScriptGroupCreate extends nScriptGroup2Execute {
    private final /* synthetic */ nScriptGroup2Execute IconCompatParcelizer;
    private final /* synthetic */ nScriptGroupSetInput write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nScriptGroupCreate(nScriptGroupSetInput nscriptgroupsetinput, nScriptSetTimeZone nscriptsettimezone, nScriptGroup2Execute nscriptgroup2execute) {
        super(nscriptsettimezone);
        this.write = nscriptgroupsetinput;
        this.IconCompatParcelizer = nscriptgroup2execute;
    }

    public final void write() {
        nScriptGroupSetInput nscriptgroupsetinput = this.write;
        nScriptGroup2Execute nscriptgroup2execute = this.IconCompatParcelizer;
        if (nscriptgroupsetinput.MediaSessionCompat$Token == null && !nscriptgroupsetinput.MediaBrowserCompat$ItemReceiver) {
            nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("Initiate binding to the service.", new Object[0]);
            nscriptgroupsetinput.write.add(nscriptgroup2execute);
            ScriptIntrinsicConvolve5x5.write write2 = new ScriptIntrinsicConvolve5x5.write(nscriptgroupsetinput);
            nscriptgroupsetinput.MediaMetadataCompat = write2;
            nscriptgroupsetinput.MediaBrowserCompat$ItemReceiver = true;
            if (!nscriptgroupsetinput.read.bindService(nscriptgroupsetinput.MediaBrowserCompat$MediaItem, write2, 1)) {
                nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("Failed to bind to the service.", new Object[0]);
                nscriptgroupsetinput.MediaBrowserCompat$ItemReceiver = false;
                for (nScriptGroup2Execute nscriptgroup2execute2 : nscriptgroupsetinput.write) {
                    nScriptSetTimeZone<?> nscriptsettimezone = nscriptgroup2execute2.MediaBrowserCompat$CustomActionResultReceiver;
                    if (nscriptsettimezone != null) {
                        nscriptsettimezone.MediaBrowserCompat$ItemReceiver.write(new C0191aa());
                    }
                }
                nscriptgroupsetinput.write.clear();
            }
        } else if (nscriptgroupsetinput.MediaBrowserCompat$ItemReceiver) {
            nscriptgroupsetinput.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver("Waiting to bind to the service.", new Object[0]);
            nscriptgroupsetinput.write.add(nscriptgroup2execute);
        } else {
            nscriptgroup2execute.run();
        }
    }
}

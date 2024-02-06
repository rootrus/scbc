package p040o;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: o.nScriptKernelIDCreate */
public abstract class nScriptKernelIDCreate<StateT> {
    private final Context IconCompatParcelizer;
    private final Set<nScriptIntrinsicBLAS_Double<StateT>> MediaBrowserCompat$CustomActionResultReceiver = new HashSet();
    public final FragmentBuilder_BindPdfViewerFragment MediaBrowserCompat$ItemReceiver;
    private volatile boolean MediaBrowserCompat$SearchResultReceiver = false;
    private nScriptInvokeV read = null;
    private final IntentFilter write;

    public nScriptKernelIDCreate(FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment, IntentFilter intentFilter, Context context) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindPdfViewerFragment;
        this.write = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.IconCompatParcelizer = applicationContext != null ? applicationContext : context;
    }

    private final void IconCompatParcelizer() {
        nScriptInvokeV nscriptinvokev;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() && this.read == null) {
            nScriptInvokeV nscriptinvokev2 = new nScriptInvokeV(this, (byte) 0);
            this.read = nscriptinvokev2;
            this.IconCompatParcelizer.registerReceiver(nscriptinvokev2, this.write);
        }
        if (this.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() && (nscriptinvokev = this.read) != null) {
            this.IconCompatParcelizer.unregisterReceiver(nscriptinvokev);
            this.read = null;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(nScriptIntrinsicBLAS_Double<StateT> nscriptintrinsicblas_double) {
        synchronized (this) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver("registerListener", new Object[0]);
            this.MediaBrowserCompat$CustomActionResultReceiver.add(nscriptintrinsicblas_double);
            IconCompatParcelizer();
        }
    }

    /* access modifiers changed from: protected */
    public abstract void read(Context context, Intent intent);

    public final void read(StateT statet) {
        synchronized (this) {
            Iterator it = new HashSet(this.MediaBrowserCompat$CustomActionResultReceiver).iterator();
            while (it.hasNext()) {
                ((nScriptIntrinsicBLAS_Double) it.next()).write(statet);
            }
        }
    }

    public final void read(nScriptIntrinsicBLAS_Double<StateT> nscriptintrinsicblas_double) {
        synchronized (this) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver("unregisterListener", new Object[0]);
            this.MediaBrowserCompat$CustomActionResultReceiver.remove(nscriptintrinsicblas_double);
            IconCompatParcelizer();
        }
    }
}

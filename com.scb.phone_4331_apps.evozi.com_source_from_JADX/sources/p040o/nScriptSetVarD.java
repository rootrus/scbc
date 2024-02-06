package p040o;

import java.util.concurrent.Executor;
import p040o.Short4;

/* renamed from: o.nScriptSetVarD */
public final class nScriptSetVarD<ResultT> implements nScriptSetVarI<ResultT> {
    public final Object IconCompatParcelizer = new Object();
    public nScriptInvoke<? super ResultT> MediaBrowserCompat$CustomActionResultReceiver;
    private final Executor read;

    public nScriptSetVarD(Executor executor, nScriptInvoke<? super ResultT> nscriptinvoke) {
        this.read = executor;
        this.MediaBrowserCompat$CustomActionResultReceiver = nscriptinvoke;
    }

    public final void read(nScriptInvokeIDCreate<ResultT> nscriptinvokeidcreate) {
        if (nscriptinvokeidcreate.write()) {
            synchronized (this.IconCompatParcelizer) {
                if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    this.read.execute(new Short4.write(this, nscriptinvokeidcreate));
                }
            }
        }
    }
}

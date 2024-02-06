package p040o;

import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: o.nScriptReduce */
public final class nScriptReduce<ResultT> extends nScriptInvokeIDCreate<ResultT> {
    private final Object IconCompatParcelizer = new Object();
    private Exception MediaBrowserCompat$CustomActionResultReceiver;
    private ResultT MediaBrowserCompat$ItemReceiver;
    private final nScriptSetVarF<ResultT> read = new nScriptSetVarF<>();
    private boolean write;

    nScriptReduce() {
    }

    private final void read() {
        synchronized (this.IconCompatParcelizer) {
            if (this.write) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(this);
            }
        }
    }

    public final boolean read(ResultT resultt) {
        synchronized (this.IconCompatParcelizer) {
            if (this.write) {
                return false;
            }
            this.write = true;
            this.MediaBrowserCompat$ItemReceiver = resultt;
            this.read.MediaBrowserCompat$CustomActionResultReceiver(this);
            return true;
        }
    }

    public final boolean write() {
        boolean z;
        synchronized (this.IconCompatParcelizer) {
            z = this.write && this.MediaBrowserCompat$CustomActionResultReceiver == null;
        }
        return z;
    }

    public final boolean write(Exception exc) {
        synchronized (this.IconCompatParcelizer) {
            if (this.write) {
                return false;
            }
            this.write = true;
            this.MediaBrowserCompat$CustomActionResultReceiver = exc;
            this.read.MediaBrowserCompat$CustomActionResultReceiver(this);
            return true;
        }
    }

    public final nScriptInvokeIDCreate<ResultT> read(nScriptInvoke<? super ResultT> nscriptinvoke) {
        Executor executor = nScriptIntrinsicCreate.MediaBrowserCompat$ItemReceiver;
        nScriptSetVarF<ResultT> nscriptsetvarf = this.read;
        nScriptSetVarD nscriptsetvard = new nScriptSetVarD(executor, nscriptinvoke);
        synchronized (nscriptsetvarf.write) {
            if (nscriptsetvarf.MediaBrowserCompat$ItemReceiver == null) {
                nscriptsetvarf.MediaBrowserCompat$ItemReceiver = new ArrayDeque();
            }
            nscriptsetvarf.MediaBrowserCompat$ItemReceiver.add(nscriptsetvard);
        }
        read();
        return this;
    }

    public final ResultT IconCompatParcelizer() {
        ResultT resultt;
        synchronized (this.IconCompatParcelizer) {
            if (!this.write) {
                throw new IllegalStateException("Task is not yet complete");
            } else if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                resultt = this.MediaBrowserCompat$ItemReceiver;
            } else {
                throw new RuntimeExecutionException(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }
        return resultt;
    }
}

package p040o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: o.MwBankAccountActivity_ViewBinding */
public final class MwBankAccountActivity_ViewBinding {
    private static final List<CoroutineExceptionHandler> MediaBrowserCompat$ItemReceiver;

    static {
        Iterator<S> it = ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator();
        onGetStartedClick.IconCompatParcelizer((Object) it, "ServiceLoader.load(\n    ….classLoader\n).iterator()");
        MediaBrowserCompat$ItemReceiver = JuristicRequestFormActivity.MediaBrowserCompat$CustomActionResultReceiver(JuristicRequestFormActivity.read(it));
    }

    public static final void MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Throwable th) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) th, "exception");
        Iterator<CoroutineExceptionHandler> it = MediaBrowserCompat$ItemReceiver.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "currentThread");
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}

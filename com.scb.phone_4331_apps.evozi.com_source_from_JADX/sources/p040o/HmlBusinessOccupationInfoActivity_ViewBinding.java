package p040o;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p039io.reactivex.exceptions.CompositeException;

/* renamed from: o.HmlBusinessOccupationInfoActivity_ViewBinding */
public final class HmlBusinessOccupationInfoActivity_ViewBinding {
    public static final Throwable write = new IconCompatParcelizer();

    public static RuntimeException MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    public static <T> boolean IconCompatParcelizer(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == write) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    public static <T> Throwable read(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = write;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static String read(long j, TimeUnit timeUnit) {
        StringBuilder sb = new StringBuilder();
        sb.append("The source did not signal an event for ");
        sb.append(j);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase());
        sb.append(" and has been terminated.");
        return sb.toString();
    }

    /* renamed from: o.HmlBusinessOccupationInfoActivity_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer extends Throwable {
        public final Throwable fillInStackTrace() {
            return this;
        }

        IconCompatParcelizer() {
            super("No further exceptions");
        }
    }
}

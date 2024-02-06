package p039io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.reactivex.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final List<Throwable> read;
    private Throwable write;

    public CompositeException(Throwable... thArr) {
        this((Iterable<? extends Throwable>) Arrays.asList(thArr));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).read);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.read = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.read.size());
            sb.append(" exceptions occurred. ");
            this.MediaBrowserCompat$CustomActionResultReceiver = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public final String getMessage() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.write     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            io.reactivex.exceptions.CompositeException$IconCompatParcelizer r0 = new io.reactivex.exceptions.CompositeException$IconCompatParcelizer     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.read     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = write(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.write = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.write     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p039io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        read(new CompositeException$MediaBrowserCompat$CustomActionResultReceiver(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        read(new read(printWriter));
    }

    private void read(write write2) {
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement append : getStackTrace()) {
            sb.append("\tat ");
            sb.append(append);
            sb.append(10);
        }
        int i = 1;
        for (Throwable MediaBrowserCompat$ItemReceiver : this.read) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            MediaBrowserCompat$ItemReceiver(sb, MediaBrowserCompat$ItemReceiver, "\t");
            i++;
        }
        write2.IconCompatParcelizer(sb.toString());
    }

    private void MediaBrowserCompat$ItemReceiver(StringBuilder sb, Throwable th, String str) {
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append(10);
            for (StackTraceElement append : th.getStackTrace()) {
                sb.append("\t\tat ");
                sb.append(append);
                sb.append(10);
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$write */
    static abstract class write {
        /* access modifiers changed from: package-private */
        public abstract void IconCompatParcelizer(Object obj);

        write() {
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$read */
    static final class read extends write {
        private final PrintWriter MediaBrowserCompat$ItemReceiver;

        read(PrintWriter printWriter) {
            this.MediaBrowserCompat$ItemReceiver = printWriter;
        }

        /* access modifiers changed from: package-private */
        public final void IconCompatParcelizer(Object obj) {
            this.MediaBrowserCompat$ItemReceiver.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$IconCompatParcelizer */
    static final class IconCompatParcelizer extends RuntimeException {
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }

        IconCompatParcelizer() {
        }
    }

    private static List<Throwable> MediaBrowserCompat$ItemReceiver(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    private static Throwable write(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }
}

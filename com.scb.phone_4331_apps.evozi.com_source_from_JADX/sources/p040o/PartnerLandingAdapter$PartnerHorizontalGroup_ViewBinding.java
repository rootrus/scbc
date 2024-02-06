package p040o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding */
public class PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding extends PinChangeActivity_ViewBinding {
    public static final IconCompatParcelizer Companion = new IconCompatParcelizer((byte) 0);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_MILLIS = TimeUnit.SECONDS.toMillis(60);
    /* access modifiers changed from: private */
    public static final long IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(IDLE_TIMEOUT_MILLIS);
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    /* access modifiers changed from: private */
    public static PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding head;
    private boolean inQueue;
    /* access modifiers changed from: private */
    public PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding next;
    /* access modifiers changed from: private */
    public long timeoutAt;

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    public final void enter() {
        if (!this.inQueue) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.inQueue = true;
                IconCompatParcelizer.read(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit".toString());
    }

    public final boolean exit() {
        if (!this.inQueue) {
            return false;
        }
        this.inQueue = false;
        return IconCompatParcelizer.read(this);
    }

    /* access modifiers changed from: private */
    public final long remainingNanos(long j) {
        return this.timeoutAt - j;
    }

    /* renamed from: o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding$read */
    public static final class read implements PinChangeActivity {
        private /* synthetic */ PinChangeActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding read;

        read(PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding, PinChangeActivity pinChangeActivity) {
            this.read = partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding;
            this.MediaBrowserCompat$CustomActionResultReceiver = pinChangeActivity;
        }

        public final void flush() {
            this.read.enter();
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.flush();
                this.read.exit$jvm(true);
            } catch (IOException e) {
                throw this.read.exit$jvm(e);
            } catch (Throwable th) {
                this.read.exit$jvm(false);
                throw th;
            }
        }

        public final void close() {
            this.read.enter();
            try {
                this.MediaBrowserCompat$CustomActionResultReceiver.close();
                this.read.exit$jvm(true);
            } catch (IOException e) {
                throw this.read.exit$jvm(e);
            } catch (Throwable th) {
                this.read.exit$jvm(false);
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AsyncTimeout.sink(");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(')');
            return sb.toString();
        }

        public final /* bridge */ /* synthetic */ PinChangeActivity_ViewBinding timeout() {
            return this.read;
        }

        public final void write(SCBUniversalWebViewActivity sCBUniversalWebViewActivity, long j) {
            onGetStartedClick.write((Object) sCBUniversalWebViewActivity, "source");
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(sCBUniversalWebViewActivity.read, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    PersonalizeActivity personalizeActivity = sCBUniversalWebViewActivity.write;
                    if (personalizeActivity == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (personalizeActivity.write - personalizeActivity.read);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        personalizeActivity = personalizeActivity.MediaBrowserCompat$ItemReceiver;
                        if (personalizeActivity == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                    }
                    this.read.enter();
                    try {
                        this.MediaBrowserCompat$CustomActionResultReceiver.write(sCBUniversalWebViewActivity, j2);
                        j -= j2;
                        this.read.exit$jvm(true);
                    } catch (IOException e) {
                        throw this.read.exit$jvm(e);
                    } catch (Throwable th) {
                        this.read.exit$jvm(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final PinChangeActivity sink(PinChangeActivity pinChangeActivity) {
        onGetStartedClick.write((Object) pinChangeActivity, "sink");
        return new read(this, pinChangeActivity);
    }

    public final HowToAddAccountStep2Activity source(HowToAddAccountStep2Activity howToAddAccountStep2Activity) {
        onGetStartedClick.write((Object) howToAddAccountStep2Activity, "source");
        return new C6973xe9e3c5f4(this, howToAddAccountStep2Activity);
    }

    public final void exit$jvm(boolean z) {
        if (exit() && z) {
            throw newTimeoutException((IOException) null);
        }
    }

    public final IOException exit$jvm(IOException iOException) {
        onGetStartedClick.write((Object) iOException, "cause");
        return exit() ? newTimeoutException(iOException) : iOException;
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding$write */
    static final class write extends Thread {
        public write() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
            if (r1 == null) goto L_0x0000;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            r1.timedOut();
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding> r0 = p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding$IconCompatParcelizer r1 = p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.Companion     // Catch:{ all -> 0x001e }
                o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding r1 = p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.IconCompatParcelizer.IconCompatParcelizer()     // Catch:{ all -> 0x001e }
                o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding r2 = p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head     // Catch:{ all -> 0x001e }
                if (r1 != r2) goto L_0x0015
                r1 = 0
                p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head = r1     // Catch:{ all -> 0x001e }
                monitor-exit(r0)
                return
            L_0x0015:
                o.HmlVerifyPhoneValidateOtpActivity r2 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x001e }
                monitor-exit(r0)
                if (r1 == 0) goto L_0x0000
                r1.timedOut()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x001e:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ InterruptedException -> 0x0000 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.write.run():void");
        }
    }

    /* renamed from: o.PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        /* access modifiers changed from: private */
        public static boolean read(PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding) {
            synchronized (PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.class) {
                for (PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding access$getHead$cp = PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head; access$getHead$cp != null; access$getHead$cp = access$getHead$cp.next) {
                    if (access$getHead$cp.next == partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding) {
                        access$getHead$cp.next = partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.next;
                        partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        public static PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding IconCompatParcelizer() throws InterruptedException {
            PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding access$getHead$cp = PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head;
            if (access$getHead$cp == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding access$getNext$p = access$getHead$cp.next;
            if (access$getNext$p == null) {
                long nanoTime = System.nanoTime();
                PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.class.wait(PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.IDLE_TIMEOUT_MILLIS);
                PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding access$getHead$cp2 = PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head;
                if (access$getHead$cp2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                if (access$getHead$cp2.next != null || System.nanoTime() - nanoTime < PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head;
            }
            long access$remainingNanos = access$getNext$p.remainingNanos(System.nanoTime());
            if (access$remainingNanos > 0) {
                long j = access$remainingNanos / 1000000;
                PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.class.wait(j, (int) (access$remainingNanos - (1000000 * j)));
                return null;
            }
            PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding access$getHead$cp3 = PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head;
            if (access$getHead$cp3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            access$getHead$cp3.next = access$getNext$p.next;
            access$getNext$p.next = null;
            return access$getNext$p;
        }

        public static final /* synthetic */ void read(PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding, long j, boolean z) {
            synchronized (PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.class) {
                if (PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head == null) {
                    PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head = new PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding();
                    new write().start();
                }
                long nanoTime = System.nanoTime();
                int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i != 0 && z) {
                    partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.timeoutAt = Math.min(j, partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (i != 0) {
                    partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.timeoutAt = j + nanoTime;
                } else if (z) {
                    partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.timeoutAt = partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.deadlineNanoTime();
                } else {
                    throw new AssertionError();
                }
                long access$remainingNanos = partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.remainingNanos(nanoTime);
                PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding access$getHead$cp = PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head;
                if (access$getHead$cp == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                while (true) {
                    if (access$getHead$cp.next == null) {
                        break;
                    }
                    PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding access$getNext$p = access$getHead$cp.next;
                    if (access$getNext$p == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    if (access$remainingNanos < access$getNext$p.remainingNanos(nanoTime)) {
                        break;
                    }
                    access$getHead$cp = access$getHead$cp.next;
                    if (access$getHead$cp == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                }
                partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.next = access$getHead$cp.next;
                access$getHead$cp.next = partnerLandingAdapter$PartnerHorizontalGroup_ViewBinding;
                if (access$getHead$cp == PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.head) {
                    PartnerLandingAdapter$PartnerHorizontalGroup_ViewBinding.class.notify();
                }
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }
    }
}

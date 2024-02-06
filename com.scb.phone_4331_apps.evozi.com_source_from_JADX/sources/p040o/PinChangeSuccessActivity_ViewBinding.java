package p040o;

import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: o.PinChangeSuccessActivity_ViewBinding */
public class PinChangeSuccessActivity_ViewBinding extends ModifyQuickPromptPayActivity {
    private static PinChangeSuccessActivity_ViewBinding amZ;
    private boolean ana;
    private PinChangeSuccessActivity_ViewBinding anb;
    private long anc;

    /* access modifiers changed from: protected */
    public void timedOut() {
    }

    public final void enter() {
        if (!this.ana) {
            long timeoutNanos = timeoutNanos();
            boolean hasDeadline = hasDeadline();
            if (timeoutNanos != 0 || hasDeadline) {
                this.ana = true;
                m5767a(this, timeoutNanos, hasDeadline);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* renamed from: a */
    private static void m5767a(PinChangeSuccessActivity_ViewBinding pinChangeSuccessActivity_ViewBinding, long j, boolean z) {
        Class<PinChangeSuccessActivity_ViewBinding> cls = PinChangeSuccessActivity_ViewBinding.class;
        synchronized (cls) {
            if (amZ == null) {
                amZ = new PinChangeSuccessActivity_ViewBinding();
                new C9797x131478ca().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i != 0 && z) {
                pinChangeSuccessActivity_ViewBinding.anc = Math.min(j, pinChangeSuccessActivity_ViewBinding.deadlineNanoTime() - nanoTime) + nanoTime;
            } else if (i != 0) {
                pinChangeSuccessActivity_ViewBinding.anc = j + nanoTime;
            } else if (z) {
                pinChangeSuccessActivity_ViewBinding.anc = pinChangeSuccessActivity_ViewBinding.deadlineNanoTime();
            } else {
                throw new AssertionError();
            }
            long f = pinChangeSuccessActivity_ViewBinding.m5769f(nanoTime);
            PinChangeSuccessActivity_ViewBinding pinChangeSuccessActivity_ViewBinding2 = amZ;
            while (true) {
                if (pinChangeSuccessActivity_ViewBinding2.anb == null) {
                    break;
                } else if (f < pinChangeSuccessActivity_ViewBinding2.anb.m5769f(nanoTime)) {
                    break;
                } else {
                    pinChangeSuccessActivity_ViewBinding2 = pinChangeSuccessActivity_ViewBinding2.anb;
                }
            }
            pinChangeSuccessActivity_ViewBinding.anb = pinChangeSuccessActivity_ViewBinding2.anb;
            pinChangeSuccessActivity_ViewBinding2.anb = pinChangeSuccessActivity_ViewBinding;
            if (pinChangeSuccessActivity_ViewBinding2 == amZ) {
                cls.notify();
            }
        }
    }

    public final boolean exit() {
        if (!this.ana) {
            return false;
        }
        this.ana = false;
        return m5768a(this);
    }

    /* renamed from: a */
    private static boolean m5768a(PinChangeSuccessActivity_ViewBinding pinChangeSuccessActivity_ViewBinding) {
        synchronized (PinChangeSuccessActivity_ViewBinding.class) {
            for (PinChangeSuccessActivity_ViewBinding pinChangeSuccessActivity_ViewBinding2 = amZ; pinChangeSuccessActivity_ViewBinding2 != null; pinChangeSuccessActivity_ViewBinding2 = pinChangeSuccessActivity_ViewBinding2.anb) {
                if (pinChangeSuccessActivity_ViewBinding2.anb == pinChangeSuccessActivity_ViewBinding) {
                    pinChangeSuccessActivity_ViewBinding2.anb = pinChangeSuccessActivity_ViewBinding.anb;
                    pinChangeSuccessActivity_ViewBinding.anb = null;
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: f */
    private long m5769f(long j) {
        return this.anc - j;
    }

    public final QuickPromptPayActivity sink(final QuickPromptPayActivity quickPromptPayActivity) {
        return new QuickPromptPayActivity() {
            public final void write(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                PinChangeSuccessActivity_ViewBinding.this.enter();
                try {
                    quickPromptPayActivity.write(onmenupromptpayclick, j);
                    PinChangeSuccessActivity_ViewBinding.this.exit(true);
                } catch (IOException e) {
                    throw PinChangeSuccessActivity_ViewBinding.this.exit(e);
                } catch (Throwable th) {
                    PinChangeSuccessActivity_ViewBinding.this.exit(false);
                    throw th;
                }
            }

            public final void flush() throws IOException {
                PinChangeSuccessActivity_ViewBinding.this.enter();
                try {
                    quickPromptPayActivity.flush();
                    PinChangeSuccessActivity_ViewBinding.this.exit(true);
                } catch (IOException e) {
                    throw PinChangeSuccessActivity_ViewBinding.this.exit(e);
                } catch (Throwable th) {
                    PinChangeSuccessActivity_ViewBinding.this.exit(false);
                    throw th;
                }
            }

            public final void close() throws IOException {
                PinChangeSuccessActivity_ViewBinding.this.enter();
                try {
                    quickPromptPayActivity.close();
                    PinChangeSuccessActivity_ViewBinding.this.exit(true);
                } catch (IOException e) {
                    throw PinChangeSuccessActivity_ViewBinding.this.exit(e);
                } catch (Throwable th) {
                    PinChangeSuccessActivity_ViewBinding.this.exit(false);
                    throw th;
                }
            }

            public final ModifyQuickPromptPayActivity timeout() {
                return PinChangeSuccessActivity_ViewBinding.this;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("AsyncTimeout.sink(");
                sb.append(quickPromptPayActivity);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    public final HowToAddAccountActivity source(final HowToAddAccountActivity howToAddAccountActivity) {
        return new HowToAddAccountActivity() {
            public final long read(onMenuPromptPayClick onmenupromptpayclick, long j) throws IOException {
                PinChangeSuccessActivity_ViewBinding.this.enter();
                try {
                    long read = howToAddAccountActivity.read(onmenupromptpayclick, j);
                    PinChangeSuccessActivity_ViewBinding.this.exit(true);
                    return read;
                } catch (IOException e) {
                    throw PinChangeSuccessActivity_ViewBinding.this.exit(e);
                } catch (Throwable th) {
                    PinChangeSuccessActivity_ViewBinding.this.exit(false);
                    throw th;
                }
            }

            public final void close() throws IOException {
                try {
                    howToAddAccountActivity.close();
                    PinChangeSuccessActivity_ViewBinding.this.exit(true);
                } catch (IOException e) {
                    throw PinChangeSuccessActivity_ViewBinding.this.exit(e);
                } catch (Throwable th) {
                    PinChangeSuccessActivity_ViewBinding.this.exit(false);
                    throw th;
                }
            }

            public final ModifyQuickPromptPayActivity timeout() {
                return PinChangeSuccessActivity_ViewBinding.this;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("AsyncTimeout.source(");
                sb.append(howToAddAccountActivity);
                sb.append(")");
                return sb.toString();
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final void exit(boolean z) throws IOException {
        if (exit() && z) {
            throw newTimeoutException((IOException) null);
        }
    }

    /* access modifiers changed from: package-private */
    public final IOException exit(IOException iOException) throws IOException {
        if (!exit()) {
            return iOException;
        }
        return newTimeoutException(iOException);
    }

    /* access modifiers changed from: protected */
    public IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: private */
    /* renamed from: vu */
    public static PinChangeSuccessActivity_ViewBinding m5770vu() throws InterruptedException {
        Class<PinChangeSuccessActivity_ViewBinding> cls = PinChangeSuccessActivity_ViewBinding.class;
        synchronized (cls) {
            PinChangeSuccessActivity_ViewBinding pinChangeSuccessActivity_ViewBinding = amZ.anb;
            if (pinChangeSuccessActivity_ViewBinding == null) {
                cls.wait();
                return null;
            }
            long f = pinChangeSuccessActivity_ViewBinding.m5769f(System.nanoTime());
            if (f > 0) {
                long j = f / 1000000;
                Long.signum(j);
                cls.wait(j, (int) (f - (1000000 * j)));
                return null;
            }
            amZ.anb = pinChangeSuccessActivity_ViewBinding.anb;
            pinChangeSuccessActivity_ViewBinding.anb = null;
            return pinChangeSuccessActivity_ViewBinding;
        }
    }
}

package p040o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;

/* renamed from: o.omGMBSectionClick */
public abstract class omGMBSectionClick extends onDownloadClick implements MwChangeCasaSuccessActivity_ViewBinding {
    private static final AtomicReferenceFieldUpdater MediaBrowserCompat$CustomActionResultReceiver;
    private static final AtomicReferenceFieldUpdater MediaBrowserCompat$SearchResultReceiver;
    private volatile Object _delayed = null;
    /* access modifiers changed from: private */
    public volatile int _isCompleted = 0;
    private volatile Object _queue = null;

    static {
        Class<omGMBSectionClick> cls = omGMBSectionClick.class;
        MediaBrowserCompat$SearchResultReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_queue");
        MediaBrowserCompat$CustomActionResultReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_delayed");
    }

    public MwCurrentUserEwalletActivity MediaBrowserCompat$ItemReceiver(long j, Runnable runnable) {
        onGetStartedClick.write((Object) runnable, "block");
        onGetStartedClick.write((Object) runnable, "block");
        return onClickDone.write().MediaBrowserCompat$ItemReceiver(j, runnable);
    }

    /* access modifiers changed from: protected */
    public final long IconCompatParcelizer() {
        write write2;
        if (super.IconCompatParcelizer() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof NdidNationalIdInputActivity) {
                long j = ((NdidNationalIdInputActivity) obj)._state;
                boolean z = false;
                if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                    z = true;
                }
                if (!z) {
                    return 0;
                }
            } else if (obj == MwEditCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
        if (iconCompatParcelizer == null || (write2 = (write) iconCompatParcelizer.read()) == null) {
            return Long.MAX_VALUE;
        }
        long nanoTime = write2.MediaBrowserCompat$ItemReceiver - System.nanoTime();
        if (nanoTime < 0) {
            return 0;
        }
        return nanoTime;
    }

    /* access modifiers changed from: protected */
    public final void MediaDescriptionCompat() {
        handleTextChange handletextchange = handleTextChange.write;
        handleTextChange.MediaBrowserCompat$ItemReceiver();
        this._isCompleted = 1;
        if (!MwChangeCasaSuccessActivity.write() || this._isCompleted != 0) {
            while (true) {
                Object obj = this._queue;
                if (obj != null) {
                    if (!(obj instanceof NdidNationalIdInputActivity)) {
                        if (obj == MwEditCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver) {
                            break;
                        }
                        NdidNationalIdInputActivity ndidNationalIdInputActivity = new NdidNationalIdInputActivity(8, true);
                        if (obj != null) {
                            ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver((Runnable) obj);
                            if (MediaBrowserCompat$SearchResultReceiver.compareAndSet(this, obj, ndidNationalIdInputActivity)) {
                                break;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                        }
                    } else {
                        ((NdidNationalIdInputActivity) obj).MediaBrowserCompat$ItemReceiver();
                        break;
                    }
                } else if (MediaBrowserCompat$SearchResultReceiver.compareAndSet(this, (Object) null, MwEditCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver)) {
                    break;
                }
            }
            do {
            } while (MediaMetadataCompat() <= 0);
            MediaSessionCompat$QueueItem();
            return;
        }
        throw new AssertionError();
    }

    public final void write(long j, MailingAddressReviewOTPActivity<? super HmlVerifyPhoneValidateOtpActivity> mailingAddressReviewOTPActivity) {
        onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "continuation");
        long write2 = MwEditCreateQrActivity.write(j);
        if (write2 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            omGMBSectionClick$MediaBrowserCompat$ItemReceiver omgmbsectionclick_mediabrowsercompat_itemreceiver = new omGMBSectionClick$MediaBrowserCompat$ItemReceiver(this, write2 + nanoTime, mailingAddressReviewOTPActivity);
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((MailingAddressReviewOTPActivity<?>) mailingAddressReviewOTPActivity, (MwCurrentUserEwalletActivity) omgmbsectionclick_mediabrowsercompat_itemreceiver);
            MediaBrowserCompat$ItemReceiver(nanoTime, (write) omgmbsectionclick_mediabrowsercompat_itemreceiver);
        }
    }

    public final long MediaMetadataCompat() {
        NtbOpenAccountLandingActivity ntbOpenAccountLandingActivity;
        if (RatingCompat()) {
            return IconCompatParcelizer();
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
        Runnable runnable = null;
        if (iconCompatParcelizer != null) {
            if (!(iconCompatParcelizer._size == 0)) {
                long nanoTime = System.nanoTime();
                do {
                    synchronized (iconCompatParcelizer) {
                        T[] tArr = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                        T t = tArr != null ? tArr[0] : null;
                        if (t != null) {
                            write write2 = (write) t;
                            ntbOpenAccountLandingActivity = ((nanoTime - write2.MediaBrowserCompat$ItemReceiver) > 0 ? 1 : ((nanoTime - write2.MediaBrowserCompat$ItemReceiver) == 0 ? 0 : -1)) >= 0 ? IconCompatParcelizer(write2) : false ? iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(0) : null;
                        } else {
                            ntbOpenAccountLandingActivity = null;
                        }
                    }
                } while (((write) ntbOpenAccountLandingActivity) != null);
            }
        }
        while (true) {
            Object obj = this._queue;
            if (obj != null) {
                if (!(obj instanceof NdidNationalIdInputActivity)) {
                    if (obj == MwEditCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver) {
                        break;
                    } else if (MediaBrowserCompat$SearchResultReceiver.compareAndSet(this, obj, (Object) null)) {
                        if (obj != null) {
                            runnable = (Runnable) obj;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                        }
                    }
                } else if (obj != null) {
                    NdidNationalIdInputActivity ndidNationalIdInputActivity = (NdidNationalIdInputActivity) obj;
                    Object write3 = ndidNationalIdInputActivity.write();
                    if (write3 != NdidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver) {
                        runnable = (Runnable) write3;
                        break;
                    }
                    MediaBrowserCompat$SearchResultReceiver.compareAndSet(this, obj, ndidNationalIdInputActivity.read(ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver()));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else {
                break;
            }
        }
        if (runnable != null) {
            runnable.run();
        }
        return IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Runnable runnable) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) runnable, "block");
        onGetStartedClick.write((Object) runnable, "task");
        if (IconCompatParcelizer(runnable)) {
            MediaBrowserCompat$SearchResultReceiver();
            return;
        }
        lambda$onCreate$0$MwCoachMarkActivity lambda_oncreate_0_mwcoachmarkactivity = lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver;
        while (true) {
            onGetStartedClick.write((Object) runnable, "task");
            if (lambda_oncreate_0_mwcoachmarkactivity.IconCompatParcelizer(runnable)) {
                lambda_oncreate_0_mwcoachmarkactivity.MediaBrowserCompat$SearchResultReceiver();
                return;
            }
            lambda_oncreate_0_mwcoachmarkactivity = lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Runnable runnable) {
        omGMBSectionClick omgmbsectionclick = this;
        while (true) {
            onGetStartedClick.write((Object) runnable, "task");
            if (omgmbsectionclick.IconCompatParcelizer(runnable)) {
                omgmbsectionclick.MediaBrowserCompat$SearchResultReceiver();
                return;
            }
            omgmbsectionclick = lambda$onCreate$0$MwCoachMarkActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$MediaItem() {
        this._queue = null;
        this._delayed = null;
    }

    private final void MediaSessionCompat$QueueItem() {
        write write2;
        long nanoTime = System.nanoTime();
        while (true) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
            if (iconCompatParcelizer != null && (write2 = (write) iconCompatParcelizer.write()) != null) {
                write(nanoTime, write2);
            } else {
                return;
            }
        }
    }

    /* renamed from: o.omGMBSectionClick$write */
    public static abstract class write implements Runnable, Comparable<write>, MwCurrentUserEwalletActivity, NtbOpenAccountLandingActivity {
        private int IconCompatParcelizer = -1;
        private Object MediaBrowserCompat$CustomActionResultReceiver;
        public long MediaBrowserCompat$ItemReceiver;

        public write(long j) {
            this.MediaBrowserCompat$ItemReceiver = j;
        }

        public /* synthetic */ int compareTo(Object obj) {
            write write = (write) obj;
            onGetStartedClick.write((Object) write, "other");
            int i = ((this.MediaBrowserCompat$ItemReceiver - write.MediaBrowserCompat$ItemReceiver) > 0 ? 1 : ((this.MediaBrowserCompat$ItemReceiver - write.MediaBrowserCompat$ItemReceiver) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        public final NTBPartnerWebViewActivity<?> read() {
            Object obj = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (!(obj instanceof NTBPartnerWebViewActivity)) {
                obj = null;
            }
            return (NTBPartnerWebViewActivity) obj;
        }

        public final void IconCompatParcelizer(NTBPartnerWebViewActivity<?> nTBPartnerWebViewActivity) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver != MwEditCreateQrActivity.read) {
                this.MediaBrowserCompat$CustomActionResultReceiver = nTBPartnerWebViewActivity;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            this.IconCompatParcelizer = i;
        }

        public final int MediaBrowserCompat$ItemReceiver() {
            return this.IconCompatParcelizer;
        }

        public final int IconCompatParcelizer(long j, IconCompatParcelizer iconCompatParcelizer, omGMBSectionClick omgmbsectionclick) {
            synchronized (this) {
                onGetStartedClick.write((Object) iconCompatParcelizer, "delayed");
                onGetStartedClick.write((Object) omgmbsectionclick, "eventLoop");
                if (this.MediaBrowserCompat$CustomActionResultReceiver == MwEditCreateQrActivity.read) {
                    return 2;
                }
                T t = this;
                synchronized (iconCompatParcelizer) {
                    T[] tArr = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                    write write = (write) (tArr != null ? tArr[0] : null);
                    if (omgmbsectionclick._isCompleted) {
                        return 1;
                    }
                    if (write == null) {
                        iconCompatParcelizer.read = j;
                    } else {
                        long j2 = write.MediaBrowserCompat$ItemReceiver;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - iconCompatParcelizer.read > 0) {
                            iconCompatParcelizer.read = j;
                        }
                    }
                    if (this.MediaBrowserCompat$ItemReceiver - iconCompatParcelizer.read < 0) {
                        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer.read;
                    }
                    onGetStartedClick.write((Object) t, "node");
                    if (MwChangeCasaSuccessActivity.write()) {
                        if (!(t.read() == null)) {
                            throw new AssertionError();
                        }
                    }
                    t.IconCompatParcelizer(iconCompatParcelizer);
                    T[] tArr2 = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                    if (tArr2 == null) {
                        tArr2 = new NtbOpenAccountLandingActivity[4];
                        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = tArr2;
                    } else if (iconCompatParcelizer._size >= tArr2.length) {
                        T[] copyOf = Arrays.copyOf(tArr2, iconCompatParcelizer._size << 1);
                        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
                        tArr2 = (NtbOpenAccountLandingActivity[]) copyOf;
                        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = tArr2;
                    }
                    int i = iconCompatParcelizer._size;
                    iconCompatParcelizer._size = i + 1;
                    tArr2[i] = t;
                    t.MediaBrowserCompat$CustomActionResultReceiver(i);
                    iconCompatParcelizer.read(i);
                    return 0;
                }
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            synchronized (this) {
                Object obj = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (obj != MwEditCreateQrActivity.read) {
                    if (!(obj instanceof IconCompatParcelizer)) {
                        obj = null;
                    }
                    IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                    if (iconCompatParcelizer != null) {
                        iconCompatParcelizer.IconCompatParcelizer(this);
                    }
                    this.MediaBrowserCompat$CustomActionResultReceiver = MwEditCreateQrActivity.read;
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Delayed[nanos=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(']');
            return sb.toString();
        }
    }

    /* renamed from: o.omGMBSectionClick$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends NTBPartnerWebViewActivity<write> {
        public long read;

        public IconCompatParcelizer(long j) {
            this.read = j;
        }
    }

    private final boolean IconCompatParcelizer(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (MediaBrowserCompat$SearchResultReceiver.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof NdidNationalIdInputActivity) {
                if (obj != null) {
                    NdidNationalIdInputActivity ndidNationalIdInputActivity = (NdidNationalIdInputActivity) obj;
                    int MediaBrowserCompat$CustomActionResultReceiver2 = ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver(runnable);
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == 0) {
                        return true;
                    }
                    if (MediaBrowserCompat$CustomActionResultReceiver2 == 1) {
                        MediaBrowserCompat$SearchResultReceiver.compareAndSet(this, obj, ndidNationalIdInputActivity.read(ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver()));
                    } else if (MediaBrowserCompat$CustomActionResultReceiver2 == 2) {
                        return false;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == MwEditCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver) {
                return false;
            } else {
                NdidNationalIdInputActivity ndidNationalIdInputActivity2 = new NdidNationalIdInputActivity(8, true);
                if (obj != null) {
                    ndidNationalIdInputActivity2.MediaBrowserCompat$CustomActionResultReceiver((Runnable) obj);
                    ndidNationalIdInputActivity2.MediaBrowserCompat$CustomActionResultReceiver(runnable);
                    if (MediaBrowserCompat$SearchResultReceiver.compareAndSet(this, obj, ndidNationalIdInputActivity2)) {
                        return true;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = this.read;
        if (!(baseLivenessCheckActivity_ViewBinding == null || baseLivenessCheckActivity_ViewBinding.IconCompatParcelizer == baseLivenessCheckActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
        if (iconCompatParcelizer != null) {
            if (!(iconCompatParcelizer._size == 0)) {
                return false;
            }
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof NdidNationalIdInputActivity) {
            long j = ((NdidNationalIdInputActivity) obj)._state;
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == MwEditCreateQrActivity.MediaBrowserCompat$CustomActionResultReceiver) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [o.NtbOpenAccountLandingActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$ItemReceiver(long r6, p040o.omGMBSectionClick.write r8) {
        /*
            r5 = this;
            java.lang.String r0 = "delayedTask"
            p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
            int r0 = r5._isCompleted
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000d
            r0 = r2
            goto L_0x002d
        L_0x000d:
            java.lang.Object r0 = r5._delayed
            o.omGMBSectionClick$IconCompatParcelizer r0 = (p040o.omGMBSectionClick.IconCompatParcelizer) r0
            if (r0 != 0) goto L_0x0029
            r0 = r5
            o.omGMBSectionClick r0 = (p040o.omGMBSectionClick) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = MediaBrowserCompat$CustomActionResultReceiver
            o.omGMBSectionClick$IconCompatParcelizer r4 = new o.omGMBSectionClick$IconCompatParcelizer
            r4.<init>(r6)
            r3.compareAndSet(r0, r1, r4)
            java.lang.Object r0 = r0._delayed
            if (r0 != 0) goto L_0x0027
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0027:
            o.omGMBSectionClick$IconCompatParcelizer r0 = (p040o.omGMBSectionClick.IconCompatParcelizer) r0
        L_0x0029:
            int r0 = r8.IconCompatParcelizer(r6, r0, r5)
        L_0x002d:
            if (r0 == 0) goto L_0x0047
            if (r0 == r2) goto L_0x0043
            r6 = 2
            if (r0 != r6) goto L_0x0035
            goto L_0x005d
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "unexpected result"
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            throw r6
        L_0x0043:
            r5.write(r6, r8)
            return
        L_0x0047:
            java.lang.Object r6 = r5._delayed
            o.omGMBSectionClick$IconCompatParcelizer r6 = (p040o.omGMBSectionClick.IconCompatParcelizer) r6
            if (r6 == 0) goto L_0x0054
            o.NtbOpenAccountLandingActivity r6 = r6.read()
            r1 = r6
            o.omGMBSectionClick$write r1 = (p040o.omGMBSectionClick.write) r1
        L_0x0054:
            if (r1 != r8) goto L_0x0057
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            if (r2 == 0) goto L_0x005d
            r5.MediaBrowserCompat$SearchResultReceiver()
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.omGMBSectionClick.MediaBrowserCompat$ItemReceiver(long, o.omGMBSectionClick$write):void");
    }
}

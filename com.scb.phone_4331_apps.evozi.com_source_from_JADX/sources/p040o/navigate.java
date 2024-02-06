package p040o;

import com.google.android.gms.common.api.Api;
import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import p040o.AddAccountInfoActivity;
import p040o.lambda$new$0;

/* renamed from: o.navigate */
public final class navigate implements Executor, Closeable {
    public static final EkycOtpActivity IconCompatParcelizer = new EkycOtpActivity("NOT_IN_STACK");
    static final AtomicLongFieldUpdater MediaBrowserCompat$ItemReceiver;
    private static final AtomicIntegerFieldUpdater MediaBrowserCompat$MediaItem;
    static final AtomicLongFieldUpdater write;
    public final ReviewInfoResultActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    public final long MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private int f3168x50fd9e4a;
    public final String MediaDescriptionCompat;
    public final AtomicReferenceArray<IconCompatParcelizer> MediaMetadataCompat;
    public final ReviewInfoResultActivity_ViewBinding RatingCompat;
    volatile int _isTerminated;
    volatile long controlState;
    volatile long parkedWorkersStack;
    public final int read;

    /* renamed from: o.navigate$read */
    public enum read {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public navigate(int i, int i2, long j, String str) {
        onGetStartedClick.write((Object) str, "schedulerName");
        this.read = i;
        this.f3168x50fd9e4a = i2;
        this.MediaBrowserCompat$SearchResultReceiver = j;
        this.MediaDescriptionCompat = str;
        if (i > 0) {
            if (this.f3168x50fd9e4a >= this.read) {
                if (this.f3168x50fd9e4a <= 2097150) {
                    if (this.MediaBrowserCompat$SearchResultReceiver > 0) {
                        this.RatingCompat = new ReviewInfoResultActivity_ViewBinding();
                        this.MediaBrowserCompat$CustomActionResultReceiver = new ReviewInfoResultActivity_ViewBinding();
                        this.parkedWorkersStack = 0;
                        this.MediaMetadataCompat = new AtomicReferenceArray<>(this.f3168x50fd9e4a + 1);
                        this.controlState = ((long) this.read) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Idle worker keep alive time ");
                    sb.append(this.MediaBrowserCompat$SearchResultReceiver);
                    sb.append(" must be positive");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Max pool size ");
                sb2.append(this.f3168x50fd9e4a);
                sb2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Max pool size ");
            sb3.append(this.f3168x50fd9e4a);
            sb3.append(" should be greater than or equals to core pool size ");
            sb3.append(this.read);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Core pool size ");
        sb4.append(this.read);
        sb4.append(" should be at least 1");
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    static {
        Class<navigate> cls = navigate.class;
        write = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        MediaBrowserCompat$ItemReceiver = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        MediaBrowserCompat$MediaItem = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(navigate navigate, Runnable runnable, NationalIdActivity_ViewBinding nationalIdActivity_ViewBinding, boolean z, int i) {
        if ((i & 2) != 0) {
            nationalIdActivity_ViewBinding = lambda$setListeners$3$NationalIdActivity.write;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        navigate.write(runnable, nationalIdActivity_ViewBinding, z);
    }

    public final void write(Runnable runnable, NationalIdActivity_ViewBinding nationalIdActivity_ViewBinding, boolean z) {
        onGetStartedClick.write((Object) runnable, "block");
        onGetStartedClick.write((Object) nationalIdActivity_ViewBinding, "taskContext");
        lambda$new$0.NationalIdActivity read2 = read(runnable, nationalIdActivity_ViewBinding);
        lambda$new$0.NationalIdActivity IconCompatParcelizer2 = IconCompatParcelizer(read2, z);
        if (IconCompatParcelizer2 != null && !read(IconCompatParcelizer2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.MediaDescriptionCompat);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        } else if (read2.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer() == FatcaErrorActivity.NON_BLOCKING) {
            IconCompatParcelizer();
        } else {
            read();
        }
    }

    public static lambda$new$0.NationalIdActivity read(Runnable runnable, NationalIdActivity_ViewBinding nationalIdActivity_ViewBinding) {
        onGetStartedClick.write((Object) runnable, "block");
        onGetStartedClick.write((Object) nationalIdActivity_ViewBinding, "taskContext");
        long write2 = openHome.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (!(runnable instanceof lambda$new$0.NationalIdActivity)) {
            return new openFindUs(runnable, write2, nationalIdActivity_ViewBinding);
        }
        lambda$new$0.NationalIdActivity nationalIdActivity = (lambda$new$0.NationalIdActivity) runnable;
        nationalIdActivity.RatingCompat = write2;
        nationalIdActivity.MediaBrowserCompat$SearchResultReceiver = nationalIdActivity_ViewBinding;
        return nationalIdActivity;
    }

    private final boolean IconCompatParcelizer(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.read) {
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 == 1 && this.read > 1) {
                MediaBrowserCompat$ItemReceiver();
            }
            if (MediaBrowserCompat$ItemReceiver2 > 0) {
                return true;
            }
        }
        return false;
    }

    private final int MediaBrowserCompat$ItemReceiver() {
        synchronized (this.MediaMetadataCompat) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            boolean z = false;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.read) {
                return 0;
            }
            if (i >= this.f3168x50fd9e4a) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 > 0 && this.MediaMetadataCompat.get(i3) == null) {
                IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, i3);
                this.MediaMetadataCompat.set(i3, iconCompatParcelizer);
                if (i3 == ((int) (2097151 & MediaBrowserCompat$ItemReceiver.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.start();
                    return i2 + 1;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final lambda$new$0.NationalIdActivity IconCompatParcelizer(lambda$new$0.NationalIdActivity nationalIdActivity, boolean z) {
        IconCompatParcelizer write2 = write();
        if (write2 == null || write2.IconCompatParcelizer == read.TERMINATED) {
            return nationalIdActivity;
        }
        if (nationalIdActivity.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer() == FatcaErrorActivity.NON_BLOCKING && write2.IconCompatParcelizer == read.BLOCKING) {
            return nationalIdActivity;
        }
        write2.MediaBrowserCompat$ItemReceiver = true;
        return write2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(nationalIdActivity, z);
    }

    private final IconCompatParcelizer write() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof IconCompatParcelizer)) {
            currentThread = null;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) currentThread;
        if (iconCompatParcelizer == null || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) navigate.this, (Object) this)) {
            return null;
        }
        return iconCompatParcelizer;
    }

    public final String toString() {
        int i;
        ArrayList arrayList = new ArrayList();
        int length = this.MediaMetadataCompat.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length; i7++) {
            IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat.get(i7);
            if (iconCompatParcelizer != null) {
                FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                if (fatcaErrorActivity_ViewBinding.lastScheduledTask != null) {
                    i = (fatcaErrorActivity_ViewBinding.producerIndex - fatcaErrorActivity_ViewBinding.consumerIndex) + 1;
                } else {
                    i = fatcaErrorActivity_ViewBinding.producerIndex - fatcaErrorActivity_ViewBinding.consumerIndex;
                }
                int i8 = NtbOpenAccountLandingActivity_ViewBinding.write[iconCompatParcelizer.IconCompatParcelizer.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(i));
                    sb.append("b");
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(String.valueOf(i));
                    sb2.append("c");
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i5++;
                    if (i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(String.valueOf(i));
                        sb3.append(KtaJsonExactionHelper.OBJECT);
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i6++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.MediaDescriptionCompat);
        sb4.append('@');
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb4.append(hexString);
        sb4.append('[');
        sb4.append("Pool Size {");
        sb4.append("core = ");
        sb4.append(this.read);
        sb4.append(", ");
        sb4.append("max = ");
        sb4.append(this.f3168x50fd9e4a);
        sb4.append("}, ");
        sb4.append("Worker States {");
        sb4.append("CPU = ");
        sb4.append(i2);
        sb4.append(", ");
        sb4.append("blocking = ");
        sb4.append(i3);
        sb4.append(", ");
        sb4.append("parked = ");
        sb4.append(i4);
        sb4.append(", ");
        sb4.append("dormant = ");
        sb4.append(i5);
        sb4.append(", ");
        sb4.append("terminated = ");
        sb4.append(i6);
        sb4.append("}, ");
        sb4.append("running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", ");
        sb4.append("global CPU queue size = ");
        sb4.append(this.RatingCompat.write());
        sb4.append(", ");
        sb4.append("global blocking queue size = ");
        sb4.append(this.MediaBrowserCompat$CustomActionResultReceiver.write());
        sb4.append(", ");
        sb4.append("Control State {");
        sb4.append("created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", ");
        sb4.append("blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", ");
        sb4.append("CPUs acquired = ");
        sb4.append(this.read - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public static void MediaBrowserCompat$ItemReceiver(lambda$new$0.NationalIdActivity nationalIdActivity) {
        onGetStartedClick.write((Object) nationalIdActivity, "task");
        try {
            nationalIdActivity.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            onGetStartedClick.IconCompatParcelizer((Object) currentThread, "thread");
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    /* renamed from: o.navigate$IconCompatParcelizer */
    public final class IconCompatParcelizer extends Thread {
        static final AtomicIntegerFieldUpdater write = AtomicIntegerFieldUpdater.newUpdater(IconCompatParcelizer.class, "workerCtl");
        public read IconCompatParcelizer;
        public final FatcaErrorActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        private long MediaDescriptionCompat;
        private int MediaMetadataCompat;
        private long RatingCompat;
        volatile int indexInArray;
        volatile Object nextParkedWorker;
        volatile int workerCtl;

        private IconCompatParcelizer() {
            setDaemon(true);
            this.MediaBrowserCompat$CustomActionResultReceiver = new FatcaErrorActivity_ViewBinding();
            this.IconCompatParcelizer = read.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = navigate.IconCompatParcelizer;
            AddAccountInfoActivity.IconCompatParcelizer iconCompatParcelizer = AddAccountInfoActivity.MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaMetadataCompat = AddAccountInfoActivity.IconCompatParcelizer.write();
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(navigate.this.MediaDescriptionCompat);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public IconCompatParcelizer(navigate navigate, int i) {
            this();
            MediaBrowserCompat$CustomActionResultReceiver(i);
        }

        private final boolean write() {
            boolean z;
            if (this.IconCompatParcelizer == read.CPU_ACQUIRED) {
                return true;
            }
            navigate navigate = navigate.this;
            while (true) {
                long j = navigate.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                    if (navigate.MediaBrowserCompat$ItemReceiver.compareAndSet(navigate, j, j - 4398046511104L)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.IconCompatParcelizer = read.CPU_ACQUIRED;
            return true;
        }

        public final boolean MediaBrowserCompat$ItemReceiver(read read2) {
            onGetStartedClick.write((Object) read2, "newState");
            read read3 = this.IconCompatParcelizer;
            boolean z = read3 == read.CPU_ACQUIRED;
            if (z) {
                navigate.MediaBrowserCompat$ItemReceiver.addAndGet(navigate.this, 4398046511104L);
            }
            if (read3 != read2) {
                this.IconCompatParcelizer = read2;
            }
            return z;
        }

        private final void write(FatcaErrorActivity fatcaErrorActivity) {
            if (fatcaErrorActivity != FatcaErrorActivity.NON_BLOCKING && MediaBrowserCompat$ItemReceiver(read.BLOCKING)) {
                navigate.this.IconCompatParcelizer();
            }
        }

        private int MediaBrowserCompat$ItemReceiver(int i) {
            int i2 = this.MediaMetadataCompat;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.MediaMetadataCompat = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Api.BaseClientBuilder.API_PRIORITY_OTHER) % i;
        }

        private final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (this.RatingCompat == 0) {
                this.RatingCompat = System.nanoTime() + navigate.this.MediaBrowserCompat$SearchResultReceiver;
            }
            LockSupport.parkNanos(navigate.this.MediaBrowserCompat$SearchResultReceiver);
            if (System.nanoTime() - this.RatingCompat >= 0) {
                this.RatingCompat = 0;
                synchronized (navigate.this.MediaMetadataCompat) {
                    if (navigate.this._isTerminated == 0) {
                        if (navigate.IconCompatParcelizer(navigate.this) > navigate.this.read) {
                            if (write.compareAndSet(this, -1, 1)) {
                                int i = this.indexInArray;
                                MediaBrowserCompat$CustomActionResultReceiver(0);
                                navigate.this.MediaBrowserCompat$CustomActionResultReceiver(this, i, 0);
                                int andDecrement = (int) (navigate.MediaBrowserCompat$ItemReceiver.getAndDecrement(navigate.this) & 2097151);
                                if (andDecrement != i) {
                                    IconCompatParcelizer iconCompatParcelizer = navigate.this.MediaMetadataCompat.get(andDecrement);
                                    if (iconCompatParcelizer == null) {
                                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                                    }
                                    IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                                    navigate.this.MediaMetadataCompat.set(i, iconCompatParcelizer2);
                                    iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver(i);
                                    navigate.this.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer2, andDecrement, i);
                                }
                                navigate.this.MediaMetadataCompat.set(andDecrement, (Object) null);
                                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                                this.IconCompatParcelizer = read.TERMINATED;
                            }
                        }
                    }
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: o.lambda$new$0$NationalIdActivity} */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r0 == null) goto L_0x0020;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p040o.lambda$new$0.NationalIdActivity read(boolean r3) {
            /*
                r2 = this;
                boolean r0 = r2.write()
                if (r0 == 0) goto L_0x000b
                o.lambda$new$0$NationalIdActivity r3 = r2.MediaBrowserCompat$CustomActionResultReceiver((boolean) r3)
                return r3
            L_0x000b:
                if (r3 == 0) goto L_0x0020
                o.FatcaErrorActivity_ViewBinding r3 = r2.MediaBrowserCompat$CustomActionResultReceiver
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p040o.FatcaErrorActivity_ViewBinding.IconCompatParcelizer
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r3, r1)
                o.lambda$new$0$NationalIdActivity r0 = (p040o.lambda$new$0.NationalIdActivity) r0
                if (r0 != 0) goto L_0x001e
                o.lambda$new$0$NationalIdActivity r0 = r3.MediaBrowserCompat$ItemReceiver()
            L_0x001e:
                if (r0 != 0) goto L_0x002b
            L_0x0020:
                o.navigate r3 = p040o.navigate.this
                o.ReviewInfoResultActivity_ViewBinding r3 = r3.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.Object r3 = r3.IconCompatParcelizer()
                r0 = r3
                o.lambda$new$0$NationalIdActivity r0 = (p040o.lambda$new$0.NationalIdActivity) r0
            L_0x002b:
                if (r0 != 0) goto L_0x0032
                r3 = 1
                o.lambda$new$0$NationalIdActivity r0 = r2.MediaBrowserCompat$ItemReceiver((boolean) r3)
            L_0x0032:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.navigate.IconCompatParcelizer.read(boolean):o.lambda$new$0$NationalIdActivity");
        }

        private final lambda$new$0.NationalIdActivity MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver2;
            lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver3;
            if (z) {
                boolean z2 = true;
                if (MediaBrowserCompat$ItemReceiver(navigate.this.read << 1) != 0) {
                    z2 = false;
                }
                if (z2 && (MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver()) != null) {
                    return MediaBrowserCompat$ItemReceiver3;
                }
                FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                lambda$new$0.NationalIdActivity nationalIdActivity = (lambda$new$0.NationalIdActivity) FatcaErrorActivity_ViewBinding.IconCompatParcelizer.getAndSet(fatcaErrorActivity_ViewBinding, (Object) null);
                if (nationalIdActivity == null) {
                    nationalIdActivity = fatcaErrorActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
                }
                if (nationalIdActivity != null) {
                    return nationalIdActivity;
                }
                if (!z2 && (MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver()) != null) {
                    return MediaBrowserCompat$ItemReceiver2;
                }
            } else {
                lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver4 != null) {
                    return MediaBrowserCompat$ItemReceiver4;
                }
            }
            return MediaBrowserCompat$ItemReceiver(false);
        }

        private final lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver() {
            if (MediaBrowserCompat$ItemReceiver(2) == 0) {
                lambda$new$0.NationalIdActivity nationalIdActivity = (lambda$new$0.NationalIdActivity) navigate.this.RatingCompat.IconCompatParcelizer();
                if (nationalIdActivity != null) {
                    return nationalIdActivity;
                }
                return (lambda$new$0.NationalIdActivity) navigate.this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            }
            lambda$new$0.NationalIdActivity nationalIdActivity2 = (lambda$new$0.NationalIdActivity) navigate.this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            if (nationalIdActivity2 != null) {
                return nationalIdActivity2;
            }
            return (lambda$new$0.NationalIdActivity) navigate.this.RatingCompat.IconCompatParcelizer();
        }

        private final lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver(boolean z) {
            long j;
            int i;
            int i2;
            if (MwChangeCasaSuccessActivity.write()) {
                FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (fatcaErrorActivity_ViewBinding.lastScheduledTask != null) {
                    i2 = (fatcaErrorActivity_ViewBinding.producerIndex - fatcaErrorActivity_ViewBinding.consumerIndex) + 1;
                } else {
                    i2 = fatcaErrorActivity_ViewBinding.producerIndex - fatcaErrorActivity_ViewBinding.consumerIndex;
                }
                if (!(i2 == 0)) {
                    throw new AssertionError();
                }
            }
            int IconCompatParcelizer2 = navigate.IconCompatParcelizer(navigate.this);
            if (IconCompatParcelizer2 < 2) {
                return null;
            }
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2);
            long j2 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < IconCompatParcelizer2; i3++) {
                MediaBrowserCompat$ItemReceiver2++;
                if (MediaBrowserCompat$ItemReceiver2 > IconCompatParcelizer2) {
                    MediaBrowserCompat$ItemReceiver2 = 1;
                }
                IconCompatParcelizer iconCompatParcelizer = navigate.this.MediaMetadataCompat.get(MediaBrowserCompat$ItemReceiver2);
                if (!(iconCompatParcelizer == null || iconCompatParcelizer == this)) {
                    if (MwChangeCasaSuccessActivity.write()) {
                        FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (fatcaErrorActivity_ViewBinding2.lastScheduledTask != null) {
                            i = (fatcaErrorActivity_ViewBinding2.producerIndex - fatcaErrorActivity_ViewBinding2.consumerIndex) + 1;
                        } else {
                            i = fatcaErrorActivity_ViewBinding2.producerIndex - fatcaErrorActivity_ViewBinding2.consumerIndex;
                        }
                        if (!(i == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                    } else {
                        j = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                    if (j == -1) {
                        return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.MediaDescriptionCompat = j2;
            return null;
        }

        private final void read() {
            int i;
            long j;
            int i2;
            if (!(this.nextParkedWorker != navigate.IconCompatParcelizer)) {
                navigate navigate = navigate.this;
                onGetStartedClick.write((Object) this, "worker");
                if (this.nextParkedWorker == navigate.IconCompatParcelizer) {
                    do {
                        j = navigate.parkedWorkersStack;
                        int i3 = (int) (2097151 & j);
                        i2 = this.indexInArray;
                        if (MwChangeCasaSuccessActivity.write()) {
                            if (!(i2 != 0)) {
                                throw new AssertionError();
                            }
                        }
                        this.nextParkedWorker = navigate.MediaMetadataCompat.get(i3);
                    } while (!navigate.write.compareAndSet(navigate, j, ((2097152 + j) & -2097152) | ((long) i2)));
                    return;
                }
                return;
            }
            if (MwChangeCasaSuccessActivity.write()) {
                FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (fatcaErrorActivity_ViewBinding.lastScheduledTask != null) {
                    i = (fatcaErrorActivity_ViewBinding.producerIndex - fatcaErrorActivity_ViewBinding.consumerIndex) + 1;
                } else {
                    i = fatcaErrorActivity_ViewBinding.producerIndex - fatcaErrorActivity_ViewBinding.consumerIndex;
                }
                if (!(i == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (true) {
                if ((this.nextParkedWorker != navigate.IconCompatParcelizer) && navigate.this._isTerminated == 0 && this.IconCompatParcelizer != read.TERMINATED) {
                    MediaBrowserCompat$ItemReceiver(read.PARKING);
                    Thread.interrupted();
                    MediaBrowserCompat$CustomActionResultReceiver();
                } else {
                    return;
                }
            }
        }

        public final void run() {
            loop0:
            while (true) {
                boolean z = true;
                boolean z2 = false;
                while (navigate.this._isTerminated == 0 && this.IconCompatParcelizer != read.TERMINATED) {
                    lambda$new$0.NationalIdActivity read2 = read(this.MediaBrowserCompat$ItemReceiver);
                    if (read2 != null) {
                        this.MediaDescriptionCompat = 0;
                        FatcaErrorActivity IconCompatParcelizer2 = read2.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer();
                        this.RatingCompat = 0;
                        if (this.IconCompatParcelizer == read.PARKING) {
                            if (MwChangeCasaSuccessActivity.write()) {
                                if (!(IconCompatParcelizer2 == FatcaErrorActivity.PROBABLY_BLOCKING)) {
                                    throw new AssertionError();
                                }
                            }
                            this.IconCompatParcelizer = read.BLOCKING;
                        }
                        write(IconCompatParcelizer2);
                        navigate.MediaBrowserCompat$ItemReceiver(read2);
                        if (IconCompatParcelizer2 != FatcaErrorActivity.NON_BLOCKING) {
                            navigate.MediaBrowserCompat$ItemReceiver.addAndGet(navigate.this, -2097152);
                            read read3 = this.IconCompatParcelizer;
                            if (read3 == read.TERMINATED) {
                                continue;
                            } else {
                                if (MwChangeCasaSuccessActivity.write()) {
                                    if (read3 != read.BLOCKING) {
                                        z = false;
                                    }
                                    if (!z) {
                                        throw new AssertionError();
                                    }
                                }
                                this.IconCompatParcelizer = read.DORMANT;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        this.MediaBrowserCompat$ItemReceiver = false;
                        if (this.MediaDescriptionCompat == 0) {
                            read();
                        } else if (!z2) {
                            z2 = true;
                        } else {
                            MediaBrowserCompat$ItemReceiver(read.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.MediaDescriptionCompat);
                            this.MediaDescriptionCompat = 0;
                        }
                    }
                }
            }
            MediaBrowserCompat$ItemReceiver(read.TERMINATED);
        }
    }

    private final boolean read(lambda$new$0.NationalIdActivity nationalIdActivity) {
        if (nationalIdActivity.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer() == FatcaErrorActivity.PROBABLY_BLOCKING) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(nationalIdActivity);
        }
        return this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(nationalIdActivity);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer, int i, int i2) {
        onGetStartedClick.write((Object) iconCompatParcelizer, "worker");
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            if (i3 == i) {
                i3 = i2 == 0 ? MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer) : i2;
            }
            if (i3 >= 0) {
                if (write.compareAndSet(this, j, ((long) i3) | ((2097152 + j) & -2097152))) {
                    return;
                }
            }
        }
    }

    private final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver() {
        while (true) {
            long j = this.parkedWorkersStack;
            IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat.get((int) (2097151 & j));
            if (iconCompatParcelizer == null) {
                return null;
            }
            int MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(iconCompatParcelizer);
            if (MediaBrowserCompat$CustomActionResultReceiver2 >= 0) {
                if (write.compareAndSet(this, j, ((long) MediaBrowserCompat$CustomActionResultReceiver2) | ((2097152 + j) & -2097152))) {
                    iconCompatParcelizer.nextParkedWorker = IconCompatParcelizer;
                    return iconCompatParcelizer;
                }
            }
        }
    }

    private final void read() {
        boolean z;
        IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver2;
        long addAndGet = MediaBrowserCompat$ItemReceiver.addAndGet(this, 2097152);
        while (true) {
            IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                if (IconCompatParcelizer.write.compareAndSet(MediaBrowserCompat$CustomActionResultReceiver3, -1, 0)) {
                    LockSupport.unpark(MediaBrowserCompat$CustomActionResultReceiver3);
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z && !IconCompatParcelizer(addAndGet)) {
            do {
                MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return;
                }
            } while (!IconCompatParcelizer.write.compareAndSet(MediaBrowserCompat$CustomActionResultReceiver2, -1, 0));
            LockSupport.unpark(MediaBrowserCompat$CustomActionResultReceiver2);
        }
    }

    public static final /* synthetic */ int IconCompatParcelizer(navigate navigate) {
        return (int) (navigate.controlState & 2097151);
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer iconCompatParcelizer) {
        Object obj = iconCompatParcelizer.nextParkedWorker;
        while (obj != IconCompatParcelizer) {
            if (obj == null) {
                return 0;
            }
            IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) obj;
            int i = iconCompatParcelizer2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = iconCompatParcelizer2.nextParkedWorker;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0073, code lost:
        if (r3 == null) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = MediaBrowserCompat$MediaItem
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 == 0) goto L_0x00c0
            o.navigate$IconCompatParcelizer r0 = r8.write()
            java.util.concurrent.atomic.AtomicReferenceArray<o.navigate$IconCompatParcelizer> r3 = r8.MediaMetadataCompat
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00bd }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r3)
            if (r4 <= 0) goto L_0x0063
            r3 = r2
        L_0x001c:
            java.util.concurrent.atomic.AtomicReferenceArray<o.navigate$IconCompatParcelizer> r5 = r8.MediaMetadataCompat
            java.lang.Object r5 = r5.get(r3)
            if (r5 != 0) goto L_0x0027
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0027:
            o.navigate$IconCompatParcelizer r5 = (p040o.navigate.IconCompatParcelizer) r5
            if (r5 == r0) goto L_0x005e
        L_0x002b:
            boolean r6 = r5.isAlive()
            if (r6 == 0) goto L_0x003d
            r6 = r5
            java.lang.Thread r6 = (java.lang.Thread) r6
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L_0x002b
        L_0x003d:
            o.navigate$read r6 = r5.IconCompatParcelizer
            boolean r7 = p040o.MwChangeCasaSuccessActivity.write()
            if (r7 == 0) goto L_0x0057
            o.navigate$read r7 = p040o.navigate.read.TERMINATED
            if (r6 != r7) goto L_0x004b
            r6 = r2
            goto L_0x004c
        L_0x004b:
            r6 = r1
        L_0x004c:
            if (r6 == 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0057:
            o.FatcaErrorActivity_ViewBinding r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.ReviewInfoResultActivity_ViewBinding r6 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r5.MediaBrowserCompat$ItemReceiver(r6)
        L_0x005e:
            if (r3 == r4) goto L_0x0063
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0063:
            o.ReviewInfoResultActivity_ViewBinding r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            r3.MediaBrowserCompat$CustomActionResultReceiver()
            o.ReviewInfoResultActivity_ViewBinding r3 = r8.RatingCompat
            r3.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x006d:
            if (r0 == 0) goto L_0x0075
            o.lambda$new$0$NationalIdActivity r3 = r0.read(r2)
            if (r3 != 0) goto L_0x007d
        L_0x0075:
            o.ReviewInfoResultActivity_ViewBinding r3 = r8.RatingCompat
            java.lang.Object r3 = r3.IconCompatParcelizer()
            o.lambda$new$0$NationalIdActivity r3 = (p040o.lambda$new$0.NationalIdActivity) r3
        L_0x007d:
            if (r3 != 0) goto L_0x0087
            o.ReviewInfoResultActivity_ViewBinding r3 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.Object r3 = r3.IconCompatParcelizer()
            o.lambda$new$0$NationalIdActivity r3 = (p040o.lambda$new$0.NationalIdActivity) r3
        L_0x0087:
            if (r3 == 0) goto L_0x008d
            MediaBrowserCompat$ItemReceiver(r3)
            goto L_0x006d
        L_0x008d:
            if (r0 == 0) goto L_0x0094
            o.navigate$read r3 = p040o.navigate.read.TERMINATED
            r0.MediaBrowserCompat$ItemReceiver((p040o.navigate.read) r3)
        L_0x0094:
            boolean r0 = p040o.MwChangeCasaSuccessActivity.write()
            if (r0 == 0) goto L_0x00b6
            long r3 = r8.controlState
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r5
            r0 = 42
            long r3 = r3 >> r0
            int r0 = (int) r3
            int r3 = r8.read
            if (r0 != r3) goto L_0x00ab
            r1 = r2
        L_0x00ab:
            if (r1 == 0) goto L_0x00ae
            goto L_0x00b6
        L_0x00ae:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00b6:
            r0 = 0
            r8.parkedWorkersStack = r0
            r8.controlState = r0
            return
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.navigate.close():void");
    }

    public final void execute(Runnable runnable) {
        onGetStartedClick.write((Object) runnable, "command");
        write(runnable, lambda$setListeners$3$NationalIdActivity.write, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer() {
        /*
            r5 = this;
        L_0x0000:
            o.navigate$IconCompatParcelizer r0 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x0017
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p040o.navigate.IconCompatParcelizer.write
            boolean r3 = r3.compareAndSet(r0, r1, r2)
            if (r3 == 0) goto L_0x0000
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
            r0 = 1
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 == 0) goto L_0x001b
            return
        L_0x001b:
            long r3 = r5.controlState
            boolean r0 = r5.IconCompatParcelizer((long) r3)
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            o.navigate$IconCompatParcelizer r0 = r5.MediaBrowserCompat$CustomActionResultReceiver()
            if (r0 == 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = p040o.navigate.IconCompatParcelizer.write
            boolean r3 = r3.compareAndSet(r0, r1, r2)
            if (r3 == 0) goto L_0x0024
            java.lang.Thread r0 = (java.lang.Thread) r0
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.navigate.IconCompatParcelizer():void");
    }
}

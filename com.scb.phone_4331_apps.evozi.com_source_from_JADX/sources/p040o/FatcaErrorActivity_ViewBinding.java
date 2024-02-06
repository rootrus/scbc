package p040o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p040o.lambda$new$0;

/* renamed from: o.FatcaErrorActivity_ViewBinding */
public final class FatcaErrorActivity_ViewBinding {
    static final AtomicReferenceFieldUpdater IconCompatParcelizer;
    private static final AtomicIntegerFieldUpdater MediaBrowserCompat$CustomActionResultReceiver;
    private static final AtomicIntegerFieldUpdater MediaBrowserCompat$ItemReceiver;
    private static final AtomicIntegerFieldUpdater read;
    private volatile int blockingTasksInBuffer = 0;
    volatile int consumerIndex = 0;
    volatile Object lastScheduledTask = null;
    volatile int producerIndex = 0;
    private final AtomicReferenceArray<lambda$new$0.NationalIdActivity> write = new AtomicReferenceArray<>(128);

    static {
        Class<FatcaErrorActivity_ViewBinding> cls = FatcaErrorActivity_ViewBinding.class;
        IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        MediaBrowserCompat$ItemReceiver = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        MediaBrowserCompat$CustomActionResultReceiver = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        read = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    public final lambda$new$0.NationalIdActivity MediaBrowserCompat$CustomActionResultReceiver() {
        lambda$new$0.NationalIdActivity nationalIdActivity = (lambda$new$0.NationalIdActivity) IconCompatParcelizer.getAndSet(this, (Object) null);
        return nationalIdActivity == null ? MediaBrowserCompat$ItemReceiver() : nationalIdActivity;
    }

    public final lambda$new$0.NationalIdActivity MediaBrowserCompat$CustomActionResultReceiver(lambda$new$0.NationalIdActivity nationalIdActivity, boolean z) {
        onGetStartedClick.write((Object) nationalIdActivity, "task");
        if (z) {
            return read(nationalIdActivity);
        }
        lambda$new$0.NationalIdActivity nationalIdActivity2 = (lambda$new$0.NationalIdActivity) IconCompatParcelizer.getAndSet(this, nationalIdActivity);
        if (nationalIdActivity2 != null) {
            return read(nationalIdActivity2);
        }
        return null;
    }

    public final long MediaBrowserCompat$CustomActionResultReceiver(FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding) {
        onGetStartedClick.write((Object) fatcaErrorActivity_ViewBinding, "victim");
        boolean z = true;
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(this.producerIndex - this.consumerIndex == 0)) {
                throw new AssertionError();
            }
        }
        lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver2 = fatcaErrorActivity_ViewBinding.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            return MediaBrowserCompat$CustomActionResultReceiver(fatcaErrorActivity_ViewBinding, false);
        }
        lambda$new$0.NationalIdActivity MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2, false);
        if (!MwChangeCasaSuccessActivity.write()) {
            return -1;
        }
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }

    public final long IconCompatParcelizer(FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding) {
        onGetStartedClick.write((Object) fatcaErrorActivity_ViewBinding, "victim");
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(this.producerIndex - this.consumerIndex == 0)) {
                throw new AssertionError();
            }
        }
        int i = fatcaErrorActivity_ViewBinding.producerIndex;
        AtomicReferenceArray<lambda$new$0.NationalIdActivity> atomicReferenceArray = fatcaErrorActivity_ViewBinding.write;
        for (int i2 = fatcaErrorActivity_ViewBinding.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (fatcaErrorActivity_ViewBinding.blockingTasksInBuffer == 0) {
                break;
            }
            lambda$new$0.NationalIdActivity nationalIdActivity = atomicReferenceArray.get(i3);
            if (nationalIdActivity != null) {
                if ((nationalIdActivity.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer() == FatcaErrorActivity.PROBABLY_BLOCKING) && atomicReferenceArray.compareAndSet(i3, nationalIdActivity, (Object) null)) {
                    read.decrementAndGet(fatcaErrorActivity_ViewBinding);
                    lambda$new$0.NationalIdActivity unused = MediaBrowserCompat$CustomActionResultReceiver(nationalIdActivity, false);
                    return -1;
                }
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver(fatcaErrorActivity_ViewBinding, true);
    }

    public final void MediaBrowserCompat$ItemReceiver(ReviewInfoResultActivity_ViewBinding reviewInfoResultActivity_ViewBinding) {
        boolean z;
        onGetStartedClick.write((Object) reviewInfoResultActivity_ViewBinding, "globalQueue");
        lambda$new$0.NationalIdActivity nationalIdActivity = (lambda$new$0.NationalIdActivity) IconCompatParcelizer.getAndSet(this, (Object) null);
        if (nationalIdActivity != null) {
            reviewInfoResultActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(nationalIdActivity);
        }
        do {
            lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                reviewInfoResultActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
        } while (z);
    }

    private final long MediaBrowserCompat$CustomActionResultReceiver(FatcaErrorActivity_ViewBinding fatcaErrorActivity_ViewBinding, boolean z) {
        lambda$new$0.NationalIdActivity nationalIdActivity;
        do {
            nationalIdActivity = (lambda$new$0.NationalIdActivity) fatcaErrorActivity_ViewBinding.lastScheduledTask;
            if (nationalIdActivity == null) {
                return -2;
            }
            if (z) {
                if (!(nationalIdActivity.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer() == FatcaErrorActivity.PROBABLY_BLOCKING)) {
                    return -2;
                }
            }
            long write2 = openHome.MediaBrowserCompat$CustomActionResultReceiver.write() - nationalIdActivity.RatingCompat;
            if (write2 < openHome.read) {
                return openHome.read - write2;
            }
        } while (!IconCompatParcelizer.compareAndSet(fatcaErrorActivity_ViewBinding, nationalIdActivity, (Object) null));
        MediaBrowserCompat$CustomActionResultReceiver(nationalIdActivity, false);
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final lambda$new$0.NationalIdActivity MediaBrowserCompat$ItemReceiver() {
        lambda$new$0.NationalIdActivity andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            if (MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(this, i, i + 1) && (andSet = this.write.getAndSet(i & 127, (Object) null)) != null) {
                if (andSet != null) {
                    boolean z = false;
                    if (andSet.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer() == FatcaErrorActivity.PROBABLY_BLOCKING) {
                        int decrementAndGet = read.decrementAndGet(this);
                        if (MwChangeCasaSuccessActivity.write()) {
                            if (decrementAndGet >= 0) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                    }
                }
                return andSet;
            }
        }
    }

    private final lambda$new$0.NationalIdActivity read(lambda$new$0.NationalIdActivity nationalIdActivity) {
        if (nationalIdActivity.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer() == FatcaErrorActivity.PROBABLY_BLOCKING) {
            read.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return nationalIdActivity;
        }
        int i = this.producerIndex & 127;
        while (this.write.get(i) != null) {
            Thread.yield();
        }
        this.write.lazySet(i, nationalIdActivity);
        MediaBrowserCompat$ItemReceiver.incrementAndGet(this);
        return null;
    }
}

package p040o;

import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.TypeCastException;
import p040o.NdidIdpShareSuccessActivity;

/* renamed from: o.MwPinnedSuccessActivity_ViewBinding */
public final class MwPinnedSuccessActivity_ViewBinding<E> extends MwReviewActivity<E> implements MwSearchMarketMallActivity<E> {
    private final List<C6962x37aca1ed<E>> IconCompatParcelizer;
    final Object[] MediaBrowserCompat$ItemReceiver;
    private volatile long _head;
    private volatile int _size;
    volatile long _tail;
    private final ReentrantLock read;
    final int write;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo42858x50fd9e4a() {
        return false;
    }

    public MwPinnedSuccessActivity_ViewBinding(int i) {
        this.write = i;
        if (i > 0) {
            this.read = new ReentrantLock();
            this.MediaBrowserCompat$ItemReceiver = new Object[this.write];
            this._head = 0;
            this._tail = 0;
            this._size = 0;
            this.IconCompatParcelizer = NationalIdCameraActivity.IconCompatParcelizer();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ArrayBroadcastChannel capacity must be at least 1, but ");
        sb.append(this.write);
        sb.append(" was specified");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final onCreateQrClick<E> IconCompatParcelizer() {
        C6962x37aca1ed mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = new C6962x37aca1ed(this);
        IconCompatParcelizer(mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver, (C6962x37aca1ed) null);
        return mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver;
    }

    public final boolean write(Throwable th) {
        if (!super.write(th)) {
            return false;
        }
        read();
        return true;
    }

    /* access modifiers changed from: protected */
    public final Object write(E e) {
        Lock lock = this.read;
        lock.lock();
        try {
            MwShopAddressActivity<?> RatingCompat = RatingCompat();
            if (RatingCompat != null) {
                return RatingCompat;
            }
            int i = this._size;
            if (i >= this.write) {
                Object obj = MwReviewActivity_ViewBinding.write;
                lock.unlock();
                return obj;
            }
            long j = this._tail;
            this.MediaBrowserCompat$ItemReceiver[(int) (j % ((long) this.write))] = e;
            this._size = i + 1;
            this._tail = j + 1;
            HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            lock.unlock();
            read();
            return MwReviewActivity_ViewBinding.IconCompatParcelizer;
        } finally {
            lock.unlock();
        }
    }

    private final void read() {
        boolean z = false;
        boolean z2 = false;
        for (C6962x37aca1ed<E> MediaSessionCompat$QueueItem : this.IconCompatParcelizer) {
            if (MediaSessionCompat$QueueItem.MediaSessionCompat$QueueItem()) {
                z = true;
            }
            z2 = true;
        }
        if (z || !z2) {
            IconCompatParcelizer((C6962x37aca1ed) null, (C6962x37aca1ed) null);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(MwPinnedSuccessActivity_ViewBinding mwPinnedSuccessActivity_ViewBinding, C6962x37aca1ed mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver, C6962x37aca1ed mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2, int i) {
        if ((i & 2) != 0) {
            mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = null;
        }
        mwPinnedSuccessActivity_ViewBinding.IconCompatParcelizer((C6962x37aca1ed) null, mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2);
    }

    private final void IconCompatParcelizer(C6962x37aca1ed<E> mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver, C6962x37aca1ed<E> mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2) {
        MwTermsAndConditionsActivity MediaSessionCompat$Token;
        EkycOtpActivity IconCompatParcelizer2;
        while (true) {
            Lock lock = this.read;
            lock.lock();
            if (mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver != null) {
                try {
                    mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver._subHead = this._tail;
                    boolean isEmpty = this.IconCompatParcelizer.isEmpty();
                    this.IconCompatParcelizer.add(mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver);
                    if (!isEmpty) {
                        return;
                    }
                } finally {
                    lock.unlock();
                }
            }
            if (mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 != null) {
                this.IconCompatParcelizer.remove(mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2);
                if (this._head != mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2._subHead) {
                    lock.unlock();
                    return;
                }
            }
            long j = Long.MAX_VALUE;
            for (C6962x37aca1ed<E> mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver3 : this.IconCompatParcelizer) {
                long j2 = mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver3._subHead;
                if (j > j2) {
                    j = j2;
                }
            }
            long j3 = this._tail;
            long j4 = this._head;
            if (j > j3) {
                j = j3;
            }
            if (j <= j4) {
                lock.unlock();
                return;
            }
            int i = this._size;
            while (j4 < j) {
                this.MediaBrowserCompat$ItemReceiver[(int) (j4 % ((long) this.write))] = null;
                boolean z = false;
                boolean z2 = i >= this.write;
                j4++;
                this._head = j4;
                i--;
                this._size = i;
                if (z2) {
                    do {
                        MediaSessionCompat$Token = MediaSessionCompat$Token();
                        if (MediaSessionCompat$Token != null && !(MediaSessionCompat$Token instanceof MwShopAddressActivity)) {
                            if (MediaSessionCompat$Token == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                            }
                            IconCompatParcelizer2 = MediaSessionCompat$Token.IconCompatParcelizer((NdidIdpShareSuccessActivity.write) null);
                        }
                    } while (IconCompatParcelizer2 == null);
                    if (MwChangeCasaSuccessActivity.write()) {
                        if (IconCompatParcelizer2 == MailingAddressLandingActivity.write) {
                            z = true;
                        }
                        if (!z) {
                            throw new AssertionError();
                        }
                    }
                    Object[] objArr = this.MediaBrowserCompat$ItemReceiver;
                    int i2 = (int) (j3 % ((long) this.write));
                    if (MediaSessionCompat$Token != null) {
                        objArr[i2] = MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver();
                        this._size = i + 1;
                        this._tail = j3 + 1;
                        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                        lock.unlock();
                        if (MediaSessionCompat$Token == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        MediaSessionCompat$Token.write();
                        read();
                        mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver = null;
                        mwPinnedSuccessActivity_ViewBinding$MediaBrowserCompat$ItemReceiver2 = null;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Send");
                    }
                }
            }
            lock.unlock();
            return;
        }
    }

    /* access modifiers changed from: protected */
    public final String MediaBrowserCompat$MediaItem() {
        StringBuilder sb = new StringBuilder();
        sb.append("(buffer:capacity=");
        sb.append(this.MediaBrowserCompat$ItemReceiver.length);
        sb.append(",size=");
        sb.append(this._size);
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final boolean MediaSessionCompat$ResultReceiverWrapper() {
        return this._size >= this.write;
    }
}

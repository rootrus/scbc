package p040o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* renamed from: o.onClickNext */
public final class onClickNext<E> implements MwSearchMarketMallActivity<E> {
    private static final EkycOtpActivity IconCompatParcelizer;
    private static final onClickNext$MediaBrowserCompat$ItemReceiver<Object> MediaBrowserCompat$CustomActionResultReceiver;
    private static final AtomicReferenceFieldUpdater MediaBrowserCompat$ItemReceiver;
    private static final AtomicReferenceFieldUpdater read;
    private static final AtomicIntegerFieldUpdater write;
    private volatile Object _state = MediaBrowserCompat$CustomActionResultReceiver;
    private volatile int _updating = 0;
    private volatile Object onCloseHandler = null;

    /* renamed from: o.onClickNext$read */
    static final class read {
        public final Throwable IconCompatParcelizer = null;
    }

    static {
        Class<onClickNext> cls = onClickNext.class;
        EkycOtpActivity ekycOtpActivity = new EkycOtpActivity("UNDEFINED");
        IconCompatParcelizer = ekycOtpActivity;
        MediaBrowserCompat$CustomActionResultReceiver = new onClickNext$MediaBrowserCompat$ItemReceiver<>(ekycOtpActivity, (IconCompatParcelizer<E>[]) null);
        MediaBrowserCompat$ItemReceiver = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
        write = AtomicIntegerFieldUpdater.newUpdater(cls, "_updating");
        read = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "onCloseHandler");
    }

    public final boolean ParcelableVolumeInfo() {
        return this._state instanceof read;
    }

    public final onCreateQrClick<E> IconCompatParcelizer() {
        Object obj;
        onClickNext$MediaBrowserCompat$ItemReceiver onclicknext_mediabrowsercompat_itemreceiver;
        Object obj2;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        do {
            obj = this._state;
            if (obj instanceof read) {
                iconCompatParcelizer.write((Throwable) null);
                return iconCompatParcelizer;
            } else if (obj instanceof onClickNext$MediaBrowserCompat$ItemReceiver) {
                onclicknext_mediabrowsercompat_itemreceiver = (onClickNext$MediaBrowserCompat$ItemReceiver) obj;
                if (onclicknext_mediabrowsercompat_itemreceiver.IconCompatParcelizer != IconCompatParcelizer) {
                    iconCompatParcelizer.write(onclicknext_mediabrowsercompat_itemreceiver.IconCompatParcelizer);
                }
                obj2 = onclicknext_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
                if (obj != null) {
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!MediaBrowserCompat$ItemReceiver.compareAndSet(this, obj, new onClickNext$MediaBrowserCompat$ItemReceiver(obj2, read(onclicknext_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer))));
        return iconCompatParcelizer;
    }

    private static IconCompatParcelizer<E>[] read(IconCompatParcelizer<E>[] iconCompatParcelizerArr, IconCompatParcelizer<E> iconCompatParcelizer) {
        if (iconCompatParcelizerArr == null) {
            IconCompatParcelizer<E>[] iconCompatParcelizerArr2 = new IconCompatParcelizer[1];
            for (int i = 0; i <= 0; i++) {
                iconCompatParcelizerArr2[0] = iconCompatParcelizer;
            }
            return iconCompatParcelizerArr2;
        }
        onGetStartedClick.write((Object) iconCompatParcelizerArr, "$this$plus");
        int length = iconCompatParcelizerArr.length;
        Object[] copyOf = Arrays.copyOf(iconCompatParcelizerArr, length + 1);
        copyOf[length] = iconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) copyOf, "result");
        return (IconCompatParcelizer[]) copyOf;
    }

    public final void write(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "handler");
        if (!read.compareAndSet(this, (Object) null, fundFactSheetActivity)) {
            Object obj = this.onCloseHandler;
            if (obj == MwReviewActivity_ViewBinding.read) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Another handler was already registered: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        } else if ((this._state instanceof read) && read.compareAndSet(this, fundFactSheetActivity, MwReviewActivity_ViewBinding.read)) {
            fundFactSheetActivity.invoke(null);
        }
    }

    public final Object MediaBrowserCompat$ItemReceiver(E e, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity) {
        read IconCompatParcelizer2 = IconCompatParcelizer(e);
        if (IconCompatParcelizer2 == null) {
            return IconCompatParcelizer2 == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED ? IconCompatParcelizer2 : HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        throw new ClosedSendChannelException("Channel was closed");
    }

    public final boolean read(E e) {
        if (IconCompatParcelizer(e) == null) {
            return true;
        }
        throw new ClosedSendChannelException("Channel was closed");
    }

    private final read IconCompatParcelizer(E e) {
        Object obj;
        if (!write.compareAndSet(this, 0, 1)) {
            return null;
        }
        do {
            try {
                obj = this._state;
                if (obj instanceof read) {
                    read read2 = (read) obj;
                    this._updating = 0;
                    return read2;
                } else if (!(obj instanceof onClickNext$MediaBrowserCompat$ItemReceiver)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (obj != null) {
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } finally {
                this._updating = 0;
            }
        } while (!MediaBrowserCompat$ItemReceiver.compareAndSet(this, obj, new onClickNext$MediaBrowserCompat$ItemReceiver(e, ((onClickNext$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver)));
        IconCompatParcelizer<E>[] iconCompatParcelizerArr = ((onClickNext$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizerArr != null) {
            for (IconCompatParcelizer<E> write2 : iconCompatParcelizerArr) {
                write2.write(e);
            }
        }
        return null;
    }

    /* renamed from: o.onClickNext$IconCompatParcelizer */
    static final class IconCompatParcelizer<E> extends clearButtonClick<E> {
        private final onClickNext<E> write;

        public IconCompatParcelizer(onClickNext<E> onclicknext) {
            onGetStartedClick.write((Object) onclicknext, "broadcastChannel");
            this.write = onclicknext;
        }

        /* access modifiers changed from: protected */
        public final void MediaBrowserCompat$ItemReceiver(boolean z) {
            if (z) {
                onClickNext.read((onClickNext) this.write, this);
            }
        }

        public final Object write(E e) {
            return super.write(e);
        }
    }

    public static final /* synthetic */ void read(onClickNext onclicknext, IconCompatParcelizer iconCompatParcelizer) {
        Object obj;
        Object obj2;
        IconCompatParcelizer[] iconCompatParcelizerArr;
        do {
            obj = onclicknext._state;
            if (obj instanceof read) {
                return;
            }
            if (obj instanceof onClickNext$MediaBrowserCompat$ItemReceiver) {
                onClickNext$MediaBrowserCompat$ItemReceiver onclicknext_mediabrowsercompat_itemreceiver = (onClickNext$MediaBrowserCompat$ItemReceiver) obj;
                obj2 = onclicknext_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
                if (obj != null) {
                    IconCompatParcelizer<E>[] iconCompatParcelizerArr2 = onclicknext_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                    if (iconCompatParcelizerArr2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    int length = iconCompatParcelizerArr2.length;
                    int MediaBrowserCompat$ItemReceiver2 = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver((T[]) iconCompatParcelizerArr2, iconCompatParcelizer);
                    if (MwChangeCasaSuccessActivity.write()) {
                        if (!(MediaBrowserCompat$ItemReceiver2 >= 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (length == 1) {
                        iconCompatParcelizerArr = null;
                    } else {
                        IconCompatParcelizer[] iconCompatParcelizerArr3 = new IconCompatParcelizer[(length - 1)];
                        IconCompatParcelizer<E>[] iconCompatParcelizerArr4 = iconCompatParcelizerArr2;
                        IconCompatParcelizer[] iconCompatParcelizerArr5 = iconCompatParcelizerArr3;
                        HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(iconCompatParcelizerArr4, iconCompatParcelizerArr5, 0, 0, MediaBrowserCompat$ItemReceiver2, 6);
                        HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(iconCompatParcelizerArr4, iconCompatParcelizerArr5, MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver2 + 1, 0, 8);
                        iconCompatParcelizerArr = iconCompatParcelizerArr3;
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<E>");
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid state ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!MediaBrowserCompat$ItemReceiver.compareAndSet(onclicknext, obj, new onClickNext$MediaBrowserCompat$ItemReceiver(obj2, iconCompatParcelizerArr)));
    }
}

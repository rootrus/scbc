package p040o;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import p040o.HmlPromptPayVerificationActivity;
import p040o.MwCreateQrActivity;

/* renamed from: o.onDoneNicknameClick */
public class onDoneNicknameClick implements MaintenanceActivity, MwOnboardInfoActivity_ViewBinding {
    static final AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(onDoneNicknameClick.class, Object.class, "_state");
    private volatile Object _parentHandle;
    volatile Object _state;

    /* access modifiers changed from: protected */
    public boolean IconCompatParcelizer(Throwable th) {
        onGetStartedClick.write((Object) th, "exception");
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean mo15960x50fd9e4a() {
        return false;
    }

    public void MediaMetadataCompat() {
    }

    public boolean aS_() {
        return true;
    }

    public boolean aT_() {
        return false;
    }

    /* access modifiers changed from: protected */
    public String read() {
        return "Job was cancelled";
    }

    /* access modifiers changed from: protected */
    public void read(Object obj) {
    }

    /* access modifiers changed from: protected */
    public void write(Object obj) {
    }

    public onDoneNicknameClick(boolean z) {
        this._state = z ? MwOnBoardSuccessActivity.MediaBrowserCompat$ItemReceiver : MwOnBoardSuccessActivity.write;
        this._parentHandle = null;
    }

    public final HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> MediaBrowserCompat$ItemReceiver() {
        return clickManagePin.write;
    }

    /* renamed from: o.onDoneNicknameClick$write */
    public static final class write extends C6963xa3443844 {
        private /* synthetic */ onDoneNicknameClick MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ Object read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, onDoneNicknameClick ondonenicknameclick, Object obj) {
            super(ndidIdpShareSuccessActivity);
            this.MediaBrowserCompat$CustomActionResultReceiver = ondonenicknameclick;
            this.read = obj;
        }

        public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
            Object obj2;
            onGetStartedClick.write((Object) (NdidIdpShareSuccessActivity) obj, "affected");
            onDoneNicknameClick ondonenicknameclick = this.MediaBrowserCompat$CustomActionResultReceiver;
            while (true) {
                obj2 = ondonenicknameclick._state;
                if (!(obj2 instanceof BaseNtbInstructionActivity)) {
                    break;
                }
                ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) ondonenicknameclick);
            }
            if (obj2 == this.read) {
                return null;
            }
            return NationalIdCameraActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final MediaImagePreviewActivity MediaSessionCompat$QueueItem() {
        return (MediaImagePreviewActivity) this._parentHandle;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(clickManagePin clickmanagepin) {
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(((MediaImagePreviewActivity) this._parentHandle) == null)) {
                throw new AssertionError();
            }
        }
        if (clickmanagepin == null) {
            this._parentHandle = MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer;
            return;
        }
        clickmanagepin.RatingCompat();
        MediaImagePreviewActivity MediaBrowserCompat$CustomActionResultReceiver = clickmanagepin.MediaBrowserCompat$CustomActionResultReceiver(this);
        this._parentHandle = MediaBrowserCompat$CustomActionResultReceiver;
        if (MediaBrowserCompat$SearchResultReceiver()) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            this._parentHandle = MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer;
        }
    }

    private final Object read(IconCompatParcelizer iconCompatParcelizer, Object obj) {
        ArrayList arrayList;
        Throwable MediaBrowserCompat$ItemReceiver;
        Object obj2;
        if (MwChangeCasaSuccessActivity.write()) {
            while (true) {
                obj2 = this._state;
                if (!(obj2 instanceof BaseNtbInstructionActivity)) {
                    break;
                }
                ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            }
            if (!(obj2 == iconCompatParcelizer)) {
                throw new AssertionError();
            }
        }
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(!(iconCompatParcelizer._exceptionsHolder == MwOnBoardSuccessActivity.RatingCompat))) {
                throw new AssertionError();
            }
        }
        if (!MwChangeCasaSuccessActivity.write() || iconCompatParcelizer._isCompleting != 0) {
            Throwable th = null;
            MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) (!(obj instanceof MerchantWalletDetailActivity_ViewBinding) ? null : obj);
            if (merchantWalletDetailActivity_ViewBinding != null) {
                th = merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer;
            }
            synchronized (iconCompatParcelizer) {
                Object obj3 = iconCompatParcelizer._rootCause;
                Object obj4 = iconCompatParcelizer._exceptionsHolder;
                if (obj4 == null) {
                    arrayList = new ArrayList(4);
                } else if (obj4 instanceof Throwable) {
                    ArrayList arrayList2 = new ArrayList(4);
                    arrayList2.add(obj4);
                    arrayList = arrayList2;
                } else if (obj4 instanceof ArrayList) {
                    arrayList = (ArrayList) obj4;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(obj4);
                    throw new IllegalStateException(sb.toString().toString());
                }
                Throwable th2 = (Throwable) iconCompatParcelizer._rootCause;
                if (th2 != null) {
                    arrayList.add(0, th2);
                }
                if (th != null && (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) th, (Object) th2))) {
                    arrayList.add(th);
                }
                iconCompatParcelizer._exceptionsHolder = MwOnBoardSuccessActivity.RatingCompat;
                List list = arrayList;
                MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, (List<? extends Throwable>) list);
                if (MediaBrowserCompat$ItemReceiver != null) {
                    read(MediaBrowserCompat$ItemReceiver, (List<? extends Throwable>) list);
                }
            }
            if (!(MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver == th)) {
                obj = new MerchantWalletDetailActivity_ViewBinding(MediaBrowserCompat$ItemReceiver);
            }
            if (MediaBrowserCompat$ItemReceiver != null) {
                if (MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver) || IconCompatParcelizer(MediaBrowserCompat$ItemReceiver)) {
                    if (obj != null) {
                        MerchantWalletDetailActivity_ViewBinding.read.compareAndSet((MerchantWalletDetailActivity_ViewBinding) obj, 0, 1);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    }
                }
            }
            write(obj);
            boolean compareAndSet = read.compareAndSet(this, iconCompatParcelizer, MwOnBoardSuccessActivity.write(obj));
            if (!MwChangeCasaSuccessActivity.write() || compareAndSet) {
                IconCompatParcelizer(iconCompatParcelizer, obj);
                return obj;
            }
            throw new AssertionError();
        }
        throw new AssertionError();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Throwable MediaBrowserCompat$ItemReceiver(p040o.onDoneNicknameClick.IconCompatParcelizer r7, java.util.List<? extends java.lang.Throwable> r8) {
        /*
            r6 = this;
            boolean r0 = r8.isEmpty()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.Object r7 = r7._rootCause
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            if (r1 == 0) goto L_0x0022
            kotlinx.coroutines.JobCancellationException r7 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r8 = r6.read()
            r0 = r6
            o.clickManagePin r0 = (p040o.clickManagePin) r0
            r7.<init>(r8, r3, r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            return r7
        L_0x0022:
            return r3
        L_0x0023:
            r7 = r8
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r0 = r7.iterator()
        L_0x002a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r5 = r5 instanceof java.util.concurrent.CancellationException
            r5 = r5 ^ r1
            if (r5 == 0) goto L_0x002a
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L_0x0043
            return r4
        L_0x0043:
            java.lang.Object r8 = r8.get(r2)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            boolean r0 = r8 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L_0x006f
            java.util.Iterator r7 = r7.iterator()
        L_0x0051:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r0 = r7.next()
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r8) goto L_0x0066
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x0066
            r4 = r1
            goto L_0x0067
        L_0x0066:
            r4 = r2
        L_0x0067:
            if (r4 == 0) goto L_0x0051
            r3 = r0
        L_0x006a:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L_0x006f
            return r3
        L_0x006f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onDoneNicknameClick.MediaBrowserCompat$ItemReceiver(o.onDoneNicknameClick$IconCompatParcelizer, java.util.List):java.lang.Throwable");
    }

    private static void read(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set MediaBrowserCompat$ItemReceiver = NationalIdCameraActivity.MediaBrowserCompat$ItemReceiver(list.size());
            Throwable MediaBrowserCompat$ItemReceiver2 = NdidSelectIdpActivity.MediaBrowserCompat$ItemReceiver(th);
            for (Throwable MediaBrowserCompat$ItemReceiver3 : list) {
                Throwable MediaBrowserCompat$ItemReceiver4 = NdidSelectIdpActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver3);
                if (MediaBrowserCompat$ItemReceiver4 != th && MediaBrowserCompat$ItemReceiver4 != MediaBrowserCompat$ItemReceiver2 && !(MediaBrowserCompat$ItemReceiver4 instanceof CancellationException) && MediaBrowserCompat$ItemReceiver.add(MediaBrowserCompat$ItemReceiver4)) {
                    onGetStartedClick.write((Object) th, "$this$addSuppressed");
                    onGetStartedClick.write((Object) MediaBrowserCompat$ItemReceiver4, "exception");
                    InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th, MediaBrowserCompat$ItemReceiver4);
                }
            }
        }
    }

    private final boolean MediaBrowserCompat$CustomActionResultReceiver(MwManageReceivingAccountActivity mwManageReceivingAccountActivity, Object obj) {
        if (MwChangeCasaSuccessActivity.write()) {
            if (!((mwManageReceivingAccountActivity instanceof MwCreateQrActivity.MwScreenshotDisplay) || (mwManageReceivingAccountActivity instanceof MwManageWalletActivity_ViewBinding))) {
                throw new AssertionError();
            }
        }
        if (MwChangeCasaSuccessActivity.write() && !(!(obj instanceof MerchantWalletDetailActivity_ViewBinding))) {
            throw new AssertionError();
        } else if (!read.compareAndSet(this, mwManageReceivingAccountActivity, MwOnBoardSuccessActivity.write(obj))) {
            return false;
        } else {
            write(obj);
            IconCompatParcelizer(mwManageReceivingAccountActivity, obj);
            return true;
        }
    }

    private final boolean MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        if (mo15960x50fd9e4a()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        MediaImagePreviewActivity mediaImagePreviewActivity = (MediaImagePreviewActivity) this._parentHandle;
        if (mediaImagePreviewActivity == null || mediaImagePreviewActivity == MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer) {
            return z;
        }
        if (mediaImagePreviewActivity.MediaBrowserCompat$CustomActionResultReceiver(th) || z) {
            return true;
        }
        return false;
    }

    private final int MediaDescriptionCompat(Object obj) {
        if (obj instanceof MwCreateQrActivity.MwScreenshotDisplay) {
            if (((MwCreateQrActivity.MwScreenshotDisplay) obj).MediaBrowserCompat$ItemReceiver) {
                return 0;
            }
            if (!read.compareAndSet(this, obj, MwOnBoardSuccessActivity.MediaBrowserCompat$ItemReceiver)) {
                return -1;
            }
            MediaMetadataCompat();
            return 1;
        } else if (!(obj instanceof onClickChange)) {
            return 0;
        } else {
            if (!read.compareAndSet(this, obj, ((onClickChange) obj).MediaBrowserCompat$CustomActionResultReceiver)) {
                return -1;
            }
            MediaMetadataCompat();
            return 1;
        }
    }

    private CancellationException MediaBrowserCompat$ItemReceiver(Throwable th, String str) {
        onGetStartedClick.write((Object) th, "$this$toCancellationException");
        CancellationException cancellationException = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = read();
        }
        return new JobCancellationException(str, th, this);
    }

    public final MwCurrentUserEwalletActivity write(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "handler");
        return IconCompatParcelizer(false, true, fundFactSheetActivity);
    }

    private final MwManageWalletActivity_ViewBinding<?> MediaBrowserCompat$ItemReceiver(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, boolean z) {
        boolean z2 = false;
        clickManageShopInfo clickmanageshopinfo = null;
        if (z) {
            if (fundFactSheetActivity instanceof clickManageShopInfo) {
                clickmanageshopinfo = fundFactSheetActivity;
            }
            clickManageShopInfo clickmanageshopinfo2 = clickmanageshopinfo;
            if (clickmanageshopinfo2 != null) {
                if (MwChangeCasaSuccessActivity.write()) {
                    if (clickmanageshopinfo2.IconCompatParcelizer == this) {
                        z2 = true;
                    }
                    if (!z2) {
                        throw new AssertionError();
                    }
                }
                if (clickmanageshopinfo2 != null) {
                    return clickmanageshopinfo2;
                }
            }
            return new setVerticalLine(this, fundFactSheetActivity);
        }
        if (fundFactSheetActivity instanceof MwManageWalletActivity_ViewBinding) {
            clickmanageshopinfo = fundFactSheetActivity;
        }
        MwManageWalletActivity_ViewBinding<?> mwManageWalletActivity_ViewBinding = clickmanageshopinfo;
        if (mwManageWalletActivity_ViewBinding != null) {
            if (MwChangeCasaSuccessActivity.write()) {
                if (mwManageWalletActivity_ViewBinding.IconCompatParcelizer == this && !(mwManageWalletActivity_ViewBinding instanceof clickManageShopInfo)) {
                    z2 = true;
                }
                if (!z2) {
                    throw new AssertionError();
                }
            }
            if (mwManageWalletActivity_ViewBinding != null) {
                return mwManageWalletActivity_ViewBinding;
            }
        }
        return new MwManageWalletActivity(this, fundFactSheetActivity);
    }

    public final void write(MwOnboardInfoActivity_ViewBinding mwOnboardInfoActivity_ViewBinding) {
        onGetStartedClick.write((Object) mwOnboardInfoActivity_ViewBinding, "parentJob");
        RatingCompat(mwOnboardInfoActivity_ViewBinding);
    }

    public boolean read(Throwable th) {
        onGetStartedClick.write((Object) th, "cause");
        if (th instanceof CancellationException) {
            return true;
        }
        if (!RatingCompat(th) || !aS_()) {
            return false;
        }
        return true;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(Throwable th) {
        return RatingCompat(th);
    }

    private boolean RatingCompat(Object obj) {
        Object MediaBrowserCompat$ItemReceiver = MwOnBoardSuccessActivity.IconCompatParcelizer;
        if (aT_() && (MediaBrowserCompat$ItemReceiver = IconCompatParcelizer(obj)) == MwOnBoardSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver) {
            return true;
        }
        if (MediaBrowserCompat$ItemReceiver == MwOnBoardSuccessActivity.IconCompatParcelizer) {
            MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$MediaItem(obj);
        }
        if (MediaBrowserCompat$ItemReceiver == MwOnBoardSuccessActivity.IconCompatParcelizer || MediaBrowserCompat$ItemReceiver == MwOnBoardSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver) {
            return true;
        }
        if (MediaBrowserCompat$ItemReceiver == MwOnBoardSuccessActivity.MediaBrowserCompat$MediaItem) {
            return false;
        }
        read(MediaBrowserCompat$ItemReceiver);
        return true;
    }

    private final Throwable MediaBrowserCompat$ItemReceiver(Object obj) {
        boolean z;
        if (obj != null) {
            z = obj instanceof Throwable;
        } else {
            z = true;
        }
        if (z) {
            if (obj != null) {
                return (Throwable) obj;
            }
            return new JobCancellationException(read(), (Throwable) null, this);
        } else if (obj != null) {
            return ((MwOnboardInfoActivity_ViewBinding) obj).MediaSessionCompat$Token();
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    private final onBoardingInAppClick IconCompatParcelizer(MwManageReceivingAccountActivity mwManageReceivingAccountActivity) {
        onBoardingInAppClick read2 = mwManageReceivingAccountActivity.read();
        if (read2 != null) {
            return read2;
        }
        if (mwManageReceivingAccountActivity instanceof MwCreateQrActivity.MwScreenshotDisplay) {
            return new onBoardingInAppClick();
        }
        if (mwManageReceivingAccountActivity instanceof MwManageWalletActivity_ViewBinding) {
            MwManageWalletActivity_ViewBinding mwManageWalletActivity_ViewBinding = (MwManageWalletActivity_ViewBinding) mwManageReceivingAccountActivity;
            mwManageWalletActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(new onBoardingInAppClick());
            while (true) {
                Object obj = mwManageWalletActivity_ViewBinding._next;
                if (!(obj instanceof BaseNtbInstructionActivity)) {
                    read.compareAndSet(this, mwManageWalletActivity_ViewBinding, NationalIdCameraActivity_ViewBinding.write(obj));
                    return null;
                }
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) mwManageWalletActivity_ViewBinding);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("State should have list: ");
            sb.append(mwManageReceivingAccountActivity);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    private final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        if (!(obj instanceof MwManageReceivingAccountActivity)) {
            return MwOnBoardSuccessActivity.IconCompatParcelizer;
        }
        if ((!(obj instanceof MwCreateQrActivity.MwScreenshotDisplay) && !(obj instanceof MwManageWalletActivity_ViewBinding)) || (obj instanceof uploadCroppedImage) || (obj2 instanceof MerchantWalletDetailActivity_ViewBinding)) {
            return MediaBrowserCompat$ItemReceiver((MwManageReceivingAccountActivity) obj, obj2);
        }
        if (MediaBrowserCompat$CustomActionResultReceiver((MwManageReceivingAccountActivity) obj, obj2)) {
            return obj2;
        }
        return MwOnBoardSuccessActivity.read;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0075, code lost:
        if (r2 == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        write(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x007a, code lost:
        r8 = MediaBrowserCompat$CustomActionResultReceiver(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007e, code lost:
        if (r8 == null) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0084, code lost:
        if (write(r1, r8, r9) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0088, code lost:
        return p040o.MwOnBoardSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x008d, code lost:
        return read(r1, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object MediaBrowserCompat$ItemReceiver(p040o.MwManageReceivingAccountActivity r8, java.lang.Object r9) {
        /*
            r7 = this;
            o.onBoardingInAppClick r0 = r7.IconCompatParcelizer((p040o.MwManageReceivingAccountActivity) r8)
            if (r0 == 0) goto L_0x0091
            boolean r1 = r8 instanceof p040o.onDoneNicknameClick.IconCompatParcelizer
            r2 = 0
            if (r1 != 0) goto L_0x000d
            r1 = r2
            goto L_0x000e
        L_0x000d:
            r1 = r8
        L_0x000e:
            o.onDoneNicknameClick$IconCompatParcelizer r1 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r1
            if (r1 != 0) goto L_0x0017
            o.onDoneNicknameClick$IconCompatParcelizer r1 = new o.onDoneNicknameClick$IconCompatParcelizer
            r1.<init>(r0, r2)
        L_0x0017:
            monitor-enter(r1)
            int r3 = r1._isCompleting     // Catch:{ all -> 0x008e }
            if (r3 == 0) goto L_0x0022
            o.EkycOtpActivity r8 = p040o.MwOnBoardSuccessActivity.IconCompatParcelizer     // Catch:{ all -> 0x008e }
            monitor-exit(r1)
            return r8
        L_0x0022:
            r3 = 1
            r1._isCompleting = r3     // Catch:{ all -> 0x008e }
            if (r1 == r8) goto L_0x0035
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = read     // Catch:{ all -> 0x008e }
            boolean r4 = r4.compareAndSet(r7, r8, r1)     // Catch:{ all -> 0x008e }
            if (r4 != 0) goto L_0x0035
            o.EkycOtpActivity r8 = p040o.MwOnBoardSuccessActivity.read     // Catch:{ all -> 0x008e }
            monitor-exit(r1)
            return r8
        L_0x0035:
            boolean r4 = p040o.MwChangeCasaSuccessActivity.write()     // Catch:{ all -> 0x008e }
            r5 = 0
            if (r4 == 0) goto L_0x0053
            java.lang.Object r4 = r1._exceptionsHolder     // Catch:{ all -> 0x008e }
            o.EkycOtpActivity r6 = p040o.MwOnBoardSuccessActivity.RatingCompat     // Catch:{ all -> 0x008e }
            if (r4 != r6) goto L_0x0046
            r4 = r3
            goto L_0x0047
        L_0x0046:
            r4 = r5
        L_0x0047:
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x004b
            goto L_0x0053
        L_0x004b:
            java.lang.AssertionError r8 = new java.lang.AssertionError     // Catch:{ all -> 0x008e }
            r8.<init>()     // Catch:{ all -> 0x008e }
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch:{ all -> 0x008e }
            throw r8     // Catch:{ all -> 0x008e }
        L_0x0053:
            java.lang.Object r4 = r1._rootCause     // Catch:{ all -> 0x008e }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x005a
            r5 = r3
        L_0x005a:
            boolean r4 = r9 instanceof p040o.MerchantWalletDetailActivity_ViewBinding
            if (r4 != 0) goto L_0x0060
            r4 = r2
            goto L_0x0061
        L_0x0060:
            r4 = r9
        L_0x0061:
            o.MerchantWalletDetailActivity_ViewBinding r4 = (p040o.MerchantWalletDetailActivity_ViewBinding) r4     // Catch:{ all -> 0x008e }
            if (r4 == 0) goto L_0x006a
            java.lang.Throwable r4 = r4.IconCompatParcelizer     // Catch:{ all -> 0x008e }
            r1.write(r4)     // Catch:{ all -> 0x008e }
        L_0x006a:
            java.lang.Object r4 = r1._rootCause     // Catch:{ all -> 0x008e }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x008e }
            r3 = r3 ^ r5
            if (r3 == 0) goto L_0x0072
            r2 = r4
        L_0x0072:
            o.HmlVerifyPhoneValidateOtpActivity r3 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x008e }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x007a
            r7.write((p040o.onBoardingInAppClick) r0, (java.lang.Throwable) r2)
        L_0x007a:
            o.uploadCroppedImage r8 = MediaBrowserCompat$CustomActionResultReceiver((p040o.MwManageReceivingAccountActivity) r8)
            if (r8 == 0) goto L_0x0089
            boolean r8 = r7.write(r1, r8, r9)
            if (r8 == 0) goto L_0x0089
            o.EkycOtpActivity r8 = p040o.MwOnBoardSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver
            return r8
        L_0x0089:
            java.lang.Object r8 = r7.read((p040o.onDoneNicknameClick.IconCompatParcelizer) r1, (java.lang.Object) r9)
            return r8
        L_0x008e:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        L_0x0091:
            o.EkycOtpActivity r8 = p040o.MwOnBoardSuccessActivity.read
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onDoneNicknameClick.MediaBrowserCompat$ItemReceiver(o.MwManageReceivingAccountActivity, java.lang.Object):java.lang.Object");
    }

    private static uploadCroppedImage MediaBrowserCompat$CustomActionResultReceiver(MwManageReceivingAccountActivity mwManageReceivingAccountActivity) {
        uploadCroppedImage uploadcroppedimage = (uploadCroppedImage) (!(mwManageReceivingAccountActivity instanceof uploadCroppedImage) ? null : mwManageReceivingAccountActivity);
        if (uploadcroppedimage != null) {
            return uploadcroppedimage;
        }
        onBoardingInAppClick read2 = mwManageReceivingAccountActivity.read();
        if (read2 != null) {
            return read((NdidIdpShareSuccessActivity) read2);
        }
        return null;
    }

    private final boolean write(IconCompatParcelizer iconCompatParcelizer, uploadCroppedImage uploadcroppedimage, Object obj) {
        while (uploadcroppedimage.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(false, false, new read(this, iconCompatParcelizer, uploadcroppedimage, obj)) == MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer) {
            uploadcroppedimage = read((NdidIdpShareSuccessActivity) uploadcroppedimage);
            if (uploadcroppedimage == null) {
                return false;
            }
        }
        return true;
    }

    public final MediaImagePreviewActivity MediaBrowserCompat$CustomActionResultReceiver(MaintenanceActivity maintenanceActivity) {
        onGetStartedClick.write((Object) maintenanceActivity, "child");
        MwCurrentUserEwalletActivity IconCompatParcelizer2 = IconCompatParcelizer(true, true, new uploadCroppedImage(this, maintenanceActivity));
        if (IconCompatParcelizer2 != null) {
            return (MediaImagePreviewActivity) IconCompatParcelizer2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
    }

    public void write(Throwable th) {
        onGetStartedClick.write((Object) th, "exception");
        throw th;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(IconCompatParcelizer());
        sb2.append('{');
        sb2.append(MediaMetadataCompat(MediaSessionCompat$ResultReceiverWrapper()));
        sb2.append('}');
        sb.append(sb2.toString());
        sb.append('@');
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        return sb.toString();
    }

    public String IconCompatParcelizer() {
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        return simpleName;
    }

    private static String MediaMetadataCompat(Object obj) {
        if (!(obj instanceof IconCompatParcelizer)) {
            return obj instanceof MwManageReceivingAccountActivity ? ((MwManageReceivingAccountActivity) obj).MediaBrowserCompat$ItemReceiver() ? "Active" : "New" : obj instanceof MerchantWalletDetailActivity_ViewBinding ? "Cancelled" : "Completed";
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
        if (((Throwable) iconCompatParcelizer._rootCause) != null) {
            return "Cancelling";
        }
        if (iconCompatParcelizer._isCompleting != 0) {
            return "Completing";
        }
    }

    /* renamed from: o.onDoneNicknameClick$IconCompatParcelizer */
    static final class IconCompatParcelizer implements MwManageReceivingAccountActivity {
        volatile Object _exceptionsHolder;
        volatile int _isCompleting = 0;
        volatile Object _rootCause;
        final onBoardingInAppClick write;

        public final onBoardingInAppClick read() {
            return this.write;
        }

        public IconCompatParcelizer(onBoardingInAppClick onboardinginappclick, Throwable th) {
            onGetStartedClick.write((Object) onboardinginappclick, "list");
            this.write = onboardinginappclick;
            this._rootCause = th;
            this._exceptionsHolder = null;
        }

        /* JADX WARNING: type inference failed for: r1v5, types: [int, boolean] */
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Finishing[cancelling=");
            sb.append(((Throwable) this._rootCause) != null);
            sb.append(", completing=");
            sb.append(this._isCompleting);
            sb.append(", rootCause=");
            sb.append((Throwable) this._rootCause);
            sb.append(", exceptions=");
            sb.append(this._exceptionsHolder);
            sb.append(", list=");
            sb.append(this.write);
            sb.append(']');
            return sb.toString();
        }

        public final void write(Throwable th) {
            onGetStartedClick.write((Object) th, "exception");
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
            } else if (th != th2) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return ((Throwable) this._rootCause) == null;
        }
    }

    /* renamed from: o.onDoneNicknameClick$read */
    static final class read extends MwManageWalletActivity_ViewBinding<clickManagePin> {
        private final Object MediaBrowserCompat$CustomActionResultReceiver;
        private final IconCompatParcelizer RatingCompat;
        private final onDoneNicknameClick read;
        private final uploadCroppedImage write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(onDoneNicknameClick ondonenicknameclick, IconCompatParcelizer iconCompatParcelizer, uploadCroppedImage uploadcroppedimage, Object obj) {
            super(uploadcroppedimage.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.write((Object) ondonenicknameclick, "parent");
            onGetStartedClick.write((Object) iconCompatParcelizer, "state");
            onGetStartedClick.write((Object) uploadcroppedimage, "child");
            this.read = ondonenicknameclick;
            this.RatingCompat = iconCompatParcelizer;
            this.write = uploadcroppedimage;
            this.MediaBrowserCompat$CustomActionResultReceiver = obj;
        }

        public final void IconCompatParcelizer(Throwable th) {
            onDoneNicknameClick.read(this.read, this.RatingCompat, this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChildCompletion[");
            sb.append(this.write);
            sb.append(", ");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(']');
            return sb.toString();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onDoneNicknameClick.read(this.read, this.RatingCompat, this.write, this.MediaBrowserCompat$CustomActionResultReceiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final Object MediaSessionCompat$ResultReceiverWrapper() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                return obj;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
    }

    private final boolean read(Object obj, onBoardingInAppClick onboardinginappclick, MwManageWalletActivity_ViewBinding<?> mwManageWalletActivity_ViewBinding) {
        int MediaBrowserCompat$CustomActionResultReceiver;
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = mwManageWalletActivity_ViewBinding;
        C6963xa3443844 write2 = new write(ndidIdpShareSuccessActivity, this, obj);
        do {
            Object MediaMetadataCompat = onboardinginappclick.MediaMetadataCompat();
            if (MediaMetadataCompat != null) {
                MediaBrowserCompat$CustomActionResultReceiver = ((NdidIdpShareSuccessActivity) MediaMetadataCompat).MediaBrowserCompat$CustomActionResultReceiver(ndidIdpShareSuccessActivity, onboardinginappclick, write2);
                if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
                    return true;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (MediaBrowserCompat$CustomActionResultReceiver != 2);
        return false;
    }

    public final void read(CancellationException cancellationException) {
        Throwable jobCancellationException = new JobCancellationException(read(), (Throwable) null, this);
        onGetStartedClick.write((Object) jobCancellationException, "cause");
        RatingCompat(jobCancellationException);
    }

    public static final /* synthetic */ void read(onDoneNicknameClick ondonenicknameclick, IconCompatParcelizer iconCompatParcelizer, uploadCroppedImage uploadcroppedimage, Object obj) {
        Object obj2;
        if (MwChangeCasaSuccessActivity.write()) {
            while (true) {
                obj2 = ondonenicknameclick._state;
                if (!(obj2 instanceof BaseNtbInstructionActivity)) {
                    break;
                }
                ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) ondonenicknameclick);
            }
            if (!(obj2 == iconCompatParcelizer)) {
                throw new AssertionError();
            }
        }
        uploadCroppedImage read2 = read((NdidIdpShareSuccessActivity) uploadcroppedimage);
        if (read2 == null || !ondonenicknameclick.write(iconCompatParcelizer, read2, obj)) {
            ondonenicknameclick.read(ondonenicknameclick.read(iconCompatParcelizer, obj));
        }
    }

    private final Object IconCompatParcelizer(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof BaseNtbInstructionActivity) {
                ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            } else if ((obj2 instanceof MwManageReceivingAccountActivity) && (!(obj2 instanceof IconCompatParcelizer) || ((IconCompatParcelizer) obj2)._isCompleting == 0)) {
                Object MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(obj2, (Object) new MerchantWalletDetailActivity_ViewBinding(MediaBrowserCompat$ItemReceiver(obj)));
                if (MediaBrowserCompat$CustomActionResultReceiver != MwOnBoardSuccessActivity.read) {
                    return MediaBrowserCompat$CustomActionResultReceiver;
                }
            }
        }
        return MwOnBoardSuccessActivity.IconCompatParcelizer;
    }

    private final void IconCompatParcelizer(MwManageReceivingAccountActivity mwManageReceivingAccountActivity, Object obj) {
        MediaImagePreviewActivity mediaImagePreviewActivity = (MediaImagePreviewActivity) this._parentHandle;
        if (mediaImagePreviewActivity != null) {
            mediaImagePreviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
            this._parentHandle = MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer;
        }
        Throwable th = null;
        if (!(obj instanceof MerchantWalletDetailActivity_ViewBinding)) {
            obj = null;
        }
        MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) obj;
        if (merchantWalletDetailActivity_ViewBinding != null) {
            th = merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer;
        }
        if (mwManageReceivingAccountActivity instanceof MwManageWalletActivity_ViewBinding) {
            try {
                ((MwManageWalletActivity_ViewBinding) mwManageReceivingAccountActivity).IconCompatParcelizer(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(mwManageReceivingAccountActivity);
                sb.append(" for ");
                sb.append(this);
                write((Throwable) new CompletionHandlerException(sb.toString(), th2));
            }
        } else {
            onBoardingInAppClick read2 = mwManageReceivingAccountActivity.read();
            if (read2 != null) {
                MediaBrowserCompat$CustomActionResultReceiver(read2, th);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r0 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        write(((p040o.onDoneNicknameClick.IconCompatParcelizer) r2).write, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0059, code lost:
        return p040o.MwOnBoardSuccessActivity.IconCompatParcelizer;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object MediaBrowserCompat$MediaItem(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r8._state
            boolean r3 = r2 instanceof p040o.BaseNtbInstructionActivity
            if (r3 != 0) goto L_0x00f2
            boolean r3 = r2 instanceof p040o.onDoneNicknameClick.IconCompatParcelizer
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x005d
            monitor-enter(r2)
            r3 = r2
            o.onDoneNicknameClick$IconCompatParcelizer r3 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r3     // Catch:{ all -> 0x005a }
            java.lang.Object r3 = r3._exceptionsHolder     // Catch:{ all -> 0x005a }
            o.EkycOtpActivity r6 = p040o.MwOnBoardSuccessActivity.RatingCompat     // Catch:{ all -> 0x005a }
            if (r3 != r6) goto L_0x001c
            r3 = r5
            goto L_0x001d
        L_0x001c:
            r3 = r4
        L_0x001d:
            if (r3 == 0) goto L_0x0025
            o.EkycOtpActivity r9 = p040o.MwOnBoardSuccessActivity.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x005a }
            monitor-exit(r2)
            return r9
        L_0x0025:
            r3 = r2
            o.onDoneNicknameClick$IconCompatParcelizer r3 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r3     // Catch:{ all -> 0x005a }
            java.lang.Object r3 = r3._rootCause     // Catch:{ all -> 0x005a }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x002f
            r4 = r5
        L_0x002f:
            if (r9 != 0) goto L_0x0033
            if (r4 != 0) goto L_0x003f
        L_0x0033:
            if (r1 != 0) goto L_0x0039
            java.lang.Throwable r1 = r8.MediaBrowserCompat$ItemReceiver((java.lang.Object) r9)     // Catch:{ all -> 0x005a }
        L_0x0039:
            r9 = r2
            o.onDoneNicknameClick$IconCompatParcelizer r9 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r9     // Catch:{ all -> 0x005a }
            r9.write(r1)     // Catch:{ all -> 0x005a }
        L_0x003f:
            r9 = r2
            o.onDoneNicknameClick$IconCompatParcelizer r9 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r9     // Catch:{ all -> 0x005a }
            java.lang.Object r9 = r9._rootCause     // Catch:{ all -> 0x005a }
            java.lang.Throwable r9 = (java.lang.Throwable) r9     // Catch:{ all -> 0x005a }
            r1 = r4 ^ 1
            if (r1 == 0) goto L_0x004b
            r0 = r9
        L_0x004b:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0055
            o.onDoneNicknameClick$IconCompatParcelizer r2 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r2
            o.onBoardingInAppClick r9 = r2.write
            r8.write((p040o.onBoardingInAppClick) r9, (java.lang.Throwable) r0)
        L_0x0055:
            o.EkycOtpActivity r9 = p040o.MwOnBoardSuccessActivity.IconCompatParcelizer
            return r9
        L_0x005a:
            r9 = move-exception
            monitor-exit(r2)
            throw r9
        L_0x005d:
            boolean r3 = r2 instanceof p040o.MwManageReceivingAccountActivity
            if (r3 == 0) goto L_0x00ed
            if (r1 == 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            java.lang.Throwable r1 = r8.MediaBrowserCompat$ItemReceiver((java.lang.Object) r9)
        L_0x0068:
            r3 = r2
            o.MwManageReceivingAccountActivity r3 = (p040o.MwManageReceivingAccountActivity) r3
            boolean r6 = r3.MediaBrowserCompat$ItemReceiver()
            if (r6 == 0) goto L_0x00b8
            boolean r2 = p040o.MwChangeCasaSuccessActivity.write()
            if (r2 == 0) goto L_0x0085
            boolean r2 = r3 instanceof p040o.onDoneNicknameClick.IconCompatParcelizer
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x007d
            goto L_0x0085
        L_0x007d:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x0085:
            boolean r2 = p040o.MwChangeCasaSuccessActivity.write()
            if (r2 == 0) goto L_0x009a
            boolean r2 = r3.MediaBrowserCompat$ItemReceiver()
            if (r2 == 0) goto L_0x0092
            goto L_0x009a
        L_0x0092:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            throw r9
        L_0x009a:
            o.onBoardingInAppClick r2 = r8.IconCompatParcelizer((p040o.MwManageReceivingAccountActivity) r3)
            if (r2 == 0) goto L_0x00b1
            o.onDoneNicknameClick$IconCompatParcelizer r6 = new o.onDoneNicknameClick$IconCompatParcelizer
            r6.<init>(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = read
            boolean r3 = r7.compareAndSet(r8, r3, r6)
            if (r3 == 0) goto L_0x00b1
            r8.write((p040o.onBoardingInAppClick) r2, (java.lang.Throwable) r1)
            r4 = r5
        L_0x00b1:
            if (r4 == 0) goto L_0x0002
            o.EkycOtpActivity r9 = p040o.MwOnBoardSuccessActivity.IconCompatParcelizer
            return r9
        L_0x00b8:
            o.MerchantWalletDetailActivity_ViewBinding r3 = new o.MerchantWalletDetailActivity_ViewBinding
            r3.<init>(r1)
            java.lang.Object r3 = r8.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r2, (java.lang.Object) r3)
            o.EkycOtpActivity r4 = p040o.MwOnBoardSuccessActivity.IconCompatParcelizer
            if (r3 == r4) goto L_0x00d0
            o.EkycOtpActivity r2 = p040o.MwOnBoardSuccessActivity.read
            if (r3 != r2) goto L_0x00cf
            goto L_0x0002
        L_0x00cf:
            return r3
        L_0x00d0:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Cannot happen in "
            r9.append(r0)
            r9.append(r2)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00ed:
            o.EkycOtpActivity r9 = p040o.MwOnBoardSuccessActivity.MediaBrowserCompat$MediaItem
            return r9
        L_0x00f2:
            o.BaseNtbInstructionActivity r2 = (p040o.BaseNtbInstructionActivity) r2
            r2.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r8)
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onDoneNicknameClick.MediaBrowserCompat$MediaItem(java.lang.Object):java.lang.Object");
    }

    private static uploadCroppedImage read(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        Object obj;
        while (true) {
            Object obj2 = ndidIdpShareSuccessActivity._next;
            if (!(obj2 instanceof BaseNtbInstructionActivity)) {
                if (!(obj2 instanceof RpLivenessCheckActivity)) {
                    break;
                }
                ndidIdpShareSuccessActivity = NationalIdCameraActivity_ViewBinding.write(ndidIdpShareSuccessActivity.MediaMetadataCompat());
            } else {
                ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) ndidIdpShareSuccessActivity);
            }
        }
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2 = ndidIdpShareSuccessActivity;
        while (true) {
            Object obj3 = ndidIdpShareSuccessActivity2._next;
            if (!(obj3 instanceof BaseNtbInstructionActivity)) {
                NdidIdpShareSuccessActivity write2 = NationalIdCameraActivity_ViewBinding.write(obj3);
                while (true) {
                    obj = write2._next;
                    if (!(obj instanceof BaseNtbInstructionActivity)) {
                        break;
                    }
                    ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) write2);
                }
                if (!(obj instanceof RpLivenessCheckActivity)) {
                    if (write2 instanceof uploadCroppedImage) {
                        return (uploadCroppedImage) write2;
                    }
                    if (write2 instanceof onBoardingInAppClick) {
                        return null;
                    }
                }
                ndidIdpShareSuccessActivity2 = write2;
            } else {
                ((BaseNtbInstructionActivity) obj3).MediaBrowserCompat$CustomActionResultReceiver((Object) ndidIdpShareSuccessActivity2);
            }
        }
    }

    private final void write(onBoardingInAppClick onboardinginappclick, Throwable th) {
        Object obj;
        while (true) {
            obj = onboardinginappclick._next;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) onboardinginappclick);
        }
        if (obj != null) {
            Throwable th2 = null;
            for (NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj; !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ndidIdpShareSuccessActivity, (Object) onboardinginappclick); ndidIdpShareSuccessActivity = ndidIdpShareSuccessActivity.MediaBrowserCompat$MediaItem()) {
                if (ndidIdpShareSuccessActivity instanceof clickManageShopInfo) {
                    MwManageWalletActivity_ViewBinding mwManageWalletActivity_ViewBinding = (MwManageWalletActivity_ViewBinding) ndidIdpShareSuccessActivity;
                    try {
                        mwManageWalletActivity_ViewBinding.IconCompatParcelizer(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            onGetStartedClick.write((Object) th2, "$this$addSuppressed");
                            onGetStartedClick.write((Object) th3, "exception");
                            InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(mwManageWalletActivity_ViewBinding);
                        sb.append(" for ");
                        sb.append(this);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                }
            }
            if (th2 != null) {
                write(th2);
            }
            MediaBrowserCompat$CustomActionResultReceiver(th);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(onBoardingInAppClick onboardinginappclick, Throwable th) {
        Object obj;
        while (true) {
            obj = onboardinginappclick._next;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) onboardinginappclick);
        }
        if (obj != null) {
            Throwable th2 = null;
            for (NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj; !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ndidIdpShareSuccessActivity, (Object) onboardinginappclick); ndidIdpShareSuccessActivity = ndidIdpShareSuccessActivity.MediaBrowserCompat$MediaItem()) {
                if (ndidIdpShareSuccessActivity instanceof MwManageWalletActivity_ViewBinding) {
                    MwManageWalletActivity_ViewBinding mwManageWalletActivity_ViewBinding = (MwManageWalletActivity_ViewBinding) ndidIdpShareSuccessActivity;
                    try {
                        mwManageWalletActivity_ViewBinding.IconCompatParcelizer(th);
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            onGetStartedClick.write((Object) th2, "$this$addSuppressed");
                            onGetStartedClick.write((Object) th3, "exception");
                            InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th2, th3);
                            if (th2 != null) {
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(mwManageWalletActivity_ViewBinding);
                        sb.append(" for ");
                        sb.append(this);
                        th2 = new CompletionHandlerException(sb.toString(), th3);
                        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                    }
                }
            }
            if (th2 != null) {
                write(th2);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    public final Object MediaBrowserCompat$ItemReceiver(HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity) {
        while (true) {
            Object obj = this._state;
            if (obj instanceof BaseNtbInstructionActivity) {
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            } else if (!(obj instanceof MwManageReceivingAccountActivity)) {
                if (!(obj instanceof MerchantWalletDetailActivity_ViewBinding)) {
                    return MwOnBoardSuccessActivity.read(obj);
                }
                Throwable th = ((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer;
                if (!MwChangeCasaSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver()) {
                    throw th;
                } else if (!(hmlNTBPromptPayNotFoundActivity instanceof HmlNTBDocumentSubmissionActivity)) {
                    throw th;
                } else {
                    throw NdidSelectIdpActivity.write(th, (HmlNTBDocumentSubmissionActivity) hmlNTBPromptPayNotFoundActivity);
                }
            } else if (MediaDescriptionCompat(obj) >= 0) {
                C7320x3b5ad206 ondonenicknameclick_mediabrowsercompat_customactionresultreceiver = new C7320x3b5ad206(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity), this);
                FundFactSheetActivity usephotoclick = new usePhotoClick(this, ondonenicknameclick_mediabrowsercompat_customactionresultreceiver);
                onGetStartedClick.write((Object) usephotoclick, "handler");
                AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((MailingAddressReviewOTPActivity<?>) ondonenicknameclick_mediabrowsercompat_customactionresultreceiver, IconCompatParcelizer(false, true, usephotoclick));
                Object MediaBrowserCompat$CustomActionResultReceiver = ondonenicknameclick_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver();
                if (MediaBrowserCompat$CustomActionResultReceiver == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                    onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
                }
                return MediaBrowserCompat$CustomActionResultReceiver;
            }
        }
    }

    public final <R> R read(R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlPromptPayVerificationActivity.IconCompatParcelizer, ? extends R> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "operation");
        return baseDiscoverFundFilterActivity.MediaBrowserCompat$CustomActionResultReceiver(r, this);
    }

    public final <E extends HmlPromptPayVerificationActivity.IconCompatParcelizer> E IconCompatParcelizer(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<E> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        E e = this;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) e.MediaBrowserCompat$ItemReceiver(), (Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver)) {
            return null;
        }
        return e;
    }

    public final CancellationException MediaDescriptionCompat() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
        if (obj instanceof IconCompatParcelizer) {
            Throwable th = (Throwable) ((IconCompatParcelizer) obj)._rootCause;
            if (th != null) {
                StringBuilder sb = new StringBuilder();
                onGetStartedClick.write((Object) this, "$this$classSimpleName");
                String simpleName = getClass().getSimpleName();
                onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
                sb.append(simpleName);
                sb.append(" is cancelling");
                CancellationException MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(th, sb.toString());
                if (MediaBrowserCompat$ItemReceiver != null) {
                    return MediaBrowserCompat$ItemReceiver;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Job is still new or active: ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        } else if (obj instanceof MwManageReceivingAccountActivity) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Job is still new or active: ");
            sb3.append(this);
            throw new IllegalStateException(sb3.toString().toString());
        } else if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            return MediaBrowserCompat$ItemReceiver(((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer, (String) null);
        } else {
            StringBuilder sb4 = new StringBuilder();
            onGetStartedClick.write((Object) this, "$this$classSimpleName");
            String simpleName2 = getClass().getSimpleName();
            onGetStartedClick.IconCompatParcelizer((Object) simpleName2, "this::class.java.simpleName");
            sb4.append(simpleName2);
            sb4.append(" has completed normally");
            return new JobCancellationException(sb4.toString(), (Throwable) null, this);
        }
    }

    public final CancellationException MediaSessionCompat$Token() {
        Object obj;
        Throwable th;
        while (true) {
            obj = this._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
        CancellationException cancellationException = null;
        if (obj instanceof IconCompatParcelizer) {
            th = (Throwable) ((IconCompatParcelizer) obj)._rootCause;
        } else if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            th = ((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer;
        } else if (!(obj instanceof MwManageReceivingAccountActivity)) {
            th = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be cancelling child in this state: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        CancellationException cancellationException2 = cancellationException;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Parent job is ");
        sb2.append(MediaMetadataCompat(obj));
        return new JobCancellationException(sb2.toString(), th, this);
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [o.onClickChange] */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009a, code lost:
        if (((p040o.onDoneNicknameClick.IconCompatParcelizer) r2)._isCompleting == 0) goto L_0x009c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.MwCurrentUserEwalletActivity IconCompatParcelizer(boolean r8, boolean r9, p040o.FundFactSheetActivity<? super java.lang.Throwable, p040o.HmlVerifyPhoneValidateOtpActivity> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "handler"
            p040o.onGetStartedClick.write((java.lang.Object) r10, (java.lang.String) r0)
            r0 = 0
            r1 = r0
        L_0x0007:
            java.lang.Object r2 = r7._state
            boolean r3 = r2 instanceof p040o.BaseNtbInstructionActivity
            if (r3 != 0) goto L_0x00e8
            boolean r3 = r2 instanceof p040o.MwCreateQrActivity.MwScreenshotDisplay
            if (r3 == 0) goto L_0x0044
            r3 = r2
            o.MwCreateQrActivity$MwScreenshotDisplay r3 = (p040o.MwCreateQrActivity.MwScreenshotDisplay) r3
            boolean r4 = r3.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x002a
            if (r1 == 0) goto L_0x001b
            goto L_0x001f
        L_0x001b:
            o.MwManageWalletActivity_ViewBinding r1 = r7.MediaBrowserCompat$ItemReceiver((p040o.FundFactSheetActivity<? super java.lang.Throwable, p040o.HmlVerifyPhoneValidateOtpActivity>) r10, (boolean) r8)
        L_0x001f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = read
            boolean r2 = r3.compareAndSet(r7, r2, r1)
            if (r2 == 0) goto L_0x0007
            o.MwCurrentUserEwalletActivity r1 = (p040o.MwCurrentUserEwalletActivity) r1
            return r1
        L_0x002a:
            o.onBoardingInAppClick r2 = new o.onBoardingInAppClick
            r2.<init>()
            boolean r4 = r3.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x0036
            o.MwManageReceivingAccountActivity r2 = (p040o.MwManageReceivingAccountActivity) r2
            goto L_0x003e
        L_0x0036:
            o.onClickChange r4 = new o.onClickChange
            r4.<init>(r2)
            r2 = r4
            o.MwManageReceivingAccountActivity r2 = (p040o.MwManageReceivingAccountActivity) r2
        L_0x003e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = read
            r4.compareAndSet(r7, r3, r2)
            goto L_0x0007
        L_0x0044:
            boolean r3 = r2 instanceof p040o.MwManageReceivingAccountActivity
            if (r3 == 0) goto L_0x00d3
            r3 = r2
            o.MwManageReceivingAccountActivity r3 = (p040o.MwManageReceivingAccountActivity) r3
            o.onBoardingInAppClick r3 = r3.read()
            if (r3 != 0) goto L_0x007d
            if (r2 == 0) goto L_0x0075
            o.MwManageWalletActivity_ViewBinding r2 = (p040o.MwManageWalletActivity_ViewBinding) r2
            o.onBoardingInAppClick r3 = new o.onBoardingInAppClick
            r3.<init>()
            o.NdidIdpShareSuccessActivity r3 = (p040o.NdidIdpShareSuccessActivity) r3
            r2.MediaBrowserCompat$CustomActionResultReceiver(r3)
        L_0x005f:
            java.lang.Object r3 = r2._next
            boolean r4 = r3 instanceof p040o.BaseNtbInstructionActivity
            if (r4 != 0) goto L_0x006f
            o.NdidIdpShareSuccessActivity r3 = p040o.NationalIdCameraActivity_ViewBinding.write(r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = read
            r4.compareAndSet(r7, r2, r3)
            goto L_0x0007
        L_0x006f:
            o.BaseNtbInstructionActivity r3 = (p040o.BaseNtbInstructionActivity) r3
            r3.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r2)
            goto L_0x005f
        L_0x0075:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>"
            r8.<init>(r9)
            throw r8
        L_0x007d:
            o.MwOnBoardSuccessActivity_ViewBinding r4 = p040o.MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer
            o.MwCurrentUserEwalletActivity r4 = (p040o.MwCurrentUserEwalletActivity) r4
            if (r8 == 0) goto L_0x00bb
            boolean r5 = r2 instanceof p040o.onDoneNicknameClick.IconCompatParcelizer
            if (r5 == 0) goto L_0x00bb
            monitor-enter(r2)
            r5 = r2
            o.onDoneNicknameClick$IconCompatParcelizer r5 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r5     // Catch:{ all -> 0x00b8 }
            java.lang.Object r5 = r5._rootCause     // Catch:{ all -> 0x00b8 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00b8 }
            if (r5 == 0) goto L_0x009c
            boolean r6 = r10 instanceof p040o.uploadCroppedImage
            if (r6 == 0) goto L_0x00b4
            r6 = r2
            o.onDoneNicknameClick$IconCompatParcelizer r6 = (p040o.onDoneNicknameClick.IconCompatParcelizer) r6     // Catch:{ all -> 0x00b8 }
            int r6 = r6._isCompleting     // Catch:{ all -> 0x00b8 }
            if (r6 != 0) goto L_0x00b4
        L_0x009c:
            if (r1 != 0) goto L_0x00a2
            o.MwManageWalletActivity_ViewBinding r1 = r7.MediaBrowserCompat$ItemReceiver((p040o.FundFactSheetActivity<? super java.lang.Throwable, p040o.HmlVerifyPhoneValidateOtpActivity>) r10, (boolean) r8)     // Catch:{ all -> 0x00b8 }
        L_0x00a2:
            boolean r4 = r7.read(r2, r3, r1)     // Catch:{ all -> 0x00b8 }
            if (r4 != 0) goto L_0x00ab
            monitor-exit(r2)
            goto L_0x0007
        L_0x00ab:
            if (r5 != 0) goto L_0x00b1
            o.MwCurrentUserEwalletActivity r1 = (p040o.MwCurrentUserEwalletActivity) r1     // Catch:{ all -> 0x00b8 }
            monitor-exit(r2)
            return r1
        L_0x00b1:
            r4 = r1
            o.MwCurrentUserEwalletActivity r4 = (p040o.MwCurrentUserEwalletActivity) r4     // Catch:{ all -> 0x00b8 }
        L_0x00b4:
            o.HmlVerifyPhoneValidateOtpActivity r6 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00b8 }
            monitor-exit(r2)
            goto L_0x00bc
        L_0x00b8:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L_0x00bb:
            r5 = r0
        L_0x00bc:
            if (r5 == 0) goto L_0x00c4
            if (r9 == 0) goto L_0x00c3
            r10.invoke(r5)
        L_0x00c3:
            return r4
        L_0x00c4:
            if (r1 != 0) goto L_0x00ca
            o.MwManageWalletActivity_ViewBinding r1 = r7.MediaBrowserCompat$ItemReceiver((p040o.FundFactSheetActivity<? super java.lang.Throwable, p040o.HmlVerifyPhoneValidateOtpActivity>) r10, (boolean) r8)
        L_0x00ca:
            boolean r2 = r7.read(r2, r3, r1)
            if (r2 == 0) goto L_0x0007
            o.MwCurrentUserEwalletActivity r1 = (p040o.MwCurrentUserEwalletActivity) r1
            return r1
        L_0x00d3:
            if (r9 == 0) goto L_0x00e3
            boolean r8 = r2 instanceof p040o.MerchantWalletDetailActivity_ViewBinding
            if (r8 != 0) goto L_0x00da
            r2 = r0
        L_0x00da:
            o.MerchantWalletDetailActivity_ViewBinding r2 = (p040o.MerchantWalletDetailActivity_ViewBinding) r2
            if (r2 == 0) goto L_0x00e0
            java.lang.Throwable r0 = r2.IconCompatParcelizer
        L_0x00e0:
            r10.invoke(r0)
        L_0x00e3:
            o.MwOnBoardSuccessActivity_ViewBinding r8 = p040o.MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer
            o.MwCurrentUserEwalletActivity r8 = (p040o.MwCurrentUserEwalletActivity) r8
            return r8
        L_0x00e8:
            o.BaseNtbInstructionActivity r2 = (p040o.BaseNtbInstructionActivity) r2
            r2.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r7)
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onDoneNicknameClick.IconCompatParcelizer(boolean, boolean, o.FundFactSheetActivity):o.MwCurrentUserEwalletActivity");
    }

    public boolean write() {
        Object obj;
        while (true) {
            obj = this._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
        return (obj instanceof MwManageReceivingAccountActivity) && ((MwManageReceivingAccountActivity) obj).MediaBrowserCompat$ItemReceiver();
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                return !(obj instanceof MwManageReceivingAccountActivity);
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof BaseNtbInstructionActivity)) {
                Object MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(obj2, obj);
                if (MediaBrowserCompat$CustomActionResultReceiver == MwOnBoardSuccessActivity.IconCompatParcelizer) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Job ");
                    sb.append(this);
                    sb.append(" is already complete or completing, ");
                    sb.append("but is being completed with ");
                    sb.append(obj);
                    String obj3 = sb.toString();
                    Throwable th = null;
                    if (!(obj instanceof MerchantWalletDetailActivity_ViewBinding)) {
                        obj = null;
                    }
                    MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) obj;
                    if (merchantWalletDetailActivity_ViewBinding != null) {
                        th = merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer;
                    }
                    throw new IllegalStateException(obj3, th);
                } else if (MediaBrowserCompat$CustomActionResultReceiver != MwOnBoardSuccessActivity.read) {
                    return MediaBrowserCompat$CustomActionResultReceiver;
                }
            } else {
                ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            }
        }
    }

    public final HmlPromptPayVerificationActivity read(HmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver<?> hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        HmlPromptPayVerificationActivity.IconCompatParcelizer iconCompatParcelizer = this;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver, "key");
        boolean MediaBrowserCompat$ItemReceiver = onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(), (Object) hmlPromptPayVerificationActivity$MediaBrowserCompat$ItemReceiver);
        Object obj = iconCompatParcelizer;
        if (MediaBrowserCompat$ItemReceiver) {
            obj = HmlPromptPayAboutActivity.IconCompatParcelizer;
        }
        return (HmlPromptPayVerificationActivity) obj;
    }

    public final HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity2 = this;
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        return hmlPromptPayVerificationActivity != HmlPromptPayAboutActivity.IconCompatParcelizer ? (HmlPromptPayVerificationActivity) hmlPromptPayVerificationActivity.read(hmlPromptPayVerificationActivity2, C6894x2375c6f.write) : hmlPromptPayVerificationActivity2;
    }

    public final <T, R> void read(OccupationSearchActivity<? super R> occupationSearchActivity, BaseDiscoverFundFilterActivity<? super T, ? super HmlNTBPromptPayNotFoundActivity<? super R>, ? extends Object> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) occupationSearchActivity, "select");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        while (true) {
            Object obj = this._state;
            if (obj instanceof BaseNtbInstructionActivity) {
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            } else if (!occupationSearchActivity.IconCompatParcelizer()) {
                if (!(obj instanceof MwManageReceivingAccountActivity)) {
                    if (!occupationSearchActivity.read()) {
                        return;
                    }
                    if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
                        occupationSearchActivity.IconCompatParcelizer(((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer);
                        return;
                    } else {
                        AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(baseDiscoverFundFilterActivity, MwOnBoardSuccessActivity.read(obj), occupationSearchActivity.write());
                        return;
                    }
                } else if (MediaDescriptionCompat(obj) == 0) {
                    FundFactSheetActivity mwPartnerCropPhotoActivity_ViewBinding = new MwPartnerCropPhotoActivity_ViewBinding(this, occupationSearchActivity, baseDiscoverFundFilterActivity);
                    onGetStartedClick.write((Object) mwPartnerCropPhotoActivity_ViewBinding, "handler");
                    occupationSearchActivity.read(IconCompatParcelizer(false, true, mwPartnerCropPhotoActivity_ViewBinding));
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final <T, R> void write(OccupationSearchActivity<? super R> occupationSearchActivity, BaseDiscoverFundFilterActivity<? super T, ? super HmlNTBPromptPayNotFoundActivity<? super R>, ? extends Object> baseDiscoverFundFilterActivity) {
        Object obj;
        onGetStartedClick.write((Object) occupationSearchActivity, "select");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        while (true) {
            obj = this._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
        }
        if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            occupationSearchActivity.IconCompatParcelizer(((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer);
        } else {
            AlertController$RecycleListView.IconCompatParcelizer(baseDiscoverFundFilterActivity, MwOnBoardSuccessActivity.read(obj), occupationSearchActivity.write());
        }
    }

    public final boolean RatingCompat() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                int MediaDescriptionCompat = MediaDescriptionCompat(obj);
                if (MediaDescriptionCompat == 0) {
                    return false;
                }
                if (MediaDescriptionCompat == 1) {
                    return true;
                }
            } else {
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) this);
            }
        }
    }
}

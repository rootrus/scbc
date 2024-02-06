package p040o;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p040o.HmlVerifyIdentifyActivity;
import p040o.NdidIdpShareSuccessActivity;

/* renamed from: o.MwReviewActivity */
public abstract class MwReviewActivity<E> implements MwSubDistrictSearchActivity<E> {
    private static final AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(MwReviewActivity.class, Object.class, "onCloseHandler");
    private final onReturnHomeButtonClick MediaBrowserCompat$CustomActionResultReceiver = new onReturnHomeButtonClick();
    private volatile Object onCloseHandler = null;

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$ItemReceiver(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity) {
        onGetStartedClick.write((Object) ndidIdpShareSuccessActivity, "closed");
    }

    /* access modifiers changed from: protected */
    public String MediaBrowserCompat$MediaItem() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public abstract boolean mo42858x50fd9e4a();

    /* access modifiers changed from: protected */
    public abstract boolean MediaSessionCompat$ResultReceiverWrapper();

    /* access modifiers changed from: protected */
    public final onReturnHomeButtonClick MediaDescriptionCompat() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    /* access modifiers changed from: protected */
    public Object write(E e) {
        MwShopTypeActivity_ViewBinding MediaMetadataCompat;
        EkycOtpActivity IconCompatParcelizer2;
        do {
            MediaMetadataCompat = MediaMetadataCompat();
            if (MediaMetadataCompat == null) {
                return MwReviewActivity_ViewBinding.write;
            }
            IconCompatParcelizer2 = MediaMetadataCompat.IconCompatParcelizer();
        } while (IconCompatParcelizer2 == null);
        if (MwChangeCasaSuccessActivity.write()) {
            if (!(IconCompatParcelizer2 == MailingAddressLandingActivity.write)) {
                throw new AssertionError();
            }
        }
        MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(e);
        return MediaMetadataCompat.read();
    }

    /* access modifiers changed from: protected */
    public final MwShopAddressActivity<?> RatingCompat() {
        NdidIdpShareSuccessActivity write2 = NationalIdCameraActivity_ViewBinding.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat());
        if (!(write2 instanceof MwShopAddressActivity)) {
            write2 = null;
        }
        MwShopAddressActivity<?> mwShopAddressActivity = (MwShopAddressActivity) write2;
        if (mwShopAddressActivity == null) {
            return null;
        }
        MediaBrowserCompat$CustomActionResultReceiver(mwShopAddressActivity);
        return mwShopAddressActivity;
    }

    /* renamed from: o.MwReviewActivity$read */
    public static final class read extends C6963xa3443844 {
        private /* synthetic */ MwReviewActivity write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity, MwReviewActivity mwReviewActivity) {
            super(ndidIdpShareSuccessActivity);
            this.write = mwReviewActivity;
        }

        public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
            onGetStartedClick.write((Object) (NdidIdpShareSuccessActivity) obj, "affected");
            if (this.write.MediaSessionCompat$ResultReceiverWrapper()) {
                return null;
            }
            return NationalIdCameraActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* access modifiers changed from: protected */
    public final MwShopAddressActivity<?> MediaBrowserCompat$SearchResultReceiver() {
        Object obj;
        onReturnHomeButtonClick onreturnhomebuttonclick = this.MediaBrowserCompat$CustomActionResultReceiver;
        while (true) {
            obj = onreturnhomebuttonclick._next;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) onreturnhomebuttonclick);
        }
        NdidIdpShareSuccessActivity write2 = NationalIdCameraActivity_ViewBinding.write(obj);
        if (!(write2 instanceof MwShopAddressActivity)) {
            write2 = null;
        }
        MwShopAddressActivity<?> mwShopAddressActivity = (MwShopAddressActivity) write2;
        if (mwShopAddressActivity == null) {
            return null;
        }
        MediaBrowserCompat$CustomActionResultReceiver(mwShopAddressActivity);
        return mwShopAddressActivity;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p040o.MwTermsAndConditionsActivity MediaSessionCompat$Token() {
        /*
            r3 = this;
            o.onReturnHomeButtonClick r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0002:
            java.lang.Object r1 = r0._next
            boolean r2 = r1 instanceof p040o.BaseNtbInstructionActivity
            if (r2 != 0) goto L_0x0034
            if (r1 == 0) goto L_0x002c
            o.NdidIdpShareSuccessActivity r1 = (p040o.NdidIdpShareSuccessActivity) r1
            r2 = r0
            o.NdidIdpShareSuccessActivity r2 = (p040o.NdidIdpShareSuccessActivity) r2
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            boolean r2 = r1 instanceof p040o.MwTermsAndConditionsActivity
            if (r2 == 0) goto L_0x0028
            r2 = r1
            o.MwTermsAndConditionsActivity r2 = (p040o.MwTermsAndConditionsActivity) r2
            boolean r2 = r2 instanceof p040o.MwShopAddressActivity
            if (r2 != 0) goto L_0x0029
            boolean r2 = r1.aU_()
            if (r2 == 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            r1.RatingCompat()
            goto L_0x0002
        L_0x0028:
            r1 = 0
        L_0x0029:
            o.MwTermsAndConditionsActivity r1 = (p040o.MwTermsAndConditionsActivity) r1
            return r1
        L_0x002c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            o.BaseNtbInstructionActivity r1 = (p040o.BaseNtbInstructionActivity) r1
            r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r0)
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MwReviewActivity.MediaSessionCompat$Token():o.MwTermsAndConditionsActivity");
    }

    /* access modifiers changed from: protected */
    public final MwShopTypeActivity_ViewBinding<?> MediaBrowserCompat$ItemReceiver(E e) {
        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity;
        onReturnHomeButtonClick onreturnhomebuttonclick = this.MediaBrowserCompat$CustomActionResultReceiver;
        NdidIdpShareSuccessActivity iconCompatParcelizer = new IconCompatParcelizer(e);
        do {
            Object MediaMetadataCompat = onreturnhomebuttonclick.MediaMetadataCompat();
            if (MediaMetadataCompat != null) {
                ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) MediaMetadataCompat;
                if (ndidIdpShareSuccessActivity instanceof MwShopTypeActivity_ViewBinding) {
                    return (MwShopTypeActivity_ViewBinding) ndidIdpShareSuccessActivity;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!ndidIdpShareSuccessActivity.read(iconCompatParcelizer, onreturnhomebuttonclick));
        return null;
    }

    public final boolean ParcelableVolumeInfo() {
        return RatingCompat() != null;
    }

    public final Object MediaBrowserCompat$ItemReceiver(E e, HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity) {
        Object obj;
        Object obj2;
        if (write(e) == MwReviewActivity_ViewBinding.IconCompatParcelizer) {
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
        MailingAddressReviewActivity<? super HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity));
        MailingAddressReviewOTPActivity mailingAddressReviewOTPActivity = MediaBrowserCompat$CustomActionResultReceiver2;
        while (true) {
            onReturnHomeButtonClick onreturnhomebuttonclick = this.MediaBrowserCompat$CustomActionResultReceiver;
            while (true) {
                obj = onreturnhomebuttonclick._next;
                if (!(obj instanceof BaseNtbInstructionActivity)) {
                    break;
                }
                ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) onreturnhomebuttonclick);
            }
            boolean z = NationalIdCameraActivity_ViewBinding.write(obj) instanceof MwShopTypeActivity_ViewBinding;
            boolean z2 = false;
            if (!z && MediaSessionCompat$ResultReceiverWrapper()) {
                onSettingsClick onsettingsclick = new onSettingsClick(e, mailingAddressReviewOTPActivity);
                mo42858x50fd9e4a();
                onReturnHomeButtonClick onreturnhomebuttonclick2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = onsettingsclick;
                C6963xa3443844 read2 = new read(ndidIdpShareSuccessActivity, this);
                while (true) {
                    Object MediaMetadataCompat = onreturnhomebuttonclick2.MediaMetadataCompat();
                    if (MediaMetadataCompat != null) {
                        NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity2 = (NdidIdpShareSuccessActivity) MediaMetadataCompat;
                        if (ndidIdpShareSuccessActivity2 instanceof MwShopTypeActivity_ViewBinding) {
                            obj2 = ndidIdpShareSuccessActivity2;
                            break;
                        }
                        int MediaBrowserCompat$CustomActionResultReceiver3 = ndidIdpShareSuccessActivity2.MediaBrowserCompat$CustomActionResultReceiver(ndidIdpShareSuccessActivity, onreturnhomebuttonclick2, read2);
                        if (MediaBrowserCompat$CustomActionResultReceiver3 != 1) {
                            if (MediaBrowserCompat$CustomActionResultReceiver3 == 2) {
                                break;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                    }
                }
                if (!z2) {
                    obj2 = MwReviewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver;
                } else {
                    obj2 = null;
                }
                if (obj2 == null) {
                    NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity3 = onsettingsclick;
                    onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "$this$removeOnCancellation");
                    onGetStartedClick.write((Object) ndidIdpShareSuccessActivity3, "node");
                    mailingAddressReviewOTPActivity.IconCompatParcelizer((FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity>) new MwOnboardInfoActivity(ndidIdpShareSuccessActivity3));
                    break;
                } else if (obj2 instanceof MwShopAddressActivity) {
                    MediaBrowserCompat$CustomActionResultReceiver(this, mailingAddressReviewOTPActivity, (MwShopAddressActivity) obj2);
                    break;
                } else if (obj2 != MwReviewActivity_ViewBinding.MediaBrowserCompat$ItemReceiver && !(obj2 instanceof WalletAdapter$WalletHolder)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("enqueueSend returned ");
                    sb.append(obj2);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            Object write2 = write(e);
            if (write2 == MwReviewActivity_ViewBinding.IconCompatParcelizer) {
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                mailingAddressReviewOTPActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(hmlVerifyPhoneValidateOtpActivity));
                break;
            } else if (write2 != MwReviewActivity_ViewBinding.write) {
                if (write2 instanceof MwShopAddressActivity) {
                    MediaBrowserCompat$CustomActionResultReceiver(this, mailingAddressReviewOTPActivity, (MwShopAddressActivity) write2);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("offerInternal returned ");
                    sb2.append(write2);
                    throw new IllegalStateException(sb2.toString().toString());
                }
            }
        }
        Object MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver4 == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
        }
        return MediaBrowserCompat$CustomActionResultReceiver4 == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED ? MediaBrowserCompat$CustomActionResultReceiver4 : HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean read(E e) {
        Object write2 = write(e);
        if (write2 == MwReviewActivity_ViewBinding.IconCompatParcelizer) {
            return true;
        }
        if (write2 == MwReviewActivity_ViewBinding.write) {
            MwShopAddressActivity<?> RatingCompat = RatingCompat();
            if (RatingCompat == null) {
                return false;
            }
            MediaBrowserCompat$CustomActionResultReceiver(RatingCompat);
            Throwable th = RatingCompat.read;
            if (th == null) {
                th = new ClosedSendChannelException("Channel was closed");
            }
            throw NdidSelectIdpActivity.read(th);
        } else if (write2 instanceof MwShopAddressActivity) {
            MwShopAddressActivity mwShopAddressActivity = (MwShopAddressActivity) write2;
            MediaBrowserCompat$CustomActionResultReceiver(mwShopAddressActivity);
            Throwable th2 = mwShopAddressActivity.read;
            if (th2 == null) {
                th2 = new ClosedSendChannelException("Channel was closed");
            }
            throw NdidSelectIdpActivity.read(th2);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("offerInternal returned ");
            sb.append(write2);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public boolean write(Throwable th) {
        boolean z;
        Object obj;
        MwShopAddressActivity mwShopAddressActivity = new MwShopAddressActivity(th);
        onReturnHomeButtonClick onreturnhomebuttonclick = this.MediaBrowserCompat$CustomActionResultReceiver;
        while (true) {
            Object MediaMetadataCompat = onreturnhomebuttonclick.MediaMetadataCompat();
            if (MediaMetadataCompat != null) {
                NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) MediaMetadataCompat;
                if (!(ndidIdpShareSuccessActivity instanceof MwShopAddressActivity)) {
                    if (ndidIdpShareSuccessActivity.read(mwShopAddressActivity, onreturnhomebuttonclick)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
        if (!z) {
            NdidIdpShareSuccessActivity write2 = NationalIdCameraActivity_ViewBinding.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat());
            if (write2 != null) {
                mwShopAddressActivity = (MwShopAddressActivity) write2;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.Closed<*>");
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver(mwShopAddressActivity);
        if (z && (obj = this.onCloseHandler) != null && obj != MwReviewActivity_ViewBinding.read && write.compareAndSet(this, obj, MwReviewActivity_ViewBinding.read)) {
            ((FundFactSheetActivity) onAddAccountClick.MediaBrowserCompat$ItemReceiver(obj, 1)).invoke(th);
        }
        return z;
    }

    public final void write(FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "handler");
        if (!write.compareAndSet(this, (Object) null, fundFactSheetActivity)) {
            Object obj = this.onCloseHandler;
            if (obj == MwReviewActivity_ViewBinding.read) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Another handler was already registered: ");
            sb.append(obj);
            throw new IllegalStateException(sb.toString());
        }
        MwShopAddressActivity<?> RatingCompat = RatingCompat();
        if (RatingCompat != null && write.compareAndSet(this, fundFactSheetActivity, MwReviewActivity_ViewBinding.read)) {
            fundFactSheetActivity.invoke(RatingCompat.read);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p040o.MwShopTypeActivity_ViewBinding<E> MediaMetadataCompat() {
        /*
            r3 = this;
            o.onReturnHomeButtonClick r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0002:
            java.lang.Object r1 = r0._next
            boolean r2 = r1 instanceof p040o.BaseNtbInstructionActivity
            if (r2 != 0) goto L_0x0034
            if (r1 == 0) goto L_0x002c
            o.NdidIdpShareSuccessActivity r1 = (p040o.NdidIdpShareSuccessActivity) r1
            r2 = r0
            o.NdidIdpShareSuccessActivity r2 = (p040o.NdidIdpShareSuccessActivity) r2
            if (r1 != r2) goto L_0x0012
            goto L_0x0028
        L_0x0012:
            boolean r2 = r1 instanceof p040o.MwShopTypeActivity_ViewBinding
            if (r2 == 0) goto L_0x0028
            r2 = r1
            o.MwShopTypeActivity_ViewBinding r2 = (p040o.MwShopTypeActivity_ViewBinding) r2
            boolean r2 = r2 instanceof p040o.MwShopAddressActivity
            if (r2 != 0) goto L_0x0029
            boolean r2 = r1.aU_()
            if (r2 == 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            r1.RatingCompat()
            goto L_0x0002
        L_0x0028:
            r1 = 0
        L_0x0029:
            o.MwShopTypeActivity_ViewBinding r1 = (p040o.MwShopTypeActivity_ViewBinding) r1
            return r1
        L_0x002c:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
            r0.<init>(r1)
            throw r0
        L_0x0034:
            o.BaseNtbInstructionActivity r1 = (p040o.BaseNtbInstructionActivity) r1
            r1.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Object) r0)
            goto L_0x0002
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.MwReviewActivity.MediaMetadataCompat():o.MwShopTypeActivity_ViewBinding");
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('@');
        onGetStartedClick.write((Object) this, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(this));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        sb.append('{');
        NdidIdpShareSuccessActivity MediaBrowserCompat$MediaItem = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem();
        if (MediaBrowserCompat$MediaItem == this.MediaBrowserCompat$CustomActionResultReceiver) {
            str = "EmptyQueue";
        } else {
            if (MediaBrowserCompat$MediaItem instanceof MwShopAddressActivity) {
                str2 = MediaBrowserCompat$MediaItem.toString();
            } else if (MediaBrowserCompat$MediaItem instanceof WalletAdapter$WalletHolder) {
                str2 = "ReceiveQueued";
            } else if (MediaBrowserCompat$MediaItem instanceof MwTermsAndConditionsActivity) {
                str2 = "SendQueued";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UNEXPECTED:");
                sb2.append(MediaBrowserCompat$MediaItem);
                str2 = sb2.toString();
            }
            NdidIdpShareSuccessActivity write2 = NationalIdCameraActivity_ViewBinding.write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat());
            if (write2 != MediaBrowserCompat$MediaItem) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str2);
                sb3.append(",queueSize=");
                sb3.append(write());
                str = sb3.toString();
                if (write2 instanceof MwShopAddressActivity) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(",closedForSend=");
                    sb4.append(write2);
                    str = sb4.toString();
                }
            } else {
                str = str2;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(MediaBrowserCompat$MediaItem());
        return sb.toString();
    }

    private final int write() {
        Object obj;
        Object obj2;
        onReturnHomeButtonClick onreturnhomebuttonclick = this.MediaBrowserCompat$CustomActionResultReceiver;
        while (true) {
            obj = onreturnhomebuttonclick._next;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) onreturnhomebuttonclick);
        }
        if (obj != null) {
            NdidIdpShareSuccessActivity ndidIdpShareSuccessActivity = (NdidIdpShareSuccessActivity) obj;
            int i = 0;
            while (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ndidIdpShareSuccessActivity, (Object) onreturnhomebuttonclick)) {
                if (ndidIdpShareSuccessActivity instanceof NdidIdpShareSuccessActivity) {
                    i++;
                }
                while (true) {
                    obj2 = ndidIdpShareSuccessActivity._next;
                    if (!(obj2 instanceof BaseNtbInstructionActivity)) {
                        break;
                    }
                    ((BaseNtbInstructionActivity) obj2).MediaBrowserCompat$CustomActionResultReceiver((Object) ndidIdpShareSuccessActivity);
                }
                ndidIdpShareSuccessActivity = NationalIdCameraActivity_ViewBinding.write(obj2);
            }
            return i;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: o.MwReviewActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer<E> extends MwTermsAndConditionsActivity {
        private E IconCompatParcelizer;

        public final void MediaBrowserCompat$ItemReceiver(MwShopAddressActivity<?> mwShopAddressActivity) {
            onGetStartedClick.write((Object) mwShopAddressActivity, "closed");
        }

        public final void write() {
        }

        public IconCompatParcelizer(E e) {
            this.IconCompatParcelizer = e;
        }

        public final Object MediaBrowserCompat$CustomActionResultReceiver() {
            return this.IconCompatParcelizer;
        }

        public final EkycOtpActivity IconCompatParcelizer(NdidIdpShareSuccessActivity.write write) {
            EkycOtpActivity ekycOtpActivity = MailingAddressLandingActivity.write;
            if (write != null) {
                write.MediaBrowserCompat$CustomActionResultReceiver.read(write);
            }
            return ekycOtpActivity;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("SendBuffered@");
            onGetStartedClick.write((Object) this, "$this$hexAddress");
            String hexString = Integer.toHexString(System.identityHashCode(this));
            onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
            sb.append(hexString);
            sb.append('(');
            sb.append(this.IconCompatParcelizer);
            sb.append(')');
            return sb.toString();
        }
    }

    private static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(MwReviewActivity mwReviewActivity, HmlNTBPromptPayNotFoundActivity hmlNTBPromptPayNotFoundActivity, MwShopAddressActivity mwShopAddressActivity) {
        mwReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(mwShopAddressActivity);
        Throwable th = mwShopAddressActivity.read;
        if (th == null) {
            th = new ClosedSendChannelException("Channel was closed");
        }
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) th, "exception");
        hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(MwShopAddressActivity<?> mwShopAddressActivity) {
        Object obj = null;
        while (true) {
            NdidIdpShareSuccessActivity write2 = NationalIdCameraActivity_ViewBinding.write(mwShopAddressActivity.MediaMetadataCompat());
            if (!(write2 instanceof WalletAdapter$WalletHolder)) {
                write2 = null;
            }
            WalletAdapter$WalletHolder walletAdapter$WalletHolder = (WalletAdapter$WalletHolder) write2;
            if (walletAdapter$WalletHolder == null) {
                break;
            } else if (!walletAdapter$WalletHolder.aU_()) {
                walletAdapter$WalletHolder.MediaDescriptionCompat();
            } else {
                obj = NdidIdpVerificationActivity.MediaBrowserCompat$ItemReceiver(obj, walletAdapter$WalletHolder);
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                ((WalletAdapter$WalletHolder) obj).write(mwShopAddressActivity);
            } else if (obj != null) {
                ArrayList arrayList = (ArrayList) obj;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((WalletAdapter$WalletHolder) arrayList.get(size)).write(mwShopAddressActivity);
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
            }
        }
        MediaBrowserCompat$ItemReceiver((NdidIdpShareSuccessActivity) mwShopAddressActivity);
    }
}

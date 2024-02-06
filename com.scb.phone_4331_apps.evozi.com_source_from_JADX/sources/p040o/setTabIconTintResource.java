package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.emailverification.EmailMeVerificationCodeUseCase;
import p040o.ILocationSourceDelegate;
import p040o.zzfy;

/* renamed from: o.setTabIconTintResource */
public final class setTabIconTintResource extends IndoorBuilding {
    final getAncestor MediaBrowserCompat$CustomActionResultReceiver;
    final refreshIfEmpty MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.setTabIconTintResource$IconCompatParcelizer */
    static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<Throwable, DebitCardResetPinSuccessActivity_ViewBinding<? extends zzfy.zze>> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object write(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            if (th instanceof RetrofitException) {
                ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate, "throwable.response");
                ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                onGetStartedClick.IconCompatParcelizer((Object) zza, "throwable.response.error");
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "3017", (Object) zza.IconCompatParcelizer)) {
                    return DebitCardResetOtpActivity.error((Throwable) new EmailMeVerificationCodeUseCase.EmailVerificationCodeNotSendException());
                }
            }
            return DebitCardResetOtpActivity.error(th);
        }
    }

    /* renamed from: o.setTabIconTintResource$read */
    static final class read<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
        private /* synthetic */ setTabIconTintResource MediaBrowserCompat$CustomActionResultReceiver;

        read(setTabIconTintResource settabicontintresource) {
            this.MediaBrowserCompat$CustomActionResultReceiver = settabicontintresource;
        }

        public final /* synthetic */ Object write(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "applicationUuid");
            return new FriendsLandingActivity_ViewBinding(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(str));
        }
    }

    /* renamed from: o.setTabIconTintResource$write */
    static final class write<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
        private /* synthetic */ setTabIconTintResource write;

        write(setTabIconTintResource settabicontintresource) {
            this.write = settabicontintresource;
        }

        public final /* bridge */ /* synthetic */ Object write(Object obj) {
            String str = (String) obj;
            onGetStartedClick.write((Object) str, "applicationUuid");
            return this.write.MediaBrowserCompat$CustomActionResultReceiver.write(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setTabIconTintResource(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor, refreshIfEmpty refreshifempty) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
        onGetStartedClick.write((Object) refreshifempty, "hmlBusinessOwnerRepositoryContractor");
        this.MediaBrowserCompat$CustomActionResultReceiver = getancestor;
        this.MediaBrowserCompat$ItemReceiver = refreshifempty;
    }

    public final DebitCardResetOtpActivity<zzfy.zze> MediaBrowserCompat$CustomActionResultReceiver() {
        NTBLandingActivity_ViewBinding nTBLandingActivity_ViewBinding;
        if (setTabGravity.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver().ordinal()] != 1) {
            BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            DirectDebitDeepLinkActivity write2 = new write(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(write2, "mapper is null");
            nTBLandingActivity_ViewBinding = new NTBLandingActivity_ViewBinding(IconCompatParcelizer2, write2);
        } else {
            BScanCNotificationDeepLinkActivity<String> IconCompatParcelizer3 = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            DirectDebitDeepLinkActivity read2 = new read(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
            nTBLandingActivity_ViewBinding = new NTBLandingActivity_ViewBinding(IconCompatParcelizer3, read2);
        }
        DebitCardResetOtpActivity<zzfy.zze> onErrorResumeNext = nTBLandingActivity_ViewBinding.onErrorResumeNext(IconCompatParcelizer.write);
        onGetStartedClick.IconCompatParcelizer((Object) onErrorResumeNext, "when (hmlBusinessOwnerRe…      }\n                }");
        write(onErrorResumeNext);
        return onErrorResumeNext;
    }
}

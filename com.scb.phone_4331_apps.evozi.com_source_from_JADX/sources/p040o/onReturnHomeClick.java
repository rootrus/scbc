package p040o;

import java.util.concurrent.CancellationException;
import kotlin.TypeCastException;
import p040o.HmlVerifyIdentifyActivity;
import p040o.lambda$new$0;

/* renamed from: o.onReturnHomeClick */
public abstract class onReturnHomeClick<T> extends lambda$new$0.NationalIdActivity {
    public int MediaDescriptionCompat;

    public void IconCompatParcelizer(Object obj, Throwable th) {
        onGetStartedClick.write((Object) th, "cause");
    }

    public abstract Object MediaBrowserCompat$ItemReceiver();

    public <T> T read(Object obj) {
        return obj;
    }

    public abstract HmlNTBPromptPayNotFoundActivity<T> write();

    public onReturnHomeClick(int i) {
        this.MediaDescriptionCompat = i;
    }

    public final void run() {
        Object obj;
        HmlPromptPayVerificationActivity context;
        Object MediaBrowserCompat$ItemReceiver;
        Object obj2;
        NationalIdActivity_ViewBinding nationalIdActivity_ViewBinding = this.MediaBrowserCompat$SearchResultReceiver;
        try {
            HmlNTBPromptPayNotFoundActivity write = write();
            if (write != null) {
                saveSlipButton saveslipbutton = (saveSlipButton) write;
                HmlNTBPromptPayNotFoundActivity<T> hmlNTBPromptPayNotFoundActivity = saveslipbutton.MediaBrowserCompat$ItemReceiver;
                context = hmlNTBPromptPayNotFoundActivity.getContext();
                Object MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver();
                MediaBrowserCompat$ItemReceiver = EkycSuccessActivity.MediaBrowserCompat$ItemReceiver(context, saveslipbutton.write);
                MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) (!(MediaBrowserCompat$ItemReceiver2 instanceof MerchantWalletDetailActivity_ViewBinding) ? null : MediaBrowserCompat$ItemReceiver2);
                Throwable th = merchantWalletDetailActivity_ViewBinding != null ? merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer : null;
                boolean z = true;
                if (this.MediaDescriptionCompat != 1) {
                    z = false;
                }
                clickManagePin clickmanagepin = z ? (clickManagePin) context.IconCompatParcelizer(clickManagePin.write) : null;
                if (th == null && clickmanagepin != null && !clickmanagepin.write()) {
                    CancellationException MediaDescriptionCompat2 = clickmanagepin.MediaDescriptionCompat();
                    IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, MediaDescriptionCompat2);
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    Throwable MediaBrowserCompat$CustomActionResultReceiver = NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaDescriptionCompat2, hmlNTBPromptPayNotFoundActivity);
                    onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "exception");
                    hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(MediaBrowserCompat$CustomActionResultReceiver)));
                } else if (th != null) {
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    onGetStartedClick.write((Object) th, "exception");
                    hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
                } else {
                    Object read = read(MediaBrowserCompat$ItemReceiver2);
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer3 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(read));
                }
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
                EkycSuccessActivity.IconCompatParcelizer(context, MediaBrowserCompat$ItemReceiver);
                try {
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer4 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    nationalIdActivity_ViewBinding.read();
                    obj2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
                } catch (Throwable th2) {
                    HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer5 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                    onGetStartedClick.write((Object) th2, "exception");
                    obj2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th2));
                }
                MediaBrowserCompat$CustomActionResultReceiver((Throwable) null, HmlVerifyIdentifyActivity.IconCompatParcelizer(obj2));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.DispatchedContinuation<T>");
        } catch (Throwable th3) {
            try {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer6 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                nationalIdActivity_ViewBinding.read();
                obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th4) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer7 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                onGetStartedClick.write((Object) th4, "exception");
                obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th4));
            }
            MediaBrowserCompat$CustomActionResultReceiver(th3, HmlVerifyIdentifyActivity.IconCompatParcelizer(obj));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                onGetStartedClick.write((Object) th, "$this$addSuppressed");
                onGetStartedClick.write((Object) th2, "exception");
                InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fatal exception in coroutines machinery for ");
            sb.append(this);
            sb.append(". ");
            sb.append("Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
            String obj = sb.toString();
            if (th == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(write().getContext(), (Throwable) new InvestmentDetailsActivity(obj, th));
        }
    }
}

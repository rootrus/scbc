package p040o;

import p040o.onDoneNicknameClick;

/* renamed from: o.onDoneNicknameClick$MediaBrowserCompat$CustomActionResultReceiver */
final class C7320x3b5ad206<T> extends MailingAddressReviewActivity<T> {
    private final onDoneNicknameClick MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public final String read() {
        return "AwaitContinuation";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C7320x3b5ad206(HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity, onDoneNicknameClick ondonenicknameclick) {
        super(hmlNTBPromptPayNotFoundActivity, 1);
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "delegate");
        onGetStartedClick.write((Object) ondonenicknameclick, "job");
        this.MediaBrowserCompat$ItemReceiver = ondonenicknameclick;
    }

    public final Throwable IconCompatParcelizer(clickManagePin clickmanagepin) {
        Object obj;
        Throwable th;
        onGetStartedClick.write((Object) clickmanagepin, "parent");
        onDoneNicknameClick ondonenicknameclick = this.MediaBrowserCompat$ItemReceiver;
        while (true) {
            obj = ondonenicknameclick._state;
            if (!(obj instanceof BaseNtbInstructionActivity)) {
                break;
            }
            ((BaseNtbInstructionActivity) obj).MediaBrowserCompat$CustomActionResultReceiver((Object) ondonenicknameclick);
        }
        if ((obj instanceof onDoneNicknameClick.IconCompatParcelizer) && (th = (Throwable) ((onDoneNicknameClick.IconCompatParcelizer) obj)._rootCause) != null) {
            return th;
        }
        if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            return ((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer;
        }
        return clickmanagepin.MediaDescriptionCompat();
    }
}

package p040o;

/* renamed from: o.SmeLoanDetailActivity_ViewBinding */
public abstract class SmeLoanDetailActivity_ViewBinding<T> extends onDoneNicknameClick implements HmlNTBPromptPayNotFoundActivity<T>, MwCasaOtpActivity {
    public HmlPromptPayVerificationActivity IconCompatParcelizer;
    private final HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver;

    /* access modifiers changed from: protected */
    public void MediaBrowserCompat$MediaItem() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SmeLoanDetailActivity_ViewBinding(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, boolean z) {
        super(z);
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "parentContext");
        this.IconCompatParcelizer = hmlPromptPayVerificationActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlPromptPayVerificationActivity.MediaBrowserCompat$ItemReceiver(this);
    }

    public final HmlPromptPayVerificationActivity getContext() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final HmlPromptPayVerificationActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final boolean write() {
        return super.write();
    }

    public final void MediaMetadataCompat() {
        MediaBrowserCompat$MediaItem();
    }

    /* access modifiers changed from: protected */
    public final String read() {
        StringBuilder sb = new StringBuilder();
        onGetStartedClick.write((Object) this, "$this$classSimpleName");
        String simpleName = getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append(" was cancelled");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void write(Object obj) {
        if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) obj;
            Throwable th = merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer;
            int i = merchantWalletDetailActivity_ViewBinding._handled;
            onGetStartedClick.write((Object) th, "cause");
        }
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(Object obj) {
        read(obj);
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "exception");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, th);
    }

    public String IconCompatParcelizer() {
        String read = onChoosePhotoClick.read(this.MediaBrowserCompat$ItemReceiver);
        if (read == null) {
            return super.IconCompatParcelizer();
        }
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append(read);
        sb.append("\":");
        sb.append(super.IconCompatParcelizer());
        return sb.toString();
    }

    public final void resumeWith(Object obj) {
        Throwable IconCompatParcelizer2 = HmlVerifyIdentifyActivity.IconCompatParcelizer(obj);
        if (IconCompatParcelizer2 != null) {
            obj = new MerchantWalletDetailActivity_ViewBinding(IconCompatParcelizer2);
        }
        Object MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(obj);
        if (MediaBrowserCompat$CustomActionResultReceiver != MwOnBoardSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver) {
            IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final <R> void MediaBrowserCompat$ItemReceiver(onDeleteClick ondeleteclick, R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity) {
        onGetStartedClick.write((Object) ondeleteclick, "start");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        MediaBrowserCompat$CustomActionResultReceiver((clickManagePin) this.IconCompatParcelizer.IconCompatParcelizer(clickManagePin.write));
        ondeleteclick.read(baseDiscoverFundFilterActivity, r, this);
    }
}

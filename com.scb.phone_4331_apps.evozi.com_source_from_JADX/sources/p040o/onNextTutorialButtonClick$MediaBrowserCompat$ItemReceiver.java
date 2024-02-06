package p040o;

/* renamed from: o.onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver */
public final class onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver implements ReviewSuccessfulActivity<R> {
    /* access modifiers changed from: private */
    public R IconCompatParcelizer;
    final /* synthetic */ FundFactSheetActivity MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ ReviewSuccessfulActivity read;

    public onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver(ReviewSuccessfulActivity<T> reviewSuccessfulActivity, FundFactSheetActivity fundFactSheetActivity) {
        this.read = reviewSuccessfulActivity;
        this.MediaBrowserCompat$ItemReceiver = fundFactSheetActivity;
    }

    public final /* synthetic */ ReviewSuccessfulActivity read(FundFactSheetActivity fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "next");
        onNextTutorialButtonClick$MediaBrowserCompat$ItemReceiver onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver = this;
        this.read.read(new C7324x5a8da09e(onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver, this, fundFactSheetActivity));
        return onnexttutorialbuttonclick_mediabrowsercompat_itemreceiver;
    }

    public final void IconCompatParcelizer() {
        this.read.IconCompatParcelizer();
    }

    public final R MediaBrowserCompat$CustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }
}

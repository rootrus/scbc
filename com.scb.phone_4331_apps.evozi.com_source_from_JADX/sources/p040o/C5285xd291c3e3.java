package p040o;

import p040o.zzct;

/* renamed from: o.setCradleVerticalOffset$MediaBrowserCompat$CustomActionResultReceiver */
final class C5285xd291c3e3<T, R> implements DirectDebitDeepLinkActivity<T, DebitCardResetPinSuccessActivity_ViewBinding<? extends R>> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ setCradleVerticalOffset MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;
    private /* synthetic */ boolean write;

    C5285xd291c3e3(setCradleVerticalOffset setcradleverticaloffset, String str, String str2, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = setcradleverticaloffset;
        this.read = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.write = z;
    }

    public final /* synthetic */ Object write(Object obj) {
        RtpInputDeepLinkActivity rtpInputDeepLinkActivity;
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        if (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver() == zzct.zza.CONSUMER) {
            DebitCardCoachMarkActivity write2 = this.MediaBrowserCompat$ItemReceiver.write.write(this.read, this.MediaBrowserCompat$CustomActionResultReceiver, str, this.write);
            if (write2 instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
                return ((HmlLatestLoanOfferStatusDeepLinkActivity) write2).MediaBrowserCompat$CustomActionResultReceiver();
            }
            rtpInputDeepLinkActivity = new RtpInputDeepLinkActivity(write2);
        } else {
            DebitCardCoachMarkActivity read2 = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.read("NCB_CONSENT", str, this.write);
            if (read2 instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
                return ((HmlLatestLoanOfferStatusDeepLinkActivity) read2).MediaBrowserCompat$CustomActionResultReceiver();
            }
            rtpInputDeepLinkActivity = new RtpInputDeepLinkActivity(read2);
        }
        return rtpInputDeepLinkActivity;
    }
}

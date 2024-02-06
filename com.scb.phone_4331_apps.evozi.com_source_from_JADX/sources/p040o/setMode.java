package p040o;

import p040o.LocalProjectProvider;

/* renamed from: o.setMode */
public final class setMode extends IndoorBuilding {
    private LocalProjectProvider.C69353 IconCompatParcelizer;
    private C7515tZ MediaBrowserCompat$CustomActionResultReceiver;
    private LocalProjectProvider read;
    public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver write;

    @HmlPinActivity
    public setMode(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, C7515tZ tZVar, LocalProjectProvider localProjectProvider, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, LocalProjectProvider.C69353 r6) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.MediaBrowserCompat$CustomActionResultReceiver = tZVar;
        this.read = localProjectProvider;
        this.write = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        this.IconCompatParcelizer = r6;
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        return write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str, str2));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return write(this.read.MediaBrowserCompat$ItemReceiver(str));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(runCleanup runcleanup) {
        return write(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(runcleanup));
    }
}

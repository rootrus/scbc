package p040o;

import p040o.LocalProjectProvider;
import p040o.zzca;

/* renamed from: o.detectFacesImageByteBufferJni */
public final class detectFacesImageByteBufferJni extends IndoorBuilding {
    private final LocalProjectProvider.C6940b read;
    final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver write;

    @HmlPinActivity
    public detectFacesImageByteBufferJni(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C6940b bVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.read = bVar;
        this.write = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final DebitCardResetOtpActivity<zzca.zzd> IconCompatParcelizer(recordLockedRead recordlockedread) {
        return write(this.read.MediaBrowserCompat$CustomActionResultReceiver(recordlockedread).doOnNext(new setProminentFaceOnly(this)));
    }

    public final DebitCardResetOtpActivity<zzca.zzd> MediaBrowserCompat$CustomActionResultReceiver(recordLockedRead recordlockedread, String str, String str2) {
        return write(this.read.MediaBrowserCompat$ItemReceiver(recordlockedread, str, str2).doOnNext(new setProminentFaceOnly(this)));
    }
}

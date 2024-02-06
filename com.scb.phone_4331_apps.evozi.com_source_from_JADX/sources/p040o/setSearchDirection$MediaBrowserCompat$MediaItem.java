package p040o;

import p040o.ExecutorUtils;
import p040o.writeUInt64NoTag;

/* renamed from: o.setSearchDirection$MediaBrowserCompat$MediaItem */
public final class setSearchDirection$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
    private /* synthetic */ ExecutorUtils.C33371 MediaBrowserCompat$CustomActionResultReceiver;

    public setSearchDirection$MediaBrowserCompat$MediaItem(ExecutorUtils.C33371 r1) {
        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String ParcelableVolumeInfo = this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo();
        onGetStartedClick.IconCompatParcelizer((Object) ParcelableVolumeInfo, "switchVerificationDisplay.transactionDate");
        ((newCheckParameters) obj).RatingCompat(ParcelableVolumeInfo);
    }
}

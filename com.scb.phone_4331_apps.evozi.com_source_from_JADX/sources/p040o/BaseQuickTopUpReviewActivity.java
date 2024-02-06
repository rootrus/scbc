package p040o;

/* renamed from: o.BaseQuickTopUpReviewActivity */
final class BaseQuickTopUpReviewActivity {
    int IconCompatParcelizer;
    final byte[] MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    boolean MediaDescriptionCompat;
    int MediaMetadataCompat;
    BaseQuickTopUpReviewActivity read;
    BaseQuickTopUpReviewActivity write;

    BaseQuickTopUpReviewActivity() {
        this.MediaBrowserCompat$CustomActionResultReceiver = new byte[2048];
        this.MediaBrowserCompat$ItemReceiver = true;
        this.MediaDescriptionCompat = false;
    }

    BaseQuickTopUpReviewActivity(BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity) {
        this(baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.MediaMetadataCompat, baseQuickTopUpReviewActivity.IconCompatParcelizer);
        baseQuickTopUpReviewActivity.MediaDescriptionCompat = true;
    }

    private BaseQuickTopUpReviewActivity(byte[] bArr, int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr;
        this.MediaMetadataCompat = i;
        this.IconCompatParcelizer = i2;
        this.MediaBrowserCompat$ItemReceiver = false;
        this.MediaDescriptionCompat = true;
    }

    public final BaseQuickTopUpReviewActivity MediaBrowserCompat$CustomActionResultReceiver() {
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = this.read;
        if (baseQuickTopUpReviewActivity == this) {
            baseQuickTopUpReviewActivity = null;
        }
        BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity2 = this.write;
        baseQuickTopUpReviewActivity2.read = this.read;
        this.read.write = baseQuickTopUpReviewActivity2;
        this.read = null;
        this.write = null;
        return baseQuickTopUpReviewActivity;
    }

    public final void read(BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity, int i) {
        if (baseQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver) {
            int i2 = baseQuickTopUpReviewActivity.IconCompatParcelizer;
            int i3 = i2 + i;
            if (i3 > 2048) {
                if (!baseQuickTopUpReviewActivity.MediaDescriptionCompat) {
                    int i4 = baseQuickTopUpReviewActivity.MediaMetadataCompat;
                    if (i3 - i4 <= 2048) {
                        byte[] bArr = baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        baseQuickTopUpReviewActivity.IconCompatParcelizer -= baseQuickTopUpReviewActivity.MediaMetadataCompat;
                        baseQuickTopUpReviewActivity.MediaMetadataCompat = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaMetadataCompat, baseQuickTopUpReviewActivity.MediaBrowserCompat$CustomActionResultReceiver, baseQuickTopUpReviewActivity.IconCompatParcelizer, i);
            baseQuickTopUpReviewActivity.IconCompatParcelizer += i;
            this.MediaMetadataCompat += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}

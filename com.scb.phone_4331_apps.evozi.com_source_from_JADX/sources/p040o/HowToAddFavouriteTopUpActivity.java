package p040o;

/* renamed from: o.HowToAddFavouriteTopUpActivity */
final class HowToAddFavouriteTopUpActivity {
    private static BaseQuickTopUpReviewActivity MediaBrowserCompat$ItemReceiver;
    private static long read;

    private HowToAddFavouriteTopUpActivity() {
    }

    static BaseQuickTopUpReviewActivity MediaBrowserCompat$ItemReceiver() {
        synchronized (HowToAddFavouriteTopUpActivity.class) {
            if (MediaBrowserCompat$ItemReceiver == null) {
                return new BaseQuickTopUpReviewActivity();
            }
            BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity = MediaBrowserCompat$ItemReceiver;
            MediaBrowserCompat$ItemReceiver = baseQuickTopUpReviewActivity.read;
            baseQuickTopUpReviewActivity.read = null;
            read -= 2048;
            return baseQuickTopUpReviewActivity;
        }
    }

    static void IconCompatParcelizer(BaseQuickTopUpReviewActivity baseQuickTopUpReviewActivity) {
        if (baseQuickTopUpReviewActivity.read != null || baseQuickTopUpReviewActivity.write != null) {
            throw new IllegalArgumentException();
        } else if (!baseQuickTopUpReviewActivity.MediaDescriptionCompat) {
            synchronized (HowToAddFavouriteTopUpActivity.class) {
                if (read + 2048 <= 65536) {
                    read += 2048;
                    baseQuickTopUpReviewActivity.read = MediaBrowserCompat$ItemReceiver;
                    baseQuickTopUpReviewActivity.IconCompatParcelizer = 0;
                    baseQuickTopUpReviewActivity.MediaMetadataCompat = 0;
                    MediaBrowserCompat$ItemReceiver = baseQuickTopUpReviewActivity;
                }
            }
        }
    }
}

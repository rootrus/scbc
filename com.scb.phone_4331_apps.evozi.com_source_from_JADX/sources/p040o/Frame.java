package p040o;

import p040o.LocalProjectProvider;

/* renamed from: o.Frame */
public final class Frame extends frequency<Boolean, read> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public Frame(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final subMap submap) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<read, BScanCNotificationDeepLinkActivity<Boolean>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                read read = (read) obj;
                onGetStartedClick.write((Object) read, "param");
                return submap.write(read.MediaBrowserCompat$ItemReceiver, read.write);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) submap, "easycashRepositoryContractor");
    }

    /* renamed from: o.Frame$read */
    public static final class read implements C4602xca7af99c {
        final String MediaBrowserCompat$ItemReceiver;
        final String write;

        public read(String str, String str2) {
            onGetStartedClick.write((Object) str, "productType");
            onGetStartedClick.write((Object) str2, "flowType");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = str2;
        }
    }

    /* renamed from: o.Frame$Metadata */
    public final class Metadata extends IndoorBuilding {
        private final LocalProjectProvider.C69375 write;

        @HmlPinActivity
        public Metadata(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.write = r3;
        }

        public final void read(String str) {
            write(this.write.MediaBrowserCompat$MediaItem(str));
        }

        public final void IconCompatParcelizer() {
            write(this.write.MediaBrowserCompat$MediaItem());
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
            write(this.write.RatingCompat(str));
        }
    }

    /* renamed from: o.Frame$Builder */
    public final class Builder extends IndoorBuilding {
        public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        private final LocalProjectProvider.C69375 read;

        @HmlPinActivity
        public Builder(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, LocalProjectProvider.C69375 r3, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.read = r3;
            this.IconCompatParcelizer = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        }

        public final DebitCardResetOtpActivity read() {
            return write(this.read.MediaBrowserCompat$CustomActionResultReceiver().map(getCameraFacing.write));
        }
    }
}

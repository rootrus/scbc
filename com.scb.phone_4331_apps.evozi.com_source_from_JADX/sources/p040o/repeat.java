package p040o;

/* renamed from: o.repeat */
public final class repeat extends frequency<getCompassEnabled, IconCompatParcelizer> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public repeat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<IconCompatParcelizer, BScanCNotificationDeepLinkActivity<getCompassEnabled>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                onGetStartedClick.write((Object) iconCompatParcelizer, "params");
                BScanCNotificationDeepLinkActivity<getCompassEnabled> read = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver.read(iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
                onGetStartedClick.IconCompatParcelizer((Object) read, "repo.allowAddDevice(params.otp, params.tokenUuid)");
                return read;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, "repo");
    }

    /* renamed from: o.repeat$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C4602xca7af99c {
        final String IconCompatParcelizer;
        final String MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Params(otp=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", tokenUuid=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(String str, String str2) {
            onGetStartedClick.write((Object) str, "otp");
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }
    }
}

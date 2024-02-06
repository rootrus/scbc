package p040o;

/* renamed from: o.nullToEmpty */
public final class nullToEmpty extends frequency<Boolean, IconCompatParcelizer> {
    public final C6548x820c5aab MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public nullToEmpty(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<IconCompatParcelizer, BScanCNotificationDeepLinkActivity<Boolean>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                onGetStartedClick.write((Object) iconCompatParcelizer, "params");
                BScanCNotificationDeepLinkActivity<Boolean> MediaBrowserCompat$ItemReceiver = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer.IconCompatParcelizer, iconCompatParcelizer.read);
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "repo.allowRegister(params.otp, params.tokenUuid)");
                return MediaBrowserCompat$ItemReceiver;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, "repo");
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, "registrationRepo");
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: o.nullToEmpty$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C4602xca7af99c {
        final String IconCompatParcelizer;
        final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconCompatParcelizer)) {
                return false;
            }
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) iconCompatParcelizer.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) iconCompatParcelizer.read);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
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
            sb.append(this.read);
            sb.append(")");
            return sb.toString();
        }

        public IconCompatParcelizer(String str, String str2) {
            onGetStartedClick.write((Object) str, "otp");
            this.IconCompatParcelizer = str;
            this.read = str2;
        }
    }
}

package p040o;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.ImmutableSet;
import p040o.Iterables;

/* renamed from: o.startFinalizer */
public final class startFinalizer extends any<IconCompatParcelizer> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public startFinalizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2, final C6548x820c5aab fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<IconCompatParcelizer, DebitCardCoachMarkActivity>() {
            public final /* synthetic */ Object invoke(Object obj) {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
                onGetStartedClick.write((Object) iconCompatParcelizer, "params");
                onGetStartedClick.write((Object) "jpg", "text");
                RequestBody create = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), "jpg");
                MultipartBody.Part MediaBrowserCompat$ItemReceiver = Iterables.C351810.MediaBrowserCompat$ItemReceiver("imageData", iconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
                String valueOf = String.valueOf(iconCompatParcelizer.read);
                onGetStartedClick.write((Object) valueOf, "text");
                RequestBody create2 = RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf);
                String valueOf2 = String.valueOf(iconCompatParcelizer.write);
                onGetStartedClick.write((Object) valueOf2, "text");
                RemittanceTransactionsDeepLinkActivity remittanceTransactionsDeepLinkActivity = new RemittanceTransactionsDeepLinkActivity(fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new ImmutableSet.TransformedImmutableSet(create, MediaBrowserCompat$ItemReceiver, RequestBody.Companion.create(MediaType.Companion.parse("text/plain"), valueOf2), create2, iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer.IconCompatParcelizer)));
                onGetStartedClick.IconCompatParcelizer((Object) remittanceTransactionsDeepLinkActivity, "repository.verifyByFace(request).toCompletable()");
                return remittanceTransactionsDeepLinkActivity;
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) fragmentBuilder_BindHmlDocumentCropTutorialFragment$MediaBrowserCompat$ItemReceiver, "repository");
    }

    /* renamed from: o.startFinalizer$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements C4602xca7af99c {
        final String IconCompatParcelizer;
        final String MediaBrowserCompat$CustomActionResultReceiver;
        final String MediaBrowserCompat$ItemReceiver;
        final int read;
        final int write;

        public IconCompatParcelizer(String str, int i, int i2, String str2, String str3) {
            onGetStartedClick.write((Object) str, "imagePath");
            onGetStartedClick.write((Object) str2, "imageHash");
            onGetStartedClick.write((Object) str3, "timestamp");
            this.MediaBrowserCompat$ItemReceiver = str;
            this.write = i;
            this.read = i2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.IconCompatParcelizer = str3;
        }
    }
}

package p040o;

import p040o.ImmutableCollection;

/* renamed from: o.precomputeCharMatcher */
public final class precomputeCharMatcher extends frequency<onCameraChange, read> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public precomputeCharMatcher(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, final getDelegateListIterator getdelegatelistiterator) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2, new FundFactSheetActivity<read, BScanCNotificationDeepLinkActivity<onCameraChange>>() {
            public final /* synthetic */ Object invoke(Object obj) {
                read read = (read) obj;
                onGetStartedClick.write((Object) read, "param");
                return getdelegatelistiterator.IconCompatParcelizer(read.IconCompatParcelizer, read.MediaBrowserCompat$ItemReceiver, read.read);
            }
        });
        onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
        onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
        onGetStartedClick.write((Object) getdelegatelistiterator, "prepaidRequestRepositoryContractor");
    }

    /* renamed from: o.precomputeCharMatcher$read */
    public static final class read implements C4602xca7af99c {
        final ImmutableCollection.SerializedForm IconCompatParcelizer;
        final String MediaBrowserCompat$ItemReceiver;
        final String read;

        public read(ImmutableCollection.SerializedForm serializedForm, String str, String str2) {
            onGetStartedClick.write((Object) serializedForm, "request");
            onGetStartedClick.write((Object) str, "tokenUUID");
            onGetStartedClick.write((Object) str2, "otp");
            this.IconCompatParcelizer = serializedForm;
            this.MediaBrowserCompat$ItemReceiver = str;
            this.read = str2;
        }
    }
}

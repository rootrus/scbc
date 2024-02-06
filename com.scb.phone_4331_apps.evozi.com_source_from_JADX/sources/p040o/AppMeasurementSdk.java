package p040o;

import java.util.Arrays;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.ImmutableList;

/* renamed from: o.AppMeasurementSdk */
public final class AppMeasurementSdk extends IndoorBuilding {
    public static final List<String> IconCompatParcelizer = Arrays.asList(new String[]{"slip_header.png", "slip_side.png", "slip_watermark.png", "slip_bottom.png", "slip_zigzag.png"});
    public AbstractMultimap.EntryIterator write;

    static /* synthetic */ String read(String str) {
        return str;
    }

    /* renamed from: o.AppMeasurementSdk$EventInterceptor */
    public class EventInterceptor extends IndoorBuilding {
        @HmlPinActivity
        public EventInterceptor(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn") CloseAccountReviewActivity closeAccountReviewActivity, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn") CloseAccountReviewActivity closeAccountReviewActivity2) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public EventInterceptor(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, getAncestor getancestor) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
            onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
            onGetStartedClick.write((Object) getancestor, "hmlRepositoryContractor");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public EventInterceptor(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.Entries entries) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            onGetStartedClick.write((Object) closeAccountReviewActivity, "subscriberOn");
            onGetStartedClick.write((Object) closeAccountReviewActivity2, "observerOn");
            onGetStartedClick.write((Object) entries, "termsAndConditionsRepositoryContractor");
        }
    }

    /* renamed from: o.AppMeasurementSdk$ConditionalUserProperty */
    public final class ConditionalUserProperty extends IndoorBuilding {
        public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver read;

        @HmlPinActivity
        public ConditionalUserProperty(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.read = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        }

        public final DebitCardResetOtpActivity read() {
            return write(this.read.setContentView());
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver() {
            return write(this.read.write());
        }

        public final DebitCardResetOtpActivity IconCompatParcelizer() {
            return write(this.read.setBackgroundResource());
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver() {
            return write(this.read.Keep());
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(orderKeysBy orderkeysby, String str) {
            return write(this.read.read(orderkeysby, str));
        }

        public final DebitCardResetOtpActivity IconCompatParcelizer(ImmutableList.ReverseImmutableList.C34991 r2) {
            return write(this.read.IconCompatParcelizer(r2));
        }
    }

    @HmlPinActivity
    public AppMeasurementSdk(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.EntryIterator entryIterator) {
        super(closeAccountReviewActivity, closeAccountReviewActivity2);
        this.write = entryIterator;
    }

    /* renamed from: o.AppMeasurementSdk$OnEventListener */
    public final class OnEventListener extends IndoorBuilding {
        public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        private C7515tZ MediaBrowserCompat$CustomActionResultReceiver;
        public findValueIteratorAndKey MediaBrowserCompat$ItemReceiver;
        public AbstractMultimap.MultisetEntry read;

        @HmlPinActivity
        public OnEventListener(CloseAccountReviewActivity closeAccountReviewActivity, CloseAccountReviewActivity closeAccountReviewActivity2, AbstractMultimap.MultisetEntry multisetEntry, C7515tZ tZVar, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, findValueIteratorAndKey findvalueiteratorandkey) {
            super(closeAccountReviewActivity, closeAccountReviewActivity2);
            this.read = multisetEntry;
            this.MediaBrowserCompat$CustomActionResultReceiver = tZVar;
            this.IconCompatParcelizer = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
            this.MediaBrowserCompat$ItemReceiver = findvalueiteratorandkey;
        }

        public final DebitCardResetOtpActivity<List<StreetViewPanoramaFragment>> write(String str) {
            List<StreetViewPanoramaFragment> read2 = this.read.read(str);
            if (read2 == null || read2.isEmpty()) {
                return write(this.read.MediaBrowserCompat$CustomActionResultReceiver(str).cache().takeLast(1));
            }
            return write(DebitCardResetOtpActivity.just(read2));
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver() {
            return write(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(String str, String str2) {
            return write(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str, str2));
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(Integer num) {
            return write(this.read.MediaBrowserCompat$CustomActionResultReceiver(num));
        }

        public final DebitCardResetOtpActivity MediaBrowserCompat$CustomActionResultReceiver(Iterables iterables) {
            return write(this.read.write(iterables));
        }
    }

    public final DebitCardResetOtpActivity IconCompatParcelizer(String str) {
        return write(this.write.write(str));
    }
}

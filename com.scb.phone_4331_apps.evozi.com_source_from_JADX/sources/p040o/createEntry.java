package p040o;

import p040o.Barcode;
import p040o.Iterables;

/* renamed from: o.createEntry */
public final class createEntry extends Iterables.C35339 {
    public final Barcode.PersonName MediaBrowserCompat$CustomActionResultReceiver;
    public final Barcode.GeoPoint write;

    /* renamed from: o.createEntry$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<setUserProperty, dispatchBreadcrumbEvent> {
        private /* synthetic */ natural MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(natural natural) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = natural;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setUserProperty setuserproperty = (setUserProperty) obj;
            onGetStartedClick.write((Object) setuserproperty, "it");
            return this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(setuserproperty, true, Iterables$3$MediaBrowserCompat$MediaItem.easycash_loans_details);
        }
    }

    /* renamed from: o.createEntry$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<setUserProperty, dispatchBreadcrumbEvent> {
        private /* synthetic */ natural IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(natural natural) {
            super(1);
            this.IconCompatParcelizer = natural;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setUserProperty setuserproperty = (setUserProperty) obj;
            onGetStartedClick.write((Object) setuserproperty, "it");
            return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setuserproperty, false, Iterables$3$MediaBrowserCompat$MediaItem.review_details_header);
        }
    }

    /* renamed from: o.createEntry$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<setUserProperty, dispatchBreadcrumbEvent> {
        private /* synthetic */ natural IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(natural natural) {
            super(1);
            this.IconCompatParcelizer = natural;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setUserProperty setuserproperty = (setUserProperty) obj;
            onGetStartedClick.write((Object) setuserproperty, "it");
            return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(setuserproperty, true, Iterables$3$MediaBrowserCompat$MediaItem.review_details_header);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public createEntry(Barcode.GeoPoint geoPoint, Barcode.PersonName personName) {
        super((byte) 0);
        onGetStartedClick.write((Object) geoPoint, "easycashGetSummaryCase");
        onGetStartedClick.write((Object) personName, "easycashPostSummaryConfirmCase");
        this.write = geoPoint;
        this.MediaBrowserCompat$CustomActionResultReceiver = personName;
    }
}

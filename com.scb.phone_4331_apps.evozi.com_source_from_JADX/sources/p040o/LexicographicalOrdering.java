package p040o;

import java.util.Collections;
import java.util.List;
import p040o.CrashlyticsBackgroundWorker;
import p040o.Iterables;

/* renamed from: o.LexicographicalOrdering */
public final class LexicographicalOrdering extends Iterables.C35339 {
    public final getDetectedItems IconCompatParcelizer;
    final unmodifiableMultiset MediaBrowserCompat$CustomActionResultReceiver;
    final arraysCopyOf MediaDescriptionCompat;
    public final getFrameMetadata read;
    public final setFocus write;

    /* renamed from: o.LexicographicalOrdering$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<getCurrentScreenName, CrashlyticsBackgroundWorker.C32164> {
        private /* synthetic */ LexicographicalOrdering write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(LexicographicalOrdering lexicographicalOrdering) {
            super(1);
            this.write = lexicographicalOrdering;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CrashlyticsBackgroundWorker.C32164 r3;
            getCurrentScreenName getcurrentscreenname = (getCurrentScreenName) obj;
            onGetStartedClick.write((Object) getcurrentscreenname, "it");
            unmodifiableMultiset unmodifiablemultiset = this.write.MediaBrowserCompat$CustomActionResultReceiver;
            if (getcurrentscreenname.MediaBrowserCompat$ItemReceiver == null || getcurrentscreenname.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                r3 = null;
            } else {
                List<RestrictedComponentContainer> MediaBrowserCompat$ItemReceiver = unmodifiableMultiset.MediaBrowserCompat$ItemReceiver(getcurrentscreenname.MediaBrowserCompat$ItemReceiver, new findFragmentByWho() {
                    public final Object IconCompatParcelizer(Object obj) {
                        unmodifiableMultiset unmodifiablemultiset = unmodifiableMultiset.this;
                        setDataCollectionEnabled setdatacollectionenabled = (setDataCollectionEnabled) obj;
                        if (setdatacollectionenabled.MediaDescriptionCompat == null || setdatacollectionenabled.write == null) {
                            return null;
                        }
                        if ("REMARK".equals(setdatacollectionenabled.MediaBrowserCompat$ItemReceiver) || "ANNUAL_INTEREST_TIER".equals(setdatacollectionenabled.MediaBrowserCompat$ItemReceiver)) {
                            return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, (List<C3758xd990f62c>) Collections.singletonList(new C3758xd990f62c(setdatacollectionenabled.MediaDescriptionCompat, unmodifiablemultiset.MediaBrowserCompat$CustomActionResultReceiver.getColor(Iterables.C35273.read.dark_gray))));
                        }
                        return new RestrictedComponentContainer(setdatacollectionenabled.IconCompatParcelizer, setdatacollectionenabled.MediaDescriptionCompat);
                    }
                });
                CrashlyticsBackgroundWorker.C32164.read read = new CrashlyticsBackgroundWorker.C32164.read();
                read.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver;
                r3 = read.MediaBrowserCompat$CustomActionResultReceiver();
            }
            onGetStartedClick.IconCompatParcelizer((Object) r3, "calculationSummaryDispla….transformLoanDetails(it)");
            return r3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public LexicographicalOrdering(getFrameMetadata getframemetadata, setFocus setfocus, getDetectedItems getdetecteditems, arraysCopyOf arrayscopyof, unmodifiableMultiset unmodifiablemultiset) {
        super((byte) 0);
        onGetStartedClick.write((Object) getframemetadata, "easycashLoanFeatureInfoInitCase");
        onGetStartedClick.write((Object) setfocus, "easycashLoanFeatureInfoCalculation");
        onGetStartedClick.write((Object) getdetecteditems, "easycashLoanFeaturePostInfo");
        onGetStartedClick.write((Object) arrayscopyof, "easycashLoanOffersDisplayMapper");
        onGetStartedClick.write((Object) unmodifiablemultiset, "calculationSummaryDisplayMapper");
        this.read = getframemetadata;
        this.write = setfocus;
        this.IconCompatParcelizer = getdetecteditems;
        this.MediaDescriptionCompat = arrayscopyof;
        this.MediaBrowserCompat$CustomActionResultReceiver = unmodifiablemultiset;
    }
}

package p040o;

import p040o.CharMatcher;

/* renamed from: o.AppStatsInstanceType */
public class AppStatsInstanceType extends writeUInt64NoTag<fromExtractorField> {
    public final CharMatcher.LookupTable IconCompatParcelizer;
    public final trimTrailingFrom MediaBrowserCompat$ItemReceiver;
    final VisibleRegion read;
    final TreeBasedTable write;

    @HmlPinActivity
    public AppStatsInstanceType(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.LookupTable lookupTable, trimTrailingFrom trimtrailingfrom, VisibleRegion visibleRegion, TreeBasedTable treeBasedTable) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = lookupTable;
        this.MediaBrowserCompat$ItemReceiver = trimtrailingfrom;
        this.read = visibleRegion;
        this.write = treeBasedTable;
    }

    public final void IconCompatParcelizer() {
        AppStatsDsFieldType appStatsDsFieldType = AppStatsDsFieldType.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat != null) {
            appStatsDsFieldType.IconCompatParcelizer(this.RatingCompat);
        }
        VisibleRegion visibleRegion = this.read;
        visibleRegion.read(visibleRegion.MediaBrowserCompat$CustomActionResultReceiver("MERCHANT_APP_ACCOUNT"), new generateNewUniqueID(this), new createDaoSampleSizingObj(this));
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(fromExtractorField fromextractorfield) {
        fromextractorfield.aj_();
        fromextractorfield.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

package p040o;

import com.google.android.gms.common.internal.ImagesContract;
import p040o.FaceDetector;

/* renamed from: o.getOutputNames */
public final class getOutputNames extends writeUInt64NoTag<IdParameters_Factory> {
    /* access modifiers changed from: private */
    public final RegularImmutableList IconCompatParcelizer;
    public final FaceDetector.Builder write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getOutputNames(RegularImmutableBiMap regularImmutableBiMap, FaceDetector.Builder builder, RegularImmutableList regularImmutableList) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) builder, "eTBMarketConductCase");
        onGetStartedClick.write((Object) regularImmutableList, "eTBMarketConductDisplayMapper");
        this.write = builder;
        this.IconCompatParcelizer = regularImmutableList;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getOutputNames getoutputnames) {
        if (getoutputnames.RatingCompat != null) {
            getoutputnames.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.write.write(str);
        this.write.IconCompatParcelizer(new getOutputNames$MediaBrowserCompat$ItemReceiver(this));
    }
}

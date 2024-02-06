package p040o;

import com.scb.phone.domain.interactor.ReviewInfoCase;

/* renamed from: o.ce */
public class C4177ce extends writeUInt64NoTag<CheckExtractorResponse> {
    public final ReviewInfoCase IconCompatParcelizer;
    public final slice write;

    @HmlPinActivity
    public C4177ce(RegularImmutableBiMap regularImmutableBiMap, slice slice, ReviewInfoCase reviewInfoCase) {
        super(regularImmutableBiMap);
        this.write = slice;
        this.IconCompatParcelizer = reviewInfoCase;
    }

    static /* synthetic */ void IconCompatParcelizer(C4177ce ceVar) {
        if (ceVar.RatingCompat != null) {
            ceVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4177ce ceVar) {
        if (ceVar.RatingCompat != null) {
            ceVar.RatingCompat.aj_();
        }
    }
}

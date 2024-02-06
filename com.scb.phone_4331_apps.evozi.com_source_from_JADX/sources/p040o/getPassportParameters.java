package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.getPassportParameters */
public final /* synthetic */ class getPassportParameters implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ C4176cd read;

    public /* synthetic */ getPassportParameters(C4176cd cdVar, String str) {
        this.read = cdVar;
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C4176cd cdVar = this.read;
        String str = this.IconCompatParcelizer;
        KtaJsonCheck.RatingCompat ratingCompat = (KtaJsonCheck.RatingCompat) obj;
        if (!cdVar.IconCompatParcelizer.read()) {
            ratingCompat.read();
        } else if ("RP_INITIAL".equals(str)) {
            ratingCompat.MediaBrowserCompat$SearchResultReceiver();
        } else {
            ratingCompat.IconCompatParcelizer(true);
        }
    }
}

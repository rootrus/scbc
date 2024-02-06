package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Image;
import p040o.access$2300;

/* renamed from: o.Image$FileIOEngine$MediaBrowserCompat$ItemReceiver */
public class Image$FileIOEngine$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder> {
    private /* synthetic */ Image.FileIOEngine MediaBrowserCompat$CustomActionResultReceiver;

    private Image$FileIOEngine$MediaBrowserCompat$ItemReceiver(Image.FileIOEngine fileIOEngine) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fileIOEngine;
    }

    public /* synthetic */ Image$FileIOEngine$MediaBrowserCompat$ItemReceiver(Image.FileIOEngine fileIOEngine, byte b) {
        this(fileIOEngine);
    }

    public final /* synthetic */ void onNext(Object obj) {
        Image.FileIOEngine fileIOEngine = this.MediaBrowserCompat$CustomActionResultReceiver;
        CheckSide checkSide = new CheckSide((RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder) obj);
        if (fileIOEngine.RatingCompat != null) {
            checkSide.IconCompatParcelizer(fileIOEngine.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder riskSummaryRecyclerViewAdapter$RiskSummaryViewHolder, CheckExtractActivity_MembersInjector.setPopupCallback setpopupcallback) {
        setpopupcallback.aj_();
        setpopupcallback.IconCompatParcelizer(riskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

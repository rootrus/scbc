package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.setImageFileRepresentation;
import p040o.writeUInt64NoTag;

/* renamed from: o.getImageRepresentation */
public final /* synthetic */ class getImageRepresentation implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getImageRepresentation(RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder riskSummaryRecyclerViewAdapter$RiskSummaryViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = riskSummaryRecyclerViewAdapter$RiskSummaryViewHolder;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageFileRepresentation.write.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, (CheckExtractActivity_MembersInjector.AppCompatDialogFragment) obj);
    }
}

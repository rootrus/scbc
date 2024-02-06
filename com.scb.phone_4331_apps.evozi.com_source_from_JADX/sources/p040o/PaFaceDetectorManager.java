package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator;

/* renamed from: o.PaFaceDetectorManager */
public final /* synthetic */ class PaFaceDetectorManager implements DialogInterface.OnClickListener {
    private final /* synthetic */ HistoryAdapter$GroupFooterViewHolder_ViewBinding IconCompatParcelizer;

    public /* synthetic */ PaFaceDetectorManager(HistoryAdapter$GroupFooterViewHolder_ViewBinding historyAdapter$GroupFooterViewHolder_ViewBinding) {
        this.IconCompatParcelizer = historyAdapter$GroupFooterViewHolder_ViewBinding;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.write();
    }

    /* renamed from: o.PaFaceDetectorManager$Holder */
    public final /* synthetic */ class Holder implements EditTextDecorator.IconCompatParcelizer {
        private final /* synthetic */ MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ Holder(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
            this.MediaBrowserCompat$ItemReceiver = mwBusinessDetailsActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            this.MediaBrowserCompat$ItemReceiver.PlaybackStateCompat$CustomAction.onNext(Boolean.valueOf(z));
        }
    }
}

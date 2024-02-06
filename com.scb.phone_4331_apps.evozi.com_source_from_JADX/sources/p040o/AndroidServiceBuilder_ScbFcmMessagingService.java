package p040o;

import com.scb.phone.view.adapter.fixedtransfer.C5754x33d87c9f;
import java.util.List;
import p040o.ProcessActivity;

/* renamed from: o.AndroidServiceBuilder_ScbFcmMessagingService */
public final /* synthetic */ class AndroidServiceBuilder_ScbFcmMessagingService implements C5754x33d87c9f {
    private final /* synthetic */ C7501tI MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ AndroidServiceBuilder_ScbFcmMessagingService(C7501tI tIVar) {
        this.MediaBrowserCompat$ItemReceiver = tIVar;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, boolean z) {
        C7501tI tIVar = this.MediaBrowserCompat$ItemReceiver;
        List<parseEventExecutionException> list = tIVar.write.MediaBrowserCompat$ItemReceiver;
        list.get(i).MediaMetadataCompat = z;
        int size = list.size();
        long MediaBrowserCompat$ItemReceiver2 = C7501tI.MediaBrowserCompat$ItemReceiver(list);
        boolean z2 = true;
        if (((long) size) != MediaBrowserCompat$ItemReceiver2 || MediaBrowserCompat$ItemReceiver2 <= 0) {
            ImageReviewActivity imageReviewActivity = ImageReviewActivity.MediaBrowserCompat$CustomActionResultReceiver;
            if (tIVar.RatingCompat != null) {
                imageReviewActivity.IconCompatParcelizer(tIVar.RatingCompat);
            }
        } else {
            ProcessActivity.C70081 r9 = ProcessActivity.C70081.MediaBrowserCompat$ItemReceiver;
            if (tIVar.RatingCompat != null) {
                r9.IconCompatParcelizer(tIVar.RatingCompat);
            }
        }
        tIVar.write.MediaBrowserCompat$ItemReceiver = list;
        tIVar.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2 > 0;
        ImageReviewActivity_MembersInjector imageReviewActivity_MembersInjector = new ImageReviewActivity_MembersInjector(MediaBrowserCompat$ItemReceiver2);
        if (tIVar.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            imageReviewActivity_MembersInjector.IconCompatParcelizer(tIVar.RatingCompat);
        }
        tIVar.read();
    }
}

package p040o;

import com.scb.phone.view.fragment.investment.assessment.C6029x3ca24ef1;
import java.util.List;
import p040o.VideoPlayerCameraPlayer;

/* renamed from: o.VideoPlayerCameraPlayer$c$MediaBrowserCompat$CustomActionResultReceiver */
public class C3948x247a92ae extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<C6029x3ca24ef1>> {
    final /* synthetic */ VideoPlayerCameraPlayer.C3947c IconCompatParcelizer;

    private C3948x247a92ae(VideoPlayerCameraPlayer.C3947c cVar) {
        this.IconCompatParcelizer = cVar;
    }

    public /* synthetic */ C3948x247a92ae(VideoPlayerCameraPlayer.C3947c cVar, byte b) {
        this(cVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        VideoPlayerCameraPlayer.C3947c.read(this.IconCompatParcelizer);
        VideoPlayerCameraPlayer.C3947c cVar = this.IconCompatParcelizer;
        getSignatureImageFieldName getsignatureimagefieldname = new getSignatureImageFieldName(this, (List) obj);
        if (cVar.RatingCompat != null) {
            getsignatureimagefieldname.IconCompatParcelizer(cVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        VideoPlayerCameraPlayer.C3947c.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        VideoPlayerCameraPlayer.C3947c cVar = this.IconCompatParcelizer;
        getMiddleNameFieldName getmiddlenamefieldname = new getMiddleNameFieldName(this, th);
        if (cVar.RatingCompat != null) {
            getmiddlenamefieldname.IconCompatParcelizer(cVar.RatingCompat);
        }
    }
}

package p040o;

import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import java.util.List;
import p040o.access$2300;

/* renamed from: o.ci$MediaBrowserCompat$CustomActionResultReceiver */
public class ci$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<PrepaidResetOtpActivity.write>> {
    final /* synthetic */ C4190ci IconCompatParcelizer;

    public ci$MediaBrowserCompat$CustomActionResultReceiver(C4190ci ciVar) {
        this.IconCompatParcelizer = ciVar;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        C4190ci.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        C4190ci ciVar = this.IconCompatParcelizer;
        List unused = ciVar.MediaBrowserCompat$ItemReceiver = ciVar.MediaDescriptionCompat.read(list);
        C4190ci ciVar2 = this.IconCompatParcelizer;
        C4142cA cAVar = new C4142cA(this, list);
        if (ciVar2.RatingCompat != null) {
            cAVar.IconCompatParcelizer(ciVar2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

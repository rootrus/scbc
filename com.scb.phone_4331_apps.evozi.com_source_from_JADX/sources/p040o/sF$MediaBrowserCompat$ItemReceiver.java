package p040o;

import android.text.TextUtils;
import p040o.CrashlyticsReport;
import p040o.access$2300;

/* renamed from: o.sF$MediaBrowserCompat$ItemReceiver */
public final class sF$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<userNavigationEnabled> {
    final /* synthetic */ C7431sF write;

    private sF$MediaBrowserCompat$ItemReceiver(C7431sF sFVar) {
        this.write = sFVar;
    }

    public /* synthetic */ sF$MediaBrowserCompat$ItemReceiver(C7431sF sFVar, byte b) {
        this(sFVar);
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        userNavigationEnabled usernavigationenabled = (userNavigationEnabled) obj;
        boolean z = true;
        if (this.write.RatingCompat != null) {
            C7431sF sFVar = this.write;
            CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$CustomActionResultReceiver = C7431sF.MediaBrowserCompat$CustomActionResultReceiver(sFVar, sFVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
            CrashlyticsReport.Session.Event.Application.Execution.Signal MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(usernavigationenabled, MediaBrowserCompat$CustomActionResultReceiver, this.write.IconCompatParcelizer.IconCompatParcelizer.AppCompatActivity(), this.write.MediaBrowserCompat$ItemReceiver);
            if (MediaBrowserCompat$CustomActionResultReceiver == null || TextUtils.isEmpty(MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat)) {
                str = "";
            } else {
                str = MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
            }
            C7431sF sFVar2 = this.write;
            C10139sO sOVar = new C10139sO(this, MediaBrowserCompat$CustomActionResultReceiver2, str);
            if (sFVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                sOVar.IconCompatParcelizer(sFVar2.RatingCompat);
            }
        }
    }

    public final void onComplete() {
        C7431sF.MediaBrowserCompat$SearchResultReceiver(this.write);
    }

    public final void onError(Throwable th) {
        this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

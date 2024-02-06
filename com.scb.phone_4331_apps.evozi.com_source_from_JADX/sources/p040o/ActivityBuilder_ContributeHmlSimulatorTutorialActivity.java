package p040o;

import com.scb.phone.view.custom.C5792xf293d63d;
import java.util.Collections;
import java.util.List;
import p040o.C4880ju;

/* renamed from: o.ActivityBuilder_ContributeHmlSimulatorTutorialActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlSimulatorTutorialActivity implements C5792xf293d63d {
    private final /* synthetic */ C4880ju write;

    public /* synthetic */ ActivityBuilder_ContributeHmlSimulatorTutorialActivity(C4880ju juVar) {
        this.write = juVar;
    }

    public final void IconCompatParcelizer(String str, String str2, boolean z) {
        List list;
        C4880ju juVar = this.write;
        boolean z2 = false;
        if (juVar.RatingCompat != null) {
            juVar.RatingCompat.AlertController$RecycleListView();
        }
        if ("EMAIL".equals(str)) {
            boolean z3 = str2 != null;
            if (z3) {
                list = Collections.singletonList(new addMarker(str2, z));
            } else {
                list = Collections.emptyList();
            }
            if (z3 || z) {
                z2 = true;
            }
            juVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(new addCircle(str, z2, list));
            juVar.IconCompatParcelizer.IconCompatParcelizer(new C4880ju.write(z, str, str2));
        } else if ("PUSH".equals(str)) {
            juVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(juVar.read.getString("FCM_TOKEN", ""), z);
            juVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4880ju.write(z, str, str2));
        }
    }
}

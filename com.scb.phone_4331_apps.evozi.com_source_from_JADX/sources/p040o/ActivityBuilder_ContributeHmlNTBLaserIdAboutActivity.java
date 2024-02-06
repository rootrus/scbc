package p040o;

import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.fragment.personalize.PersonalizeFragment;
import java.util.List;
import p040o.C4381eq;
import p040o.CrashlyticsReport;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBLaserIdAboutActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlNTBLaserIdAboutActivity implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    private final /* synthetic */ RecyclerView IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ PersonalizeFragment read;

    public /* synthetic */ ActivityBuilder_ContributeHmlNTBLaserIdAboutActivity(PersonalizeFragment personalizeFragment, RecyclerView recyclerView, List list) {
        this.read = personalizeFragment;
        this.IconCompatParcelizer = recyclerView;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final void read(int i) {
        PersonalizeFragment personalizeFragment = this.read;
        RecyclerView recyclerView = this.IconCompatParcelizer;
        List list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (recyclerView.isClickable()) {
            boolean z = false;
            recyclerView.setClickable(false);
            recyclerView.setEnabled(false);
            C4381eq eqVar = personalizeFragment.presenter;
            long j = personalizeFragment.getArguments().getLong("com.scb.phone.EXTRA_PARENT_ID");
            Hashing write = Hashing.write();
            Integer num = ((CrashlyticsReport.Session.Event.Application.Builder) list.get(i)).setHasDecor;
            weakValues IconCompatParcelizer2 = weakValues.IconCompatParcelizer();
            IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = num;
            write.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
            write.IconCompatParcelizer = getGeoDataClient.FAVOURITE.toString();
            write.write = setLocale.SHORTCUT.toString();
            write.MediaBrowserCompat$CustomActionResultReceiver = j;
            if (eqVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                eqVar.RatingCompat.AlertController$RecycleListView();
            }
            eqVar.write.write(write);
            eqVar.write.IconCompatParcelizer(new C4381eq.IconCompatParcelizer(j));
        }
    }
}

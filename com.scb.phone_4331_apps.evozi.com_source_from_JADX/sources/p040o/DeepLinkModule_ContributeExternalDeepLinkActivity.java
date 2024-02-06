package p040o;

import com.scb.phone.view.adapter.easycash.EasycashSalesheetAdapter;
import com.scb.phone.view.fragment.easycash.salesheets.EasycashSalesheetIndexFragment;
import p040o.CustomConcurrentHashMap;
import p040o.Image;

/* renamed from: o.DeepLinkModule_ContributeExternalDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeExternalDeepLinkActivity implements EasycashSalesheetAdapter.IconCompatParcelizer {
    private final /* synthetic */ EasycashSalesheetIndexFragment write;

    public /* synthetic */ DeepLinkModule_ContributeExternalDeepLinkActivity(EasycashSalesheetIndexFragment easycashSalesheetIndexFragment) {
        this.write = easycashSalesheetIndexFragment;
    }

    public final void read(submit submit) {
        Image.C3462b bVar = this.write.easycashSalesheetProductsPresenter;
        if (bVar.RatingCompat != null) {
            bVar.RatingCompat.AlertController$RecycleListView();
        }
        String str = submit.read;
        CustomConcurrentHashMap.Segment write2 = CustomConcurrentHashMap.Segment.write();
        write2.MediaBrowserCompat$CustomActionResultReceiver = "SALE_SHEET";
        write2.read = str;
        bVar.read.IconCompatParcelizer(write2);
        bVar.read.IconCompatParcelizer(new Image$b$MediaBrowserCompat$CustomActionResultReceiver(bVar, submit));
    }
}

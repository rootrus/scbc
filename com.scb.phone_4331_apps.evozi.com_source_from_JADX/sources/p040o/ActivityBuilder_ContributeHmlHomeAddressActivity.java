package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationInfoFragment;
import okhttp3.internal.cache.DiskLruCache;

/* renamed from: o.ActivityBuilder_ContributeHmlHomeAddressActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlHomeAddressActivity implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ OccupationInfoFragment write;

    public /* synthetic */ ActivityBuilder_ContributeHmlHomeAddressActivity(OccupationInfoFragment occupationInfoFragment) {
        this.write = occupationInfoFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C4192cj cjVar = this.write.occupationInformationPresenter;
        if (z) {
            cjVar.MediaSessionCompat$Token = DiskLruCache.VERSION_1;
            C4081bV bVVar = C4081bV.IconCompatParcelizer;
            if (cjVar.RatingCompat != null) {
                bVVar.IconCompatParcelizer(cjVar.RatingCompat);
            }
        } else {
            cjVar.IconCompatParcelizer();
        }
        cjVar.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

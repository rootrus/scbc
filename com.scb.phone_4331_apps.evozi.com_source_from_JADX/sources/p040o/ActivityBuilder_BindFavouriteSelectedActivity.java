package p040o;

import com.scb.phone.view.fragment.hml.HmlOutcomePendingWithAIPFragment;
import p040o.Iterables;

/* renamed from: o.ActivityBuilder_BindFavouriteSelectedActivity */
public final class ActivityBuilder_BindFavouriteSelectedActivity implements MileageQuantitySelectionActivity<HmlOutcomePendingWithAIPFragment> {
    public static void IconCompatParcelizer(HmlOutcomePendingWithAIPFragment hmlOutcomePendingWithAIPFragment, getPropertyInfo getpropertyinfo) {
        hmlOutcomePendingWithAIPFragment.presenter = getpropertyinfo;
    }

    public static void MediaBrowserCompat$ItemReceiver(HmlOutcomePendingWithAIPFragment hmlOutcomePendingWithAIPFragment, Iterables.C351911.C35201 r1) {
        hmlOutcomePendingWithAIPFragment.itemFactory = r1;
    }
}

package p040o;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.custom.item.ItemCardCustom;
import java.util.List;

/* renamed from: o.getCasaDetails */
public final class getCasaDetails extends onActivityCreated {
    public List<? extends removeAllReports> MediaBrowserCompat$ItemReceiver;

    public final int getItemPosition(Object obj) {
        onGetStartedClick.write(obj, "any");
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        onGetStartedClick.write(obj, "any");
        return view == obj;
    }

    public getCasaDetails(List<? extends removeAllReports> list) {
        onGetStartedClick.write((Object) list, "displays");
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "container");
        ItemCardCustom itemCardCustom = new ItemCardCustom(viewGroup.getContext());
        itemCardCustom.setUpWithDisplay((removeAllReports) this.MediaBrowserCompat$ItemReceiver.get(i));
        viewGroup.addView(itemCardCustom);
        return itemCardCustom;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        onGetStartedClick.write((Object) viewGroup, "container");
        onGetStartedClick.write(obj, "any");
        viewGroup.removeView((View) obj);
    }
}

package p040o;

import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.view.custom.item.ItemCardCustom;
import java.util.List;

/* renamed from: o.checkEntryPoint */
public final class checkEntryPoint extends onActivityCreated {
    public List<removeAllReports> write;

    public final int getItemPosition(Object obj) {
        return -2;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public checkEntryPoint(List<removeAllReports> list) {
        this.write = list;
    }

    public final int getCount() {
        return this.write.size();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        ItemCardCustom itemCardCustom = new ItemCardCustom(viewGroup.getContext());
        itemCardCustom.setUpWithDisplay(this.write.get(i));
        viewGroup.addView(itemCardCustom);
        return itemCardCustom;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}

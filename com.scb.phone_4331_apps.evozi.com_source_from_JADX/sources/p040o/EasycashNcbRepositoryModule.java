package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;

/* renamed from: o.EasycashNcbRepositoryModule */
public final class EasycashNcbRepositoryModule extends onActivityCreated {
    private LayoutInflater MediaBrowserCompat$ItemReceiver;

    public final int getCount() {
        return 1;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public EasycashNcbRepositoryModule(Context context) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f84092131493635, (ViewGroup) null);
        viewGroup.addView(inflate, 0);
        return inflate;
    }
}

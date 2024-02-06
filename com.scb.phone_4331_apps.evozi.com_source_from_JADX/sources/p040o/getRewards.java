package p040o;

import android.view.View;
import com.scb.phone.view.adapter.landingpage.LandingPageAdapter;

/* renamed from: o.getRewards */
public final /* synthetic */ class getRewards implements View.OnClickListener {
    private final /* synthetic */ LandingPageAdapter.MyViewHolder write;

    public /* synthetic */ getRewards(LandingPageAdapter.MyViewHolder myViewHolder) {
        this.write = myViewHolder;
    }

    public final void onClick(View view) {
        LandingPageAdapter.MyViewHolder myViewHolder = this.write;
        switch (LandingPageAdapter.C89222.read[LandingPageAdapter.read().MediaBrowserCompat$ItemReceiver(myViewHolder.Keep).ExpandedMenuView.ordinal()]) {
            case 1:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().write(LandingPageAdapter.read().MediaBrowserCompat$ItemReceiver(myViewHolder.Keep).setCheckable);
                return;
            case 2:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().setPopupCallback();
                return;
            case 3:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().ListMenuItemView();
                return;
            case 4:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().setForceShowIcon();
                return;
            case 5:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().read(LandingPageAdapter.read().MediaBrowserCompat$ItemReceiver(myViewHolder.Keep).setBackgroundResource);
                return;
            case 6:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().read(LandingPageAdapter.read().MediaBrowserCompat$ItemReceiver(myViewHolder.Keep).setBackgroundResource);
                return;
            case 7:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().setGroupDividerEnabled();
                return;
            case 8:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$MediaItem(LandingPageAdapter.read().MediaBrowserCompat$ItemReceiver(myViewHolder.Keep));
                return;
            case 9:
                LandingPageAdapter.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver(LandingPageAdapter.read().MediaBrowserCompat$ItemReceiver(myViewHolder.Keep));
                return;
            default:
                return;
        }
    }
}

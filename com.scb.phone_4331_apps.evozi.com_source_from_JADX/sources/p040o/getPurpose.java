package p040o;

import android.view.View;
import com.scb.phone.view.adapter.sme.gifting.GiftTutorialViewPagerAdapter;

/* renamed from: o.getPurpose */
public final /* synthetic */ class getPurpose implements View.OnClickListener {
    private final /* synthetic */ GiftTutorialViewPagerAdapter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getPurpose(GiftTutorialViewPagerAdapter giftTutorialViewPagerAdapter) {
        this.MediaBrowserCompat$ItemReceiver = giftTutorialViewPagerAdapter;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$ItemReceiver.read.MediaBrowserCompat$ItemReceiver(view);
    }
}

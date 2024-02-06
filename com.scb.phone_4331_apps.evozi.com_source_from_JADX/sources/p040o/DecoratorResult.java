package p040o;

import com.scb.phone.view.activity.partner.AbstractPartnerLoginActivity;

/* renamed from: o.DecoratorResult */
public final /* synthetic */ class DecoratorResult implements Runnable {
    private final /* synthetic */ AbstractPartnerLoginActivity IconCompatParcelizer;

    public /* synthetic */ DecoratorResult(AbstractPartnerLoginActivity abstractPartnerLoginActivity) {
        this.IconCompatParcelizer = abstractPartnerLoginActivity;
    }

    public final void run() {
        AbstractPartnerLoginActivity abstractPartnerLoginActivity = this.IconCompatParcelizer;
        abstractPartnerLoginActivity.MediaBrowserCompat$MediaItem.dismiss();
        abstractPartnerLoginActivity.MediaMetadataCompat.RatingCompat();
    }
}

package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;

/* renamed from: o.IBundle */
public final /* synthetic */ class IBundle implements DialogInterface.OnClickListener {
    private final /* synthetic */ HomeActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ IBundle(HomeActivity homeActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = homeActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HomeActivity homeActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        getSessionAppSize getsessionappsize = homeActivity.sessionHandlerPresenter;
        if (!(getsessionappsize != null && getsessionappsize.setHasDecor.IconCompatParcelizer.IconCompatParcelizer()) || homeActivity.mo13022E_()) {
            Intent write = PinLoginActivity.write((Context) homeActivity);
            IntentTidInjectionActivityAspect.aspectOf();
            HomeActivity.read((Activity) homeActivity, write);
            homeActivity.setSubtitle();
        } else {
            homeActivity.homePresenter.RatingCompat();
        }
        dialogInterface.dismiss();
    }
}

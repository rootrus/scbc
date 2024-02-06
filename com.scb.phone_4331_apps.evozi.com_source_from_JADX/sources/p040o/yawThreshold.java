package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.landingpage.LifestyleCustomizationActivity;

/* renamed from: o.yawThreshold */
public final /* synthetic */ class yawThreshold implements DialogInterface.OnClickListener {
    private final /* synthetic */ LifestyleCustomizationActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ yawThreshold(LifestyleCustomizationActivity lifestyleCustomizationActivity) {
        this.MediaBrowserCompat$ItemReceiver = lifestyleCustomizationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        LifestyleCustomizationActivity lifestyleCustomizationActivity = this.MediaBrowserCompat$ItemReceiver;
        dialogInterface.dismiss();
        registerNewObjectListener registernewobjectlistener = lifestyleCustomizationActivity.presenter;
        if (registernewobjectlistener.RatingCompat != null) {
            registernewobjectlistener.RatingCompat.AlertController$RecycleListView();
        }
        registernewobjectlistener.MediaBrowserCompat$ItemReceiver.write();
        registernewobjectlistener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new registerNewObjectListener$MediaBrowserCompat$ItemReceiver(registernewobjectlistener, (byte) 0));
    }
}

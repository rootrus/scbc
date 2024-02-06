package p040o;

import com.scb.phone.view.activity.ndid.BaseLivenessCheckActivity;
import com.scb.phone.view.activity.ndid.IdpLivenessCheckActivity;

/* renamed from: o.CalendarPagerView */
public final /* synthetic */ class CalendarPagerView implements Runnable {
    private final /* synthetic */ BaseLivenessCheckActivity IconCompatParcelizer;

    public /* synthetic */ CalendarPagerView(BaseLivenessCheckActivity baseLivenessCheckActivity) {
        this.IconCompatParcelizer = baseLivenessCheckActivity;
    }

    /* renamed from: o.CalendarPagerView$LayoutParams */
    public final class LayoutParams {
        private static final String[] write = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

        public static void IconCompatParcelizer(IdpLivenessCheckActivity idpLivenessCheckActivity) {
            if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(idpLivenessCheckActivity, write)) {
                idpLivenessCheckActivity.AppCompatDelegateImpl$ListMenuDecorView();
            } else {
                AppCompatRatingBar.write(idpLivenessCheckActivity, write, 32);
            }
        }
    }

    public final void run() {
        BaseLivenessCheckActivity baseLivenessCheckActivity = this.IconCompatParcelizer;
        baseLivenessCheckActivity.MediaDescriptionCompat = false;
        baseLivenessCheckActivity.mo14922x50fd9e4a();
    }
}

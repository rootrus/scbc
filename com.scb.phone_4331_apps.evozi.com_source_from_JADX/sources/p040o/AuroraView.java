package p040o;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.activity.mwpartner.MwCoachMarkActivity;
import com.scb.phone.view.adapter.creditcard.CoachMarkViewPagerAdapter;
import com.scb.phone.view.custom.common.EditTextDecorator$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.AuroraView */
public final /* synthetic */ class AuroraView implements EditTextDecorator$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.AuroraView$AuroraColorChangeListener */
    public final /* synthetic */ class AuroraColorChangeListener implements CoachMarkViewPagerAdapter.read {
        private final /* synthetic */ MwCoachMarkActivity read;

        public /* synthetic */ AuroraColorChangeListener(MwCoachMarkActivity mwCoachMarkActivity) {
            this.read = mwCoachMarkActivity;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(View view) {
            this.read.lambda$onCreate$0$MwCoachMarkActivity(view);
        }
    }

    public /* synthetic */ AuroraView(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.MediaBrowserCompat$ItemReceiver = mwBusinessDetailsActivity;
    }

    public final String read(String str) {
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.MediaBrowserCompat$ItemReceiver;
        if (str.matches("^[A-Za-z0-9 ]+$")) {
            return null;
        }
        return mwBusinessDetailsActivity.getString(R.string.mw_bd_error_english);
    }
}

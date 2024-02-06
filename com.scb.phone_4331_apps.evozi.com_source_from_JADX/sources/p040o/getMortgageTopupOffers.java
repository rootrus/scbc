package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpBillerFragment;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpHistoryFragment;

/* renamed from: o.getMortgageTopupOffers */
public final class getMortgageTopupOffers extends setCardElevation {
    public final TopUpHistoryFragment IconCompatParcelizer = new TopUpHistoryFragment();
    private final TopUpBillerFragment MediaBrowserCompat$CustomActionResultReceiver = new TopUpBillerFragment();
    private final Context MediaBrowserCompat$ItemReceiver;
    private final int[] write = {R.string.auto_regen_repeat_top_up_biller, R.string.auto_regen_repeat_top_up_history};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getMortgageTopupOffers(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        onGetStartedClick.write((Object) settitlemarginstart, "fm");
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    /* renamed from: o.getMortgageTopupOffers$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ clickShareSlip IconCompatParcelizer;
        private final /* synthetic */ zzvf MediaBrowserCompat$ItemReceiver;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(clickShareSlip clickshareslip, zzvf zzvf) {
            this.IconCompatParcelizer = clickshareslip;
            this.MediaBrowserCompat$ItemReceiver = zzvf;
        }

        public final Object IconCompatParcelizer(Object obj) {
            return OptionalPendingResultImpl.MediaBrowserCompat$ItemReceiver((zzvo) obj, this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (i != 1) {
            return null;
        }
        return this.IconCompatParcelizer;
    }

    public final int getCount() {
        return this.write.length;
    }

    public final CharSequence getPageTitle(int i) {
        Context context = this.MediaBrowserCompat$ItemReceiver;
        return context != null ? context.getString(this.write[i]) : null;
    }
}

package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ccrredemption.product.QuantityPointsFragment;
import com.scb.phone.view.fragment.ccrredemption.product.QuantityPointsPlusMoneyFragment;

/* renamed from: o.setupJuristicPin */
public final class setupJuristicPin extends setCardElevation {
    private int[] IconCompatParcelizer = {R.string.points_label, R.string.point_money_label};
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private final boolean read;

    public setupJuristicPin(setTitleMarginStart settitlemarginstart, Context context, boolean z) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.read = z;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return QuantityPointsFragment.IconCompatParcelizer();
        }
        if (i != 1) {
            return null;
        }
        return QuantityPointsPlusMoneyFragment.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final int getCount() {
        return this.read ? this.IconCompatParcelizer.length : this.IconCompatParcelizer.length - 1;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(this.IconCompatParcelizer[i]);
    }
}

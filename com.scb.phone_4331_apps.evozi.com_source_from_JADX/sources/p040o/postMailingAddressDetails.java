package p040o;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ccrredemption.product.OPRRewardsFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.postMailingAddressDetails */
public final class postMailingAddressDetails extends setCardElevation {
    public List<C4283discover> read = new ArrayList();

    public postMailingAddressDetails(setTitleMarginStart settitlemarginstart) {
        super(settitlemarginstart);
    }

    public final Fragment read(int i) {
        return OPRRewardsFragment.IconCompatParcelizer(this.read.get(i));
    }

    public final int getCount() {
        return this.read.size();
    }
}

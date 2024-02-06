package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.creditcard.BilledTabFragment;
import com.scb.phone.view.fragment.creditcard.UnbilledTabFragment;

/* renamed from: o.retry */
public final class retry extends setCardElevation {
    private int[] IconCompatParcelizer = {R.string.unbilled, R.string.billed};
    private Context read;
    private String write;

    public retry(setTitleMarginStart settitlemarginstart, Context context, String str) {
        super(settitlemarginstart);
        this.read = context;
        this.write = str;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return UnbilledTabFragment.read(this.write);
        }
        if (i != 1) {
            return null;
        }
        return BilledTabFragment.read(this.write);
    }

    public final int getCount() {
        return this.IconCompatParcelizer.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.read.getString(this.IconCompatParcelizer[i]);
    }
}

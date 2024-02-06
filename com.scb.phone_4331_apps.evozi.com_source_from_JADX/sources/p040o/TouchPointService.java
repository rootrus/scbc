package p040o;

import com.scb.phone.view.adapter.creditcard.CreditCardDetailBilledAdapter;
import com.scb.phone.view.fragment.creditcard.BilledTabFragment;
import java.util.List;

/* renamed from: o.TouchPointService */
public final /* synthetic */ class TouchPointService implements Runnable {
    private final /* synthetic */ BilledTabFragment read;
    private final /* synthetic */ List write;

    public /* synthetic */ TouchPointService(BilledTabFragment billedTabFragment, List list) {
        this.read = billedTabFragment;
        this.write = list;
    }

    public final void run() {
        BilledTabFragment billedTabFragment = this.read;
        List list = this.write;
        CreditCardDetailBilledAdapter creditCardDetailBilledAdapter = billedTabFragment.IconCompatParcelizer;
        creditCardDetailBilledAdapter.read.clear();
        creditCardDetailBilledAdapter.read.addAll(list);
        creditCardDetailBilledAdapter.IconCompatParcelizer.write();
    }
}

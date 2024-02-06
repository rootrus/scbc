package p040o;

import com.scb.phone.R;

/* renamed from: o.FragmentBuilder_BindCurrentCycleInfoFragmentt */
public class FragmentBuilder_BindCurrentCycleInfoFragmentt {
    public static getQrToPay MediaBrowserCompat$ItemReceiver(int i) {
        if (i == 0) {
            return new getQrToPay(R.drawable.ic_request_debit_card, R.string.debit_card_request_function);
        }
        if (i == 1) {
            return new getQrToPay(R.drawable.ic_activate_debit_card, R.string.debit_card_activate_function);
        }
        throw new IllegalArgumentException("Function not valid");
    }
}

package com.scb.phone.view.fragment.personallimit;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class PersonalLimitFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PersonalLimitFragment MediaBrowserCompat$ItemReceiver;

    public PersonalLimitFragment_ViewBinding(PersonalLimitFragment personalLimitFragment, View view) {
        super(personalLimitFragment, view);
        this.MediaBrowserCompat$ItemReceiver = personalLimitFragment;
        personalLimitFragment.mPersonalLimitScrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_detail_scrollview, "field 'mPersonalLimitScrollView'", NestedScrollView.class);
        personalLimitFragment.transfersRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_transfer, "field 'transfersRecyclerView'", RecyclerView.class);
        personalLimitFragment.recyclerViewDebits = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_debits, "field 'recyclerViewDebits'", RecyclerView.class);
        personalLimitFragment.billPaymentValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_payment_limit_value, "field 'billPaymentValue'", TextView.class);
        personalLimitFragment.topUpLimitValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.top_up_limit_value, "field 'topUpLimitValue'", TextView.class);
        personalLimitFragment.layoutCardless = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_cardless, "field 'layoutCardless'", LinearLayout.class);
        personalLimitFragment.layoutCardlessDeposits = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_cardless_deposits, "field 'layoutCardlessDeposits'", LinearLayout.class);
        personalLimitFragment.cardlessTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_title, "field 'cardlessTitle'", TextView.class);
        personalLimitFragment.prepaidLimitTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_title, "field 'prepaidLimitTitle'", TextView.class);
        personalLimitFragment.prepaidLimitLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_layout, "field 'prepaidLimitLayout'", LinearLayout.class);
        personalLimitFragment.prepaidLimitValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_limit_value, "field 'prepaidLimitValue'", TextView.class);
        personalLimitFragment.cardlessLimitValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_limit_value, "field 'cardlessLimitValue'", TextView.class);
        personalLimitFragment.cardlessCreditCardLimitValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_credit_card_limit_value, "field 'cardlessCreditCardLimitValue'", TextView.class);
        personalLimitFragment.cardlessSpeedyCashLimitValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_speedy_cash_limit_value, "field 'cardlessSpeedyCashLimitValue'", TextView.class);
        personalLimitFragment.layoutDebitCard = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_debit_card, "field 'layoutDebitCard'", LinearLayout.class);
        personalLimitFragment.layoutCardlessCreditCard = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_cardless_credit_card, "field 'layoutCardlessCreditCard'", LinearLayout.class);
        personalLimitFragment.layoutCardlessSpeedyCash = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_cardless_speedy_cash, "field 'layoutCardlessSpeedyCash'", LinearLayout.class);
        personalLimitFragment.recyclerViewRemittance = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_remittance, "field 'recyclerViewRemittance'", RecyclerView.class);
        personalLimitFragment.layoutRemittance = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_remittance, "field 'layoutRemittance'", LinearLayout.class);
    }

    public final void read() {
        PersonalLimitFragment personalLimitFragment = this.MediaBrowserCompat$ItemReceiver;
        if (personalLimitFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            personalLimitFragment.mPersonalLimitScrollView = null;
            personalLimitFragment.transfersRecyclerView = null;
            personalLimitFragment.recyclerViewDebits = null;
            personalLimitFragment.billPaymentValue = null;
            personalLimitFragment.topUpLimitValue = null;
            personalLimitFragment.layoutCardless = null;
            personalLimitFragment.layoutCardlessDeposits = null;
            personalLimitFragment.cardlessTitle = null;
            personalLimitFragment.prepaidLimitTitle = null;
            personalLimitFragment.prepaidLimitLayout = null;
            personalLimitFragment.prepaidLimitValue = null;
            personalLimitFragment.cardlessLimitValue = null;
            personalLimitFragment.cardlessCreditCardLimitValue = null;
            personalLimitFragment.cardlessSpeedyCashLimitValue = null;
            personalLimitFragment.layoutDebitCard = null;
            personalLimitFragment.layoutCardlessCreditCard = null;
            personalLimitFragment.layoutCardlessSpeedyCash = null;
            personalLimitFragment.recyclerViewRemittance = null;
            personalLimitFragment.layoutRemittance = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}

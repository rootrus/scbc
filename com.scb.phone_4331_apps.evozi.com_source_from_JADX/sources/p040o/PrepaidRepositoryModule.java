package p040o;

import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.PrepaidRepositoryModule */
public enum PrepaidRepositoryModule {
    ACCOUNT_SUMMARY(R.drawable.ic_account_summary_lg, R.string.banking_actions_account_summary, true),
    BANKING_AGENT(R.drawable.ic_banking_agent, R.string.banking_actions_banking_agent, true),
    PERSONAL_LIMIT(R.drawable.ic_manage_personal_limit_lg, R.string.banking_actions_personal_limit, false),
    REQUEST_TO_PAY(R.drawable.ic_request_to_pay_lg, R.string.banking_actions_request_pay_new, true),
    CARDLESS_ATM(R.drawable.ic_cardless_atm_lg, R.string.banking_actions_cardless_atm, true),
    SCAN(R.drawable.ic_scan_lg, R.string.banking_actions_scan, true),
    TOP_UP(R.drawable.ic_top_up_lg, R.string.banking_actions_topup, true),
    TRANSFER(R.drawable.ic_transfer_lg, R.string.banking_actions_transfer, true),
    BILL_PAYMENT(R.drawable.ic_bill_payment_lg, R.string.banking_actions_bill_payment, true),
    CHEQUE_STATUS(R.drawable.ic_cheque_status, R.string.banking_actions_cheque_status, true),
    BULK_TRANSFER(R.drawable.ic_bulk_transfer, R.string.banking_actions_bulk_transfer, true),
    INVESTMENT(R.drawable.ic_investment, R.string.banking_actions_investments, true),
    BOND(R.drawable.ic_bond, R.string.bond_landing_title, false),
    SCB_CONNECT(R.drawable.ic_scb_connect, R.string.banking_actions_scb_connect, true),
    DEBIT_CARD(R.drawable.ic_debit_card, R.string.debit_card_banking_action, true),
    OPEN_DEPOSIT_ACCOUNT(R.drawable.ic_open_deposit, R.string.banking_actions_open_deposit_account, true),
    MANAGE_PROMPT_PAY(R.drawable.ic_manage_promp_pay_lg, R.string.banking_actions_prompt_pay, false),
    REMITTANCE(R.drawable.ic_remittance, R.string.banking_actions_remittance, true);
    
    private static final List<PrepaidRepositoryModule> individualSortedActions = null;
    private static final List<PrepaidRepositoryModule> juristicSortedActions = null;
    private boolean enabled;
    public final int icon;
    public final boolean shown;
    public final int title;

    static {
        individualSortedActions = new ArrayList();
        juristicSortedActions = new ArrayList();
        individualSortedActions.add(ACCOUNT_SUMMARY);
        individualSortedActions.add(CARDLESS_ATM);
        individualSortedActions.add(SCAN);
        individualSortedActions.add(TOP_UP);
        individualSortedActions.add(TRANSFER);
        individualSortedActions.add(BILL_PAYMENT);
        individualSortedActions.add(INVESTMENT);
        individualSortedActions.add(BULK_TRANSFER);
        individualSortedActions.add(REMITTANCE);
        individualSortedActions.add(REQUEST_TO_PAY);
        individualSortedActions.add(BANKING_AGENT);
        individualSortedActions.add(SCB_CONNECT);
        individualSortedActions.add(CHEQUE_STATUS);
        individualSortedActions.add(DEBIT_CARD);
        individualSortedActions.add(OPEN_DEPOSIT_ACCOUNT);
        juristicSortedActions.add(ACCOUNT_SUMMARY);
        juristicSortedActions.add(TRANSFER);
        juristicSortedActions.add(BULK_TRANSFER);
        juristicSortedActions.add(TOP_UP);
        juristicSortedActions.add(BILL_PAYMENT);
        juristicSortedActions.add(SCAN);
        juristicSortedActions.add(CHEQUE_STATUS);
    }

    private PrepaidRepositoryModule(int i, int i2, boolean z) {
        this.icon = i;
        this.title = i2;
        this.shown = z;
    }
}

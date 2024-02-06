package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getMarker */
public enum getMarker {
    TRANSFER_FROM_ALLOWED(setFlat.TRANSFER_FROM, "TRANSFER_SOURCE"),
    TRANSFER_TO_ALLOWED(setFlat.TRANSFER_TO, "TRANSFER_TARGET"),
    TOP_UP_ALLOWED(setFlat.TOP_UP, "TOPUP_SOURCE"),
    BILL_PAYMENT_ALLOWED(setFlat.BILL_PAYMENT, "BILLPAY_SOURCE"),
    QUICK_PROMPT_PAY_ALLOWED(setFlat.QUICK_PROMPT_PAY, "QUICK_PROMPTPAY"),
    QUICK_QUICK_BALANCE_ALLOWED(setFlat.QUICK_BALANCE, "QUICK_BALANCE"),
    CARDLESS_ATM_ALLOWED(setFlat.CARDLESS_ATM, "CARDLESS_ATM_SOURCE"),
    CHEQUE_STATUS_ISSUE_ALLOWED(setFlat.CHEQUE_STATUS_ISSUED, "DISPLAY_ISSUE_CHEQUE"),
    CHEQUE_STATUS_RECEIVE_ALLOWED(setFlat.CHEQUE_STATUS_RECEIVED, "DISPLAY_RECEIVE_CHEQUE"),
    STOP_CHEQUE_STATUS_ALLOWED(setFlat.STOP_CHEQUE_STATUS, "DISPLAY_STOP_CHEQUE"),
    ACTIVATE_ORDER_CHEQUE_ALLOWED(setFlat.ACTIVATE_ORDER_CHEQUE, "DISPLAY_ORDER_CHEQUE"),
    LOAN_FROM_ALLOWED(setFlat.LOAN_PAYMENT, "LOANPAY_SOURCE"),
    EDONATION_SOURCE(setFlat.E_DONATION, "EDONATION_SOURCE"),
    ETB_OPENING_ACCOUNT_SOURCE(setFlat.ETB_SET_ACCOUNT_DETAIL_SOURCE, "ETB_OPENING_ACCOUNT_SOURCE"),
    ETB_OPENING_ACCOUNT_MAIN(setFlat.ETB_SET_ACCOUNT_DETAIL_MAIN, "ETB_OPENING_ACCOUNT_MAIN"),
    DEEJUNG_TRANSFER_TARGET(setFlat.DEEJUNG_TRANSFER, "DEEJUNG_TRANSFER_TARGET"),
    BOND_ALLOWED(setFlat.BOND, "BOND_SOURCE"),
    FASTPAY_SOURCE(setFlat.FAST_PAY, "FASTPAY_SOURCE"),
    DEBIT_CARD_REQUEST_ALLOWED(setFlat.DEBIT_CARD, "DEBIT_CARD_REQUEST_SOURCE"),
    CLOSE_ACCOUNT_TARGET_ALLOWED(setFlat.CLOSE_ACCOUNT_TARGET, "CLOSE_ACCOUNT_TARGET"),
    EXPORT_STATEMENT_ALLOWED(setFlat.EXPORT_STATEMENT, "EXPORT_STATEMENT"),
    DIRECT_DEBIT_SOURCE_ALLOWED(setFlat.DIRECT_DEBIT_SOURCE, "DIRECT_DEBIT_SOURCE");
    
    public static final getMarker$MediaBrowserCompat$ItemReceiver Companion = null;
    @SerializedName("allow")
    public final String allow;
    @SerializedName("function")
    final setFlat function;

    public static final getMarker IconCompatParcelizer(setFlat setflat) {
        return getMarker$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(setflat);
    }

    private getMarker(setFlat setflat, String str) {
        this.function = setflat;
        this.allow = str;
    }

    static {
        Companion = new getMarker$MediaBrowserCompat$ItemReceiver((byte) 0);
    }
}

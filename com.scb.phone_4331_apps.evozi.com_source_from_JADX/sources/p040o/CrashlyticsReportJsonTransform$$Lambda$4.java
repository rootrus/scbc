package p040o;

/* renamed from: o.CrashlyticsReportJsonTransform$$Lambda$4 */
public enum CrashlyticsReportJsonTransform$$Lambda$4 {
    TOP_UP_FUNCTION("TOPUP", r0),
    TRANSFER_FUNCTION("TRANSFER", r0),
    TRANSFER_AND_FIXED_TRANSFER_FUNCTION("TRANSFER_AND_FIXED_TRANSFER", r0),
    BILL_PAYMENT_FUNCTION("BILLPAYMENT", r0),
    CARDLESS_ATM_FUNCTION("CARDLESS", r1),
    CHEQUE_STATUS_RECEIVED_FUNCTION("DISPLAY_RECEIVE_CHEQUE", r1),
    CHEQUE_STATUS_ISSUED_FUNCTION("DISPLAY_ISSUE_CHEQUE", r1),
    LOAN_PAYMENT_FUNCTION("LOANPAYMENT", r1),
    STOP_CHEQUE_STATUS_FUNCTION("DISPLAY_STOP_CHEQUE", r1),
    E_DONATION_FUNCTION("E_DONATION_FUNCTION", r0),
    ACTIVATE_ORDER_CHEQUE_FUNCTION("DISPLAY_ORDER_CHEQUE", r1),
    BOND_FUNCTION("BOND", r1),
    ETB_SET_ACCOUNT_DETAIL_SOURCE_FUNCTION("ETB_SET_ACCOUNT_DETAIL_SOURCE", r1),
    ETB_SET_ACCOUNT_DETAIL_MAIN_FUNCTION("ETB_SET_ACCOUNT_DETAIL_MAIN", r1),
    FAST_PAY_FUNCTION("FAST_PAY_FUNCTION", r1),
    UNKNOWN_FUNCTION("UNKNOWN_FUNCTION", r1),
    DEEJUNG_TRANSFER_FUNCTION("DEEJUNG_TRANSFER_FUNCTION", r1),
    DEBIT_CARD_FUNCTION("DEBIT_CARD", r1),
    BSCANC_SOURCE_FUNCTION("BSCANC_SOURCE_FUNCTION", r1),
    PREPAID_CARD_REQUEST_SOURCE_FUNCTION("PREPAID_CARD_REQUEST_SOURCE", r1),
    REMITTANCE_FUNCTION("REMITTANCE", r1),
    DIRECT_DEBIT_SOURCE_FUNCTION("DIRECT_DEBIT_SOURCE", r1);
    
    private String functionValue;
    public Boolean showDisclaimerValue;

    private CrashlyticsReportJsonTransform$$Lambda$4(String str, Boolean bool) {
        this.functionValue = str;
        this.showDisclaimerValue = bool;
    }

    public final String toString() {
        return this.functionValue;
    }

    public static CrashlyticsReportJsonTransform$$Lambda$4 MediaBrowserCompat$ItemReceiver(String str) {
        for (CrashlyticsReportJsonTransform$$Lambda$4 crashlyticsReportJsonTransform$$Lambda$4 : values()) {
            if (crashlyticsReportJsonTransform$$Lambda$4.functionValue.equalsIgnoreCase(str)) {
                return crashlyticsReportJsonTransform$$Lambda$4;
            }
        }
        return UNKNOWN_FUNCTION;
    }
}

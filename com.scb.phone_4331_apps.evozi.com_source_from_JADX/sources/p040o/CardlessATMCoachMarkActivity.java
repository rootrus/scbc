package p040o;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;

/* renamed from: o.CardlessATMCoachMarkActivity */
public final class CardlessATMCoachMarkActivity extends btnReturnClicked {
    private final BillPaymentSearchActivity MediaBrowserCompat$CustomActionResultReceiver;
    private write read;
    private String write;

    /* renamed from: o.CardlessATMCoachMarkActivity$write */
    enum write {
        UNINITIATED,
        CHALLENGE_RECEIVED,
        MSG_TYPE1_GENERATED,
        MSG_TYPE2_RECEVIED,
        MSG_TYPE3_GENERATED,
        FAILED
    }

    public final String IconCompatParcelizer() {
        return null;
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public final String read() {
        return "ntlm";
    }

    private CardlessATMCoachMarkActivity(BillPaymentSearchActivity billPaymentSearchActivity) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(billPaymentSearchActivity, "NTLM engine");
        this.MediaBrowserCompat$CustomActionResultReceiver = billPaymentSearchActivity;
        this.read = write.UNINITIATED;
        this.write = null;
    }

    public CardlessATMCoachMarkActivity() {
        this(new RtpEBillPaymentDetailActivity());
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, int i, int i2) throws MalformedChallengeException {
        String write2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(i, i2);
        this.write = write2;
        if (write2.isEmpty()) {
            if (this.read == write.UNINITIATED) {
                this.read = write.CHALLENGE_RECEIVED;
            } else {
                this.read = write.FAILED;
            }
        } else if (this.read.compareTo(write.MSG_TYPE1_GENERATED) < 0) {
            this.read = write.FAILED;
            throw new MalformedChallengeException("Out of sequence NTLM response message");
        } else if (this.read == write.MSG_TYPE1_GENERATED) {
            this.read = write.MSG_TYPE2_RECEVIED;
        }
    }

    public final PrepaidRequestMarketConductActivity IconCompatParcelizer(PurchaseReviewActivity purchaseReviewActivity, PrivacyConsentActivity privacyConsentActivity) throws AuthenticationException {
        String str;
        if (this.read != write.FAILED) {
            if (this.read == write.CHALLENGE_RECEIVED) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.write();
                this.read = write.MSG_TYPE1_GENERATED;
            } else if (this.read == write.MSG_TYPE2_RECEVIED) {
                str = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((String) null, (String) null, (String) null, (String) null, this.write);
                this.read = write.MSG_TYPE3_GENERATED;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected state: ");
                sb.append(this.read);
                throw new AuthenticationException(sb.toString());
            }
            DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(32);
            if (write()) {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read("Proxy-Authorization");
            } else {
                depositTransactionAdapter$ChildViewHolder_ViewBinding.read("Authorization");
            }
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(": NTLM ");
            depositTransactionAdapter$ChildViewHolder_ViewBinding.read(str);
            return new AmountDetailsAdapter$SuccessRow(depositTransactionAdapter$ChildViewHolder_ViewBinding);
        }
        throw new AuthenticationException("NTLM authentication failed");
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return this.read == write.MSG_TYPE3_GENERATED || this.read == write.FAILED;
    }
}

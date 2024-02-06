package p039io.beid.beidk.messages.transaction;

import p040o.rsnAllocationCreateBitmapBackedAllocation;
import p040o.rsnAllocationIoSend;

/* renamed from: io.beid.beidk.messages.transaction.MatchingForm */
public class MatchingForm extends rsnAllocationCreateBitmapBackedAllocation {
    @rsnAllocationIoSend
    public String faceSelfie;
    @rsnAllocationIoSend
    public String transactionId;

    public MatchingForm setFaceSelfie(String str) {
        this.faceSelfie = str;
        return this;
    }

    public MatchingForm setTransactionId(String str) {
        this.transactionId = str;
        return this;
    }
}

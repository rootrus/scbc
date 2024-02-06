package p039io.beid.beidk.messages.transaction;

import p040o.rsnAllocationCreateBitmapBackedAllocation;
import p040o.rsnAllocationIoSend;

/* renamed from: io.beid.beidk.messages.transaction.PassportVerifyForm */
public class PassportVerifyForm extends rsnAllocationCreateBitmapBackedAllocation {
    @rsnAllocationIoSend
    public String DG1;
    @rsnAllocationIoSend
    public String DG13;
    @rsnAllocationIoSend
    public String DG2;
    @rsnAllocationIoSend
    public String SOD;
    @rsnAllocationIoSend
    public String transactionId;

    public PassportVerifyForm setDg1(String str) {
        this.DG1 = str;
        return this;
    }

    public PassportVerifyForm setDg13(String str) {
        this.DG13 = str;
        return this;
    }

    public PassportVerifyForm setDg2(String str) {
        this.DG2 = str;
        return this;
    }

    public PassportVerifyForm setSod(String str) {
        this.SOD = str;
        return this;
    }

    public PassportVerifyForm setTransactionId(String str) {
        this.transactionId = str;
        return this;
    }
}

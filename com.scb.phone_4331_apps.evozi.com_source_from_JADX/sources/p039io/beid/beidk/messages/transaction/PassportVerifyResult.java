package p039io.beid.beidk.messages.transaction;

import p040o.rsnAllocationCreateBitmapBackedAllocation;
import p040o.rsnAllocationIoSend;

/* renamed from: io.beid.beidk.messages.transaction.PassportVerifyResult */
public class PassportVerifyResult extends rsnAllocationCreateBitmapBackedAllocation {
    @rsnAllocationIoSend
    public String error;
    @rsnAllocationIoSend
    public String errorCode;
    @rsnAllocationIoSend
    public String result;
}

package p039io.beid.beidk.messages.transaction;

import java.util.List;
import p040o.rsnAllocationCreateBitmapBackedAllocation;
import p040o.rsnAllocationIoSend;

/* renamed from: io.beid.beidk.messages.transaction.TransactionBeginResult */
public class TransactionBeginResult extends rsnAllocationCreateBitmapBackedAllocation {
    @rsnAllocationIoSend
    public String error;
    @rsnAllocationIoSend
    public Integer livenessAcceptance;
    @rsnAllocationIoSend
    public List<Integer> livenessActivity;
    @rsnAllocationIoSend
    public String serverTimestamp;
    @rsnAllocationIoSend
    public String timeout;
    @rsnAllocationIoSend
    public String transactionId;
}

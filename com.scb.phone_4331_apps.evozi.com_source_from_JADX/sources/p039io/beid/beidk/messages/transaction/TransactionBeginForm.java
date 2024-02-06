package p039io.beid.beidk.messages.transaction;

import p040o.rsnAllocationCreateBitmapBackedAllocation;
import p040o.rsnAllocationIoSend;

/* renamed from: io.beid.beidk.messages.transaction.TransactionBeginForm */
public class TransactionBeginForm extends rsnAllocationCreateBitmapBackedAllocation {
    @rsnAllocationIoSend
    public String applicationName;
    @rsnAllocationIoSend
    public String deviceId;
    @rsnAllocationIoSend
    public String platformId;
    @rsnAllocationIoSend
    public String sdkVersion;

    public TransactionBeginForm() {
        this.sdkVersion = "n/a";
    }

    public TransactionBeginForm(TransactionBeginForm transactionBeginForm) {
        setDeviceId(transactionBeginForm.deviceId).setPlatformId(transactionBeginForm.platformId).setSdkVersion(transactionBeginForm.sdkVersion).setApplicationName(transactionBeginForm.applicationName);
    }

    public TransactionBeginForm setApplicationName(String str) {
        this.applicationName = str;
        return this;
    }

    public TransactionBeginForm setDeviceId(String str) {
        this.deviceId = str;
        return this;
    }

    public TransactionBeginForm setPlatformId(String str) {
        this.platformId = str;
        return this;
    }

    public TransactionBeginForm setSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }
}

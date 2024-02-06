package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.getContainerId */
public final class getContainerId {
    @SerializedName("instPaymentInfo")
    public onStartCommand read;
    @SerializedName("transactionInfo")
    public getJobId write;

    public getContainerId() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getContainerId)) {
            return false;
        }
        getContainerId getcontainerid = (getContainerId) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcontainerid.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcontainerid.read);
    }

    public final int hashCode() {
        getJobId getjobid = this.write;
        int i = 0;
        int hashCode = getjobid != null ? getjobid.hashCode() : 0;
        onStartCommand onstartcommand = this.read;
        if (onstartcommand != null) {
            i = onstartcommand.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransactionResponse(transactionInfo=");
        sb.append(this.write);
        sb.append(", instPaymentInfo=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getContainerId(getJobId getjobid, onStartCommand onstartcommand) {
        this.write = getjobid;
        this.read = onstartcommand;
    }

    private /* synthetic */ getContainerId(byte b) {
        this((getJobId) null, (onStartCommand) null);
    }
}

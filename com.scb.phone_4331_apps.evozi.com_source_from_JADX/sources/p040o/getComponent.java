package p040o;

import java.util.List;
import p039io.beid.beidk.definitions.BeIDParams;
import p040o.ForwardingCheckedFuture;

/* renamed from: o.getComponent */
public final class getComponent extends ForwardingCheckedFuture.SimpleForwardingCheckedFuture {
    public final standardStopAndWait IconCompatParcelizer;
    public final addDependency MediaBrowserCompat$CustomActionResultReceiver;
    public final MissingDependencyException MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$MediaItem;
    public final String RatingCompat;
    public final String read;
    public final List<addDependent> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getComponent)) {
            return false;
        }
        getComponent getcomponent = (getComponent) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) getcomponent.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) getcomponent.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) getcomponent.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcomponent.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcomponent.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcomponent.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) getcomponent.read);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$MediaItem;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RatingCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        standardStopAndWait standardstopandwait = this.IconCompatParcelizer;
        int hashCode3 = standardstopandwait != null ? standardstopandwait.hashCode() : 0;
        addDependency adddependency = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = adddependency != null ? adddependency.hashCode() : 0;
        MissingDependencyException missingDependencyException = this.MediaBrowserCompat$ItemReceiver;
        int hashCode5 = missingDependencyException != null ? missingDependencyException.hashCode() : 0;
        List<addDependent> list = this.write;
        int hashCode6 = list != null ? list.hashCode() : 0;
        String str3 = this.read;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CloseAccountSuccessDisplay(transactionId=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", transactionDateTime=");
        sb.append(this.RatingCompat);
        sb.append(", successInformation=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", amountDataDisplay=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", receivingAccountDataDisplay=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", subDeposits=");
        sb.append(this.write);
        sb.append(", filename=");
        sb.append(this.read);
        sb.append(")");
        return sb.toString();
    }

    public getComponent(String str, String str2, standardStopAndWait standardstopandwait, addDependency adddependency, MissingDependencyException missingDependencyException, List<addDependent> list, String str3) {
        onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
        onGetStartedClick.write((Object) str2, "transactionDateTime");
        onGetStartedClick.write((Object) standardstopandwait, "successInformation");
        onGetStartedClick.write((Object) adddependency, "amountDataDisplay");
        onGetStartedClick.write((Object) missingDependencyException, "receivingAccountDataDisplay");
        onGetStartedClick.write((Object) list, "subDeposits");
        onGetStartedClick.write((Object) str3, "filename");
        this.MediaBrowserCompat$MediaItem = str;
        this.RatingCompat = str2;
        this.IconCompatParcelizer = standardstopandwait;
        this.MediaBrowserCompat$CustomActionResultReceiver = adddependency;
        this.MediaBrowserCompat$ItemReceiver = missingDependencyException;
        this.write = list;
        this.read = str3;
    }
}

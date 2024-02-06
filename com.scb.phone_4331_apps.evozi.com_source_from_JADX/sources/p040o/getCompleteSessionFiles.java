package p040o;

import java.util.List;
import p040o.CrashlyticsReport;

/* renamed from: o.getCompleteSessionFiles */
public final class getCompleteSessionFiles {
    public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
    public final CrashlyticsReport.Session.Event.Application.Execution.Exception MediaBrowserCompat$ItemReceiver;
    public final lambda$processSetComponents$1 write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCompleteSessionFiles)) {
            return false;
        }
        getCompleteSessionFiles getcompletesessionfiles = (getCompleteSessionFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getcompletesessionfiles.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) getcompletesessionfiles.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) getcompletesessionfiles.write);
    }

    public final int hashCode() {
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = exception != null ? exception.hashCode() : 0;
        lambda$processSetComponents$1 lambda_processsetcomponents_1 = this.write;
        if (lambda_processsetcomponents_1 != null) {
            i = lambda_processsetcomponents_1.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InitiatePaymentDisplay(partnerSubTypes=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", billPaymentPartnerDisplay=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", purchaseSourceOfFundDisplay=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public getCompleteSessionFiles(List<String> list, CrashlyticsReport.Session.Event.Application.Execution.Exception exception, lambda$processSetComponents$1 lambda_processsetcomponents_1) {
        onGetStartedClick.write((Object) list, "partnerSubTypes");
        onGetStartedClick.write((Object) exception, "billPaymentPartnerDisplay");
        onGetStartedClick.write((Object) lambda_processsetcomponents_1, "purchaseSourceOfFundDisplay");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.MediaBrowserCompat$ItemReceiver = exception;
        this.write = lambda_processsetcomponents_1;
    }
}

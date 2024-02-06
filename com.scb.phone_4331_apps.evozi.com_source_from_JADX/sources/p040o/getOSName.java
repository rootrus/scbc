package p040o;

import android.text.TextUtils;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.getOSName */
public final /* synthetic */ class getOSName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getTaskReturnValue write;

    public /* synthetic */ getOSName(getTaskReturnValue gettaskreturnvalue, AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder) {
        this.write = gettaskreturnvalue;
        this.MediaBrowserCompat$CustomActionResultReceiver = crashlyticsReportSessionEventApplicationExecutionSignalEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTaskReturnValue gettaskreturnvalue = this.write;
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = this.MediaBrowserCompat$CustomActionResultReceiver;
        getHighestVersion gethighestversion = (getHighestVersion) obj;
        gettaskreturnvalue.IconCompatParcelizer.write();
        gethighestversion.MediaBrowserCompat$ItemReceiver(crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        gethighestversion.MediaBrowserCompat$ItemReceiver();
        String str = crashlyticsReportSessionEventApplicationExecutionSignalEncoder.read.IconCompatParcelizer;
        if (!TextUtils.isEmpty(str)) {
            gethighestversion.MediaBrowserCompat$SearchResultReceiver(str);
        } else {
            gethighestversion.read();
        }
    }
}

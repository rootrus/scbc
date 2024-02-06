package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.CharMatcher;

/* renamed from: o.getTaskReturnValue */
public class getTaskReturnValue extends writeUInt64NoTag<getHighestVersion> {
    public final CharMatcher.LookupTable IconCompatParcelizer;
    public AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationExecutionSignalEncoder read;
    public final Enums write;

    @HmlPinActivity
    public getTaskReturnValue(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.LookupTable lookupTable, Enums enums) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = lookupTable;
        this.write = enums;
    }

    static /* synthetic */ void IconCompatParcelizer(String str, getHighestVersion gethighestversion) {
        if (!str.isEmpty()) {
            gethighestversion.MediaDescriptionCompat(str);
        } else {
            gethighestversion.MediaBrowserCompat$ItemReceiver();
        }
        gethighestversion.aj_();
    }

    public static /* synthetic */ void write(getTaskReturnValue gettaskreturnvalue, getHighestVersion gethighestversion) {
        if (gettaskreturnvalue.read.MediaBrowserCompat$CustomActionResultReceiver != null) {
            gethighestversion.read(gettaskreturnvalue.read.MediaBrowserCompat$CustomActionResultReceiver.read);
        }
    }
}

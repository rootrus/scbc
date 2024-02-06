package p040o;

import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.setCreationTime */
public final /* synthetic */ class setCreationTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AutoCrashlyticsReportEncoder.C3048x99c932db IconCompatParcelizer;

    public /* synthetic */ setCreationTime(AutoCrashlyticsReportEncoder.C3048x99c932db crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder) {
        this.IconCompatParcelizer = crashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IIdExtractionListener) obj).read(this.IconCompatParcelizer);
    }
}

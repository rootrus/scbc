package p040o;

import org.threeten.p041bp.OffsetDateTime;
import p040o.getImageWidth;
import p040o.isProximityOn;
import p040o.writeUInt64NoTag;

/* renamed from: o.getGuidanceFrameThickness */
public final /* synthetic */ class getGuidanceFrameThickness implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ OffsetDateTime MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ setDiagnosticsViewEnabled read;

    public /* synthetic */ getGuidanceFrameThickness(setDiagnosticsViewEnabled setdiagnosticsviewenabled, OffsetDateTime offsetDateTime) {
        this.read = setdiagnosticsviewenabled;
        this.MediaBrowserCompat$ItemReceiver = offsetDateTime;
    }

    public final void IconCompatParcelizer(Object obj) {
        setDiagnosticsViewEnabled setdiagnosticsviewenabled = this.read;
        getImageWidth.IconCompatParcelizer.read read2 = (getImageWidth.IconCompatParcelizer.read) obj;
        read2.read(this.MediaBrowserCompat$ItemReceiver);
        read2.MediaBrowserCompat$CustomActionResultReceiver(true);
        isProximityOn.read read3 = isProximityOn.read();
        read3.write = "O";
        OffsetDateTime offsetDateTime = setdiagnosticsviewenabled.IconCompatParcelizer;
        read3.MediaBrowserCompat$ItemReceiver = offsetDateTime != null ? CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(offsetDateTime.toString()) : "";
        read2.read(new isProximityOn(read3, (byte) 0));
    }
}

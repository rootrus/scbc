package p040o;

import java.util.List;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTargetFrame */
public final /* synthetic */ class getTargetFrame implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setImageFileRepresentation IconCompatParcelizer;
    private final /* synthetic */ canTryConnection read;

    public /* synthetic */ getTargetFrame(setImageFileRepresentation setimagefilerepresentation, canTryConnection cantryconnection) {
        this.IconCompatParcelizer = setimagefilerepresentation;
        this.read = cantryconnection;
    }

    public final void IconCompatParcelizer(Object obj) {
        setImageFileRepresentation setimagefilerepresentation = this.IconCompatParcelizer;
        canTryConnection cantryconnection = this.read;
        CheckExtractActivity_MembersInjector.AppCompatDialogFragment appCompatDialogFragment = (CheckExtractActivity_MembersInjector.AppCompatDialogFragment) obj;
        appCompatDialogFragment.IconCompatParcelizer((List<CrashlyticsReport.FilesPayload.File.Builder>) isStrictlyOrdered.MediaBrowserCompat$ItemReceiver(cantryconnection.read, new getImageOutputColor(setimagefilerepresentation)));
        appCompatDialogFragment.MediaBrowserCompat$ItemReceiver((List<CrashlyticsReport.FilesPayload.File.Builder>) isStrictlyOrdered.MediaBrowserCompat$ItemReceiver(cantryconnection.MediaMetadataCompat, new getImageQuickAnalysisFeedBack(setimagefilerepresentation)));
    }
}

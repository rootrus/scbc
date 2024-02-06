package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_GetIExtractionServerRttiFactory;
import p040o.standardStartAndWait;

/* renamed from: o.getSessionEventSize */
public class getSessionEventSize<T extends CheckCaptureModule_GetIExtractionServerRttiFactory> extends writeUInt64NoTag<T> {
    public standardStartAndWait IconCompatParcelizer;
    logEventNoInterceptor MediaBrowserCompat$ItemReceiver;

    @HmlPinActivity
    public getSessionEventSize(RegularImmutableBiMap regularImmutableBiMap, logEventNoInterceptor logeventnointerceptor) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = logeventnointerceptor;
    }

    public final void read(standardStartAndWait standardstartandwait, List<getUserId> list) {
        this.IconCompatParcelizer = standardstartandwait;
        boolean z = true;
        if (standardstartandwait != null) {
            write(standardstartandwait.MediaBrowserCompat$MediaItem, writeRawVarint64.MediaBrowserCompat$CustomActionResultReceiver);
            ByteString byteString = new ByteString(this, standardstartandwait);
            if (this.RatingCompat != null) {
                byteString.IconCompatParcelizer(this.RatingCompat);
            }
            write(standardstartandwait.RatingCompat, new computeRawVarint32Size(standardstartandwait));
            write(standardstartandwait.IconCompatParcelizer != null && !standardstartandwait.IconCompatParcelizer.isEmpty(), new computeBytesSize(standardstartandwait));
            write(standardstartandwait.MediaMetadataCompat != null && !standardstartandwait.MediaMetadataCompat.isEmpty(), new computeInt32SizeNoTag(standardstartandwait));
            write(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.setShortcut(), new closeInProgressStream(standardstartandwait));
            MediaBrowserCompat$CustomActionResultReceiver(standardstartandwait.write);
            MediaBrowserCompat$CustomActionResultReceiver(standardstartandwait);
            if (list != null) {
                computeBoolSize computeboolsize = new computeBoolSize(list);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    computeboolsize.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        computeEnumSize computeenumsize = computeEnumSize.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            computeenumsize.IconCompatParcelizer(this.RatingCompat);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(List<sanitizeAttribute> list) {
        if (list != null) {
            computeBytesSizeNoTag computebytessizenotag = new computeBytesSizeNoTag(list);
            if (this.RatingCompat != null) {
                computebytessizenotag.IconCompatParcelizer(this.RatingCompat);
            }
            for (int i = 0; i < list.size(); i++) {
                computeBoolSizeNoTag computeboolsizenotag = new computeBoolSizeNoTag(list.get(i));
                if (this.RatingCompat != null) {
                    computeboolsizenotag.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }

    public static standardStartAndWait write(standardStartAndWait standardstartandwait) {
        if (!standardstartandwait.MediaBrowserCompat$ItemReceiver) {
            return standardstartandwait;
        }
        ArrayList arrayList = new ArrayList(standardstartandwait.MediaDescriptionCompat);
        arrayList.add(new callTask());
        standardStartAndWait.IconCompatParcelizer write = standardStartAndWait.write(arrayList, standardstartandwait.read);
        write.MediaDescriptionCompat = standardstartandwait.MediaMetadataCompat;
        write.MediaBrowserCompat$ItemReceiver = standardstartandwait.IconCompatParcelizer;
        return write.read();
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(standardStartAndWait standardstartandwait) {
        List<ForwardingFuture> list = standardstartandwait.MediaDescriptionCompat;
        boolean z = false;
        if (!list.isEmpty()) {
            ForwardingFuture forwardingFuture = list.get(list.size() - 1);
            if (forwardingFuture instanceof SessionReportingCoordinator$$Lambda$1) {
                SessionReportingCoordinator$$Lambda$1 sessionReportingCoordinator$$Lambda$1 = (SessionReportingCoordinator$$Lambda$1) forwardingFuture;
                if (!sessionReportingCoordinator$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() && sessionReportingCoordinator$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver.get(sessionReportingCoordinator$$Lambda$1.MediaBrowserCompat$CustomActionResultReceiver.size() - 1).read != null) {
                    newInput newinput = newInput.read;
                    if (this.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        newinput.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                }
            }
        }
        CodedOutputStream codedOutputStream = CodedOutputStream.write;
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            codedOutputStream.IconCompatParcelizer(this.RatingCompat);
        }
    }
}

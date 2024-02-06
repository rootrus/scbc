package p040o;

import p040o.CheckCaptureModule;
import p040o.buildSessionDataFrom;
import p040o.writeUInt64NoTag;

/* renamed from: o.ReportUploader */
public final /* synthetic */ class ReportUploader implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ ReportUploader read = new ReportUploader();

    /* renamed from: o.ReportUploader$Provider */
    public final /* synthetic */ class Provider implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Provider MediaBrowserCompat$CustomActionResultReceiver = new Provider();

        private /* synthetic */ Provider() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule.C6375a.write) obj).write();
        }
    }

    private /* synthetic */ ReportUploader() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule$a$MediaBrowserCompat$MediaItem) obj).ax_();
    }

    /* renamed from: o.ReportUploader$ReportFilesProvider */
    public final /* synthetic */ class ReportFilesProvider implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ buildSessionDataFrom.IconCompatParcelizer write;

        public /* synthetic */ ReportFilesProvider(buildSessionDataFrom.IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule.C6375a.RatingCompat) obj).write(buildSessionDataFrom.this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.ReportUploader$Worker */
    public final /* synthetic */ class Worker implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String read;
        private final /* synthetic */ String write;

        public /* synthetic */ Worker(String str, String str2) {
            this.read = str;
            this.write = str2;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule.C6375a.MediaDescriptionCompat) obj).MediaBrowserCompat$ItemReceiver(this.read, this.write);
        }
    }

    /* renamed from: o.ReportUploader$HandlingExceptionCheck */
    public final /* synthetic */ class HandlingExceptionCheck implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ buildAppDataFrom$MediaBrowserCompat$CustomActionResultReceiver read;
        private final /* synthetic */ PlaceBufferResponse write;

        public /* synthetic */ HandlingExceptionCheck(buildAppDataFrom$MediaBrowserCompat$CustomActionResultReceiver buildappdatafrom_mediabrowsercompat_customactionresultreceiver, PlaceBufferResponse placeBufferResponse) {
            this.read = buildappdatafrom_mediabrowsercompat_customactionresultreceiver;
            this.write = placeBufferResponse;
        }

        public final void IconCompatParcelizer(Object obj) {
            buildAppDataFrom$MediaBrowserCompat$CustomActionResultReceiver buildappdatafrom_mediabrowsercompat_customactionresultreceiver = this.read;
            PlaceBufferResponse placeBufferResponse = this.write;
            CheckCaptureModule.C6375a.MediaDescriptionCompat mediaDescriptionCompat = (CheckCaptureModule.C6375a.MediaDescriptionCompat) obj;
            mediaDescriptionCompat.write(buildappdatafrom_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(placeBufferResponse));
            if (placeBufferResponse.read != null) {
                mediaDescriptionCompat.read(buildappdatafrom_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(placeBufferResponse.read, buildappdatafrom_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver));
            }
        }
    }
}

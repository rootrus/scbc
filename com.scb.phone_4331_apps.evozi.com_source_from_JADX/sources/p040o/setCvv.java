package p040o;

import java.util.List;
import p040o.CheckCaptureModule;
import p040o.GoogleMap;
import p040o.PlaceAutocomplete;

/* renamed from: o.setCvv */
public interface setCvv {

    /* renamed from: o.setCvv$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule.C1151b {
        void MediaBrowserCompat$CustomActionResultReceiver(remainingCapacity remainingcapacity);

        void MediaBrowserCompat$ItemReceiver();

        void MediaDescriptionCompat();

        void read();
    }

    /* renamed from: o.setCvv$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(List<access$2600> list);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(List<access$2600> list);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void MediaBrowserCompat$MediaItem();

        void RatingCompat();

        void read();

        void write();

        void write(copyToCodedOutputStream copytocodedoutputstream);

        void write(boolean z);
    }

    /* renamed from: o.setCvv$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver(List<setFiles> list);

        void read(List<setFiles> list);

        void read(defaultReportUploader defaultreportuploader);

        void write();

        void write(List<setFiles> list);
    }

    /* renamed from: o.setCvv$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(List<String> list);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(List<String> list);

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void MediaDescriptionCompat();

        void MediaMetadataCompat();

        void read();

        void read(String str);

        void read(defaultReportUploader defaultreportuploader);

        void read(boolean z);

        void write();

        void write(int i, int i2, String str, int i3);

        void write(String str);
    }

    String IconCompatParcelizer();

    DebitCardResetOtpActivity<PlaceAutocomplete> IconCompatParcelizer(standardEquals standardequals);

    DebitCardResetOtpActivity<PlaceAutocomplete.IntentBuilder> IconCompatParcelizer(zzvc zzvc);

    void IconCompatParcelizer(boolean z);

    String MediaBrowserCompat$CustomActionResultReceiver();

    DebitCardResetOtpActivity<C7506tP> MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, boolean z);

    DebitCardResetOtpActivity<getIndex> MediaBrowserCompat$ItemReceiver(String str, String str2);

    void MediaBrowserCompat$ItemReceiver(GoogleMap.OnMarkerDragListener onMarkerDragListener, boolean z);

    void MediaBrowserCompat$ItemReceiver(boolean z);

    boolean MediaBrowserCompat$ItemReceiver();

    DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$MediaItem();

    boolean MediaDescriptionCompat();

    DebitCardResetOtpActivity<PlaceAutocomplete> read(ForwardingIterator forwardingIterator);

    void read(boolean z);

    boolean read();

    String write();

    DebitCardResetOtpActivity<Boolean> write(standardEquals standardequals);

    void write(String str);

    void write(boolean z);
}

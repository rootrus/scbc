package p040o;

import java.util.List;
import p040o.QueueFileLogStore;

/* renamed from: o.ICheckExtractorListener */
public interface ICheckExtractorListener {

    /* renamed from: o.ICheckExtractorListener$MediaDescriptionCompat */
    public interface MediaDescriptionCompat extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void MediaBrowserCompat$CustomActionResultReceiver(doWriteToLog dowritetolog, boolean z);

        void MediaBrowserCompat$ItemReceiver();

        void read(List<doWriteToLog> list);
    }

    /* renamed from: o.ICheckExtractorListener$IconCompatParcelizer */
    public interface IconCompatParcelizer extends write {
        void MediaBrowserCompat$CustomActionResultReceiver(getLogBytes getlogbytes, List<QueueFileLogStore.LogBytes> list);

        void read(List<QueueFileLogStore.LogBytes> list);
    }

    /* renamed from: o.ICheckExtractorListener$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(C6900x198d4346 iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver);

        void MediaBrowserCompat$ItemReceiver(doWriteToLog dowritetolog, String str, String str2, boolean z);

        void write(C6900x198d4346 iCheckExtractorListener$MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* renamed from: o.ICheckExtractorListener$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$ItemReceiver();

        void write();
    }

    void read(executePendingTask executependingtask);

    void write(executePendingTask executependingtask);
}

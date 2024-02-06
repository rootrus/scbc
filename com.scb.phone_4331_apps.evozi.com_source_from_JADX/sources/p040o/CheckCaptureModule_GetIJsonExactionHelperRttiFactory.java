package p040o;

import android.view.View;
import java.util.List;
import p040o.setResultDeserializer;

/* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory */
public interface CheckCaptureModule_GetIJsonExactionHelperRttiFactory {

    /* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(required required);

        void read();

        void write();
    }

    /* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(List<chain> list);

        void MediaBrowserCompat$CustomActionResultReceiver(isRequired isrequired);

        boolean MediaBrowserCompat$CustomActionResultReceiver(chain chain);

        void MediaBrowserCompat$ItemReceiver(isRequired isrequired);

        void read();

        void read(String str);

        void write();

        boolean write(chain chain);
    }

    /* renamed from: o.CheckCaptureModule_GetIJsonExactionHelperRttiFactory$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(setResultDeserializer.write write);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$MediaItem();

        void RatingCompat();

        void read();

        void write();

        void write(chain chain);
    }

    setTextOff write(View view, setTextOff settextoff);
}

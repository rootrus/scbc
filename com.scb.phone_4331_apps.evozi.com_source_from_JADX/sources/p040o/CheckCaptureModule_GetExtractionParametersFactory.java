package p040o;

import android.view.Menu;
import android.view.Window;
import java.util.List;
import p040o.MoreExecutors;

/* renamed from: o.CheckCaptureModule_GetExtractionParametersFactory */
public interface CheckCaptureModule_GetExtractionParametersFactory {

    /* renamed from: o.CheckCaptureModule_GetExtractionParametersFactory$write */
    public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(Throwable th);

        void read(MoreExecutors.SameThreadExecutorService sameThreadExecutorService);
    }

    /* renamed from: o.CheckCaptureModule_GetExtractionParametersFactory$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(double d);

        void IconCompatParcelizer(String str, sameThreadExecutor samethreadexecutor);

        void MediaBrowserCompat$ItemReceiver();

        void write(String str, String str2);
    }

    /* renamed from: o.CheckCaptureModule_GetExtractionParametersFactory$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer();

        void IconCompatParcelizer(getExitingScheduledExecutorService getexitingscheduledexecutorservice);

        void IconCompatParcelizer(boolean z);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(String str, sameThreadExecutor samethreadexecutor);

        void read();

        void read(List<MoreExecutors.C36611> list);

        void read(boolean z);

        void write();
    }

    void IconCompatParcelizer();

    boolean MediaBrowserCompat$CustomActionResultReceiver();

    void MediaBrowserCompat$ItemReceiver(int i);

    boolean MediaBrowserCompat$ItemReceiver();

    boolean RatingCompat();

    boolean read();

    void setMenu(Menu menu, setStackedBackground$MediaBrowserCompat$ItemReceiver setstackedbackground_mediabrowsercompat_itemreceiver);

    void setMenuPrepared();

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    boolean write();
}

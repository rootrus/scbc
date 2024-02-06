package p040o;

import java.util.List;
import p040o.CheckCaptureModule;
import p040o.CheckCaptureModule_GetIJsonExactionHelperKtaFactory;
import p040o.Futures;

/* renamed from: o.IdParameters */
public interface IdParameters extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

    /* renamed from: o.IdParameters$IdSide */
    public interface IdSide extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$ItemReceiver();

        void write(Throwable th);
    }

    /* renamed from: o.IdParameters$IdState */
    public interface IdState extends CheckCaptureModule_GetIJsonExactionHelperKtaFactory.read {

        /* renamed from: o.IdParameters$IdState$IconCompatParcelizer */
        public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void IconCompatParcelizer(String str);

            void MediaBrowserCompat$ItemReceiver(Futures.C34104 r1);

            void write(String str);
        }

        /* renamed from: o.IdParameters$IdState$write */
        public interface write extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
            void IconCompatParcelizer(String str);

            void write(String str);
        }

        void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200);

        void MediaBrowserCompat$ItemReceiver(boolean z);

        void read();

        void read(boolean z);
    }

    /* renamed from: o.IdParameters$a */
    public interface C6915a extends CheckCaptureModule.RttiExceptionResponseDeserializer {
        void ActionMenuItemView();

        void AppCompatActivity();

        void AppCompatDelegateImpl$ListMenuDecorView();

        void AppCompatDialogFragment();

        void AppCompatViewInflater();

        void IconCompatParcelizer(String str);

        void IconCompatParcelizer(List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> list);

        void MediaBrowserCompat$ItemReceiver(setCurrentSession setcurrentsession, long j);

        void MediaBrowserCompat$SearchResultReceiver(String str);

        void read(String str);

        void read(Futures.C34104 r1);

        void read(boolean z);

        void setCheckable();

        void setChecked();

        void setContentView();

        void setExpandedFormat();

        void setIcon();

        void setShortcut();

        void write(String str);

        void write(List<access$lambda$0> list);
    }

    void IconCompatParcelizer(String str);
}

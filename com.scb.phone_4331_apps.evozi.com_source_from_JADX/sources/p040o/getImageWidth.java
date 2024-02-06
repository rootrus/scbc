package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.getImageWidth */
public interface getImageWidth extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

    /* renamed from: o.getImageWidth$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {

        /* renamed from: o.getImageWidth$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
        public interface C10788IconCompatParcelizer extends IconCompatParcelizer {
            void IconCompatParcelizer(String str);

            void IconCompatParcelizer(boolean z);

            void write(boolean z);
        }

        /* renamed from: o.getImageWidth$IconCompatParcelizer$read */
        public interface read extends IconCompatParcelizer {
            void read(OffsetDateTime offsetDateTime);

            void read(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3);

            void write(LocationCallback locationCallback);
        }

        void IconCompatParcelizer();

        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void read(String str);

        void read(isProximityOn isproximityon);
    }

    void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

    void MediaBrowserCompat$ItemReceiver(boolean z);

    void write();
}

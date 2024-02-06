package p040o;

import com.kony.sdk.common.IntegrationServiceException;
import org.json.JSONObject;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;

/* renamed from: o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory */
public interface IdCaptureModule_GetIIdDeserializerOnDeviceFactory {

    /* renamed from: o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory$IconCompatParcelizer */
    public interface IconCompatParcelizer extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_Event_Application.Builder builder);

        void read(String str);
    }

    /* renamed from: o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory$read */
    public interface read extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
        void IconCompatParcelizer(nonNull nonnull);

        void MediaBrowserCompat$CustomActionResultReceiver();

        void read();

        void write();

        void write(nonNull nonnull);
    }

    void MediaBrowserCompat$CustomActionResultReceiver(IntegrationServiceException integrationServiceException);

    void MediaBrowserCompat$ItemReceiver(JSONObject jSONObject);
}

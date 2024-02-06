package com.google.firebase.crashlytics.internal.model;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final Configurator CONFIG = new AutoCrashlyticsReportEncoder();

    private AutoCrashlyticsReportEncoder() {
    }

    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(CrashlyticsReport.class, CrashlyticsReportEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport.class, CrashlyticsReportEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, CrashlyticsReportSessionEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session.class, CrashlyticsReportSessionEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, CrashlyticsReportSessionApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application.class, CrashlyticsReportSessionApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application_Organization.class, CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, CrashlyticsReportSessionUserEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_User.class, CrashlyticsReportSessionUserEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, CrashlyticsReportSessionDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Device.class, CrashlyticsReportSessionDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, CrashlyticsReportSessionEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event.class, CrashlyticsReportSessionEventEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, CrashlyticsReportSessionEventApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application.class, CrashlyticsReportSessionEventApplicationEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE);
        encoderConfig.registerEncoder(C0330x7e3e3ebd.class, CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, C0313xc3999712.INSTANCE);
        encoderConfig.registerEncoder(C0332xce3d994b.class, C0313xc3999712.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, C0312x55689506.INSTANCE);
        encoderConfig.registerEncoder(C0326xc2f5febc.class, C0312x55689506.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE);
        encoderConfig.registerEncoder(C0328x7c929f5b.class, CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, C0311x99c932db.INSTANCE);
        encoderConfig.registerEncoder(C0324xfe724d07.class, C0311x99c932db.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, CrashlyticsReportCustomAttributeEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_CustomAttribute.class, CrashlyticsReportCustomAttributeEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, CrashlyticsReportSessionEventDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Device.class, CrashlyticsReportSessionEventDeviceEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, CrashlyticsReportSessionEventLogEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Log.class, CrashlyticsReportSessionEventLogEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, CrashlyticsReportFilesPayloadEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload.class, CrashlyticsReportFilesPayloadEncoder.INSTANCE);
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, CrashlyticsReportFilesPayloadFileEncoder.INSTANCE);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload_File.class, CrashlyticsReportFilesPayloadFileEncoder.INSTANCE);
    }

    static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {
        static final CrashlyticsReportEncoder INSTANCE = new CrashlyticsReportEncoder();

        private CrashlyticsReportEncoder() {
        }

        public final void encode(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("sdkVersion", (Object) crashlyticsReport.getSdkVersion());
            objectEncoderContext.add("gmpAppId", (Object) crashlyticsReport.getGmpAppId());
            objectEncoderContext.add("platform", crashlyticsReport.getPlatform());
            objectEncoderContext.add("installationUuid", (Object) crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add("buildVersion", (Object) crashlyticsReport.getBuildVersion());
            objectEncoderContext.add("displayVersion", (Object) crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add("session", (Object) crashlyticsReport.getSession());
            objectEncoderContext.add("ndkPayload", (Object) crashlyticsReport.getNdkPayload());
        }
    }

    static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {
        static final CrashlyticsReportSessionEncoder INSTANCE = new CrashlyticsReportSessionEncoder();

        private CrashlyticsReportSessionEncoder() {
        }

        public final void encode(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("generator", (Object) session.getGenerator());
            objectEncoderContext.add("identifier", (Object) session.getIdentifierUtf8Bytes());
            objectEncoderContext.add("startedAt", session.getStartedAt());
            objectEncoderContext.add("endedAt", (Object) session.getEndedAt());
            objectEncoderContext.add("crashed", session.isCrashed());
            objectEncoderContext.add("app", (Object) session.getApp());
            objectEncoderContext.add("user", (Object) session.getUser());
            objectEncoderContext.add("os", (Object) session.getOs());
            objectEncoderContext.add("device", (Object) session.getDevice());
            objectEncoderContext.add("events", (Object) session.getEvents());
            objectEncoderContext.add("generatorType", session.getGeneratorType());
        }
    }

    static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {
        static final CrashlyticsReportSessionApplicationEncoder INSTANCE = new CrashlyticsReportSessionApplicationEncoder();

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("identifier", (Object) application.getIdentifier());
            objectEncoderContext.add("version", (Object) application.getVersion());
            objectEncoderContext.add("displayVersion", (Object) application.getDisplayVersion());
            objectEncoderContext.add("organization", (Object) application.getOrganization());
            objectEncoderContext.add("installationUuid", (Object) application.getInstallationUuid());
        }
    }

    static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {
        static final CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = new CrashlyticsReportSessionApplicationOrganizationEncoder();

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("clsId", (Object) organization.getClsId());
        }
    }

    static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {
        static final CrashlyticsReportSessionUserEncoder INSTANCE = new CrashlyticsReportSessionUserEncoder();

        private CrashlyticsReportSessionUserEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("identifier", (Object) user.getIdentifier());
        }
    }

    static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {
        static final CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = new CrashlyticsReportSessionOperatingSystemEncoder();

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("platform", operatingSystem.getPlatform());
            objectEncoderContext.add("version", (Object) operatingSystem.getVersion());
            objectEncoderContext.add("buildVersion", (Object) operatingSystem.getBuildVersion());
            objectEncoderContext.add("jailbroken", operatingSystem.isJailbroken());
        }
    }

    static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {
        static final CrashlyticsReportSessionDeviceEncoder INSTANCE = new CrashlyticsReportSessionDeviceEncoder();

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("arch", device.getArch());
            objectEncoderContext.add("model", (Object) device.getModel());
            objectEncoderContext.add("cores", device.getCores());
            objectEncoderContext.add("ram", device.getRam());
            objectEncoderContext.add("diskSpace", device.getDiskSpace());
            objectEncoderContext.add("simulator", device.isSimulator());
            objectEncoderContext.add("state", device.getState());
            objectEncoderContext.add("manufacturer", (Object) device.getManufacturer());
            objectEncoderContext.add("modelClass", (Object) device.getModelClass());
        }
    }

    static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {
        static final CrashlyticsReportSessionEventEncoder INSTANCE = new CrashlyticsReportSessionEventEncoder();

        private CrashlyticsReportSessionEventEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("timestamp", event.getTimestamp());
            objectEncoderContext.add("type", (Object) event.getType());
            objectEncoderContext.add("app", (Object) event.getApp());
            objectEncoderContext.add("device", (Object) event.getDevice());
            objectEncoderContext.add("log", (Object) event.getLog());
        }
    }

    static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {
        static final CrashlyticsReportSessionEventApplicationEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationEncoder();

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("execution", (Object) application.getExecution());
            objectEncoderContext.add("customAttributes", (Object) application.getCustomAttributes());
            objectEncoderContext.add("background", (Object) application.getBackground());
            objectEncoderContext.add("uiOrientation", application.getUiOrientation());
        }
    }

    static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("threads", (Object) execution.getThreads());
            objectEncoderContext.add("exception", (Object) execution.getException());
            objectEncoderContext.add("signal", (Object) execution.getSignal());
            objectEncoderContext.add("binaries", (Object) execution.getBinaries());
        }
    }

    static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("name", (Object) thread.getName());
            objectEncoderContext.add("importance", thread.getImportance());
            objectEncoderContext.add("frames", (Object) thread.getFrames());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder */
    static final class C0313xc3999712 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        static final C0313xc3999712 INSTANCE = new C0313xc3999712();

        private C0313xc3999712() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("pc", frame.getPc());
            objectEncoderContext.add("symbol", (Object) frame.getSymbol());
            objectEncoderContext.add("file", (Object) frame.getFile());
            objectEncoderContext.add("offset", frame.getOffset());
            objectEncoderContext.add("importance", frame.getImportance());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder */
    static final class C0312x55689506 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        static final C0312x55689506 INSTANCE = new C0312x55689506();

        private C0312x55689506() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("type", (Object) exception.getType());
            objectEncoderContext.add("reason", (Object) exception.getReason());
            objectEncoderContext.add("frames", (Object) exception.getFrames());
            objectEncoderContext.add("causedBy", (Object) exception.getCausedBy());
            objectEncoderContext.add("overflowCount", exception.getOverflowCount());
        }
    }

    static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("name", (Object) signal.getName());
            objectEncoderContext.add("code", (Object) signal.getCode());
            objectEncoderContext.add("address", signal.getAddress());
        }
    }

    /* renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder */
    static final class C0311x99c932db implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        static final C0311x99c932db INSTANCE = new C0311x99c932db();

        private C0311x99c932db() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("baseAddress", binaryImage.getBaseAddress());
            objectEncoderContext.add("size", binaryImage.getSize());
            objectEncoderContext.add("name", (Object) binaryImage.getName());
            objectEncoderContext.add("uuid", (Object) binaryImage.getUuidUtf8Bytes());
        }
    }

    static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {
        static final CrashlyticsReportCustomAttributeEncoder INSTANCE = new CrashlyticsReportCustomAttributeEncoder();

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        public final void encode(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("key", (Object) customAttribute.getKey());
            objectEncoderContext.add(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Object) customAttribute.getValue());
        }
    }

    static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {
        static final CrashlyticsReportSessionEventDeviceEncoder INSTANCE = new CrashlyticsReportSessionEventDeviceEncoder();

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("batteryLevel", (Object) device.getBatteryLevel());
            objectEncoderContext.add("batteryVelocity", device.getBatteryVelocity());
            objectEncoderContext.add("proximityOn", device.isProximityOn());
            objectEncoderContext.add("orientation", device.getOrientation());
            objectEncoderContext.add("ramUsed", device.getRamUsed());
            objectEncoderContext.add("diskUsed", device.getDiskUsed());
        }
    }

    static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {
        static final CrashlyticsReportSessionEventLogEncoder INSTANCE = new CrashlyticsReportSessionEventLogEncoder();

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        public final void encode(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("content", (Object) log.getContent());
        }
    }

    static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {
        static final CrashlyticsReportFilesPayloadEncoder INSTANCE = new CrashlyticsReportFilesPayloadEncoder();

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        public final void encode(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("files", (Object) filesPayload.getFiles());
            objectEncoderContext.add("orgId", (Object) filesPayload.getOrgId());
        }
    }

    static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {
        static final CrashlyticsReportFilesPayloadFileEncoder INSTANCE = new CrashlyticsReportFilesPayloadFileEncoder();

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        public final void encode(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add("filename", (Object) file.getFilename());
            objectEncoderContext.add("contents", (Object) file.getContents());
        }
    }
}

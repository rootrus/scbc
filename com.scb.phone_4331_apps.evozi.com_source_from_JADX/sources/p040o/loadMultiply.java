package p040o;

import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;

/* renamed from: o.loadMultiply */
public final class loadMultiply implements Configurator {
    public static final Configurator IconCompatParcelizer = new loadMultiply();

    /* renamed from: o.loadMultiply$IconCompatParcelizer */
    static final class IconCompatParcelizer implements ObjectEncoder<computeCofactor> {
        static final IconCompatParcelizer read = new IconCompatParcelizer();

        private IconCompatParcelizer() {
        }

        public final void encode(Object obj, Object obj2) throws IOException {
            computeCofactor computecofactor = (computeCofactor) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add("requestTimeMs", computecofactor.MediaDescriptionCompat());
            objectEncoderContext.add("requestUptimeMs", computecofactor.MediaMetadataCompat());
            objectEncoderContext.add("clientInfo", (Object) computecofactor.IconCompatParcelizer());
            objectEncoderContext.add("logSource", (Object) computecofactor.MediaBrowserCompat$ItemReceiver());
            objectEncoderContext.add("logSourceName", (Object) computecofactor.read());
            objectEncoderContext.add("logEvent", (Object) computecofactor.write());
            objectEncoderContext.add("qosTier", (Object) computecofactor.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    /* renamed from: o.loadMultiply$read */
    static final class read implements ObjectEncoder<Matrix3f> {
        static final read read = new read();

        private read() {
        }

        public final void encode(Object obj, Object obj2) throws IOException {
            Matrix3f matrix3f = (Matrix3f) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add("eventTimeMs", matrix3f.write());
            objectEncoderContext.add("eventCode", (Object) matrix3f.read());
            objectEncoderContext.add("eventUptimeMs", matrix3f.IconCompatParcelizer());
            objectEncoderContext.add("sourceExtension", (Object) matrix3f.MediaBrowserCompat$ItemReceiver());
            objectEncoderContext.add("sourceExtensionJsonProto3", (Object) matrix3f.MediaMetadataCompat());
            objectEncoderContext.add("timezoneOffsetSeconds", matrix3f.MediaBrowserCompat$SearchResultReceiver());
            objectEncoderContext.add("networkConnectionInfo", (Object) matrix3f.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    /* renamed from: o.loadMultiply$write */
    static final class write implements ObjectEncoder<transpose> {
        static final write IconCompatParcelizer = new write();

        private write() {
        }

        public final void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add("logRequest", (Object) ((transpose) obj).IconCompatParcelizer());
        }
    }

    private loadMultiply() {
    }

    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(transpose.class, write.IconCompatParcelizer);
        encoderConfig.registerEncoder(multiply.class, write.IconCompatParcelizer);
        encoderConfig.registerEncoder(computeCofactor.class, IconCompatParcelizer.read);
        encoderConfig.registerEncoder(scale.class, IconCompatParcelizer.read);
        encoderConfig.registerEncoder(C10885rotate.class, loadMultiply$MediaBrowserCompat$CustomActionResultReceiver.read);
        encoderConfig.registerEncoder(loadIdentity.class, loadMultiply$MediaBrowserCompat$CustomActionResultReceiver.read);
        encoderConfig.registerEncoder(Long4.class, loadMultiply$MediaBrowserCompat$ItemReceiver.write);
        encoderConfig.registerEncoder(loadRotate.class, loadMultiply$MediaBrowserCompat$ItemReceiver.write);
        encoderConfig.registerEncoder(Matrix3f.class, read.read);
        encoderConfig.registerEncoder(loadScale.class, read.read);
        encoderConfig.registerEncoder(loadTranslate.class, loadMultiply$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver);
        encoderConfig.registerEncoder(set.class, loadMultiply$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver);
    }
}

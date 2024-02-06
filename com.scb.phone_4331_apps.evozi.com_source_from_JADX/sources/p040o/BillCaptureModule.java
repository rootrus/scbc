package p040o;

import p040o.C7126xb23daf18;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillCaptureModule */
public final /* synthetic */ class BillCaptureModule implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ BillCaptureModule MediaBrowserCompat$ItemReceiver = new BillCaptureModule();

    /* renamed from: o.BillCaptureModule$RttiExceptionResponseDeserializer */
    public final /* synthetic */ class RttiExceptionResponseDeserializer implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ RttiExceptionResponseDeserializer write = new RttiExceptionResponseDeserializer();

        private /* synthetic */ RttiExceptionResponseDeserializer() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.setIcon) obj).RatingCompat();
        }
    }

    /* renamed from: o.BillCaptureModule$a */
    public final /* synthetic */ class C6334a implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C6334a read = new C6334a();

        private /* synthetic */ C6334a() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.setIcon) obj).ay_();
        }
    }

    /* renamed from: o.BillCaptureModule$b */
    public final /* synthetic */ class C6335b implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ double read;

        public /* synthetic */ C6335b(double d) {
            this.read = d;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.setIcon) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    private /* synthetic */ BillCaptureModule() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getTopLeftCornerWidth.setCheckable) obj).read();
    }

    /* renamed from: o.BillCaptureModule$KtaExceptionResponseDeserializer */
    public final /* synthetic */ class KtaExceptionResponseDeserializer implements C7126xb23daf18.read {
        private final /* synthetic */ IBillExtractorListener write;

        public /* synthetic */ KtaExceptionResponseDeserializer(IBillExtractorListener iBillExtractorListener) {
            this.write = iBillExtractorListener;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            IBillExtractorListener iBillExtractorListener = this.write;
            proxyGetIExceptionResponseDeserializerKta proxygetiexceptionresponsedeserializerkta = new proxyGetIExceptionResponseDeserializerKta(iBillExtractorListener);
            if (iBillExtractorListener.RatingCompat != null) {
                proxygetiexceptionresponsedeserializerkta.IconCompatParcelizer(iBillExtractorListener.RatingCompat);
            }
        }
    }
}

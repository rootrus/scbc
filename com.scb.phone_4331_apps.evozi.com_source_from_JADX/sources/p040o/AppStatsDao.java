package p040o;

import android.graphics.Bitmap;
import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.IIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.AppStatsDao */
public final /* synthetic */ class AppStatsDao implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ AppStatsDao MediaBrowserCompat$ItemReceiver = new AppStatsDao();

    private /* synthetic */ AppStatsDao() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer();
    }

    /* renamed from: o.AppStatsDao$a */
    public final /* synthetic */ class C3028a implements DebitCardMarketConductDeepLinkActivity {
        private final /* synthetic */ MarketingCSentWebViewActivity.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ AppStatsOCRType read;

        public /* synthetic */ C3028a(AppStatsOCRType appStatsOCRType, MarketingCSentWebViewActivity.IconCompatParcelizer iconCompatParcelizer) {
            this.read = appStatsOCRType;
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        }

        public final void IconCompatParcelizer(Object obj) {
            AppStatsOCRType appStatsOCRType = this.read;
            setAppStatsDaoObjSizeInstCnt setappstatsdaoobjsizeinstcnt = new setAppStatsDaoObjSizeInstCnt(appStatsOCRType, (AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder) obj, this.MediaBrowserCompat$CustomActionResultReceiver);
            if (appStatsOCRType.RatingCompat != null) {
                setappstatsdaoobjsizeinstcnt.IconCompatParcelizer(appStatsOCRType.RatingCompat);
            }
        }
    }

    /* renamed from: o.AppStatsDao$b */
    public final /* synthetic */ class C3029b implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ Bitmap read;
        private final /* synthetic */ String write;

        public /* synthetic */ C3029b(Bitmap bitmap, String str, String str2) {
            this.read = bitmap;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
        }

        public final void IconCompatParcelizer(Object obj) {
            Bitmap bitmap = this.read;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = this.write;
            IIdExtractor.write write2 = (IIdExtractor.write) obj;
            write2.read(bitmap);
            write2.write(str);
            write2.MediaBrowserCompat$SearchResultReceiver(str2);
            write2.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    /* renamed from: o.AppStatsDao$c */
    public final /* synthetic */ class C3030c implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ AppStatsOCRType IconCompatParcelizer;
        private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ C3030c(AppStatsOCRType appStatsOCRType, boolean z) {
            this.IconCompatParcelizer = appStatsOCRType;
            this.MediaBrowserCompat$ItemReceiver = z;
        }

        public final void IconCompatParcelizer(Object obj) {
            AppStatsOCRType appStatsOCRType = this.IconCompatParcelizer;
            boolean z = this.MediaBrowserCompat$ItemReceiver;
            getFrontException$MediaBrowserCompat$CustomActionResultReceiver getfrontexception_mediabrowsercompat_customactionresultreceiver = (getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj;
            if (appStatsOCRType.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem()) {
                getfrontexception_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(z);
            } else {
                getfrontexception_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(true);
            }
        }
    }

    /* renamed from: o.AppStatsDao$FieldTemplate */
    public final /* synthetic */ class FieldTemplate implements dump {
        private final /* synthetic */ getFrontException$MediaBrowserCompat$CustomActionResultReceiver read;

        public /* synthetic */ FieldTemplate(getFrontException$MediaBrowserCompat$CustomActionResultReceiver getfrontexception_mediabrowsercompat_customactionresultreceiver) {
            this.read = getfrontexception_mediabrowsercompat_customactionresultreceiver;
        }

        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            this.read.MediaBrowserCompat$ItemReceiver(((setStyle) obj).read);
        }
    }

    /* renamed from: o.AppStatsDao$AppStatsDaoCalcObjSize */
    public final /* synthetic */ class AppStatsDaoCalcObjSize implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ ForwardingObject write;

        public /* synthetic */ AppStatsDaoCalcObjSize(ForwardingObject forwardingObject) {
            this.write = forwardingObject;
        }

        public final boolean write(Object obj) {
            return ((AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder) ((setStyle) obj).IconCompatParcelizer).MediaBrowserCompat$ItemReceiver.equals(this.write.write);
        }
    }

    /* renamed from: o.AppStatsDao$AppStatsDaoCalcObjSizeResult */
    public final /* synthetic */ class AppStatsDaoCalcObjSizeResult implements dump {
        private final /* synthetic */ ForwardingObject IconCompatParcelizer;
        private final /* synthetic */ getFrontException$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ AppStatsDaoCalcObjSizeResult(getFrontException$MediaBrowserCompat$CustomActionResultReceiver getfrontexception_mediabrowsercompat_customactionresultreceiver, ForwardingObject forwardingObject) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getfrontexception_mediabrowsercompat_customactionresultreceiver;
            this.IconCompatParcelizer = forwardingObject;
        }

        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            isSupportFragmentClass issupportfragmentclass;
            getFrontException$MediaBrowserCompat$CustomActionResultReceiver getfrontexception_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            ForwardingObject forwardingObject = this.IconCompatParcelizer;
            setStyle setstyle = (setStyle) obj;
            getfrontexception_mediabrowsercompat_customactionresultreceiver.write(setstyle.read);
            getfrontexception_mediabrowsercompat_customactionresultreceiver.write(((AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder) setstyle.IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver);
            getfrontexception_mediabrowsercompat_customactionresultreceiver.write(true);
            show read = new show(((AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder) setstyle.IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver).read();
            show show = new show(read.write, new getNextTransition(read.IconCompatParcelizer, new getEnvironmentId(forwardingObject)));
            if (show.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            setAppStatsDaoObjSize setappstatsdaoobjsize = new setAppStatsDaoObjSize(getfrontexception_mediabrowsercompat_customactionresultreceiver);
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                setappstatsdaoobjsize.MediaBrowserCompat$ItemReceiver(t);
            }
        }
    }
}

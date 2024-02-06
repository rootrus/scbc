package p040o;

import com.scb.phone.view.activity.csent.MarketingCSentWebViewActivity;
import p040o.AppStatsDao;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.setAppStatsDaoObjSizeInstCnt */
public final /* synthetic */ class setAppStatsDaoObjSizeInstCnt implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ AppStatsOCRType IconCompatParcelizer;
    private final /* synthetic */ MarketingCSentWebViewActivity.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder read;

    public /* synthetic */ setAppStatsDaoObjSizeInstCnt(AppStatsOCRType appStatsOCRType, AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder, MarketingCSentWebViewActivity.IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = appStatsOCRType;
        this.read = crashlyticsReportSessionEventLogEncoder;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        isSupportFragmentClass issupportfragmentclass2;
        AppStatsOCRType appStatsOCRType = this.IconCompatParcelizer;
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = this.read;
        MarketingCSentWebViewActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        getFrontException$MediaBrowserCompat$CustomActionResultReceiver getfrontexception_mediabrowsercompat_customactionresultreceiver = (getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj;
        getfrontexception_mediabrowsercompat_customactionresultreceiver.aj_();
        getfrontexception_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(crashlyticsReportSessionEventLogEncoder.MediaBrowserCompat$CustomActionResultReceiver);
        getfrontexception_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(crashlyticsReportSessionEventLogEncoder.read);
        if (iconCompatParcelizer != null && iconCompatParcelizer.read.equalsIgnoreCase("ONBOARD")) {
            getfrontexception_mediabrowsercompat_customactionresultreceiver.write(appStatsOCRType.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$SearchResultReceiver);
        } else if (iconCompatParcelizer != null && iconCompatParcelizer.read.equalsIgnoreCase("LANDING")) {
            C10833element write = appStatsOCRType.MediaBrowserCompat$ItemReceiver.write();
            onGetStartedClick.write((Object) write, "request");
            unsafeCompare unsafecompare = write.MediaBrowserCompat$ItemReceiver;
            ForwardingObject forwardingObject = write.read;
            onGetStartedClick.IconCompatParcelizer((Object) unsafecompare, "shop");
            String str = unsafecompare.read;
            onGetStartedClick.IconCompatParcelizer((Object) str, "shop.lineId");
            String str2 = unsafecompare.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "shop.nameTH");
            String str3 = unsafecompare.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) str3, "shop.nameEN");
            String str4 = unsafecompare.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str4, "shop.phoneNumber");
            String str5 = unsafecompare.write;
            onGetStartedClick.IconCompatParcelizer((Object) str5, "shop.email");
            onGetStartedClick.IconCompatParcelizer((Object) forwardingObject, "merchant");
            getfrontexception_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder(str, str2, str3, str4, str5, forwardingObject.MediaDescriptionCompat));
            ForwardingObject forwardingObject2 = appStatsOCRType.MediaBrowserCompat$ItemReceiver.write().read;
            show read2 = new show(crashlyticsReportSessionEventLogEncoder.MediaBrowserCompat$CustomActionResultReceiver).read();
            show show = new show(read2.write, new getNextTransition(read2.IconCompatParcelizer, new AppStatsDao.AppStatsDaoCalcObjSize(forwardingObject2)));
            if (show.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            AppStatsDao.AppStatsDaoCalcObjSizeResult appStatsDaoCalcObjSizeResult = new AppStatsDao.AppStatsDaoCalcObjSizeResult(getfrontexception_mediabrowsercompat_customactionresultreceiver, forwardingObject2);
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                appStatsDaoCalcObjSizeResult.MediaBrowserCompat$ItemReceiver(t);
            }
            show read3 = new show(crashlyticsReportSessionEventLogEncoder.read).read();
            show show2 = new show(read3.write, new getNextTransition(read3.IconCompatParcelizer, new getWriteToDbStatements(forwardingObject2)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass2 = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass2 = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            AppStatsDao.FieldTemplate fieldTemplate = new AppStatsDao.FieldTemplate(getfrontexception_mediabrowsercompat_customactionresultreceiver);
            T t2 = issupportfragmentclass2.IconCompatParcelizer;
            if (t2 != null) {
                fieldTemplate.MediaBrowserCompat$ItemReceiver(t2);
            }
        }
    }
}

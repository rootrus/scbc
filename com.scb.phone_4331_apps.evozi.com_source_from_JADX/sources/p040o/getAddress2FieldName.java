package p040o;

import com.scb.phone.data.network.service.EasycashService;
import com.scb.phone.data.network.service.easycash.EasycashDocumentUploadService;
import com.scb.phone.data.network.service.easycash.EasycashTermAndConditionsService;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event;
import p040o.GoogleMap;
import p040o.Lists;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress2FieldName */
public final class getAddress2FieldName extends writeUInt64NoTag<C1243xf34efb9f> {
    private final DecimalFormat IconCompatParcelizer = new DecimalFormat("#0.00");
    final LineProcessor MediaBrowserCompat$ItemReceiver;
    public final Lists.AbstractListWrapper read;
    final handleLine write;

    /* renamed from: o.getAddress2FieldName$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getAddress2FieldName IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(getAddress2FieldName getaddress2fieldname) {
            super(1);
            this.IconCompatParcelizer = getaddress2fieldname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final void run() {
                    getAddress2FieldName getaddress2fieldname = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C44872.read;
                    if (getaddress2fieldname.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(getaddress2fieldname.RatingCompat);
                    }
                }
            }));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getAddress2FieldName$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C1243xf34efb9f> {
        public static final MediaDescriptionCompat IconCompatParcelizer = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1243xf34efb9f) obj).MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }

    /* renamed from: o.getAddress2FieldName$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C1243xf34efb9f> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public RatingCompat(getAddress2FieldName getaddress2fieldname, String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1243xf34efb9f) obj).IconCompatParcelizer(getAddress2FieldName.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver));
        }
    }

    /* renamed from: o.getAddress2FieldName$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<GoogleMap.OnCameraChangeListener, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getAddress2FieldName MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ construct MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(getAddress2FieldName getaddress2fieldname, construct construct) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = getaddress2fieldname;
            this.MediaBrowserCompat$ItemReceiver = construct;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GoogleMap.OnCameraChangeListener onCameraChangeListener = (GoogleMap.OnCameraChangeListener) obj;
            onGetStartedClick.write((Object) onCameraChangeListener, "response");
            getAddress2FieldName.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            LineProcessor lineProcessor = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) onCameraChangeListener, "domain");
            String str = onCameraChangeListener.write;
            List<GoogleMap.OnCameraMoveCanceledListener> list = onCameraChangeListener.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) list, "fromWallet");
            Iterable<GoogleMap.OnCameraMoveCanceledListener> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener : iterable) {
                String str2 = onCameraMoveCanceledListener.MediaBrowserCompat$CustomActionResultReceiver;
                String str3 = onCameraMoveCanceledListener.MediaBrowserCompat$ItemReceiver;
                String c_ = lineProcessor.mo26549c_(onCameraMoveCanceledListener.MediaMetadataCompat);
                onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(it.flagImage)");
                String write = LineProcessor.write(Double.valueOf(onCameraMoveCanceledListener.write));
                onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(it.amount)");
                String write2 = LineProcessor.write(Double.valueOf(onCameraMoveCanceledListener.MediaDescriptionCompat));
                onGetStartedClick.IconCompatParcelizer((Object) write2, "transformFund(it.thbEquivalentAmount)");
                arrayList.add(new AutoValue_CrashlyticsReport_Session_Event_Application(str2, str3, c_, write, write2, onCameraMoveCanceledListener.MediaBrowserCompat$MediaItem, onCameraMoveCanceledListener.IconCompatParcelizer, 0, 0));
            }
            AutoValue_CrashlyticsReport_Session_Event.Builder builder = new AutoValue_CrashlyticsReport_Session_Event.Builder(str, (List) arrayList, lineProcessor.MediaBrowserCompat$CustomActionResultReceiver(onCameraChangeListener.read), LineProcessor.read(onCameraChangeListener.MediaBrowserCompat$CustomActionResultReceiver));
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list2 = builder.write;
            List<AutoValue_CrashlyticsReport_Session_Event_Application> list3 = builder.read;
            List<C3071x65de3bd5> list4 = builder.IconCompatParcelizer;
            if (getAddress2FieldName.MediaBrowserCompat$CustomActionResultReceiver((List) list4)) {
                getAddress2FieldName getaddress2fieldname = this.MediaBrowserCompat$CustomActionResultReceiver;
                final AutoValue_CrashlyticsReport_Session_Event.Builder builder2 = builder;
                final List<AutoValue_CrashlyticsReport_Session_Event_Application> list5 = list2;
                final List<AutoValue_CrashlyticsReport_Session_Event_Application> list6 = list3;
                final List<C3071x65de3bd5> list7 = list4;
                writeUInt64NoTag.IconCompatParcelizer r9 = new writeUInt64NoTag.IconCompatParcelizer<C1243xf34efb9f>(this) {
                    private /* synthetic */ write read;

                    {
                        this.read = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        C1243xf34efb9f onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver = (C1243xf34efb9f) obj;
                        onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(builder2);
                        onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((List<AutoValue_CrashlyticsReport_Session_Event_Application>) list5);
                        onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.read((List<AutoValue_CrashlyticsReport_Session_Event_Application>) list6, (List<C3071x65de3bd5>) list7);
                        String str = this.read.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                        int hashCode = str.hashCode();
                        if (hashCode != 66) {
                            if (hashCode == 83 && str.equals("S")) {
                                onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                                if (getAddress2FieldName.write(builder2.write.get(0).IconCompatParcelizer)) {
                                    onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(builder2.write.get(0).IconCompatParcelizer);
                                }
                            }
                        } else if (str.equals("B")) {
                            onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.read();
                            if (getAddress2FieldName.write(builder2.read.get(0).IconCompatParcelizer)) {
                                onDeviceIdExtractor$b$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(builder2.read.get(0).IconCompatParcelizer);
                            }
                        }
                    }
                };
                if (getaddress2fieldname.RatingCompat != null) {
                    r9.IconCompatParcelizer(getaddress2fieldname.RatingCompat);
                }
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver.read(Iterables$3$MediaBrowserCompat$MediaItem.error_default_title, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new Runnable(this) {
                    private /* synthetic */ write IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r1;
                    }

                    public final void run() {
                        getAddress2FieldName getaddress2fieldname = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C44894.MediaBrowserCompat$CustomActionResultReceiver;
                        if (getaddress2fieldname.RatingCompat != null) {
                            iconCompatParcelizer.IconCompatParcelizer(getaddress2fieldname.RatingCompat);
                        }
                    }
                });
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getAddress2FieldName(RegularImmutableBiMap regularImmutableBiMap, LineProcessor lineProcessor, handleLine handleline, Lists.AbstractListWrapper abstractListWrapper) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) lineProcessor, "prepaidTravelConversionLandingDisplayMapper");
        onGetStartedClick.write((Object) handleline, "prepaidTravelConversionVerificationDisplayMapper");
        onGetStartedClick.write((Object) abstractListWrapper, "controller");
        this.MediaBrowserCompat$ItemReceiver = lineProcessor;
        this.write = handleline;
        this.read = abstractListWrapper;
    }

    /* renamed from: o.getAddress2FieldName$read */
    public static final class read {
        public EasycashTermAndConditionsService IconCompatParcelizer;
        public EasycashDocumentUploadService MediaBrowserCompat$CustomActionResultReceiver;
        public EasycashService read;

        private read() {
        }

        @HmlPinActivity
        public read(EasycashService easycashService, EasycashTermAndConditionsService easycashTermAndConditionsService, EasycashDocumentUploadService easycashDocumentUploadService) {
            this.read = easycashService;
            this.IconCompatParcelizer = easycashTermAndConditionsService;
            this.MediaBrowserCompat$CustomActionResultReceiver = easycashDocumentUploadService;
        }
    }

    public static int IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "conversionType");
        if (str.hashCode() != 66 || !str.equals("B")) {
            return Iterables$3$MediaBrowserCompat$MediaItem.prepaid_travel_conversion_landing_sell_title;
        }
        return Iterables$3$MediaBrowserCompat$MediaItem.prepaid_travel_conversion_landing_buy_title;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(String str) {
        onGetStartedClick.write((Object) str, "conversionType");
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "B");
    }

    public final String read(double d, double d2) {
        double d3;
        this.IconCompatParcelizer.setRoundingMode(RoundingMode.HALF_UP);
        DecimalFormat decimalFormat = this.IconCompatParcelizer;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d2 * d));
        if (bigDecimal.stripTrailingZeros().precision() - bigDecimal.stripTrailingZeros().scale() > 10) {
            d3 = 0.0d;
        } else {
            d3 = bigDecimal.doubleValue();
        }
        return decimalFormat.format(d3).toString();
    }

    public final String IconCompatParcelizer(double d, double d2) {
        double d3;
        double d4 = d2 / d;
        this.IconCompatParcelizer.setRoundingMode(RoundingMode.HALF_UP);
        DecimalFormat decimalFormat = this.IconCompatParcelizer;
        BigDecimal bigDecimal = new BigDecimal(String.valueOf(d4));
        if (bigDecimal.stripTrailingZeros().precision() - bigDecimal.stripTrailingZeros().scale() > 10) {
            d3 = 0.0d;
        } else {
            d3 = bigDecimal.doubleValue();
        }
        return decimalFormat.format(d3).toString();
    }

    public final void IconCompatParcelizer(String str, String str2) {
        onGetStartedClick.write((Object) str, "fromAmount");
        onGetStartedClick.write((Object) str2, "toAmount");
        boolean z = true;
        if (!read(str) || !read(str2)) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MediaDescriptionCompat.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getAddress2FieldName$MediaBrowserCompat$SearchResultReceiver.read;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static boolean read(String str) {
        if (!(str.length() > 0) || Double.parseDouble(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, ",", "", false)) == 0.0d) {
            return false;
        }
        return true;
    }

    public final void onDestroy() {
        this.read.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void IconCompatParcelizer(getAddress2FieldName getaddress2fieldname) {
        if (getaddress2fieldname.RatingCompat != null) {
            getaddress2fieldname.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ boolean write(String str) {
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "JPY") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "KRW");
    }

    public static final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(List list) {
        Collection collection = list;
        return !(collection == null || collection.isEmpty()) && ((C3071x65de3bd5) list.get(0)).write != 0.0d;
    }
}

package p040o;

import android.content.res.Resources;
import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_Session_Device;
import p040o.C7534ua;
import p040o.CrashlyticsReport;
import p040o.ILocationSourceDelegate;
import p040o.StandardTable;
import p040o.access$2300;
import p040o.getInfoWindow;
import p040o.getLog;
import p040o.writeUInt64NoTag;

/* renamed from: o.IFaceDetector */
public final class IFaceDetector extends writeUInt64NoTag<C7534ua.write> {
    public CrashlyticsReport.FilesPayload.File.Builder IconCompatParcelizer;
    public AutoValue_CrashlyticsReport_Session_Device.Builder MediaBrowserCompat$ItemReceiver;
    final finishLine MediaBrowserCompat$MediaItem;
    final LimitInputStream MediaBrowserCompat$SearchResultReceiver;
    private final StandardTable.RowMap.EntrySet MediaDescriptionCompat;
    final InputSupplier MediaMetadataCompat;
    /* access modifiers changed from: private */
    public getLog MediaSessionCompat$QueueItem;
    private List<AutoValue_CrashlyticsReport_Session_Device.Builder> MediaSessionCompat$Token;
    private final Resources ParcelableVolumeInfo;
    public getRam read;
    public final hashCodeImpl write;

    /* renamed from: o.IFaceDetector$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7534ua.write> {
        private /* synthetic */ IFaceDetector IconCompatParcelizer;
        private /* synthetic */ getRam MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(IFaceDetector iFaceDetector, getRam getram) {
            this.IconCompatParcelizer = iFaceDetector;
            this.MediaBrowserCompat$ItemReceiver = getram;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7534ua.write) obj).MediaDescriptionCompat(IFaceDetector.IconCompatParcelizer(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver));
        }
    }

    /* renamed from: o.IFaceDetector$MediaDescriptionCompat */
    static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C7534ua.write> {
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ IFaceDetector read;

        MediaDescriptionCompat(List list, IFaceDetector iFaceDetector) {
            this.IconCompatParcelizer = list;
            this.read = iFaceDetector;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C7534ua.write write = (C7534ua.write) obj;
            CrashlyticsReport.FilesPayload.File.write write2 = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.PREPAID_CARD_REQUEST_SOURCE_FUNCTION);
            write2.MediaBrowserCompat$ItemReceiver = false;
            boolean z = true;
            write2.IconCompatParcelizer = true;
            write2.MediaDescriptionCompat = true;
            write2.RatingCompat = true;
            write2.RatingCompat = false;
            write2.MediaDescriptionCompat = false;
            write2.IconCompatParcelizer = false;
            write2.read = 2;
            CrashlyticsReport.FilesPayload.File file = new CrashlyticsReport.FilesPayload.File(write2, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) file, "AccountSourceSelectDispl…                 .build()");
            write.IconCompatParcelizer(file);
            write.IconCompatParcelizer((List<? extends removeAllReports>) this.IconCompatParcelizer);
            if (IFaceDetector.write(this.read).size() > 10) {
                z = false;
            }
            write.IconCompatParcelizer(z);
            this.read.MediaBrowserCompat$CustomActionResultReceiver(0);
            getRam MediaBrowserCompat$CustomActionResultReceiver = this.read.read;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                write.MediaDescriptionCompat(IFaceDetector.IconCompatParcelizer(this.read, MediaBrowserCompat$CustomActionResultReceiver));
            }
            write.write();
        }
    }

    /* renamed from: o.IFaceDetector$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<getInfoWindow, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ IFaceDetector MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(IFaceDetector iFaceDetector) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = iFaceDetector;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            getInfoWindow getinfowindow = (getInfoWindow) obj;
            onGetStartedClick.write((Object) getinfowindow, "response");
            IFaceDetector.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            IFaceDetector iFaceDetector = this.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) getinfowindow, "domain");
            Iterable<getInfoWindow.read> iterable = getinfowindow.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            int i = 10;
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (getInfoWindow.read read : iterable) {
                String str12 = read.IconCompatParcelizer;
                String str13 = read.MediaBrowserCompat$ItemReceiver;
                String str14 = read.read;
                String str15 = read.write;
                List<String> list = read.MediaBrowserCompat$CustomActionResultReceiver;
                BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver = read.MediaBrowserCompat$SearchResultReceiver;
                arrayList.add(new getLog.read(str12, str13, str14, str15, list, new AutoValue_CrashlyticsReport_Session_Device.C30661(billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver)));
            }
            List list2 = (List) arrayList;
            Iterable iterable2 = getinfowindow.IconCompatParcelizer;
            onGetStartedClick.write((Object) iterable2, "$this$collectionSizeOrDefault");
            if (iterable2 instanceof Collection) {
                i = ((Collection) iterable2).size();
            }
            Collection arrayList2 = new ArrayList(i);
            for (Iterator it = iterable2.iterator(); it.hasNext(); it = it) {
                getInfoContents getinfocontents = (getInfoContents) it.next();
                String str16 = getinfocontents.IconCompatParcelizer;
                String str17 = getinfocontents.MediaBrowserCompat$CustomActionResultReceiver;
                String str18 = getinfocontents.read;
                setOnPoiClickListener setonpoiclicklistener = getinfocontents.write;
                IFaceDetector iFaceDetector2 = iFaceDetector;
                getManufacturer getmanufacturer = new getManufacturer(setonpoiclicklistener.IconCompatParcelizer, setonpoiclicklistener.read, setonpoiclicklistener.MediaBrowserCompat$CustomActionResultReceiver);
                BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver2 = getinfocontents.MediaBrowserCompat$ItemReceiver;
                arrayList2.add(new AutoValue_CrashlyticsReport_Session_Device.Builder(str16, str17, str18, getmanufacturer, new AutoValue_CrashlyticsReport_Session_Device.C30661(billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver, billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver)));
                iFaceDetector = iFaceDetector2;
            }
            IFaceDetector iFaceDetector3 = iFaceDetector;
            List list3 = (List) arrayList2;
            String str19 = getinfowindow.write;
            setOnMyLocationClickListener setonmylocationclicklistener = getinfowindow.MediaBrowserCompat$ItemReceiver;
            String str20 = setonmylocationclicklistener.MediaBrowserCompat$ItemReceiver;
            String str21 = str20 == null ? "" : str20;
            String str22 = setonmylocationclicklistener.ParcelableVolumeInfo;
            if (str22 == null) {
                str = "";
            } else {
                str = str22;
            }
            String str23 = setonmylocationclicklistener.MediaMetadataCompat;
            if (str23 == null) {
                str2 = "";
            } else {
                str2 = str23;
            }
            String str24 = setonmylocationclicklistener.IconCompatParcelizer;
            if (str24 == null) {
                str3 = "";
            } else {
                str3 = str24;
            }
            String str25 = setonmylocationclicklistener.MediaBrowserCompat$CustomActionResultReceiver;
            if (str25 == null) {
                str4 = "";
            } else {
                str4 = str25;
            }
            String str26 = setonmylocationclicklistener.RatingCompat;
            if (str26 == null) {
                str5 = "";
            } else {
                str5 = str26;
            }
            String str27 = setonmylocationclicklistener.MediaDescriptionCompat;
            if (str27 == null) {
                str6 = "";
            } else {
                str6 = str27;
            }
            String str28 = setonmylocationclicklistener.MediaBrowserCompat$MediaItem;
            if (str28 == null) {
                str7 = "";
            } else {
                str7 = str28;
            }
            String str29 = setonmylocationclicklistener.read;
            if (str29 == null) {
                str8 = "";
            } else {
                str8 = str29;
            }
            String str30 = setonmylocationclicklistener.write;
            if (str30 == null) {
                str9 = "";
            } else {
                str9 = str30;
            }
            String str31 = setonmylocationclicklistener.MediaBrowserCompat$SearchResultReceiver;
            if (str31 == null) {
                str10 = "";
            } else {
                str10 = str31;
            }
            String str32 = setonmylocationclicklistener.MediaSessionCompat$QueueItem;
            if (str32 == null) {
                str11 = "";
            } else {
                str11 = str32;
            }
            iFaceDetector3.MediaSessionCompat$QueueItem = new getLog(list2, list3, str19, new getRam(str21, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11));
            IFaceDetector iFaceDetector4 = this.MediaBrowserCompat$ItemReceiver;
            iFaceDetector4.read = IFaceDetector.IconCompatParcelizer(iFaceDetector4).MediaBrowserCompat$ItemReceiver;
            IFaceDetector iFaceDetector5 = this.MediaBrowserCompat$ItemReceiver;
            IFaceDetector.MediaBrowserCompat$ItemReceiver(iFaceDetector5, IFaceDetector.IconCompatParcelizer(iFaceDetector5));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.IFaceDetector$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C7534ua.write> {
        private /* synthetic */ IFaceDetector MediaBrowserCompat$ItemReceiver;

        RatingCompat(IFaceDetector iFaceDetector) {
            this.MediaBrowserCompat$ItemReceiver = iFaceDetector;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C7534ua.write write = (C7534ua.write) obj;
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            String format = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(IFaceDetector.read(this.MediaBrowserCompat$ItemReceiver).write.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.defaultCurrenc…elected.newFee.annualFee)");
            write.write(format);
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance2.setMinimumFractionDigits(2);
            currencyInstance2.setMaximumFractionDigits(2);
            String format2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format(IFaceDetector.read(this.MediaBrowserCompat$ItemReceiver).write.write);
            onGetStartedClick.IconCompatParcelizer((Object) format2, "Utilities.defaultCurrenc…lected.newFee.issuingFee)");
            write.IconCompatParcelizer(format2);
            NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance3.setMinimumFractionDigits(2);
            currencyInstance3.setMaximumFractionDigits(2);
            String format3 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance3).format(IFaceDetector.read(this.MediaBrowserCompat$ItemReceiver).write.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) format3, "Utilities.defaultCurrenc…ected.newFee.deliveryFee)");
            write.read(format3);
        }
    }

    /* renamed from: o.IFaceDetector$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7534ua.write> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7534ua.write) obj).read();
        }
    }

    /* renamed from: o.IFaceDetector$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7534ua.write> {
        private /* synthetic */ IFaceDetector IconCompatParcelizer;

        public write(IFaceDetector iFaceDetector) {
            this.IconCompatParcelizer = iFaceDetector;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C7534ua.write write = (C7534ua.write) obj;
            getRam MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.read;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver, "mailingAddressDisplay");
                AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = new AutoValue_CrashlyticsReport_CustomAttribute();
                autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver.write;
                autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
                autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token;
                autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                autoValue_CrashlyticsReport_CustomAttribute.MediaMetadataCompat = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
                autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$ResultReceiverWrapper = MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
                autoValue_CrashlyticsReport_CustomAttribute.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                autoValue_CrashlyticsReport_CustomAttribute.ParcelableVolumeInfo = MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
                autoValue_CrashlyticsReport_CustomAttribute.Keep = MediaBrowserCompat$CustomActionResultReceiver.read;
                autoValue_CrashlyticsReport_CustomAttribute.MediaSessionCompat$QueueItem = MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
                autoValue_CrashlyticsReport_CustomAttribute.PlaybackStateCompat = MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
                onGetStartedClick.IconCompatParcelizer((Object) autoValue_CrashlyticsReport_CustomAttribute, "prepaidRequestMailingAdd…                        )");
                write.IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute);
            }
        }
    }

    public static final /* synthetic */ getLog IconCompatParcelizer(IFaceDetector iFaceDetector) {
        getLog getlog = iFaceDetector.MediaSessionCompat$QueueItem;
        if (getlog == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidDisplay");
        }
        return getlog;
    }

    public static final /* synthetic */ AutoValue_CrashlyticsReport_Session_Device.Builder read(IFaceDetector iFaceDetector) {
        AutoValue_CrashlyticsReport_Session_Device.Builder builder = iFaceDetector.MediaBrowserCompat$ItemReceiver;
        if (builder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardTypeSelected");
        }
        return builder;
    }

    public static final /* synthetic */ List write(IFaceDetector iFaceDetector) {
        List<AutoValue_CrashlyticsReport_Session_Device.Builder> list = iFaceDetector.MediaSessionCompat$Token;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardTypeList");
        }
        return list;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IFaceDetector(RegularImmutableBiMap regularImmutableBiMap, LimitInputStream limitInputStream, StandardTable.RowMap.EntrySet entrySet, finishLine finishline, InputSupplier inputSupplier, hashCodeImpl hashcodeimpl, Resources resources) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) limitInputStream, "prepaidRequestLandingDisplayMapper");
        onGetStartedClick.write((Object) entrySet, "cardDisplayMapper");
        onGetStartedClick.write((Object) finishline, "prepaidRequestVerificationDisplayMapper");
        onGetStartedClick.write((Object) inputSupplier, "prepaidRequestMailingAddressDisplayMapper");
        onGetStartedClick.write((Object) hashcodeimpl, "controller");
        onGetStartedClick.write((Object) resources, "resources");
        this.MediaBrowserCompat$SearchResultReceiver = limitInputStream;
        this.MediaDescriptionCompat = entrySet;
        this.MediaBrowserCompat$MediaItem = finishline;
        this.MediaMetadataCompat = inputSupplier;
        this.write = hashcodeimpl;
        this.ParcelableVolumeInfo = resources;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        List<AutoValue_CrashlyticsReport_Session_Device.Builder> list = this.MediaSessionCompat$Token;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardTypeList");
        }
        this.MediaBrowserCompat$ItemReceiver = list.get(i);
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(this);
        if (this.RatingCompat != null) {
            ratingCompat.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void onDestroy() {
        this.write.IconCompatParcelizer();
        super.onDestroy();
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (str2.length() == 0) {
            return "";
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "Road")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" ");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(str);
            return sb2.toString();
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "")) {
            return str2;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(" ");
            String obj2 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj2);
            sb4.append(str2);
            return sb4.toString();
        }
    }

    private static String write(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(str2);
        String obj2 = sb2.toString();
        if (obj2 != null) {
            String obj3 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj2).toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(" ");
            String obj4 = sb3.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(obj4);
            sb4.append(str4);
            String obj5 = sb4.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(obj5);
            sb5.append(" ");
            String obj6 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(obj6);
            sb6.append(str5);
            String obj7 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(obj7);
            sb7.append(" ");
            String obj8 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(obj8);
            sb8.append(str6);
            String obj9 = sb8.toString();
            if (obj9 != null) {
                String obj10 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj9).toString();
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str7);
                sb9.append(" ");
                String obj11 = sb9.toString();
                StringBuilder sb10 = new StringBuilder();
                sb10.append(obj11);
                sb10.append(str8);
                String obj12 = sb10.toString();
                if (obj12 != null) {
                    String obj13 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj12).toString();
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append(str9);
                    sb11.append(" ");
                    String obj14 = sb11.toString();
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(obj14);
                    sb12.append(str10);
                    String obj15 = sb12.toString();
                    if (obj15 != null) {
                        boolean z = true;
                        ArrayList IconCompatParcelizer2 = HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(obj3, obj10, obj13, GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj15).toString());
                        StringBuffer stringBuffer = new StringBuffer();
                        int i = 0;
                        for (Object next : IconCompatParcelizer2) {
                            if (i >= 0) {
                                String str11 = (String) next;
                                if (str11.length() > 0) {
                                    stringBuffer.append(str11);
                                    stringBuffer.append("\n");
                                }
                                i++;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        }
                        CharSequence charSequence = stringBuffer;
                        onGetStartedClick.write((Object) charSequence, "$this$dropLast");
                        int length = charSequence.length() - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        onGetStartedClick.write((Object) charSequence, "$this$take");
                        if (length < 0) {
                            z = false;
                        }
                        if (z) {
                            int length2 = charSequence.length();
                            if (length > length2) {
                                length = length2;
                            }
                            return charSequence.subSequence(0, length).toString();
                        }
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("Requested character count ");
                        sb13.append(length);
                        sb13.append(" is less than zero.");
                        throw new IllegalArgumentException(sb13.toString().toString());
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(IFaceDetector iFaceDetector) {
        if (iFaceDetector.RatingCompat != null) {
            iFaceDetector.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(IFaceDetector iFaceDetector, Throwable th) {
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate != null) {
                ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                onGetStartedClick.IconCompatParcelizer((Object) zza, "error");
                String str = zza.IconCompatParcelizer;
                if (str == null || str.hashCode() != 1746712 || !str.equals("9100")) {
                    iFaceDetector.MediaBrowserCompat$ItemReceiver(iFaceDetector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                    return;
                }
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.read;
                boolean z = true;
                if (iFaceDetector.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(iFaceDetector.RatingCompat);
                }
                if (iFaceDetector.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iFaceDetector.RatingCompat.aj_();
                    return;
                }
                return;
            }
            iFaceDetector.MediaBrowserCompat$ItemReceiver(iFaceDetector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            return;
        }
        iFaceDetector.MediaBrowserCompat$ItemReceiver(iFaceDetector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(IFaceDetector iFaceDetector, getLog getlog) {
        List<AutoValue_CrashlyticsReport_Session_Device.Builder> list = getlog.read;
        iFaceDetector.MediaSessionCompat$Token = list;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidCardTypeList");
        }
        Iterable<AutoValue_CrashlyticsReport_Session_Device.Builder> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (AutoValue_CrashlyticsReport_Session_Device.Builder builder : iterable) {
            arrayList.add(iFaceDetector.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(builder.MediaBrowserCompat$CustomActionResultReceiver, (String) null));
        }
        writeUInt64NoTag.IconCompatParcelizer mediaDescriptionCompat = new MediaDescriptionCompat((List) arrayList, iFaceDetector);
        if (iFaceDetector.RatingCompat != null) {
            mediaDescriptionCompat.IconCompatParcelizer(iFaceDetector.RatingCompat);
        }
    }

    public static final /* synthetic */ String IconCompatParcelizer(IFaceDetector iFaceDetector, getRam getram) {
        String MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver("", getram.MediaBrowserCompat$ItemReceiver);
        String MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver("", getram.MediaSessionCompat$QueueItem);
        String string = iFaceDetector.ParcelableVolumeInfo.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_mailing_address_unit);
        onGetStartedClick.IconCompatParcelizer((Object) string, "resources.getString(R.st…est_mailing_address_unit)");
        String MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(string, getram.MediaMetadataCompat);
        String string2 = iFaceDetector.ParcelableVolumeInfo.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_mailing_address_floor);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "resources.getString(R.st…st_mailing_address_floor)");
        String MediaBrowserCompat$CustomActionResultReceiver4 = MediaBrowserCompat$CustomActionResultReceiver(string2, getram.read);
        String string3 = iFaceDetector.ParcelableVolumeInfo.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_mailing_address_moo);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "resources.getString(R.st…uest_mailing_address_moo)");
        String MediaBrowserCompat$CustomActionResultReceiver5 = MediaBrowserCompat$CustomActionResultReceiver(string3, getram.MediaBrowserCompat$CustomActionResultReceiver);
        String string4 = iFaceDetector.ParcelableVolumeInfo.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_mailing_address_trok);
        onGetStartedClick.IconCompatParcelizer((Object) string4, "resources.getString(R.st…est_mailing_address_trok)");
        String MediaBrowserCompat$CustomActionResultReceiver6 = MediaBrowserCompat$CustomActionResultReceiver(string4, getram.MediaDescriptionCompat);
        String string5 = iFaceDetector.ParcelableVolumeInfo.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_mailing_address_soi);
        onGetStartedClick.IconCompatParcelizer((Object) string5, "resources.getString(R.st…uest_mailing_address_soi)");
        String MediaBrowserCompat$CustomActionResultReceiver7 = MediaBrowserCompat$CustomActionResultReceiver(string5, getram.MediaBrowserCompat$MediaItem);
        String string6 = iFaceDetector.ParcelableVolumeInfo.getString(Iterables$3$MediaBrowserCompat$MediaItem.prepaid_request_mailing_address_road);
        onGetStartedClick.IconCompatParcelizer((Object) string6, "resources.getString(R.st…est_mailing_address_road)");
        String MediaBrowserCompat$CustomActionResultReceiver8 = MediaBrowserCompat$CustomActionResultReceiver(string6, getram.RatingCompat);
        String MediaBrowserCompat$CustomActionResultReceiver9 = MediaBrowserCompat$CustomActionResultReceiver("", getram.IconCompatParcelizer);
        String MediaBrowserCompat$CustomActionResultReceiver10 = MediaBrowserCompat$CustomActionResultReceiver("", getram.write);
        String MediaBrowserCompat$CustomActionResultReceiver11 = MediaBrowserCompat$CustomActionResultReceiver("", getram.MediaBrowserCompat$SearchResultReceiver);
        String MediaBrowserCompat$CustomActionResultReceiver12 = MediaBrowserCompat$CustomActionResultReceiver("", getram.MediaSessionCompat$Token);
        boolean z = true;
        if (!(MediaBrowserCompat$CustomActionResultReceiver4.length() > 0)) {
            return write(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver5, MediaBrowserCompat$CustomActionResultReceiver6, MediaBrowserCompat$CustomActionResultReceiver7, MediaBrowserCompat$CustomActionResultReceiver8, MediaBrowserCompat$CustomActionResultReceiver9, MediaBrowserCompat$CustomActionResultReceiver10, MediaBrowserCompat$CustomActionResultReceiver11, MediaBrowserCompat$CustomActionResultReceiver12);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
        sb.append(" ");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append(MediaBrowserCompat$CustomActionResultReceiver4);
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj2);
        sb3.append(" ");
        String obj3 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(obj3);
        sb4.append(MediaBrowserCompat$CustomActionResultReceiver3);
        String obj4 = sb4.toString();
        if (obj4 != null) {
            String obj5 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj4).toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(MediaBrowserCompat$CustomActionResultReceiver);
            sb5.append(" ");
            String obj6 = sb5.toString();
            StringBuilder sb6 = new StringBuilder();
            sb6.append(obj6);
            sb6.append(MediaBrowserCompat$CustomActionResultReceiver5);
            String obj7 = sb6.toString();
            StringBuilder sb7 = new StringBuilder();
            sb7.append(obj7);
            sb7.append(" ");
            String obj8 = sb7.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(obj8);
            sb8.append(MediaBrowserCompat$CustomActionResultReceiver6);
            String obj9 = sb8.toString();
            StringBuilder sb9 = new StringBuilder();
            sb9.append(obj9);
            sb9.append(" ");
            String obj10 = sb9.toString();
            StringBuilder sb10 = new StringBuilder();
            sb10.append(obj10);
            sb10.append(MediaBrowserCompat$CustomActionResultReceiver7);
            String obj11 = sb10.toString();
            StringBuilder sb11 = new StringBuilder();
            sb11.append(obj11);
            sb11.append(" ");
            String obj12 = sb11.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(obj12);
            sb12.append(MediaBrowserCompat$CustomActionResultReceiver8);
            String obj13 = sb12.toString();
            if (obj13 != null) {
                String obj14 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj13).toString();
                StringBuilder sb13 = new StringBuilder();
                sb13.append(MediaBrowserCompat$CustomActionResultReceiver9);
                sb13.append(" ");
                String obj15 = sb13.toString();
                StringBuilder sb14 = new StringBuilder();
                sb14.append(obj15);
                sb14.append(MediaBrowserCompat$CustomActionResultReceiver10);
                String obj16 = sb14.toString();
                if (obj16 != null) {
                    String obj17 = GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj16).toString();
                    StringBuilder sb15 = new StringBuilder();
                    sb15.append(MediaBrowserCompat$CustomActionResultReceiver11);
                    sb15.append(" ");
                    String obj18 = sb15.toString();
                    StringBuilder sb16 = new StringBuilder();
                    sb16.append(obj18);
                    sb16.append(MediaBrowserCompat$CustomActionResultReceiver12);
                    String obj19 = sb16.toString();
                    if (obj19 != null) {
                        ArrayList IconCompatParcelizer2 = HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(obj5, obj14, obj17, GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(obj19).toString());
                        StringBuffer stringBuffer = new StringBuffer();
                        int i = 0;
                        for (Object next : IconCompatParcelizer2) {
                            if (i >= 0) {
                                String str = (String) next;
                                if (str.length() > 0) {
                                    stringBuffer.append(str);
                                    stringBuffer.append("\n");
                                }
                                i++;
                            } else {
                                throw new ArithmeticException("Index overflow has happened.");
                            }
                        }
                        String obj20 = stringBuffer.toString();
                        onGetStartedClick.IconCompatParcelizer((Object) obj20, "buildingData.toString()");
                        onGetStartedClick.write((Object) obj20, "$this$dropLast");
                        int length = obj20.length() - 1;
                        if (length < 0) {
                            length = 0;
                        }
                        onGetStartedClick.write((Object) obj20, "$this$take");
                        if (length < 0) {
                            z = false;
                        }
                        if (z) {
                            int length2 = obj20.length();
                            if (length > length2) {
                                length = length2;
                            }
                            String substring = obj20.substring(0, length);
                            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            return substring;
                        }
                        StringBuilder sb17 = new StringBuilder();
                        sb17.append("Requested character count ");
                        sb17.append(length);
                        sb17.append(" is less than zero.");
                        throw new IllegalArgumentException(sb17.toString().toString());
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public static final /* synthetic */ void IconCompatParcelizer(IFaceDetector iFaceDetector, Throwable th) {
        if (th instanceof RetrofitException) {
            ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
            if (iLocationSourceDelegate != null) {
                ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                onGetStartedClick.IconCompatParcelizer((Object) zza, "error");
                String str = zza.IconCompatParcelizer;
                if (str == null || str.hashCode() != 1686170 || !str.equals("7001")) {
                    iFaceDetector.MediaBrowserCompat$ItemReceiver(iFaceDetector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                    return;
                }
            } else {
                iFaceDetector.MediaBrowserCompat$ItemReceiver(iFaceDetector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                return;
            }
        }
        iFaceDetector.MediaBrowserCompat$ItemReceiver(iFaceDetector.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}

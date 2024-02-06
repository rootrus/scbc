package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.GoogleMap;
import p040o.ILocationSourceDelegate;
import p040o.LineReader;
import p040o.access$2300;
import p040o.newLocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress3FieldName */
public final class getAddress3FieldName extends writeUInt64NoTag<newLocalProjectProvider.write> {
    public getCustomAttributes IconCompatParcelizer;
    public final lastIndexOfImpl MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final LineReader.C35641 write;

    /* renamed from: o.getAddress3FieldName$MediaMetadataCompat */
    public static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getAddress3FieldName IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MediaMetadataCompat(getAddress3FieldName getaddress3fieldname) {
            super(1);
            this.IconCompatParcelizer = getaddress3fieldname;
        }

        /* renamed from: o.getAddress3FieldName$MediaMetadataCompat$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<newLocalProjectProvider.write> {
            public static final write IconCompatParcelizer = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((newLocalProjectProvider.write) obj).MediaBrowserCompat$ItemReceiver();
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            boolean z = false;
            if (th instanceof RetrofitException) {
                ILocationSourceDelegate iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer;
                if (iLocationSourceDelegate != null) {
                    if (iLocationSourceDelegate.write != null) {
                        ILocationSourceDelegate.zza zza = iLocationSourceDelegate.write;
                        onGetStartedClick.IconCompatParcelizer((Object) zza, "errorResponse.error");
                        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("1002", zza.IconCompatParcelizer, true)) {
                            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                        }
                    }
                    getAddress3FieldName getaddress3fieldname = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.IconCompatParcelizer;
                    if (getaddress3fieldname.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(getaddress3fieldname.RatingCompat);
                    }
                } else {
                    this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            } else {
                getAddress3FieldName getaddress3fieldname2 = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C44923.write;
                if (getaddress3fieldname2.RatingCompat != null) {
                    iconCompatParcelizer2.IconCompatParcelizer(getaddress3fieldname2.RatingCompat);
                }
            }
            getAddress3FieldName getaddress3fieldname3 = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = C44912.read;
            if (getaddress3fieldname3.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(getaddress3fieldname3.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getAddress3FieldName$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<newLocalProjectProvider.write> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newLocalProjectProvider.write) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.getAddress3FieldName$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<GoogleMap.OnGroundOverlayClickListener, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getAddress3FieldName MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(getAddress3FieldName getaddress3fieldname) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = getaddress3fieldname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            boolean z;
            boolean z2;
            GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener = (GoogleMap.OnGroundOverlayClickListener) obj;
            onGetStartedClick.write((Object) onGroundOverlayClickListener, "it");
            getAddress3FieldName getaddress3fieldname = this.MediaBrowserCompat$ItemReceiver;
            LineReader.C35641 read = getaddress3fieldname.write;
            onGetStartedClick.write((Object) onGroundOverlayClickListener, "domain");
            String str2 = onGroundOverlayClickListener.read;
            GoogleMap.OnCameraMoveListener onCameraMoveListener = onGroundOverlayClickListener.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) onCameraMoveListener, "travelCard");
            List<String> list = onCameraMoveListener.MediaBrowserCompat$ItemReceiver;
            int i = onCameraMoveListener.write;
            Double d = onCameraMoveListener.read;
            if (d == null || (str = LineReader.C35641.write(Double.valueOf(d.doubleValue()))) == null) {
                str = "-";
            }
            String write = LineReader.C35641.write(Double.valueOf(onCameraMoveListener.IconCompatParcelizer));
            onGetStartedClick.IconCompatParcelizer((Object) write, "transformFund(travelCard.thbEquivalentAmount)");
            AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event = new AutoValue_CrashlyticsReport_Session_Event(list, String.valueOf(i), str, write);
            List<GoogleMap.OnCameraMoveCanceledListener> list2 = onGroundOverlayClickListener.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) list2, "wallets");
            Iterable<GoogleMap.OnCameraMoveCanceledListener> iterable = list2;
            int i2 = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i2 = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i2);
            for (GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener : iterable) {
                String str3 = onCameraMoveCanceledListener.MediaBrowserCompat$CustomActionResultReceiver;
                String str4 = onCameraMoveCanceledListener.MediaBrowserCompat$ItemReceiver;
                String c_ = read.mo26549c_(onCameraMoveCanceledListener.MediaMetadataCompat);
                onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(it.flagImage)");
                String write2 = LineReader.C35641.write(Double.valueOf(onCameraMoveCanceledListener.write));
                onGetStartedClick.IconCompatParcelizer((Object) write2, "transformFund(it.amount)");
                String write3 = LineReader.C35641.write(Double.valueOf(onCameraMoveCanceledListener.MediaDescriptionCompat));
                onGetStartedClick.IconCompatParcelizer((Object) write3, "transformFund(it.thbEquivalentAmount)");
                AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = r10;
                AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application2 = new AutoValue_CrashlyticsReport_Session_Event_Application(str3, str4, c_, write2, write3, onCameraMoveCanceledListener.MediaBrowserCompat$MediaItem, onCameraMoveCanceledListener.IconCompatParcelizer, onCameraMoveCanceledListener.MediaBrowserCompat$SearchResultReceiver, onCameraMoveCanceledListener.read);
                arrayList.add(autoValue_CrashlyticsReport_Session_Event_Application);
                onGroundOverlayClickListener = onGroundOverlayClickListener;
            }
            GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener2 = onGroundOverlayClickListener;
            getaddress3fieldname.IconCompatParcelizer = new getCustomAttributes(str2, autoValue_CrashlyticsReport_Session_Event, (List) arrayList);
            getAddress3FieldName getaddress3fieldname2 = this.MediaBrowserCompat$ItemReceiver;
            getCustomAttributes getcustomattributes = getaddress3fieldname2.IconCompatParcelizer;
            if (getcustomattributes == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelWalletSummaryDisplay");
            }
            Iterable iterable2 = getcustomattributes.read;
            boolean z3 = false;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                Iterator it = iterable2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((AutoValue_CrashlyticsReport_Session_Event_Application) it.next()).MediaBrowserCompat$CustomActionResultReceiver == 1) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.read;
                if (getaddress3fieldname2.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(getaddress3fieldname2.RatingCompat);
                }
            } else {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getAddress3FieldName$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                if (getaddress3fieldname2.RatingCompat != null) {
                    iconCompatParcelizer2.IconCompatParcelizer(getaddress3fieldname2.RatingCompat);
                }
            }
            getAddress3FieldName getaddress3fieldname3 = this.MediaBrowserCompat$ItemReceiver;
            final GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener3 = onGroundOverlayClickListener2;
            writeUInt64NoTag.IconCompatParcelizer r2 = new writeUInt64NoTag.IconCompatParcelizer<newLocalProjectProvider.write>(this) {
                private /* synthetic */ read MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    newLocalProjectProvider.write write = (newLocalProjectProvider.write) obj;
                    write.MediaBrowserCompat$CustomActionResultReceiver();
                    write.IconCompatParcelizer(getAddress3FieldName.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver).read);
                    if (!onGroundOverlayClickListener3.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                        write.write(getAddress3FieldName.write(onGroundOverlayClickListener3.MediaBrowserCompat$CustomActionResultReceiver.get(0).IconCompatParcelizer), true);
                    }
                }
            };
            if (getaddress3fieldname3.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                r2.IconCompatParcelizer(getaddress3fieldname3.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getAddress3FieldName$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<newLocalProjectProvider.write> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((newLocalProjectProvider.write) obj).read();
        }
    }

    public static final /* synthetic */ getCustomAttributes MediaBrowserCompat$CustomActionResultReceiver(getAddress3FieldName getaddress3fieldname) {
        getCustomAttributes getcustomattributes = getaddress3fieldname.IconCompatParcelizer;
        if (getcustomattributes == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelWalletSummaryDisplay");
        }
        return getcustomattributes;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getAddress3FieldName(RegularImmutableBiMap regularImmutableBiMap, LineReader.C35641 r3, lastIndexOfImpl lastindexofimpl) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "prepaidTravelWalletSummaryDisplayMapper");
        onGetStartedClick.write((Object) lastindexofimpl, "controller");
        this.write = r3;
        this.MediaBrowserCompat$ItemReceiver = lastindexofimpl;
    }

    public static boolean write(List<String> list) {
        onGetStartedClick.write((Object) list, "allowFlag");
        return list.contains("CASH_OUT_SOURCE");
    }

    public final void onDestroy() {
        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        super.onDestroy();
    }
}

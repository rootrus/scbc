package p040o;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.LinkedListMultimap;
import p040o.QueueFile;
import p040o.Tables;
import p040o.setUiOrientation;
import p040o.writeUInt64NoTag;

/* renamed from: o.aP */
public final class C3978aP extends writeUInt64NoTag<isProcessed> {
    /* access modifiers changed from: private */
    public final Tables.TransposeTable.C38381 MediaBrowserCompat$ItemReceiver;
    public List<? extends AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> read;
    public final LinkedListMultimap.MultisetView.C35822.C35831 write;

    /* renamed from: o.aP$RatingCompat */
    static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<writeHeader, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C3978aP IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(C3978aP aPVar) {
            super(1);
            this.IconCompatParcelizer = aPVar;
        }

        /* renamed from: o.aP$RatingCompat$read */
        static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<isProcessed, HmlVerifyPhoneValidateOtpActivity> {
            public static final read write = new read();

            read() {
                super(1);
            }

            public final String getName() {
                return "showEmptyAccounts";
            }

            public final CheckSCBSEligibilityActivity getOwner() {
                return FundOnboardingLandingActivity_ViewBinding.write(isProcessed.class);
            }

            public final String getSignature() {
                return "showEmptyAccounts()V";
            }

            public final /* synthetic */ Object invoke(Object obj) {
                isProcessed isprocessed = (isProcessed) obj;
                onGetStartedClick.write((Object) isprocessed, "p1");
                isprocessed.IconCompatParcelizer();
                return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            }
        }

        /* renamed from: o.aP$RatingCompat$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<isProcessed> {
            private /* synthetic */ writeHeader MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ List MediaBrowserCompat$ItemReceiver;

            write(List list, writeHeader writeheader) {
                this.MediaBrowserCompat$ItemReceiver = list;
                this.MediaBrowserCompat$CustomActionResultReceiver = writeheader;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                isProcessed isprocessed = (isProcessed) obj;
                isprocessed.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
                isprocessed.read(false);
                isprocessed.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
        }

        /* JADX WARNING: type inference failed for: r1v4, types: [o.AppStatsEnvSettings] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
            /*
                r10 = this;
                o.writeHeader r11 = (p040o.writeHeader) r11
                java.lang.String r0 = "display"
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r0)
                o.aP r0 = r10.IconCompatParcelizer
                o.Tables$TransposeTable$1 r1 = r0.MediaBrowserCompat$ItemReceiver
                o.aP r2 = r10.IconCompatParcelizer
                o.LinkedListMultimap$MultisetView$2$1 r2 = r2.write
                o.in r2 = r2.write
                o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver r2 = r2.MediaBrowserCompat$CustomActionResultReceiver
                boolean r2 = r2.setItemInvoker()
                java.lang.String r3 = "landingDisplay"
                p040o.onGetStartedClick.write((java.lang.Object) r11, (java.lang.String) r3)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                java.util.List<o.ringRead> r4 = r11.MediaBrowserCompat$CustomActionResultReceiver
                int r4 = r4.size()
                java.util.List<o.ringRead> r5 = r11.read
                int r5 = r5.size()
                java.util.List<o.ringRead> r6 = r11.MediaBrowserCompat$ItemReceiver
                int r6 = r6.size()
                java.util.List<o.ringRead> r7 = r11.write
                int r7 = r7.size()
                int r4 = r4 + r5
                int r4 = r4 + r6
                int r4 = r4 + r7
                java.util.List<o.ringRead> r5 = r11.IconCompatParcelizer
                int r5 = r5.size()
                int r4 = r4 + r5
                r5 = 1
                r6 = 0
                if (r4 <= 0) goto L_0x004d
                r4 = r5
                goto L_0x004e
            L_0x004d:
                r4 = r6
            L_0x004e:
                if (r4 == 0) goto L_0x0139
                o.QueueFile$Element r4 = r1.MediaBrowserCompat$CustomActionResultReceiver()
                r3.add(r4)
                int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_accounts_header_credit_card
                android.content.res.Resources r7 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r4 = r7.getString(r4)
                java.lang.String r7 = "getString(R.string.auto_…ounts_header_credit_card)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r7)
                java.util.List<o.ringRead> r7 = r11.MediaBrowserCompat$CustomActionResultReceiver
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                o.Tables$TransposeTable$1$MediaBrowserCompat$CustomActionResultReceiver r9 = p040o.C3839x5b0c968e.MediaBrowserCompat$ItemReceiver
                o.findFragmentByWho r9 = (p040o.findFragmentByWho) r9
                java.util.List r7 = p040o.Tables.TransposeTable.C38381.MediaBrowserCompat$ItemReceiver(r7, r9)
                java.util.Collection r7 = (java.util.Collection) r7
                r8.addAll(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.List r4 = p040o.Tables.TransposeTable.C38381.read(r4, r8)
                java.util.Collection r4 = (java.util.Collection) r4
                r3.addAll(r4)
                int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_accounts_header_debit_card
                android.content.res.Resources r7 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r4 = r7.getString(r4)
                java.lang.String r7 = "getString(R.string.auto_…counts_header_debit_card)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r7)
                java.util.List<o.ringRead> r7 = r11.write
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                o.Tables$TransposeTable$1$MediaBrowserCompat$ItemReceiver r9 = p040o.Tables$TransposeTable$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver
                o.findFragmentByWho r9 = (p040o.findFragmentByWho) r9
                java.util.List r7 = p040o.Tables.TransposeTable.C38381.MediaBrowserCompat$ItemReceiver(r7, r9)
                java.util.Collection r7 = (java.util.Collection) r7
                r8.addAll(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.List r4 = p040o.Tables.TransposeTable.C38381.read(r4, r8)
                java.util.Collection r4 = (java.util.Collection) r4
                r3.addAll(r4)
                int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_accounts_header_prepaid_card
                android.content.res.Resources r7 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r4 = r7.getString(r4)
                java.lang.String r7 = "getString(R.string.auto_…unts_header_prepaid_card)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r7)
                java.util.List<o.ringRead> r7 = r11.MediaBrowserCompat$ItemReceiver
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                o.Tables$TransposeTable$1$RatingCompat r9 = p040o.Tables.TransposeTable.C38381.RatingCompat.read
                o.findFragmentByWho r9 = (p040o.findFragmentByWho) r9
                java.util.List r7 = p040o.Tables.TransposeTable.C38381.MediaBrowserCompat$ItemReceiver(r7, r9)
                java.util.Collection r7 = (java.util.Collection) r7
                r8.addAll(r7)
                java.util.List r8 = (java.util.List) r8
                java.util.List r4 = p040o.Tables.TransposeTable.C38381.read(r4, r8)
                java.util.Collection r4 = (java.util.Collection) r4
                r3.addAll(r4)
                int r4 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_accounts_header_deposit
                android.content.res.Resources r7 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r4 = r7.getString(r4)
                java.lang.String r7 = "getString(R.string.auto_…_accounts_header_deposit)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r4, (java.lang.String) r7)
                java.util.List<o.ringRead> r7 = r11.IconCompatParcelizer
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                o.Tables$TransposeTable$1$write r9 = new o.Tables$TransposeTable$1$write
                r9.<init>(r1, r2)
                o.findFragmentByWho r9 = (p040o.findFragmentByWho) r9
                java.util.List r2 = p040o.Tables.TransposeTable.C38381.MediaBrowserCompat$ItemReceiver(r7, r9)
                java.util.Collection r2 = (java.util.Collection) r2
                r8.addAll(r2)
                java.util.List r8 = (java.util.List) r8
                java.util.List r2 = p040o.Tables.TransposeTable.C38381.read(r4, r8)
                java.util.Collection r2 = (java.util.Collection) r2
                r3.addAll(r2)
                int r2 = p040o.Iterables$3$MediaBrowserCompat$MediaItem.auto_change_mailing_address_accounts_header_loan
                android.content.res.Resources r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.String r2 = r4.getString(r2)
                java.lang.String r4 = "getString(R.string.auto_…ess_accounts_header_loan)"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r4)
                java.util.List<o.ringRead> r4 = r11.read
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                o.Tables$TransposeTable$1$read r8 = new o.Tables$TransposeTable$1$read
                r8.<init>(r1)
                o.findFragmentByWho r8 = (p040o.findFragmentByWho) r8
                java.util.List r1 = p040o.Tables.TransposeTable.C38381.MediaBrowserCompat$ItemReceiver(r4, r8)
                java.util.Collection r1 = (java.util.Collection) r1
                r7.addAll(r1)
                java.util.List r7 = (java.util.List) r7
                java.util.List r1 = p040o.Tables.TransposeTable.C38381.read(r2, r7)
                java.util.Collection r1 = (java.util.Collection) r1
                r3.addAll(r1)
            L_0x0139:
                java.util.List r3 = (java.util.List) r3
                r0.read = r3
                o.aP r0 = r10.IconCompatParcelizer
                java.util.List r0 = r0.read
                if (r0 == 0) goto L_0x0180
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x016a
                o.aP r11 = r10.IconCompatParcelizer
                o.aP$RatingCompat$read r0 = p040o.C3978aP.RatingCompat.read.write
                o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
                if (r0 == 0) goto L_0x015a
                o.AppStatsEnvSettings r1 = new o.AppStatsEnvSettings
                r1.<init>(r0)
                r0 = r1
            L_0x015a:
                o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
                T r1 = r11.RatingCompat
                if (r1 == 0) goto L_0x0161
                goto L_0x0162
            L_0x0161:
                r5 = r6
            L_0x0162:
                if (r5 == 0) goto L_0x0180
                T r11 = r11.RatingCompat
                r0.IconCompatParcelizer(r11)
                goto L_0x0180
            L_0x016a:
                o.aP r1 = r10.IconCompatParcelizer
                o.aP$RatingCompat$write r2 = new o.aP$RatingCompat$write
                r2.<init>(r0, r11)
                o.writeUInt64NoTag$IconCompatParcelizer r2 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r2
                T r11 = r1.RatingCompat
                if (r11 == 0) goto L_0x0178
                goto L_0x0179
            L_0x0178:
                r5 = r6
            L_0x0179:
                if (r5 == 0) goto L_0x0180
                T r11 = r1.RatingCompat
                r2.IconCompatParcelizer(r11)
            L_0x0180:
                o.aP r11 = r10.IconCompatParcelizer
                p040o.C3978aP.MediaBrowserCompat$ItemReceiver(r11)
                o.HmlVerifyPhoneValidateOtpActivity r11 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.C3978aP.RatingCompat.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: o.aP$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C3978aP MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ setLength MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(C3978aP aPVar, setLength setlength) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = aPVar;
            this.MediaBrowserCompat$ItemReceiver = setlength;
        }

        /* renamed from: o.aP$write$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<isProcessed> {
            private /* synthetic */ List read;

            IconCompatParcelizer(List list) {
                this.read = list;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((isProcessed) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            setLength setlength;
            Object obj2;
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            List IconCompatParcelizer2 = this.MediaBrowserCompat$CustomActionResultReceiver.read;
            if (IconCompatParcelizer2 != null) {
                Iterator it = IconCompatParcelizer2.iterator();
                while (true) {
                    setlength = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj2, (Object) this.MediaBrowserCompat$ItemReceiver)) {
                        break;
                    }
                }
                if (obj2 instanceof setLength) {
                    setlength = obj2;
                }
                setLength setlength2 = setlength;
                boolean z = true;
                if (setlength2 != null) {
                    setlength2.MediaBrowserCompat$SearchResultReceiver = true;
                }
                C3978aP aPVar = this.MediaBrowserCompat$CustomActionResultReceiver;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(IconCompatParcelizer2);
                if (aPVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(aPVar.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.aP$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<isProcessed> {
        private /* synthetic */ List write;

        public MediaDescriptionCompat(List list) {
            this.write = list;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((isProcessed) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }

    /* renamed from: o.aP$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C3978aP IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(C3978aP aPVar) {
            super(1);
            this.IconCompatParcelizer = aPVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            C3978aP.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
            if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
                C3978aP aPVar = this.IconCompatParcelizer;
                writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<isProcessed>(this) {
                    private /* synthetic */ MediaMetadataCompat read;

                    {
                        this.read = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        isProcessed isprocessed = (isProcessed) obj;
                        QueueFile.Element MediaBrowserCompat$CustomActionResultReceiver = this.read.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
                        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = false;
                        setUiOrientation.IconCompatParcelizer IconCompatParcelizer = setUiOrientation.IconCompatParcelizer();
                        IconCompatParcelizer.read = 13;
                        setUiOrientation setuiorientation = new setUiOrientation(IconCompatParcelizer, (byte) 0);
                        onGetStartedClick.IconCompatParcelizer((Object) setuiorientation, "Error.newBuilder()\n     …\n                .build()");
                        AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder[] builderArr = {MediaBrowserCompat$CustomActionResultReceiver, setuiorientation};
                        onGetStartedClick.write((Object) builderArr, "elements");
                        onGetStartedClick.write((Object) builderArr, "$this$asList");
                        List asList = Arrays.asList(builderArr);
                        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
                        isprocessed.MediaBrowserCompat$CustomActionResultReceiver(asList);
                        isprocessed.read(false);
                    }
                };
                if (aPVar.RatingCompat != null) {
                    r0.IconCompatParcelizer(aPVar.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.aP$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<isProcessed> {
        private /* synthetic */ standardPutAll write;

        public IconCompatParcelizer(standardPutAll standardputall) {
            this.write = standardputall;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((isProcessed) obj).IconCompatParcelizer(this.write);
        }
    }

    /* renamed from: o.aP$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<PlaceSelectionListener, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C3978aP write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(C3978aP aPVar) {
            super(1);
            this.write = aPVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final PlaceSelectionListener placeSelectionListener = (PlaceSelectionListener) obj;
            onGetStartedClick.write((Object) placeSelectionListener, "response");
            C3978aP aPVar = this.write;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<isProcessed>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((isProcessed) obj).read(placeSelectionListener.read);
                }
            };
            if (aPVar.RatingCompat != null) {
                r1.IconCompatParcelizer(aPVar.RatingCompat);
            }
            C3978aP.MediaBrowserCompat$ItemReceiver(this.write);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C3978aP(LinkedListMultimap.MultisetView.C35822.C35831 r2, Tables.TransposeTable.C38381 r3, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "controller");
        onGetStartedClick.write((Object) r3, "selectAccountMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = r2;
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C3978aP aPVar) {
        if (aPVar.RatingCompat != null) {
            aPVar.RatingCompat.aj_();
        }
    }

    public final void write() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.MultisetView.C35822.C35831 r0 = this.write;
        FundFactSheetActivity ratingCompat = new RatingCompat(this);
        FundFactSheetActivity mediaMetadataCompat = new MediaMetadataCompat(this);
        onGetStartedClick.write((Object) ratingCompat, "onSuccess");
        onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
        r0.MediaBrowserCompat$CustomActionResultReceiver.read(ratingCompat, mediaMetadataCompat, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), new LinkedListMultimap.MultisetView.C35822.C35831.write(r0), r0.MediaBrowserCompat$ItemReceiver);
    }
}

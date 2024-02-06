package p040o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.net.URI;

/* renamed from: o.FragmentBuilder_BindSMELandingFragment */
public final class FragmentBuilder_BindSMELandingFragment implements FragmentBuilder_BindSCBSLandingFragment {
    public static final IconCompatParcelizer write = new IconCompatParcelizer((byte) 0);
    /* access modifiers changed from: private */
    public final SQLiteDatabase MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.FragmentBuilder_BindSMELandingFragment$MediaDescriptionCompat */
    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundFactSheetActivity<SQLiteDatabase, Integer> {
        private /* synthetic */ URI IconCompatParcelizer;
        private /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment read;
        private /* synthetic */ FragmentBuilder_BindHmlNtbOutcomeRejectFragment write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, URI uri) {
            super(1);
            this.read = fragmentBuilder_BindHmlOperatingBankFragment;
            this.write = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
            this.IconCompatParcelizer = uri;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            URI uri;
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            onGetStartedClick.write((Object) sQLiteDatabase, "db");
            ContentValues contentValues = new ContentValues(1);
            FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment = this.read;
            String str = null;
            if (fragmentBuilder_BindHmlOperatingBankFragment != null) {
                uri = fragmentBuilder_BindHmlOperatingBankFragment.write;
            } else {
                uri = null;
            }
            contentValues.put("host_uri", String.valueOf(uri));
            int update = sQLiteDatabase.update("offline_requests", contentValues, "host_uri = ?", new String[]{"~~HOST~~"});
            ContentValues contentValues2 = new ContentValues(1);
            FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment = this.write;
            if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null) {
                str = fragmentBuilder_BindHmlNtbOutcomeRejectFragment.read;
            }
            contentValues2.put("site_key", str);
            int update2 = sQLiteDatabase.update("offline_requests", contentValues2, "site_key = ?", new String[]{"~~SITEKEY~~"});
            ContentValues contentValues3 = new ContentValues(1);
            contentValues3.put("touchpoint_uri", String.valueOf(this.IconCompatParcelizer));
            return Integer.valueOf(update + update2 + sQLiteDatabase.update("offline_requests", contentValues3, "touchpoint_uri = ?", new String[]{"~~TOUCHPOINT~~"}));
        }
    }

    public FragmentBuilder_BindSMELandingFragment(SQLiteDatabase sQLiteDatabase) {
        onGetStartedClick.write((Object) sQLiteDatabase, "database");
        this.MediaBrowserCompat$ItemReceiver = sQLiteDatabase;
    }

    public final Object read(FragmentBuilder_BindReviewRedemptionFragment fragmentBuilder_BindReviewRedemptionFragment) {
        return FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new read(this, fragmentBuilder_BindReviewRedemptionFragment));
    }

    public final Object IconCompatParcelizer() {
        return FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new write(this));
    }

    public final Object read(long j) {
        return FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new C6754x1472f97a(this, j));
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, FundFactSheetActivity<? super FragmentBuilder_BindReviewRedemptionFragment, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        return FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new C6755x7d5c75c9(this, fragmentBuilder_BindHmlNtbOutcomeRejectFragment, fragmentBuilder_BindHmlOperatingBankFragment, fundFactSheetActivity));
    }

    /* renamed from: o.FragmentBuilder_BindSMELandingFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object IconCompatParcelizer(p040o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r6, p040o.FragmentBuilder_BindHmlOperatingBankFragment r7, java.net.URI r8) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L_0x0020
            java.net.URI r2 = r7.write
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "thinstance.uri.toString()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0019
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            if (r2 == 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            java.lang.String r2 = ""
            goto L_0x002e
        L_0x0020:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Missing Host. "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x002e:
            r3 = 0
            if (r6 == 0) goto L_0x0034
            java.lang.String r4 = r6.read
            goto L_0x0035
        L_0x0034:
            r4 = r3
        L_0x0035:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L_0x0041
            int r4 = r4.length()
            if (r4 == 0) goto L_0x0041
            r4 = r1
            goto L_0x0042
        L_0x0041:
            r4 = r0
        L_0x0042:
            if (r4 == 0) goto L_0x0055
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            java.lang.String r2 = "Missing Sitekey. "
            r4.append(r2)
            java.lang.String r2 = r4.toString()
        L_0x0055:
            if (r8 == 0) goto L_0x005b
            java.lang.String r3 = r8.toString()
        L_0x005b:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0067
            int r3 = r3.length()
            if (r3 == 0) goto L_0x0067
            r3 = r1
            goto L_0x0068
        L_0x0067:
            r3 = r0
        L_0x0068:
            if (r3 == 0) goto L_0x007b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "Missing Touchpoint. "
            r3.append(r2)
            java.lang.String r2 = r3.toString()
        L_0x007b:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r0 = r1
        L_0x0086:
            if (r0 == 0) goto L_0x0097
            o.FragmentBuilder_BindIssuerInputFragment$MediaBrowserCompat$ItemReceiver r6 = p040o.FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r2)
            o.FragmentBuilder_BindIssuerInputFragment$write r7 = new o.FragmentBuilder_BindIssuerInputFragment$write
            r7.<init>(r6)
            o.FragmentBuilder_BindIssuerInputFragment r7 = (p040o.FragmentBuilder_BindIssuerInputFragment) r7
            goto L_0x00b5
        L_0x0097:
            android.database.sqlite.SQLiteDatabase r0 = r5.MediaBrowserCompat$ItemReceiver
            o.FragmentBuilder_BindSMELandingFragment$MediaDescriptionCompat r1 = new o.FragmentBuilder_BindSMELandingFragment$MediaDescriptionCompat
            r1.<init>(r7, r6, r8)
            o.FundFactSheetActivity r1 = (p040o.FundFactSheetActivity) r1
            java.lang.String r6 = "$this$transaction"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r6)
            java.lang.String r6 = "block"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r6)
            o.closeTutorial$IconCompatParcelizer r6 = new o.closeTutorial$IconCompatParcelizer
            r6.<init>(r0, r1)
            o.FundActionsSuccessActivity r6 = (p040o.FundActionsSuccessActivity) r6
            o.FragmentBuilder_BindIssuerInputFragment r7 = p040o.FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(r6)
        L_0x00b5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindSMELandingFragment.IconCompatParcelizer(o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment, o.FragmentBuilder_BindHmlOperatingBankFragment, java.net.URI):java.lang.Object");
    }

    /* renamed from: o.FragmentBuilder_BindSMELandingFragment$read */
    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<Boolean> {
        private /* synthetic */ FragmentBuilder_BindReviewRedemptionFragment IconCompatParcelizer;
        private /* synthetic */ FragmentBuilder_BindSMELandingFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(FragmentBuilder_BindSMELandingFragment fragmentBuilder_BindSMELandingFragment, FragmentBuilder_BindReviewRedemptionFragment fragmentBuilder_BindReviewRedemptionFragment) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSMELandingFragment;
            this.IconCompatParcelizer = fragmentBuilder_BindReviewRedemptionFragment;
        }

        public final /* synthetic */ Object invoke() {
            ContentValues contentValues = new ContentValues();
            contentValues.put("request", this.IconCompatParcelizer.read);
            contentValues.put("site_key", this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
            contentValues.put("request_type", this.IconCompatParcelizer.IconCompatParcelizer.name());
            contentValues.put("host_uri", this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            Long l = this.IconCompatParcelizer.RatingCompat;
            if (l == null) {
                l = Long.valueOf(System.currentTimeMillis());
            }
            contentValues.put("timestamp", l);
            contentValues.put("touchpoint_uri", this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver);
            int i = (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.insert("offline_requests", (String) null, contentValues) > -1 ? 1 : (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.insert("offline_requests", (String) null, contentValues) == -1 ? 0 : -1));
            if (i == 0) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_PERFORMING_INSERT);
            }
            return Boolean.valueOf(i != 0);
        }
    }

    /* renamed from: o.FragmentBuilder_BindSMELandingFragment$write */
    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<Boolean> {
        private /* synthetic */ FragmentBuilder_BindSMELandingFragment read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(FragmentBuilder_BindSMELandingFragment fragmentBuilder_BindSMELandingFragment) {
            super(0);
            this.read = fragmentBuilder_BindSMELandingFragment;
        }

        public final /* synthetic */ Object invoke() {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Clearing offline DB - Start");
            this.read.MediaBrowserCompat$ItemReceiver.delete("offline_requests", (String) null, (String[]) null);
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "Clearing offline DB - Success");
            return Boolean.TRUE;
        }
    }
}

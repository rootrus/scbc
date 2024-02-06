package p040o;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.gson.Gson;
import java.io.File;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_BindIssuerInputFragment;

/* renamed from: o.ErrorPageActivity_ViewBinding */
public final class ErrorPageActivity_ViewBinding implements FullScreenLoadingActivity {
    private static final String[] MediaBrowserCompat$CustomActionResultReceiver = {"_id", "request"};
    /* access modifiers changed from: private */
    public final Gson MediaBrowserCompat$ItemReceiver;

    public final int MediaBrowserCompat$ItemReceiver() {
        return 2;
    }

    public final int read() {
        return 1;
    }

    /* renamed from: o.ErrorPageActivity_ViewBinding$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<File, HmlVerifyEmailSuccessfulActivity<? extends File, ? extends ECouponCommonActivity>> {
        private /* synthetic */ ErrorPageActivity_ViewBinding MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(ErrorPageActivity_ViewBinding errorPageActivity_ViewBinding) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = errorPageActivity_ViewBinding;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            File file = (File) obj;
            onGetStartedClick.write((Object) file, "file");
            ECouponCommonActivity IconCompatParcelizer = ErrorPageActivity_ViewBinding.read(file);
            if (IconCompatParcelizer != null) {
                return new HmlVerifyEmailSuccessfulActivity(file, IconCompatParcelizer);
            }
            return null;
        }
    }

    /* renamed from: o.ErrorPageActivity_ViewBinding$RatingCompat */
    static final class RatingCompat extends CheckEligibilityActivity implements FundFactSheetActivity<HmlVerifyEmailSuccessfulActivity<? extends File, ? extends FragmentBuilder_BindReviewRedemptionFragment>, HmlVerifyEmailSuccessfulActivity<? extends File, ? extends Boolean>> {
        private /* synthetic */ SQLiteDatabase IconCompatParcelizer;
        private /* synthetic */ ErrorPageActivity_ViewBinding read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        RatingCompat(ErrorPageActivity_ViewBinding errorPageActivity_ViewBinding, SQLiteDatabase sQLiteDatabase) {
            super(1);
            this.read = errorPageActivity_ViewBinding;
            this.IconCompatParcelizer = sQLiteDatabase;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            boolean z;
            HmlVerifyEmailSuccessfulActivity hmlVerifyEmailSuccessfulActivity = (HmlVerifyEmailSuccessfulActivity) obj;
            onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "<name for destructuring parameter 0>");
            File file = (File) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver;
            FragmentBuilder_BindIssuerInputFragment read2 = FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new MediaDescriptionCompat((FragmentBuilder_BindReviewRedemptionFragment) hmlVerifyEmailSuccessfulActivity.write, this.IconCompatParcelizer));
            if (read2 instanceof FragmentBuilder_BindIssuerInputFragment.write) {
                MyECouponActivity_ViewBinding.read((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) read2).write, FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_INSERTING_PROPERTY_INTO_DATABASE);
            } else if (!(read2 instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer)) {
                throw new NoWhenBranchMatchedException();
            } else if (((Number) ((FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) read2).MediaBrowserCompat$ItemReceiver).longValue() != -1) {
                z = true;
                return new HmlVerifyEmailSuccessfulActivity(file, Boolean.valueOf(z));
            }
            z = false;
            return new HmlVerifyEmailSuccessfulActivity(file, Boolean.valueOf(z));
        }
    }

    /* renamed from: o.ErrorPageActivity_ViewBinding$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<SQLiteDatabase, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ Map MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(Map map) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = map;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            onGetStartedClick.write((Object) sQLiteDatabase, "transaction");
            for (Map.Entry entry : this.MediaBrowserCompat$CustomActionResultReceiver.entrySet()) {
                sQLiteDatabase.update("offline_requests", (ContentValues) entry.getValue(), "_id = ?", new String[]{String.valueOf(((Number) entry.getKey()).intValue())});
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.ErrorPageActivity_ViewBinding$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<File, Boolean> {
        public static final write IconCompatParcelizer = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            File file = (File) obj;
            onGetStartedClick.IconCompatParcelizer((Object) file, "it");
            String name = file.getName();
            onGetStartedClick.IconCompatParcelizer((Object) name, "it.name");
            boolean z = false;
            if (GoodToKnowActivity.read(name, "InteractionProperties_", false) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) file.getName(), (Object) "BaseTouchpointProperties")) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public ErrorPageActivity_ViewBinding() {
        Gson PlaybackStateCompat$CustomAction = FragmentBuilder_BindHmlIssuerLandingFragment.PlaybackStateCompat$CustomAction();
        onGetStartedClick.IconCompatParcelizer((Object) PlaybackStateCompat$CustomAction, "OneInternalProvider.getGson()");
        this.MediaBrowserCompat$ItemReceiver = PlaybackStateCompat$CustomAction;
    }

    public final FragmentBuilder_BindIssuerInputFragment<Exception, Boolean> MediaBrowserCompat$CustomActionResultReceiver(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            return FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new IconCompatParcelizer(sQLiteDatabase, this));
        }
        C6559x7897674c fragmentBuilder_BindIssuerInputFragment$MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer;
        return new FragmentBuilder_BindIssuerInputFragment.write<>(new NullPointerException(FragmentBuilder_BindMailingAddressSuccessfulFragment.NULL_SQLITE_THUNDERHEAD_DB_UPGRADE.toString()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(android.database.sqlite.SQLiteDatabase r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "db"
            p040o.onGetStartedClick.write((java.lang.Object) r7, (java.lang.String) r0)
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r0 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V1_OFFLINE_PROPERTIES_START
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r2)
            android.content.Context r0 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat()
            r2 = 1
            if (r0 == 0) goto L_0x0054
            java.io.File r0 = r0.getFilesDir()
            if (r0 == 0) goto L_0x0054
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L_0x0054
            java.lang.String r3 = "$this$asSequence"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r3)
            int r3 = r0.length
            if (r3 != 0) goto L_0x002c
            r3 = r2
            goto L_0x002d
        L_0x002c:
            r3 = r1
        L_0x002d:
            if (r3 == 0) goto L_0x0034
            o.JuristicBusinessPinActivity r0 = p040o.JuristicBusinessPinActivity.read
            o.BaseJuristicPinActivity_ViewBinding r0 = (p040o.BaseJuristicPinActivity_ViewBinding) r0
            goto L_0x003c
        L_0x0034:
            o.HmlBusinessOwnerReviewSubmissionActivity$MediaBrowserCompat$CustomActionResultReceiver r3 = new o.HmlBusinessOwnerReviewSubmissionActivity$MediaBrowserCompat$CustomActionResultReceiver
            r3.<init>(r0)
            r0 = r3
            o.BaseJuristicPinActivity_ViewBinding r0 = (p040o.BaseJuristicPinActivity_ViewBinding) r0
        L_0x003c:
            if (r0 == 0) goto L_0x0054
            o.ErrorPageActivity_ViewBinding$write r3 = p040o.ErrorPageActivity_ViewBinding.write.IconCompatParcelizer
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3
            java.lang.String r4 = "$this$filter"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r4)
            java.lang.String r4 = "predicate"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r4)
            o.SetupScheduleActivity r4 = new o.SetupScheduleActivity
            r4.<init>(r0, r2, r3)
            o.BaseJuristicPinActivity_ViewBinding r4 = (p040o.BaseJuristicPinActivity_ViewBinding) r4
            goto L_0x0059
        L_0x0054:
            o.JuristicBusinessPinActivity r0 = p040o.JuristicBusinessPinActivity.read
            r4 = r0
            o.BaseJuristicPinActivity_ViewBinding r4 = (p040o.BaseJuristicPinActivity_ViewBinding) r4
        L_0x0059:
            o.ErrorPageActivity_ViewBinding$MediaMetadataCompat r0 = new o.ErrorPageActivity_ViewBinding$MediaMetadataCompat
            r0.<init>(r6)
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            java.lang.String r3 = "$this$mapNotNull"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r3)
            java.lang.String r3 = "transform"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r3)
            o.JuristicSetupNewPinActivity r5 = new o.JuristicSetupNewPinActivity
            r5.<init>(r4, r0)
            o.BaseJuristicPinActivity_ViewBinding r5 = (p040o.BaseJuristicPinActivity_ViewBinding) r5
            o.BaseJuristicPinActivity_ViewBinding r0 = p040o.JuristicRequestFormActivity.MediaBrowserCompat$ItemReceiver(r5)
            o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$SearchResultReceiver r4 = new o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$SearchResultReceiver
            r4.<init>(r6, r8, r9)
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4
            java.lang.String r8 = "$this$map"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r8)
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r3)
            o.JuristicSetupNewPinActivity r9 = new o.JuristicSetupNewPinActivity
            r9.<init>(r0, r4)
            o.BaseJuristicPinActivity_ViewBinding r9 = (p040o.BaseJuristicPinActivity_ViewBinding) r9
            o.ErrorPageActivity_ViewBinding$RatingCompat r0 = new o.ErrorPageActivity_ViewBinding$RatingCompat
            r0.<init>(r6, r7)
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r8)
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r3)
            o.JuristicSetupNewPinActivity r7 = new o.JuristicSetupNewPinActivity
            r7.<init>(r9, r0)
            o.BaseJuristicPinActivity_ViewBinding r7 = (p040o.BaseJuristicPinActivity_ViewBinding) r7
            java.util.Iterator r7 = r7.read()
        L_0x00a3:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00e0
            java.lang.Object r8 = r7.next()
            o.HmlVerifyEmailSuccessfulActivity r8 = (p040o.HmlVerifyEmailSuccessfulActivity) r8
            A r9 = r8.MediaBrowserCompat$CustomActionResultReceiver
            java.io.File r9 = (java.io.File) r9
            B r8 = r8.write
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x00d0
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r8 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATION_1_2_FILE_DELETED
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r8 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r8
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = r9.getName()
            r0[r1] = r3
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r8, r0)
            r9.delete()
            goto L_0x00a3
        L_0x00d0:
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r8 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATION_1_2_FILE_NOT_DELETED
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r8 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r8
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r9 = r9.getName()
            r0[r1] = r9
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r8, r0)
            goto L_0x00a3
        L_0x00e0:
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r7 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V1_OFFLINE_PROPERTIES_STOP
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r7 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r7
            java.lang.Object[] r8 = new java.lang.Object[r1]
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPageActivity_ViewBinding.read(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0051, code lost:
        throw r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.ECouponCommonActivity read(java.io.File r5) {
        /*
            android.content.Context r0 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat()
            r1 = 0
            if (r0 == 0) goto L_0x007e
            java.lang.String r2 = r5.getName()     // Catch:{ Exception -> 0x0052 }
            java.io.File r2 = r0.getFileStreamPath(r2)     // Catch:{ Exception -> 0x0052 }
            if (r2 == 0) goto L_0x007e
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x0052 }
            if (r2 != 0) goto L_0x0018
            goto L_0x007e
        L_0x0018:
            java.lang.String r2 = r5.getName()     // Catch:{ Exception -> 0x0052 }
            java.io.FileInputStream r0 = r0.openFileInput(r2)     // Catch:{ Exception -> 0x0052 }
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch:{ Exception -> 0x0052 }
            r2 = r0
            java.io.FileInputStream r2 = (java.io.FileInputStream) r2     // Catch:{ all -> 0x004b }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ all -> 0x004b }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ all -> 0x004b }
            r3.<init>(r2)     // Catch:{ all -> 0x004b }
            java.io.Closeable r3 = (java.io.Closeable) r3     // Catch:{ all -> 0x004b }
            r2 = r3
            java.io.ObjectInputStream r2 = (java.io.ObjectInputStream) r2     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r2.readObject()     // Catch:{ all -> 0x0044 }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x004b }
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)     // Catch:{ Exception -> 0x0052 }
            boolean r0 = r2 instanceof p040o.ECouponCommonActivity
            if (r0 != 0) goto L_0x0040
            r2 = r1
        L_0x0040:
            o.ECouponCommonActivity r2 = (p040o.ECouponCommonActivity) r2     // Catch:{ Exception -> 0x0052 }
            r1 = r2
            goto L_0x007e
        L_0x0044:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r4 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r3, (java.lang.Throwable) r2)     // Catch:{ all -> 0x004b }
            throw r4     // Catch:{ all -> 0x004b }
        L_0x004b:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x004d }
        L_0x004d:
            r3 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r2)     // Catch:{ Exception -> 0x0052 }
            throw r3     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "ErrorMsg: "
            r2.append(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r3 = " file name: "
            r2.append(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            p040o.MyECouponActivity_ViewBinding.write(r5)
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r5 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_LOADING_FILE
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r5 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r5
            p040o.MyECouponActivity_ViewBinding.read(r0, r5)
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPageActivity_ViewBinding.read(java.io.File):o.ECouponCommonActivity");
    }

    /* renamed from: o.ErrorPageActivity_ViewBinding$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<Boolean> {
        private /* synthetic */ SQLiteDatabase MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ ErrorPageActivity_ViewBinding read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(SQLiteDatabase sQLiteDatabase, ErrorPageActivity_ViewBinding errorPageActivity_ViewBinding) {
            super(0);
            this.MediaBrowserCompat$ItemReceiver = sQLiteDatabase;
            this.read = errorPageActivity_ViewBinding;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
            if ((r0.length() == 0) != false) goto L_0x0074;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke() {
            /*
                r9 = this;
                o.FragmentBuilder_BindMailingAddressSuccessfulFragment r0 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_START
                o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
                r1 = 2
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r3 = new java.lang.Object[r1]
                r4 = 1
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6 = 0
                r3[r6] = r5
                r3[r4] = r2
                p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r3)
                o.ErrorPageActivity_ViewBinding r0 = r9.read
                android.database.sqlite.SQLiteDatabase r3 = r9.MediaBrowserCompat$ItemReceiver
                p040o.ErrorPageActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((p040o.ErrorPageActivity_ViewBinding) r0, (android.database.sqlite.SQLiteDatabase) r3)
                o.FragmentBuilder_BindJuristicOnboardingLandingFragment r0 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView()
                java.lang.String r3 = "OneInternalProvider.getStateStore()"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)
                java.lang.Object r0 = r0.MediaBrowserCompat$ItemReceiver()
                java.lang.String r3 = "OneInternalProvider.getStateStore().state"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)
                o.OnBoardingTutorialActivity r0 = (p040o.OnBoardingTutorialActivity) r0
                o.FundFactSheetActivity r3 = p040o.FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver()
                java.lang.Object r3 = r3.invoke(r0)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r7 = "~~SITEKEY~~"
                if (r3 == 0) goto L_0x0053
                r8 = r3
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                int r8 = r8.length()
                if (r8 != 0) goto L_0x004c
                r8 = r4
                goto L_0x004d
            L_0x004c:
                r8 = r6
            L_0x004d:
                if (r8 == 0) goto L_0x0050
                r3 = r7
            L_0x0050:
                if (r3 == 0) goto L_0x0053
                r7 = r3
            L_0x0053:
                o.FundFactSheetActivity r3 = p040o.FragmentBuilder_BindOnboardingInputAddressFragment.MediaDescriptionCompat()
                java.lang.Object r0 = r3.invoke(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.String r3 = "~~HOST~~"
                if (r0 == 0) goto L_0x0074
                java.lang.String r8 = "it"
                p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r8)
                r8 = r0
                java.lang.CharSequence r8 = (java.lang.CharSequence) r8
                int r8 = r8.length()
                if (r8 != 0) goto L_0x0071
                r8 = r4
                goto L_0x0072
            L_0x0071:
                r8 = r6
            L_0x0072:
                if (r8 == 0) goto L_0x0075
            L_0x0074:
                r0 = r3
            L_0x0075:
                o.FragmentBuilder_BindMailingAddressSuccessfulFragment r3 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V2_OFFLINE_INTERACTIONS_SITEKEY_HOST
                o.FragmentBuilder_BindMerchantWalletSelectorFragment r3 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r3
                java.lang.Object[] r8 = new java.lang.Object[r1]
                r8[r6] = r7
                r8[r4] = r0
                p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r3, r8)
                o.ErrorPageActivity_ViewBinding r3 = r9.read
                android.database.sqlite.SQLiteDatabase r8 = r9.MediaBrowserCompat$ItemReceiver
                p040o.ErrorPageActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r3, r8, r7, r0)
                o.ErrorPageActivity_ViewBinding r3 = r9.read
                android.database.sqlite.SQLiteDatabase r8 = r9.MediaBrowserCompat$ItemReceiver
                r3.read(r8, r7, r0)
                o.FragmentBuilder_BindMailingAddressSuccessfulFragment r0 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_STOP
                o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r6] = r5
                r1[r4] = r2
                p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r1)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPageActivity_ViewBinding.IconCompatParcelizer.invoke():java.lang.Object");
        }
    }

    /* renamed from: o.ErrorPageActivity_ViewBinding$MediaDescriptionCompat */
    static final class MediaDescriptionCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<Long> {
        private /* synthetic */ FragmentBuilder_BindReviewRedemptionFragment IconCompatParcelizer;
        private /* synthetic */ SQLiteDatabase MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaDescriptionCompat(FragmentBuilder_BindReviewRedemptionFragment fragmentBuilder_BindReviewRedemptionFragment, SQLiteDatabase sQLiteDatabase) {
            super(0);
            this.IconCompatParcelizer = fragmentBuilder_BindReviewRedemptionFragment;
            this.MediaBrowserCompat$CustomActionResultReceiver = sQLiteDatabase;
        }

        public final /* synthetic */ Object invoke() {
            String str;
            int i = goToPersonalButtonClick.write[this.IconCompatParcelizer.IconCompatParcelizer.ordinal()];
            if (i == 1) {
                str = "offline_properties";
            } else if (i == 2) {
                str = "offline_interactions";
            } else {
                throw new IllegalArgumentException("Unknown offline request type.");
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("request", this.IconCompatParcelizer.read);
            contentValues.put("site_key", this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
            contentValues.put("request_type", str);
            contentValues.put("host_uri", this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
            Long l = this.IconCompatParcelizer.RatingCompat;
            if (l == null) {
                l = Long.valueOf(System.currentTimeMillis());
            }
            contentValues.put("timestamp", l);
            return Long.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.insert("offline_requests", (String) null, contentValues));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0084, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0087, code lost:
        throw r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(p040o.ErrorPageActivity_ViewBinding r12, android.database.sqlite.SQLiteDatabase r13, java.lang.String r14, java.lang.String r15) {
        /*
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r0 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V1_OFFLINE_INTERACTIONS_START
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r0 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r0
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r0, r2)
            java.lang.String[] r5 = MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r4 = "offline_requests"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r3 = r13
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r0 == 0) goto L_0x0088
            java.io.Closeable r0 = (java.io.Closeable) r0
            r2 = r0
            android.database.Cursor r2 = (android.database.Cursor) r2     // Catch:{ all -> 0x0081 }
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r3 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.V1_OFFLINE_INTERACTIONS_COUNT     // Catch:{ all -> 0x0081 }
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r3 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r3     // Catch:{ all -> 0x0081 }
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0081 }
            int r5 = r2.getCount()     // Catch:{ all -> 0x0081 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0081 }
            r4[r1] = r5     // Catch:{ all -> 0x0081 }
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r3, r4)     // Catch:{ all -> 0x0081 }
            o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$ItemReceiver r3 = new o.ErrorPageActivity_ViewBinding$MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0081 }
            r3.<init>(r12, r2, r14, r15)     // Catch:{ all -> 0x0081 }
            o.FundActionsSuccessActivity r3 = (p040o.FundActionsSuccessActivity) r3     // Catch:{ all -> 0x0081 }
            o.FragmentBuilder_BindIssuerInputFragment r12 = p040o.FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(r3)     // Catch:{ all -> 0x0081 }
            r14 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r14)
            boolean r14 = r12 instanceof p040o.FragmentBuilder_BindIssuerInputFragment.write
            if (r14 == 0) goto L_0x0055
            o.FragmentBuilder_BindIssuerInputFragment$write r12 = (p040o.FragmentBuilder_BindIssuerInputFragment.write) r12
            L r12 = r12.write
            java.lang.Exception r12 = (java.lang.Exception) r12
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r13 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_LOADING_CURSOR
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r13 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r13
            p040o.MyECouponActivity_ViewBinding.read(r12, r13)
            goto L_0x0088
        L_0x0055:
            boolean r14 = r12 instanceof p040o.FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer
            if (r14 == 0) goto L_0x007b
            o.FragmentBuilder_BindIssuerInputFragment$IconCompatParcelizer r12 = (p040o.FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) r12
            R r12 = r12.MediaBrowserCompat$ItemReceiver
            java.util.Map r12 = (java.util.Map) r12
            o.ErrorPageActivity_ViewBinding$read r14 = new o.ErrorPageActivity_ViewBinding$read
            r14.<init>(r12)
            o.FundFactSheetActivity r14 = (p040o.FundFactSheetActivity) r14
            java.lang.String r12 = "$this$transaction"
            p040o.onGetStartedClick.write((java.lang.Object) r13, (java.lang.String) r12)
            java.lang.String r12 = "block"
            p040o.onGetStartedClick.write((java.lang.Object) r14, (java.lang.String) r12)
            o.closeTutorial$IconCompatParcelizer r12 = new o.closeTutorial$IconCompatParcelizer
            r12.<init>(r13, r14)
            o.FundActionsSuccessActivity r12 = (p040o.FundActionsSuccessActivity) r12
            p040o.FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(r12)
            goto L_0x0088
        L_0x007b:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x0081:
            r12 = move-exception
            throw r12     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r13 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r12)
            throw r13
        L_0x0088:
            o.FragmentBuilder_BindMailingAddressSuccessfulFragment r12 = p040o.FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_V1_OFFLINE_INTERACTIONS_STOP
            o.FragmentBuilder_BindMerchantWalletSelectorFragment r12 = (p040o.FragmentBuilder_BindMerchantWalletSelectorFragment) r12
            java.lang.Object[] r13 = new java.lang.Object[r1]
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ErrorPageActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(o.ErrorPageActivity_ViewBinding, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):void");
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ErrorPageActivity_ViewBinding errorPageActivity_ViewBinding, SQLiteDatabase sQLiteDatabase) {
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_COLUMNS_START, "offline_requests", 1, 2);
        sQLiteDatabase.execSQL("ALTER TABLE offline_requests ADD COLUMN request_type TEXT COLLATE LOCALIZED NOT NULL DEFAULT ''");
        sQLiteDatabase.execSQL("ALTER TABLE offline_requests ADD COLUMN site_key TEXT COLLATE LOCALIZED NOT NULL DEFAULT ''");
        sQLiteDatabase.execSQL("ALTER TABLE offline_requests ADD COLUMN timestamp TEXT COLLATE LOCALIZED NOT NULL DEFAULT ''");
        sQLiteDatabase.execSQL("ALTER TABLE offline_requests ADD COLUMN host_uri TEXT COLLATE LOCALIZED NOT NULL DEFAULT ''");
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_COLUMNS_STOP, "offline_requests", 1, 2);
    }
}

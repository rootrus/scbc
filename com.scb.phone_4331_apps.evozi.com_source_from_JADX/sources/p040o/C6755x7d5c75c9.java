package p040o;

import android.database.Cursor;
import p040o.FragmentBuilder_BindSMELandingFragment;

/* renamed from: o.FragmentBuilder_BindSMELandingFragment$MediaBrowserCompat$ItemReceiver */
final class C6755x7d5c75c9 extends CheckEligibilityActivity implements FundActionsSuccessActivity<Integer> {
    private /* synthetic */ FragmentBuilder_BindHmlNtbOutcomeRejectFragment IconCompatParcelizer;
    private /* synthetic */ FragmentBuilder_BindSMELandingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ FundFactSheetActivity read;
    private /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6755x7d5c75c9(FragmentBuilder_BindSMELandingFragment fragmentBuilder_BindSMELandingFragment, FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, FundFactSheetActivity fundFactSheetActivity) {
        super(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindSMELandingFragment;
        this.IconCompatParcelizer = fragmentBuilder_BindHmlNtbOutcomeRejectFragment;
        this.write = fragmentBuilder_BindHmlOperatingBankFragment;
        this.read = fundFactSheetActivity;
    }

    /* renamed from: o.FragmentBuilder_BindSMELandingFragment$MediaBrowserCompat$ItemReceiver$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Cursor, FragmentBuilder_BindReviewRedemptionFragment> {
        public static final write IconCompatParcelizer = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Cursor cursor = (Cursor) obj;
            onGetStartedClick.write((Object) cursor, "it");
            FragmentBuilder_BindSMELandingFragment.IconCompatParcelizer iconCompatParcelizer = FragmentBuilder_BindSMELandingFragment.write;
            FundFactSheetActivity fragmentBuilder_BindSMELandingFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver = new C6753x14763e66(cursor);
            onGetStartedClick.write((Object) fragmentBuilder_BindSMELandingFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
            C6746xde52ab60 fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver = new C6746xde52ab60();
            fragmentBuilder_BindSMELandingFragment$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.invoke(fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver);
            return fragmentBuilder_BindReviewRedemptionFragment$MediaBrowserCompat$ItemReceiver.write();
        }
    }

    public final /* synthetic */ Object invoke() {
        return Integer.valueOf(IconCompatParcelizer());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b2, code lost:
        p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int IconCompatParcelizer() {
        /*
            r11 = this;
            o.FragmentBuilder_BindHmlNtbOutcomeRejectFragment r0 = r11.IconCompatParcelizer
            java.lang.String r1 = "nothing"
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.read
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            o.FragmentBuilder_BindHmlOperatingBankFragment r2 = r11.write
            if (r2 == 0) goto L_0x001a
            java.net.URI r2 = r2.write
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x001a
            r1 = r2
        L_0x001a:
            java.lang.String r2 = "thinstance?.uri?.toString() ?: \"nothing\""
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r2)
            o.FragmentBuilder_BindSMELandingFragment r2 = r11.MediaBrowserCompat$CustomActionResultReceiver
            android.database.sqlite.SQLiteDatabase r3 = r2.MediaBrowserCompat$ItemReceiver
            java.lang.String[] r5 = p040o.FragmentBuilder_BindRtpScreenshotFragment.MediaBrowserCompat$CustomActionResultReceiver()
            r2 = 2
            java.lang.String[] r7 = new java.lang.String[r2]
            r2 = 0
            r7[r2] = r0
            r0 = 1
            r7[r0] = r1
            r8 = 0
            r9 = 0
            java.lang.String r4 = "offline_requests"
            java.lang.String r6 = "site_key = ? AND host_uri = ?"
            java.lang.String r10 = "timestamp ASC"
            android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10)
            java.io.Closeable r0 = (java.io.Closeable) r0
            r1 = r0
            android.database.Cursor r1 = (android.database.Cursor) r1     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00aa
            int r3 = r1.getCount()     // Catch:{ all -> 0x00af }
            if (r3 != 0) goto L_0x004c
            goto L_0x00aa
        L_0x004c:
            java.lang.String r2 = "$this$toSequence"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r2)     // Catch:{ all -> 0x00af }
            o.closeTutorial$MediaBrowserCompat$ItemReceiver r2 = new o.closeTutorial$MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x00af }
            r2.<init>(r1)     // Catch:{ all -> 0x00af }
            o.FundActionsSuccessActivity r2 = (p040o.FundActionsSuccessActivity) r2     // Catch:{ all -> 0x00af }
            java.lang.String r3 = "nextFunction"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r3)     // Catch:{ all -> 0x00af }
            o.SelectInvestmentActivity r3 = new o.SelectInvestmentActivity     // Catch:{ all -> 0x00af }
            o.JuristicResetPinLandingActivity$IconCompatParcelizer r4 = new o.JuristicResetPinLandingActivity$IconCompatParcelizer     // Catch:{ all -> 0x00af }
            r4.<init>(r2)     // Catch:{ all -> 0x00af }
            o.FundFactSheetActivity r4 = (p040o.FundFactSheetActivity) r4     // Catch:{ all -> 0x00af }
            r3.<init>(r2, r4)     // Catch:{ all -> 0x00af }
            o.BaseJuristicPinActivity_ViewBinding r3 = (p040o.BaseJuristicPinActivity_ViewBinding) r3     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "$this$constrainOnce"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r2)     // Catch:{ all -> 0x00af }
            o.ScbsOnboardingTcActivity r2 = new o.ScbsOnboardingTcActivity     // Catch:{ all -> 0x00af }
            r2.<init>(r3)     // Catch:{ all -> 0x00af }
            o.BaseJuristicPinActivity_ViewBinding r2 = (p040o.BaseJuristicPinActivity_ViewBinding) r2     // Catch:{ all -> 0x00af }
            o.FragmentBuilder_BindSMELandingFragment$MediaBrowserCompat$ItemReceiver$write r3 = p040o.C6755x7d5c75c9.write.IconCompatParcelizer     // Catch:{ all -> 0x00af }
            o.FundFactSheetActivity r3 = (p040o.FundFactSheetActivity) r3     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "$this$mapNotNull"
            p040o.onGetStartedClick.write((java.lang.Object) r2, (java.lang.String) r4)     // Catch:{ all -> 0x00af }
            java.lang.String r4 = "transform"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r4)     // Catch:{ all -> 0x00af }
            o.JuristicSetupNewPinActivity r4 = new o.JuristicSetupNewPinActivity     // Catch:{ all -> 0x00af }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x00af }
            o.BaseJuristicPinActivity_ViewBinding r4 = (p040o.BaseJuristicPinActivity_ViewBinding) r4     // Catch:{ all -> 0x00af }
            o.BaseJuristicPinActivity_ViewBinding r2 = p040o.JuristicRequestFormActivity.MediaBrowserCompat$ItemReceiver(r4)     // Catch:{ all -> 0x00af }
            java.util.Iterator r2 = r2.read()     // Catch:{ all -> 0x00af }
        L_0x0094:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00af }
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00af }
            o.FragmentBuilder_BindReviewRedemptionFragment r3 = (p040o.FragmentBuilder_BindReviewRedemptionFragment) r3     // Catch:{ all -> 0x00af }
            o.FundFactSheetActivity r4 = r11.read     // Catch:{ all -> 0x00af }
            r4.invoke(r3)     // Catch:{ all -> 0x00af }
            goto L_0x0094
        L_0x00a6:
            int r2 = r1.getCount()     // Catch:{ all -> 0x00af }
        L_0x00aa:
            r1 = 0
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)
            return r2
        L_0x00af:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r2 = move-exception
            p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((java.io.Closeable) r0, (java.lang.Throwable) r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C6755x7d5c75c9.IconCompatParcelizer():int");
    }
}

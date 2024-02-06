package p040o;

import java.util.Collection;
import java.util.List;
import p040o.FundOnboardingSuccessActivity;

/* renamed from: o.onAddAccountClick */
public class onAddAccountClick {
    private static void write(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        throw ((ClassCastException) onGetStartedClick.MediaBrowserCompat$ItemReceiver(new ClassCastException(sb.toString()), onAddAccountClick.class.getName()));
    }

    public static Iterable write(Object obj) {
        if ((obj instanceof FundOnboardingSuccessActivity_ViewBinding) && !(obj instanceof FundPurchaseLandingActivity)) {
            write(obj, "kotlin.collections.MutableIterable");
        }
        return read(obj);
    }

    private static Iterable read(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) onGetStartedClick.MediaBrowserCompat$ItemReceiver(e, onAddAccountClick.class.getName()));
        }
    }

    public static Collection IconCompatParcelizer(Object obj) {
        if ((obj instanceof FundOnboardingSuccessActivity_ViewBinding) && !(obj instanceof FundOtpActivity)) {
            write(obj, "kotlin.collections.MutableCollection");
        }
        return MediaBrowserCompat$ItemReceiver(obj);
    }

    private static Collection MediaBrowserCompat$ItemReceiver(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) onGetStartedClick.MediaBrowserCompat$ItemReceiver(e, onAddAccountClick.class.getName()));
        }
    }

    public static List MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if ((obj instanceof FundOnboardingSuccessActivity_ViewBinding) && !(obj instanceof FundOnboardingSuccessActivity.FundScreenshot_ViewBinding)) {
            write(obj, "kotlin.collections.MutableList");
        }
        return MediaBrowserCompat$MediaItem(obj);
    }

    private static List MediaBrowserCompat$MediaItem(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) onGetStartedClick.MediaBrowserCompat$ItemReceiver(e, onAddAccountClick.class.getName()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00b9, code lost:
        if (r0 == r4) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object MediaBrowserCompat$ItemReceiver(java.lang.Object r3, int r4) {
        /*
            if (r3 == 0) goto L_0x00d3
            boolean r0 = r3 instanceof p040o.HmlSummaryActivity
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r3 instanceof p040o.NtbDiscoverFundFilterListActivity
            if (r0 == 0) goto L_0x0015
            r0 = r3
            o.NtbDiscoverFundFilterListActivity r0 = (p040o.NtbDiscoverFundFilterListActivity) r0
            int r0 = r0.getArity()
            goto L_0x00b9
        L_0x0015:
            boolean r0 = r3 instanceof p040o.FundActionsSuccessActivity
            if (r0 == 0) goto L_0x001c
            r0 = r2
            goto L_0x00b9
        L_0x001c:
            boolean r0 = r3 instanceof p040o.FundFactSheetActivity
            if (r0 == 0) goto L_0x0023
            r0 = r1
            goto L_0x00b9
        L_0x0023:
            boolean r0 = r3 instanceof p040o.BaseDiscoverFundFilterActivity
            if (r0 == 0) goto L_0x002a
            r0 = 2
            goto L_0x00b9
        L_0x002a:
            boolean r0 = r3 instanceof p040o.BaseDiscoverDisclaimerActivity
            if (r0 == 0) goto L_0x0031
            r0 = 3
            goto L_0x00b9
        L_0x0031:
            boolean r0 = r3 instanceof p040o.BaseDiscoverSearchActivity_ViewBinding
            if (r0 == 0) goto L_0x0038
            r0 = 4
            goto L_0x00b9
        L_0x0038:
            boolean r0 = r3 instanceof p040o.DiscoverActivity
            if (r0 == 0) goto L_0x003f
            r0 = 5
            goto L_0x00b9
        L_0x003f:
            boolean r0 = r3 instanceof p040o.DiscoverDisclaimerActivity
            if (r0 == 0) goto L_0x0046
            r0 = 6
            goto L_0x00b9
        L_0x0046:
            boolean r0 = r3 instanceof p040o.BaseDiscoverSearchActivity
            if (r0 == 0) goto L_0x004d
            r0 = 7
            goto L_0x00b9
        L_0x004d:
            boolean r0 = r3 instanceof p040o.DiscoverFundFilterActivity
            if (r0 == 0) goto L_0x0055
            r0 = 8
            goto L_0x00b9
        L_0x0055:
            boolean r0 = r3 instanceof p040o.DiscoverFundPerformanceActivity_ViewBinding
            if (r0 == 0) goto L_0x005d
            r0 = 9
            goto L_0x00b9
        L_0x005d:
            boolean r0 = r3 instanceof p040o.lambda$new$0.AssessmentPopupActivity
            if (r0 == 0) goto L_0x0064
            r0 = 10
            goto L_0x00b9
        L_0x0064:
            boolean r0 = r3 instanceof p040o.QuestionnaireActivity
            if (r0 == 0) goto L_0x006b
            r0 = 11
            goto L_0x00b9
        L_0x006b:
            boolean r0 = r3 instanceof p040o.AssessmentPopupActivity
            if (r0 == 0) goto L_0x0072
            r0 = 12
            goto L_0x00b9
        L_0x0072:
            boolean r0 = r3 instanceof p040o.onCloseClicked
            if (r0 == 0) goto L_0x0079
            r0 = 13
            goto L_0x00b9
        L_0x0079:
            boolean r0 = r3 instanceof p040o.AssessmentPopupActivity_ViewBinding
            if (r0 == 0) goto L_0x0080
            r0 = 14
            goto L_0x00b9
        L_0x0080:
            boolean r0 = r3 instanceof p040o.RiskLevelAssessmentActivity_ViewBinding
            if (r0 == 0) goto L_0x0087
            r0 = 15
            goto L_0x00b9
        L_0x0087:
            boolean r0 = r3 instanceof p040o.RiskLevelAssessmentActivity
            if (r0 == 0) goto L_0x008e
            r0 = 16
            goto L_0x00b9
        L_0x008e:
            boolean r0 = r3 instanceof p040o.onSaveSlipClicked
            if (r0 == 0) goto L_0x0095
            r0 = 17
            goto L_0x00b9
        L_0x0095:
            boolean r0 = r3 instanceof p040o.RiskAssessmentSuccessActivity
            if (r0 == 0) goto L_0x009c
            r0 = 18
            goto L_0x00b9
        L_0x009c:
            boolean r0 = r3 instanceof p040o.RiskAssessmentSuccessActivity_ViewBinding
            if (r0 == 0) goto L_0x00a3
            r0 = 19
            goto L_0x00b9
        L_0x00a3:
            boolean r0 = r3 instanceof p040o.BaseDiscoverFundFilterListActivity
            if (r0 == 0) goto L_0x00aa
            r0 = 20
            goto L_0x00b9
        L_0x00aa:
            boolean r0 = r3 instanceof p040o.onAcceptButtonClicked
            if (r0 == 0) goto L_0x00b1
            r0 = 21
            goto L_0x00b9
        L_0x00b1:
            boolean r0 = r3 instanceof p040o.BaseDiscoverDisclaimerActivity_ViewBinding
            if (r0 == 0) goto L_0x00b8
            r0 = 22
            goto L_0x00b9
        L_0x00b8:
            r0 = -1
        L_0x00b9:
            if (r0 != r4) goto L_0x00bc
            goto L_0x00bd
        L_0x00bc:
            r1 = r2
        L_0x00bd:
            if (r1 != 0) goto L_0x00d3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "kotlin.jvm.functions.Function"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            write(r3, r4)
        L_0x00d3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onAddAccountClick.MediaBrowserCompat$ItemReceiver(java.lang.Object, int):java.lang.Object");
    }
}

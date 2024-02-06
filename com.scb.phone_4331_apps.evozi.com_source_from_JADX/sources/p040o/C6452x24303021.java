package p040o;

import android.os.Build;

/* renamed from: o.EasycashNcbCaseModule$MediaBrowserCompat$CustomActionResultReceiver */
final class C6452x24303021 extends CheckEligibilityActivity implements FundFactSheetActivity<EasycashSummaryCaseModule, Integer> {
    public static final C6452x24303021 MediaBrowserCompat$ItemReceiver = new C6452x24303021();

    C6452x24303021() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        int i;
        EasycashSummaryCaseModule easycashSummaryCaseModule = (EasycashSummaryCaseModule) obj;
        if (easycashSummaryCaseModule != null) {
            i = easycashSummaryCaseModule.MediaBrowserCompat$ItemReceiver;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        return Integer.valueOf(i);
    }
}

package p040o;

/* renamed from: o.EasycashNcbCaseModule$MediaBrowserCompat$ItemReceiver */
final class EasycashNcbCaseModule$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<EasycashSummaryCaseModule, PrepaidActivationCaseModule> {
    public static final EasycashNcbCaseModule$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver = new EasycashNcbCaseModule$MediaBrowserCompat$ItemReceiver();

    EasycashNcbCaseModule$MediaBrowserCompat$ItemReceiver() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        EasycashSummaryCaseModule easycashSummaryCaseModule = (EasycashSummaryCaseModule) obj;
        if (easycashSummaryCaseModule != null) {
            return easycashSummaryCaseModule.write;
        }
        return null;
    }
}

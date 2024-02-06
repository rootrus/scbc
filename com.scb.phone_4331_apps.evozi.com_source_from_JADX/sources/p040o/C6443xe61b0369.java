package p040o;

/* renamed from: o.EasycashBusinessAndMaritalInfoCaseModule$MediaBrowserCompat$CustomActionResultReceiver */
final class C6443xe61b0369 extends CheckEligibilityActivity implements FundFactSheetActivity<EasycashCardInfoCaseModule, Boolean> {
    public static final C6443xe61b0369 read = new C6443xe61b0369();

    C6443xe61b0369() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        EasycashCardInfoCaseModule easycashCardInfoCaseModule = (EasycashCardInfoCaseModule) obj;
        boolean z = true;
        if (easycashCardInfoCaseModule == null || !easycashCardInfoCaseModule.write) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

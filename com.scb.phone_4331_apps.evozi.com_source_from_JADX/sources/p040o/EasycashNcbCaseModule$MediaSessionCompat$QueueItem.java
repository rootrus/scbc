package p040o;

/* renamed from: o.EasycashNcbCaseModule$MediaSessionCompat$QueueItem */
final class EasycashNcbCaseModule$MediaSessionCompat$QueueItem extends CheckEligibilityActivity implements FundFactSheetActivity<PrepaidActivationCaseModule, Integer> {
    public static final EasycashNcbCaseModule$MediaSessionCompat$QueueItem IconCompatParcelizer = new EasycashNcbCaseModule$MediaSessionCompat$QueueItem();

    EasycashNcbCaseModule$MediaSessionCompat$QueueItem() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        PrepaidActivationCaseModule prepaidActivationCaseModule = (PrepaidActivationCaseModule) obj;
        return Integer.valueOf(prepaidActivationCaseModule != null ? prepaidActivationCaseModule.read : 0);
    }
}

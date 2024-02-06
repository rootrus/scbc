package p040o;

/* renamed from: o.EasycashNcbCaseModule$MediaSessionCompat$ResultReceiverWrapper */
final class EasycashNcbCaseModule$MediaSessionCompat$ResultReceiverWrapper extends CheckEligibilityActivity implements FundFactSheetActivity<PrepaidActivationCaseModule, EntityMappingException> {
    public static final EasycashNcbCaseModule$MediaSessionCompat$ResultReceiverWrapper IconCompatParcelizer = new EasycashNcbCaseModule$MediaSessionCompat$ResultReceiverWrapper();

    EasycashNcbCaseModule$MediaSessionCompat$ResultReceiverWrapper() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        PrepaidActivationCaseModule prepaidActivationCaseModule = (PrepaidActivationCaseModule) obj;
        if (prepaidActivationCaseModule != null) {
            return prepaidActivationCaseModule.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return null;
    }
}

package p040o;

/* renamed from: o.CrashlyticsReportJsonTransform$$Lambda$6 */
public enum CrashlyticsReportJsonTransform$$Lambda$6 {
    SENSITIVE_NEWREGISTER("sensitive_consent_regis"),
    SENSITIVE_TP("sensitive_consent_tp"),
    SENSITIVE_NDID_RP("sensitive_consent_rp"),
    SENSITIVE_NDID_IDP("sensitive_consent_idp");
    
    public final String firebaseTag;

    private CrashlyticsReportJsonTransform$$Lambda$6(String str) {
        this.firebaseTag = str;
    }
}

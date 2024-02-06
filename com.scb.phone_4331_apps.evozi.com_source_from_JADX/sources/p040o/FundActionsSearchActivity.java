package p040o;

/* renamed from: o.FundActionsSearchActivity */
public abstract class FundActionsSearchActivity extends HmlNTBCropDocumentActivity {
    public FundActionsSearchActivity(HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        if (hmlNTBPromptPayNotFoundActivity != null) {
            if (!(hmlNTBPromptPayNotFoundActivity.getContext() == HmlPromptPayAboutActivity.IconCompatParcelizer)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public HmlPromptPayVerificationActivity getContext() {
        return HmlPromptPayAboutActivity.IconCompatParcelizer;
    }
}

package p040o;

/* renamed from: o.InsurancePortfolioActivity_ViewBinding */
public abstract class InsurancePortfolioActivity_ViewBinding extends HmlDocumentSubmissionTutorialsActivity implements NtbDiscoverFundFilterListActivity<Object> {
    private final int write;

    public int getArity() {
        return this.write;
    }

    public InsurancePortfolioActivity_ViewBinding(int i, HmlNTBPromptPayNotFoundActivity<Object> hmlNTBPromptPayNotFoundActivity) {
        super(hmlNTBPromptPayNotFoundActivity);
        this.write = i;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String read = FundOnboardingLandingActivity_ViewBinding.read(this);
        onGetStartedClick.IconCompatParcelizer((Object) read, "Reflection.renderLambdaToString(this)");
        return read;
    }
}

package p040o;

/* renamed from: o.InvestmentFundDetailsActivity */
public class InvestmentFundDetailsActivity extends DiscoverSearchActivity implements NtbDiscoverFundFilterListActivity, ScbsLandingActivity {
    private final int write;

    public InvestmentFundDetailsActivity(int i) {
        this.write = i;
    }

    public InvestmentFundDetailsActivity(int i, Object obj) {
        super(obj);
        this.write = i;
    }

    public int getArity() {
        return this.write;
    }

    /* access modifiers changed from: protected */
    public onClickTrade computeReflected() {
        return FundOnboardingLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InvestmentFundDetailsActivity) {
            InvestmentFundDetailsActivity investmentFundDetailsActivity = (InvestmentFundDetailsActivity) obj;
            if (getOwner() != null ? getOwner().equals(investmentFundDetailsActivity.getOwner()) : investmentFundDetailsActivity.getOwner() == null) {
                if (getName().equals(investmentFundDetailsActivity.getName()) && getSignature().equals(investmentFundDetailsActivity.getSignature()) && onGetStartedClick.MediaBrowserCompat$ItemReceiver(getBoundReceiver(), investmentFundDetailsActivity.getBoundReceiver())) {
                    return true;
                }
            }
            return false;
        } else if (obj instanceof ScbsLandingActivity) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        onClickTrade compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("function ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ onClickTrade getReflected() {
        return (ScbsLandingActivity) super.getReflected();
    }

    public boolean isSuspend() {
        return ((ScbsLandingActivity) super.getReflected()).isSuspend();
    }
}

package p040o;

/* renamed from: o.FundOnboardingLandingActivity */
public abstract class FundOnboardingLandingActivity extends DiscoverSearchActivity implements clickNext {
    public FundOnboardingLandingActivity() {
    }

    public FundOnboardingLandingActivity(Object obj) {
        super(obj);
    }

    /* access modifiers changed from: protected */
    public clickNext getReflected() {
        return (clickNext) super.getReflected();
    }

    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public boolean isConst() {
        return getReflected().isConst();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FundOnboardingLandingActivity) {
            FundOnboardingLandingActivity fundOnboardingLandingActivity = (FundOnboardingLandingActivity) obj;
            if (!getOwner().equals(fundOnboardingLandingActivity.getOwner()) || !getName().equals(fundOnboardingLandingActivity.getName()) || !getSignature().equals(fundOnboardingLandingActivity.getSignature()) || !onGetStartedClick.MediaBrowserCompat$ItemReceiver(getBoundReceiver(), fundOnboardingLandingActivity.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof clickNext) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        onClickTrade compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}

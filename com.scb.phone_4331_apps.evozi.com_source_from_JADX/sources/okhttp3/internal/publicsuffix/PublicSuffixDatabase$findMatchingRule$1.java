package okhttp3.internal.publicsuffix;

import p040o.CheckSCBSEligibilityActivity;
import p040o.FundOnboardingLandingActivity_ViewBinding;
import p040o.onFindUsClick;

final /* synthetic */ class PublicSuffixDatabase$findMatchingRule$1 extends onFindUsClick {
    PublicSuffixDatabase$findMatchingRule$1(PublicSuffixDatabase publicSuffixDatabase) {
        super(publicSuffixDatabase);
    }

    public final String getName() {
        return "publicSuffixListBytes";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(PublicSuffixDatabase.class);
    }

    public final String getSignature() {
        return "getPublicSuffixListBytes()[B";
    }

    public final Object get() {
        return PublicSuffixDatabase.access$getPublicSuffixListBytes$p((PublicSuffixDatabase) this.receiver);
    }

    public final void set(Object obj) {
        ((PublicSuffixDatabase) this.receiver).publicSuffixListBytes = (byte[]) obj;
    }
}

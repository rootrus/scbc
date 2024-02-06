package com.kofax.mobile.sdk.capture.parameter;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class ExtractionParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<ExtractionParameters> {
    private static final ExtractionParameters_Factory add = new ExtractionParameters_Factory();

    public final ExtractionParameters get() {
        return new ExtractionParameters();
    }

    public static ExtractionParameters_Factory create() {
        return add;
    }
}

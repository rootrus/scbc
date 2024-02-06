package com.kofax.mobile.sdk.capture.parameter;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class ProcessingParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<ProcessingParameters> {
    private static final ProcessingParameters_Factory adh = new ProcessingParameters_Factory();

    public final ProcessingParameters get() {
        return new ProcessingParameters();
    }

    public static ProcessingParameters_Factory create() {
        return adh;
    }
}

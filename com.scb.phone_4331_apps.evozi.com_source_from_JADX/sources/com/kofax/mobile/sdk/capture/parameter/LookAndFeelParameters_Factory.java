package com.kofax.mobile.sdk.capture.parameter;

import p040o.OPRStatusRewardsLandingActivity_ViewBinding;

public final class LookAndFeelParameters_Factory implements OPRStatusRewardsLandingActivity_ViewBinding<LookAndFeelParameters> {
    private static final LookAndFeelParameters_Factory adf = new LookAndFeelParameters_Factory();

    public final LookAndFeelParameters get() {
        return new LookAndFeelParameters();
    }

    public static LookAndFeelParameters_Factory create() {
        return adf;
    }
}

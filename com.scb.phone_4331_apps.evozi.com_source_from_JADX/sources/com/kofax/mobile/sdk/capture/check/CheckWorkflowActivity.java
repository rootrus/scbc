package com.kofax.mobile.sdk.capture.check;

import android.app.Activity;
import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.CheckSide;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.IImageStorage;
import com.kofax.mobile.sdk.capture.WorkflowActivity;
import com.kofax.mobile.sdk.capture.model.CaptureData;
import com.kofax.mobile.sdk.capture.model.Check;
import com.kofax.mobile.sdk.capture.model.CheckIQAData;
import com.kofax.mobile.sdk.capture.model.CheckUsabilityData;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class CheckWorkflowActivity extends WorkflowActivity<CheckParameters> {
    public static final String CHECK_EXCEPTION = "_com.kofax.mobile.sdk.capture._check_exception_";
    public static final String CHECK_PARAMETERS = "_com.kofax.mobile.sdk.capture._check_parameters_";
    public static final String CHECK_RESULTS = "_com.kofax.mobile.sdk.capture._check_results_";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._check_parameters_")
    @HmlPinActivity

    /* renamed from: YA */
    IParameters f4696YA;
    @HmlPinActivity

    /* renamed from: YK */
    IImageStorage f4697YK;

    public String getExceptionKey() {
        return CHECK_EXCEPTION;
    }

    public String getParametersKey() {
        return CHECK_PARAMETERS;
    }

    public String getResultKey() {
        return CHECK_RESULTS;
    }

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
    }

    public Class<? extends Activity> getCaptureActivityClass() {
        return CheckCaptureActivity.class;
    }

    public Class<? extends Activity> getExtractActivityClass() {
        return CheckExtractActivity.class;
    }

    public String getDefaultProcessingString(CheckParameters checkParameters) {
        return CheckSide.FRONT.equals(checkParameters.side) ? CheckCaptureModule.DEFAULT_PROCESS_STRING_FRONT : CheckCaptureModule.DEFAULT_PROCESS_STRING_BACK;
    }

    public CaptureData getDefaultReturnObject() {
        return new C8313a();
    }

    public CheckParameters getParametersInstance() {
        return Injector.getInjector(this).getCheckParameters();
    }

    /* renamed from: com.kofax.mobile.sdk.capture.check.CheckWorkflowActivity$a */
    static class C8313a extends Check {
        public Field<String> getAmount() {
            return null;
        }

        public Field<String> getAuxiliaryOnUs() {
            return null;
        }

        public Field<String> getCar() {
            return null;
        }

        public CheckIQAData getCheckIQAData() {
            return null;
        }

        public Field<String> getCheckNumber() {
            return null;
        }

        public CheckUsabilityData getCheckUsabilityData() {
            return null;
        }

        public Field<String> getDate() {
            return null;
        }

        public Field<String> getEpc() {
            return null;
        }

        public Field<String> getLar() {
            return null;
        }

        public Field<String> getMicr() {
            return null;
        }

        public Field<String> getMicrAmount() {
            return null;
        }

        public Field<String> getOnUs1() {
            return null;
        }

        public Field<String> getOnUs2() {
            return null;
        }

        public Field<String> getPayee() {
            return null;
        }

        public String getRawData() {
            return null;
        }

        public Field<String> getReasonForRejection() {
            return null;
        }

        public Field<String> getRestrictiveEndorsement() {
            return null;
        }

        public Field<String> getRestrictiveEndorsementPresent() {
            return null;
        }

        public Field<String> getTransit() {
            return null;
        }

        public Field<String> getUsable() {
            return null;
        }

        private C8313a() {
        }
    }
}

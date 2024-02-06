package com.kofax.mobile.sdk.capture.passport;

import android.app.Activity;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.WorkflowActivity;
import com.kofax.mobile.sdk.capture.model.CaptureData;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.model.Passport;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class PassportWorkflowActivity extends WorkflowActivity<PassportParameters> {
    public static final String PASSPORT_EXCEPTION = "_com.kofax.mobile.sdk.capture._passport_exception_";
    public static final String PASSPORT_PARAMETERS = "_com.kofax.mobile.sdk.capture._passport_parameters_";
    public static final String PASSPORT_RESULTS = "_com.kofax.mobile.sdk.capture._passport_results_";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture._passport_parameters_")
    @HmlPinActivity

    /* renamed from: YA */
    IParameters f4868YA;

    public String getDefaultProcessingString(PassportParameters passportParameters) {
        return PassportCaptureModule.DEFAULT_PROCESS_STRING;
    }

    public String getExceptionKey() {
        return PASSPORT_EXCEPTION;
    }

    public String getParametersKey() {
        return PASSPORT_PARAMETERS;
    }

    public String getResultKey() {
        return PASSPORT_RESULTS;
    }

    public boolean isOdeSupported() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
    }

    public Class<? extends Activity> getCaptureActivityClass() {
        return PassportCaptureActivity.class;
    }

    public Class<? extends Activity> getExtractActivityClass() {
        return PassportExtractActivity.class;
    }

    public CaptureData getDefaultReturnObject() {
        return new C8334a();
    }

    public PassportParameters getParametersInstance() {
        return Injector.getInjector(this).getPassportParameters();
    }

    /* renamed from: com.kofax.mobile.sdk.capture.passport.PassportWorkflowActivity$a */
    static class C8334a extends Passport {
        public Field<String> getCountry() {
            return null;
        }

        public Field<String> getCountryLong() {
            return null;
        }

        public Field<String> getDateOfBirth() {
            return null;
        }

        public Field<String> getExpirationDate() {
            return null;
        }

        public Field<String> getFirstName() {
            return null;
        }

        public Field<String> getGender() {
            return null;
        }

        public Field<String> getIssueDate() {
            return null;
        }

        public Field<String> getLastName() {
            return null;
        }

        public Field<String> getMRZ1() {
            return null;
        }

        public Field<String> getMRZ2() {
            return null;
        }

        public Field<String> getMiddleName() {
            return null;
        }

        public Field<String> getNationality() {
            return null;
        }

        public Field<String> getPassportNumber() {
            return null;
        }

        public Field<String> getPersonalNumber() {
            return null;
        }

        public String getRawData() {
            return null;
        }

        private C8334a() {
        }
    }
}

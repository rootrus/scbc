package com.kofax.mobile.sdk.capture.bill;

import android.app.Activity;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.WorkflowActivity;
import com.kofax.mobile.sdk.capture.model.Bill;
import com.kofax.mobile.sdk.capture.model.CaptureData;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.parameter.IParameters;
import p040o.HmlPinActivity;
import p040o.HmlRepaymentMethodAboutActivity;

public class BillWorkflowActivity extends WorkflowActivity<BillParameters> {
    public static final String BILL_EXCEPTION = "_com.kofax.mobile.sdk.capture.bill_exception_";
    public static final String BILL_PARAMETERS = "_com.kofax.mobile.sdk.capture.bill_parameters_";
    public static final String BILL_RESULTS = "_com.kofax.mobile.sdk.capture.bill_results_";
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "_com.kofax.mobile.sdk.capture.bill_parameters_")
    @HmlPinActivity

    /* renamed from: YA */
    IParameters f4628YA;

    public String getDefaultProcessingString(BillParameters billParameters) {
        return BillCaptureModule.DEFAULT_PROCESS_STRING;
    }

    public String getExceptionKey() {
        return BILL_EXCEPTION;
    }

    public String getParametersKey() {
        return BILL_PARAMETERS;
    }

    public String getResultKey() {
        return BILL_RESULTS;
    }

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
    }

    public Class<? extends Activity> getCaptureActivityClass() {
        return BillCaptureActivity.class;
    }

    public Class<? extends Activity> getExtractActivityClass() {
        return BillExtractActivity.class;
    }

    public CaptureData getDefaultReturnObject() {
        return new C8310a();
    }

    public BillParameters getParametersInstance() {
        return Injector.getInjector(this).getBillParameters();
    }

    /* renamed from: com.kofax.mobile.sdk.capture.bill.BillWorkflowActivity$a */
    static class C8310a extends Bill {
        public Field getAccountNumber() {
            return null;
        }

        public Field getAddressLine1() {
            return null;
        }

        public Field getAddressLine2() {
            return null;
        }

        public Field getAmount() {
            return null;
        }

        public Field getBillers() {
            return null;
        }

        public Field getCity() {
            return null;
        }

        public Field getDueDate() {
            return null;
        }

        public Field getName() {
            return null;
        }

        public Field getPhoneNumber() {
            return null;
        }

        public String getRawData() {
            return null;
        }

        public Field getSource() {
            return null;
        }

        public Field getState() {
            return null;
        }

        public Field getZip() {
            return null;
        }

        private C8310a() {
        }
    }
}

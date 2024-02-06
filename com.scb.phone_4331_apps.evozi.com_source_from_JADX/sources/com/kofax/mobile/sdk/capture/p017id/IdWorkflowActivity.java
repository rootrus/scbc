package com.kofax.mobile.sdk.capture.p017id;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.kofax.kmc.ken.engines.data.BarCodeResult;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk._internal.impl.C7926b;
import com.kofax.mobile.sdk.capture.WorkflowActivity;
import com.kofax.mobile.sdk.capture.model.C8328Id;
import com.kofax.mobile.sdk.capture.model.CaptureData;
import com.kofax.mobile.sdk.capture.model.Field;
import com.kofax.mobile.sdk.capture.p017id.IdParameters;
import p040o.HmlPinActivity;

/* renamed from: com.kofax.mobile.sdk.capture.id.IdWorkflowActivity */
public class IdWorkflowActivity extends WorkflowActivity<IdParameters> {
    public static final String ID_BARCODE_RESULTS = "_com.kofax.mobile.sdk.capture._id_barcode_results_";
    public static final String ID_EXCEPTION = "_com.kofax.mobile.sdk.capture._id_exception_";
    public static final String ID_PARAMETERS = "_com.kofax.mobile.sdk.capture._id_parameters_";
    public static final String ID_RESULTS = "_com.kofax.mobile.sdk.capture._id_results_";
    private static final String TAG = IdWorkflowActivity.class.getSimpleName();
    @HmlPinActivity
    C7926b acQ;
    private IdParameters acR;

    public String getDefaultProcessingString(IdParameters idParameters) {
        return "_DeviceType_2_Do90DegreeRotation_4_DoCropCorrection__DoScaleImageToDPI_500_DoSkewCorrectionPage__DocDimLarge_3.375_DocDimSmall_2.125_LoadSetting_<Property Name=\"CSkewDetect.correct_illumination.Bool\" Value=\"0\" />";
    }

    public String getExceptionKey() {
        return ID_EXCEPTION;
    }

    public String getParametersKey() {
        return ID_PARAMETERS;
    }

    public String getResultKey() {
        return ID_RESULTS;
    }

    public boolean isOdeSupported() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        this.acR = (IdParameters) getParameters(bundle);
    }

    public Class<? extends Activity> getCaptureActivityClass() {
        if (this.acR.side.equals(IdParameters.IdSide.FRONT)) {
            return IdCaptureActivity.class;
        }
        return IdCaptureBackActivity.class;
    }

    public Class<? extends Activity> getExtractActivityClass() {
        return IdExtractActivity.class;
    }

    public CaptureData getDefaultReturnObject() {
        return new C8326a();
    }

    public IdParameters getParametersInstance() {
        return Injector.getInjector(this).getIdParameters();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        BarCodeResult barCodeResult;
        if (this.acR.side.equals(IdParameters.IdSide.BACK) && intent != null && intent.hasExtra(ID_BARCODE_RESULTS) && (barCodeResult = (BarCodeResult) intent.getSerializableExtra(ID_BARCODE_RESULTS)) != null) {
            String value = barCodeResult.getValue();
            try {
                this.acR.barcode = this.acQ.decode(value);
            } catch (Exception e) {
                C0767k.m1822e(TAG, (Throwable) e);
                this.acR.barcode = "";
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: com.kofax.mobile.sdk.capture.id.IdWorkflowActivity$a */
    static class C8326a extends C8328Id {
        public Field<String> getAddress() {
            return null;
        }

        public Field<String> getAddress2() {
            return null;
        }

        public Field<String> getAddress3() {
            return null;
        }

        public Field<String> getAddress4() {
            return null;
        }

        public Field<String> getAddress5() {
            return null;
        }

        public Field<String> getAddress6() {
            return null;
        }

        public Field<String> getCity() {
            return null;
        }

        public Field<String> getCountry() {
            return null;
        }

        public Field<String> getCountryShort() {
            return null;
        }

        public Field<String> getDateOfBirth() {
            return null;
        }

        public Field<String> getDocumentVerificationConfidenceRating() {
            return null;
        }

        public Field<String> getExpirationDate() {
            return null;
        }

        public Field<String> getEyes() {
            return null;
        }

        public Bitmap getFaceImage() {
            return null;
        }

        public Field<String> getFirstName() {
            return null;
        }

        public Field<String> getGender() {
            return null;
        }

        public Field<String> getHair() {
            return null;
        }

        public Field<String> getHeight() {
            return null;
        }

        public Field<String> getIdClass() {
            return null;
        }

        public Field<String> getIdNumber() {
            return null;
        }

        public Field<String> getIssueDate() {
            return null;
        }

        public Field<String> getLastName() {
            return null;
        }

        public Field<String> getLicense() {
            return null;
        }

        public Field<String> getMiddleName() {
            return null;
        }

        public Field<String> getNameSuffix() {
            return null;
        }

        public Field<String> getNationality() {
            return null;
        }

        public String getRawData() {
            return null;
        }

        public Bitmap getSignatureImage() {
            return null;
        }

        public Field<String> getState() {
            return null;
        }

        public Field<String> getWeight() {
            return null;
        }

        public Field<String> getZip() {
            return null;
        }

        public Field<String> isBarcodeRead() {
            return null;
        }

        public Field<String> isOcrRead() {
            return null;
        }

        private C8326a() {
        }
    }
}

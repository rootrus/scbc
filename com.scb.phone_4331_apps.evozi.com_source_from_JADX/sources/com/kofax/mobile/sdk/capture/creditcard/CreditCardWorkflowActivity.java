package com.kofax.mobile.sdk.capture.creditcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcException;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.WorkflowActivity;
import com.kofax.mobile.sdk.capture.model.CaptureData;
import com.kofax.mobile.sdk.capture.model.CreditCard;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class CreditCardWorkflowActivity extends WorkflowActivity<CreditCardParameters> {
    public static final String CREDIT_CARD_EXCEPTION = "_com.kofax.mobile.sdk.capture._credit_card_exception_";
    public static final String CREDIT_CARD_PARAMETERS = "_com.kofax.mobile.sdk.capture._credit_card_parameters_";
    public static final String CREDIT_CARD_RESULTS = "_com.kofax.mobile.sdk.capture._credit_card_results_";
    private static final String TAG = CreditCardWorkflowActivity.class.getSimpleName();
    private CreditCardParameters acc;

    /* renamed from: tS */
    private boolean m4719tS() {
        return true;
    }

    public Class<? extends Activity> getCaptureActivityClass() {
        return null;
    }

    public String getDefaultProcessingString(CreditCardParameters creditCardParameters) {
        return null;
    }

    public String getExceptionKey() {
        return CREDIT_CARD_EXCEPTION;
    }

    public Class<? extends Activity> getExtractActivityClass() {
        return null;
    }

    public String getParametersKey() {
        return CREDIT_CARD_PARAMETERS;
    }

    public String getResultKey() {
        return CREDIT_CARD_RESULTS;
    }

    private static final /* synthetic */ void startActivityForResult_aroundBody1$advice(CreditCardWorkflowActivity creditCardWorkflowActivity, CreditCardWorkflowActivity creditCardWorkflowActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((CreditCardWorkflowActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        Injector.getInjector(this).inject(this);
        super.onCreate(bundle);
        this.acc = (CreditCardParameters) getParameters(bundle);
    }

    public void captureImage() {
        String str;
        if (m4719tS()) {
            if (Build.VERSION.SDK_INT < 21) {
                str = Build.CPU_ABI;
            } else {
                str = Build.SUPPORTED_ABIS[0];
            }
            if (str.equalsIgnoreCase("armeabi-v7a") || str.equalsIgnoreCase("arm64-v8a") || str.equalsIgnoreCase("x86") || str.equalsIgnoreCase("x86_64")) {
                m4718tR();
            } else {
                handleException(new KmcException(ErrorInfo.KMC_UI_CREDITCARD_ARCH_NOT_SUPPORTED));
            }
        } else {
            super.captureImage();
        }
    }

    /* renamed from: tR */
    private void m4718tR() {
        Intent intent = new Intent(this, CardIoWrapperActivity.class);
        intent.putExtra(CardIoWrapperActivity.EXTRA_EXTRA_TIME_FOR_EXPIRY, this.acc.extraTimeForExpiry);
        startActivityForResult_aroundBody1$advice(this, this, intent, 0, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 0, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
    }

    public CaptureData getDefaultReturnObject() {
        return new CreditCard();
    }

    public CreditCardParameters getParametersInstance() {
        return Injector.getInjector(this).getCreditCardParameters();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            Intent intent2 = new Intent();
            if (intent.hasExtra(CREDIT_CARD_RESULTS)) {
                intent2.putExtra(getResultKey(), intent.getSerializableExtra(CREDIT_CARD_RESULTS));
            }
            setResult(-1, intent2);
            finish();
        } else if (i2 != 0) {
        } else {
            if (intent.hasExtra(CREDIT_CARD_EXCEPTION)) {
                handleException((Throwable) intent.getSerializableExtra(CREDIT_CARD_EXCEPTION));
            } else {
                handleException((Throwable) null);
            }
        }
    }
}

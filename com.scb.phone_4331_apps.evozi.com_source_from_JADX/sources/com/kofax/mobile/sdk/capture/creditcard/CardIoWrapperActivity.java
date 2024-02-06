package com.kofax.mobile.sdk.capture.creditcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import com.kofax.mobile.sdk.capture.model.CreditCard;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import io.card.payment.CardIOActivity;
import java.util.Locale;
import p040o.MerchantWalletSelectorAdapter$ItemViewHolder;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class CardIoWrapperActivity extends Activity {
    public static final String EXTRA_EXTRA_TIME_FOR_EXPIRY = "com.kofax.mobile.sdk.capture.creditcard.CardIoWrapperActivity.extraTimeForExpiry";
    private static UnsatisfiedLinkError abZ;

    private static final /* synthetic */ void startActivityForResult_aroundBody1$advice(CardIoWrapperActivity cardIoWrapperActivity, CardIoWrapperActivity cardIoWrapperActivity2, Intent intent, int i, IntentTidInjectionActivityAspect intentTidInjectionActivityAspect, Activity activity, Intent intent2, int i2, MerchantWalletSelectorAdapter$ItemViewHolder merchantWalletSelectorAdapter$ItemViewHolder) {
        try {
            Intent read = setTapText.write(activity, intent2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((CardIoWrapperActivity) activity).startActivityForResult(read, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static {
        try {
            System.loadLibrary("cardioDecider");
            System.loadLibrary("opencv_java3");
            System.loadLibrary("cardioRecognizer");
        } catch (UnsatisfiedLinkError e) {
            abZ = e;
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector.getInjector(this).inject(this);
        if (bundle == null && abZ == null) {
            Intent intent = new Intent(this, CardIOActivity.class);
            m4709a(intent);
            startActivityForResult_aroundBody1$advice(this, this, intent, 0, IntentTidInjectionActivityAspect.aspectOf(), this, intent, 0, (MerchantWalletSelectorAdapter$ItemViewHolder) null);
        } else if (abZ != null) {
            Intent intent2 = new Intent();
            intent2.putExtra(CreditCardWorkflowActivity.CREDIT_CARD_EXCEPTION, abZ);
            setResult(0, intent2);
            finish();
        }
    }

    /* renamed from: a */
    private void m4709a(Intent intent) {
        long longExtra = getIntent().getLongExtra(EXTRA_EXTRA_TIME_FOR_EXPIRY, 1000);
        intent.putExtra("io.card.payment.requireExpiry", true);
        intent.putExtra("io.card.payment.extraTimeForExpiry", longExtra);
        intent.putExtra("io.card.payment.requireCVV", false);
        intent.putExtra("io.card.payment.requirePostalCode", false);
        intent.putExtra("io.card.payment.suppressManual", true);
        intent.putExtra("io.card.payment.suppressConfirmation", true);
        intent.putExtra("io.card.payment.useCardIOLogo", true);
        intent.putExtra("io.card.payment.hideLogo", true);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m4711b(intent);
        finish();
    }

    /* renamed from: b */
    private void m4711b(Intent intent) {
        if (m4714c(intent)) {
            m4715d(intent);
        } else {
            m4717tQ();
        }
    }

    /* renamed from: c */
    private boolean m4714c(Intent intent) {
        return intent != null && intent.hasExtra("io.card.payment.scanResult");
    }

    /* renamed from: tQ */
    private void m4717tQ() {
        setResult(0, new Intent());
    }

    /* renamed from: d */
    private void m4715d(Intent intent) {
        CreditCard e = m4716e(intent);
        Intent intent2 = new Intent();
        intent2.putExtra(CreditCardWorkflowActivity.CREDIT_CARD_RESULTS, e);
        setResult(-1, intent2);
    }

    /* renamed from: e */
    private CreditCard m4716e(Intent intent) {
        io.card.payment.CreditCard parcelableExtra = intent.getParcelableExtra("io.card.payment.scanResult");
        CreditCard creditCard = new CreditCard();
        creditCard.setCardNumber(parcelableExtra.cardNumber);
        m4710a(parcelableExtra, creditCard);
        return creditCard;
    }

    /* renamed from: a */
    private void m4710a(io.card.payment.CreditCard creditCard, CreditCard creditCard2) {
        m4713c(creditCard, creditCard2);
        m4712b(creditCard, creditCard2);
    }

    /* renamed from: b */
    private void m4712b(io.card.payment.CreditCard creditCard, CreditCard creditCard2) {
        int i = creditCard.expiryYear;
        if (i > 0) {
            creditCard2.setExpirationYear(String.format(Locale.US, "%04d", new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: c */
    private void m4713c(io.card.payment.CreditCard creditCard, CreditCard creditCard2) {
        int i = creditCard.expiryMonth;
        if (i > 0 && i <= 12) {
            creditCard2.setExpirationMonth(String.format(Locale.US, "%02d", new Object[]{Integer.valueOf(i)}));
        }
    }
}

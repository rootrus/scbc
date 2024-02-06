package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.creditpower.EasycashCreditPowerSummaryActivity;
import com.scb.phone.view.adapter.easycash.CustomCheckboxAdapter;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.easycash.CustomCheckBoxLayout;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C10178z;
import p040o.C10894doCleanup;
import p040o.C1162x44a04885;
import p040o.C4923l;
import p040o.C7280oK;
import p040o.C7282oM;
import p040o.C7339pA;
import p040o.HmlPinActivity;
import p040o.ImageClassifier;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.addImageOutEventListener;
import p040o.ensureAnimationInfo;
import p040o.forEachClear;
import p040o.getArguments;
import p040o.getICheckDeserializerRtti;
import p040o.getNextTransition;
import p040o.getPersonalLimit;
import p040o.getSessionFile;
import p040o.performUpdateApp;
import p040o.removeImageClassificationCompletedEventListener;
import p040o.setTapText;
import p040o.setupDialog;
import p040o.show;
import p040o.writeUInt64NoTag;

public class EasycashCreditPowerInputActivity extends BaseActivity implements C1162x44a04885, CustomCheckboxAdapter.write {
    private View.OnFocusChangeListener MediaBrowserCompat$MediaItem = new C7339pA(this);
    private AmountEditText.read MediaBrowserCompat$SearchResultReceiver = new AmountEditText.read() {
        public final void MediaBrowserCompat$CustomActionResultReceiver() {
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            EasycashCreditPowerInputActivity.this.read();
        }
    };
    private AmountEditText.IconCompatParcelizer MediaDescriptionCompat = new C10178z.C7545a.C7546a(this);
    private AmountEditText.IconCompatParcelizer MediaMetadataCompat = new C7280oK(this);
    private AmountEditText.read MediaSessionCompat$ResultReceiverWrapper = new AmountEditText.read() {
        public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            EasycashCreditPowerInputActivity.this.IconCompatParcelizer();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            EasycashCreditPowerInputActivity.this.PlaybackStateCompat$CustomAction();
        }
    };
    private View.OnFocusChangeListener MediaSessionCompat$Token = new C7282oM(this);
    @BindView
    protected Button btnCalculation;
    @BindView
    protected CustomCheckBoxLayout cbPowerCredit;
    @HmlPinActivity
    public addImageOutEventListener creditPowerInputPresenter;
    @BindView
    protected AmountEditText monthlyIncomeAmount;
    @BindView
    protected TextInputLayout monthlyIncomeError;
    @BindView
    protected AmountEditText monthlyPaymentAmount;
    @BindView
    protected TextInputLayout monthlyPaymentError;
    @HmlPinActivity
    public forEachClear tracker;

    public static Intent write(Context context) {
        return new Intent(context, EasycashCreditPowerInputActivity.class);
    }

    public static void IconCompatParcelizer(Context context) {
        Intent putExtra = new Intent(context, EasycashCreditPowerInputActivity.class).addFlags(603979776).putExtra("NEED_TO_REFRESH", true);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79302131493155);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.credit_power_input_title);
        setTabContainer();
        this.monthlyIncomeAmount.setOnAmountChangeListener(this.MediaBrowserCompat$SearchResultReceiver);
        this.monthlyIncomeAmount.setHandleDismissKeyboard(this.MediaMetadataCompat);
        this.monthlyIncomeAmount.setOnFocusChangeListener(this.MediaBrowserCompat$MediaItem);
        this.monthlyIncomeAmount.setImeOptions(5);
        this.monthlyPaymentAmount.setOnAmountChangeListener(this.MediaSessionCompat$ResultReceiverWrapper);
        this.monthlyPaymentAmount.setHandleDismissKeyboard(this.MediaDescriptionCompat);
        this.monthlyPaymentAmount.setOnFocusChangeListener(this.MediaSessionCompat$Token);
        this.monthlyPaymentAmount.setImeOptions(6);
        this.creditPowerInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.creditPowerInputPresenter.read();
    }

    public final /* synthetic */ void MediaSessionCompat$QueueItem() {
        this.creditPowerInputPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.monthlyIncomeAmount.getText().toString(), this.monthlyPaymentAmount.getText().toString());
    }

    public final /* synthetic */ void read(boolean z) {
        if (!z) {
            this.creditPowerInputPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.monthlyIncomeAmount.getText().toString(), this.monthlyPaymentAmount.getText().toString());
        }
    }

    public final void read(String str) {
        this.monthlyIncomeError.setError(getString(R.string.easycash_credit_power_limit_error, new Object[]{str}));
        this.btnCalculation.setEnabled(false);
    }

    public final void read() {
        this.monthlyIncomeError.setError((CharSequence) null);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ void mo14318x50fd9e4a() {
        this.creditPowerInputPresenter.write(this.monthlyIncomeAmount.getText().toString(), this.monthlyPaymentAmount.getText().toString());
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (!z) {
            this.creditPowerInputPresenter.write(this.monthlyIncomeAmount.getText().toString(), this.monthlyPaymentAmount.getText().toString());
        }
    }

    public final void IconCompatParcelizer(String str) {
        this.monthlyPaymentError.setError(getString(R.string.easycash_credit_power_limit_error, new Object[]{str}));
        this.btnCalculation.setEnabled(false);
    }

    public final void write() {
        this.monthlyPaymentError.setError(getString(R.string.easycash_credit_power_payment_exceed_error));
        this.btnCalculation.setEnabled(false);
    }

    public final void IconCompatParcelizer() {
        this.monthlyPaymentError.setError((CharSequence) null);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.btnCalculation.setEnabled(z);
    }

    @OnClick
    public void onClickedAction() {
        addImageOutEventListener addimageouteventlistener = this.creditPowerInputPresenter;
        C10894doCleanup docleanup = new C10894doCleanup(addimageouteventlistener);
        if (addimageouteventlistener.RatingCompat != null) {
            docleanup.IconCompatParcelizer(addimageouteventlistener.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getSessionFile getsessionfile, boolean z) {
        show show = new show(this.cbPowerCredit.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        List list = (List) new show(show.write, new getNextTransition(show.IconCompatParcelizer, getPersonalLimit.read)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
            public final /* synthetic */ Object read() {
                return new ArrayList();
            }
        }, new ensureAnimationInfo<List<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        }));
        if (list != null && !list.isEmpty()) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_type_1", ((performUpdateApp) list.get(0)).MediaSessionCompat$ResultReceiverWrapper));
        }
        if (list != null && list.size() > 1) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_type_2", ((performUpdateApp) list.get(1)).MediaSessionCompat$ResultReceiverWrapper));
        }
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("monthly_income", getICheckDeserializerRtti.RatingCompat(this.monthlyIncomeAmount.getText().toString())));
        this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("ability_repayment", getICheckDeserializerRtti.RatingCompat(this.monthlyPaymentAmount.getText().toString())));
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_credit_power_start");
        EasycashNCBConsentActivity.IconCompatParcelizer(this, getsessionfile.write, getsessionfile.MediaBrowserCompat$ItemReceiver, this.monthlyIncomeAmount.getText().toString(), this.monthlyPaymentAmount.getText().toString(), list, z);
    }

    public final void IconCompatParcelizer(String str, List<performUpdateApp> list) {
        EasycashCreditPowerSummaryActivity.MediaDescriptionCompat.write(this, list, str);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            this.cbPowerCredit.errorMessage.setVisibility(8);
            return;
        }
        CustomCheckBoxLayout customCheckBoxLayout = this.cbPowerCredit;
        customCheckBoxLayout.errorMessage.setText(getString(R.string.easycash_credit_power_select_is_secured_error));
        customCheckBoxLayout.errorMessage.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<performUpdateApp> list) {
        CustomCheckBoxLayout customCheckBoxLayout = this.cbPowerCredit;
        CustomCheckboxAdapter customCheckboxAdapter = new CustomCheckboxAdapter(list, this);
        customCheckBoxLayout.IconCompatParcelizer = customCheckboxAdapter;
        customCheckBoxLayout.rvCustomCheckBox.setAdapter(customCheckboxAdapter);
    }

    public final void MediaSessionCompat$Token() {
        addImageOutEventListener addimageouteventlistener = this.creditPowerInputPresenter;
        List<performUpdateApp> list = this.cbPowerCredit.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        show show = new show(this.cbPowerCredit.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver);
        List<performUpdateApp> list2 = (List) new show(show.write, new getNextTransition(show.IconCompatParcelizer, getPersonalLimit.read)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
            public final /* synthetic */ Object read() {
                return new ArrayList();
            }
        }, new ensureAnimationInfo<List<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        }));
        addimageouteventlistener.read = list2;
        show show2 = new show(list2);
        boolean z = true;
        addimageouteventlistener.write = ((List) new show(show2.write, new getNextTransition(show2.IconCompatParcelizer, C4923l.write)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
            public final /* synthetic */ Object read() {
                return new ArrayList();
            }
        }, new ensureAnimationInfo<List<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        }))).size() < 2;
        removeImageClassificationCompletedEventListener removeimageclassificationcompletedeventlistener = new removeImageClassificationCompletedEventListener(addimageouteventlistener);
        if (addimageouteventlistener.RatingCompat != null) {
            removeimageclassificationcompletedeventlistener.IconCompatParcelizer(addimageouteventlistener.RatingCompat);
        }
        ImageClassifier.C34723 r3 = new writeUInt64NoTag.IconCompatParcelizer(list2, list) {
            private final /* synthetic */ List IconCompatParcelizer;
            private final /* synthetic */ List read;

            {
                this.IconCompatParcelizer = r2;
                this.read = r3;
            }

            public final void IconCompatParcelizer(Object obj) {
                addImageOutEventListener addimageouteventlistener = addImageOutEventListener.this;
                List list = this.IconCompatParcelizer;
                C1162x44a04885 checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper = (C1162x44a04885) obj;
                checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.read(addImageOutEventListener.IconCompatParcelizer(list.size() >= 2, this.read));
                checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(addimageouteventlistener.MediaBrowserCompat$ItemReceiver());
            }
        };
        if (addimageouteventlistener.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r3.IconCompatParcelizer(addimageouteventlistener.RatingCompat);
        }
    }

    public final void read(List<performUpdateApp> list) {
        this.cbPowerCredit.setCreditPowerTileDisplayList(list);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.credit_power_input_title);
        setTabContainer();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onResume() {
        super.onResume();
        if (getIntent().getBooleanExtra("NEED_TO_REFRESH", false)) {
            this.creditPowerInputPresenter.read();
            this.monthlyIncomeAmount.getText().clear();
            this.monthlyIncomeAmount.setHint(getString(R.string.transfer_to_account_amount_hint));
            this.monthlyPaymentAmount.getText().clear();
            this.monthlyPaymentAmount.setHint(getString(R.string.transfer_to_account_amount_hint));
            this.btnCalculation.setEnabled(false);
            getIntent().putExtra("NEED_TO_REFRESH", false);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        return true;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public void onDestroy() {
        this.creditPowerInputPresenter.onDestroy();
        this.tracker = null;
        super.onDestroy();
    }

    public void onBackPressed() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }
}

package com.scb.phone.view.activity.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.ekyc.NationalIdHelpActivity;
import com.scb.phone.view.custom.common.CustomEditText;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.C1352hA;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setImageCapturedEvent;
import p040o.setPosY;
import p040o.setTapText;

public class ScbsOnboardingLaserIdActivity extends BaseActivity implements C1352hA {
    private int[] MediaMetadataCompat = {3, 7, 2};
    @BindViews
    List<CustomEditText> digitEditTexts;
    @BindView
    TextView digitTextView;
    @BindView
    Button nextButton;
    @HmlPinActivity
    public setPosY presenter;

    public static void write(Context context) {
        Intent intent = new Intent(context, ScbsOnboardingLaserIdActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
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
        setContentView(R.layout.f79812131493206);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.scbs_onboarding_laser_id_title);
        String string = getString(R.string.scbs_onboarding_laser_id_12_digits);
        ImageSpan imageSpan = new ImageSpan(this, R.drawable.icon_id_questions, 0);
        SpannableString spannableString = new SpannableString(string);
        spannableString.setSpan(imageSpan, string.length() - 1, string.length(), 33);
        spannableString.setSpan(new ClickableSpan() {
            public final void onClick(View view) {
                setPosY setposy = ScbsOnboardingLaserIdActivity.this.presenter;
                setImageCapturedEvent setimagecapturedevent = setImageCapturedEvent.read;
                if (setposy.RatingCompat != null) {
                    setimagecapturedevent.IconCompatParcelizer(setposy.RatingCompat);
                }
            }
        }, string.length() - 1, string.length(), 33);
        this.digitTextView.setMovementMethod(LinkMovementMethod.getInstance());
        this.digitTextView.setText(spannableString);
        MediaSessionCompat$ResultReceiverWrapper();
        this.nextButton.setEnabled(false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        mo13676d_("scbsonboard_dopa");
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.scbs_onboarding_laser_id_title);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    private void MediaSessionCompat$ResultReceiverWrapper() {
        for (final int i = 0; i != this.digitEditTexts.size(); i++) {
            this.digitEditTexts.get(i).setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(this.MediaMetadataCompat[i])});
            this.digitEditTexts.get(i).addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void afterTextChanged(android.text.Editable r7) {
                    /*
                        r6 = this;
                        com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity r0 = com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity.this
                        o.setPosY r0 = r0.presenter
                        java.lang.String r7 = r7.toString()
                        int r1 = r1
                        r0.IconCompatParcelizer = r1
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 >= r2) goto L_0x0047
                        int r1 = r0.IconCompatParcelizer
                        r5 = 3
                        if (r1 == 0) goto L_0x0020
                        if (r1 != r4) goto L_0x0026
                        int r7 = r7.length()
                        r1 = 7
                        if (r7 != r1) goto L_0x0026
                        goto L_0x0028
                    L_0x0020:
                        int r7 = r7.length()
                        if (r7 == r5) goto L_0x0028
                    L_0x0026:
                        r7 = r3
                        goto L_0x0029
                    L_0x0028:
                        r7 = r4
                    L_0x0029:
                        if (r7 == 0) goto L_0x0047
                        int r7 = r0.IconCompatParcelizer
                        if (r7 < r5) goto L_0x0031
                        r7 = r2
                        goto L_0x0032
                    L_0x0031:
                        int r7 = r7 + r4
                    L_0x0032:
                        r0.IconCompatParcelizer = r7
                        o.setStabilityThreshold r7 = new o.setStabilityThreshold
                        r7.<init>(r0)
                        T r1 = r0.RatingCompat
                        if (r1 == 0) goto L_0x003f
                        r1 = r4
                        goto L_0x0040
                    L_0x003f:
                        r1 = r3
                    L_0x0040:
                        if (r1 == 0) goto L_0x0047
                        T r0 = r0.RatingCompat
                        r7.IconCompatParcelizer(r0)
                    L_0x0047:
                        com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity r7 = com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity.this
                        o.setPosY r7 = r7.presenter
                        com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity r0 = com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity.this
                        java.util.List<com.scb.phone.view.custom.common.CustomEditText> r0 = r0.digitEditTexts
                        java.lang.Object r0 = r0.get(r3)
                        com.scb.phone.view.custom.common.CustomEditText r0 = (com.scb.phone.view.custom.common.CustomEditText) r0
                        android.text.Editable r0 = r0.getText()
                        java.lang.String r0 = r0.toString()
                        com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity r1 = com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity.this
                        java.util.List<com.scb.phone.view.custom.common.CustomEditText> r1 = r1.digitEditTexts
                        java.lang.Object r1 = r1.get(r4)
                        com.scb.phone.view.custom.common.CustomEditText r1 = (com.scb.phone.view.custom.common.CustomEditText) r1
                        android.text.Editable r1 = r1.getText()
                        java.lang.String r1 = r1.toString()
                        com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity r5 = com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity.this
                        java.util.List<com.scb.phone.view.custom.common.CustomEditText> r5 = r5.digitEditTexts
                        java.lang.Object r2 = r5.get(r2)
                        com.scb.phone.view.custom.common.CustomEditText r2 = (com.scb.phone.view.custom.common.CustomEditText) r2
                        android.text.Editable r2 = r2.getText()
                        java.lang.String r2 = r2.toString()
                        int r0 = r0.length()
                        int r1 = r1.length()
                        int r0 = r0 + r1
                        int r1 = r2.length()
                        int r0 = r0 + r1
                        r1 = 12
                        if (r0 != r1) goto L_0x0095
                        r0 = r4
                        goto L_0x0096
                    L_0x0095:
                        r0 = r3
                    L_0x0096:
                        o.setStabilityThresholdEnabled r1 = new o.setStabilityThresholdEnabled
                        r1.<init>(r0)
                        T r0 = r7.RatingCompat
                        if (r0 == 0) goto L_0x00a0
                        r3 = r4
                    L_0x00a0:
                        if (r3 == 0) goto L_0x00a7
                        T r7 = r7.RatingCompat
                        r1.IconCompatParcelizer(r7)
                    L_0x00a7:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity.C10891.afterTextChanged(android.text.Editable):void");
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void clickNext() {
        setPosY setposy = this.presenter;
        String obj = this.digitEditTexts.get(0).getText().toString();
        boolean z = true;
        String obj2 = this.digitEditTexts.get(1).getText().toString();
        String obj3 = this.digitEditTexts.get(2).getText().toString();
        if (setposy.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setposy.RatingCompat.AlertController$RecycleListView();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        setposy.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new CustomConcurrentHashMap.WeakValueReference(sb.toString()));
        setposy.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setPosY.read(setposy, (byte) 0));
    }

    public final void IconCompatParcelizer() {
        NationalIdHelpActivity.write(this, getString(R.string.laser_id_help_title));
    }

    public final void write() {
        OnboardingFatcaQuestionsActivity.read(this);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        SCBSFormActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public final void write(int i) {
        this.digitEditTexts.get(i).requestFocus();
    }

    public final void read() {
        RatingCompat(false);
    }
}

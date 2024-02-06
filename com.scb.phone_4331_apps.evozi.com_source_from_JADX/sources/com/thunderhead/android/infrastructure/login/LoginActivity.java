package com.thunderhead.android.infrastructure.login;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.thunderhead.android.domain.authentication.ClientCredentials;
import kotlin.TypeCastException;
import p040o.C1188xc0532a8d;
import p040o.C6555xdccae8ee;
import p040o.C6751x58dc786f;
import p040o.C7296xbf02ac7d;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindGiftingMoneyTransferInputFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_MutualFundAddressMainFragment;
import p040o.FragmentBuilder_MutualFundPersonalInfoFragment;
import p040o.FundFactSheetActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaybackStateCompat;
import p040o.onAccountSummaryClick;
import p040o.onGetStartedClick;

public final class LoginActivity extends AppCompatActivity implements FragmentBuilder_MutualFundPersonalInfoFragment {
    private onAccountSummaryClick IconCompatParcelizer;
    private onAccountSummaryClick MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public TextInputEditText MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public ScrollView MediaBrowserCompat$MediaItem;
    private AppCompatButton MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public SwitchCompat MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public FragmentBuilder_MutualFundAddressMainFragment MediaMetadataCompat;
    /* access modifiers changed from: private */
    public TextInputEditText MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public boolean ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public boolean RatingCompat;
    /* access modifiers changed from: private */
    public TextInputLayout read;
    /* access modifiers changed from: private */
    public boolean write;

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Editable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ LoginActivity write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(LoginActivity loginActivity) {
            super(1);
            this.write = loginActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            TextInputLayout write2;
            Editable editable = (Editable) obj;
            this.write.write = true;
            this.write.MediaSessionCompat$ResultReceiverWrapper();
            if (this.write.ParcelableVolumeInfo && editable != null && editable.length() == 0 && (write2 = this.write.read) != null) {
                write2.setPasswordVisibilityToggleEnabled(true);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        if (r4 == null) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            int r9 = p040o.C6554xc460715d.th_activity_login
            r8.setContentView(r9)
            int r9 = p040o.C1188xc0532a8d.th_animation_activity_in
            int r0 = p040o.C1188xc0532a8d.th_animation_activity_empty
            r8.overridePendingTransition(r9, r0)
            o.onAccountSummaryClick r9 = new o.onAccountSummaryClick     // Catch:{ Exception -> 0x0170 }
            r9.<init>()     // Catch:{ Exception -> 0x0170 }
            r0 = 1
            r9.write = r0     // Catch:{ Exception -> 0x0170 }
            r8.MediaBrowserCompat$CustomActionResultReceiver = r9     // Catch:{ Exception -> 0x0170 }
            o.onAccountSummaryClick r9 = new o.onAccountSummaryClick     // Catch:{ Exception -> 0x0170 }
            r9.<init>()     // Catch:{ Exception -> 0x0170 }
            r1 = 0
            r9.write = r1     // Catch:{ Exception -> 0x0170 }
            r8.IconCompatParcelizer = r9     // Catch:{ Exception -> 0x0170 }
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.switch_remember_me     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            androidx.appcompat.widget.SwitchCompat r9 = (androidx.appcompat.widget.SwitchCompat) r9     // Catch:{ Exception -> 0x0170 }
            r8.MediaDescriptionCompat = r9     // Catch:{ Exception -> 0x0170 }
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.remember_me_block     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x003f
            com.thunderhead.android.infrastructure.login.LoginActivity$MediaBrowserCompat$MediaItem r2 = new com.thunderhead.android.infrastructure.login.LoginActivity$MediaBrowserCompat$MediaItem     // Catch:{ Exception -> 0x0170 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0170 }
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2     // Catch:{ Exception -> 0x0170 }
            r9.setOnClickListener(r2)     // Catch:{ Exception -> 0x0170 }
        L_0x003f:
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_textinputedittext_username     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9     // Catch:{ Exception -> 0x0170 }
            java.lang.String r2 = "afterTextChange"
            java.lang.String r3 = "$this$afterTextChanged"
            r4 = 0
            if (r9 == 0) goto L_0x006c
            r9.requestFocus()     // Catch:{ Exception -> 0x0170 }
            r5 = r9
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0170 }
            com.thunderhead.android.infrastructure.login.LoginActivity$IconCompatParcelizer r6 = new com.thunderhead.android.infrastructure.login.LoginActivity$IconCompatParcelizer     // Catch:{ Exception -> 0x0170 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x0170 }
            o.FundFactSheetActivity r6 = (p040o.FundFactSheetActivity) r6     // Catch:{ Exception -> 0x0170 }
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r3)     // Catch:{ Exception -> 0x0170 }
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r2)     // Catch:{ Exception -> 0x0170 }
            o.FragmentBuilder_MailingAddressInputFragment r7 = new o.FragmentBuilder_MailingAddressInputFragment     // Catch:{ Exception -> 0x0170 }
            r7.<init>(r6)     // Catch:{ Exception -> 0x0170 }
            android.text.TextWatcher r7 = (android.text.TextWatcher) r7     // Catch:{ Exception -> 0x0170 }
            r5.addTextChangedListener(r7)     // Catch:{ Exception -> 0x0170 }
            goto L_0x006d
        L_0x006c:
            r9 = r4
        L_0x006d:
            r8.MediaSessionCompat$Token = r9     // Catch:{ Exception -> 0x0170 }
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_textinputedittext_password     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            com.google.android.material.textfield.TextInputEditText r9 = (com.google.android.material.textfield.TextInputEditText) r9     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x0094
            r5 = r9
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0170 }
            com.thunderhead.android.infrastructure.login.LoginActivity$write r6 = new com.thunderhead.android.infrastructure.login.LoginActivity$write     // Catch:{ Exception -> 0x0170 }
            r6.<init>(r8)     // Catch:{ Exception -> 0x0170 }
            o.FundFactSheetActivity r6 = (p040o.FundFactSheetActivity) r6     // Catch:{ Exception -> 0x0170 }
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r3)     // Catch:{ Exception -> 0x0170 }
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r2)     // Catch:{ Exception -> 0x0170 }
            o.FragmentBuilder_MailingAddressInputFragment r2 = new o.FragmentBuilder_MailingAddressInputFragment     // Catch:{ Exception -> 0x0170 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x0170 }
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2     // Catch:{ Exception -> 0x0170 }
            r5.addTextChangedListener(r2)     // Catch:{ Exception -> 0x0170 }
            goto L_0x0095
        L_0x0094:
            r9 = r4
        L_0x0095:
            r8.MediaBrowserCompat$ItemReceiver = r9     // Catch:{ Exception -> 0x0170 }
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_textinputlayout_password_container     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            com.google.android.material.textfield.TextInputLayout r9 = (com.google.android.material.textfield.TextInputLayout) r9     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x00b3
            androidx.appcompat.widget.SwitchCompat r2 = r8.MediaDescriptionCompat     // Catch:{ Exception -> 0x0170 }
            if (r2 == 0) goto L_0x00ae
            boolean r2 = r2.isChecked()     // Catch:{ Exception -> 0x0170 }
            if (r2 == r0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r2 = r0
            goto L_0x00af
        L_0x00ae:
            r2 = r1
        L_0x00af:
            r9.setPasswordVisibilityToggleEnabled(r2)     // Catch:{ Exception -> 0x0170 }
            goto L_0x00b4
        L_0x00b3:
            r9 = r4
        L_0x00b4:
            r8.read = r9     // Catch:{ Exception -> 0x0170 }
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_sign_in     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            androidx.appcompat.widget.AppCompatButton r9 = (androidx.appcompat.widget.AppCompatButton) r9     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x00cb
            com.thunderhead.android.infrastructure.login.LoginActivity$MediaBrowserCompat$CustomActionResultReceiver r2 = new com.thunderhead.android.infrastructure.login.LoginActivity$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0170 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0170 }
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2     // Catch:{ Exception -> 0x0170 }
            r9.setOnClickListener(r2)     // Catch:{ Exception -> 0x0170 }
            goto L_0x00cc
        L_0x00cb:
            r9 = r4
        L_0x00cc:
            r8.MediaBrowserCompat$SearchResultReceiver = r9     // Catch:{ Exception -> 0x0170 }
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_scrollview_login_scrollview     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9     // Catch:{ Exception -> 0x0170 }
            r8.MediaBrowserCompat$MediaItem = r9     // Catch:{ Exception -> 0x0170 }
            int r9 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.login_image_view_wave     // Catch:{ Exception -> 0x0170 }
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            boolean r2 = r9 instanceof android.widget.ImageView     // Catch:{ Exception -> 0x0170 }
            if (r2 != 0) goto L_0x00e3
            r9 = r4
        L_0x00e3:
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x0127
            int r2 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_thdc_waves     // Catch:{ Exception -> 0x0170 }
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x0170 }
            r3.<init>()     // Catch:{ Exception -> 0x0170 }
            android.view.WindowManager r5 = r8.getWindowManager()     // Catch:{ Exception -> 0x0170 }
            java.lang.String r6 = "windowManager"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r5, (java.lang.String) r6)     // Catch:{ Exception -> 0x0170 }
            android.view.Display r5 = r5.getDefaultDisplay()     // Catch:{ Exception -> 0x0170 }
            r5.getMetrics(r3)     // Catch:{ Exception -> 0x0170 }
            int r3 = r3.widthPixels     // Catch:{ Exception -> 0x0170 }
            android.content.res.Resources r5 = r8.getResources()     // Catch:{ Exception -> 0x0170 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeResource(r5, r2)     // Catch:{ Exception -> 0x0170 }
            float r5 = (float) r3     // Catch:{ Exception -> 0x0170 }
            java.lang.String r6 = "bitmap"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r6)     // Catch:{ Exception -> 0x0170 }
            int r6 = r2.getWidth()     // Catch:{ Exception -> 0x0170 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0170 }
            float r5 = r5 / r6
            int r6 = r2.getHeight()     // Catch:{ Exception -> 0x0170 }
            float r6 = (float) r6     // Catch:{ Exception -> 0x0170 }
            float r6 = r6 * r5
            int r5 = (int) r6     // Catch:{ Exception -> 0x0170 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r2, r3, r5, r0)     // Catch:{ Exception -> 0x0170 }
            java.lang.String r2 = "Bitmap.createScaledBitma…, width, newHeight, true)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0170 }
            r9.setImageBitmap(r0)     // Catch:{ Exception -> 0x0170 }
        L_0x0127:
            r9 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r9 = r8.findViewById(r9)     // Catch:{ Exception -> 0x0170 }
            boolean r0 = r9 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x0170 }
            if (r0 != 0) goto L_0x0133
            r9 = r4
        L_0x0133:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x0156
            android.view.View r9 = r9.getChildAt(r1)     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x0154
            android.view.ViewTreeObserver r0 = r9.getViewTreeObserver()     // Catch:{ Exception -> 0x0170 }
            com.thunderhead.android.infrastructure.login.LoginActivity$read r1 = new com.thunderhead.android.infrastructure.login.LoginActivity$read     // Catch:{ Exception -> 0x0170 }
            r1.<init>(r8)     // Catch:{ Exception -> 0x0170 }
            o.FragmentBuilder_BindSCBSRiskLevelFragment$MediaBrowserCompat$ItemReceiver r1 = (p040o.C6751x58dc786f) r1     // Catch:{ Exception -> 0x0170 }
            o.FragmentBuilder_BindSCBSRiskLevelFragment r2 = new o.FragmentBuilder_BindSCBSRiskLevelFragment     // Catch:{ Exception -> 0x0170 }
            r2.<init>(r9, r1)     // Catch:{ Exception -> 0x0170 }
            android.view.ViewTreeObserver$OnGlobalLayoutListener r2 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r2     // Catch:{ Exception -> 0x0170 }
            r0.addOnGlobalLayoutListener(r2)     // Catch:{ Exception -> 0x0170 }
            o.HmlVerifyPhoneValidateOtpActivity r4 = p040o.HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver     // Catch:{ Exception -> 0x0170 }
        L_0x0154:
            if (r4 != 0) goto L_0x015b
        L_0x0156:
            java.lang.String r9 = "Could not set login keyboard listener."
            p040o.MyECouponActivity_ViewBinding.write(r9)     // Catch:{ Exception -> 0x0170 }
        L_0x015b:
            r8.MediaSessionCompat$ResultReceiverWrapper()     // Catch:{ Exception -> 0x0170 }
            r8.m3489x50fd9e4a()     // Catch:{ Exception -> 0x0170 }
            o.FragmentBuilder_MutualFundAddressMainFragment r9 = p040o.FragmentBuilder_BindHmlIssuerLandingFragment.setContentView()     // Catch:{ Exception -> 0x0170 }
            r8.MediaMetadataCompat = r9     // Catch:{ Exception -> 0x0170 }
            if (r9 == 0) goto L_0x0174
            r0 = r8
            com.thunderhead.android.infrastructure.ui.mvp.UiView r0 = (com.thunderhead.android.infrastructure.p057ui.mvp.UiView) r0     // Catch:{ Exception -> 0x0170 }
            r9.attach(r0)     // Catch:{ Exception -> 0x0170 }
            return
        L_0x0170:
            r9 = move-exception
            p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r9)
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.android.infrastructure.login.LoginActivity.onCreate(android.os.Bundle):void");
    }

    public final void onResume() {
        super.onResume();
        try {
            MediaSessionCompat$Token();
            m3489x50fd9e4a();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void onStop() {
        super.onStop();
        try {
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (onaccountsummaryclick != null) {
                onaccountsummaryclick.read();
            }
            onAccountSummaryClick onaccountsummaryclick2 = this.IconCompatParcelizer;
            if (onaccountsummaryclick2 != null) {
                onaccountsummaryclick2.read();
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        try {
            onAccountSummaryClick onaccountsummaryclick = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (onaccountsummaryclick != null) {
                PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick.read;
                if (customAction != null) {
                    customAction.dismiss();
                    onaccountsummaryclick.read = null;
                }
                onaccountsummaryclick.MediaBrowserCompat$MediaItem = null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            onAccountSummaryClick onaccountsummaryclick2 = this.IconCompatParcelizer;
            if (onaccountsummaryclick2 != null) {
                PlaybackStateCompat.CustomAction customAction2 = onaccountsummaryclick2.read;
                if (customAction2 != null) {
                    customAction2.dismiss();
                    onaccountsummaryclick2.read = null;
                }
                onaccountsummaryclick2.MediaBrowserCompat$MediaItem = null;
            }
            this.IconCompatParcelizer = null;
            FragmentBuilder_MutualFundAddressMainFragment fragmentBuilder_MutualFundAddressMainFragment = this.MediaMetadataCompat;
            if (fragmentBuilder_MutualFundAddressMainFragment != null) {
                fragmentBuilder_MutualFundAddressMainFragment.detach();
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        try {
            this.ParcelableVolumeInfo = z;
            if (!this.RatingCompat) {
                SwitchCompat switchCompat = this.MediaDescriptionCompat;
                if (!(switchCompat == null || switchCompat.isChecked() == z)) {
                    switchCompat.setChecked(z);
                }
                TextInputLayout textInputLayout = this.read;
                if (textInputLayout != null) {
                    textInputLayout.setPasswordVisibilityToggleEnabled(!this.ParcelableVolumeInfo);
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void read(ClientCredentials clientCredentials) {
        onGetStartedClick.write((Object) clientCredentials, "clientCredentials");
        try {
            if (!this.write) {
                TextInputEditText textInputEditText = this.MediaSessionCompat$Token;
                if (textInputEditText != null) {
                    textInputEditText.setText(clientCredentials.getUsername());
                }
                TextInputEditText textInputEditText2 = this.MediaBrowserCompat$ItemReceiver;
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(clientCredentials.getPassword());
                    String password = clientCredentials.getPassword();
                    onGetStartedClick.IconCompatParcelizer((Object) password, "clientCredentials.password");
                    if (password.length() > 0) {
                        textInputEditText2.requestFocus();
                    }
                }
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        onAccountSummaryClick onaccountsummaryclick;
        if (z) {
            try {
                onAccountSummaryClick onaccountsummaryclick2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                if (onaccountsummaryclick2 != null) {
                    PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick2.read;
                    if (!(customAction != null && customAction.isShowing()) && (onaccountsummaryclick = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
                        onaccountsummaryclick.MediaBrowserCompat$CustomActionResultReceiver(this);
                    }
                }
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else {
            onAccountSummaryClick onaccountsummaryclick3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (onaccountsummaryclick3 != null) {
                onaccountsummaryclick3.read();
            }
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        try {
            read(getString(C6555xdccae8ee.th_authentication_error), getString(C6555xdccae8ee.th_incorrect_username_or_password_message));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void ParcelableVolumeInfo() {
        try {
            read(getString(C6555xdccae8ee.th_connection_error), getString(C6555xdccae8ee.th_please_check_your_internet_connection));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        try {
            read(getString(C6555xdccae8ee.th_login_information_label), getString(C6555xdccae8ee.th_unable_to_submit_request_message));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void MediaDescriptionCompat() {
        try {
            finish();
            overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_animation_activity_out);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        try {
            read(getString(C6555xdccae8ee.th_login_information_label), getString(C6555xdccae8ee.th_username_is_empty_message));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void RatingCompat() {
        try {
            read(getString(C6555xdccae8ee.th_login_information_label), getString(C6555xdccae8ee.th_password_is_empty_message));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void MediaMetadataCompat() {
        try {
            read(getString(C6555xdccae8ee.th_login_information_label), getString(C6555xdccae8ee.th_no_internet_connection_message));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final void m3489x50fd9e4a() {
        View findViewById;
        String lowerCase = "interactionStudio".toLowerCase();
        onGetStartedClick.IconCompatParcelizer((Object) lowerCase, "(this as java.lang.String).toLowerCase()");
        if (GoodToKnowActivity.read(lowerCase, "interactionstudio", false) && (findViewById = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.login_image_view_wave)) != null) {
            findViewById.setVisibility(8);
        }
    }

    private static void read(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, i, 0, 0);
                view.requestLayout();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    private final void MediaSessionCompat$Token() {
        Resources resources = getResources();
        onGetStartedClick.IconCompatParcelizer((Object) resources, "resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        float f = ((float) displayMetrics.heightPixels) / displayMetrics.density;
        View findViewById = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.image_one_logo);
        View findViewById2 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.login_image_view_wave);
        if (f < 350.0f) {
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        } else if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        int dimension = (int) (((float) displayMetrics.widthPixels) - getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_login_activity_margin));
        if (displayMetrics.heightPixels < displayMetrics.widthPixels) {
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            dimension = (displayMetrics.widthPixels * 6) / 10;
        } else if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
        View findViewById3 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.image_one_logo);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById3, "findViewById(R.id.image_one_logo)");
        read(findViewById3, (int) getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_logo_margin_top));
        View findViewById4 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_textinputlayout_username_container);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById4, "findViewById(R.id.th_act…ayout_username_container)");
        read(findViewById4, (int) getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_username_margin_top));
        View findViewById5 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_textinputlayout_password_container);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById5, "findViewById(R.id.th_act…ayout_password_container)");
        read(findViewById5, (int) getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_password_margin_top));
        View findViewById6 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_sign_in);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById6, "findViewById(R.id.btn_sign_in)");
        read(findViewById6, (int) getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_button_margin_top));
        View findViewById7 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.remember_me_block);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById7, "findViewById(R.id.remember_me_block)");
        read(findViewById7, (int) getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_switcher_margin_top));
        View findViewById8 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_textinputlayout_username_container);
        if (findViewById8 != null) {
            onGetStartedClick.write((Object) findViewById8, "$this$setWidth");
            findViewById8.getLayoutParams().width = dimension;
        }
        View findViewById9 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_activity_login_textinputlayout_password_container);
        if (findViewById9 != null) {
            onGetStartedClick.write((Object) findViewById9, "$this$setWidth");
            findViewById9.getLayoutParams().width = dimension;
        }
        View findViewById10 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_sign_in);
        if (findViewById10 != null) {
            onGetStartedClick.write((Object) findViewById10, "$this$setWidth");
            findViewById10.getLayoutParams().width = dimension;
        }
        View findViewById11 = findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.remember_me_container);
        if (findViewById11 != null) {
            onGetStartedClick.write((Object) findViewById11, "$this$setWidth");
            findViewById11.getLayoutParams().width = dimension;
        }
    }

    /* access modifiers changed from: private */
    public final void IconCompatParcelizer(int i, int i2) {
        try {
            int[] iArr = new int[2];
            SwitchCompat switchCompat = this.MediaDescriptionCompat;
            if (switchCompat != null) {
                switchCompat.getLocationOnScreen(iArr);
            }
            if (i2 != iArr[1]) {
                int i3 = iArr[1];
                if (i3 + 50 >= i) {
                    ScrollView scrollView = this.MediaBrowserCompat$MediaItem;
                    if (scrollView != null) {
                        ScrollView scrollView2 = this.MediaBrowserCompat$MediaItem;
                        scrollView.scrollTo(0, (scrollView2 != null ? scrollView2.getScrollY() : 0) + 15);
                    }
                    IconCompatParcelizer(i, i3);
                }
            }
        } catch (StackOverflowError e) {
            MyECouponActivity_ViewBinding.write(e.getLocalizedMessage());
        }
    }

    public static final class read implements C6751x58dc786f {
        private /* synthetic */ LoginActivity write;

        read(LoginActivity loginActivity) {
            this.write = loginActivity;
        }

        public final void IconCompatParcelizer() {
            ScrollView MediaBrowserCompat$MediaItem = this.write.MediaBrowserCompat$MediaItem;
            if (MediaBrowserCompat$MediaItem != null) {
                MediaBrowserCompat$MediaItem.scrollTo(0, 0);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(int i) {
            this.write.IconCompatParcelizer(i, 0);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r2.MediaBrowserCompat$ItemReceiver;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        /*
            r2 = this;
            com.google.android.material.textfield.TextInputEditText r0 = r2.MediaSessionCompat$Token
            if (r0 == 0) goto L_0x0016
            boolean r0 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((com.google.android.material.textfield.TextInputEditText) r0)
            if (r0 != 0) goto L_0x0016
            com.google.android.material.textfield.TextInputEditText r0 = r2.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0016
            boolean r0 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((com.google.android.material.textfield.TextInputEditText) r0)
            if (r0 != 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            androidx.appcompat.widget.AppCompatButton r1 = r2.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x001e
            r1.setEnabled(r0)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.android.infrastructure.login.LoginActivity.MediaSessionCompat$ResultReceiverWrapper():void");
    }

    public final void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(C1188xc0532a8d.th_animation_activity_empty, C1188xc0532a8d.th_animation_activity_out);
        FragmentBuilder_MutualFundAddressMainFragment fragmentBuilder_MutualFundAddressMainFragment = this.MediaMetadataCompat;
        if (fragmentBuilder_MutualFundAddressMainFragment != null) {
            fragmentBuilder_MutualFundAddressMainFragment.close();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        onGetStartedClick.write((Object) configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        MediaSessionCompat$Token();
        m3489x50fd9e4a();
    }

    private final void read(String str, String str2) {
        onAccountSummaryClick onaccountsummaryclick;
        onAccountSummaryClick onaccountsummaryclick2 = this.IconCompatParcelizer;
        if (onaccountsummaryclick2 != null) {
            PlaybackStateCompat.CustomAction customAction = onaccountsummaryclick2.read;
            if ((customAction != null && customAction.isShowing()) && (onaccountsummaryclick = this.IconCompatParcelizer) != null) {
                onaccountsummaryclick.read();
            }
        }
        onAccountSummaryClick onaccountsummaryclick3 = this.IconCompatParcelizer;
        if (onaccountsummaryclick3 != null) {
            onaccountsummaryclick3.RatingCompat = str;
            onaccountsummaryclick3.MediaBrowserCompat$ItemReceiver = str2;
            onaccountsummaryclick3.MediaBrowserCompat$CustomActionResultReceiver = new MediaMetadataCompat(this, str2);
            onaccountsummaryclick3.MediaBrowserCompat$CustomActionResultReceiver(this);
        }
    }

    static final class MediaMetadataCompat implements C7296xbf02ac7d {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ LoginActivity write;

        MediaMetadataCompat(LoginActivity loginActivity, String str) {
            this.write = loginActivity;
            this.IconCompatParcelizer = str;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            TextInputEditText IconCompatParcelizer2;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) this.write.getString(C6555xdccae8ee.th_incorrect_username_or_password_message)) && (IconCompatParcelizer2 = this.write.MediaBrowserCompat$ItemReceiver) != null) {
                IconCompatParcelizer2.setText("");
            }
            FragmentBuilder_MutualFundAddressMainFragment MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaMetadataCompat;
            if (MediaBrowserCompat$CustomActionResultReceiver != null) {
                MediaBrowserCompat$CustomActionResultReceiver.acknowledgeError();
            }
        }
    }

    static {
        FragmentBuilder_BindGiftingMoneyTransferInputFragment.MediaBrowserCompat$ItemReceiver(LoginActivity.class);
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Editable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ LoginActivity IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(LoginActivity loginActivity) {
            super(1);
            this.IconCompatParcelizer = loginActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.IconCompatParcelizer.write = true;
            this.IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}

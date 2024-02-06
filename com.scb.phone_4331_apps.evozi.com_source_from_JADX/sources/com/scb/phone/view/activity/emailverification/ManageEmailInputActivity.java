package com.scb.phone.view.activity.emailverification;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.presentation.presenter.emailverification.ManageEmailInputPresenter;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.ScbEditText;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C10105pj;
import p040o.C10106pk;
import p040o.C7372ph;
import p040o.C7374pl;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PhenotypeFlag;
import p040o.ScriptIntrinsicBLAS;
import p040o.access$2200;
import p040o.access$2300;
import p040o.getGlareDetectedThreshold;
import p040o.getRestrictiveEndorsementPresent;
import p040o.getSkewDetection;
import p040o.isLowContrastBackground;
import p040o.setBlurDetection;
import p040o.setGlareDetectedThreshold;
import p040o.setMissingBorder;
import p040o.setMissingBordersDetection;
import p040o.setOversaturated;
import p040o.setTapText;
import p040o.setUndersaturated;
import p040o.tryWeakKeys;

public class ManageEmailInputActivity extends BaseActivity implements getRestrictiveEndorsementPresent {
    private ScriptIntrinsicBLAS.Uplo MediaBrowserCompat$SearchResultReceiver;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat = "";
    @BindView
    Button btnCancel;
    @BindView
    ImageView btnDeleteEmail;
    @BindView
    Button btnSave;
    @BindView
    TextView editEmailDescription;
    @BindView
    ScbEditText etEmail;
    @HmlPinActivity
    public tryWeakKeys manageEmailCommonDisplayMapper;
    @HmlPinActivity
    public ManageEmailInputPresenter presenter;
    @BindView
    TextView tvEmailError;

    public static Intent read(Context context, boolean z) {
        Intent intent = new Intent(context, ManageEmailInputActivity.class);
        intent.putExtra("EXTRA_IS_REQUESTED_FOR_RESULT", z);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78622131493087);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$SearchResultReceiver = new ScriptIntrinsicBLAS.Uplo();
        super.setStackedBackground();
        this.presenter.IconCompatParcelizer();
        boolean z = true;
        mo11B_().MediaBrowserCompat$CustomActionResultReceiver(true);
        this.etEmail.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100), C7374pl.MediaBrowserCompat$CustomActionResultReceiver});
        this.etEmail.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String charSequence2 = charSequence.toString();
                if (!(charSequence2 == null || charSequence2.length() == 0)) {
                    ManageEmailInputActivity.this.btnDeleteEmail.setVisibility(0);
                } else {
                    ManageEmailInputActivity.this.btnDeleteEmail.setVisibility(8);
                }
            }

            public final void afterTextChanged(Editable editable) {
                ManageEmailInputPresenter manageEmailInputPresenter = ManageEmailInputActivity.this.presenter;
                boolean z = true;
                if (!TextUtils.isEmpty(ManageEmailInputActivity.this.etEmail.getText().toString()) || !TextUtils.isEmpty(manageEmailInputPresenter.MediaBrowserCompat$ItemReceiver)) {
                    setOversaturated setoversaturated = setOversaturated.IconCompatParcelizer;
                    if (manageEmailInputPresenter.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setoversaturated.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
                        return;
                    }
                    return;
                }
                getGlareDetectedThreshold getglaredetectedthreshold = getGlareDetectedThreshold.read;
                if (manageEmailInputPresenter.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getglaredetectedthreshold.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
                }
            }
        });
        this.etEmail.setOnClickListener(new C7372ph(this));
        this.etEmail.setImeOptions(6);
        this.etEmail.setRawInputType(1);
        ManageEmailInputPresenter manageEmailInputPresenter = this.presenter;
        if (!(manageEmailInputPresenter.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView() == null || manageEmailInputPresenter.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaDescriptionCompat == null)) {
            manageEmailInputPresenter.MediaBrowserCompat$ItemReceiver = manageEmailInputPresenter.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaDescriptionCompat;
        }
        String str = manageEmailInputPresenter.MediaBrowserCompat$ItemReceiver;
        setUndersaturated setundersaturated = new setUndersaturated(manageEmailInputPresenter, str != null && !str.isEmpty());
        if (manageEmailInputPresenter.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setundersaturated.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
        }
        this.MediaDescriptionCompat = getIntent().getBooleanExtra("EXTRA_IS_REQUESTED_FOR_RESULT", false);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        this.presenter.IconCompatParcelizer();
    }

    @OnClick
    public void onBtnCancelClicked() {
        ManageEmailInputPresenter manageEmailInputPresenter = this.presenter;
        boolean z = true;
        if (TextUtils.isEmpty(manageEmailInputPresenter.MediaBrowserCompat$ItemReceiver)) {
            setMissingBorder setmissingborder = setMissingBorder.read;
            if (manageEmailInputPresenter.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setmissingborder.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
                return;
            }
            return;
        }
        setMissingBordersDetection setmissingbordersdetection = setMissingBordersDetection.read;
        if (manageEmailInputPresenter.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setmissingbordersdetection.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
        }
    }

    @OnClick
    public void onBtnSaveClicked() {
        String str;
        boolean z;
        ManageEmailInputPresenter manageEmailInputPresenter = this.presenter;
        String obj = this.etEmail.getText().toString();
        manageEmailInputPresenter.read = obj;
        getSkewDetection getskewdetection = getSkewDetection.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = true;
        if (manageEmailInputPresenter.RatingCompat != null) {
            getskewdetection.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
        }
        if (obj == null || obj.isEmpty()) {
            manageEmailInputPresenter.read = "";
            if (manageEmailInputPresenter.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView() == null || manageEmailInputPresenter.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaBrowserCompat$MediaItem == null) {
                str = "0";
            } else {
                str = manageEmailInputPresenter.getUserProfileUseCase.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().MediaBrowserCompat$MediaItem;
            }
            if (!TextUtils.isEmpty(manageEmailInputPresenter.read) || !str.equalsIgnoreCase(DiskLruCache.VERSION_1)) {
                setBlurDetection setblurdetection = setBlurDetection.MediaBrowserCompat$ItemReceiver;
                if (manageEmailInputPresenter.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    setblurdetection.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
                    return;
                }
                return;
            }
            isLowContrastBackground islowcontrastbackground = isLowContrastBackground.read;
            if (manageEmailInputPresenter.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                islowcontrastbackground.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
                return;
            }
            return;
        }
        PhenotypeFlag.zza zza = manageEmailInputPresenter.validateEmailUseCase;
        if (obj == null) {
            z = false;
        } else {
            z = zza.IconCompatParcelizer.matcher(obj).matches();
        }
        if (!z) {
            setGlareDetectedThreshold setglaredetectedthreshold = setGlareDetectedThreshold.MediaBrowserCompat$CustomActionResultReceiver;
            if (manageEmailInputPresenter.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                setglaredetectedthreshold.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
            }
        } else if (obj.equals(manageEmailInputPresenter.MediaBrowserCompat$ItemReceiver)) {
            setMissingBordersDetection setmissingbordersdetection = setMissingBordersDetection.read;
            if (manageEmailInputPresenter.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                setmissingbordersdetection.IconCompatParcelizer(manageEmailInputPresenter.RatingCompat);
            }
        } else {
            manageEmailInputPresenter.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    @OnClick
    public void clearEmail() {
        this.etEmail.setText("");
        this.btnDeleteEmail.setVisibility(8);
    }

    public final void IconCompatParcelizer(String str, boolean z) {
        this.MediaMetadataCompat = str;
        if (!z) {
            this.editEmailDescription.setText(R.string.edit_email_description_blank_state);
        }
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "emailverification_edit_email");
        this.etEmail.setText(str);
    }

    public final void write(boolean z) {
        this.btnSave.setEnabled(z);
    }

    public final void IconCompatParcelizer() {
        finish();
    }

    public void onBackPressed() {
        this.presenter.MediaBrowserCompat$ItemReceiver();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.presenter.MediaBrowserCompat$ItemReceiver();
        return true;
    }

    public final void RatingCompat() {
        this.etEmail.setBackgroundResource(R.drawable.shape_red_reounded_reactangle_border);
        this.tvEmailError.setVisibility(0);
        if (TextUtils.isEmpty(this.MediaMetadataCompat)) {
            this.editEmailDescription.setText(R.string.edit_email_description_blank_state);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.etEmail.setBackgroundResource(R.drawable.shape_gray_rounded_rectangle);
        this.tvEmailError.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        mo13676d_("profile_settings_email_save");
        setResult(-1, new Intent().putExtra("EXTRA_EMAIL_STATUS", 1));
        finish();
        if (this.MediaDescriptionCompat) {
            Intent write = ManageEmailVerificationActivity.write(this, str, str2, true, true);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, write).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(read, 1001);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else {
            Intent write3 = ManageEmailVerificationActivity.write(this, str, str2, true);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, write3).read();
                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read2.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb2.toString());
                startActivity(read2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        write(this.manageEmailCommonDisplayMapper.MediaBrowserCompat$CustomActionResultReceiver());
    }

    public final void write() {
        setResult(-1, new Intent().putExtra("EXTRA_EMAIL_STATUS", 0));
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        mo13676d_("profile_settings_email_save");
        setResult(-1, new Intent().putExtra("EXTRA_EMAIL_STATUS", 0));
        finish();
    }

    public final void read() {
        tryWeakKeys tryweakkeys = this.manageEmailCommonDisplayMapper;
        C10105pj pjVar = new C10105pj(this);
        access$2200 access_2200 = new access$2200();
        access_2200.MediaBrowserCompat$ItemReceiver = tryweakkeys.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_email_email_empty_title);
        access_2200.IconCompatParcelizer = tryweakkeys.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.manage_email_email_empty);
        access$2300 access_2300 = new access$2300();
        access_2300.MediaBrowserCompat$ItemReceiver = tryweakkeys.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_now);
        access_2300.read = access$2300.write.JUST_DISMISS;
        access_2200.MediaBrowserCompat$CustomActionResultReceiver = access_2300;
        access$2300 access_23002 = new access$2300();
        access_23002.MediaBrowserCompat$ItemReceiver = tryweakkeys.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.add_later);
        access_23002.read = access$2300.write.CUSTOM;
        access_23002.read = access$2300.write.CUSTOM;
        access_23002.MediaBrowserCompat$CustomActionResultReceiver = pjVar;
        access_2200.write = access_23002;
        write(access_2200);
    }

    public final void MediaDescriptionCompat() {
        Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.f81662131493392);
        TextView textView = (TextView) dialog.findViewById(R.id.dialog_title);
        TextView textView2 = (TextView) dialog.findViewById(R.id.dialog_text);
        Button button = (Button) dialog.findViewById(R.id.dialog_positive_button);
        textView.setVisibility(0);
        textView.setText(R.string.manage_email_disable_title);
        textView2.setVisibility(0);
        textView2.setText(R.string.manage_email_disable_message);
        button.setVisibility(0);
        button.setOnClickListener(new C10106pk(this));
        dialog.show();
    }

    public /* synthetic */ void lambda$showEmailNotificationError$3$ManageEmailInputActivity(View view) {
        finish();
    }

    public final void IconCompatParcelizer(int i) {
        MediaSessionCompat$QueueItem(getString(i));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.MediaDescriptionCompat && 1001 == i) {
            setResult(i2, intent);
            finish();
        }
    }

    public /* synthetic */ void lambda$onCreate$1$ManageEmailInputActivity(View view) {
        this.etEmail.setBackgroundResource(R.drawable.shape_gray_rounded_rectangle);
        this.tvEmailError.setVisibility(8);
    }
}

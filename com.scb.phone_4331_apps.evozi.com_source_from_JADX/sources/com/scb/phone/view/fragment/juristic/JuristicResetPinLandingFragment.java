package com.scb.phone.view.fragment.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.juristic.JuristicVerifyResetPinActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C3392x97fb5d9b;
import p040o.C7142hw;
import p040o.C9745xf9e2a36d;
import p040o.CheckEligibilityActivity;
import p040o.FixedAspectRatioCaptureExperience_MembersInjector;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.GwtIncompatible;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTBSV;
import p040o.forEachDstIn;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class JuristicResetPinLandingFragment extends BaseFragment implements C7142hw {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private final View.OnFocusChangeListener MediaBrowserCompat$CustomActionResultReceiver = new C6074xb4a24891(this);
    private final CustomEditText.write MediaBrowserCompat$MediaItem = new MediaMetadataCompat(this);
    private final View.OnFocusChangeListener MediaBrowserCompat$SearchResultReceiver = new MediaDescriptionCompat(this);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final HmlVerifyEmailActivity f3090x50fd9e4a;
    private final TextView.OnEditorActionListener MediaDescriptionCompat = new read(this);
    private final CustomEditText.write MediaMetadataCompat = new JuristicResetPinLandingFragment$MediaBrowserCompat$ItemReceiver(this);
    private final C6075x8a39d9f2 ParcelableVolumeInfo = new C6075x8a39d9f2(this);
    private final write RatingCompat = new write(this);
    @BindView
    public Button btnNext;
    @BindView
    public CommonInputViewGroup ivgJuristicAccount;
    @BindView
    public CommonInputViewGroup ivgJuristicNumber;
    @HmlPinActivity
    public FixedAspectRatioCaptureExperience_MembersInjector presenter;

    public JuristicResetPinLandingFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = RatingCompat.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.f3090x50fd9e4a = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f88232131494050, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector = this.presenter;
        if (fixedAspectRatioCaptureExperience_MembersInjector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        fixedAspectRatioCaptureExperience_MembersInjector.MediaBrowserCompat$ItemReceiver(this);
        CommonInputViewGroup commonInputViewGroup = this.ivgJuristicNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        TextWatcher textWatcher = this.ParcelableVolumeInfo;
        commonInputViewGroup.mEditText.addTextChangedListener(textWatcher);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
        CommonInputViewGroup commonInputViewGroup2 = this.ivgJuristicAccount;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        TextWatcher textWatcher2 = this.RatingCompat;
        commonInputViewGroup2.mEditText.addTextChangedListener(textWatcher2);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher2);
        CommonInputViewGroup commonInputViewGroup3 = this.ivgJuristicNumber;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        commonInputViewGroup3.setFocusListener(this.MediaBrowserCompat$SearchResultReceiver);
        CommonInputViewGroup commonInputViewGroup4 = this.ivgJuristicAccount;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        commonInputViewGroup4.setFocusListener(this.MediaBrowserCompat$CustomActionResultReceiver);
        CommonInputViewGroup commonInputViewGroup5 = this.ivgJuristicNumber;
        if (commonInputViewGroup5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        commonInputViewGroup5.setOnBackListener(this.MediaBrowserCompat$MediaItem);
        CommonInputViewGroup commonInputViewGroup6 = this.ivgJuristicAccount;
        if (commonInputViewGroup6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        commonInputViewGroup6.setOnBackListener(this.MediaMetadataCompat);
        CommonInputViewGroup commonInputViewGroup7 = this.ivgJuristicAccount;
        if (commonInputViewGroup7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        commonInputViewGroup7.setOnEditorActionListener(this.MediaDescriptionCompat);
        ZTBSV ztbsv = (forEachDstIn) this.f3090x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "forgot_juristic_pin_enter_info");
        }
    }

    static final class MediaDescriptionCompat implements View.OnFocusChangeListener {
        private /* synthetic */ JuristicResetPinLandingFragment MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
            this.MediaBrowserCompat$ItemReceiver = juristicResetPinLandingFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            if (!z) {
                FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (fixedAspectRatioCaptureExperience_MembersInjector == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                writeUInt64NoTag.IconCompatParcelizer fixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$ItemReceiver = new C3392x97fb5d9b(fixedAspectRatioCaptureExperience_MembersInjector);
                if (fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat != null) {
                    fixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat);
                }
            }
        }
    }

    static final class read implements TextView.OnEditorActionListener {
        private /* synthetic */ JuristicResetPinLandingFragment write;

        read(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
            this.write = juristicResetPinLandingFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            CommonInputViewGroup commonInputViewGroup = this.write.ivgJuristicAccount;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
            }
            commonInputViewGroup.clearFocus();
            this.write.PlaybackStateCompat$CustomAction();
            return true;
        }
    }

    public static final class write implements TextWatcher {
        private /* synthetic */ JuristicResetPinLandingFragment MediaBrowserCompat$ItemReceiver;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        write(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
            this.MediaBrowserCompat$ItemReceiver = juristicResetPinLandingFragment;
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null) {
                JuristicResetPinLandingFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    static final class MediaMetadataCompat implements CustomEditText.write {
        private /* synthetic */ JuristicResetPinLandingFragment MediaBrowserCompat$ItemReceiver;

        MediaMetadataCompat(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
            this.MediaBrowserCompat$ItemReceiver = juristicResetPinLandingFragment;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            CommonInputViewGroup commonInputViewGroup = this.MediaBrowserCompat$ItemReceiver.ivgJuristicNumber;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
            }
            commonInputViewGroup.clearFocus();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        if (z) {
            CommonInputViewGroup commonInputViewGroup = this.ivgJuristicNumber;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
            }
            commonInputViewGroup.MediaBrowserCompat$ItemReceiver();
            return;
        }
        CommonInputViewGroup commonInputViewGroup2 = this.ivgJuristicNumber;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            CommonInputViewGroup commonInputViewGroup = this.ivgJuristicAccount;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
            }
            commonInputViewGroup.MediaBrowserCompat$ItemReceiver();
            return;
        }
        CommonInputViewGroup commonInputViewGroup2 = this.ivgJuristicAccount;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(z);
    }

    public final void onDestroyView() {
        CommonInputViewGroup commonInputViewGroup = this.ivgJuristicNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        commonInputViewGroup.setFocusListener((View.OnFocusChangeListener) null);
        CommonInputViewGroup commonInputViewGroup2 = this.ivgJuristicAccount;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        commonInputViewGroup2.setFocusListener((View.OnFocusChangeListener) null);
        CommonInputViewGroup commonInputViewGroup3 = this.ivgJuristicNumber;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        TextWatcher textWatcher = this.ParcelableVolumeInfo;
        commonInputViewGroup3.mEditText.removeTextChangedListener(textWatcher);
        commonInputViewGroup3.MediaBrowserCompat$CustomActionResultReceiver.remove(textWatcher);
        CommonInputViewGroup commonInputViewGroup4 = this.ivgJuristicAccount;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        TextWatcher textWatcher2 = this.RatingCompat;
        commonInputViewGroup4.mEditText.removeTextChangedListener(textWatcher2);
        commonInputViewGroup4.MediaBrowserCompat$CustomActionResultReceiver.remove(textWatcher2);
        FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector = this.presenter;
        if (fixedAspectRatioCaptureExperience_MembersInjector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        fixedAspectRatioCaptureExperience_MembersInjector.onDestroy();
        super.onDestroyView();
    }

    @OnClick
    public final void navigateTo() {
        FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector = this.presenter;
        if (fixedAspectRatioCaptureExperience_MembersInjector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        CommonInputViewGroup commonInputViewGroup = this.ivgJuristicNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "ivgJuristicNumber.text");
        CommonInputViewGroup commonInputViewGroup2 = this.ivgJuristicAccount;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        String obj2 = commonInputViewGroup2.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj2, "ivgJuristicAccount.text");
        onGetStartedClick.write((Object) obj, "juristicNumber");
        onGetStartedClick.write((Object) obj2, "juristicAccount");
        if (fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat != null) {
            fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.DistinctKeyIterator distinctKeyIterator = fixedAspectRatioCaptureExperience_MembersInjector.MediaBrowserCompat$ItemReceiver;
        FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector2 = fixedAspectRatioCaptureExperience_MembersInjector;
        FundFactSheetActivity read2 = new FixedAspectRatioCaptureExperience_MembersInjector.read(fixedAspectRatioCaptureExperience_MembersInjector2);
        FundFactSheetActivity fixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$SearchResultReceiver = new C9745xf9e2a36d(fixedAspectRatioCaptureExperience_MembersInjector2);
        onGetStartedClick.write((Object) read2, "onSuccess");
        onGetStartedClick.write((Object) fixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$SearchResultReceiver, "onError");
        onGetStartedClick.write((Object) obj, "taxId");
        onGetStartedClick.write((Object) obj2, "accountNo");
        distinctKeyIterator.IconCompatParcelizer(distinctKeyIterator.write, read2, fixedAspectRatioCaptureExperience_MembersInjector$MediaBrowserCompat$SearchResultReceiver, new GwtIncompatible.read(obj, obj2));
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "resetPinTokenId");
        Context context = getContext();
        if (context != null) {
            JuristicVerifyResetPinActivity.write write2 = JuristicVerifyResetPinActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "resetToken");
            Intent intent = new Intent(context, JuristicVerifyResetPinActivity.class);
            intent.putExtra("EXTRA_TOKEN_ID", str);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    static final class RatingCompat extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final RatingCompat IconCompatParcelizer = new RatingCompat();

        RatingCompat() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
        boolean z = false;
        juristicResetPinLandingFragment.IconCompatParcelizer(false);
        CommonInputViewGroup commonInputViewGroup = juristicResetPinLandingFragment.ivgJuristicAccount;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "ivgJuristicAccount.text");
        if (obj.length() > 0) {
            CommonInputViewGroup commonInputViewGroup2 = juristicResetPinLandingFragment.ivgJuristicAccount;
            if (commonInputViewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
            }
            commonInputViewGroup2.write = true;
            commonInputViewGroup2.mEditClearImageButton.setVisibility(0);
            FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector = juristicResetPinLandingFragment.presenter;
            if (fixedAspectRatioCaptureExperience_MembersInjector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            CommonInputViewGroup commonInputViewGroup3 = juristicResetPinLandingFragment.ivgJuristicAccount;
            if (commonInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
            }
            String obj2 = commonInputViewGroup3.mEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj2, "ivgJuristicAccount.text");
            onGetStartedClick.write((Object) obj2, "juristicAccount");
            fixedAspectRatioCaptureExperience_MembersInjector.write = obj2.length() == 10;
            writeUInt64NoTag.IconCompatParcelizer write2 = new FixedAspectRatioCaptureExperience_MembersInjector.write(fixedAspectRatioCaptureExperience_MembersInjector);
            if (fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat != null) {
                z = true;
            }
            if (z) {
                write2.IconCompatParcelizer(fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat);
                return;
            }
            return;
        }
        CommonInputViewGroup commonInputViewGroup4 = juristicResetPinLandingFragment.ivgJuristicAccount;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicAccount");
        }
        commonInputViewGroup4.write = false;
        commonInputViewGroup4.mEditClearImageButton.setVisibility(8);
        Button button = juristicResetPinLandingFragment.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(false);
    }

    public static final /* synthetic */ void read(JuristicResetPinLandingFragment juristicResetPinLandingFragment) {
        boolean z = false;
        juristicResetPinLandingFragment.MediaBrowserCompat$ItemReceiver(false);
        CommonInputViewGroup commonInputViewGroup = juristicResetPinLandingFragment.ivgJuristicNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        String obj = commonInputViewGroup.mEditText.getText().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "ivgJuristicNumber.text");
        if (obj.length() > 0) {
            CommonInputViewGroup commonInputViewGroup2 = juristicResetPinLandingFragment.ivgJuristicNumber;
            if (commonInputViewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
            }
            commonInputViewGroup2.write = true;
            commonInputViewGroup2.mEditClearImageButton.setVisibility(0);
            FixedAspectRatioCaptureExperience_MembersInjector fixedAspectRatioCaptureExperience_MembersInjector = juristicResetPinLandingFragment.presenter;
            if (fixedAspectRatioCaptureExperience_MembersInjector == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            CommonInputViewGroup commonInputViewGroup3 = juristicResetPinLandingFragment.ivgJuristicNumber;
            if (commonInputViewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
            }
            String obj2 = commonInputViewGroup3.mEditText.getText().toString();
            onGetStartedClick.IconCompatParcelizer((Object) obj2, "ivgJuristicNumber.text");
            onGetStartedClick.write((Object) obj2, "juristicNumber");
            fixedAspectRatioCaptureExperience_MembersInjector.read = obj2.length() == 13;
            writeUInt64NoTag.IconCompatParcelizer write2 = new FixedAspectRatioCaptureExperience_MembersInjector.write(fixedAspectRatioCaptureExperience_MembersInjector);
            if (fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat != null) {
                z = true;
            }
            if (z) {
                write2.IconCompatParcelizer(fixedAspectRatioCaptureExperience_MembersInjector.RatingCompat);
                return;
            }
            return;
        }
        CommonInputViewGroup commonInputViewGroup4 = juristicResetPinLandingFragment.ivgJuristicNumber;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivgJuristicNumber");
        }
        commonInputViewGroup4.write = false;
        commonInputViewGroup4.mEditClearImageButton.setVisibility(8);
        Button button = juristicResetPinLandingFragment.btnNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnNext");
        }
        button.setEnabled(false);
    }
}

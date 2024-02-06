package com.scb.phone.view.fragment.registration;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.forgotpin.PinLockActivity;
import com.scb.phone.view.activity.registration.RegistrationManageDevicesActivity;
import com.scb.phone.view.activity.registration.RegistrationSuccessActivity;
import com.scb.phone.view.activity.registration.friends.FriendsRegistrationActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributeMwSubDistrictSearchActivity;
import p040o.C7535ub;
import p040o.HmlPinActivity;
import p040o.KtaServiceCaller;
import p040o.LocationEvent;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.SurfaceChangedEvent;
import p040o.getFileSHA;
import p040o.getKernelIDDstOver;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setVersion;
import p040o.writeSInt32NoTag;

public class RegistrationNewPinFragment extends BaseFragment implements C7535ub {
    /* access modifiers changed from: private */
    public getKernelIDDstOver MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView bottomTextView;
    @BindView
    DefaultButton buttonNext;
    @BindView
    CustomKeypad customKeypad;
    @BindView
    CustomPinInput customPinInput;
    @HmlPinActivity
    public KtaServiceCaller.JOB_TYPE presenter;
    @BindView
    TextView topTextView;

    public static RegistrationNewPinFragment RatingCompat() {
        Bundle bundle = new Bundle();
        RegistrationNewPinFragment registrationNewPinFragment = new RegistrationNewPinFragment();
        registrationNewPinFragment.setArguments(bundle);
        return registrationNewPinFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88892131494116, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.customKeypad.setEnabledLines(true);
        this.customKeypad.setKeypadListener(this.customPinInput);
        this.customPinInput.setPinInputListener(new MerchantService() {
            /* renamed from: P_ */
            public final void mo13717P_() {
            }

            public final void al_() {
                KtaServiceCaller.JOB_TYPE job_type = RegistrationNewPinFragment.this.presenter;
                writeSInt32NoTag writesint32notag = writeSInt32NoTag.MediaBrowserCompat$CustomActionResultReceiver;
                if (job_type.RatingCompat != null) {
                    writesint32notag.IconCompatParcelizer(job_type.RatingCompat);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                RegistrationNewPinFragment registrationNewPinFragment = RegistrationNewPinFragment.this;
                getKernelIDDstOver IconCompatParcelizer = registrationNewPinFragment.MediaBrowserCompat$CustomActionResultReceiver;
                if (registrationNewPinFragment.getActivity() != null) {
                    IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(((BaseActivity) registrationNewPinFragment.getActivity()).scbAnalytics, "registration_confirmpin");
                }
                RegistrationNewPinFragment.this.presenter.IconCompatParcelizer(str);
            }
        });
        this.buttonNext.setButtonEnabled(false);
        this.buttonNext.setOnClickListener(new ActivityBuilder_ContributeMwSubDistrictSearchActivity(this));
        this.presenter.IconCompatParcelizer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getKernelIDDstOver getkerneliddstover = new getKernelIDDstOver();
        this.MediaBrowserCompat$CustomActionResultReceiver = getkerneliddstover;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_setpin");
        }
        return inflate;
    }

    public final void MediaMetadataCompat() {
        if (getContext() != null) {
            this.bottomTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f67152131099871));
        }
        this.bottomTextView.setText(R.string.pin_mismatch);
    }

    public final void MediaDescriptionCompat() {
        ParcelableVolumeInfo(getString(R.string.set_pin_title));
        this.topTextView.setText(R.string.set_pin_instruction);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.buttonNext.setVisibility(i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ParcelableVolumeInfo(getString(R.string.confirm_pin_title));
        this.topTextView.setText(R.string.your_confirm_pin);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.bottomTextView.setText("");
    }

    public final void read() {
        this.buttonNext.setButtonEnabled(true);
    }

    public final void IconCompatParcelizer() {
        this.buttonNext.setButtonEnabled(false);
    }

    public final void read(setVersion setversion) {
        String str;
        int i;
        if (getContext() != null) {
            int i2 = C61435.IconCompatParcelizer[setversion.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    str = getString(R.string.pin_strength_fair);
                    i = setLastBaselineToBottomHeight.read(getContext(), R.color.f67232131099879);
                } else if (i2 == 3) {
                    str = getString(R.string.pin_strength_good);
                    i = setLastBaselineToBottomHeight.read(getContext(), R.color.f67212131099877);
                } else if (i2 == 4) {
                    this.bottomTextView.setText(R.string.pin_strength_error);
                    this.bottomTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f67152131099871));
                    return;
                }
                String string = getString(R.string.pin_strength);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i);
                StringBuilder sb = new StringBuilder();
                sb.append(string);
                sb.append(str);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
                spannableStringBuilder.setSpan(foregroundColorSpan, 0, string.length(), 33);
                spannableStringBuilder.setSpan(foregroundColorSpan2, string.length(), string.length() + str.length(), 33);
                this.bottomTextView.setText(spannableStringBuilder);
            }
            str = getString(R.string.pin_strength_weak);
            i = setLastBaselineToBottomHeight.read(getContext(), R.color.f67222131099878);
            String string2 = getString(R.string.pin_strength);
            ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
            ForegroundColorSpan foregroundColorSpan22 = new ForegroundColorSpan(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(str);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
            spannableStringBuilder2.setSpan(foregroundColorSpan3, 0, string2.length(), 33);
            spannableStringBuilder2.setSpan(foregroundColorSpan22, string2.length(), string2.length() + str.length(), 33);
            this.bottomTextView.setText(spannableStringBuilder2);
        }
    }

    /* renamed from: com.scb.phone.view.fragment.registration.RegistrationNewPinFragment$5 */
    static /* synthetic */ class C61435 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.setVersion[] r0 = p040o.setVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                IconCompatParcelizer = r0
                o.setVersion r1 = p040o.setVersion.WEAK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setVersion r1 = p040o.setVersion.FAIR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setVersion r1 = p040o.setVersion.GOOD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.setVersion r1 = p040o.setVersion.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.registration.RegistrationNewPinFragment.C61435.<clinit>():void");
        }
    }

    /* renamed from: Q_ */
    public final void mo13712Q_() {
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void read(boolean z, boolean z2) {
        getFileSHA getfilesha;
        if (getContext() != null) {
            setSubtitle();
            KtaServiceCaller.JOB_TYPE job_type = this.presenter;
            if (z2) {
                getfilesha = getFileSHA.DEAD_CARD;
            } else {
                getfilesha = getFileSHA.REGULAR;
            }
            boolean z3 = true;
            if (z) {
                LocationEvent locationEvent = new LocationEvent(getfilesha);
                if (job_type.RatingCompat == null) {
                    z3 = false;
                }
                if (z3) {
                    locationEvent.IconCompatParcelizer(job_type.RatingCompat);
                    return;
                }
                return;
            }
            SurfaceChangedEvent surfaceChangedEvent = new SurfaceChangedEvent(getfilesha);
            if (job_type.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                surfaceChangedEvent.IconCompatParcelizer(job_type.RatingCompat);
            }
        }
    }

    public final void write(getFileSHA getfilesha) {
        if (getActivity() != null) {
            Intent MediaBrowserCompat$CustomActionResultReceiver2 = FriendsRegistrationActivity.MediaBrowserCompat$CustomActionResultReceiver(getActivity(), getfilesha);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(getFileSHA getfilesha) {
        if (getActivity() != null) {
            Intent read = RegistrationSuccessActivity.read(getActivity(), getfilesha);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read(String str) {
        mo13677k_(str);
        if (getContext() != null) {
            PinLockActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
        }
    }

    public final void write(String str) {
        if (getContext() != null) {
            RegistrationManageDevicesActivity.MediaBrowserCompat$ItemReceiver(getContext(), str, false);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            setActionBarVisibilityCallback();
        } else {
            setCustomView();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}

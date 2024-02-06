package com.scb.phone.view.fragment.ntb.touchpoint;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.ReviewInfoResultActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointPinActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C10839getFilename;
import p040o.C4241dE;
import p040o.FragmentBuilder_BindCreditCardDisplayFragment;
import p040o.FragmentBuilder_BindDirectDebitInputSelectedFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getRegionName$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.removeIfFromRandomAccessList;
import p040o.setFilename;
import p040o.setTapText;

public final class TouchPointInputCidFragment extends BaseFragment implements getRegionName$MediaBrowserCompat$CustomActionResultReceiver {
    public static final read IconCompatParcelizer = new read((byte) 0);
    @BindView
    public Button buttonNext;
    @BindView
    public CommonInputViewGroup ivpNationalIdNumber;
    @HmlPinActivity
    public C4241dE presenter;
    @BindView
    public ViewGroup root;

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90142131494241, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C4241dE dEVar = this.presenter;
        if (dEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dEVar.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("EXTRA_MOBILE_NUMBER")) == null)) {
            C4241dE dEVar2 = this.presenter;
            if (dEVar2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) string, "it");
            onGetStartedClick.write((Object) string, "mobileNumber");
            dEVar2.MediaBrowserCompat$ItemReceiver = string;
        }
        TouchPointInputCidFragment touchPointInputCidFragment = this;
        if (touchPointInputCidFragment.buttonNext != null) {
            Button button = this.buttonNext;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
            }
            button.setOnClickListener(new C6111xcb936ea2(this));
        }
        if (touchPointInputCidFragment.ivpNationalIdNumber != null) {
            CommonInputViewGroup commonInputViewGroup = this.ivpNationalIdNumber;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivpNationalIdNumber");
            }
            commonInputViewGroup.mEditText.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
            commonInputViewGroup.mEditText.setLongClickable(false);
            commonInputViewGroup.mEditText.setTextIsSelectable(false);
            CustomEditText customEditText = commonInputViewGroup.mEditText;
            onGetStartedClick.IconCompatParcelizer((Object) customEditText, "editText");
            customEditText.setInputType(2);
            CustomEditText customEditText2 = commonInputViewGroup.mEditText;
            onGetStartedClick.IconCompatParcelizer((Object) customEditText2, "editText");
            customEditText2.setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
            FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup.mEditText, "X XXXX XXXXX XX X", new IconCompatParcelizer(this));
            fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read = new TouchPointInputCidFragment$MediaBrowserCompat$ItemReceiver(commonInputViewGroup, this);
            fragmentBuilder_BindEasycashFeaturesCardInformationFragment.write = true;
            TextWatcher textWatcher = fragmentBuilder_BindEasycashFeaturesCardInformationFragment;
            commonInputViewGroup.mEditText.addTextChangedListener(textWatcher);
            commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
            commonInputViewGroup.setOnEditorActionListener(new write(this));
            commonInputViewGroup.requestFocus();
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C4241dE dEVar = this.presenter;
        if (dEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dEVar.onDestroy();
    }

    public final void onDestroy() {
        C4241dE dEVar = this.presenter;
        if (dEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dEVar.onDestroy();
        super.onDestroy();
    }

    static final class IconCompatParcelizer implements FragmentBuilder_BindEasycashFeaturesCardInformationFragment.read {
        private /* synthetic */ TouchPointInputCidFragment read;

        IconCompatParcelizer(TouchPointInputCidFragment touchPointInputCidFragment) {
            this.read = touchPointInputCidFragment;
        }

        public final String MediaBrowserCompat$ItemReceiver(String str) {
            if (this.read.presenter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) str, "input");
            onGetStartedClick.write((Object) str, "input");
            String read2 = removeIfFromRandomAccessList.read(str, "[^0-9]", "X XXXX XXXXX XX X");
            onGetStartedClick.IconCompatParcelizer((Object) read2, "formatCitizenCase.formatString(input)");
            return read2;
        }
    }

    static final class write implements TextView.OnEditorActionListener {
        private /* synthetic */ TouchPointInputCidFragment read;

        write(TouchPointInputCidFragment touchPointInputCidFragment) {
            this.read = touchPointInputCidFragment;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            this.read.PlaybackStateCompat$CustomAction();
            ViewGroup viewGroup = this.read.root;
            if (viewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("root");
            }
            viewGroup.setFocusable(true);
            ViewGroup viewGroup2 = this.read.root;
            if (viewGroup2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("root");
            }
            viewGroup2.setFocusableInTouchMode(true);
            ViewGroup viewGroup3 = this.read.root;
            if (viewGroup3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("root");
            }
            viewGroup3.requestFocus();
            return true;
        }
    }

    public final void read(boolean z) {
        if (z) {
            CommonInputViewGroup commonInputViewGroup = this.ivpNationalIdNumber;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivpNationalIdNumber");
            }
            commonInputViewGroup.MediaBrowserCompat$ItemReceiver();
            return;
        }
        CommonInputViewGroup commonInputViewGroup2 = this.ivpNationalIdNumber;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivpNationalIdNumber");
        }
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (this.buttonNext != null) {
            Button button = this.buttonNext;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
            }
            button.setEnabled(z);
        }
    }

    public final void write() {
        CommonInputViewGroup commonInputViewGroup = this.ivpNationalIdNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivpNationalIdNumber");
        }
        commonInputViewGroup.mEditText.setText("");
    }

    public final void read(setFilename setfilename, boolean z) {
        onGetStartedClick.write((Object) setfilename, "display");
        if (z) {
            setfilename.write = new FragmentBuilder_BindCreditCardDisplayFragment();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent MediaBrowserCompat$ItemReceiver = ReviewInfoResultActivity.MediaBrowserCompat$ItemReceiver(activity, setfilename);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                activity.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(C10839getFilename getfilename) {
        onGetStartedClick.write((Object) getfilename, "touchPointCidInputDisplay");
        TouchPointPinActivity.IconCompatParcelizer iconCompatParcelizer = TouchPointPinActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) getfilename, "display");
        Intent putExtra = new Intent(requireContext, TouchPointPinActivity.class).putExtra("EXTRA_INFO_DISPLAY", getfilename);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, TouchPoi…RA_INFO_DISPLAY, display)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

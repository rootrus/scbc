package com.scb.phone.view.fragment.ntb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.akexorcist.localizationactivity.LocalizationActivity;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.activity.hml.HmlNTBApplyLoanEntryActivity;
import com.scb.phone.view.activity.hml.HmlNTBApplyLoanEntryActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.adapter.ntb.UserProfileImageSelectionAdapter;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p040o.C6498x19dfc59c;
import p040o.Category;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PhenotypeFlag;
import p040o.RttiJsonBill_MembersInjector;
import p040o.ShadowDetector;
import p040o.access$lambda$0;
import p040o.discardOldLogFiles$MediaBrowserCompat$ItemReceiver;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.rowMap;
import p040o.setTapText;
import p059me.relex.circleindicator.CircleIndicator;

public class NtbUserInfoFragment extends BaseFragment implements KtaJsonCheck.C69271.IconCompatParcelizer, ViewPager.MediaMetadataCompat {
    private static final Map<String, Integer> IconCompatParcelizer;
    private UserProfileImageSelectionAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private TextWatcher MediaBrowserCompat$MediaItem = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (NtbUserInfoFragment.this.mPresenter != null) {
                NtbUserInfoFragment.this.mPresenter.read(editable.toString());
            }
        }
    };
    private TextWatcher MediaBrowserCompat$SearchResultReceiver = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            if (NtbUserInfoFragment.this.mPresenter != null) {
                String obj = editable.toString();
                PhenotypeFlag.zza zza = NtbUserInfoFragment.this.mPresenter.MediaSessionCompat$Token;
                String trim = obj != null ? obj.trim() : obj;
                if (trim == null) {
                    z = false;
                } else {
                    z = zza.IconCompatParcelizer.matcher(trim).matches();
                }
                if (z) {
                    NtbUserInfoFragment.this.mPresenter.MediaBrowserCompat$ItemReceiver(obj);
                } else {
                    NtbUserInfoFragment.this.read();
                }
            }
        }
    };
    /* access modifiers changed from: private */
    public InputFilter[] MediaDescriptionCompat;
    private TextWatcher RatingCompat = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            NtbUserInfoFragment.this.mMobileNumberInput.mEditText.removeTextChangedListener(this);
            String replaceAll = editable.toString().replaceAll("-", "");
            if (NtbUserInfoFragment.this.mPresenter != null && editable.length() == 10 && !editable.toString().equalsIgnoreCase(NtbUserInfoFragment.this.mPresenter.MediaBrowserCompat$MediaItem)) {
                NtbUserInfoFragment.this.mPresenter.MediaBrowserCompat$CustomActionResultReceiver(replaceAll);
            } else if (NtbUserInfoFragment.this.mPresenter != null && !replaceAll.equalsIgnoreCase(NtbUserInfoFragment.this.mPresenter.MediaBrowserCompat$MediaItem)) {
                Category category = NtbUserInfoFragment.this.mPresenter;
                category.MediaBrowserCompat$MediaItem = null;
                category.MediaBrowserCompat$ItemReceiver = false;
                NtbUserInfoFragment.this.read();
                NtbUserInfoFragment.this.mMobileNumberInput.mEditText.setFilters(NtbUserInfoFragment.this.MediaDescriptionCompat);
                NtbUserInfoFragment.this.mMobileNumberInput.mEditText.setText(replaceAll);
                NtbUserInfoFragment.this.mMobileNumberInput.mEditText.setSelection(NtbUserInfoFragment.this.mMobileNumberInput.mEditText.getText().length());
            }
            NtbUserInfoFragment.this.mMobileNumberInput.mEditText.addTextChangedListener(this);
        }
    };
    @BindView
    protected Button mBtnAction;
    @BindView
    protected CommonInputViewGroup mEmailInput;
    @BindView
    protected CircleIndicator mIndicator;
    @BindView
    protected CommonInputViewGroup mMobileNumberInput;
    @BindView
    protected CommonInputViewGroup mNameInput;
    @BindView
    protected ImageView mNtbUserInfoLeftImageView;
    @BindView
    protected ImageView mNtbUserInfoRightImageView;
    @HmlPinActivity
    public Category mPresenter;
    @HmlPinActivity
    public SharedPreferences mSharedPreferences;
    @BindView
    protected ViewPager mViewPager;

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        IconCompatParcelizer = linkedHashMap;
        linkedHashMap.put("M", Integer.valueOf(R.drawable.ic_ntb_avatar_man));
        IconCompatParcelizer.put("F", Integer.valueOf(R.drawable.ic_ntb_avatar_woman));
    }

    public static Map<String, Integer> MediaSessionCompat$Token() {
        return IconCompatParcelizer;
    }

    public static NtbUserInfoFragment MediaBrowserCompat$CustomActionResultReceiver(RttiJsonBill_MembersInjector.read.IconCompatParcelizer iconCompatParcelizer) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("WELCOME_ABOARD_BUTTON_TYPE", iconCompatParcelizer);
        NtbUserInfoFragment ntbUserInfoFragment = new NtbUserInfoFragment();
        ntbUserInfoFragment.setArguments(bundle);
        return ntbUserInfoFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Category category = this.mPresenter;
        if (category != null) {
            category.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88712131494098, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        UserProfileImageSelectionAdapter userProfileImageSelectionAdapter = new UserProfileImageSelectionAdapter(IconCompatParcelizer);
        this.MediaBrowserCompat$CustomActionResultReceiver = userProfileImageSelectionAdapter;
        this.mViewPager.setAdapter(userProfileImageSelectionAdapter);
        this.mViewPager.addOnPageChangeListener(this);
        this.mIndicator.setViewPager(this.mViewPager);
        CommonInputViewGroup commonInputViewGroup = this.mNameInput;
        TextWatcher textWatcher = this.MediaBrowserCompat$MediaItem;
        commonInputViewGroup.mEditText.addTextChangedListener(textWatcher);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
        this.mNameInput.mEditText.setOnFocusChangeListener(new read(this, (byte) 0));
        CommonInputViewGroup commonInputViewGroup2 = this.mEmailInput;
        TextWatcher textWatcher2 = this.MediaBrowserCompat$SearchResultReceiver;
        commonInputViewGroup2.mEditText.addTextChangedListener(textWatcher2);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher2);
        this.mEmailInput.mEditText.setOnEditorActionListener(new C6098x23382bb2(this, (byte) 0));
        this.mEmailInput.mEditText.setOnFocusChangeListener(new IconCompatParcelizer(this, (byte) 0));
        CommonInputViewGroup commonInputViewGroup3 = this.mMobileNumberInput;
        TextWatcher textWatcher3 = this.RatingCompat;
        commonInputViewGroup3.mEditText.addTextChangedListener(textWatcher3);
        commonInputViewGroup3.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher3);
        this.mMobileNumberInput.mEditText.setOnEditorActionListener(new write(this, (byte) 0));
        this.mMobileNumberInput.mEditText.setOnFocusChangeListener(new NtbUserInfoFragment$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
        this.mMobileNumberInput.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789-"));
        this.MediaDescriptionCompat = this.mMobileNumberInput.mEditText.getFilters();
    }

    public final void MediaSessionCompat$QueueItem() {
        this.mNameInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo38821x50fd9e4a() {
        this.mNameInput.setErrorText(getString(R.string.incomplete_information));
        this.mNameInput.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.mNameInput.setErrorText(getString(R.string.invalid_name_format));
        this.mNameInput.MediaBrowserCompat$ItemReceiver();
    }

    public final void RatingCompat() {
        this.mEmailInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void write() {
        this.mEmailInput.setErrorText(getString(R.string.incomplete_information));
        this.mEmailInput.MediaBrowserCompat$ItemReceiver();
    }

    public final void IconCompatParcelizer() {
        this.mEmailInput.setErrorText(getString(R.string.invalid_format_please_try_again));
        this.mEmailInput.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$MediaItem() {
        CustomEditText customEditText = this.mMobileNumberInput.mEditText;
        customEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.mMobileNumberInput.MediaBrowserCompat$ItemReceiver + 2)});
        customEditText.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver("MOB", customEditText.getText().toString()));
        customEditText.setSelection(customEditText.getText().length());
        this.mMobileNumberInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.mMobileNumberInput.setErrorText(getString(R.string.incomplete_information));
        this.mMobileNumberInput.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaMetadataCompat() {
        this.mMobileNumberInput.setErrorText(getString(R.string.invalid_format_please_try_again));
        this.mMobileNumberInput.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaDescriptionCompat() {
        this.mPresenter.write((int) R.string.error_generic_resource);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mBtnAction.setEnabled(true);
    }

    public final void read() {
        this.mBtnAction.setEnabled(false);
    }

    public void MediaBrowserCompat$ItemReceiver(List<access$lambda$0> list) {
        Intent putParcelableArrayListExtra = new Intent(getContext(), NTBLandingActivity.class).putParcelableArrayListExtra("INTRODUCTION_LIST", new ArrayList(list));
        putParcelableArrayListExtra.setFlags(268468224);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putParcelableArrayListExtra = setTapText.write(activity, putParcelableArrayListExtra).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putParcelableArrayListExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(putParcelableArrayListExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        WeakReference<BaseActivity> weakReference = new WeakReference<>((BaseActivity) getActivity());
        C6498x19dfc59c fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver = new C6498x19dfc59c((byte) 0);
        fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.write = weakReference;
        fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = discardoldlogfiles_mediabrowsercompat_itemreceiver;
        FragmentBuilder_BindDepositMoreInfoFragment.read(fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBApplyLoanEntryActivity$MediaBrowserCompat$ItemReceiver hmlNTBApplyLoanEntryActivity$MediaBrowserCompat$ItemReceiver = HmlNTBApplyLoanEntryActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = getContext();
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBApplyLoanEntryActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onClickPrevNavigation() {
        if (this.mViewPager != null) {
            int i = 0;
            this.mNtbUserInfoRightImageView.setVisibility(0);
            if (this.mViewPager.getCurrentItem() > 1) {
                i = this.mViewPager.getCurrentItem() - 1;
            }
            if (i == 0) {
                this.mNtbUserInfoLeftImageView.setVisibility(4);
            }
            this.mViewPager.setCurrentItem(i);
        }
    }

    @OnClick
    public void onClickNextNavigation() {
        if (this.mViewPager != null) {
            this.mNtbUserInfoLeftImageView.setVisibility(0);
            int count = this.mViewPager.getAdapter().getCount() - 1;
            int currentItem = this.mViewPager.getCurrentItem() < count ? this.mViewPager.getCurrentItem() + 1 : count;
            if (currentItem == count) {
                this.mNtbUserInfoRightImageView.setVisibility(4);
            }
            this.mViewPager.setCurrentItem(currentItem);
        }
    }

    @OnClick
    public void onClickSubmit() {
        String str;
        UserProfileImageSelectionAdapter userProfileImageSelectionAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int currentItem = this.mViewPager.getCurrentItem();
        List<String> list = userProfileImageSelectionAdapter.MediaBrowserCompat$CustomActionResultReceiver;
        if (list == null) {
            str = null;
        } else {
            str = list.get(currentItem);
        }
        String str2 = str;
        String string = this.mSharedPreferences.getString("randomDeviceId", "");
        String D_ = ((LocalizationActivity) getActivity()).mo3026D_();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("WELCOME_ABOARD_BUTTON_TYPE")) {
            Category category = this.mPresenter;
            RttiJsonBill_MembersInjector.read.IconCompatParcelizer iconCompatParcelizer = (RttiJsonBill_MembersInjector.read.IconCompatParcelizer) arguments.getSerializable("WELCOME_ABOARD_BUTTON_TYPE");
            boolean z = true;
            if (!(category.read && category.MediaMetadataCompat && category.MediaBrowserCompat$ItemReceiver)) {
                return;
            }
            if (!category.IconCompatParcelizer) {
                ShadowDetector shadowDetector = ShadowDetector.MediaBrowserCompat$CustomActionResultReceiver;
                if (category.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    shadowDetector.IconCompatParcelizer(category.RatingCompat);
                }
                category.ParcelableVolumeInfo = iconCompatParcelizer;
                rowMap rowmap = new rowMap(string, category.MediaSessionCompat$ResultReceiverWrapper.trim(), category.MediaDescriptionCompat, category.MediaBrowserCompat$MediaItem, D_, str2);
                category.f2686x50fd9e4a = rowmap;
                category.MediaSessionCompat$QueueItem.IconCompatParcelizer(rowmap);
                category.MediaSessionCompat$QueueItem.IconCompatParcelizer(new Category.read());
                return;
            }
            category.IconCompatParcelizer();
        }
    }

    public void onPageSelected(int i) {
        int count = this.mViewPager.getAdapter().getCount();
        this.mNtbUserInfoRightImageView.setVisibility(0);
        this.mNtbUserInfoLeftImageView.setVisibility(0);
        if (i == count - 1) {
            this.mNtbUserInfoRightImageView.setVisibility(4);
        }
        if (i == 0) {
            this.mNtbUserInfoLeftImageView.setVisibility(4);
        }
    }

    class read implements View.OnFocusChangeListener {
        private read() {
        }

        /* synthetic */ read(NtbUserInfoFragment ntbUserInfoFragment, byte b) {
            this();
        }

        public final void onFocusChange(View view, boolean z) {
            EditText editText = (EditText) view;
            if (!z) {
                NtbUserInfoFragment.this.mPresenter.read(editText.getText().toString());
            }
        }
    }

    class IconCompatParcelizer implements View.OnFocusChangeListener {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(NtbUserInfoFragment ntbUserInfoFragment, byte b) {
            this();
        }

        public final void onFocusChange(View view, boolean z) {
            EditText editText = (EditText) view;
            if (!z) {
                NtbUserInfoFragment.this.mPresenter.MediaBrowserCompat$ItemReceiver(editText.getText().toString());
            }
        }
    }

    class write implements TextView.OnEditorActionListener {
        private write() {
        }

        /* synthetic */ write(NtbUserInfoFragment ntbUserInfoFragment, byte b) {
            this();
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            NtbUserInfoFragment.this.mMobileNumberInput.clearFocus();
            NtbUserInfoFragment.this.PlaybackStateCompat$CustomAction();
            return true;
        }
    }
}

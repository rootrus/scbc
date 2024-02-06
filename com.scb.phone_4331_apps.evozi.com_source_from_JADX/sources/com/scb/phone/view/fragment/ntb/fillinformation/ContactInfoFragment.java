package com.scb.phone.view.fragment.ntb.fillinformation;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.ntb.address.HomeAddressFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_ContributeHmlExternalInstructionActivity;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C10893cY$MediaBrowserCompat$ItemReceiver;
import p040o.C4162cY;
import p040o.C6487x1afa2331;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.KtaJsonCheck$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.blend;
import p040o.columnMap;
import p040o.containsRow;
import p040o.getICheckDeserializerRtti;

public class ContactInfoFragment extends BaseFragment implements KtaJsonCheck$MediaBrowserCompat$CustomActionResultReceiver {
    public FragmentBuilder_BindChangeChannelStatementReviewFragment.write IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private C6487x1afa2331 MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public InputFilter[] MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private blend f3095x50fd9e4a = new blend();
    private KtaJsonCheck.MediaDescriptionCompat MediaDescriptionCompat;
    private TextWatcher MediaMetadataCompat = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            ContactInfoFragment.this.customMobile.mEditText.removeTextChangedListener(this);
            String obj = editable.toString();
            if (obj != null && !obj.equals("")) {
                obj = obj.replace("-", "");
            }
            if (ContactInfoFragment.this.contactInformationPresenter != null && editable.length() == 10 && !editable.toString().equalsIgnoreCase(ContactInfoFragment.this.contactInformationPresenter.MediaBrowserCompat$SearchResultReceiver)) {
                ContactInfoFragment.this.contactInformationPresenter.write(obj);
            } else if (ContactInfoFragment.this.contactInformationPresenter != null && !obj.equalsIgnoreCase(ContactInfoFragment.this.contactInformationPresenter.MediaBrowserCompat$SearchResultReceiver)) {
                ContactInfoFragment.this.contactInformationPresenter.write("");
                ContactInfoFragment.this.customMobile.mEditText.setFilters(ContactInfoFragment.this.MediaBrowserCompat$SearchResultReceiver);
                ContactInfoFragment.this.customMobile.mEditText.setText(obj);
                ContactInfoFragment.this.customMobile.mEditText.setSelection(ContactInfoFragment.this.customMobile.mEditText.getText().length());
            }
            ContactInfoFragment.this.customMobile.mEditText.addTextChangedListener(this);
        }
    };
    private TextWatcher RatingCompat = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (ContactInfoFragment.this.contactInformationPresenter != null) {
                ContactInfoFragment.this.contactInformationPresenter.read(editable.toString());
            }
        }
    };
    @BindView
    Button buttonNext;
    @BindView
    public CheckBox checkBoxSameAddress;
    @HmlPinActivity
    public C4162cY contactInformationPresenter;
    @BindView
    public CommonInputViewGroup customEmail;
    @BindView
    public CommonInputViewGroup customMobile;
    @BindView
    ImageView imageArrowCurrent;
    @BindView
    RelativeLayout layoutCurrentAddress;
    @BindView
    RelativeLayout layoutHomeAddress;
    @BindView
    TextView textCurrentAddress;
    @BindView
    TextView textHomeAddress;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) {
            this.IconCompatParcelizer = (FragmentBuilder_BindChangeChannelStatementReviewFragment.write) context;
            this.MediaBrowserCompat$MediaItem = (C6487x1afa2331) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaDescriptionCompat = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87442131493971, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.contactInformationPresenter.MediaBrowserCompat$ItemReceiver(this);
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaDescriptionCompat;
        if (mediaDescriptionCompat != null) {
            blend blend = this.f3095x50fd9e4a;
            String read = mediaDescriptionCompat.read();
            String write2 = this.contactInformationPresenter.IconCompatParcelizer.write();
            blend.read("source", read);
            if (write2 != null && "touchpoint".equals(read)) {
                blend.read("customer_group", write2);
            }
        }
        blend blend2 = this.f3095x50fd9e4a;
        if (getActivity() != null) {
            blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_contactinformation");
        }
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CommonInputViewGroup commonInputViewGroup = this.customEmail;
        TextWatcher textWatcher = this.RatingCompat;
        commonInputViewGroup.mEditText.addTextChangedListener(textWatcher);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
        this.customEmail.mEditText.setOnEditorActionListener(new IconCompatParcelizer(this, (byte) 0));
        this.customEmail.mEditText.setOnFocusChangeListener(new ContactInfoFragment$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
        this.customMobile.mEditText.setOnEditorActionListener(new C6103xab81614b(this, (byte) 0));
        this.customMobile.mEditText.setOnFocusChangeListener(new write(this, (byte) 0));
        this.customMobile.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789-"));
        CommonInputViewGroup commonInputViewGroup2 = this.customMobile;
        TextWatcher textWatcher2 = this.MediaMetadataCompat;
        commonInputViewGroup2.mEditText.addTextChangedListener(textWatcher2);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher2);
        this.MediaBrowserCompat$SearchResultReceiver = this.customMobile.mEditText.getFilters();
        this.contactInformationPresenter.read();
    }

    public void onResume() {
        super.onResume();
        FragmentBuilder_BindChangeChannelStatementReviewFragment.write write2 = this.IconCompatParcelizer;
        if (write2 != null) {
            write2.write(getString(R.string.ntb_fillinformation_contact_info_page));
        }
    }

    public void onDetach() {
        super.onDetach();
        C6487x1afa2331 fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem;
        if (fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver != null) {
            fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver.setItemInvoker();
        }
    }

    public final void read(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, String str4, boolean z, String str5) {
        String str6;
        this.customEmail.setText(str);
        CommonInputViewGroup commonInputViewGroup = this.customMobile;
        if (str2 == null || str2.equals("")) {
            str6 = str2;
        } else {
            str6 = str2.replace("-", "");
        }
        commonInputViewGroup.setText(str6);
        this.contactInformationPresenter.read(str);
        C4162cY cYVar = this.contactInformationPresenter;
        if (str2 != null && !str2.equals("")) {
            str2 = str2.replace("-", "");
        }
        cYVar.write(str2);
        this.textHomeAddress.setText(str3);
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        if (z) {
            this.textCurrentAddress.setText("");
            this.textCurrentAddress.setHint("");
            this.layoutCurrentAddress.setEnabled(false);
            this.checkBoxSameAddress.setChecked(true);
        } else {
            if (TextUtils.isEmpty(str4)) {
                this.textCurrentAddress.setText((CharSequence) null);
                this.textCurrentAddress.setHint(getString(R.string.ntb_fillinformation_contact_info_current_address_hint));
            } else {
                this.textCurrentAddress.setText(str4);
            }
            this.layoutCurrentAddress.setEnabled(true);
            this.checkBoxSameAddress.setChecked(false);
        }
        if (!(str3 == null || str3.length() == 0)) {
            this.layoutCurrentAddress.setOnClickListener(new ActivityBuilder_ContributeHmlExternalInstructionActivity(this));
            this.checkBoxSameAddress.setEnabled(true);
        } else {
            this.checkBoxSameAddress.setEnabled(false);
        }
        if (str5 != null && !C4162cY.MediaBrowserCompat$CustomActionResultReceiver(str5).booleanValue()) {
            this.layoutHomeAddress.setEnabled(false);
            this.imageArrowCurrent.setVisibility(8);
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        if ((getActivity() instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) && this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.write((Fragment) new OccupationInfoFragment());
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        boolean z2 = !z;
        this.customMobile.setEnabled(z2);
        this.customMobile.setClickable(z2);
    }

    @OnClick
    public void onNextButtonClick() {
        C4162cY cYVar = this.contactInformationPresenter;
        String obj = this.customEmail.mEditText.getText().toString();
        String obj2 = this.customMobile.mEditText.getText().toString();
        String str = this.checkBoxSameAddress.isChecked() ? DiskLruCache.VERSION_1 : "0";
        columnMap write2 = columnMap.write();
        write2.read = obj;
        if (obj2 != null && !obj2.equals("")) {
            obj2 = obj2.replace("-", "");
        }
        write2.write = obj2;
        containsRow IconCompatParcelizer2 = containsRow.IconCompatParcelizer();
        IconCompatParcelizer2.IconCompatParcelizer = write2;
        IconCompatParcelizer2.RatingCompat = str;
        if (cYVar.RatingCompat != null) {
            cYVar.RatingCompat.AlertController$RecycleListView();
        }
        cYVar.write.read(IconCompatParcelizer2);
        cYVar.write.IconCompatParcelizer(new C10893cY$MediaBrowserCompat$ItemReceiver(cYVar));
    }

    @OnClick
    public void onHomeAddressClick() {
        if ((getActivity() instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) && this.IconCompatParcelizer != null) {
            HomeAddressFragment homeAddressFragment = new HomeAddressFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("BUNDLE_ADDRESS_TYPE", 0);
            homeAddressFragment.setArguments(bundle);
            homeAddressFragment.setTargetFragment(this, 1);
            this.IconCompatParcelizer.write((Fragment) homeAddressFragment);
        }
    }

    @OnCheckedChanged
    public void onSameAddressCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            this.layoutCurrentAddress.setEnabled(false);
            this.textCurrentAddress.setText("");
            this.textCurrentAddress.setHint("");
        } else {
            this.layoutCurrentAddress.setEnabled(true);
            this.textCurrentAddress.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.textCurrentAddress.setHint(getString(R.string.ntb_fillinformation_contact_info_current_address_hint));
        }
        C4162cY cYVar = this.contactInformationPresenter;
        AutoValue_CrashlyticsReport_CustomAttribute.Builder builder = cYVar.MediaMetadataCompat;
        if (builder != null) {
            builder.ParcelableVolumeInfo = z;
        }
        cYVar.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaDescriptionCompat() {
        CustomEditText customEditText = this.customMobile.mEditText;
        customEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.customMobile.MediaBrowserCompat$ItemReceiver + 2)});
        customEditText.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver("MOB", customEditText.getText().toString()));
        customEditText.setSelection(customEditText.getText().length());
        this.customMobile.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void write() {
        this.customEmail.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.customEmail.setErrorText(getString(R.string.ntb_fillinformation_contact_info_email_error));
        this.customEmail.MediaBrowserCompat$ItemReceiver();
    }

    public final void read() {
        this.customEmail.setErrorText(getString(R.string.ntb_fillinformation_contact_info_email_error));
        this.customEmail.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.customMobile.setErrorText(getString(R.string.ntb_fillinformation_contact_info_phone_error));
        this.customMobile.MediaBrowserCompat$ItemReceiver();
    }

    public final void IconCompatParcelizer() {
        this.customMobile.setErrorText(getString(R.string.ntb_fillinformation_contact_info_phone_error));
        this.customMobile.MediaBrowserCompat$ItemReceiver();
    }

    class IconCompatParcelizer implements TextView.OnEditorActionListener {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(ContactInfoFragment contactInfoFragment, byte b) {
            this();
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            ContactInfoFragment.this.customEmail.clearFocus();
            return true;
        }
    }

    class write implements View.OnFocusChangeListener {
        private write() {
        }

        /* synthetic */ write(ContactInfoFragment contactInfoFragment, byte b) {
            this();
        }

        public final void onFocusChange(View view, boolean z) {
            EditText editText = (EditText) view;
            if (!z) {
                C4162cY cYVar = ContactInfoFragment.this.contactInformationPresenter;
                String obj = editText.getText().toString();
                if (obj != null && !obj.equals("")) {
                    obj = obj.replace("-", "");
                }
                cYVar.write(obj);
            }
        }
    }
}

package com.scb.phone.view.fragment.ntb.fillinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.fillinformation.OccupationSearchActivity;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.ntb.address.WorkAddressFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlExternalAuthenticationActivity;
import p040o.ActivityBuilder_ContributeHmlHomeAddressActivity;
import p040o.C4143cB;
import p040o.C4155cO;
import p040o.C4156cQ;
import p040o.C4192cj;
import p040o.C6487x1afa2331;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.GenericMapMaker;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.MoreExecutors;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blend;
import p040o.cj$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.containsRow;
import p040o.getOrgId;
import p040o.makeComputingMap;
import p040o.setTapText;

public class OccupationInfoFragment extends BaseFragment implements KtaJsonCheck.IconCompatParcelizer {
    private TextWatcher IconCompatParcelizer = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (OccupationInfoFragment.this.occupationInformationPresenter != null) {
                C4192cj cjVar = OccupationInfoFragment.this.occupationInformationPresenter;
                String obj = OccupationInfoFragment.this.textCompanyName.mEditText.getText().toString();
                cjVar.MediaBrowserCompat$ItemReceiver = obj;
                boolean z = true;
                if (!TextUtils.isEmpty(obj)) {
                    if (cjVar.MediaBrowserCompat$ItemReceiver.length() < 2 || cjVar.MediaBrowserCompat$ItemReceiver.length() > 29) {
                        C4155cO cOVar = C4155cO.IconCompatParcelizer;
                        if (cjVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            cOVar.IconCompatParcelizer(cjVar.RatingCompat);
                        }
                        cjVar.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                }
                C4156cQ cQVar = C4156cQ.IconCompatParcelizer;
                if (cjVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    cQVar.IconCompatParcelizer(cjVar.RatingCompat);
                }
                cjVar.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    };
    public blend MediaBrowserCompat$CustomActionResultReceiver = new blend();
    private KtaJsonCheck.MediaDescriptionCompat MediaBrowserCompat$SearchResultReceiver;
    private C6487x1afa2331 MediaDescriptionCompat;
    private FragmentBuilder_BindChangeChannelStatementReviewFragment.write MediaMetadataCompat;
    @BindView
    Button buttonNext;
    @BindView
    CheckBox currentWorkAddressCheckbox;
    @BindView
    RelativeLayout layoutWorkAddress;
    @HmlPinActivity
    public C4192cj occupationInformationPresenter;
    @BindView
    public Spinner spinnerSourceOfIncome;
    @BindView
    public CommonInputViewGroup textCompanyName;
    @BindView
    TextView textJob;
    @BindView
    TextView textWorkAddress;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) {
            this.MediaMetadataCompat = (FragmentBuilder_BindChangeChannelStatementReviewFragment.write) context;
            this.MediaDescriptionCompat = (C6487x1afa2331) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaBrowserCompat$SearchResultReceiver = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87452131493972, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.occupationInformationPresenter.MediaBrowserCompat$ItemReceiver(this);
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$SearchResultReceiver;
        if (mediaDescriptionCompat != null) {
            blend blend = this.MediaBrowserCompat$CustomActionResultReceiver;
            String read = mediaDescriptionCompat.read();
            String write = this.occupationInformationPresenter.IconCompatParcelizer.write();
            blend.read("source", read);
            if (write != null && "touchpoint".equals(read)) {
                blend.read("customer_group", write);
            }
        }
        blend blend2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_occupation");
        }
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        CommonInputViewGroup commonInputViewGroup = this.textCompanyName;
        TextWatcher textWatcher = this.IconCompatParcelizer;
        commonInputViewGroup.mEditText.addTextChangedListener(textWatcher);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher);
        this.occupationInformationPresenter.MediaBrowserCompat$ItemReceiver();
    }

    public void onResume() {
        super.onResume();
        FragmentBuilder_BindChangeChannelStatementReviewFragment.write write = this.MediaMetadataCompat;
        if (write != null) {
            write.write(getString(R.string.ntb_fillinformation_occupation_info_page));
        }
    }

    public void onDetach() {
        super.onDetach();
        C6487x1afa2331 fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver != null) {
            fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver.setItemInvoker();
        }
    }

    public final void write(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void IconCompatParcelizer() {
        this.textCompanyName.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void read() {
        this.textCompanyName.setErrorText(getString(R.string.ntb_fillinformation_occupation_info_company_name_error));
        this.textCompanyName.MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            this.currentWorkAddressCheckbox.setVisibility(0);
            return;
        }
        this.currentWorkAddressCheckbox.setVisibility(8);
        this.currentWorkAddressCheckbox.setChecked(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, String str) {
        this.layoutWorkAddress.setEnabled(z);
        this.layoutWorkAddress.setClickable(z);
        this.textWorkAddress.setText(str);
        this.textWorkAddress.setHint(z ? getString(R.string.ntb_fillinformation_contact_info_current_address_hint) : "");
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        this.textJob.setText(str);
        this.textCompanyName.setText(str2);
        this.textWorkAddress.setText(str3);
        this.spinnerSourceOfIncome.setOnTouchListener(new ActivityBuilder_ContributeHmlExternalAuthenticationActivity(this));
        this.currentWorkAddressCheckbox.setOnCheckedChangeListener(new ActivityBuilder_ContributeHmlHomeAddressActivity(this));
    }

    public final void IconCompatParcelizer(String str) {
        this.textJob.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<MoreExecutors> list) {
        String str;
        C4192cj cjVar = this.occupationInformationPresenter;
        getOrgId getorgid = cjVar.ParcelableVolumeInfo;
        if (getorgid == null || getorgid.IconCompatParcelizer == null) {
            str = "TH";
        } else {
            str = cjVar.ParcelableVolumeInfo.IconCompatParcelizer;
        }
        int i = cjVar.MediaSessionCompat$QueueItem;
        if (i < 0) {
            i = 0;
            if (list != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= list.size()) {
                        break;
                    } else if (str.equalsIgnoreCase(list.get(i2).MediaBrowserCompat$ItemReceiver)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            cjVar.MediaSessionCompat$QueueItem = i;
        }
        this.spinnerSourceOfIncome.setAdapter(new ArrayAdapter(getContext(), R.layout.f84812131493708, list));
        this.spinnerSourceOfIncome.setSelection(i);
        this.occupationInformationPresenter.MediaBrowserCompat$ItemReceiver(i);
        this.spinnerSourceOfIncome.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                OccupationInfoFragment.this.occupationInformationPresenter.MediaBrowserCompat$ItemReceiver(i);
            }
        });
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if ((getActivity() instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) && this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat.write((Fragment) new ReviewInfoFragment());
        }
    }

    @OnClick
    public void onNextButtonClick(View view) {
        String str;
        C4192cj cjVar = this.occupationInformationPresenter;
        String obj = this.textCompanyName.mEditText.getText().toString();
        GenericMapMaker MediaBrowserCompat$ItemReceiver = GenericMapMaker.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = cjVar.MediaBrowserCompat$SearchResultReceiver;
        String str2 = "";
        MediaBrowserCompat$ItemReceiver.write = cjVar.MediaDescriptionCompat.replaceAll("(^\\h*)|(\\h*$)", str2);
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = cjVar.MediaMetadataCompat;
        MoreExecutors moreExecutors = cjVar.f2807x50fd9e4a.get(cjVar.MediaSessionCompat$QueueItem);
        if (moreExecutors != null) {
            String str3 = moreExecutors.MediaBrowserCompat$ItemReceiver;
            str = moreExecutors.IconCompatParcelizer.replaceAll("(^\\h*)|(\\h*$)", str2);
            str2 = str3;
        } else {
            str = str2;
        }
        makeComputingMap write = makeComputingMap.write();
        write.write = str2;
        write.IconCompatParcelizer = str;
        containsRow IconCompatParcelizer2 = containsRow.IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$MediaItem = MediaBrowserCompat$ItemReceiver;
        IconCompatParcelizer2.MediaSessionCompat$ResultReceiverWrapper = write;
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = obj;
        IconCompatParcelizer2.MediaSessionCompat$Token = cjVar.MediaSessionCompat$Token;
        if (cjVar.RatingCompat != null) {
            cjVar.RatingCompat.AlertController$RecycleListView();
        }
        cjVar.read.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2);
        cjVar.read.IconCompatParcelizer(new cj$MediaBrowserCompat$CustomActionResultReceiver(cjVar));
    }

    @OnClick
    public void onJobLayoutClick() {
        Intent intent = new Intent(getContext(), OccupationSearchActivity.class);
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$SearchResultReceiver;
        if (mediaDescriptionCompat != null) {
            intent.putExtra("com.scb.phone.view.activity.ntb.fillinformation.OccupationSearchActivity.EXTRA_FIREBASE_SOURCE", mediaDescriptionCompat.read());
        }
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 10002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 10002 && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_CODE");
            String stringExtra2 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION");
            String stringExtra3 = intent.getStringExtra("EXTRA_RESULT_OCCUPATION_ISIC_CODE");
            C4192cj cjVar = this.occupationInformationPresenter;
            cjVar.MediaBrowserCompat$SearchResultReceiver = stringExtra;
            cjVar.MediaDescriptionCompat = stringExtra2;
            cjVar.MediaMetadataCompat = stringExtra3;
            C4143cB cBVar = new C4143cB(cjVar);
            if (cjVar.RatingCompat != null) {
                cBVar.IconCompatParcelizer(cjVar.RatingCompat);
            }
            cjVar.MediaBrowserCompat$CustomActionResultReceiver();
        }
        super.onActivityResult(i, i2, intent);
    }

    @OnClick
    public void onWorkLayoutClick() {
        if ((getActivity() instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) && this.MediaMetadataCompat != null) {
            WorkAddressFragment workAddressFragment = new WorkAddressFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("BUNDLE_ADDRESS_TYPE", 2);
            workAddressFragment.setArguments(bundle);
            workAddressFragment.setTargetFragment(this, 3);
            this.MediaMetadataCompat.write((Fragment) workAddressFragment);
        }
    }
}

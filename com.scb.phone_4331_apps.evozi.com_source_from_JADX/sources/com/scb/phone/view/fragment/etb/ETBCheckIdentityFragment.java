package com.scb.phone.view.fragment.etb;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.ntb.ekyc.NationalIdHelpActivity;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C4131c;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1900;
import p040o.blend;
import p040o.deleteSessionPartFilesFor;
import p040o.generateShader;
import p040o.generateShader$MediaBrowserCompat$ItemReceiver;
import p040o.passTo;
import p040o.recordWrite;
import p040o.setCvv$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;

public class ETBCheckIdentityFragment extends BaseEtbFragment implements setCvv$MediaBrowserCompat$CustomActionResultReceiver {
    private blend MediaBrowserCompat$CustomActionResultReceiver = new blend();
    @HmlPinActivity
    public generateShader etbCheckIdentityPresenter;
    @BindView
    protected EditText laserIdFirst;
    @BindView
    protected EditText laserIdSecond;
    @BindView
    protected EditText laserIdThird;
    @BindView
    protected Button nextButton;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public static ETBCheckIdentityFragment read(access$1900 access_1900, deleteSessionPartFilesFor deletesessionpartfilesfor) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT", access_1900);
        bundle.putParcelable("com.scb.phone.view.fragment.etb.ARG_PRODUCT", deletesessionpartfilesfor);
        ETBCheckIdentityFragment eTBCheckIdentityFragment = new ETBCheckIdentityFragment();
        eTBCheckIdentityFragment.setArguments(bundle);
        return eTBCheckIdentityFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87302131493957, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.etbCheckIdentityPresenter.MediaBrowserCompat$ItemReceiver(this);
        getActivity().getWindow().setSoftInputMode(32);
        this.laserIdFirst.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(3)});
        this.laserIdSecond.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(7)});
        this.laserIdThird.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(2)});
        this.laserIdFirst.addTextChangedListener(new write(3, this.laserIdSecond));
        this.laserIdSecond.addTextChangedListener(new write(7, this.laserIdThird));
        this.laserIdThird.addTextChangedListener(new write(2, this.nextButton));
        this.MediaBrowserCompat$CustomActionResultReceiver.read("etb");
        blend blend = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_nationalid");
        }
        return inflate;
    }

    @OnClick
    public void onHelpButtonClick() {
        generateShader generateshader = this.etbCheckIdentityPresenter;
        if (generateshader.MediaBrowserCompat$ItemReceiver) {
            boolean z = false;
            generateshader.MediaBrowserCompat$ItemReceiver = false;
            C4131c.C4141e eVar = C4131c.C4141e.MediaBrowserCompat$ItemReceiver;
            if (generateshader.RatingCompat != null) {
                z = true;
            }
            if (z) {
                eVar.IconCompatParcelizer(generateshader.RatingCompat);
            }
        }
    }

    @OnClick
    public void onNextButtonClick() {
        generateShader generateshader = this.etbCheckIdentityPresenter;
        if (generateshader.MediaBrowserCompat$ItemReceiver) {
            generateshader.MediaBrowserCompat$ItemReceiver = false;
            if (generateshader.RatingCompat != null) {
                generateshader.RatingCompat.AlertController$RecycleListView();
            }
            recordWrite recordwrite = new recordWrite();
            recordwrite.IconCompatParcelizer = generateshader.write.f2673x50fd9e4a;
            generateshader.IconCompatParcelizer.read(recordwrite);
            generateshader.IconCompatParcelizer.IconCompatParcelizer(new generateShader$MediaBrowserCompat$ItemReceiver(generateshader, (byte) 0));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.nextButton.setEnabled(z);
    }

    public void onResume() {
        super.onResume();
        this.etbCheckIdentityPresenter.MediaBrowserCompat$ItemReceiver = true;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        NationalIdHelpActivity.write(getActivity(), getString(R.string.laser_id_help_title));
    }

    public final void IconCompatParcelizer() {
        Bundle bundle = new Bundle();
        bundle.putInt("BUNDLE_FATCA_TYPE", 2);
        FatcaLandingQuestionFragment fatcaLandingQuestionFragment = new FatcaLandingQuestionFragment();
        fatcaLandingQuestionFragment.setArguments(bundle);
        this.MediaMetadataCompat.write(fatcaLandingQuestionFragment);
    }

    public final void write() {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.landing_page_tab);
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

    public final void read() {
        Bundle arguments = getArguments();
        this.MediaMetadataCompat.write(EtbPersonalInformationFragment.MediaBrowserCompat$ItemReceiver((access$1900) arguments.getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT"), (deleteSessionPartFilesFor) arguments.getParcelable("com.scb.phone.view.fragment.etb.ARG_PRODUCT")));
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.etb_check_identity);
    }

    class write extends FragmentBuilder_BindCreditLimitDisplayFragment {
        private int IconCompatParcelizer;
        private View MediaBrowserCompat$ItemReceiver;

        public write(int i, View view) {
            this.IconCompatParcelizer = i;
            this.MediaBrowserCompat$ItemReceiver = view;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ETBCheckIdentityFragment.MediaBrowserCompat$CustomActionResultReceiver(ETBCheckIdentityFragment.this);
            if (charSequence.length() == this.IconCompatParcelizer) {
                if (this.MediaBrowserCompat$ItemReceiver == ETBCheckIdentityFragment.this.laserIdSecond || this.MediaBrowserCompat$ItemReceiver == ETBCheckIdentityFragment.this.laserIdThird) {
                    ((EditText) this.MediaBrowserCompat$ItemReceiver).setText("");
                } else if (this.MediaBrowserCompat$ItemReceiver == ETBCheckIdentityFragment.this.nextButton) {
                    ETBCheckIdentityFragment.this.PlaybackStateCompat$CustomAction();
                }
                View view = this.MediaBrowserCompat$ItemReceiver;
                if (view != null) {
                    view.requestFocus();
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ETBCheckIdentityFragment eTBCheckIdentityFragment) {
        generateShader generateshader = eTBCheckIdentityFragment.etbCheckIdentityPresenter;
        StringBuilder sb = new StringBuilder();
        sb.append(eTBCheckIdentityFragment.laserIdFirst.getText().toString());
        sb.append(eTBCheckIdentityFragment.laserIdSecond.getText().toString());
        sb.append(eTBCheckIdentityFragment.laserIdThird.getText().toString());
        generateshader.write.f2673x50fd9e4a = sb.toString();
        passTo passto = new passTo(generateshader);
        if (generateshader.RatingCompat != null) {
            passto.IconCompatParcelizer(generateshader.RatingCompat);
        }
    }
}

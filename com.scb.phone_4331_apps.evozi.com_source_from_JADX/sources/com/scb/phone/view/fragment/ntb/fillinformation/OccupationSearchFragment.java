package com.scb.phone.view.fragment.ntb.fillinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import com.scb.phone.view.adapter.demontb.OccupationAdapter;
import com.scb.phone.view.custom.common.CustomInputDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import java.util.regex.Pattern;
import p040o.ActivityBuilder_ContributeHmlIssuerInputActivity;
import p040o.ActivityBuilder_ContributeHmlManageEmailVerificationActivity;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.C4146cE;
import p040o.C4190ci;
import p040o.C7505tO;
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.blend;
import p040o.ci$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getRegistrationsAddresses;
import p040o.injectOnDeviceExtractionServer;

public class OccupationSearchFragment extends BaseFragment implements injectOnDeviceExtractionServer, FragmentBuilder_BindCardlessWithdrawAmountFragment {
    public CustomInputDialog IconCompatParcelizer;
    private OccupationAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private blend MediaBrowserCompat$MediaItem = new blend();
    private KtaJsonCheck.MediaDescriptionCompat MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public OccupationSearchFragment$MediaBrowserCompat$ItemReceiver RatingCompat;
    @BindView
    protected Button addButton;
    @BindView
    protected ImageButton clearButton;
    @BindView
    protected LinearLayout emptyContainer;
    @BindView
    protected EditText mSearchEdit;
    @BindView
    protected TextView notFoundInstruction;
    @HmlPinActivity
    public C4190ci occupationListPresenter;
    @BindView
    protected RecyclerView recyclerView;

    public static OccupationSearchFragment MediaBrowserCompat$ItemReceiver(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("OCCUPATION_LIST_SOURCE", i);
        bundle.putString("OCCUPATION_CODE", str);
        OccupationSearchFragment occupationSearchFragment = new OccupationSearchFragment();
        occupationSearchFragment.setArguments(bundle);
        return occupationSearchFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7505tO tOVar;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f92242131494451, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.occupationListPresenter.MediaBrowserCompat$ItemReceiver(this);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        if (getArguments() != null) {
            tOVar = C7505tO.values()[getArguments().getInt("OCCUPATION_LIST_SOURCE", 0)];
            getArguments().getString("OCCUPATION_CODE", "");
        } else {
            tOVar = C7505tO.DEFAULT;
        }
        C4190ci ciVar = this.occupationListPresenter;
        if (ciVar.RatingCompat != null) {
            ciVar.RatingCompat.AlertController$RecycleListView();
        }
        int i = C4190ci.C41915.read[tOVar.ordinal()];
        if (i == 1) {
            ciVar.MediaBrowserCompat$MediaItem.read();
            ciVar.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new ci$MediaBrowserCompat$CustomActionResultReceiver(ciVar));
        } else if (i == 2) {
            ciVar.MediaBrowserCompat$SearchResultReceiver.write();
            ciVar.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new ci$MediaBrowserCompat$CustomActionResultReceiver(ciVar));
        } else if (i == 3) {
            if (ciVar.RatingCompat != null) {
                ciVar.RatingCompat.aj_();
            }
            List<PrepaidResetOtpActivity.write> read = ciVar.write.IconCompatParcelizer.read();
            ciVar.MediaBrowserCompat$ItemReceiver = ciVar.MediaDescriptionCompat.read(read);
            C4146cE cEVar = new C4146cE(ciVar, read);
            if (ciVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                cEVar.IconCompatParcelizer(ciVar.RatingCompat);
            }
        } else if (i == 4) {
            ciVar.read.IconCompatParcelizer();
            ciVar.read.IconCompatParcelizer(new C4190ci.read());
        }
        this.mSearchEdit.setText("");
        int i2 = C61083.MediaBrowserCompat$CustomActionResultReceiver[tOVar.ordinal()];
        if (i2 == 1) {
            this.mSearchEdit.setHint(R.string.job_search_hint);
        } else if (i2 == 2) {
            this.mSearchEdit.setHint(R.string.business_type_search_hint);
            this.notFoundInstruction.setText(getString(R.string.business_search_no_results_description));
            this.addButton.setVisibility(4);
        } else if (i2 == 3) {
            this.mSearchEdit.setHint(R.string.occupation_search_hint);
            this.notFoundInstruction.setText(getString(R.string.occupation_search_no_results_description));
            this.addButton.setVisibility(4);
        } else if (i2 == 4) {
            this.mSearchEdit.setHint(R.string.hml_business_industry_select_hint);
            this.notFoundInstruction.setText(getString(R.string.hml_business_industry_search_no_results_description));
            this.addButton.setVisibility(4);
        }
        this.clearButton.setVisibility(8);
        this.mSearchEdit.addTextChangedListener(new write());
        FragmentActivity activity = getActivity();
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$SearchResultReceiver;
        if (mediaDescriptionCompat != null) {
            blend blend = this.MediaBrowserCompat$MediaItem;
            String read2 = mediaDescriptionCompat.read();
            String write2 = this.occupationListPresenter.IconCompatParcelizer.write();
            blend.read("source", read2);
            if (write2 != null && "touchpoint".equals(read2)) {
                blend.read("customer_group", write2);
            }
        } else if (!(activity == null || activity.getIntent() == null || !activity.getIntent().hasExtra("com.scb.phone.view.activity.ntb.fillinformation.OccupationSearchActivity.EXTRA_FIREBASE_SOURCE"))) {
            blend blend2 = this.MediaBrowserCompat$MediaItem;
            String stringExtra = activity.getIntent().getStringExtra("com.scb.phone.view.activity.ntb.fillinformation.OccupationSearchActivity.EXTRA_FIREBASE_SOURCE");
            String write3 = this.occupationListPresenter.IconCompatParcelizer.write();
            blend2.read("source", stringExtra);
            if (write3 != null && "touchpoint".equals(stringExtra)) {
                blend2.read("customer_group", write3);
            }
        }
        blend blend3 = this.MediaBrowserCompat$MediaItem;
        if (getActivity() != null) {
            blend3.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_jobsearch");
        }
        return inflate;
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
    }

    /* renamed from: com.scb.phone.view.fragment.ntb.fillinformation.OccupationSearchFragment$3 */
    static /* synthetic */ class C61083 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.tO[] r0 = p040o.C7505tO.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.tO r1 = p040o.C7505tO.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.tO r1 = p040o.C7505tO.BUSINESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.tO r1 = p040o.C7505tO.ONBOARDING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.tO r1 = p040o.C7505tO.INDUSTRY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ntb.fillinformation.OccupationSearchFragment.C61083.<clinit>():void");
        }
    }

    @OnClick
    public void onClickClear() {
        this.mSearchEdit.setText("");
    }

    @OnClick
    public void onClickCancel() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        AutoValue_CrashlyticsReport_FilesPayload.C30601 r7;
        String str;
        String str2;
        String str3;
        String str4;
        if (getActivity() != null) {
            List<AutoValue_CrashlyticsReport_FilesPayload.C30601> list = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            if (list != null) {
                r7 = list.get(i);
            } else {
                r7 = null;
            }
            String str5 = "";
            if (r7 != null) {
                str5 = r7.MediaBrowserCompat$CustomActionResultReceiver;
                str4 = r7.IconCompatParcelizer;
                str3 = r7.MediaBrowserCompat$ItemReceiver;
                str2 = r7.MediaBrowserCompat$SearchResultReceiver;
                str = r7.read;
            } else {
                str = str5;
                str4 = str;
                str3 = str4;
                str2 = str3;
            }
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT_OCCUPATION_CODE", str5);
            intent.putExtra("EXTRA_RESULT_OCCUPATION_DESCRIPTION", str4);
            intent.putExtra("EXTRA_RESULT_OCCUPATION_ISIC_CODE", str3);
            intent.putExtra("EXTRA_RESULT_OCCUPATION_GROUP_CODE", str2);
            intent.putExtra("EXTRA_RESULT_OCCUPATION_OCCUPATION_GROUP", str);
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
    }

    public class write implements TextWatcher {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public write() {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable.toString().length() > 0) {
                OccupationSearchFragment.this.clearButton.setVisibility(0);
            } else {
                OccupationSearchFragment.this.clearButton.setVisibility(8);
            }
            if (OccupationSearchFragment.this.RatingCompat != null) {
                OccupationSearchFragment.this.RatingCompat.cancel(true);
            }
            OccupationSearchFragment$MediaBrowserCompat$ItemReceiver unused = OccupationSearchFragment.this.RatingCompat = new OccupationSearchFragment$MediaBrowserCompat$ItemReceiver(OccupationSearchFragment.this, (byte) 0);
            OccupationSearchFragment.this.RatingCompat.execute(new String[]{editable.toString()});
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<AutoValue_CrashlyticsReport_FilesPayload.C30601> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new OccupationAdapter(list, this);
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.recyclerView.setNestedScrollingEnabled(true);
        this.recyclerView.setVisibility(0);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onAddButtonClick() {
        CustomInputDialog MediaBrowserCompat$ItemReceiver = CustomInputDialog.MediaBrowserCompat$ItemReceiver(getContext());
        this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver;
        String string = getString(R.string.add_job_title);
        if (string != null) {
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setVisibility(0);
            MediaBrowserCompat$ItemReceiver.mTitleTextView.setText(string);
        }
        CustomInputDialog customInputDialog = this.IconCompatParcelizer;
        String string2 = getString(R.string.add_job_text);
        if (string2 != null) {
            customInputDialog.mTextTextView.setVisibility(0);
            customInputDialog.mTextTextView.setText(string2);
        }
        this.IconCompatParcelizer.mEditTextView.setHint(R.string.enter_job_title);
        this.IconCompatParcelizer.mEditTextView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        CustomInputDialog customInputDialog2 = this.IconCompatParcelizer;
        customInputDialog2.mEditTextView.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (String.valueOf(OccupationSearchFragment.this.IconCompatParcelizer.mEditTextView.getText()).length() < 3 || String.valueOf(OccupationSearchFragment.this.IconCompatParcelizer.mEditTextView.getText()).length() > 30) {
                    CustomInputDialog write = OccupationSearchFragment.this.IconCompatParcelizer;
                    String string = OccupationSearchFragment.this.getString(R.string.occupation_inline_error_length);
                    write.mErrorTextView.setVisibility(0);
                    write.mErrorTextView.setText(string);
                    OccupationSearchFragment.this.IconCompatParcelizer.mPositiveButton.setEnabled(false);
                    return;
                }
                if (!Pattern.compile("^(?=\\S)[\\u0E01-\\u0E39\\u0E40-\\u0E4C0-9a-zA-Z ()\\-./]+$").matcher(String.valueOf(OccupationSearchFragment.this.IconCompatParcelizer.mEditTextView.getText())).matches()) {
                    CustomInputDialog write2 = OccupationSearchFragment.this.IconCompatParcelizer;
                    String string2 = OccupationSearchFragment.this.getString(R.string.occupation_inline_error_character);
                    write2.mErrorTextView.setVisibility(0);
                    write2.mErrorTextView.setText(string2);
                    OccupationSearchFragment.this.IconCompatParcelizer.mPositiveButton.setEnabled(false);
                    return;
                }
                OccupationSearchFragment.this.IconCompatParcelizer.mErrorTextView.setVisibility(8);
                OccupationSearchFragment.this.IconCompatParcelizer.mPositiveButton.setEnabled(true);
            }
        });
        this.IconCompatParcelizer.mEditTextView.setVisibility(0);
        this.IconCompatParcelizer.setCanceledOnTouchOutside(false);
        CustomInputDialog customInputDialog3 = this.IconCompatParcelizer;
        customInputDialog3.write(customInputDialog3.MediaBrowserCompat$ItemReceiver.getString(R.string.cancel), ActivityBuilder_ContributeHmlManageEmailVerificationActivity.MediaBrowserCompat$CustomActionResultReceiver);
        CustomInputDialog customInputDialog4 = this.IconCompatParcelizer;
        String string3 = getString(R.string.ok);
        ActivityBuilder_ContributeHmlIssuerInputActivity activityBuilder_ContributeHmlIssuerInputActivity = new ActivityBuilder_ContributeHmlIssuerInputActivity(this);
        if (string3 != null) {
            customInputDialog4.mPositiveButton.setText(string3);
            customInputDialog4.mPositiveButton.setOnClickListener(new getRegistrationsAddresses(customInputDialog4, activityBuilder_ContributeHmlIssuerInputActivity, false));
        }
        this.IconCompatParcelizer.show();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaBrowserCompat$SearchResultReceiver = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }
}

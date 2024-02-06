package com.scb.phone.view.fragment.etb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.adapter.etb.ETBProductDetailAdapter;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.BondTermsAndConditionsService;
import p040o.C3949W;
import p040o.C3957X;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlNationalIdActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBlend;
import p040o.W$MediaSessionCompat$Token;
import p040o.ZTBSV;
import p040o.access$1900;
import p040o.access$900;
import p040o.closeOpenSessions;
import p040o.deleteSessionPartFilesFor;
import p040o.getExpirationMonth;
import p040o.getLandmarks;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p040o.zzca;

public final class ETBProductDetailFragment extends BaseEtbFragment implements getExpirationMonth {
    private access$1900 MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver = "";
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private BondTermsAndConditionsService MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public deleteSessionPartFilesFor MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public String RatingCompat;
    @BindView
    public Button btnSelect;
    @BindView
    public ImageView ivDetailImage;
    @BindView
    public LinearLayout layoutSpinnerSelectPlan;
    @HmlPinActivity
    public C3949W presenter;
    @BindView
    public RecyclerView recyclerViewLongDesc;
    @BindView
    public Spinner spinnerSelectPlan;
    @BindView
    public ThaiTextView tvProductName;
    @BindView
    public ThaiTextView tvProductShortDesc;

    public final int ParcelableVolumeInfo() {
        return 0;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public ETBProductDetailFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5952xa4d236aa.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class read {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$CustomActionResultReceiver;
        public String MediaBrowserCompat$ItemReceiver;
        public int read;
        public boolean write;

        private read() {
        }

        public read(int i) {
            this.read = i;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87332131493960, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("EXTRA_ACCOUNT_TYPE");
            if (string == null) {
                string = "";
            }
            this.MediaBrowserCompat$SearchResultReceiver = string;
            String string2 = arguments.getString("EXTRA_PRODUCT_CODE");
            String str = null;
            if (string2 == null) {
                string2 = null;
            }
            this.RatingCompat = string2;
            String string3 = arguments.getString("EXTRA_OPEN_FLAG");
            if (string3 != null) {
                str = string3;
            }
            this.MediaBrowserCompat$MediaItem = str;
        }
        C3949W w = this.presenter;
        if (w == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        w.MediaBrowserCompat$ItemReceiver(this);
        Button button = this.btnSelect;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnSelect");
        }
        boolean z = false;
        button.setEnabled(false);
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            this.MediaSessionCompat$QueueItem = new BondTermsAndConditionsService(context);
        }
        C3949W w2 = this.presenter;
        if (w2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        String str3 = this.RatingCompat;
        String str4 = this.MediaBrowserCompat$MediaItem;
        onGetStartedClick.write((Object) str2, "accountType");
        if (w2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            w2.RatingCompat.AlertController$RecycleListView();
        }
        getLandmarks getlandmarks = w2.write;
        onGetStartedClick.write((Object) str2, "accountType");
        DebitCardResetOtpActivity<zzca.zza.C10763zza> MediaBrowserCompat$CustomActionResultReceiver2 = getlandmarks.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(str2, str3, str4);
        getLandmarks getlandmarks2 = w2.write;
        C3949W w3 = w2;
        getlandmarks2.read(MediaBrowserCompat$CustomActionResultReceiver2, new C3957X(new C3949W.write(w3)), new C3957X(new C3949W.IconCompatParcelizer(w3)));
        ZTBSV ztbsv = (ScriptIntrinsicBlend) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "etb_product_details");
        }
    }

    public final void read(access$900 access_900) {
        onGetStartedClick.write((Object) access_900, "display");
        if (getContext() != null) {
            ImageView imageView = this.ivDetailImage;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivDetailImage");
            }
            FragmentBuilder_BindDepositSelectorFragment.MediaMetadataCompat(imageView, access_900.MediaBrowserCompat$ItemReceiver);
        }
        ThaiTextView thaiTextView = this.tvProductName;
        if (thaiTextView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProductName");
        }
        thaiTextView.setText(access_900.write);
        ThaiTextView thaiTextView2 = this.tvProductShortDesc;
        if (thaiTextView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvProductShortDesc");
        }
        thaiTextView2.setText(access_900.read);
        this.MediaBrowserCompat$CustomActionResultReceiver = new access$1900(0, access_900.IconCompatParcelizer, access_900.write, this.RatingCompat, access_900.read, access_900.MediaBrowserCompat$ItemReceiver, "");
        List<deleteSessionPartFilesFor> list = access_900.MediaBrowserCompat$CustomActionResultReceiver;
        if (list.size() > 0) {
            String string = getString(R.string.etb_select_plan_account_plan_hint);
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.etb_s…t_plan_account_plan_hint)");
            List MediaBrowserCompat$CustomActionResultReceiver2 = HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(new deleteSessionPartFilesFor(string, "", 0, (String) null, 0, 0, 0, HmlNationalIdActivity.IconCompatParcelizer));
            MediaBrowserCompat$CustomActionResultReceiver2.addAll(list);
            BondTermsAndConditionsService bondTermsAndConditionsService = this.MediaSessionCompat$QueueItem;
            if (bondTermsAndConditionsService == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSelectPlanAdapter");
            }
            bondTermsAndConditionsService.clear();
            BondTermsAndConditionsService bondTermsAndConditionsService2 = this.MediaSessionCompat$QueueItem;
            if (bondTermsAndConditionsService2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSelectPlanAdapter");
            }
            bondTermsAndConditionsService2.addAll(MediaBrowserCompat$CustomActionResultReceiver2);
            Spinner spinner = this.spinnerSelectPlan;
            if (spinner == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSelectPlan");
            }
            BondTermsAndConditionsService bondTermsAndConditionsService3 = this.MediaSessionCompat$QueueItem;
            if (bondTermsAndConditionsService3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSelectPlanAdapter");
            }
            spinner.setAdapter(bondTermsAndConditionsService3);
            Spinner spinner2 = this.spinnerSelectPlan;
            if (spinner2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSelectPlan");
            }
            spinner2.setOnItemSelectedListener(new IconCompatParcelizer(this, MediaBrowserCompat$CustomActionResultReceiver2));
            if (this.presenter == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            deleteSessionPartFilesFor read2 = C3949W.read(this.RatingCompat, list);
            this.MediaSessionCompat$ResultReceiverWrapper = read2;
            if (read2 == null) {
                LinearLayout linearLayout = this.layoutSpinnerSelectPlan;
                if (linearLayout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSpinnerSelectPlan");
                }
                linearLayout.setVisibility(0);
            } else if ("2".equals(access_900.IconCompatParcelizer)) {
                LinearLayout linearLayout2 = this.layoutSpinnerSelectPlan;
                if (linearLayout2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSpinnerSelectPlan");
                }
                linearLayout2.setVisibility(8);
                read(read2.IconCompatParcelizer);
            } else {
                LinearLayout linearLayout3 = this.layoutSpinnerSelectPlan;
                if (linearLayout3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("layoutSpinnerSelectPlan");
                }
                linearLayout3.setVisibility(0);
                BondTermsAndConditionsService bondTermsAndConditionsService4 = this.MediaSessionCompat$QueueItem;
                if (bondTermsAndConditionsService4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSelectPlanAdapter");
                }
                int position = bondTermsAndConditionsService4.getPosition(read2);
                Spinner spinner3 = this.spinnerSelectPlan;
                if (spinner3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerSelectPlan");
                }
                spinner3.setSelection(position);
            }
        }
    }

    public static final class IconCompatParcelizer implements AdapterView.OnItemSelectedListener {
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ ETBProductDetailFragment MediaBrowserCompat$CustomActionResultReceiver;

        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        IconCompatParcelizer(ETBProductDetailFragment eTBProductDetailFragment, List list) {
            this.MediaBrowserCompat$CustomActionResultReceiver = eTBProductDetailFragment;
            this.IconCompatParcelizer = list;
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper = (deleteSessionPartFilesFor) this.IconCompatParcelizer.get(i);
            this.MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = ((deleteSessionPartFilesFor) this.IconCompatParcelizer.get(i)).MediaBrowserCompat$CustomActionResultReceiver;
            this.MediaBrowserCompat$CustomActionResultReceiver.read(((deleteSessionPartFilesFor) this.IconCompatParcelizer.get(i)).IconCompatParcelizer);
        }
    }

    /* access modifiers changed from: private */
    public final void read(List<closeOpenSessions> list) {
        Context context = getContext();
        boolean z = false;
        if (context != null) {
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            RecyclerView recyclerView = this.recyclerViewLongDesc;
            if (recyclerView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerViewLongDesc");
            }
            recyclerView.setLayoutManager(linearLayoutManager);
            RecyclerView recyclerView2 = this.recyclerViewLongDesc;
            if (recyclerView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerViewLongDesc");
            }
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            recyclerView2.setAdapter(new ETBProductDetailAdapter(context, list));
        }
        C3949W w = this.presenter;
        if (w == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer w$MediaSessionCompat$Token = new W$MediaSessionCompat$Token(this.RatingCompat);
        if (w.RatingCompat != null) {
            z = true;
        }
        if (z) {
            w$MediaSessionCompat$Token.IconCompatParcelizer(w.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.btnSelect;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnSelect");
        }
        button.setEnabled(z);
    }

    @OnClick
    public final void onClickSelectPlanButton() {
        String str = this.RatingCompat;
        if (str != null) {
            C3949W w = this.presenter;
            if (w == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str2 = this.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.write((Object) str2, "accountType");
            onGetStartedClick.write((Object) str, "productCode");
            if (w.RatingCompat != null) {
                w.RatingCompat.AlertController$RecycleListView();
            }
            getLandmarks getlandmarks = w.write;
            onGetStartedClick.write((Object) str2, "accountType");
            onGetStartedClick.write((Object) str, "productCode");
            onGetStartedClick.write((Object) "0", "objectiveId");
            DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$ItemReceiver = getlandmarks.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(str2, str, "0");
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "repository.eligibilityOp…productCode, objectiveId)");
            getLandmarks getlandmarks2 = w.write;
            C3949W w2 = w;
            getlandmarks2.read(MediaBrowserCompat$ItemReceiver, new C3957X(new C3949W.MediaDescriptionCompat(w2)), new C3957X(new C3949W.RatingCompat(w2)));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.write(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaSessionCompat$ResultReceiverWrapper);
        this.MediaMetadataCompat.write(ETBProductTermConditionFragment.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaSessionCompat$ResultReceiverWrapper, this.RatingCompat));
    }

    public final void write() {
        Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent IconCompatParcelizer2 = ManageEmailLandingActivity.IconCompatParcelizer((Context) getActivity());
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(activity, IconCompatParcelizer2).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                activity.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void onDestroyView() {
        C3949W w = this.presenter;
        if (w == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        w.onDestroy();
        super.onDestroyView();
    }

    public final String PlaybackStateCompat() {
        String string = getString(R.string.etb_account_detail_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.etb_account_detail_title)");
        return string;
    }

    public static final ETBProductDetailFragment write(String str, String str2, String str3) {
        ETBProductDetailFragment eTBProductDetailFragment = new ETBProductDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString("EXTRA_ACCOUNT_TYPE", str);
        bundle.putString("EXTRA_PRODUCT_CODE", str2);
        bundle.putString("EXTRA_OPEN_FLAG", str3);
        eTBProductDetailFragment.setArguments(bundle);
        return eTBProductDetailFragment;
    }
}

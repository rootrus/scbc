package com.scb.phone.view.fragment.requesttopay;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.requesttopay.RequesterReviewActivity;
import com.scb.phone.view.adapter.transferandpay.PaybackPeriodAdapter;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import java.util.regex.Pattern;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.C4962mZ;
import p040o.C7113x89fc5cbc;
import p040o.C9661x4797235;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedMap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getICheckDeserializerRtti;
import p040o.lexicographicalComparator;
import p040o.mZ$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setSymbol;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class InputDetailsFragment extends BaseFragment implements FragmentBuilder_BindCcSofBillPaymentOnlyFragment, PromptPayTargetSelectFragment$MediaBrowserCompat$ItemReceiver, C7113x89fc5cbc {
    private boolean IconCompatParcelizer;
    private double MediaBrowserCompat$CustomActionResultReceiver = 0.0d;
    private PromptPayTargetSelectFragment MediaBrowserCompat$MediaItem;
    private int MediaDescriptionCompat = -1;
    private PaybackPeriodAdapter MediaMetadataCompat;
    @BindView
    protected DefaultButton buttonReview;
    @BindView
    protected AmountEditText editAmount;
    @BindView
    protected RecyclerView paybackPeriodRecyclerView;
    @HmlPinActivity
    public C4962mZ presenter;
    @BindView
    protected ImageView proxyNumberEditImageView;
    @BindView
    protected TextView proxyNumberRequestNameTextView;
    @BindView
    protected TextView proxyNumberRequestNumberTextView;
    @BindView
    protected ImageView proxyNumberTypeImageView;
    @BindView
    protected EditText rtpNoteEditText;
    @BindView
    protected TextView rtpNoteErrorTextView;
    @BindView
    protected TextInputLayout textInputAmount;

    public static InputDetailsFragment write(Intent intent) {
        Bundle bundle = new Bundle();
        if (intent.hasExtra("EXTRA_PROXY_NUMBER")) {
            String stringExtra = intent.getStringExtra("EXTRA_PROXY_NUMBER");
            String stringExtra2 = intent.getStringExtra("EXTRA_PROXY_NAME");
            bundle.putString("BUNDLE_PROXY_NUMBER", stringExtra);
            bundle.putString("BUNDLE_PROXY_NAME", stringExtra2);
            bundle.putString("source", intent.getStringExtra("source"));
        }
        InputDetailsFragment inputDetailsFragment = new InputDetailsFragment();
        inputDetailsFragment.setArguments(bundle);
        return inputDetailsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        int i;
        View inflate = layoutInflater.inflate(R.layout.f89612131494188, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.request_new_request));
        Bundle arguments = getArguments();
        if (arguments != null) {
            str2 = arguments.getString("BUNDLE_PROXY_NUMBER");
            str = arguments.getString("BUNDLE_PROXY_NAME");
        } else {
            str = "";
            str2 = str;
        }
        if (str == null || "".equals(str)) {
            this.proxyNumberRequestNameTextView.setVisibility(8);
        } else {
            this.proxyNumberRequestNameTextView.setText(str);
        }
        if (str2 != null && !"".equals(str2)) {
            if (str2.length() > 10) {
                i = R.drawable.icon_prompt_pay_cid;
                this.IconCompatParcelizer = false;
            } else {
                i = R.drawable.icon_prompt_pay_mobile;
                this.IconCompatParcelizer = true;
            }
            this.proxyNumberRequestNumberTextView.setText(getICheckDeserializerRtti.IconCompatParcelizer(false, this.IconCompatParcelizer, str2));
            this.proxyNumberRequestNumberTextView.requestFocus();
            this.proxyNumberTypeImageView.setImageResource(i);
            C4962mZ mZVar = this.presenter;
            boolean z = this.IconCompatParcelizer;
            mZVar.MediaBrowserCompat$SearchResultReceiver = str2;
            mZVar.MediaBrowserCompat$ItemReceiver = z;
        }
        this.rtpNoteEditText.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                InputDetailsFragment.this.rtpNoteErrorTextView.setVisibility(8);
            }
        });
        this.editAmount.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                InputDetailsFragment.MediaBrowserCompat$CustomActionResultReceiver(InputDetailsFragment.this, d);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                InputDetailsFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", AbsActionBarView()), new ZSYR2K("subtype", "outgoing")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("rtp_input", zsyr2kArr);
        }
        PromptPayTargetSelectFragment promptPayTargetSelectFragment = (PromptPayTargetSelectFragment) getChildFragmentManager().findFragmentByTag(getString(R.string.transfer_tab));
        this.MediaBrowserCompat$MediaItem = promptPayTargetSelectFragment;
        promptPayTargetSelectFragment.IconCompatParcelizer = this;
        C4962mZ mZVar2 = this.presenter;
        PromptPayTargetSelectFragment promptPayTargetSelectFragment2 = this.MediaBrowserCompat$MediaItem;
        mZVar2.MediaBrowserCompat$ItemReceiver(this);
        mZVar2.IconCompatParcelizer = this;
        mZVar2.MediaBrowserCompat$MediaItem = promptPayTargetSelectFragment2;
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C4962mZ mZVar = this.presenter;
        mZVar.MediaSessionCompat$Token.read.MediaBrowserCompat$ItemReceiver("TRANSFER");
        mZVar.MediaSessionCompat$Token.IconCompatParcelizer();
        mZVar.MediaSessionCompat$Token.IconCompatParcelizer(new C4962mZ.read(mZVar, (byte) 0));
    }

    @OnClick
    public void onProxyNumberEditClick() {
        getActivity().finish();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
        ParcelableVolumeInfo(getString(R.string.request_new_request));
    }

    public final void read(List<AutoValue_CrashlyticsReport_Session_Event_Device> list) {
        this.paybackPeriodRecyclerView.setVisibility(0);
        getContext();
        this.paybackPeriodRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        PaybackPeriodAdapter paybackPeriodAdapter = new PaybackPeriodAdapter(list);
        this.MediaMetadataCompat = paybackPeriodAdapter;
        paybackPeriodAdapter.read = this;
        this.paybackPeriodRecyclerView.setAdapter(this.MediaMetadataCompat);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.buttonReview.setButtonEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaDescriptionCompat);
        Intent intent = new Intent(getContext(), RequesterReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("source", AbsActionBarView());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaDescriptionCompat);
        this.rtpNoteErrorTextView.setVisibility(0);
    }

    public final void write(String str) {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.common_error)).MediaBrowserCompat$ItemReceiver(String.format(getString(R.string.request_to_pay_amount_over_limit_error_message), new Object[]{str})).IconCompatParcelizer(getString(R.string.ok), C9661x4797235.write).show();
        this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaDescriptionCompat);
    }

    public final void read(int i) {
        PaybackPeriodAdapter paybackPeriodAdapter = this.MediaMetadataCompat;
        paybackPeriodAdapter.write = i;
        paybackPeriodAdapter.IconCompatParcelizer.write();
        this.MediaDescriptionCompat = i;
        C4962mZ mZVar = this.presenter;
        PaybackPeriodAdapter paybackPeriodAdapter2 = this.MediaMetadataCompat;
        mZVar.f2890x50fd9e4a = paybackPeriodAdapter2.MediaBrowserCompat$ItemReceiver.get(paybackPeriodAdapter2.write);
        this.presenter.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setSymbol setsymbol) {
        this.presenter.MediaSessionCompat$QueueItem = setsymbol;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(InputDetailsFragment inputDetailsFragment, double d) {
        inputDetailsFragment.MediaBrowserCompat$CustomActionResultReceiver = d;
        inputDetailsFragment.presenter.IconCompatParcelizer(d, inputDetailsFragment.MediaDescriptionCompat);
    }

    @OnClick
    public void onReviewButtonClick() {
        String str;
        String str2;
        String str3;
        this.buttonReview.setButtonEnabled(false);
        C4962mZ mZVar = this.presenter;
        String obj = this.rtpNoteEditText.getText().toString();
        mZVar.MediaMetadataCompat = obj;
        double d = mZVar.write;
        boolean z = d > 0.0d && d <= ((double) mZVar.MediaDescriptionCompat.read);
        boolean matches = (obj == null || TextUtils.isEmpty(obj)) ? true : Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(obj).matches();
        if (z && matches) {
            if (mZVar.RatingCompat != null) {
                mZVar.RatingCompat.AlertController$RecycleListView();
            }
            if (!mZVar.read) {
                mZVar.read = true;
                setSymbol setsymbol = mZVar.MediaSessionCompat$QueueItem;
                if (setsymbol != null) {
                    str3 = setsymbol.IconCompatParcelizer;
                    str2 = mZVar.MediaSessionCompat$QueueItem.write;
                    str = mZVar.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver;
                } else {
                    str3 = "";
                    str2 = str3;
                    str = str2;
                }
                ImmutableSortedMap.C35092 IconCompatParcelizer2 = ImmutableSortedMap.C35092.IconCompatParcelizer();
                IconCompatParcelizer2.write = String.valueOf(mZVar.write);
                IconCompatParcelizer2.read = str3;
                ImmutableSortedMap.C35123 MediaBrowserCompat$ItemReceiver = ImmutableSortedMap.C35123.MediaBrowserCompat$ItemReceiver();
                MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = mZVar.f2890x50fd9e4a.IconCompatParcelizer;
                IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver;
                String str4 = mZVar.MediaMetadataCompat;
                if (str4 == null) {
                    str4 = "";
                }
                IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = str4;
                if (str2 != null && !str2.equals("")) {
                    str2 = str2.replace("-", "");
                }
                IconCompatParcelizer2.IconCompatParcelizer = str2;
                IconCompatParcelizer2.RatingCompat = str;
                IconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver = mZVar.MediaBrowserCompat$SearchResultReceiver;
                IconCompatParcelizer2.MediaDescriptionCompat = mZVar.MediaBrowserCompat$ItemReceiver ? "MOB" : "CID";
                mZVar.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
                mZVar.MediaSessionCompat$Token.IconCompatParcelizer(new mZ$MediaBrowserCompat$CustomActionResultReceiver(mZVar, (byte) 0));
            }
        } else if (!z) {
            mZVar.IconCompatParcelizer.write(lexicographicalComparator.write(Double.valueOf((double) mZVar.MediaDescriptionCompat.read)));
        } else if (!matches) {
            mZVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        }
    }
}

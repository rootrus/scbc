package com.scb.phone.view.fragment.ebillsubscription;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import com.scb.phone.R;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionReviewActivity;
import com.scb.phone.view.custom.ScbEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayBiller;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C3443I;
import p040o.C6388xf4a9b69e;
import p040o.C6415x948859dd;
import p040o.C6416xdb286975;
import p040o.CrashlyticsReport;
import p040o.DeepLinkModule_ContributeFacebookDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1700;
import p040o.access$1800;
import p040o.getICheckDeserializerRtti;
import p040o.setIpOperations;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class EbillSubscriptionInputFragment extends BaseFragment implements C6388xf4a9b69e {
    private CrashlyticsReport.Session.Event.Application.Execution IconCompatParcelizer;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$CustomActionResultReceiver = "";
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$MediaItem = false;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$SearchResultReceiver = "";
    /* access modifiers changed from: private */
    public List<access$1800> MediaDescriptionCompat = new ArrayList();
    private ArrayAdapter<access$1800> MediaMetadataCompat;
    /* access modifiers changed from: private */
    public boolean MediaSessionCompat$ResultReceiverWrapper = false;
    /* access modifiers changed from: private */
    public boolean ParcelableVolumeInfo = false;
    /* access modifiers changed from: private */
    public String RatingCompat = "";
    @BindView
    CustomTransferAndPayBiller customBillerDetail;
    @BindView
    Spinner customSpinner;
    @HmlPinActivity
    public C3443I eBillSubscriptionInputPresenter;
    @BindView
    DefaultButton mButton;
    @BindView
    public ScbEditText ref1EditText;
    @BindView
    TextView ref1Label;
    @BindView
    public ScbEditText ref2EditText;
    @BindView
    TextView ref2Label;
    @BindView
    public ScbEditText ref3EditText;
    @BindView
    TextView ref3Label;
    @BindView
    public TextView tvErrorRef1;
    @BindView
    public TextView tvErrorRef2;
    @BindView
    public TextView tvErrorRef3;

    public static EbillSubscriptionInputFragment MediaBrowserCompat$ItemReceiver(CrashlyticsReport.Session.Event.Application.Execution execution) {
        EbillSubscriptionInputFragment ebillSubscriptionInputFragment = new EbillSubscriptionInputFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        ebillSubscriptionInputFragment.setArguments(bundle);
        return ebillSubscriptionInputFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87212131493948, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.eBillSubscriptionInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.IconCompatParcelizer = (CrashlyticsReport.Session.Event.Application.Execution) getArguments().getParcelable("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY");
        IconCompatParcelizer();
        C3443I i = this.eBillSubscriptionInputPresenter;
        if (i.RatingCompat != null) {
            i.RatingCompat.Keep();
        }
        i.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
        i.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C3443I.read(i, (byte) 0));
        C3443I i2 = this.eBillSubscriptionInputPresenter;
        setIpOperations setipoperations = new setIpOperations(this.IconCompatParcelizer);
        if (i2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setipoperations.IconCompatParcelizer(i2.RatingCompat);
        }
        this.ref1EditText.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                boolean unused = EbillSubscriptionInputFragment.this.MediaBrowserCompat$MediaItem = EbillSubscriptionInputFragment.IconCompatParcelizer(editable.toString());
                EbillSubscriptionInputFragment.this.IconCompatParcelizer();
            }
        });
        this.ref1EditText.setOnFocusChangeListener(new DeepLinkModule_ContributeFacebookDeepLinkActivity(this));
        this.ref2EditText.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                boolean unused = EbillSubscriptionInputFragment.this.ParcelableVolumeInfo = EbillSubscriptionInputFragment.IconCompatParcelizer(editable.toString());
                EbillSubscriptionInputFragment.this.IconCompatParcelizer();
            }
        });
        this.ref2EditText.setOnFocusChangeListener(new C6416xdb286975(this));
        this.ref3EditText.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                boolean unused = EbillSubscriptionInputFragment.this.MediaSessionCompat$ResultReceiverWrapper = EbillSubscriptionInputFragment.IconCompatParcelizer(editable.toString());
                EbillSubscriptionInputFragment.this.IconCompatParcelizer();
            }
        });
        this.ref3EditText.setOnFocusChangeListener(new C6415x948859dd(this));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<access$1700> list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            this.MediaDescriptionCompat = arrayList;
            arrayList.add(new access$1800(getString(R.string.select_proxy), "DEFAULT", ""));
            for (int i = 0; i < list.size(); i++) {
                this.MediaDescriptionCompat.add(new access$1800(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(list.get(i).MediaBrowserCompat$ItemReceiver, list.get(i).MediaBrowserCompat$CustomActionResultReceiver), list.get(i).MediaBrowserCompat$ItemReceiver, list.get(i).IconCompatParcelizer));
            }
            if (this.MediaMetadataCompat == null) {
                C59493 r7 = new ArrayAdapter<access$1800>(getActivity(), this.MediaDescriptionCompat) {
                    public final View getView(int i, View view, ViewGroup viewGroup) {
                        View view2 = super.getView(i, view, viewGroup);
                        TextView textView = (TextView) view2;
                        if (i == 0) {
                            textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
                        } else {
                            textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
                        }
                        return view2;
                    }

                    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
                        View dropDownView = super.getDropDownView(i, view, viewGroup);
                        TextView textView = (TextView) dropDownView;
                        if (i == 0) {
                            textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
                        } else {
                            textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
                        }
                        return dropDownView;
                    }
                };
                this.MediaMetadataCompat = r7;
                this.customSpinner.setAdapter(r7);
                this.customSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public final void onNothingSelected(AdapterView<?> adapterView) {
                    }

                    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                        EbillSubscriptionInputFragment ebillSubscriptionInputFragment = EbillSubscriptionInputFragment.this;
                        String unused = ebillSubscriptionInputFragment.RatingCompat = ((access$1800) ebillSubscriptionInputFragment.MediaDescriptionCompat.get(i)).MediaBrowserCompat$CustomActionResultReceiver;
                        EbillSubscriptionInputFragment ebillSubscriptionInputFragment2 = EbillSubscriptionInputFragment.this;
                        String unused2 = ebillSubscriptionInputFragment2.MediaBrowserCompat$SearchResultReceiver = ((access$1800) ebillSubscriptionInputFragment2.MediaDescriptionCompat.get(i)).read;
                        EbillSubscriptionInputFragment ebillSubscriptionInputFragment3 = EbillSubscriptionInputFragment.this;
                        String unused3 = ebillSubscriptionInputFragment3.MediaBrowserCompat$CustomActionResultReceiver = ((access$1800) ebillSubscriptionInputFragment3.MediaDescriptionCompat.get(i)).IconCompatParcelizer;
                        EbillSubscriptionInputFragment.this.IconCompatParcelizer();
                    }
                });
            }
        }
    }

    public final void write(CrashlyticsReport.Session.Event.Application.Execution execution) {
        if (execution != null) {
            this.customBillerDetail.mBackButton.setVisibility(8);
            this.customBillerDetail.setTitle(execution.read());
            this.customBillerDetail.setDescription(execution.MediaDescriptionCompat);
            this.customBillerDetail.setAvatar(execution.MediaBrowserCompat$CustomActionResultReceiver());
        }
    }

    @OnEditorAction
    public boolean onRefEnter(EditText editText, int i, KeyEvent keyEvent) {
        TextView textView;
        if (i == 6) {
            switch (editText.getId()) {
                case R.id.reference_edit_text2:
                    textView = this.tvErrorRef2;
                    break;
                case R.id.reference_edit_text3:
                    textView = this.tvErrorRef3;
                    break;
                default:
                    textView = this.tvErrorRef1;
                    break;
            }
            PlaybackStateCompat$CustomAction();
            if (getView() != null) {
                getView().getRootView().requestFocus();
            }
            MediaBrowserCompat$CustomActionResultReceiver((ScbEditText) editText, textView, false);
        }
        return false;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(ScbEditText scbEditText, TextView textView, boolean z) {
        if (z || !TextUtils.isEmpty(scbEditText.getText())) {
            textView.setVisibility(8);
            scbEditText.setInvalidInput(false);
            return;
        }
        textView.setVisibility(0);
        scbEditText.setInvalidInput(true);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void IconCompatParcelizer() {
        /*
            r6 = this;
            java.lang.String r0 = r6.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r1 = "DEFAULT"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0057
            o.CrashlyticsReport$Session$Event$Application$Execution r0 = r6.IconCompatParcelizer
            java.lang.String r0 = r0.setForceShowIcon
            r3 = -1
            int r4 = r0.hashCode()
            r5 = 2
            switch(r4) {
                case 1537: goto L_0x002e;
                case 1538: goto L_0x0024;
                case 1539: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0037
        L_0x001a:
            java.lang.String r4 = "03"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0037
            r3 = r5
            goto L_0x0037
        L_0x0024:
            java.lang.String r4 = "02"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0037
            r3 = r1
            goto L_0x0037
        L_0x002e:
            java.lang.String r4 = "01"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0037
            r3 = r2
        L_0x0037:
            if (r3 == 0) goto L_0x0054
            if (r3 == r1) goto L_0x004b
            if (r3 == r5) goto L_0x003e
            goto L_0x0057
        L_0x003e:
            boolean r0 = r6.MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x0057
            boolean r0 = r6.ParcelableVolumeInfo
            if (r0 == 0) goto L_0x0057
            boolean r0 = r6.MediaSessionCompat$ResultReceiverWrapper
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x004b:
            boolean r0 = r6.MediaBrowserCompat$MediaItem
            if (r0 == 0) goto L_0x0057
            boolean r0 = r6.ParcelableVolumeInfo
            if (r0 == 0) goto L_0x0057
            goto L_0x0058
        L_0x0054:
            boolean r1 = r6.MediaBrowserCompat$MediaItem
            goto L_0x0058
        L_0x0057:
            r1 = r2
        L_0x0058:
            com.scb.phone.view.custom.common.DefaultButton r0 = r6.mButton
            boolean r0 = r0.isEnabled()
            if (r0 == r1) goto L_0x0065
            com.scb.phone.view.custom.common.DefaultButton r0 = r6.mButton
            r0.setButtonEnabled(r1)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionInputFragment.IconCompatParcelizer():void");
    }

    @OnClick
    public void onReviewButtonClick() {
        String obj = this.ref1EditText.getText().toString();
        String obj2 = this.ref2EditText.getText().toString();
        String obj3 = this.ref3EditText.getText().toString();
        String str = this.RatingCompat;
        if (str != null && !str.equals("")) {
            str = str.replace("-", "");
        }
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent intent = new Intent(getContext(), EBillSubscriptionReviewActivity.class);
        CrashlyticsReport.Session.Event.Application.Execution execution = this.IconCompatParcelizer;
        execution.setPopupCallback = obj;
        execution.setGroupDividerEnabled = obj2;
        execution.ExpandedMenuView = obj3;
        setUuidFromUtf8Bytes RatingCompat2 = setUuidFromUtf8Bytes.RatingCompat();
        RatingCompat2.setVisibility = str;
        RatingCompat2.MenuItemImpl = str2;
        RatingCompat2.setStackedBackground = str3;
        intent.putExtra("com.scb.phone.EXTRA_BILL_PAYMENT_DISPLAY", execution);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", RatingCompat2);
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

    static /* synthetic */ boolean IconCompatParcelizer(String str) {
        return !str.isEmpty();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.CrashlyticsReport.Session.Event.Application.Execution r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.setForceShowIcon
            int r1 = r0.hashCode()
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r1) {
                case 1537: goto L_0x0021;
                case 1538: goto L_0x0017;
                case 1539: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x002b
        L_0x000d:
            java.lang.String r1 = "03"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002b
            r0 = r2
            goto L_0x002c
        L_0x0017:
            java.lang.String r1 = "02"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002b
            r0 = r3
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "01"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002b
            r0 = r4
            goto L_0x002c
        L_0x002b:
            r0 = -1
        L_0x002c:
            r1 = 6
            if (r0 == 0) goto L_0x00b3
            r5 = 5
            if (r0 == r3) goto L_0x0082
            if (r0 != r2) goto L_0x00c6
            android.widget.TextView r0 = r6.ref1Label
            java.lang.String r2 = r7.setIcon
            r0.setText(r2)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref1EditText
            java.lang.String r2 = r7.setChecked
            r0.setHint(r2)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref1EditText
            r0.setImeOptions(r5)
            android.widget.TextView r0 = r6.ref2Label
            java.lang.String r2 = r7.setPadding
            r0.setText(r2)
            android.widget.TextView r0 = r6.ref2Label
            r0.setVisibility(r4)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref2EditText
            java.lang.String r2 = r7.AppCompatViewInflater
            r0.setHint(r2)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref2EditText
            r0.setVisibility(r4)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref2EditText
            r0.setImeOptions(r5)
            android.widget.TextView r0 = r6.ref3Label
            java.lang.String r2 = r7.setItemInvoker
            r0.setText(r2)
            android.widget.TextView r0 = r6.ref3Label
            r0.setVisibility(r4)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref3EditText
            java.lang.String r7 = r7.ActionMenuItemView
            r0.setHint(r7)
            com.scb.phone.view.custom.ScbEditText r7 = r6.ref3EditText
            r7.setVisibility(r4)
            com.scb.phone.view.custom.ScbEditText r7 = r6.ref3EditText
            r7.setImeOptions(r1)
            return
        L_0x0082:
            android.widget.TextView r0 = r6.ref1Label
            java.lang.String r2 = r7.setIcon
            r0.setText(r2)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref1EditText
            java.lang.String r2 = r7.setChecked
            r0.setHint(r2)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref1EditText
            r0.setImeOptions(r5)
            android.widget.TextView r0 = r6.ref2Label
            java.lang.String r2 = r7.setPadding
            r0.setText(r2)
            android.widget.TextView r0 = r6.ref2Label
            r0.setVisibility(r4)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref2EditText
            java.lang.String r7 = r7.AppCompatViewInflater
            r0.setHint(r7)
            com.scb.phone.view.custom.ScbEditText r7 = r6.ref2EditText
            r7.setVisibility(r4)
            com.scb.phone.view.custom.ScbEditText r7 = r6.ref2EditText
            r7.setImeOptions(r1)
            return
        L_0x00b3:
            android.widget.TextView r0 = r6.ref1Label
            java.lang.String r2 = r7.setIcon
            r0.setText(r2)
            com.scb.phone.view.custom.ScbEditText r0 = r6.ref1EditText
            java.lang.String r7 = r7.setChecked
            r0.setHint(r7)
            com.scb.phone.view.custom.ScbEditText r7 = r6.ref1EditText
            r7.setImeOptions(r1)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionInputFragment.IconCompatParcelizer(o.CrashlyticsReport$Session$Event$Application$Execution):void");
    }
}

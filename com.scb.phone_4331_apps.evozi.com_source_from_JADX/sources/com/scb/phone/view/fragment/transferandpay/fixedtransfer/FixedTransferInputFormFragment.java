package com.scb.phone.view.fragment.transferandpay.fixedtransfer;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferReviewActivity;
import com.scb.phone.view.adapter.fixedtransfer.FixedTransferSubDepositAdapter;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.AndroidServiceBuilder_ScbFcmMessagingService;
import p040o.C10157tJ;
import p040o.C10158tL;
import p040o.C7501tI;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.GoogleSigninService;
import p040o.HmlPinActivity;
import p040o.IGoogleMapDelegate;
import p040o.ImageReviewActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ProcessActivity_MembersInjector;
import p040o.getKernelIDSrcIn;
import p040o.isUndefined;
import p040o.onImageProcessed;
import p040o.parseEventApp;
import p040o.parseEventExecutionException;
import p040o.parseSession;
import p040o.setLastBaselineToBottomHeight;
import p040o.setMaxHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.show;
import p040o.startActivityForResult_aroundBody2;

public class FixedTransferInputFormFragment extends BaseFragment implements isUndefined {
    private static String IconCompatParcelizer = "display_extra";
    private static String MediaBrowserCompat$CustomActionResultReceiver = "transfer_to_main";
    private FixedTransferSubDepositAdapter MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat;
    private getKernelIDSrcIn RatingCompat;
    @BindView
    Button btReview;
    @BindView
    CheckBox cbSelectorSelectAllDeposit;
    @BindView
    EditText etEnterAccountNumber;
    @BindView
    NoteEditText etNote;
    @HmlPinActivity
    public C7501tI fixedTransferInputFormPresenter;
    @BindView
    ImageView ivCollapse;
    @BindView
    ImageView ivEdit;
    @BindView
    ImageView ivIcon;
    @BindView
    LinearLayout llInputAccountNumberContainer;
    @BindView
    LinearLayout llSelectDepositContainer;
    @BindView
    LinearLayout llSelectDepositSelectorContainer;
    @BindView
    RecyclerView rvDeposit;
    @BindView
    TextView tvAccountNumber;
    @BindView
    TextView tvAccountTitle;
    @BindView
    TextView tvLabelNoDeposit;
    @BindView
    TextView tvSelectedDeposits;

    public static FixedTransferInputFormFragment MediaBrowserCompat$ItemReceiver(parseSession parsesession, String str, boolean z, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(IconCompatParcelizer, parsesession);
        bundle.putString("com.scb.phone.EXTRA_ACCOUNT_NUMBER", str);
        bundle.putBoolean(MediaBrowserCompat$CustomActionResultReceiver, z);
        bundle.putString("source", str2);
        FixedTransferInputFormFragment fixedTransferInputFormFragment = new FixedTransferInputFormFragment();
        fixedTransferInputFormFragment.setArguments(bundle);
        return fixedTransferInputFormFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87522131493979, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fixedTransferInputFormPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        parseEventApp parseeventapp;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            parseeventapp = arguments.containsKey(IconCompatParcelizer) ? (parseEventApp) arguments.getParcelable(IconCompatParcelizer) : null;
            str = arguments.containsKey("com.scb.phone.EXTRA_ACCOUNT_NUMBER") ? arguments.getString("com.scb.phone.EXTRA_ACCOUNT_NUMBER") : null;
        } else {
            str = null;
            parseeventapp = null;
        }
        boolean z = false;
        if (parseeventapp != null) {
            C7501tI tIVar = this.fixedTransferInputFormPresenter;
            tIVar.write = parseeventapp;
            tIVar.MediaMetadataCompat = str;
            ImageReviewActivity.C6917a aVar = new ImageReviewActivity.C6917a(parseeventapp);
            if (tIVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                aVar.IconCompatParcelizer(tIVar.RatingCompat);
            }
            tIVar.read();
            this.RatingCompat = new getKernelIDSrcIn();
            String AbsActionBarView = AbsActionBarView();
            this.MediaDescriptionCompat = AbsActionBarView;
            this.RatingCompat.read(AbsActionBarView);
            this.RatingCompat.MediaBrowserCompat$ItemReceiver(this.fixedTransferInputFormPresenter.write.RatingCompat.toString());
            getKernelIDSrcIn getkernelidsrcin = this.RatingCompat;
            if (getActivity() != null) {
                getkernelidsrcin.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "transfer_input");
                return;
            }
            return;
        }
        this.ivEdit.setOnClickListener((View.OnClickListener) null);
        this.etEnterAccountNumber.setInputType(0);
        this.ivCollapse.setOnClickListener((View.OnClickListener) null);
        this.cbSelectorSelectAllDeposit.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.btReview.setOnClickListener((View.OnClickListener) null);
    }

    public void onDestroy() {
        this.RatingCompat = null;
        super.onDestroy();
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes, IGoogleMapDelegate iGoogleMapDelegate) {
        Intent intent = new Intent(getContext(), TransferReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TYPE", iGoogleMapDelegate);
        intent.putExtra("source", this.MediaDescriptionCompat);
        intent.putExtra("subtype", this.fixedTransferInputFormPresenter.write.RatingCompat.toString());
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

    public final void MediaMetadataCompat() {
        this.etNote.write();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindDeejungPlansFragment.read(this.ivCollapse);
        this.llSelectDepositSelectorContainer.setVisibility(0);
    }

    public final void read() {
        FragmentBuilder_BindDeejungPlansFragment.read(this.ivCollapse);
        this.llSelectDepositSelectorContainer.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<parseEventExecutionException> list) {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver = list;
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer.write();
    }

    public final void write(long j) {
        this.tvSelectedDeposits.setText(getString(R.string.selected_deposit, Long.valueOf(j)));
    }

    public final void IconCompatParcelizer() {
        if (!this.cbSelectorSelectAllDeposit.isChecked()) {
            this.cbSelectorSelectAllDeposit.setChecked(true);
        }
    }

    public final void RatingCompat() {
        if (this.cbSelectorSelectAllDeposit.isChecked()) {
            this.cbSelectorSelectAllDeposit.setChecked(false);
        }
    }

    public final void write() {
        this.btReview.setEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.btReview.setEnabled(false);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void navigateBack(View view) {
        Context context = getContext();
        if (context != null) {
            Intent intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_BACK_STEP");
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_FUNCTION", "FIXED_TRANSFER");
            context.sendBroadcast(intent);
        }
    }

    /* access modifiers changed from: package-private */
    @OnTextChanged
    public void onEditAccountNumberChange(CharSequence charSequence, int i, int i2, int i3) {
        C7501tI tIVar = this.fixedTransferInputFormPresenter;
        tIVar.write.MediaBrowserCompat$CustomActionResultReceiver = charSequence.toString();
        tIVar.read();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onExpandMoreClick(View view) {
        C7501tI tIVar = this.fixedTransferInputFormPresenter;
        boolean z = false;
        if (tIVar.MediaBrowserCompat$SearchResultReceiver) {
            tIVar.MediaBrowserCompat$SearchResultReceiver = false;
            C10157tJ tJVar = C10157tJ.MediaBrowserCompat$ItemReceiver;
            if (tIVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                tJVar.IconCompatParcelizer(tIVar.RatingCompat);
                return;
            }
            return;
        }
        tIVar.MediaBrowserCompat$SearchResultReceiver = true;
        C10158tL tLVar = C10158tL.MediaBrowserCompat$CustomActionResultReceiver;
        if (tIVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            tLVar.IconCompatParcelizer(tIVar.RatingCompat);
        }
    }

    /* access modifiers changed from: package-private */
    @OnCheckedChanged
    public void onSelectAllSubDepositCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            C7501tI tIVar = this.fixedTransferInputFormPresenter;
            List<parseEventExecutionException> list = tIVar.write.MediaBrowserCompat$ItemReceiver;
            show show = new show(list);
            ProcessActivity_MembersInjector processActivity_MembersInjector = new ProcessActivity_MembersInjector(z);
            while (show.IconCompatParcelizer.hasNext()) {
                processActivity_MembersInjector.MediaBrowserCompat$ItemReceiver(show.IconCompatParcelizer.next());
            }
            long MediaBrowserCompat$ItemReceiver = C7501tI.MediaBrowserCompat$ItemReceiver(list);
            tIVar.write.MediaBrowserCompat$ItemReceiver = list;
            boolean z2 = true;
            tIVar.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver > 0;
            startActivityForResult_aroundBody2 startactivityforresult_aroundbody2 = new startActivityForResult_aroundBody2(MediaBrowserCompat$ItemReceiver);
            if (tIVar.RatingCompat != null) {
                startactivityforresult_aroundbody2.IconCompatParcelizer(tIVar.RatingCompat);
            }
            onImageProcessed onimageprocessed = new onImageProcessed(list);
            if (tIVar.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                onimageprocessed.IconCompatParcelizer(tIVar.RatingCompat);
            }
            tIVar.read();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onReviewButtonClick(android.view.View r13) {
        /*
            r12 = this;
            o.tI r13 = r12.fixedTransferInputFormPresenter
            com.scb.phone.view.custom.common.NoteEditText r0 = r12.etNote
            android.widget.EditText r0 = r0.mNoteEditText
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            T r1 = r13.RatingCompat
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0016
            r1 = r3
            goto L_0x0017
        L_0x0016:
            r1 = r2
        L_0x0017:
            if (r1 == 0) goto L_0x0049
            if (r0 == 0) goto L_0x0023
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0023
            r1 = r2
            goto L_0x0024
        L_0x0023:
            r1 = r3
        L_0x0024:
            if (r1 != 0) goto L_0x0047
            java.lang.String r1 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
            java.util.regex.Matcher r0 = r1.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x0047
            o.startActivityForResult_aroundBody5$advice r0 = p040o.startActivityForResult_aroundBody5$advice.IconCompatParcelizer
            T r1 = r13.RatingCompat
            if (r1 == 0) goto L_0x003e
            r1 = r3
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            if (r1 == 0) goto L_0x0049
            T r13 = r13.RatingCompat
            r0.IconCompatParcelizer(r13)
            goto L_0x0049
        L_0x0047:
            r13 = r3
            goto L_0x004a
        L_0x0049:
            r13 = r2
        L_0x004a:
            if (r13 == 0) goto L_0x011f
            o.tI r13 = r12.fixedTransferInputFormPresenter
            android.widget.EditText r0 = r12.etEnterAccountNumber
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.scb.phone.view.custom.common.NoteEditText r1 = r12.etNote
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            o.startActivityForResult_aroundBody6 r4 = p040o.startActivityForResult_aroundBody6.read
            T r5 = r13.RatingCompat
            if (r5 == 0) goto L_0x006c
            r5 = r3
            goto L_0x006d
        L_0x006c:
            r5 = r2
        L_0x006d:
            if (r5 == 0) goto L_0x0074
            T r5 = r13.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x0074:
            o.ImageReviewActivity$1 r4 = p040o.ImageReviewActivity.C69181.IconCompatParcelizer
            T r5 = r13.RatingCompat
            if (r5 == 0) goto L_0x007c
            r5 = r3
            goto L_0x007d
        L_0x007c:
            r5 = r2
        L_0x007d:
            if (r5 == 0) goto L_0x0084
            T r5 = r13.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x0084:
            o.parseEventApp r4 = r13.write
            java.util.List<o.parseEventExecutionException> r4 = r4.MediaBrowserCompat$ItemReceiver
            if (r4 != 0) goto L_0x0090
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            goto L_0x00ca
        L_0x0090:
            o.show r5 = new o.show
            r5.<init>(r4)
            o.AbstractIdleService r4 = p040o.AbstractIdleService.MediaBrowserCompat$CustomActionResultReceiver
            o.show r6 = new o.show
            o.AppCompatSeekBar r7 = r5.write
            o.getNextTransition r8 = new o.getNextTransition
            java.util.Iterator<? extends T> r5 = r5.IconCompatParcelizer
            r8.<init>(r5, r4)
            r6.<init>(r7, r8)
            o.AbstractExecutionThreadService$2 r4 = p040o.AbstractExecutionThreadService.C29982.MediaBrowserCompat$ItemReceiver
            o.show r5 = new o.show
            o.AppCompatSeekBar r7 = r6.write
            o.getSharedElementEnterTransition r8 = new o.getSharedElementEnterTransition
            java.util.Iterator<? extends T> r6 = r6.IconCompatParcelizer
            r8.<init>(r6, r4)
            r5.<init>(r7, r8)
            o.setupDialog$IconCompatParcelizer r4 = new o.setupDialog$IconCompatParcelizer
            o.setupDialog$1 r6 = new o.setupDialog$1
            r6.<init>()
            o.setupDialog$8 r7 = new o.setupDialog$8
            r7.<init>()
            r4.<init>(r6, r7)
            java.lang.Object r4 = r5.write(r4)
            java.util.List r4 = (java.util.List) r4
        L_0x00ca:
            r9 = r4
            o.parseEventApp r4 = r13.write
            java.lang.String r4 = r4.read
            o.parseEventApp r5 = r13.write
            o.IGoogleMapDelegate r11 = r5.RatingCompat
            o.parseEventApp r5 = r13.write
            java.lang.String r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            if (r5 == 0) goto L_0x00e1
            int r5 = r5.length()
            if (r5 == 0) goto L_0x00e1
            r5 = r2
            goto L_0x00e2
        L_0x00e1:
            r5 = r3
        L_0x00e2:
            r5 = r5 ^ r3
            if (r5 == 0) goto L_0x00e9
            o.parseEventApp r0 = r13.write
            java.lang.String r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
        L_0x00e9:
            r8 = r0
            o.wrapList r0 = r13.read
            java.lang.String r6 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((p040o.IGoogleMapDelegate) r11)
            java.lang.String r7 = r13.MediaMetadataCompat
            if (r1 == 0) goto L_0x00fb
            int r5 = r1.length()
            if (r5 == 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r2 = r3
        L_0x00fc:
            if (r2 == 0) goto L_0x0101
            r1 = 0
            r10 = r1
            goto L_0x0107
        L_0x0101:
            o.paddedPartition r2 = new o.paddedPartition
            r2.<init>(r1)
            r10 = r2
        L_0x0107:
            o.Interners$WeakInterner$1 r1 = new o.Interners$WeakInterner$1
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            o.AbstractMultimap$MultisetEntry r0 = r0.IconCompatParcelizer
            o.DebitCardResetOtpActivity r0 = r0.MediaBrowserCompat$ItemReceiver((p040o.Interners.WeakInterner.C97691) r1)
            o.wrapList r1 = r13.read
            o.tI$read r2 = new o.tI$read
            o.onInfoWindowLongClick r3 = r13.MediaBrowserCompat$ItemReceiver
            r2.<init>(r11, r4, r3)
            r1.write(r0, r2)
        L_0x011f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.fixedtransfer.FixedTransferInputFormFragment.onReviewButtonClick(android.view.View):void");
    }

    public final void write(parseEventApp parseeventapp) {
        if (getContext() != null) {
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(getContext(), setLastBaselineToBottomHeight.write(getContext(), R.drawable.bankicon_place_holder), this.ivIcon, parseeventapp.read, getContext().getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
        }
        this.tvAccountTitle.setText(parseeventapp.MediaDescriptionCompat);
        if (!TextUtils.isEmpty(parseeventapp.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.llInputAccountNumberContainer.setVisibility(8);
            this.tvAccountNumber.setVisibility(0);
            this.tvAccountNumber.setText(parseeventapp.write);
        } else {
            this.llInputAccountNumberContainer.setVisibility(0);
            this.tvAccountNumber.setVisibility(8);
        }
        this.ivEdit.setVisibility(!(getArguments() != null && getArguments().getBoolean(MediaBrowserCompat$CustomActionResultReceiver, false)) ? 0 : 8);
        List<parseEventExecutionException> list = parseeventapp.MediaBrowserCompat$ItemReceiver;
        if (list == null || list.isEmpty()) {
            this.tvLabelNoDeposit.setVisibility(0);
            this.llSelectDepositContainer.setVisibility(8);
            return;
        }
        this.tvLabelNoDeposit.setVisibility(8);
        this.llSelectDepositContainer.setVisibility(0);
        FragmentBuilder_BindDeejungPlansFragment.read(this.ivCollapse);
        this.tvSelectedDeposits.setText(getString(R.string.selected_deposit, 0));
        RecyclerView recyclerView = this.rvDeposit;
        getActivity();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.rvDeposit.setItemAnimator(new setMaxHeight());
        this.rvDeposit.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        this.rvDeposit.setNestedScrollingEnabled(false);
        FixedTransferSubDepositAdapter fixedTransferSubDepositAdapter = new FixedTransferSubDepositAdapter(list);
        this.MediaBrowserCompat$MediaItem = fixedTransferSubDepositAdapter;
        fixedTransferSubDepositAdapter.read = new AndroidServiceBuilder_ScbFcmMessagingService(this.fixedTransferInputFormPresenter);
        this.rvDeposit.setAdapter(this.MediaBrowserCompat$MediaItem);
    }
}

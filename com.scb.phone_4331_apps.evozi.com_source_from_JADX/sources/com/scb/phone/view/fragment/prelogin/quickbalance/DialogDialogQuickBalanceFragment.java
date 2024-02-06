package com.scb.phone.view.fragment.prelogin.quickbalance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.quickbalance.ModifyQuickBalanceActivity;
import com.scb.phone.view.custom.common.CustomRecentTransaction;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.C4428fj;
import p040o.C4432fm;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getArch;
import p040o.getBottomRightCornerHeight;
import p040o.setTapText;

public class DialogDialogQuickBalanceFragment extends BaseFragment implements getBottomRightCornerHeight.IconCompatParcelizer {
    private String MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public C4432fm dialogQuickBalancePresenter;
    @BindView
    LinearLayout lastTransactions;
    @BindView
    TextView lastTransactionsText;
    @BindView
    RelativeLayout mCloseIcon;
    @BindView
    LinearLayout mContentDialog;
    @BindView
    LinearLayout mFooterDialog;
    @BindView
    RelativeLayout mHeaderDialog;
    @BindView
    TextView mTitle;
    @BindView
    TextView name;
    @BindView
    TextView totalAmount;

    public static DialogDialogQuickBalanceFragment MediaBrowserCompat$ItemReceiver(getArch getarch) {
        Bundle bundle = new Bundle();
        DialogDialogQuickBalanceFragment dialogDialogQuickBalanceFragment = new DialogDialogQuickBalanceFragment();
        bundle.putParcelable("com.scb.phone.EXTRA_QUICK_BALANCE_DISPLAY", getarch);
        dialogDialogQuickBalanceFragment.setArguments(bundle);
        return dialogDialogQuickBalanceFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f92372131494464, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.dialogQuickBalancePresenter.MediaBrowserCompat$ItemReceiver(this);
        C4432fm fmVar = this.dialogQuickBalancePresenter;
        C4428fj fjVar = new C4428fj((getArch) getArguments().getParcelable("com.scb.phone.EXTRA_QUICK_BALANCE_DISPLAY"));
        if (fmVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            fjVar.IconCompatParcelizer(fmVar.RatingCompat);
        }
        return inflate;
    }

    public final void write(getArch getarch) {
        int i;
        Context context;
        this.mTitle.setText(getContext().getString(R.string.quick_balance));
        if (getarch != null && getarch.MediaBrowserCompat$ItemReceiver() != null) {
            for (int i2 = 0; i2 < getarch.MediaBrowserCompat$ItemReceiver().size(); i2++) {
                this.MediaBrowserCompat$CustomActionResultReceiver = getarch.MediaBrowserCompat$ItemReceiver().get(i2).AppCompatViewInflater;
                int i3 = 2;
                if (getarch.MediaBrowserCompat$CustomActionResultReceiver == null || getarch.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                    this.name.setText(String.format("%s\n%s", new Object[]{getarch.MediaBrowserCompat$ItemReceiver().get(i2).AppCompatDialogFragment, getarch.MediaBrowserCompat$ItemReceiver().get(i2).MediaBrowserCompat$ItemReceiver}));
                } else {
                    this.name.setText(String.format("%s\n%s", new Object[]{getarch.MediaBrowserCompat$CustomActionResultReceiver, getarch.MediaBrowserCompat$ItemReceiver().get(i2).MediaBrowserCompat$ItemReceiver}));
                }
                this.totalAmount.setText(getarch.IconCompatParcelizer());
                if (getarch.MediaBrowserCompat$ItemReceiver().get(i2).setHasDecor != null) {
                    if (getarch.MediaBrowserCompat$ItemReceiver().get(i2).setHasDecor.size() <= 2) {
                        i3 = getarch.MediaBrowserCompat$ItemReceiver().get(i2).setHasDecor.size();
                    }
                    for (int i4 = 0; i4 < i3; i4++) {
                        this.lastTransactions.addView(new CustomRecentTransaction(getContext(), getarch.MediaBrowserCompat$ItemReceiver().get(i2).setHasDecor.get(i4)));
                    }
                }
                TextView textView = this.lastTransactionsText;
                if (getarch.MediaBrowserCompat$ItemReceiver().get(i2).setHasDecor.size() > 0) {
                    context = getContext();
                    i = R.string.account_summary_last_transaction;
                } else {
                    context = getContext();
                    i = R.string.account_summary_no_last_transaction;
                }
                textView.setText(context.getString(i));
            }
        }
    }

    @OnClick
    public void onModifyClicked() {
        Intent intent = new Intent(getContext(), ModifyQuickBalanceActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_QUICK_BALANCE_MODIFY_DISPLAY", this.MediaBrowserCompat$CustomActionResultReceiver);
        if (getActivity() != null) {
            FragmentActivity activity = getActivity();
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(activity, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                activity.startActivityForResult(read, 0);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void onCloseClicked() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void onDestroy() {
        this.dialogQuickBalancePresenter.onDestroy();
        super.onDestroy();
    }
}

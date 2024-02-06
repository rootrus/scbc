package com.scb.phone.view.fragment.directdebit;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.directdebit.DirectDebitInputActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C5203rU;
import p040o.C7084x69fb5f23;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTRSV;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.toLongArray;
import p040o.writeUInt64NoTag;

public final class DirectDebitTermsAndConditionsFragment extends BaseFragment implements C7084x69fb5f23, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    private ZTRSV IconCompatParcelizer;
    @HmlPinActivity
    public C5203rU presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static final /* synthetic */ ZTRSV IconCompatParcelizer(DirectDebitTermsAndConditionsFragment directDebitTermsAndConditionsFragment) {
        ZTRSV ztrsv = directDebitTermsAndConditionsFragment.IconCompatParcelizer;
        if (ztrsv == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        return ztrsv;
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_layout_terms_and_conditions, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        this.IconCompatParcelizer = new ZTRSV();
        C5203rU rUVar = this.presenter;
        if (rUVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        rUVar.MediaBrowserCompat$ItemReceiver(this);
        C5203rU rUVar2 = this.presenter;
        if (rUVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        immediateFailedFuture MediaBrowserCompat$CustomActionResultReceiver2 = toLongArray.MediaBrowserCompat$CustomActionResultReceiver(rUVar2.MediaBrowserCompat$ItemReceiver, (String) null, "DIRECT_DEBIT", (String) null, (String) null, true, false, (String) null, 72);
        boolean z = true;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = true;
        writeUInt64NoTag.IconCompatParcelizer write2 = new C5203rU.write(MediaBrowserCompat$CustomActionResultReceiver2);
        if (rUVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write2.IconCompatParcelizer(rUVar2.RatingCompat);
        }
        View inflate = layoutInflater.inflate(R.layout.f86292131493856, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isTaskRoot()) {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        mo15340x50fd9e4a(false);
    }

    public final void read() {
        Context requireContext = requireContext();
        DirectDebitInputActivity.IconCompatParcelizer iconCompatParcelizer = DirectDebitInputActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext2 = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext2, "requireContext()");
        onGetStartedClick.write((Object) requireContext2, "context");
        onGetStartedClick.write((Object) "tile", "source");
        Intent putExtra = new Intent(requireContext2, DirectDebitInputActivity.class).putExtra("source", "tile");
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, DirectDe…acker.KEY_SOURCE, source)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(requireContext, putExtra).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(requireContext.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            requireContext.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void onDestroyView() {
        C5203rU rUVar = this.presenter;
        if (rUVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        rUVar.onDestroy();
        super.onDestroyView();
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog.IconCompatParcelizer((Context) getActivity()).MediaBrowserCompat$ItemReceiver((int) R.string.auto_direct_debit_accept_terms_and_conditions).IconCompatParcelizer((int) R.string.auto_direct_debit_accept_terms_and_conditions_description).IconCompatParcelizer(getString(R.string.tc_agree_dialog_positive_accept_button), new C5911xbf321e28(this)).MediaBrowserCompat$ItemReceiver(getString(R.string.tc_agree_dialog_negative_button), C5912xe79942f7.IconCompatParcelizer).show();
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ DirectDebitTermsAndConditionsFragment IconCompatParcelizer;

        write(DirectDebitTermsAndConditionsFragment directDebitTermsAndConditionsFragment) {
            this.IconCompatParcelizer = directDebitTermsAndConditionsFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C5203rU rUVar = this.IconCompatParcelizer.presenter;
            if (rUVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C5203rU.read.read;
            if (rUVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(rUVar.RatingCompat);
            }
            dialogInterface.dismiss();
        }
    }

    public final void write(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) getActivity()).MediaBrowserCompat$ItemReceiver((int) R.string.auto_direct_debit_decline_terms_and_conditions).IconCompatParcelizer((int) R.string.auto_direct_debit_decline_terms_and_conditions_description);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.tc_investment_decline_dialog_positive_button), new write(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.tc_investment_decline_dialog_negative_button), IconCompatParcelizer.read).show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void setContentView() {
        requireActivity().finish();
    }
}

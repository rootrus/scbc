package com.scb.phone.view.fragment.bankingagent;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import p040o.C1388iy;
import p040o.C6379x9b5721a5;
import p040o.CardView;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.UpdateAppSpiCall;
import p040o.UpdateAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.UpdateAppSpiCall$MediaBrowserCompat$ItemReceiver;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.toLongArray;
import p040o.writeUInt64NoTag;

public final class BankingAgentTCFragment extends BaseFragment implements C6379x9b5721a5, FragmentBuilder_BindCustomizeYourPageFragment {
    private C1388iy IconCompatParcelizer;
    @HmlPinActivity
    public UpdateAppSpiCall presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        TermsAndConditionsFragment MediaBrowserCompat$CustomActionResultReceiver = TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture);
        CardView read2 = getChildFragmentManager().read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "childFragmentManager.beginTransaction()");
        read2.MediaBrowserCompat$ItemReceiver(R.id.frame_layout_terms_and_conditions, MediaBrowserCompat$CustomActionResultReceiver).write();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        UpdateAppSpiCall updateAppSpiCall = this.presenter;
        if (updateAppSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        updateAppSpiCall.MediaBrowserCompat$ItemReceiver(this);
        UpdateAppSpiCall updateAppSpiCall2 = this.presenter;
        if (updateAppSpiCall2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer updateAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver = new UpdateAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(updateAppSpiCall2.read, (String) null, updateAppSpiCall2.write, (String) null, (String) null, true, false, (String) null, 72));
        if (updateAppSpiCall2.RatingCompat != null) {
            updateAppSpiCall$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(updateAppSpiCall2.RatingCompat);
        }
        View inflate = layoutInflater.inflate(R.layout.f85722131493799, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttach(android.content.Context r3) {
        /*
            r2 = this;
            super.onAttach(r3)
            androidx.fragment.app.Fragment r0 = r2.getParentFragment()
            boolean r1 = r3 instanceof p040o.C1388iy
            if (r1 != 0) goto L_0x0012
            boolean r3 = r0 instanceof p040o.C1388iy
            if (r3 == 0) goto L_0x0011
            r3 = r0
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            o.iy r3 = (p040o.C1388iy) r3
            r2.IconCompatParcelizer = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.bankingagent.BankingAgentTCFragment.onAttach(android.content.Context):void");
    }

    public final void onDetach() {
        this.IconCompatParcelizer = null;
        super.onDetach();
    }

    public final void read() {
        C1388iy iyVar = this.IconCompatParcelizer;
        if (iyVar != null) {
            iyVar.setContentView();
        }
    }

    public final void write() {
        C1388iy iyVar = this.IconCompatParcelizer;
        if (iyVar != null) {
            iyVar.AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    public final void onDestroy() {
        UpdateAppSpiCall updateAppSpiCall = this.presenter;
        if (updateAppSpiCall == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        updateAppSpiCall.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog.IconCompatParcelizer((Context) getActivity()).MediaBrowserCompat$ItemReceiver((int) R.string.banking_agent_tc_dialog_title).IconCompatParcelizer((int) R.string.banking_agent_tc_dialog_body).MediaBrowserCompat$ItemReceiver(getString(R.string.banking_agent_tc_dialog_neg), read.write).IconCompatParcelizer(getString(R.string.banking_agent_tc_dialog_pos), new C5856x6b3201cb(this)).show();
    }

    static final class read implements DialogInterface.OnClickListener {
        public static final read write = new read();

        read() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void write(String str) {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) getActivity()).MediaBrowserCompat$ItemReceiver((int) R.string.banking_agent_tc_decline_dialog_title).IconCompatParcelizer((int) R.string.banking_agent_tc_decline_dialog_body);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.banking_agent_tc_decline_dialog_pos), new write(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.banking_agent_tc_decline_dialog_neg), IconCompatParcelizer.write).show();
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ BankingAgentTCFragment write;

        write(BankingAgentTCFragment bankingAgentTCFragment) {
            this.write = bankingAgentTCFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            UpdateAppSpiCall updateAppSpiCall = this.write.presenter;
            if (updateAppSpiCall == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = UpdateAppSpiCall$MediaBrowserCompat$ItemReceiver.read;
            if (updateAppSpiCall.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(updateAppSpiCall.RatingCompat);
            }
        }
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

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

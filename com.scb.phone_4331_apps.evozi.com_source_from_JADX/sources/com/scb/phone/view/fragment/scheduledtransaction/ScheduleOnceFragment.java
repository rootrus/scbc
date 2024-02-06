package com.scb.phone.view.fragment.scheduledtransaction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.scheduledtransaction.CalendarDialogActivity;
import com.scb.phone.view.custom.common.ScheduleDate;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CheckCaptureActivity;
import p040o.FragmentBuilder_BindCloseAccountSelectionOtherFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getImageTooDark;
import p040o.getRamUsed;
import p040o.setTapText;

public class ScheduleOnceFragment extends BaseFragment implements FragmentBuilder_BindCloseAccountSelectionOtherFragment {
    private getImageTooDark IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private OffsetDateTime MediaBrowserCompat$SearchResultReceiver;
    @BindView
    ScheduleDate paymentDate;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89752131494202, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        OffsetDateTime plusDays = this.IconCompatParcelizer.read().MediaBrowserCompat$ItemReceiver.plusDays(1);
        this.MediaBrowserCompat$SearchResultReceiver = plusDays;
        this.IconCompatParcelizer.write(new getRamUsed("O", plusDays.toString(), this.MediaBrowserCompat$SearchResultReceiver.toString(), ""), "O");
        this.paymentDate.setOnSelectDateListener(this);
        this.paymentDate.setDateHint(getString(R.string.schedule_setup_once_select_date));
        return inflate;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        if (i == 0 && i2 == -1) {
            this.MediaBrowserCompat$SearchResultReceiver = (OffsetDateTime) intent.getSerializableExtra("com.scb.phone.EXTRA_DATE");
            Context requireContext = requireContext();
            this.paymentDate.setDateField(CheckCaptureActivity.read(requireContext.getResources(), "dd MMM yyyy", this.MediaBrowserCompat$SearchResultReceiver));
            this.IconCompatParcelizer.write();
            this.IconCompatParcelizer.write(new getRamUsed("O", this.MediaBrowserCompat$SearchResultReceiver.toString(), this.MediaBrowserCompat$SearchResultReceiver.toString(), ""), "O");
        }
    }

    public final void read() {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            Intent read = CalendarDialogActivity.read(getContext(), 0, (OffsetDateTime) null, (OffsetDateTime) null, this.IconCompatParcelizer.read().RatingCompat, this.IconCompatParcelizer.read().read, this.IconCompatParcelizer.read().MediaBrowserCompat$ItemReceiver);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(read, 0);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.IconCompatParcelizer != null) {
            return;
        }
        if (context instanceof getImageTooDark) {
            this.IconCompatParcelizer = (getImageTooDark) context;
        } else if (getParentFragment() instanceof getImageTooDark) {
            this.IconCompatParcelizer = (getImageTooDark) getParentFragment();
        } else {
            throw new ClassCastException();
        }
    }

    public void onDetach() {
        super.onDetach();
        this.IconCompatParcelizer = null;
    }
}

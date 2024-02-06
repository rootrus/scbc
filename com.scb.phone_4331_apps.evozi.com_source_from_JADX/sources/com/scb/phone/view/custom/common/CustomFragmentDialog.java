package com.scb.phone.view.custom.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.prelogin.quickbalance.DialogDialogQuickBalanceFragment;
import p040o.getArch;

public class CustomFragmentDialog extends DialogFragment {
    private int write;

    public static CustomFragmentDialog read(getArch getarch) {
        Bundle bundle = new Bundle();
        CustomFragmentDialog customFragmentDialog = new CustomFragmentDialog();
        bundle.putInt("FRAGMENT_TYPE", 3);
        bundle.putParcelable("com.scb.phone.EXTRA_QUICK_BALANCE_DISPLAY", getarch);
        customFragmentDialog.setArguments(bundle);
        return customFragmentDialog;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f81962131493422, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.write = getArguments().getInt("FRAGMENT_TYPE");
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DialogDialogQuickBalanceFragment MediaBrowserCompat$ItemReceiver = this.write == 3 ? DialogDialogQuickBalanceFragment.MediaBrowserCompat$ItemReceiver((getArch) getArguments().getParcelable("com.scb.phone.EXTRA_QUICK_BALANCE_DISPLAY")) : null;
        if (MediaBrowserCompat$ItemReceiver != null) {
            getChildFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.dialog_fragment_container, MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        setStyle(1, R.style.f95602131820775);
        return new Dialog(getActivity(), getTheme()) {
            public final void onBackPressed() {
                if (CustomFragmentDialog.this.getActivity() != null) {
                    CustomFragmentDialog.this.getActivity().onBackPressed();
                }
            }
        };
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }
}

package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.onClickEditSelectedPurchases */
public final class onClickEditSelectedPurchases extends DeejungLandingActivity_ViewBinding implements FragmentBuilder_BindHmlNTBLoanSetupFragment {
    public boolean read;

    public onClickEditSelectedPurchases(String str, FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment) {
        super(str, fragmentBuilder_BindHmlExternalAuthenticationFragment);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView recyclerView, View view) {
        int i;
        if (this.read) {
            setTextAppearance settextappearance = this.IconCompatParcelizer.write.get(this.MediaBrowserCompat$CustomActionResultReceiver);
            setTextAppearance settextappearance2 = this.IconCompatParcelizer.read.get(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (settextappearance == null || settextappearance2 == null) {
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Elements where not created for interaction ");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(" yet");
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                return;
            }
            DeejungTransferLandingActivity deejungTransferLandingActivity = (DeejungTransferLandingActivity) settextappearance2.get(recyclerView);
            if (deejungTransferLandingActivity != null) {
                String IconCompatParcelizer = DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer("LI");
                String write2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.write(IconCompatParcelizer);
                if (recyclerView == null || view == null || !(recyclerView instanceof RecyclerView)) {
                    i = -1;
                } else {
                    i = RecyclerView.read(view);
                }
                IconCompatParcelizer(deejungTransferLandingActivity, view, i, settextappearance, IconCompatParcelizer, write2);
            }
        }
    }

    public final void read(RecyclerView recyclerView, View view) {
        if (this.read) {
            FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment = this.IconCompatParcelizer;
            setTextAppearance settextappearance = fragmentBuilder_BindHmlExternalAuthenticationFragment.write.get(this.MediaBrowserCompat$CustomActionResultReceiver);
            FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment2 = this.IconCompatParcelizer;
            setTextAppearance settextappearance2 = fragmentBuilder_BindHmlExternalAuthenticationFragment2.read.get(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (settextappearance == null || settextappearance2 == null) {
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Elements where not created for interaction ");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(" yet");
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                return;
            }
            DeejungTransferLandingActivity deejungTransferLandingActivity = (DeejungTransferLandingActivity) settextappearance2.get(view);
            if (deejungTransferLandingActivity == null) {
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, "No element have been found for removing child view");
            } else {
                read((DeejungTransferLandingActivity) settextappearance2.get(recyclerView), deejungTransferLandingActivity, settextappearance);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.read = true;
    }

    public final void IconCompatParcelizer() {
        this.read = false;
    }
}

package p040o;

import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.landingpage.PartnerWebViewFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributeDepositExportStatementActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDepositExportStatementActivity implements View.OnClickListener {
    private final /* synthetic */ PartnerWebViewFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeDepositExportStatementActivity(PartnerWebViewFragment partnerWebViewFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = partnerWebViewFragment;
    }

    public final void onClick(View view) {
        PartnerWebViewFragment partnerWebViewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        WeakReference<BaseActivity> weakReference = new WeakReference<>((BaseActivity) partnerWebViewFragment.getActivity());
        C6498x19dfc59c fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver = new C6498x19dfc59c((byte) 0);
        fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.write = weakReference;
        fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) partnerWebViewFragment.getActivity().getIntent().getParcelableExtra("com.scb.phone.EXTRA_REGISTRATION_TILE_DATA");
        FragmentBuilder_BindDepositMoreInfoFragment.read(fragmentBuilder_BindDepositMoreInfoFragment$MediaBrowserCompat$ItemReceiver);
    }
}

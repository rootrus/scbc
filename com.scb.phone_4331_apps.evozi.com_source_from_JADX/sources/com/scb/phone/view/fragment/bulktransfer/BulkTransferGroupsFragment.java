package com.scb.phone.view.fragment.bulktransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.bulktransfer.BulkTransferInputActivity;
import com.scb.phone.view.activity.bulktransfer.CreateRecipientGroupActivity;
import com.scb.phone.view.adapter.bulktransfer.BulkTransferGroupAdapter;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.AutoValue_InstallationTokenResult;
import p040o.C10865shutdown;
import p040o.C7380xc8902ede;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Service;
import p040o.SwitchCompat;
import p040o.addGetIdListener;
import p040o.deleteFavorite;
import p040o.readJSONFromFile;
import p040o.setTapText;
import p040o.setTokenExpirationTimestamp;
import p040o.withNoGeneratedFid;

public class BulkTransferGroupsFragment extends BaseFragment implements C7380xc8902ede {
    @HmlPinActivity
    public withNoGeneratedFid bulkTransferGroupsPresenter;
    @BindView
    TextView counterRecipientsTextView;
    @BindView
    DefaultButton createRecipientButton;
    @BindView
    RecyclerView groupsRecyclerView;

    public static BulkTransferGroupsFragment read(C10865shutdown shutdown) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_GROUPS", shutdown);
        BulkTransferGroupsFragment bulkTransferGroupsFragment = new BulkTransferGroupsFragment();
        bulkTransferGroupsFragment.setArguments(bundle);
        return bulkTransferGroupsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85892131493816, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.bulkTransferGroupsPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            withNoGeneratedFid withnogeneratedfid = this.bulkTransferGroupsPresenter;
            C10865shutdown shutdown = (C10865shutdown) getArguments().getParcelable("com.scb.phone.EXTRA_GROUPS");
            if ((withnogeneratedfid.RatingCompat != null) && shutdown != null) {
                setTokenExpirationTimestamp settokenexpirationtimestamp = new setTokenExpirationTimestamp(shutdown.MediaBrowserCompat$ItemReceiver);
                if (withnogeneratedfid.RatingCompat != null) {
                    settokenexpirationtimestamp.IconCompatParcelizer(withnogeneratedfid.RatingCompat);
                }
                addGetIdListener addgetidlistener = new addGetIdListener(shutdown);
                if (withnogeneratedfid.RatingCompat != null) {
                    addgetidlistener.IconCompatParcelizer(withnogeneratedfid.RatingCompat);
                }
                AutoValue_InstallationTokenResult.Builder builder = new AutoValue_InstallationTokenResult.Builder(shutdown);
                if (withnogeneratedfid.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    builder.IconCompatParcelizer(withnogeneratedfid.RatingCompat);
                }
            }
        }
        return inflate;
    }

    public void onDestroy() {
        super.onDestroy();
        this.bulkTransferGroupsPresenter.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<Service.State> list) {
        getContext();
        this.groupsRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        SwitchCompat.IconCompatParcelizer((View) this.groupsRecyclerView, false);
        this.groupsRecyclerView.setAdapter(new BulkTransferGroupAdapter(list, new deleteFavorite(this)));
    }

    public final void read(String str) {
        this.counterRecipientsTextView.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(getContext(), CreateRecipientGroupActivity.class);
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

    public final void IconCompatParcelizer(String str) {
        BulkTransferInputActivity.MediaBrowserCompat$ItemReceiver(getContext(), str);
    }

    public final void read(boolean z) {
        this.createRecipientButton.setButtonEnabled(z);
    }

    @OnClick
    public void createButtonClicked() {
        withNoGeneratedFid withnogeneratedfid = this.bulkTransferGroupsPresenter;
        readJSONFromFile readjsonfromfile = readJSONFromFile.read;
        if (withnogeneratedfid.RatingCompat != null) {
            readjsonfromfile.IconCompatParcelizer(withnogeneratedfid.RatingCompat);
        }
    }
}

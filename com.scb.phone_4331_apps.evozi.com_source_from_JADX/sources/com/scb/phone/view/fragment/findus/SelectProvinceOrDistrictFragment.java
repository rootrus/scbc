package com.scb.phone.view.fragment.findus;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.findus.SelectProvinceOrDistrictAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.CheckExtractor_MembersInjector;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.HmlPinActivity;
import p040o.access$2200;
import p040o.getOversizeImage;
import p040o.writeToFileBuffer;
import p040o.writeToFileBuffer$MediaBrowserCompat$ItemReceiver;

public class SelectProvinceOrDistrictFragment extends BaseFragment implements CheckExtractor_MembersInjector.read, FragmentBuilder_BindCcSofBillPaymentOnlyFragment {
    private String IconCompatParcelizer;
    @BindView
    RecyclerView mRecyclerView;
    @HmlPinActivity
    public writeToFileBuffer selectProvinceOrDistrictPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89792131494206, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.IconCompatParcelizer = getActivity().getIntent().getStringExtra("PROVINCE_NAME");
        }
        setTransitioning();
        boolean z = true;
        if (!this.IconCompatParcelizer.isEmpty()) {
            writeToFileBuffer writetofilebuffer = this.selectProvinceOrDistrictPresenter;
            String str = this.IconCompatParcelizer;
            if (writetofilebuffer.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writetofilebuffer.RatingCompat.Keep();
            }
            writetofilebuffer.write.IconCompatParcelizer(str);
            writetofilebuffer.write.IconCompatParcelizer(new writeToFileBuffer$MediaBrowserCompat$ItemReceiver(writetofilebuffer, (byte) 0));
        } else {
            writeToFileBuffer writetofilebuffer2 = this.selectProvinceOrDistrictPresenter;
            if (writetofilebuffer2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writetofilebuffer2.RatingCompat.Keep();
            }
            writetofilebuffer2.write.MediaBrowserCompat$ItemReceiver();
            writetofilebuffer2.write.IconCompatParcelizer(new writeToFileBuffer.read(writetofilebuffer2, (byte) 0));
        }
        this.selectProvinceOrDistrictPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onDestroy() {
        this.selectProvinceOrDistrictPresenter.onDestroy();
        super.onDestroy();
    }

    public final void setTransitioning() {
        super.setTransitioning();
        String str = this.IconCompatParcelizer;
        ParcelableVolumeInfo(getString((str == null || str.isEmpty()) ? R.string.province_place_holder : R.string.district_place_holder));
        setActionBarVisibilityCallback();
    }

    public final void read(int i) {
        String str;
        double d;
        double d2;
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_UPDATE_SELECTED_ITEM");
        intent.putExtra("PROVINCE_NAME", this.IconCompatParcelizer.isEmpty() ? this.selectProvinceOrDistrictPresenter.read.get(i) : this.IconCompatParcelizer);
        if (!this.IconCompatParcelizer.isEmpty()) {
            str = this.selectProvinceOrDistrictPresenter.IconCompatParcelizer.get(i).MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = getString(R.string.district_place_holder);
        }
        intent.putExtra("DISTRICT_NAME", str);
        if (!this.IconCompatParcelizer.isEmpty()) {
            d = this.selectProvinceOrDistrictPresenter.IconCompatParcelizer.get(i).write;
        } else {
            d = -99.0d;
        }
        intent.putExtra("DISTRICT_LAT", d);
        if (!this.IconCompatParcelizer.isEmpty()) {
            d2 = this.selectProvinceOrDistrictPresenter.IconCompatParcelizer.get(i).IconCompatParcelizer;
        } else {
            d2 = -189.0d;
        }
        intent.putExtra("DISTRICT_LON", d2);
        getContext().sendBroadcast(intent);
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void write(List<String> list) {
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager());
        this.mRecyclerView.setAdapter(new SelectProvinceOrDistrictAdapter(getContext(), list, this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String str = access_2200.IconCompatParcelizer;
            getOversizeImage getoversizeimage = getOversizeImage.ERROR;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.select_province_container_view, str, getoversizeimage);
            }
        }
    }
}

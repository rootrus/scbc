package com.scb.phone.view.fragment.closeaccount;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSelectionOwnSelectedFragment;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindBaseTakePhotoFragment;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.ReflectiveTypeAdapterFactory;
import p040o.StreetViewPanorama;
import p040o.access$2300;
import p040o.getKeyAdapter;
import p040o.setTitleMarginStart;

public class CloseAccountSelectionFragment extends BaseFragment implements IdCaptureModule.C6906b, FragmentBuilder_BindBaseTakePhotoFragment, CloseAccountSelectionOwnSelectedFragment.IconCompatParcelizer {
    @BindView
    TextView accountSourceSubtitle;
    @BindView
    TextView accountSourceTitle;
    @HmlPinActivity
    public ReflectiveTypeAdapterFactory.BoundField presenter;

    public static Fragment IconCompatParcelizer() {
        return new CloseAccountSelectionFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86242131493851, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ReflectiveTypeAdapterFactory.BoundField boundField = this.presenter;
        boundField.read.read();
        boundField.read.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>() {
            public final /* synthetic */ void onNext(Object obj) {
                BoundField boundField = BoundField.this;
                ArrayTypeAdapter arrayTypeAdapter = new ArrayTypeAdapter(this, (StreetViewPanorama.OnStreetViewPanoramaLongClickListener) obj);
                if (boundField.RatingCompat != null) {
                    arrayTypeAdapter.IconCompatParcelizer(boundField.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                if (!BoundField.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                    BoundField.this.MediaBrowserCompat$ItemReceiver(BoundField.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
                }
            }
        });
        return inflate;
    }

    public final void IconCompatParcelizer(CrashlyticsReport.FilesPayload.File.Builder builder) {
        this.accountSourceTitle.setText(builder.Keep);
        this.accountSourceSubtitle.setText(builder.read);
    }

    public final void read() {
        setTitleMarginStart childFragmentManager = getChildFragmentManager();
        Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("CloseAccountSelectionTagFragment");
        if (findFragmentByTag == null) {
            findFragmentByTag = CloseAccountSelectionTabFragment.IconCompatParcelizer();
        }
        childFragmentManager.read().MediaBrowserCompat$SearchResultReceiver().IconCompatParcelizer(R.id.fm_layout_container, findFragmentByTag, "CloseAccountSelectionTagFragment").write();
        Fragment findFragmentByTag2 = childFragmentManager.findFragmentByTag("CloseAccountSelectionOwnSelectedFragment");
        if (findFragmentByTag2 instanceof CloseAccountSelectionOwnSelectedFragment) {
            ((CloseAccountSelectionOwnSelectedFragment) findFragmentByTag2).reviewButton.setVisibility(4);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        getChildFragmentManager().read().MediaBrowserCompat$SearchResultReceiver().IconCompatParcelizer(R.id.fm_layout_container, CloseAccountSelectionOwnSelectedFragment.MediaBrowserCompat$CustomActionResultReceiver(), "CloseAccountSelectionOwnSelectedFragment").write();
    }

    public final void write() {
        ReflectiveTypeAdapterFactory.BoundField boundField = this.presenter;
        getKeyAdapter getkeyadapter = getKeyAdapter.read;
        if (boundField.RatingCompat != null) {
            getkeyadapter.IconCompatParcelizer(boundField.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ReflectiveTypeAdapterFactory.BoundField boundField = this.presenter;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = ReflectiveTypeAdapterFactory.read;
        if (boundField.RatingCompat != null) {
            reflectiveTypeAdapterFactory.IconCompatParcelizer(boundField.RatingCompat);
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}

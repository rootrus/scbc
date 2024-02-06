package com.scb.phone.view.fragment.investment.schedule;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.BubbleSelector;
import p040o.ActivityBuilder_ContributeCloseAccountDetailsActivity;
import p040o.C7119xba7ecac1;
import p040o.CrashlyticsCore;
import p040o.HmlPinActivity;
import p040o.getHoldSteadyMessage;
import p040o.getZoomInMessage;
import p040o.removeJustCapturedListener;
import p040o.removePageDetectionListener;

public class SetupScheduleWeeklyFragment extends BaseSetupScheduleFragment implements C7119xba7ecac1 {
    @BindView
    GridLayout grid;
    @HmlPinActivity
    public removePageDetectionListener presenter;

    /* access modifiers changed from: package-private */
    public final String write() {
        return "W";
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89922131494219, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        removePageDetectionListener removepagedetectionlistener = this.presenter;
        CrashlyticsCore.C32494 IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        removeJustCapturedListener removejustcapturedlistener = removeJustCapturedListener.MediaBrowserCompat$CustomActionResultReceiver;
        if (removepagedetectionlistener.RatingCompat != null) {
            removejustcapturedlistener.IconCompatParcelizer(removepagedetectionlistener.RatingCompat);
        }
        removepagedetectionlistener.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.IconCompatParcelizer.read);
        if (removepagedetectionlistener.read) {
            getZoomInMessage getzoominmessage = getZoomInMessage.read;
            if (removepagedetectionlistener.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getzoominmessage.IconCompatParcelizer(removepagedetectionlistener.RatingCompat);
            }
        } else {
            getHoldSteadyMessage getholdsteadymessage = getHoldSteadyMessage.IconCompatParcelizer;
            if (removepagedetectionlistener.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getholdsteadymessage.IconCompatParcelizer(removepagedetectionlistener.RatingCompat);
            }
        }
        return inflate;
    }

    public final void IconCompatParcelizer() {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            if (this.grid.getChildAt(i) instanceof BubbleSelector) {
                ((BubbleSelector) this.grid.getChildAt(i)).MediaBrowserCompat$ItemReceiver = new ActivityBuilder_ContributeCloseAccountDetailsActivity(this);
            }
        }
    }

    public final void write(String str) {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            if (this.grid.getChildAt(i) instanceof BubbleSelector) {
                BubbleSelector bubbleSelector = (BubbleSelector) this.grid.getChildAt(i);
                if (!bubbleSelector.write.equals(str)) {
                    bubbleSelector.setSelected(false);
                }
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}

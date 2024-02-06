package com.scb.phone.view.fragment.investment.schedule;

import android.content.Context;
import android.widget.TextView;
import butterknife.BindView;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.getImageWidth;
import p040o.getOutOfFocus;
import p040o.isProximityOn;

public abstract class BaseSetupScheduleFragment extends BaseFragment implements getImageWidth.IconCompatParcelizer {
    protected getOutOfFocus IconCompatParcelizer;
    @BindView
    TextView disclaimerTextView;

    /* access modifiers changed from: package-private */
    public abstract String write();

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.IconCompatParcelizer.write(write(), z);
    }

    public void read(isProximityOn isproximityon) {
        this.IconCompatParcelizer.read(write(), isproximityon);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.IconCompatParcelizer != null) {
            return;
        }
        if (context instanceof getOutOfFocus) {
            this.IconCompatParcelizer = (getOutOfFocus) context;
        } else if (getParentFragment() instanceof getOutOfFocus) {
            this.IconCompatParcelizer = (getOutOfFocus) getParentFragment();
        } else {
            throw new ClassCastException();
        }
    }

    public final void read(String str) {
        this.disclaimerTextView.setText(str);
    }
}

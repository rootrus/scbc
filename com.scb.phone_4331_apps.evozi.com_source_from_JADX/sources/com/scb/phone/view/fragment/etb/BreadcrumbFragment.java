package com.scb.phone.view.fragment.etb;

import android.content.Context;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C1346xf91fc122;
import p040o.getTimeOutParameters;

public abstract class BreadcrumbFragment extends BaseFragment implements C1346xf91fc122 {
    public getTimeOutParameters MediaMetadataCompat;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof getTimeOutParameters) {
            this.MediaMetadataCompat = (getTimeOutParameters) context;
        }
    }

    public void onStart() {
        super.onStart();
        getTimeOutParameters gettimeoutparameters = this.MediaMetadataCompat;
        if (gettimeoutparameters != null) {
            gettimeoutparameters.write((C1346xf91fc122) this);
        }
    }

    public void onDetach() {
        this.MediaMetadataCompat = null;
        super.onDetach();
    }

    public final void setPadding() {
        getTimeOutParameters gettimeoutparameters = this.MediaMetadataCompat;
        if (gettimeoutparameters != null) {
            gettimeoutparameters.write((C1346xf91fc122) this);
            getView().setVisibility(0);
        }
    }
}

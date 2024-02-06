package p040o;

import android.view.View;
import com.scb.phone.view.adapter.otp.MobileListAdapter;

/* renamed from: o.deleteAnnotation */
public final /* synthetic */ class deleteAnnotation implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ getContents MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ MobileListAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ MobileListAdapter.MobileListCustomView read;

    public /* synthetic */ deleteAnnotation(MobileListAdapter mobileListAdapter, MobileListAdapter.MobileListCustomView mobileListCustomView, getContents getcontents, int i) {
        this.MediaBrowserCompat$ItemReceiver = mobileListAdapter;
        this.read = mobileListCustomView;
        this.MediaBrowserCompat$CustomActionResultReceiver = getcontents;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        MobileListAdapter mobileListAdapter = this.MediaBrowserCompat$ItemReceiver;
        MobileListAdapter.MobileListCustomView mobileListCustomView = this.read;
        getContents getcontents = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.IconCompatParcelizer;
        if (!mobileListCustomView.Keep) {
            mobileListCustomView.setHasDecor = true;
            mobileListCustomView.mobileCheckbox.callOnClick();
        }
        mobileListCustomView.setHasDecor = false;
        mobileListAdapter.read.MediaBrowserCompat$ItemReceiver(getcontents);
        int i2 = mobileListAdapter.MediaBrowserCompat$ItemReceiver;
        if (i2 != i) {
            if (i2 != -1) {
                mobileListAdapter.write.get(i2).read = false;
            }
            mobileListAdapter.write.get(i).read = true;
            mobileListAdapter.IconCompatParcelizer.write();
            mobileListAdapter.MediaBrowserCompat$ItemReceiver = i;
        }
    }
}

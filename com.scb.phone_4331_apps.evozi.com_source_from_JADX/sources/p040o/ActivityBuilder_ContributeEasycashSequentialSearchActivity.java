package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.fragment.mwpartner.MwEditCreateQrFragment;

/* renamed from: o.ActivityBuilder_ContributeEasycashSequentialSearchActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashSequentialSearchActivity implements View.OnTouchListener {
    private final /* synthetic */ MwEditCreateQrFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeEasycashSequentialSearchActivity(MwEditCreateQrFragment mwEditCreateQrFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mwEditCreateQrFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MwEditCreateQrFragment mwEditCreateQrFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mwEditCreateQrFragment.shopReference.mNoteEditText.getText().toString().isEmpty() && mwEditCreateQrFragment.amountEditText.getText().toString().isEmpty()) {
            mwEditCreateQrFragment.IconCompatParcelizer();
            mwEditCreateQrFragment.createQrBtn.setEnabled(true);
        } else if (!mwEditCreateQrFragment.shopReference.mNoteEditText.getText().toString().isEmpty() && mwEditCreateQrFragment.amountEditText.getText().toString().isEmpty()) {
            FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = mwEditCreateQrFragment.IconCompatParcelizer;
            String str = fragmentBuilder_BindEasycashContactInformationFragment.write;
            if (str != null) {
                fragmentBuilder_BindEasycashContactInformationFragment.MediaBrowserCompat$ItemReceiver.setError(str);
            } else {
                fragmentBuilder_BindEasycashContactInformationFragment.MediaBrowserCompat$ItemReceiver.setErrorEnabled(false);
            }
        }
        mwEditCreateQrFragment.constraintLayout.requestFocus();
        mwEditCreateQrFragment.PlaybackStateCompat$CustomAction();
        return false;
    }
}

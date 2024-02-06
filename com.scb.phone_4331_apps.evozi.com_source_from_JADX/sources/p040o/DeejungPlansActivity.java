package p040o;

import android.widget.AbsListView;
import java.lang.reflect.Field;
import p040o.RewardsHomeActivity_ViewBinding;

/* renamed from: o.DeejungPlansActivity */
public class DeejungPlansActivity extends DeejungInstallmentsConfirmationActivity implements AbsListView.OnScrollListener {
    private int IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private RewardsHomeActivity_ViewBinding MediaBrowserCompat$ItemReceiver = new RewardsHomeActivity_ViewBinding.read(DeejungPlansActivity.class.getName());
    private AbsListView.OnScrollListener write;

    private DeejungPlansActivity(String str, FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment, AbsListView.OnScrollListener onScrollListener, AbsListView absListView, DeejungTransferLandingActivity deejungTransferLandingActivity, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        super(str, fragmentBuilder_BindHmlExternalAuthenticationFragment, deejungTransferLandingActivity, settextappearance);
        this.write = onScrollListener;
        this.IconCompatParcelizer = absListView.getFirstVisiblePosition();
        this.MediaBrowserCompat$CustomActionResultReceiver = absListView.getLastVisiblePosition();
    }

    public void onScrollStateChanged(AbsListView absListView, int i) {
        if (this.write != null && !this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            this.write.onScrollStateChanged(absListView, i);
        }
    }

    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (!this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer()) {
            AbsListView.OnScrollListener onScrollListener = this.write;
            if (onScrollListener != null) {
                onScrollListener.onScroll(absListView, i, i2, i3);
            }
            if (MediaBrowserCompat$ItemReceiver() && i3 != 0) {
                int firstVisiblePosition = absListView.getFirstVisiblePosition();
                int lastVisiblePosition = absListView.getLastVisiblePosition();
                int i4 = this.IconCompatParcelizer;
                int i5 = this.MediaBrowserCompat$CustomActionResultReceiver;
                this.IconCompatParcelizer = firstVisiblePosition;
                this.MediaBrowserCompat$CustomActionResultReceiver = lastVisiblePosition;
                write(absListView, firstVisiblePosition, lastVisiblePosition, firstVisiblePosition - i4, lastVisiblePosition - i5);
            }
        }
    }

    public static FragmentBuilder_BindHmlNTBLoanSetupFragment MediaBrowserCompat$CustomActionResultReceiver(AbsListView absListView, FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment, String str, DeejungTransferLandingActivity deejungTransferLandingActivity, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        AbsListView.OnScrollListener IconCompatParcelizer2 = IconCompatParcelizer(absListView);
        DeejungPlansActivity deejungPlansActivity = IconCompatParcelizer2 instanceof DeejungPlansActivity ? (DeejungPlansActivity) IconCompatParcelizer2 : null;
        if (deejungPlansActivity != null) {
            deejungPlansActivity.write(deejungTransferLandingActivity, settextappearance);
            return deejungPlansActivity;
        }
        DeejungPlansActivity deejungPlansActivity2 = new DeejungPlansActivity(str, fragmentBuilder_BindHmlExternalAuthenticationFragment, IconCompatParcelizer2, absListView, deejungTransferLandingActivity, settextappearance);
        absListView.setOnScrollListener(deejungPlansActivity2);
        return deejungPlansActivity2;
    }

    private static AbsListView.OnScrollListener IconCompatParcelizer(AbsListView absListView) {
        try {
            Class cls = absListView.getClass();
            while (cls != AbsListView.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mOnScrollListener");
            declaredField.setAccessible(true);
            return (AbsListView.OnScrollListener) declaredField.get(absListView);
        } catch (Exception e) {
            e.printStackTrace();
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return null;
        }
    }
}

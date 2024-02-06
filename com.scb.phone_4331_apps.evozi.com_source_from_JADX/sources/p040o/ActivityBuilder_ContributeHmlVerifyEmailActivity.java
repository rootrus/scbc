package p040o;

import com.scb.phone.view.custom.CustomCheckboxGroupView;
import com.scb.phone.view.fragment.profilemanagement.ManageNotificationsFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlVerifyEmailActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlVerifyEmailActivity implements dump {
    private final /* synthetic */ ManageNotificationsFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ActivityBuilder_ContributeHmlVerifyEmailActivity(ManageNotificationsFragment manageNotificationsFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = manageNotificationsFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        ManageNotificationsFragment manageNotificationsFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        lambda$publish$0 lambda_publish_0 = (lambda$publish$0) obj;
        CustomCheckboxGroupView customCheckboxGroupView = new CustomCheckboxGroupView(manageNotificationsFragment.getContext());
        customCheckboxGroupView.setContentDescription(lambda_publish_0.read);
        customCheckboxGroupView.setHideChildrenWhenUnchecked(true);
        customCheckboxGroupView.setData(lambda_publish_0);
        customCheckboxGroupView.setListener(new ActivityBuilder_ContributeHmlSimulatorTutorialActivity(manageNotificationsFragment.manageNotificationsPresenter));
        manageNotificationsFragment.MediaBrowserCompat$CustomActionResultReceiver.put(lambda_publish_0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, customCheckboxGroupView);
        manageNotificationsFragment.checkboxContainer.addView(customCheckboxGroupView);
    }
}

package p040o;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.adapter.profilemanagement.ProfileManagementAdapter;

/* renamed from: o.updateAnnotation */
public final /* synthetic */ class updateAnnotation implements View.OnClickListener {
    private final /* synthetic */ ProfileManagementAdapter.ProfileManagementHolder MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ProfileManagementAdapter read;

    public /* synthetic */ updateAnnotation(ProfileManagementAdapter profileManagementAdapter, ProfileManagementAdapter.ProfileManagementHolder profileManagementHolder, int i) {
        this.read = profileManagementAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = profileManagementHolder;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        ProfileManagementAdapter profileManagementAdapter = this.read;
        ProfileManagementAdapter.ProfileManagementHolder profileManagementHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.MediaBrowserCompat$ItemReceiver;
        if (profileManagementAdapter.write != null) {
            boolean isChecked = profileManagementHolder.toggleView.isChecked();
            profileManagementHolder.toggleView.setChecked(isChecked);
            profileManagementAdapter.write.MediaBrowserCompat$CustomActionResultReceiver(isChecked, profileManagementAdapter.MediaBrowserCompat$ItemReceiver.get(i).read);
            if (profileManagementAdapter.MediaBrowserCompat$ItemReceiver.get(i).read != 8) {
                return;
            }
            if (isChecked) {
                profileManagementHolder.description.setText(String.format(profileManagementAdapter.read.getString(R.string.mask_description_format), new Object[]{profileManagementAdapter.read.getString(R.string.settings_mask_on_sample), profileManagementAdapter.read.getString(R.string.settings_mask_on_description)}));
                return;
            }
            profileManagementHolder.description.setText(String.format(profileManagementAdapter.read.getString(R.string.mask_description_format), new Object[]{profileManagementAdapter.read.getString(R.string.settings_mask_off_sample), profileManagementAdapter.read.getString(R.string.settings_mask_off_description)}));
        }
    }
}

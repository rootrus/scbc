package com.scb.phone.view.adapter.profilemanagement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.FragmentBuilder_BindCheckScbsEligibilityFragment;
import p040o.deleteDevice;
import p040o.onStart;
import p040o.setContent;
import p040o.updateAnnotation;

public final class ProfileManagementAdapter extends RecyclerView.IconCompatParcelizer<ProfileManagementHolder> {
    public List<AutoValue_CrashlyticsReport_Session_OperatingSystem> MediaBrowserCompat$ItemReceiver;
    public Context read;
    public FragmentBuilder_BindCheckScbsEligibilityFragment write;

    public class ProfileManagementHolder_ViewBinding implements Unbinder {
        private ProfileManagementHolder IconCompatParcelizer;

        public ProfileManagementHolder_ViewBinding(ProfileManagementHolder profileManagementHolder, View view) {
            this.IconCompatParcelizer = profileManagementHolder;
            profileManagementHolder.container = (LinearLayout) onStart.IconCompatParcelizer(view, R.id.profile_management_layout, "field 'container'", LinearLayout.class);
            profileManagementHolder.titleName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_name, "field 'titleName'", TextView.class);
            profileManagementHolder.description = (TextView) onStart.IconCompatParcelizer(view, R.id.description, "field 'description'", TextView.class);
            profileManagementHolder.emailText = (TextView) onStart.IconCompatParcelizer(view, R.id.email_text, "field 'emailText'", TextView.class);
            profileManagementHolder.toggleView = (CheckBox) onStart.IconCompatParcelizer(view, R.id.toggle_view, "field 'toggleView'", CheckBox.class);
        }

        public final void read() {
            ProfileManagementHolder profileManagementHolder = this.IconCompatParcelizer;
            if (profileManagementHolder != null) {
                this.IconCompatParcelizer = null;
                profileManagementHolder.container = null;
                profileManagementHolder.titleName = null;
                profileManagementHolder.description = null;
                profileManagementHolder.emailText = null;
                profileManagementHolder.toggleView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        ProfileManagementHolder profileManagementHolder = (ProfileManagementHolder) setcontentview;
        profileManagementHolder.titleName.setText(this.MediaBrowserCompat$ItemReceiver.get(i).RatingCompat);
        if (profileManagementHolder.description != null && !this.MediaBrowserCompat$ItemReceiver.get(i).MediaBrowserCompat$ItemReceiver.isEmpty()) {
            profileManagementHolder.description.setVisibility(0);
            profileManagementHolder.description.setText(this.MediaBrowserCompat$ItemReceiver.get(i).MediaBrowserCompat$ItemReceiver);
            if (this.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer != 0) {
                profileManagementHolder.description.setTextColor(this.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer);
            }
        }
        if (this.MediaBrowserCompat$ItemReceiver.get(i).read == 0 && (str = ((setContent) this.MediaBrowserCompat$ItemReceiver.get(i)).MediaBrowserCompat$CustomActionResultReceiver) != null && !str.isEmpty()) {
            profileManagementHolder.emailText.setVisibility(0);
            profileManagementHolder.emailText.setText(str);
        }
        if (profileManagementHolder.toggleView != null) {
            if (this.MediaBrowserCompat$ItemReceiver.get(i) instanceof AutoValue_CrashlyticsReport_Session_Event_Log.C30971) {
                profileManagementHolder.toggleView.setChecked(((AutoValue_CrashlyticsReport_Session_Event_Log.C30971) this.MediaBrowserCompat$ItemReceiver.get(i)).MediaBrowserCompat$CustomActionResultReceiver);
            }
            profileManagementHolder.toggleView.setOnClickListener(new updateAnnotation(this, profileManagementHolder, i));
        }
        if (profileManagementHolder.container != null) {
            profileManagementHolder.container.setOnClickListener(new deleteDevice(this, i));
        }
    }

    public ProfileManagementAdapter(List<AutoValue_CrashlyticsReport_Session_OperatingSystem> list, FragmentBuilder_BindCheckScbsEligibilityFragment fragmentBuilder_BindCheckScbsEligibilityFragment, Context context) {
        this.write = fragmentBuilder_BindCheckScbsEligibilityFragment;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = context;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.MediaBrowserCompat$ItemReceiver.get(i).read;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public class ProfileManagementHolder extends RecyclerView.setContentView {
        @BindView
        LinearLayout container;
        @BindView
        public TextView description;
        @BindView
        TextView emailText;
        @BindView
        TextView titleName;
        @BindView
        public CheckBox toggleView;

        ProfileManagementHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        View view;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (!(i == 0 || i == 1)) {
            if (!(i == 3 || i == 15)) {
                if (i != 19) {
                    if (i != 20) {
                        switch (i) {
                            case 7:
                                view = from.inflate(R.layout.f83572131493583, viewGroup, false);
                                break;
                            case 8:
                            case 10:
                            case 11:
                                view = from.inflate(R.layout.f83592131493585, viewGroup, false);
                                break;
                            case 9:
                                break;
                            default:
                                view = from.inflate(R.layout.f83582131493584, viewGroup, false);
                                break;
                        }
                    }
                }
            }
            view = from.inflate(R.layout.f83562131493582, viewGroup, false);
            return new ProfileManagementHolder(view);
        }
        view = from.inflate(R.layout.f83602131493586, viewGroup, false);
        return new ProfileManagementHolder(view);
    }
}

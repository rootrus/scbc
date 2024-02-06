package p040o;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.thunderhead.adminscreens.AdminContainerActivity;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatTextView;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.Optimizations;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import com.thunderhead.android.infrastructure.server.requests.AddEditCapturePointRequest;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import com.thunderhead.popover.PopupWindows;
import java.util.LinkedList;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindThirdPartyConsentFragment;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.onClickNextAction */
public final class onClickNextAction extends PopupWindows implements OnBoardingTutorialActivity_ViewBinding {
    private int AppCompatActivity;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read AppCompatDelegateImpl$ListMenuDecorView;
    private LayoutInflater AppCompatDialogFragment;
    public int IconCompatParcelizer = 0;
    private TTFAppCompatTextView Keep;
    int MediaBrowserCompat$CustomActionResultReceiver;
    public ViewGroup MediaBrowserCompat$ItemReceiver;
    int MediaBrowserCompat$MediaItem = 0;
    int MediaBrowserCompat$SearchResultReceiver = 0;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    BaseAmortizationActivity f3169x50fd9e4a = BaseAmortizationActivity.ELEMENT_TAB;
    boolean MediaDescriptionCompat = false;
    boolean MediaMetadataCompat = false;
    FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> MediaSessionCompat$QueueItem;
    private int PlaybackStateCompat;
    private TTFAppCompatTextView PlaybackStateCompat$CustomAction;
    boolean RatingCompat = false;
    public FragmentBuilder_BindHmlAboutFragment read;
    private boolean setBackgroundResource = false;
    public DeejungTransferLandingActivity write;

    public onClickNextAction(Activity activity) {
        super(activity);
        try {
            this.read = FragmentBuilder_BindHmlIssuerLandingFragment.read();
            this.AppCompatDialogFragment = LayoutInflater.from(new ContextThemeWrapper(activity, C1189xa6547b7b.ThunderheadThemeDark));
            write(C6554xc460715d.th_view_popover);
            this.PlaybackStateCompat = 1;
            this.AppCompatActivity = (int) this.MediaSessionCompat$Token.getResources().getDimension(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.th_popover_width);
            Point point = new Point();
            this.AlertController$RecycleListView.getDefaultDisplay().getSize(point);
            if (point.x < this.AppCompatActivity) {
                Point point2 = new Point();
                this.AlertController$RecycleListView.getDefaultDisplay().getSize(point2);
                this.AppCompatActivity = point2.x;
            }
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> customView = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
            this.MediaSessionCompat$QueueItem = customView;
            this.AppCompatDelegateImpl$ListMenuDecorView = HomeActivity.write(customView, new CalendarLandingActivity(this));
            if (FragmentBuilder_BindTopHistoryFragment.MediaBrowserCompat$ItemReceiver(this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver())) {
                this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_group).setVisibility(0);
            }
            ((RadioGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.segmented_control)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    BaseAmortizationActivity baseAmortizationActivity = onClickNextAction.this.f3169x50fd9e4a;
                    if (((RadioButton) radioGroup.findViewById(i)).isChecked()) {
                        if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_region) {
                            onClickNextAction.this.f3169x50fd9e4a = BaseAmortizationActivity.REGION_TAB;
                            onClickNextAction.this.write();
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.text_element_name_container).setVisibility(0);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.region_points_toggle).setVisibility(0);
                            DeejungTransferLandingActivity deejungTransferLandingActivity = onClickNextAction.this.write;
                            while (true) {
                                if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
                                    break;
                                }
                                deejungTransferLandingActivity = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
                            }
                            if (deejungTransferLandingActivity != null) {
                                onClickNextAction.this.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity);
                            }
                        } else {
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.text_element_name_container).setVisibility(8);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.region_points_toggle).setVisibility(8);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.optimizationContainer).setVisibility(8);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer).setVisibility(0);
                            if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_element) {
                                onClickNextAction.this.f3169x50fd9e4a = BaseAmortizationActivity.ELEMENT_TAB;
                                onClickNextAction onclicknextaction = onClickNextAction.this;
                                onclicknextaction.IconCompatParcelizer(onclicknextaction.write, false);
                            } else {
                                onClickNextAction.this.f3169x50fd9e4a = BaseAmortizationActivity.GROUP_TAB;
                                onClickNextAction onclicknextaction2 = onClickNextAction.this;
                                onclicknextaction2.IconCompatParcelizer(onclicknextaction2.write, true);
                            }
                        }
                    }
                    if (onClickNextAction.this.f3169x50fd9e4a != baseAmortizationActivity) {
                        onClickNextAction.this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindThirdPartyConsentFragment.RatingCompat(onClickNextAction.this.f3169x50fd9e4a));
                    }
                    onClickNextAction.this.read();
                }
            });
            MediaBrowserCompat$CustomActionResultReceiver(false);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_region);
        appCompatRadioButton.setAllCaps(true);
        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_group);
        appCompatRadioButton2.setAllCaps(true);
        AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_element);
        appCompatRadioButton3.setAllCaps(true);
        if (!z) {
            DeejungTransferLandingActivity deejungTransferLandingActivity = this.write;
            if ((deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) || this.f3169x50fd9e4a == BaseAmortizationActivity.REGION_TAB) {
                appCompatRadioButton.setChecked(true);
            } else if (this.write.MediaDescriptionCompat) {
                if ((this.write.MediaMetadataCompat || this.write.MediaSessionCompat$ResultReceiverWrapper.MediaMetadataCompat || this.f3169x50fd9e4a == BaseAmortizationActivity.GROUP_TAB) && !this.write.MediaSessionCompat$Token && !this.write.MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$Token) {
                    appCompatRadioButton2.setChecked(true);
                } else {
                    appCompatRadioButton3.setChecked(true);
                }
            } else if ((!this.write.MediaMetadataCompat || this.write.MediaSessionCompat$Token) && this.f3169x50fd9e4a != BaseAmortizationActivity.GROUP_TAB) {
                appCompatRadioButton3.setChecked(true);
            } else {
                appCompatRadioButton2.setChecked(true);
            }
        }
        if (this.MediaDescriptionCompat) {
            IconCompatParcelizer(this.write.ParcelableVolumeInfo);
            MediaBrowserCompat$ItemReceiver(this.write);
            write(true);
            return;
        }
        IconCompatParcelizer(this.write.MediaBrowserCompat$MediaItem);
        write(false);
    }

    /* access modifiers changed from: package-private */
    public final void write() {
        ((ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer)).removeAllViews();
    }

    private void IconCompatParcelizer(String str) {
        InteractionRegionResponse MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(str);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            ((AppCompatTextView) this.MediaBrowserCompat$ItemReceiver.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.text_element_name)).setText(MediaBrowserCompat$ItemReceiver2.getData().getName());
            return;
        }
        ((AppCompatTextView) this.MediaBrowserCompat$ItemReceiver.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.text_element_name)).setText(str);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        ViewGroup viewGroup;
        final boolean z;
        boolean z2;
        final DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        final InteractionRegionResponse MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity2.ParcelableVolumeInfo);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver2.getData().getTrackingPoints();
            final Optimizations[] optimizationPoints = MediaBrowserCompat$ItemReceiver2.getData().getOptimizationPoints();
            final LinkedList linkedList = new LinkedList();
            for (TrackingPointData trackingPointData : trackingPoints) {
                if (trackingPointData.getPath() == null && trackingPointData.getTrackingPointType().equals(TrackingPointData.ON_LOAD_TYPE)) {
                    linkedList.add(trackingPointData);
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(linkedList.size());
            ((TextView) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_tracking_points)).setText(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(optimizationPoints.length);
            ((TextView) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_optimization_points)).setText(sb2.toString());
            ViewGroup viewGroup2 = (ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer);
            if (viewGroup2.getVisibility() == 0) {
                ((RadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_tracking_points)).setChecked(true);
            }
            viewGroup2.removeAllViews();
            View inflate = this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_region_track_create, (ViewGroup) null, false);
            inflate.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    if (!onClickNextAction.this.RatingCompat) {
                        Intent intent = new Intent(onClickNextAction.this.MediaSessionCompat$Token.getApplicationContext(), AdminContainerActivity.class);
                        intent.putExtra("CONTAINER_TYPE", "TRACK_TYPE");
                        intent.putExtra("INTERACTION_PATH", deejungTransferLandingActivity2.ParcelableVolumeInfo);
                        intent.putExtra("INTERACTION_ID", MediaBrowserCompat$ItemReceiver2.getData().getId());
                        intent.putExtra("TRACKING_POINT_TYPE", TrackingPointData.ON_LOAD_TYPE);
                        intent.setFlags(268435456);
                        onClickNextAction.this.MediaSessionCompat$Token.startActivity(intent);
                    }
                }
            });
            viewGroup2.addView(inflate);
            int read2 = read(80);
            this.MediaBrowserCompat$SearchResultReceiver = CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
            if (linkedList.size() > read2) {
                int i = read2 * 80;
                ViewGroup MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(viewGroup2, i);
                this.MediaBrowserCompat$SearchResultReceiver += i;
                viewGroup = MediaBrowserCompat$ItemReceiver3;
                z = true;
            } else {
                viewGroup = viewGroup2;
                z = false;
            }
            for (int i2 = 0; i2 < linkedList.size(); i2++) {
                View inflate2 = this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_point_list_track_update, (ViewGroup) null, false);
                String propositionName = ((TrackingPointData) linkedList.get(i2)).getPropositionName();
                if (propositionName == null) {
                    propositionName = this.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_proposition_selected_dynamically);
                }
                ((TextView) inflate2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackingPointName)).setText(((TrackingPointData) linkedList.get(i2)).getName());
                ((TextView) inflate2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.propositionName)).setText(propositionName);
                ((TextView) inflate2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.eventTypeName)).setText(((TrackingPointData) linkedList.get(i2)).getEventTypeName());
                final String id = ((TrackingPointData) linkedList.get(i2)).getId();
                inflate2.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        if (!onClickNextAction.this.RatingCompat) {
                            Intent intent = new Intent(onClickNextAction.this.MediaSessionCompat$Token.getApplicationContext(), AdminContainerActivity.class);
                            intent.putExtra("CONTAINER_TYPE", "TRACK_TYPE");
                            intent.putExtra("INTERACTION_PATH", deejungTransferLandingActivity2.ParcelableVolumeInfo);
                            intent.putExtra("INTERACTION_ID", MediaBrowserCompat$ItemReceiver2.getData().getId());
                            intent.putExtra("TRACKING_POINT_ID", id);
                            intent.putExtra("TRACKING_POINT_TYPE", TrackingPointData.ON_LOAD_TYPE);
                            intent.setFlags(268435456);
                            onClickNextAction.this.MediaSessionCompat$Token.startActivity(intent);
                        }
                    }
                });
                inflate2.setOnLongClickListener(new View.OnLongClickListener() {
                    public final boolean onLongClick(View view) {
                        onClickNextAction.IconCompatParcelizer(onClickNextAction.this, MediaBrowserCompat$ItemReceiver2.getData().getId(), deejungTransferLandingActivity2, true, id, view, false);
                        return false;
                    }
                });
                viewGroup.addView(inflate2);
                if (!z) {
                    this.MediaBrowserCompat$SearchResultReceiver += 80;
                }
            }
            ViewGroup viewGroup3 = (ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.optimizationContainer);
            viewGroup3.removeAllViews();
            viewGroup3.addView(this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_region_optimization_create, (ViewGroup) null, false));
            if (optimizationPoints.length > read(60)) {
                viewGroup3 = MediaBrowserCompat$ItemReceiver(viewGroup3, read2 * 60);
                z2 = true;
            } else {
                z2 = false;
            }
            for (int i3 = 0; i3 < optimizationPoints.length; i3++) {
                View inflate3 = this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_region_optimization_update, (ViewGroup) null, false);
                ((TextView) inflate3.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.optimizationName)).setText(optimizationPoints[i3].getName());
                if (optimizationPoints[i3].getViewpoint() == null) {
                    ((TextView) inflate3.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.viewPointName)).setText(this.MediaSessionCompat$Token.getResources().getString(C6555xdccae8ee.th_no_viewpoint));
                } else {
                    ((TextView) inflate3.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.viewPointName)).setText(optimizationPoints[i3].getViewpoint().getName());
                }
                viewGroup3.addView(inflate3);
            }
            final int i4 = read2;
            final boolean z3 = z2;
            ((RadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_tracking_points)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    if (z) {
                        onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer).setVisibility(0);
                        onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.optimizationContainer).setVisibility(8);
                        if (z) {
                            onClickNextAction.this.MediaBrowserCompat$SearchResultReceiver = (i4 * 80) + CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
                        } else {
                            onClickNextAction.this.MediaBrowserCompat$SearchResultReceiver = (linkedList.size() * 80) + CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
                        }
                    } else {
                        onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer).setVisibility(8);
                        onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.optimizationContainer).setVisibility(0);
                        if (z3) {
                            onClickNextAction.this.MediaBrowserCompat$SearchResultReceiver = (i4 * 60) + CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
                        } else {
                            onClickNextAction.this.MediaBrowserCompat$SearchResultReceiver = (optimizationPoints.length * 60) + CipherSuite.TLS_DH_anon_WITH_SEED_CBC_SHA;
                        }
                    }
                    onClickNextAction.this.read();
                }
            });
        }
    }

    private int read(int i) {
        int applyDimension = (int) TypedValue.applyDimension(1, 1.0f, this.MediaSessionCompat$Token.getResources().getDisplayMetrics());
        if (applyDimension <= 0) {
            return 1;
        }
        int i2 = ((this.MediaBrowserCompat$CustomActionResultReceiver / applyDimension) - 200) / i;
        if (i2 > 4) {
            return 4;
        }
        return i2;
    }

    private ViewGroup MediaBrowserCompat$ItemReceiver(ViewGroup viewGroup, int i) {
        ScrollView scrollView = new ScrollView(new ContextThemeWrapper(this.MediaSessionCompat$Token, C1189xa6547b7b.ThunderheadThemeDark));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.height = (int) TypedValue.applyDimension(1, (float) i, this.MediaSessionCompat$Token.getResources().getDisplayMetrics());
        scrollView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(new ContextThemeWrapper(this.MediaSessionCompat$Token, C1189xa6547b7b.ThunderheadThemeDark));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        viewGroup.addView(scrollView);
        return linearLayout;
    }

    /* access modifiers changed from: package-private */
    public final void read() {
        if (this.setBackgroundResource) {
            this.MediaSessionCompat$Token.getWindow().getDecorView().postDelayed(new Runnable() {
                public final void run() {
                    int i;
                    if (onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper != null) {
                        onClickNextAction onclicknextaction = onClickNextAction.this;
                        onclicknextaction.MediaBrowserCompat$MediaItem = onclicknextaction.MediaSessionCompat$ResultReceiverWrapper.getMeasuredHeight();
                        if (Build.VERSION.SDK_INT >= 24) {
                            if (onClickNextAction.this.f3169x50fd9e4a == BaseAmortizationActivity.REGION_TAB && onClickNextAction.this.MediaBrowserCompat$MediaItem < (i = ((int) (((float) onClickNextAction.this.MediaBrowserCompat$SearchResultReceiver) * Resources.getSystem().getDisplayMetrics().density)) + 1)) {
                                onClickNextAction.this.MediaBrowserCompat$MediaItem = i;
                            }
                            onClickNextAction onclicknextaction2 = onClickNextAction.this;
                            Rect write = onclicknextaction2.read(onclicknextaction2.write.IconCompatParcelizer, onClickNextAction.this.write.MediaBrowserCompat$CustomActionResultReceiver);
                            onClickNextAction onclicknextaction3 = onClickNextAction.this;
                            Point point = new Point();
                            onclicknextaction3.AlertController$RecycleListView.getDefaultDisplay().getSize(point);
                            int[] read2 = onClickNextAction.read(onclicknextaction2, write, point.x);
                            if (read2[1] < 0) {
                                read2[1] = onClickNextAction.this.IconCompatParcelizer;
                            }
                            onClickNextAction.IconCompatParcelizer(onClickNextAction.this, read2[0], read2[1]);
                        } else if (Build.VERSION.SDK_INT < 23) {
                            onClickNextAction onclicknextaction4 = onClickNextAction.this;
                            Rect write2 = onclicknextaction4.read(onclicknextaction4.write.IconCompatParcelizer, onClickNextAction.this.IconCompatParcelizer);
                            onClickNextAction onclicknextaction5 = onClickNextAction.this;
                            Point point2 = new Point();
                            onclicknextaction5.AlertController$RecycleListView.getDefaultDisplay().getSize(point2);
                            int[] read3 = onClickNextAction.read(onclicknextaction4, write2, point2.x);
                            if (read3[1] < 0) {
                                read3[1] = onClickNextAction.this.IconCompatParcelizer;
                            }
                            onClickNextAction.IconCompatParcelizer(onClickNextAction.this, read3[0], read3[1]);
                        } else {
                            onClickNextAction onclicknextaction6 = onClickNextAction.this;
                            Rect write3 = onclicknextaction6.read(onclicknextaction6.write.IconCompatParcelizer, onClickNextAction.this.write.MediaBrowserCompat$CustomActionResultReceiver);
                            onClickNextAction onclicknextaction7 = onClickNextAction.this;
                            Point point3 = new Point();
                            onclicknextaction7.AlertController$RecycleListView.getDefaultDisplay().getSize(point3);
                            int[] read4 = onClickNextAction.read(onclicknextaction6, write3, point3.x);
                            onClickNextAction.IconCompatParcelizer(onClickNextAction.this, read4[0], read4[1]);
                        }
                    }
                }
            }, 20);
        } else if (Build.VERSION.SDK_INT >= 24) {
            this.MediaSessionCompat$Token.getWindow().getDecorView().postDelayed(new Runnable() {
                public final void run() {
                    int i;
                    if (onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper != null) {
                        onClickNextAction onclicknextaction = onClickNextAction.this;
                        onclicknextaction.MediaBrowserCompat$MediaItem = onclicknextaction.MediaSessionCompat$ResultReceiverWrapper.getMeasuredHeight();
                        if (onClickNextAction.this.f3169x50fd9e4a == BaseAmortizationActivity.REGION_TAB && onClickNextAction.this.MediaBrowserCompat$MediaItem < (i = ((int) (((float) onClickNextAction.this.MediaBrowserCompat$SearchResultReceiver) * Resources.getSystem().getDisplayMetrics().density)) + 1)) {
                            onClickNextAction.this.MediaBrowserCompat$MediaItem = i;
                        }
                        onClickNextAction onclicknextaction2 = onClickNextAction.this;
                        Rect write = onclicknextaction2.read(onclicknextaction2.write.IconCompatParcelizer, onClickNextAction.this.write.MediaBrowserCompat$CustomActionResultReceiver);
                        onClickNextAction onclicknextaction3 = onClickNextAction.this;
                        Point point = new Point();
                        onclicknextaction3.AlertController$RecycleListView.getDefaultDisplay().getSize(point);
                        int[] read = onClickNextAction.read(onclicknextaction2, write, point.x);
                        if (read[1] + onClickNextAction.this.MediaBrowserCompat$MediaItem > onClickNextAction.this.MediaBrowserCompat$CustomActionResultReceiver) {
                            read[1] = (onClickNextAction.this.MediaBrowserCompat$CustomActionResultReceiver - onClickNextAction.this.MediaBrowserCompat$MediaItem) - 10;
                        }
                        onClickNextAction.IconCompatParcelizer(onClickNextAction.this, read[0], read[1]);
                    }
                }
            }, 20);
        }
    }

    private void write(boolean z) {
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_region);
        appCompatRadioButton.setAllCaps(true);
        AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_group);
        appCompatRadioButton2.setAllCaps(true);
        AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_element);
        appCompatRadioButton3.setAllCaps(true);
        if (z) {
            appCompatRadioButton.setEnabled(false);
            appCompatRadioButton2.setEnabled(false);
            appCompatRadioButton3.setEnabled(false);
            return;
        }
        appCompatRadioButton.setEnabled(true);
        appCompatRadioButton2.setEnabled(true);
        appCompatRadioButton3.setEnabled(true);
    }

    private void write(int i) {
        this.MediaSessionCompat$ResultReceiverWrapper = this.AppCompatDialogFragment.inflate(i, (ViewGroup) null);
        this.MediaBrowserCompat$ItemReceiver = (ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.layout_container);
        this.Keep = (TTFAppCompatTextView) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_down);
        this.PlaybackStateCompat$CustomAction = (TTFAppCompatTextView) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_up);
        this.Keep = (TTFAppCompatTextView) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_down);
        this.PlaybackStateCompat$CustomAction = (TTFAppCompatTextView) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_up);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = this.AppCompatActivity;
        this.MediaSessionCompat$ResultReceiverWrapper.setLayoutParams(layoutParams);
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaSessionCompat$ResultReceiverWrapper);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(View view, boolean z, int i) {
        MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatActivity);
        MediaBrowserCompat$ItemReceiver(view, false, i);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        IconCompatParcelizer();
        this.Keep = null;
        this.PlaybackStateCompat$CustomAction = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.AppCompatDialogFragment = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
    }

    public final void IconCompatParcelizer(Activity activity, View view, int i, int i2) {
        boolean z = false;
        try {
            this.RatingCompat = false;
            IconCompatParcelizer(activity);
            this.AppCompatDialogFragment = LayoutInflater.from(new ContextThemeWrapper(this.MediaSessionCompat$Token, C1189xa6547b7b.ThunderheadThemeDark));
            write(C6554xc460715d.th_view_popover);
            if (this.MediaMetadataCompat) {
                this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_group).setVisibility(0);
            }
            ((RadioGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.segmented_control)).setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                    BaseAmortizationActivity baseAmortizationActivity = onClickNextAction.this.f3169x50fd9e4a;
                    if (((RadioButton) radioGroup.findViewById(i)).isChecked()) {
                        if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_region) {
                            onClickNextAction.this.f3169x50fd9e4a = BaseAmortizationActivity.REGION_TAB;
                            onClickNextAction.this.write();
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.text_element_name_container).setVisibility(0);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.region_points_toggle).setVisibility(0);
                            DeejungTransferLandingActivity deejungTransferLandingActivity = onClickNextAction.this.write;
                            while (true) {
                                if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
                                    break;
                                }
                                deejungTransferLandingActivity = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
                            }
                            if (deejungTransferLandingActivity != null) {
                                onClickNextAction.this.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity);
                            }
                        } else {
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.text_element_name_container).setVisibility(8);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.region_points_toggle).setVisibility(8);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.optimizationContainer).setVisibility(8);
                            onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer).setVisibility(0);
                            if (i == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_element) {
                                onClickNextAction.this.f3169x50fd9e4a = BaseAmortizationActivity.ELEMENT_TAB;
                                onClickNextAction onclicknextaction = onClickNextAction.this;
                                onclicknextaction.IconCompatParcelizer(onclicknextaction.write, false);
                            } else {
                                onClickNextAction.this.f3169x50fd9e4a = BaseAmortizationActivity.GROUP_TAB;
                                onClickNextAction onclicknextaction2 = onClickNextAction.this;
                                onclicknextaction2.IconCompatParcelizer(onclicknextaction2.write, true);
                            }
                        }
                    }
                    if (onClickNextAction.this.f3169x50fd9e4a != baseAmortizationActivity) {
                        onClickNextAction.this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(new FragmentBuilder_BindThirdPartyConsentFragment.RatingCompat(onClickNextAction.this.f3169x50fd9e4a));
                    }
                    onClickNextAction.this.read();
                }
            });
            MediaBrowserCompat$CustomActionResultReceiver(true);
            AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_element);
            appCompatRadioButton.setAllCaps(true);
            AppCompatRadioButton appCompatRadioButton2 = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_group);
            appCompatRadioButton2.setAllCaps(true);
            AppCompatRadioButton appCompatRadioButton3 = (AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_region);
            appCompatRadioButton3.setAllCaps(true);
            int i3 = C73177.MediaBrowserCompat$ItemReceiver[this.f3169x50fd9e4a.ordinal()];
            if (i3 == 1) {
                appCompatRadioButton.setChecked(true);
            } else if (i3 == 2) {
                appCompatRadioButton2.setChecked(true);
            } else if (i3 == 3) {
                appCompatRadioButton3.setChecked(true);
            }
            MediaBrowserCompat$CustomActionResultReceiver(this.AppCompatActivity);
            MediaBrowserCompat$ItemReceiver(view, true, i);
            if (((AppCompatRadioButton) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.button_region)).isChecked()) {
                this.f3169x50fd9e4a = BaseAmortizationActivity.REGION_TAB;
                ((ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer)).removeAllViews();
                DeejungTransferLandingActivity deejungTransferLandingActivity = this.write;
                if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
                    z = true;
                }
                if (z) {
                    MediaBrowserCompat$ItemReceiver(this.write);
                } else {
                    DeejungTransferLandingActivity read2 = read(this.write);
                    if (read2 != null) {
                        MediaBrowserCompat$ItemReceiver(read2);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                this.MediaBrowserCompat$CustomActionResultReceiver = i2;
                read();
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    private void MediaBrowserCompat$ItemReceiver(View view, boolean z, int i) {
        Rect read2 = read(view, i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        this.MediaSessionCompat$ResultReceiverWrapper.measure(layoutParams.width, layoutParams.height);
        if (!z) {
            this.MediaBrowserCompat$MediaItem = this.MediaSessionCompat$ResultReceiverWrapper.getMeasuredHeight();
        }
        Point point = new Point();
        this.AlertController$RecycleListView.getDefaultDisplay().getSize(point);
        int i2 = point.x;
        int i3 = read2.bottom;
        Point point2 = new Point();
        this.AlertController$RecycleListView.getDefaultDisplay().getSize(point2);
        if (i3 > point2.y) {
            Point point3 = new Point();
            this.AlertController$RecycleListView.getDefaultDisplay().getSize(point3);
            read2.bottom = point3.y;
        }
        int i4 = read2.top;
        int i5 = this.IconCompatParcelizer;
        if (i4 < i5) {
            read2.top = i5;
        }
        int[] read3 = read(read2, i2);
        int i6 = this.setBackgroundResource ? FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_down : FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_up;
        int centerX = read2.centerX();
        int i7 = read3[0];
        TTFAppCompatTextView tTFAppCompatTextView = i6 == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_up ? this.PlaybackStateCompat$CustomAction : this.Keep;
        TTFAppCompatTextView tTFAppCompatTextView2 = i6 == FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.arrow_up ? this.Keep : this.PlaybackStateCompat$CustomAction;
        int measuredWidth = this.PlaybackStateCompat$CustomAction.getMeasuredWidth();
        tTFAppCompatTextView.setVisibility(0);
        ((ViewGroup.MarginLayoutParams) tTFAppCompatTextView.getLayoutParams()).leftMargin = (centerX - (measuredWidth / 2)) - i7;
        tTFAppCompatTextView2.setVisibility(4);
        int centerX2 = read2.centerX();
        boolean z2 = this.setBackgroundResource;
        int measuredWidth2 = centerX2 - (this.PlaybackStateCompat$CustomAction.getMeasuredWidth() / 2);
        int i8 = this.PlaybackStateCompat;
        if (i8 == 1) {
            this.setHasDecor.setAnimationStyle(z2 ? C1189xa6547b7b.thLegacyAnimations_PopUpMenu_Left : C1189xa6547b7b.thLegacyAnimations_PopDownMenu_Left);
        } else if (i8 == 2) {
            this.setHasDecor.setAnimationStyle(z2 ? C1189xa6547b7b.thLegacyAnimations_PopUpMenu_Right : C1189xa6547b7b.thLegacyAnimations_PopDownMenu_Right);
        } else if (i8 == 3) {
            this.setHasDecor.setAnimationStyle(z2 ? C1189xa6547b7b.thLegacyAnimations_PopUpMenu_Center : C1189xa6547b7b.thLegacyAnimations_PopDownMenu_Center);
        } else if (i8 == 4) {
            int i9 = i2 / 4;
            if (measuredWidth2 <= i9) {
                this.setHasDecor.setAnimationStyle(z2 ? C1189xa6547b7b.thLegacyAnimations_PopUpMenu_Left : C1189xa6547b7b.thLegacyAnimations_PopDownMenu_Left);
            } else if (measuredWidth2 <= i9 || measuredWidth2 >= i9 * 3) {
                this.setHasDecor.setAnimationStyle(C1189xa6547b7b.thLegacyAnimations_PopDownMenu_Right);
            } else {
                this.setHasDecor.setAnimationStyle(z2 ? C1189xa6547b7b.thLegacyAnimations_PopUpMenu_Center : C1189xa6547b7b.thLegacyAnimations_PopDownMenu_Center);
            }
        }
        MediaBrowserCompat$ItemReceiver(view, read3[0], read3[1]);
    }

    /* access modifiers changed from: private */
    public Rect read(View view, int i) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (Build.VERSION.SDK_INT >= 23) {
            iArr[1] = iArr[1] - i;
        }
        int[] MediaBrowserCompat$ItemReceiver2 = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(BondSelectionActivity.read(this.MediaSessionCompat$Token));
        int i2 = iArr[0];
        int i3 = MediaBrowserCompat$ItemReceiver2[0];
        int i4 = iArr[1];
        int i5 = MediaBrowserCompat$ItemReceiver2[1];
        int i6 = iArr[0];
        int i7 = MediaBrowserCompat$ItemReceiver2[0];
        return new Rect(i2 - i3, i4 - i5, (i6 - i7) + view.getWidth(), (iArr[1] - MediaBrowserCompat$ItemReceiver2[1]) + view.getHeight() + i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if ((r1.y - r7.height()) <= r6.MediaBrowserCompat$MediaItem) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        if (r6.MediaBrowserCompat$MediaItem > r7.height()) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r8 = r7.bottom;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r6.setBackgroundResource = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        if (r1 > r4.y) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if ((r0 + r1) > r8) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if ((r0 + r1) > r8) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int[] read(android.graphics.Rect r7, int r8) {
        /*
            r6 = this;
            int r0 = r7.centerX()
            int r1 = r6.AppCompatActivity
            r2 = 0
            if (r0 <= r1) goto L_0x0018
            int r0 = r7.centerX()
            int r1 = r6.AppCompatActivity
            int r0 = r0 - r1
            int r3 = r1 / 2
            int r0 = r0 + r3
            int r3 = r0 + r1
            if (r3 <= r8) goto L_0x002c
            goto L_0x002a
        L_0x0018:
            int r0 = r7.centerX()
            int r1 = r6.AppCompatActivity
            int r0 = r0 - r1
            int r3 = r1 / 2
            int r0 = r0 + r3
            if (r0 >= 0) goto L_0x0026
            r0 = r2
            goto L_0x002c
        L_0x0026:
            int r3 = r0 + r1
            if (r3 <= r8) goto L_0x002c
        L_0x002a:
            int r0 = r8 - r1
        L_0x002c:
            int r8 = r7.top
            int r1 = r6.MediaBrowserCompat$MediaItem
            int r8 = r8 - r1
            r3 = 1
            r6.setBackgroundResource = r3
            int r4 = r6.IconCompatParcelizer
            int r1 = r1 + r4
            int r4 = r7.top
            if (r1 <= r4) goto L_0x0064
            boolean r1 = r6.MediaDescriptionCompat
            if (r1 != 0) goto L_0x0058
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            android.view.WindowManager r4 = r6.AlertController$RecycleListView
            android.view.Display r4 = r4.getDefaultDisplay()
            r4.getSize(r1)
            int r1 = r1.y
            int r4 = r7.height()
            int r1 = r1 - r4
            int r4 = r6.MediaBrowserCompat$MediaItem
            if (r1 > r4) goto L_0x0060
        L_0x0058:
            int r1 = r6.MediaBrowserCompat$MediaItem
            int r4 = r7.height()
            if (r1 <= r4) goto L_0x0062
        L_0x0060:
            int r8 = r7.bottom
        L_0x0062:
            r6.setBackgroundResource = r2
        L_0x0064:
            int r1 = r6.MediaBrowserCompat$MediaItem
            int r1 = r1 + r8
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            android.view.WindowManager r5 = r6.AlertController$RecycleListView
            android.view.Display r5 = r5.getDefaultDisplay()
            r5.getSize(r4)
            int r4 = r4.y
            if (r1 <= r4) goto L_0x007e
            int r8 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r1 = r6.MediaBrowserCompat$MediaItem
            int r8 = r8 - r1
        L_0x007e:
            boolean r1 = r6.MediaDescriptionCompat
            if (r1 != 0) goto L_0x009b
            int r1 = r7.height()
            int r4 = r6.MediaBrowserCompat$MediaItem
            int r1 = r1 + r4
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            android.view.WindowManager r5 = r6.AlertController$RecycleListView
            android.view.Display r5 = r5.getDefaultDisplay()
            r5.getSize(r4)
            int r4 = r4.y
            if (r1 <= r4) goto L_0x00a5
        L_0x009b:
            boolean r1 = r6.setBackgroundResource
            if (r1 != 0) goto L_0x00a5
            int r1 = r7.top
            if (r8 >= r1) goto L_0x00a5
            int r8 = r7.top
        L_0x00a5:
            r7 = 2
            int[] r7 = new int[r7]
            r7[r2] = r0
            r7[r3] = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onClickNextAction.read(android.graphics.Rect, int):int[]");
    }

    /* renamed from: o.onClickNextAction$7 */
    static /* synthetic */ class C73177 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.BaseAmortizationActivity[] r0 = p040o.BaseAmortizationActivity.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.BaseAmortizationActivity r1 = p040o.BaseAmortizationActivity.ELEMENT_TAB     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BaseAmortizationActivity r1 = p040o.BaseAmortizationActivity.GROUP_TAB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BaseAmortizationActivity r1 = p040o.BaseAmortizationActivity.REGION_TAB     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.onClickNextAction.C73177.<clinit>():void");
        }
    }

    public final void disconnect() {
        try {
            if (this.AppCompatDelegateImpl$ListMenuDecorView != null) {
                this.AppCompatDelegateImpl$ListMenuDecorView.read();
                this.AppCompatDelegateImpl$ListMenuDecorView = null;
            }
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    static /* synthetic */ void IconCompatParcelizer(onClickNextAction onclicknextaction, String str, DeejungTransferLandingActivity deejungTransferLandingActivity, boolean z, String str2, View view, boolean z2) {
        String str3;
        onClickNextAction onclicknextaction2 = onclicknextaction;
        onclicknextaction2.RatingCompat = true;
        if (z) {
            str3 = onclicknextaction2.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_delete_tracking_point_label);
        } else {
            str3 = onclicknextaction2.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_delete_capture_point_label);
        }
        onAccountSummaryClick onaccountsummaryclick = new onAccountSummaryClick(str3, onclicknextaction2.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_confirmation_message), onclicknextaction2.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_delete_positive), onclicknextaction2.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_delete_negative));
        onaccountsummaryclick.IconCompatParcelizer = new ActivationSuccessfulActivity(onclicknextaction, view, z, deejungTransferLandingActivity, str2, z2, str);
        onaccountsummaryclick.MediaBrowserCompat$CustomActionResultReceiver = new AmortizationActivity(onclicknextaction);
        onaccountsummaryclick.MediaBrowserCompat$CustomActionResultReceiver(onclicknextaction2.MediaSessionCompat$Token);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if ((r0 + r1) > r6) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
        if ((r0 + r1) > r6) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int[] read(p040o.onClickNextAction r4, android.graphics.Rect r5, int r6) {
        /*
            int r0 = r5.centerX()
            int r1 = r4.AppCompatActivity
            r2 = 0
            if (r0 <= r1) goto L_0x0018
            int r0 = r5.centerX()
            int r1 = r4.AppCompatActivity
            int r0 = r0 - r1
            int r3 = r1 / 2
            int r0 = r0 + r3
            int r3 = r0 + r1
            if (r3 <= r6) goto L_0x002c
            goto L_0x002a
        L_0x0018:
            int r0 = r5.centerX()
            int r1 = r4.AppCompatActivity
            int r0 = r0 - r1
            int r3 = r1 / 2
            int r0 = r0 + r3
            if (r0 >= 0) goto L_0x0026
            r0 = r2
            goto L_0x002c
        L_0x0026:
            int r3 = r0 + r1
            if (r3 <= r6) goto L_0x002c
        L_0x002a:
            int r0 = r6 - r1
        L_0x002c:
            boolean r6 = r4.setBackgroundResource
            if (r6 == 0) goto L_0x0036
            int r5 = r5.top
            int r4 = r4.MediaBrowserCompat$MediaItem
            int r5 = r5 - r4
            goto L_0x0038
        L_0x0036:
            int r5 = r5.bottom
        L_0x0038:
            r4 = 2
            int[] r4 = new int[r4]
            r4[r2] = r0
            r6 = 1
            r4[r6] = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onClickNextAction.read(o.onClickNextAction, android.graphics.Rect, int):int[]");
    }

    static /* synthetic */ void IconCompatParcelizer(onClickNextAction onclicknextaction, int i, int i2) {
        if (onclicknextaction.setHasDecor != null) {
            onclicknextaction.setHasDecor.update(i, i2, -1, -1, false);
        }
    }

    private static String write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        String str = deejungTransferLandingActivity.ParcelableVolumeInfo;
        String str2 = deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        while (!str2.equals("LI") && !str2.equals("STI") && !str2.equals("STS") && !str2.equals("TI")) {
            deejungTransferLandingActivity2 = deejungTransferLandingActivity2.MediaSessionCompat$ResultReceiverWrapper;
            if (deejungTransferLandingActivity2 == null) {
                return str;
            }
            str2 = deejungTransferLandingActivity2.f3129x50fd9e4a.MediaMetadataCompat;
        }
        int length = deejungTransferLandingActivity2.ParcelableVolumeInfo.split("/").length - 1;
        String[] split = deejungTransferLandingActivity.ParcelableVolumeInfo.split("/");
        split[length] = split[length].replaceAll("\\d", "").concat("*");
        return DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(split);
    }

    private static DeejungTransferLandingActivity read(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        while (true) {
            if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
                return deejungTransferLandingActivity;
            }
            deejungTransferLandingActivity = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(View view, boolean z, DeejungTransferLandingActivity deejungTransferLandingActivity, String str, boolean z2, String str2) {
        if (FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver == null) {
            FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment();
        }
        FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment = FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver;
        final View view2 = view;
        final boolean z3 = z;
        final DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        final String str3 = str;
        final boolean z4 = z2;
        C73188 r1 = new FragmentBuilder_BindHmlDocumentUploadGuidelineFragment() {
            public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            }

            public final void write(int i, String str) {
            }

            public final void read() {
                try {
                    ((ViewGroup) onClickNextAction.this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer)).removeView(view2);
                    boolean z = false;
                    if (z3) {
                        FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
                        String str = deejungTransferLandingActivity2.MediaBrowserCompat$MediaItem;
                        String str2 = str3;
                        InteractionRegionResponse MediaBrowserCompat$ItemReceiver2 = MediaSessionCompat$QueueItem.write.MediaBrowserCompat$ItemReceiver(str);
                        if (MediaBrowserCompat$ItemReceiver2 != null) {
                            TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver2.getData().getTrackingPoints();
                            int i = 0;
                            while (true) {
                                if (i >= trackingPoints.length) {
                                    break;
                                } else if (trackingPoints[i].getId().equals(str2)) {
                                    trackingPoints[i] = new TrackingPointData();
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
                        String str3 = deejungTransferLandingActivity2.MediaBrowserCompat$MediaItem;
                        String str4 = str3;
                        InteractionRegionResponse MediaBrowserCompat$ItemReceiver3 = MediaSessionCompat$QueueItem2.write.MediaBrowserCompat$ItemReceiver(str3);
                        if (MediaBrowserCompat$ItemReceiver3 != null) {
                            Captures[] capturePoints = MediaBrowserCompat$ItemReceiver3.getData().getCapturePoints();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= capturePoints.length) {
                                    break;
                                } else if (capturePoints[i2].getId().equals(str4)) {
                                    capturePoints[i2] = new Captures();
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    DeejungTransferLandingActivity deejungTransferLandingActivity = deejungTransferLandingActivity2;
                    if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
                        z = true;
                    }
                    if (!z) {
                        onClickNextAction.this.IconCompatParcelizer(deejungTransferLandingActivity2, z4);
                    } else if (z3) {
                        onClickNextAction.this.write();
                        onClickNextAction.this.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity2);
                    }
                    if (z4) {
                        onClickNextAction.this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindThirdPartyConsentFragment.write.MediaBrowserCompat$ItemReceiver);
                    } else {
                        onClickNextAction.this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindThirdPartyConsentFragment.IconCompatParcelizer.read);
                    }
                    onClickNextAction.this.read();
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                }
            }
        };
        this.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_loading_label);
        C6556x769516c8 MediaBrowserCompat$CustomActionResultReceiver2 = fragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$CustomActionResultReceiver(r1);
        if (z) {
            FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
            FragmentBuilder_BindHmlNTBOfflineSuccessFragment MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment.MediaBrowserCompat$ItemReceiver(MediaSessionCompat$QueueItem2.write, str2, deejungTransferLandingActivity.MediaBrowserCompat$MediaItem, str);
            if (MediaBrowserCompat$ItemReceiver2.RatingCompat == null) {
                MediaBrowserCompat$ItemReceiver2.RatingCompat = str;
            }
            MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$MediaItem = true;
            MediaSessionCompat$QueueItem2.write(MediaBrowserCompat$ItemReceiver2, (FragmentBuilder_BindHmlDocumentUploadGuidelineFragment) MediaBrowserCompat$CustomActionResultReceiver2, (Activity) null);
            return;
        }
        FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem3 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
        FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment MediaBrowserCompat$CustomActionResultReceiver3 = FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment.MediaBrowserCompat$CustomActionResultReceiver(MediaSessionCompat$QueueItem3.write, str2, deejungTransferLandingActivity.MediaBrowserCompat$MediaItem, str);
        AddEditCapturePointRequest write2 = FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.write(MediaBrowserCompat$CustomActionResultReceiver3);
        MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append("delete capture point request:");
        sb.append(write2.toString());
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver3.MediaSessionCompat$ResultReceiverWrapper = true;
        MediaSessionCompat$QueueItem3.MediaBrowserCompat$CustomActionResultReceiver(write2, MediaBrowserCompat$CustomActionResultReceiver3, (Activity) null, MediaBrowserCompat$CustomActionResultReceiver2);
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(final DeejungTransferLandingActivity deejungTransferLandingActivity, boolean z) {
        final String str;
        Captures captures;
        View view;
        final String str2;
        TrackingPointData trackingPointData;
        View view2;
        ((ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer)).removeAllViews();
        final InteractionRegionResponse MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem);
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            int i = 0;
            if ((deejungTransferLandingActivity.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver || deejungTransferLandingActivity.MediaDescriptionCompat) && MediaBrowserCompat$ItemReceiver2 != null) {
                boolean z2 = !deejungTransferLandingActivity.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver && deejungTransferLandingActivity.MediaDescriptionCompat;
                if (z) {
                    if (z2) {
                        str2 = write(deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper);
                    } else {
                        str2 = write(deejungTransferLandingActivity);
                    }
                } else if (z2) {
                    str2 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo;
                } else {
                    str2 = deejungTransferLandingActivity.ParcelableVolumeInfo;
                }
                TrackingPointData[] trackingPoints = MediaBrowserCompat$ItemReceiver2.getData().getTrackingPoints();
                int length = trackingPoints.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        trackingPointData = null;
                        break;
                    }
                    trackingPointData = trackingPoints[i2];
                    if (trackingPointData.getPath() != null && trackingPointData.getPath().equals(str2)) {
                        break;
                    }
                    i2++;
                }
                ViewGroup viewGroup = (ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer);
                if (trackingPointData != null) {
                    view2 = this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_point_list_track_update, (ViewGroup) null);
                    final String id = trackingPointData.getId();
                    String propositionName = trackingPointData.getPropositionName();
                    if (propositionName == null) {
                        propositionName = this.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_proposition_selected_dynamically);
                    }
                    ((TextView) view2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackingPointName)).setText(trackingPointData.getName());
                    ((TextView) view2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.propositionName)).setText(propositionName);
                    ((TextView) view2.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.eventTypeName)).setText(trackingPointData.getEventTypeName());
                    view2.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (!onClickNextAction.this.RatingCompat) {
                                Intent intent = new Intent(onClickNextAction.this.MediaSessionCompat$Token.getApplicationContext(), AdminContainerActivity.class);
                                intent.putExtra("INTERACTION_PATH", deejungTransferLandingActivity.MediaBrowserCompat$MediaItem);
                                intent.putExtra("INTERACTION_ID", MediaBrowserCompat$ItemReceiver2.getData().getId());
                                intent.putExtra("TRACKING_POINT_ID", id);
                                intent.putExtra("TRACKING_POINT_TYPE", TrackingPointData.ON_CLICK_TYPE);
                                intent.putExtra("CONTAINER_TYPE", "TRACK_TYPE");
                                intent.setFlags(268435456);
                                onClickNextAction.this.MediaSessionCompat$Token.startActivity(intent);
                            }
                        }
                    });
                    final InteractionRegionResponse interactionRegionResponse = MediaBrowserCompat$ItemReceiver2;
                    final DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
                    final boolean z3 = z;
                    view2.setOnLongClickListener(new View.OnLongClickListener() {
                        public final boolean onLongClick(View view) {
                            onClickNextAction.IconCompatParcelizer(onClickNextAction.this, interactionRegionResponse.getData().getId(), deejungTransferLandingActivity2, true, id, view, z3);
                            return false;
                        }
                    });
                } else {
                    View inflate = this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_point_list_track_create, (ViewGroup) null);
                    inflate.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (!onClickNextAction.this.RatingCompat) {
                                Intent intent = new Intent(onClickNextAction.this.MediaSessionCompat$Token.getApplicationContext(), AdminContainerActivity.class);
                                intent.putExtra("INTERACTION_PATH", str2);
                                intent.putExtra("INTERACTION_ID", MediaBrowserCompat$ItemReceiver2.getData().getId());
                                intent.putExtra("TRACKING_POINT_TYPE", TrackingPointData.ON_CLICK_TYPE);
                                intent.putExtra("CONTAINER_TYPE", "TRACK_TYPE");
                                intent.setFlags(268435456);
                                onClickNextAction.this.MediaSessionCompat$Token.startActivity(intent);
                            }
                        }
                    });
                    view2 = inflate;
                }
                viewGroup.addView(view2);
            }
            if (deejungTransferLandingActivity.f3129x50fd9e4a.read && MediaBrowserCompat$ItemReceiver2 != null) {
                if (z) {
                    str = write(deejungTransferLandingActivity);
                } else {
                    str = deejungTransferLandingActivity.ParcelableVolumeInfo;
                }
                Captures[] capturePoints = MediaBrowserCompat$ItemReceiver2.getData().getCapturePoints();
                int length2 = capturePoints.length;
                while (true) {
                    if (i >= length2) {
                        captures = null;
                        break;
                    }
                    captures = capturePoints[i];
                    if (captures.getPath() != null && captures.getPath().equals(str)) {
                        break;
                    }
                    i++;
                }
                ViewGroup viewGroup2 = (ViewGroup) this.MediaSessionCompat$ResultReceiverWrapper.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.trackContainer);
                if (captures != null) {
                    view = this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_point_list_capture_update, (ViewGroup) null);
                    final String id2 = captures.getId();
                    ((TextView) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.captureName)).setText(captures.getName());
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.MediaSessionCompat$Token.getString(C6555xdccae8ee.th_captured_into));
                    sb.append(" ");
                    sb.append(captures.getDataAdapterAttribute().getName());
                    ((TextView) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.attributeName)).setText(sb.toString());
                    view.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (!onClickNextAction.this.RatingCompat) {
                                Intent intent = new Intent(onClickNextAction.this.MediaSessionCompat$Token.getApplicationContext(), AdminContainerActivity.class);
                                intent.putExtra("INTERACTION_PATH", deejungTransferLandingActivity.MediaBrowserCompat$MediaItem);
                                intent.putExtra("INTERACTION_ID", MediaBrowserCompat$ItemReceiver2.getData().getId());
                                intent.putExtra("TRACKING_POINT_ID", id2);
                                intent.putExtra("CAPTURE_POINT_ELEMENT_TYPE", deejungTransferLandingActivity.f3129x50fd9e4a.IconCompatParcelizer);
                                intent.putExtra("CONTAINER_TYPE", "CAPTURE_TYPE");
                                intent.setFlags(268435456);
                                onClickNextAction.this.MediaSessionCompat$Token.startActivity(intent);
                            }
                        }
                    });
                    final InteractionRegionResponse interactionRegionResponse2 = MediaBrowserCompat$ItemReceiver2;
                    final DeejungTransferLandingActivity deejungTransferLandingActivity3 = deejungTransferLandingActivity;
                    final boolean z4 = z;
                    view.setOnLongClickListener(new View.OnLongClickListener() {
                        public final boolean onLongClick(View view) {
                            onClickNextAction.IconCompatParcelizer(onClickNextAction.this, interactionRegionResponse2.getData().getId(), deejungTransferLandingActivity3, false, id2, view, z4);
                            return false;
                        }
                    });
                } else {
                    View inflate2 = this.AppCompatDialogFragment.inflate(C6554xc460715d.th_layout_popover_point_list_capture_create, (ViewGroup) null);
                    inflate2.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            if (!onClickNextAction.this.RatingCompat) {
                                Intent intent = new Intent(onClickNextAction.this.MediaSessionCompat$Token.getApplicationContext(), AdminContainerActivity.class);
                                intent.putExtra("INTERACTION_PATH", str);
                                intent.putExtra("CAPTURE_POINT_ELEMENT_TYPE", deejungTransferLandingActivity.f3129x50fd9e4a.IconCompatParcelizer);
                                intent.putExtra("INTERACTION_ID", MediaBrowserCompat$ItemReceiver2.getData().getId());
                                intent.putExtra("CONTAINER_TYPE", "CAPTURE_TYPE");
                                intent.setFlags(268435456);
                                onClickNextAction.this.MediaSessionCompat$Token.startActivity(intent);
                            }
                        }
                    });
                    view = inflate2;
                }
                viewGroup2.addView(view);
                return;
            }
            return;
        }
        super.MediaBrowserCompat$CustomActionResultReceiver();
    }
}

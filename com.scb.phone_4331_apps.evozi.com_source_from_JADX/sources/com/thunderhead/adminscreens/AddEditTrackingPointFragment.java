package com.thunderhead.adminscreens;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatButton;
import com.thunderhead.android.infrastructure.server.entitys.TrackingPointData;
import com.thunderhead.android.infrastructure.server.requests.AddOnClickTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.requests.AddOnLoadTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.requests.AddTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.responses.AddEditTrackingPointResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import com.thunderhead.trackoption.TrackOptionActivity;
import p040o.AlertController$RecycleListView;
import p040o.C1189xa6547b7b;
import p040o.C6554xc460715d;
import p040o.C6555xdccae8ee;
import p040o.C6556x769516c8;
import p040o.C6866x2d3b32b9;
import p040o.CardView;
import p040o.CropDocumentActivity;
import p040o.DeejungTransferMinFullOtpActivity;
import p040o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment;
import p040o.FragmentBuilder_BindHmlDocumentUploadGuidelineFragment;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment;
import p040o.FragmentBuilder_BindHmlNTBOfflineSuccessFragment;
import p040o.FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment;
import p040o.FragmentBuilder_BindIpoTabFragment;
import p040o.FragmentBuilder_BindVerifyIdentityFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onAccountSummaryClick$MediaBrowserCompat$ItemReceiver;

public class AddEditTrackingPointFragment extends Fragment implements FragmentBuilder_BindHmlNTBOfflineSuccessFragment.write {
    Context IconCompatParcelizer;
    CardView MediaBrowserCompat$CustomActionResultReceiver;
    CropDocumentActivity MediaBrowserCompat$ItemReceiver;
    private TTFAppCompatButton MediaBrowserCompat$MediaItem;
    FragmentBuilder_BindHmlNTBOfflineSuccessFragment MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private AppCompatEditText f3105x50fd9e4a;
    private TTFAppCompatButton MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public SwitchCompat MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private String ParcelableVolumeInfo;
    private SwitchCompat RatingCompat;
    boolean read = false;
    boolean write = false;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setRetainInstance(true);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.IconCompatParcelizer = activity.getApplicationContext();
        this.MediaSessionCompat$QueueItem = activity.getIntent().getStringExtra("INTERACTION_ID");
        this.ParcelableVolumeInfo = activity.getIntent().getStringExtra("INTERACTION_PATH");
        String stringExtra = activity.getIntent().getStringExtra("TRACKING_POINT_ID");
        this.MediaSessionCompat$ResultReceiverWrapper = stringExtra;
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            if (!TextUtils.isEmpty(stringExtra)) {
                this.MediaBrowserCompat$SearchResultReceiver = FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlIssuerLandingFragment.read(), this.MediaSessionCompat$QueueItem, this.ParcelableVolumeInfo, this.MediaSessionCompat$ResultReceiverWrapper);
            } else {
                this.MediaBrowserCompat$SearchResultReceiver = new FragmentBuilder_BindHmlNTBOfflineSuccessFragment(this.MediaSessionCompat$QueueItem, activity.getIntent().getStringExtra("TRACKING_POINT_TYPE"));
                if (activity.getIntent().getStringExtra("TRACKING_POINT_TYPE").equals(TrackingPointData.ON_CLICK_TYPE)) {
                    this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem = this.ParcelableVolumeInfo;
                }
            }
            this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$Token = this;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = View.inflate(getActivity(), C6554xc460715d.th_fragment_tracking_point_crud, (ViewGroup) null);
        String stringExtra = getActivity().getIntent().getStringExtra("TRACKING_POINT_ID");
        this.MediaSessionCompat$ResultReceiverWrapper = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_tracking_point_constraint_container).setFocusableInTouchMode(true);
        }
        AppCompatEditText appCompatEditText = (AppCompatEditText) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_tracking_point_crud_edittext_tracking_point_name);
        this.f3105x50fd9e4a = appCompatEditText;
        appCompatEditText.requestFocus();
        this.RatingCompat = (SwitchCompat) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_tracking_point_crud_switch_enable);
        this.MediaDescriptionCompat = (TTFAppCompatButton) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_tracking_point_crud_button_choose_proposition);
        this.MediaBrowserCompat$MediaItem = (TTFAppCompatButton) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_tracking_point_crud_button_choose_activity);
        this.MediaMetadataCompat = (SwitchCompat) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_tracking_point_crud_switch_completion);
        this.f3105x50fd9e4a.setText(this.MediaBrowserCompat$SearchResultReceiver.f3146x50fd9e4a);
        if (this.f3105x50fd9e4a.getSelectionEnd() == 0) {
            this.f3105x50fd9e4a.setSelection(this.MediaBrowserCompat$SearchResultReceiver.f3146x50fd9e4a.length());
        }
        FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = this.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindHmlNTBOfflineSuccessFragment);
        MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlNTBOfflineSuccessFragment);
        this.MediaMetadataCompat.setChecked(this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver);
        this.RatingCompat.setChecked(this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer);
        this.MediaDescriptionCompat.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                Intent intent = new Intent(AddEditTrackingPointFragment.this.getActivity(), TrackOptionActivity.class);
                intent.putExtra("proposition_name", AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction);
                intent.putExtra("proposition_id", AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.setHasDecor);
                intent.putExtra("attribute_id", AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver);
                intent.putExtra("attribute_name", AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                intent.putExtra("activity_request_type_key", 1);
                AddEditTrackingPointFragment.this.startActivityForResult(intent, 1);
            }
        });
        this.MediaBrowserCompat$MediaItem.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                Intent intent = new Intent(AddEditTrackingPointFragment.this.getActivity(), TrackOptionActivity.class);
                intent.putExtra("activity_name", AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.write);
                intent.putExtra("activity_id", AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.read);
                intent.putExtra("activity_request_type_key", 2);
                AddEditTrackingPointFragment.this.startActivityForResult(intent, 2);
            }
        });
        this.MediaMetadataCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver;
                boolean isChecked = AddEditTrackingPointFragment.this.MediaMetadataCompat.isChecked();
                if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo == null && !fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaDescriptionCompat) {
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
                }
                fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$SearchResultReceiver = isChecked;
                fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver();
            }
        });
        this.RatingCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver;
                if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo == null && !fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaDescriptionCompat) {
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
                }
                fragmentBuilder_BindHmlNTBOfflineSuccessFragment.IconCompatParcelizer = z;
                fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver();
            }
        });
        this.f3105x50fd9e4a.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver;
                String obj = editable.toString();
                if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo == null && !fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaDescriptionCompat) {
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
                }
                if (!fragmentBuilder_BindHmlNTBOfflineSuccessFragment.f3146x50fd9e4a.equals(obj)) {
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment.f3146x50fd9e4a = obj;
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver();
                }
            }
        });
        return inflate;
    }

    public void onResume() {
        CardView cardView;
        super.onResume();
        getActivity().setTitle(this.IconCompatParcelizer.getString(C6555xdccae8ee.th_ab_title_track_activity));
        if (isResumed()) {
            getActivity().invalidateOptionsMenu();
        }
        FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = this.MediaBrowserCompat$SearchResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindHmlNTBOfflineSuccessFragment);
        MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlNTBOfflineSuccessFragment);
        this.read = false;
        if (this.write && (cardView = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            cardView.write();
            this.write = false;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.read = true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            boolean z = false;
            if (intent.getIntExtra("RESPONSE_CODE", 0) == 17) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            } else if (i == 1) {
                String stringExtra = intent.getStringExtra("proposition_id");
                if (stringExtra == null || stringExtra.length() == 0) {
                    z = true;
                }
                if (!z) {
                    FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = this.MediaBrowserCompat$SearchResultReceiver;
                    if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo == null && !fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaDescriptionCompat) {
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment.ParcelableVolumeInfo = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                    if (stringExtra != null && !stringExtra.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.setHasDecor)) {
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment.setHasDecor = stringExtra;
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver = "";
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver = "";
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver();
                    }
                    this.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction = intent.getStringExtra("proposition_name");
                } else {
                    FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment2 = this.MediaBrowserCompat$SearchResultReceiver;
                    String stringExtra2 = intent.getStringExtra("attribute_id");
                    if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.ParcelableVolumeInfo == null && !fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaDescriptionCompat) {
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.ParcelableVolumeInfo = fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                    if (stringExtra2 != null && !stringExtra2.equals(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaBrowserCompat$ItemReceiver)) {
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaBrowserCompat$ItemReceiver = stringExtra2;
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.setHasDecor = "";
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.PlaybackStateCompat$CustomAction = "";
                        fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaBrowserCompat$ItemReceiver();
                    }
                    this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = intent.getStringExtra("attribute_name");
                }
            } else if (i == 2) {
                FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment3 = this.MediaBrowserCompat$SearchResultReceiver;
                String stringExtra3 = intent.getStringExtra("activity_id");
                if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment3.ParcelableVolumeInfo == null && !fragmentBuilder_BindHmlNTBOfflineSuccessFragment3.MediaDescriptionCompat) {
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment3.ParcelableVolumeInfo = fragmentBuilder_BindHmlNTBOfflineSuccessFragment3.MediaBrowserCompat$CustomActionResultReceiver();
                }
                if (!fragmentBuilder_BindHmlNTBOfflineSuccessFragment3.read.equals(stringExtra3)) {
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment3.read = stringExtra3;
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment3.MediaBrowserCompat$ItemReceiver();
                }
                this.MediaBrowserCompat$SearchResultReceiver.write = intent.getStringExtra("activity_name");
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        CropDocumentActivity cropDocumentActivity = new CropDocumentActivity(menu, menuInflater);
        this.MediaBrowserCompat$ItemReceiver = cropDocumentActivity;
        cropDocumentActivity.write(this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper);
        CropDocumentActivity cropDocumentActivity2 = this.MediaBrowserCompat$ItemReceiver;
        C62307 r3 = new Object() {
            public final void onClick(View view) {
                AddTrackingPointRequest addTrackingPointRequest;
                AddEditTrackingPointFragment.this.MediaBrowserCompat$ItemReceiver.write(false);
                AlertController$RecycleListView.IconCompatParcelizer((Activity) AddEditTrackingPointFragment.this.getActivity());
                if (FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver == null) {
                    FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment();
                }
                C6556x769516c8 MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this);
                FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment = AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver;
                String str = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.f3146x50fd9e4a;
                if (str != null) {
                    fragmentBuilder_BindHmlNTBOfflineSuccessFragment.f3146x50fd9e4a = str.trim();
                }
                if (AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat) {
                    FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
                    FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment2 = AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver;
                    FragmentActivity activity = AddEditTrackingPointFragment.this.getActivity();
                    if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.Keep.equals(TrackingPointData.ON_LOAD_TYPE)) {
                        addTrackingPointRequest = new AddOnLoadTrackingPointRequest();
                    } else if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.Keep.equals(TrackingPointData.ON_CLICK_TYPE)) {
                        addTrackingPointRequest = new AddOnClickTrackingPointRequest(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaSessionCompat$QueueItem);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unknown tracking point type: ");
                        sb.append(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.Keep);
                        MyECouponActivity_ViewBinding.write(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unknown tracking point type: ");
                        sb2.append(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.Keep);
                        MediaBrowserCompat$CustomActionResultReceiver.write(1, sb2.toString());
                        return;
                    }
                    addTrackingPointRequest.setInteractionId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaMetadataCompat);
                    addTrackingPointRequest.setPropositionId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.setHasDecor);
                    addTrackingPointRequest.setDataAdapterAttributeId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaBrowserCompat$ItemReceiver);
                    addTrackingPointRequest.setDataAdapterAttributeName(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.MediaBrowserCompat$CustomActionResultReceiver);
                    addTrackingPointRequest.setEventTypeId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.read);
                    addTrackingPointRequest.setName(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.f3146x50fd9e4a);
                    addTrackingPointRequest.setEnabled(fragmentBuilder_BindHmlNTBOfflineSuccessFragment2.IconCompatParcelizer);
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.IconCompatParcelizer, addTrackingPointRequest.toString());
                    MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver.createTrackingPoint(addTrackingPointRequest, new NetworkOperationCallback<AddEditTrackingPointResponse>(MediaBrowserCompat$CustomActionResultReceiver, activity) {
                        private /* synthetic */ FragmentBuilder_BindHmlDocumentUploadGuidelineFragment read;
                        private /* synthetic */ Activity write;

                        {
                            this.read = r2;
                            this.write = r3;
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            AddEditTrackingPointResponse addEditTrackingPointResponse = (AddEditTrackingPointResponse) obj;
                            if (addEditTrackingPointResponse == null) {
                                this.read.write(1, "Can not load interaction context: an empty response received");
                            } else if (addEditTrackingPointResponse.getData() == null) {
                                this.read.write(1, "Data section of the response is empty");
                            } else {
                                this.read.read();
                            }
                        }

                        public final void onFailure(NetworkOperationError networkOperationError) {
                            Activity activity = FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.MediaBrowserCompat$CustomActionResultReceiver;
                            Activity activity2 = this.write;
                            if (activity2 != null) {
                                activity = activity2;
                            }
                            FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.IconCompatParcelizer.read(activity, networkOperationError, this.read);
                        }
                    });
                    return;
                }
                FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem().write(AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver, (FragmentBuilder_BindHmlDocumentUploadGuidelineFragment) MediaBrowserCompat$CustomActionResultReceiver, (Activity) AddEditTrackingPointFragment.this.getActivity());
            }

            public final void write(int i, String str) {
                Log.d(AddEditTrackingPointFragment.class.getSimpleName(), "FAILURE");
                AddEditTrackingPointFragment.this.getActivity().finish();
                FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF));
                if (DeejungTransferMinFullOtpActivity.read == null) {
                    DeejungTransferMinFullOtpActivity.read = new DeejungTransferMinFullOtpActivity();
                }
                DeejungTransferMinFullOtpActivity.read.IconCompatParcelizer = new DeejungTransferMinFullOtpActivity.write(i, (NetworkOperationError) null, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
                AddEditTrackingPointFragment.this.MediaBrowserCompat$ItemReceiver.write(true);
            }

            public final void read() {
                String str;
                String str2;
                int i;
                Context context;
                if (TextUtils.isEmpty(AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction)) {
                    str = AddEditTrackingPointFragment.this.IconCompatParcelizer.getString(C6555xdccae8ee.th_proposition_selected_dynamically);
                } else {
                    str = AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.PlaybackStateCompat$CustomAction;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(10);
                sb.append(AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.write);
                String obj = sb.toString();
                if (AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.Keep.equals(TrackingPointData.ON_LOAD_TYPE)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(" ");
                    sb2.append(AddEditTrackingPointFragment.this.IconCompatParcelizer.getString(C6555xdccae8ee.th_onload_tracking_success_msg));
                    str2 = sb2.toString();
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append(" ");
                    sb3.append(AddEditTrackingPointFragment.this.IconCompatParcelizer.getString(C6555xdccae8ee.th_on_click_tracking_success_msg));
                    str2 = sb3.toString();
                }
                int length = str2.length();
                int length2 = str.length();
                int indexOf = str2.indexOf(10) + 1;
                int length3 = AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.write.length();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(AddEditTrackingPointFragment.this.getContext(), C1189xa6547b7b.ThunderheadAdminTextPointSuccess), 0, length, 0);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(AddEditTrackingPointFragment.this.getContext(), C1189xa6547b7b.ThunderheadAdminButton_Configured), 0, length2, 0);
                spannableStringBuilder.setSpan(new TextAppearanceSpan(AddEditTrackingPointFragment.this.getContext(), C1189xa6547b7b.ThunderheadAdminButton_Configured), indexOf, length3 + indexOf, 0);
                CreateTrackingCapturePointSuccessFragment createTrackingCapturePointSuccessFragment = new CreateTrackingCapturePointSuccessFragment();
                if (AddEditTrackingPointFragment.this.MediaBrowserCompat$SearchResultReceiver.MediaDescriptionCompat) {
                    context = AddEditTrackingPointFragment.this.IconCompatParcelizer;
                    i = C6555xdccae8ee.th_tracking_enabled;
                } else {
                    context = AddEditTrackingPointFragment.this.IconCompatParcelizer;
                    i = C6555xdccae8ee.th_tracking_updated;
                }
                createTrackingCapturePointSuccessFragment.write = context.getString(i);
                createTrackingCapturePointSuccessFragment.MediaBrowserCompat$ItemReceiver = spannableStringBuilder;
                AddEditTrackingPointFragment addEditTrackingPointFragment = AddEditTrackingPointFragment.this;
                addEditTrackingPointFragment.MediaBrowserCompat$CustomActionResultReceiver = addEditTrackingPointFragment.getActivity().getSupportFragmentManager().read();
                AddEditTrackingPointFragment.this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, createTrackingCapturePointSuccessFragment, "CreateTrackingCapturePointSuccessFragment");
                if (AddEditTrackingPointFragment.this.read) {
                    AddEditTrackingPointFragment.this.write = true;
                } else {
                    AddEditTrackingPointFragment.this.MediaBrowserCompat$CustomActionResultReceiver.write();
                }
                AddEditTrackingPointFragment.this.MediaBrowserCompat$ItemReceiver.write(true);
            }

            public final void MediaBrowserCompat$ItemReceiver(Object obj) {
                AddEditTrackingPointFragment.this.MediaBrowserCompat$ItemReceiver.write(true);
            }
        };
        cropDocumentActivity2.MediaBrowserCompat$ItemReceiver.add(r3);
        new FragmentBuilder_BindIpoTabFragment(r3) {
            private /* synthetic */ View.OnClickListener write;

            {
                this.write = r2;
            }

            public final void MediaBrowserCompat$ItemReceiver() {
                CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.remove(CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.lastIndexOf(this.write));
            }
        };
    }

    private void read(TextView textView) {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = getResources().getColor(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_admin_screen_point_data_configured, this.MediaBrowserCompat$MediaItem.getContext().getTheme());
        } else {
            i = getResources().getColor(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_admin_screen_point_data_configured);
        }
        textView.setTextColor(i);
    }

    private void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment) {
        String str = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.write;
        if (!TextUtils.isEmpty(str)) {
            this.MediaBrowserCompat$MediaItem.setText(str);
            this.MediaBrowserCompat$MediaItem.setTypeface(Typeface.SANS_SERIF, 0);
            read(this.MediaBrowserCompat$MediaItem);
            return;
        }
        this.MediaBrowserCompat$MediaItem.setTypeface(Typeface.SANS_SERIF, 2);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment) {
        String str = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.PlaybackStateCompat$CustomAction;
        String str2 = fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Context context = getContext();
        if (context == null) {
            context = AlertController$RecycleListView.MediaDescriptionCompat(this.IconCompatParcelizer);
        }
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            this.MediaDescriptionCompat.setTypeface(Typeface.SANS_SERIF, 0);
            this.MediaDescriptionCompat.setText(str);
            read(this.MediaDescriptionCompat);
        } else if (!TextUtils.isEmpty(str2)) {
            this.MediaDescriptionCompat.setTypeface(Typeface.SANS_SERIF, 0);
            String string = context.getString(C6555xdccae8ee.th_proposition_selected_dynamically);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(10);
            sb.append(string);
            String obj = sb.toString();
            int length = str2.length();
            int length2 = obj.length();
            int indexOf = obj.indexOf(10);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj);
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, C1189xa6547b7b.ThunderheadAdminButton_Configured), 0, length, 0);
            spannableStringBuilder.setSpan(new TextAppearanceSpan(context, C1189xa6547b7b.ThunderheadAdminButton_Configured_Caption), indexOf, length2, 0);
            this.MediaDescriptionCompat.setText(spannableStringBuilder);
        } else {
            if (str == null || str.length() == 0) {
                if (str2 == null || str2.length() == 0) {
                    z = true;
                }
                if (z) {
                    this.MediaDescriptionCompat.setTypeface(Typeface.SANS_SERIF, 2);
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (isResumed()) {
            getActivity().invalidateOptionsMenu();
        }
    }

    public final void IconCompatParcelizer() {
        if (isResumed()) {
            getActivity().invalidateOptionsMenu();
        }
    }
}

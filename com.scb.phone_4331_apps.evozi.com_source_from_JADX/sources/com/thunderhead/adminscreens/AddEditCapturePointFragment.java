package com.thunderhead.adminscreens;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
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
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatButton;
import com.thunderhead.android.infrastructure.server.requests.AddNewDataAttributeRequest;
import com.thunderhead.connectivity.NetworkOperationError;
import com.thunderhead.trackoption.ListOfDataAttributesActivity;
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
import p040o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment;
import p040o.FragmentBuilder_BindHmlNTBOfflineSuccessFragment;
import p040o.FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment;
import p040o.FragmentBuilder_BindIpoTabFragment;
import p040o.FragmentBuilder_BindVerifyIdentityFragment;
import p040o.onAccountSummaryClick$MediaBrowserCompat$ItemReceiver;

public class AddEditCapturePointFragment extends Fragment implements FragmentBuilder_BindHmlNTBOfflineSuccessFragment.write {
    FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment IconCompatParcelizer;
    CardView MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver = false;
    boolean MediaBrowserCompat$MediaItem = false;
    private TTFAppCompatButton MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private String MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    private SwitchCompat ParcelableVolumeInfo;
    private AppCompatEditText RatingCompat;
    CropDocumentActivity read;
    Context write;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = View.inflate(getActivity(), C6554xc460715d.th_fragment_capture_point_crud, (ViewGroup) null);
        String stringExtra = getActivity().getIntent().getStringExtra("TRACKING_POINT_ID");
        this.MediaDescriptionCompat = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_capture_point_crud_constraint_container).setFocusableInTouchMode(true);
        }
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.MediaSessionCompat$ResultReceiverWrapper = getActivity().getIntent().getStringExtra("INTERACTION_ID");
        this.MediaMetadataCompat = getActivity().getIntent().getStringExtra("INTERACTION_PATH");
        this.MediaSessionCompat$Token = getActivity().getIntent().getStringExtra("CAPTURE_POINT_ELEMENT_TYPE");
        this.write = getActivity().getApplicationContext();
        if (this.IconCompatParcelizer == null) {
            if (!TextUtils.isEmpty(this.MediaDescriptionCompat)) {
                this.IconCompatParcelizer = FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlIssuerLandingFragment.read(), this.MediaSessionCompat$ResultReceiverWrapper, this.MediaMetadataCompat, this.MediaDescriptionCompat);
            } else {
                FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment = new FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment(this.MediaSessionCompat$ResultReceiverWrapper);
                this.IconCompatParcelizer = fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment;
                fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setContentView = this.MediaMetadataCompat;
                this.IconCompatParcelizer.MediaDescriptionCompat = this.MediaSessionCompat$Token;
            }
            this.IconCompatParcelizer.PlaybackStateCompat$CustomAction = this;
        }
        this.ParcelableVolumeInfo = (SwitchCompat) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_capture_point_crud_switch_enable);
        AppCompatEditText appCompatEditText = (AppCompatEditText) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_capture_point_crud_edittext_capture_point_name);
        this.RatingCompat = appCompatEditText;
        appCompatEditText.requestFocus();
        this.MediaBrowserCompat$SearchResultReceiver = (TTFAppCompatButton) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_capture_point_crud_button_choose_attribute);
        write();
        this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                AddEditCapturePointFragment.this.startActivityForResult(new Intent().setClass(AddEditCapturePointFragment.this.getActivity(), ListOfDataAttributesActivity.class).putExtra("ATTRIBUTE_ID", AddEditCapturePointFragment.this.IconCompatParcelizer.MediaMetadataCompat), 1);
            }
        });
        this.ParcelableVolumeInfo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment = AddEditCapturePointFragment.this.IconCompatParcelizer;
                if (fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setHasDecor == null && !fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.f3145x50fd9e4a) {
                    fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setHasDecor = fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.write();
                }
                fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaSessionCompat$QueueItem = z;
                fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.read();
            }
        });
        this.RatingCompat.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment = AddEditCapturePointFragment.this.IconCompatParcelizer;
                String obj = editable.toString();
                if (fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setHasDecor == null && !fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.f3145x50fd9e4a) {
                    fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setHasDecor = fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.write();
                }
                if (!fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.Keep.equals(obj)) {
                    fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.Keep = obj;
                    fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.read();
                }
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        if (r0.equals(com.thunderhead.android.infrastructure.server.entitys.AttributeData.BOOLEAN_TYPE) != false) goto L_0x00dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void write() {
        /*
            r7 = this;
            androidx.appcompat.widget.SwitchCompat r0 = r7.ParcelableVolumeInfo
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r1 = r7.IconCompatParcelizer
            boolean r1 = r1.MediaSessionCompat$QueueItem
            r0.setChecked(r1)
            androidx.appcompat.widget.AppCompatEditText r0 = r7.RatingCompat
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r1 = r7.IconCompatParcelizer
            java.lang.String r1 = r1.Keep
            r0.setText(r1)
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r0 = r7.IconCompatParcelizer
            java.lang.String r1 = r0.MediaBrowserCompat$CustomActionResultReceiver
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x001f
            java.lang.String r0 = r0.IconCompatParcelizer
            goto L_0x0021
        L_0x001f:
            java.lang.String r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
        L_0x0021:
            com.thunderhead.android.infrastructure.ui.views.TTFAppCompatButton r1 = r7.MediaBrowserCompat$SearchResultReceiver
            android.graphics.Typeface r2 = android.graphics.Typeface.SANS_SERIF
            r3 = 0
            r1.setTypeface(r2, r3)
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r1 = r7.IconCompatParcelizer
            java.lang.String r1 = r1.AlertController$RecycleListView
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00a2
            android.content.Context r1 = r7.getContext()
            int r4 = p040o.C6555xdccae8ee.th_icon_key
            java.lang.String r1 = r1.getString(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            android.content.Context r0 = r7.write
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = ""
            goto L_0x005f
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "    "
            r0.append(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x005f:
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.content.Context r4 = r7.write
            r5 = 0
            if (r4 != 0) goto L_0x006d
            r4 = r5
            goto L_0x0071
        L_0x006d:
            android.content.res.Resources r4 = r4.getResources()
        L_0x0071:
            if (r4 != 0) goto L_0x0075
            r4 = r5
            goto L_0x007b
        L_0x0075:
            int r6 = p040o.C6555xdccae8ee.th_fontello_ttf_file
            java.lang.String r4 = r4.getString(r6)
        L_0x007b:
            android.content.Context r6 = r7.write
            if (r6 == 0) goto L_0x0083
            android.content.res.AssetManager r5 = r6.getAssets()
        L_0x0083:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromAsset(r5, r4)
            o.onDoneClicked r5 = new o.onDoneClicked
            r5.<init>(r4)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r0)
            int r1 = r0.indexOf(r1)
            int r0 = r0.length()
            r4.setSpan(r5, r1, r0, r3)
            com.thunderhead.android.infrastructure.ui.views.TTFAppCompatButton r0 = r7.MediaBrowserCompat$SearchResultReceiver
            r0.setText(r4)
            goto L_0x00a7
        L_0x00a2:
            com.thunderhead.android.infrastructure.ui.views.TTFAppCompatButton r1 = r7.MediaBrowserCompat$SearchResultReceiver
            r1.setText(r0)
        L_0x00a7:
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r0 = r7.IconCompatParcelizer
            java.lang.String r0 = r0.read
            int r1 = r0.hashCode()
            r4 = -1724355406(0xffffffff99386cb2, float:-9.534528E-24)
            r5 = 2
            if (r1 == r4) goto L_0x00d2
            r4 = -1282431251(0xffffffffb38fa6ed, float:-6.68932E-8)
            if (r1 == r4) goto L_0x00c8
            r4 = 782694408(0x2ea6f808, float:7.592865E-11)
            if (r1 != r4) goto L_0x00dc
            java.lang.String r1 = "BOOLEAN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00dc
            goto L_0x00dd
        L_0x00c8:
            java.lang.String r1 = "NUMERIC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00dc
            r3 = r2
            goto L_0x00dd
        L_0x00d2:
            java.lang.String r1 = "SYMBOLIC"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00dc
            r3 = r5
            goto L_0x00dd
        L_0x00dc:
            r3 = -1
        L_0x00dd:
            if (r3 == 0) goto L_0x00fb
            if (r3 == r2) goto L_0x00ef
            if (r3 != r5) goto L_0x0106
            com.thunderhead.android.infrastructure.ui.views.TTFAppCompatButton r0 = r7.MediaBrowserCompat$SearchResultReceiver
            o.CropDocumentActivity_ViewBinding r1 = p040o.CropDocumentActivity_ViewBinding.LEFT
            int r2 = p040o.C6555xdccae8ee.th_icon_symbolic
            int r3 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_icon_symbolic
            r0.setFontIcon((p040o.CropDocumentActivity_ViewBinding) r1, (int) r2, (int) r3)
            return
        L_0x00ef:
            com.thunderhead.android.infrastructure.ui.views.TTFAppCompatButton r0 = r7.MediaBrowserCompat$SearchResultReceiver
            o.CropDocumentActivity_ViewBinding r1 = p040o.CropDocumentActivity_ViewBinding.LEFT
            int r2 = p040o.C6555xdccae8ee.th_icon_numeric
            int r3 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_icon_numeric
            r0.setFontIcon((p040o.CropDocumentActivity_ViewBinding) r1, (int) r2, (int) r3)
            return
        L_0x00fb:
            com.thunderhead.android.infrastructure.ui.views.TTFAppCompatButton r0 = r7.MediaBrowserCompat$SearchResultReceiver
            o.CropDocumentActivity_ViewBinding r1 = p040o.CropDocumentActivity_ViewBinding.LEFT
            int r2 = p040o.C6555xdccae8ee.th_icon_boolean
            int r3 = p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_icon_boolean
            r0.setFontIcon((p040o.CropDocumentActivity_ViewBinding) r1, (int) r2, (int) r3)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thunderhead.adminscreens.AddEditCapturePointFragment.write():void");
    }

    public void onResume() {
        CardView cardView;
        super.onResume();
        getActivity().setTitle(getActivity().getString(C6555xdccae8ee.th_ab_title_capture_activity));
        if (isResumed()) {
            getActivity().invalidateOptionsMenu();
        }
        this.MediaBrowserCompat$ItemReceiver = false;
        if (this.MediaBrowserCompat$MediaItem && (cardView = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            cardView.write();
            this.MediaBrowserCompat$MediaItem = false;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.MediaBrowserCompat$ItemReceiver = true;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        CropDocumentActivity cropDocumentActivity = new CropDocumentActivity(menu, menuInflater);
        this.read = cropDocumentActivity;
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, (byte) 0);
        cropDocumentActivity.MediaBrowserCompat$ItemReceiver.add(iconCompatParcelizer);
        new FragmentBuilder_BindIpoTabFragment(iconCompatParcelizer) {
            private /* synthetic */ View.OnClickListener write;

            {
                this.write = r2;
            }

            public final void MediaBrowserCompat$ItemReceiver() {
                CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.remove(CropDocumentActivity.this.MediaBrowserCompat$ItemReceiver.lastIndexOf(this.write));
            }
        };
    }

    public void onPrepareOptionsMenu(Menu menu) {
        this.read.write(this.IconCompatParcelizer.PlaybackStateCompat);
        super.onPrepareOptionsMenu(menu);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (intent.getIntExtra("RESPONSE_CODE", 0) == 17) {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            } else if (i == 1) {
                this.IconCompatParcelizer.IconCompatParcelizer = intent.getStringExtra("ATTRIBUTE_NAME");
                this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(intent.getStringExtra("ATTRIBUTE_ID"));
                this.IconCompatParcelizer.read = intent.getStringExtra("ATTRIBUTE_TYPE");
                this.IconCompatParcelizer.AlertController$RecycleListView = intent.getStringExtra("ATTRIBUTE_KEYAPINAME");
                if (this.IconCompatParcelizer.MediaMetadataCompat.equals("NEW_DATA_ATTRIBUTE_ID")) {
                    this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = intent.getStringExtra("CUSTOMER_META_DATA_ID");
                }
                write();
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    class IconCompatParcelizer implements View.OnClickListener, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(AddEditCapturePointFragment addEditCapturePointFragment, byte b) {
            this();
        }

        public final void onClick(View view) {
            AddEditCapturePointFragment.this.read.write(false);
            FragmentActivity activity = AddEditCapturePointFragment.this.getActivity();
            if (activity != null) {
                AlertController$RecycleListView.IconCompatParcelizer((Activity) activity);
            }
            if (FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver == null) {
                FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment();
            }
            C6556x769516c8 MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlNTBOutcomeResubmissionFragment.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(this);
            FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment = AddEditCapturePointFragment.this.IconCompatParcelizer;
            String str = fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.Keep;
            if (str != null) {
                fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.Keep = str.trim();
            }
            FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem = FragmentBuilder_BindHmlIssuerLandingFragment.MediaSessionCompat$QueueItem();
            FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2 = AddEditCapturePointFragment.this.IconCompatParcelizer;
            FragmentActivity activity2 = AddEditCapturePointFragment.this.getActivity();
            if (fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2.MediaMetadataCompat.equals("NEW_DATA_ATTRIBUTE_ID")) {
                MediaSessionCompat$QueueItem.read(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2, MediaBrowserCompat$CustomActionResultReceiver, new AddNewDataAttributeRequest((String) null, 1, 1, (String) null, fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2.read, (String) null, fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2.Keep, (String) null), 1, activity2);
            } else {
                MediaSessionCompat$QueueItem.write(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2, (FragmentBuilder_BindHmlDocumentUploadGuidelineFragment) MediaBrowserCompat$CustomActionResultReceiver, (Activity) activity2);
            }
        }

        public final void write(int i, String str) {
            Log.d(AddEditCapturePointFragment.class.getSimpleName(), "FAILURE");
            AddEditCapturePointFragment.this.getActivity().finish();
            FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(new C6866x2d3b32b9(FragmentBuilder_BindVerifyIdentityFragment.DESIGN_TIME_OFF));
            if (DeejungTransferMinFullOtpActivity.read == null) {
                DeejungTransferMinFullOtpActivity.read = new DeejungTransferMinFullOtpActivity();
            }
            DeejungTransferMinFullOtpActivity.read.IconCompatParcelizer = new DeejungTransferMinFullOtpActivity.write(i, (NetworkOperationError) null, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null);
            AddEditCapturePointFragment.this.read.write(true);
        }

        public final void read() {
            CreateTrackingCapturePointSuccessFragment createTrackingCapturePointSuccessFragment = new CreateTrackingCapturePointSuccessFragment();
            createTrackingCapturePointSuccessFragment.write = AddEditCapturePointFragment.this.write.getString(C6555xdccae8ee.th_capture_enabled);
            StringBuilder sb = new StringBuilder();
            sb.append(AddEditCapturePointFragment.this.IconCompatParcelizer.Keep);
            sb.append(" ");
            sb.append(AddEditCapturePointFragment.this.write.getString(C6555xdccae8ee.th_capture_point_success_msg));
            sb.append(" ");
            sb.append(AddEditCapturePointFragment.this.IconCompatParcelizer.IconCompatParcelizer);
            String obj = sb.toString();
            int length = obj.length();
            int length2 = AddEditCapturePointFragment.this.IconCompatParcelizer.Keep.length();
            int lastIndexOf = obj.lastIndexOf(AddEditCapturePointFragment.this.IconCompatParcelizer.IconCompatParcelizer);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj);
            spannableStringBuilder.setSpan(new TextAppearanceSpan(AddEditCapturePointFragment.this.getContext(), C1189xa6547b7b.ThunderheadAdminTextPointSuccess), 0, length, 0);
            spannableStringBuilder.setSpan(new TextAppearanceSpan(AddEditCapturePointFragment.this.getContext(), C1189xa6547b7b.ThunderheadAdminTextPointSuccess_Configured), 0, length2, 0);
            spannableStringBuilder.setSpan(new TextAppearanceSpan(AddEditCapturePointFragment.this.getContext(), C1189xa6547b7b.ThunderheadAdminTextPointSuccess_Configured), lastIndexOf, length, 0);
            createTrackingCapturePointSuccessFragment.MediaBrowserCompat$ItemReceiver = spannableStringBuilder;
            AddEditCapturePointFragment addEditCapturePointFragment = AddEditCapturePointFragment.this;
            addEditCapturePointFragment.MediaBrowserCompat$CustomActionResultReceiver = addEditCapturePointFragment.getActivity().getSupportFragmentManager().read();
            AddEditCapturePointFragment.this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.fragment_container, createTrackingCapturePointSuccessFragment, "CreateTrackingCapturePointSuccessFragment");
            if (AddEditCapturePointFragment.this.MediaBrowserCompat$ItemReceiver) {
                AddEditCapturePointFragment.this.MediaBrowserCompat$MediaItem = true;
            } else {
                AddEditCapturePointFragment.this.MediaBrowserCompat$CustomActionResultReceiver.write();
            }
            AddEditCapturePointFragment.this.read.write(true);
        }

        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            AddEditCapturePointFragment.this.read.write(true);
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

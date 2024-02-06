package com.scb.phone.view.fragment.ntb.fillinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTouch;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.EkycSuccessActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ByteStreams;
import p040o.C4054b;
import p040o.C4069bH;
import p040o.C4070bI;
import p040o.C4071bJ;
import p040o.C4198cm;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.KtaJsonCheck$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blend;
import p040o.containsRow;
import p040o.expireAfterWrite;
import p040o.getCameraPosition;
import p040o.getFiles;
import p040o.getICheckDeserializerRtti;
import p040o.getMinZoomLevel;
import p040o.getProjection;
import p040o.isIndoorEnabled;
import p040o.putInjector;
import p040o.readBytes;
import p040o.setKey;
import p040o.setOrgId;
import p040o.setTapText;
import p040o.slice;

public class FillInformationFragment extends BaseFragment implements KtaJsonCheck$MediaBrowserCompat$ItemReceiver {
    public FragmentBuilder_BindChangeChannelStatementReviewFragment.write IconCompatParcelizer;
    private ArrayAdapter<String> MediaBrowserCompat$CustomActionResultReceiver;
    private ArrayList MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$SearchResultReceiver;
    private blend MediaDescriptionCompat = new blend();
    private KtaJsonCheck.MediaDescriptionCompat MediaMetadataCompat;
    /* access modifiers changed from: private */
    public boolean RatingCompat;
    @BindView
    Button buttonNext;
    @HmlPinActivity
    public C4198cm fillInformationPresenter;
    @BindView
    TextView lbMiddleName;
    @BindView
    Spinner spinnerTitle;
    @BindView
    TextView textFirstName;
    @BindView
    TextView textLastName;
    @BindView
    TextView textMiddleName;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) {
            this.IconCompatParcelizer = (FragmentBuilder_BindChangeChannelStatementReviewFragment.write) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaMetadataCompat = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87462131493973, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fillInformationPresenter.MediaBrowserCompat$ItemReceiver(this);
        C4198cm cmVar = this.fillInformationPresenter;
        String string = getArguments().getString("BUNDLE_STAGE");
        getProjection write = cmVar.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.write();
        if (string != null) {
            char c = 65535;
            int hashCode = string.hashCode();
            if (hashCode != 49) {
                if (hashCode != 50) {
                    if (hashCode != 79232780) {
                        if (hashCode != 411364890) {
                            if (hashCode == 867473415 && string.equals("TOUCHPOINT_COMPLETE")) {
                                c = 4;
                            }
                        } else if (string.equals("RP_COMPLETE")) {
                            c = 3;
                        }
                    } else if (string.equals("RP_PERSONAL_INFO")) {
                        c = 1;
                    }
                } else if (string.equals("2")) {
                    c = 2;
                }
            } else if (string.equals(DiskLruCache.VERSION_1)) {
                c = 0;
            }
            if (c == 0 || c == 1) {
                readBytes readbytes = cmVar.read;
                getMinZoomLevel getminzoomlevel = write.MediaMetadataCompat;
                cmVar.MediaBrowserCompat$MediaItem.read.setCheckable();
                cmVar.IconCompatParcelizer = readbytes.MediaBrowserCompat$ItemReceiver(getminzoomlevel);
                cmVar.MediaBrowserCompat$SearchResultReceiver = ByteStreams.ByteArrayDataInputStream.IconCompatParcelizer(write.PlaybackStateCompat$CustomAction, cmVar.MediaBrowserCompat$MediaItem.read.setCheckable());
                putInjector putinjector = new putInjector(cmVar, write);
                if (cmVar.RatingCompat != null) {
                    putinjector.IconCompatParcelizer(cmVar.RatingCompat);
                }
                cmVar.MediaDescriptionCompat = DiskLruCache.VERSION_1.equals(write.Keep);
                C4069bH bHVar = new C4069bH(cmVar);
                if (cmVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    bHVar.IconCompatParcelizer(cmVar.RatingCompat);
                }
            } else if (c == 2 || c == 3 || c == 4) {
                slice slice = cmVar.MediaBrowserCompat$ItemReceiver;
                isIndoorEnabled isindoorenabled = write.ParcelableVolumeInfo;
                getCameraPosition getcameraposition = write.read;
                getFiles MediaBrowserCompat$CustomActionResultReceiver2 = getFiles.MediaBrowserCompat$CustomActionResultReceiver();
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = isindoorenabled.read;
                MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(isindoorenabled.write, false);
                MediaBrowserCompat$CustomActionResultReceiver2.read = isindoorenabled.IconCompatParcelizer;
                String str3 = "";
                if (isindoorenabled.MediaBrowserCompat$ItemReceiver == null) {
                    str = str3;
                } else {
                    str = slice.IconCompatParcelizer("dd MMM yyyy - HH:mm", isindoorenabled.MediaBrowserCompat$ItemReceiver);
                }
                MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat = str;
                if (getcameraposition == null || getcameraposition.MediaBrowserCompat$ItemReceiver == null) {
                    str2 = str3;
                } else {
                    str2 = getcameraposition.MediaBrowserCompat$ItemReceiver;
                }
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = str2;
                if (!(getcameraposition == null || getcameraposition.write == null)) {
                    str3 = getcameraposition.write;
                }
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem = str3;
                C4054b.C4056b bVar = new C4054b.C4056b(MediaBrowserCompat$CustomActionResultReceiver2);
                if (cmVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    bVar.IconCompatParcelizer(cmVar.RatingCompat);
                }
            }
        }
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaMetadataCompat;
        if (mediaDescriptionCompat != null) {
            blend blend = this.MediaDescriptionCompat;
            String read = mediaDescriptionCompat.read();
            String write2 = this.fillInformationPresenter.write.write();
            blend.read("source", read);
            if (write2 != null && "touchpoint".equals(read)) {
                blend.read("customer_group", write2);
            }
        }
        blend blend2 = this.MediaDescriptionCompat;
        if (getActivity() != null) {
            blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_personalinformation");
        }
        return inflate;
    }

    @OnTouch
    public boolean onSpinnerTouch(View view, MotionEvent motionEvent) {
        boolean z = true;
        if (motionEvent.getAction() == 1) {
            C4198cm cmVar = this.fillInformationPresenter;
            if (cmVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                cmVar.RatingCompat.AlertController$RecycleListView();
            }
            cmVar.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
            cmVar.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new C4198cm.read());
        }
        return false;
    }

    public void onResume() {
        super.onResume();
        FragmentBuilder_BindChangeChannelStatementReviewFragment.write write = this.IconCompatParcelizer;
        if (write != null) {
            write.write(getString(R.string.ntb_fillinformation_personal_info_page));
            this.IconCompatParcelizer.am_();
        }
    }

    @OnClick
    public void onNextButtonClick(View view) {
        String str;
        C4198cm cmVar = this.fillInformationPresenter;
        int i = this.MediaBrowserCompat$SearchResultReceiver;
        if (cmVar.MediaDescriptionCompat) {
            str = cmVar.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.write().PlaybackStateCompat$CustomAction.MediaDescriptionCompat;
        } else {
            int i2 = i - 1;
            List<setOrgId> list = cmVar.MediaMetadataCompat;
            if (list == null) {
                setOrgId setorgid = cmVar.MediaBrowserCompat$SearchResultReceiver;
                if (setorgid != null) {
                    str = setorgid.MediaDescriptionCompat;
                }
            } else if (i2 >= 0 && i2 < list.size()) {
                str = cmVar.MediaMetadataCompat.get(i2).MediaDescriptionCompat;
            }
            str = "";
        }
        expireAfterWrite read = expireAfterWrite.read();
        read.MediaBrowserCompat$CustomActionResultReceiver = str;
        containsRow IconCompatParcelizer2 = containsRow.IconCompatParcelizer();
        IconCompatParcelizer2.f2810x50fd9e4a = read;
        if (cmVar.RatingCompat != null) {
            cmVar.RatingCompat.AlertController$RecycleListView();
        }
        cmVar.MediaBrowserCompat$MediaItem.write(IconCompatParcelizer2);
        cmVar.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new C4198cm.write());
    }

    public final void write(setOrgId setorgid, boolean z) {
        String str;
        this.MediaBrowserCompat$MediaItem = new ArrayList();
        if (setorgid != null) {
            str = setorgid.MediaDescriptionCompat;
            this.RatingCompat = true;
            this.buttonNext.setEnabled(true);
        } else {
            str = getString(R.string.ntb_fillinformation_personal_info_title_hint);
            this.RatingCompat = false;
            this.buttonNext.setEnabled(false);
        }
        this.MediaBrowserCompat$MediaItem.add(str);
        C61054 r4 = new ArrayAdapter<String>(getContext(), this.MediaBrowserCompat$MediaItem) {
            public final boolean isEnabled(int i) {
                return true;
            }

            public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                TextView textView = (TextView) dropDownView;
                if (i == 0) {
                    FillInformationFragment.this.getResources();
                    textView.setTextColor(-3553587);
                } else {
                    FillInformationFragment.this.getResources();
                    textView.setTextColor(-13290951);
                }
                return dropDownView;
            }

            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                FillInformationFragment.MediaBrowserCompat$ItemReceiver(FillInformationFragment.this, i, (TextView) view2);
                return view2;
            }
        };
        this.MediaBrowserCompat$CustomActionResultReceiver = r4;
        this.spinnerTitle.setAdapter(r4);
        if (z) {
            this.spinnerTitle.setEnabled(false);
            this.spinnerTitle.setClickable(false);
            return;
        }
        this.spinnerTitle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                boolean z = true;
                if (!FillInformationFragment.this.RatingCompat || i > 0) {
                    int unused = FillInformationFragment.this.MediaBrowserCompat$SearchResultReceiver = i;
                    C4198cm cmVar = FillInformationFragment.this.fillInformationPresenter;
                    if (FillInformationFragment.this.MediaBrowserCompat$SearchResultReceiver > 0) {
                        C4070bI bIVar = C4070bI.write;
                        if (cmVar.RatingCompat == null) {
                            z = false;
                        }
                        if (z) {
                            bIVar.IconCompatParcelizer(cmVar.RatingCompat);
                            return;
                        }
                        return;
                    }
                    C4071bJ bJVar = C4071bJ.MediaBrowserCompat$ItemReceiver;
                    if (cmVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        bJVar.IconCompatParcelizer(cmVar.RatingCompat);
                        return;
                    }
                    return;
                }
                boolean unused2 = FillInformationFragment.this.RatingCompat = false;
                FillInformationFragment.this.buttonNext.setEnabled(true);
            }
        });
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            this.spinnerTitle.setSelection(bundle.getInt("OUT_STATE_TITLE"));
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OUT_STATE_TITLE", this.spinnerTitle.getSelectedItemPosition());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.buttonNext.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setKey setkey) {
        if (setkey != null) {
            this.textFirstName.setText(setkey.MediaBrowserCompat$CustomActionResultReceiver);
            this.textMiddleName.setVisibility(8);
            this.lbMiddleName.setVisibility(8);
            this.textLastName.setText(setkey.MediaMetadataCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<setOrgId> list, setOrgId setorgid) {
        String str;
        if (list != null && this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$MediaItem.clear();
            this.MediaBrowserCompat$MediaItem.add(getString(R.string.ntb_fillinformation_personal_info_title_hint));
            if (setorgid != null) {
                str = setorgid.MediaDescriptionCompat;
            } else {
                str = "";
            }
            int i = 0;
            for (int i2 = 0; i2 < list.size(); i2++) {
                String str2 = list.get(i2).MediaDescriptionCompat;
                this.MediaBrowserCompat$MediaItem.add(str2);
                if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(str2)) {
                    i = i2 + 1;
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.notifyDataSetChanged();
            this.spinnerTitle.setSelection(i);
            this.spinnerTitle.showContextMenu();
        }
    }

    public final void read() {
        if ((getActivity() instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) && this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer.write((Fragment) new ContactInfoFragment());
        }
    }

    public final void read(getFiles getfiles) {
        Intent intent = new Intent(getContext(), EkycSuccessActivity.class);
        intent.putExtra("com.scb.phone.view.activity.ntb.EkycSuccessActivity.EXTRA_CONFIRMATION_DISPLAY", getfiles);
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaMetadataCompat;
        if (mediaDescriptionCompat != null) {
            intent.putExtra("com.scb.phone.view.activity.ntb.EkycSuccessActivity.EXTRA_FIREBASE_SOURCE", mediaDescriptionCompat.read());
        }
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.fillInformationPresenter.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(FillInformationFragment fillInformationFragment, int i, TextView textView) {
        if (i != 0) {
            fillInformationFragment.getResources();
            textView.setTextColor(-6975079);
        } else if (fillInformationFragment.RatingCompat) {
            fillInformationFragment.getResources();
            textView.setTextColor(-6975079);
        } else {
            fillInformationFragment.getResources();
            textView.setTextColor(-3553587);
        }
    }
}

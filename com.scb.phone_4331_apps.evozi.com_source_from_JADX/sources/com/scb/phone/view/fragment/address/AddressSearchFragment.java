package com.scb.phone.view.fragment.address;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.address.SubDistrictSearchAdapter;
import com.scb.phone.view.adapter.address.SubDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p040o.CameraSource;
import p040o.CreateAppSpiCall;
import p040o.CustomCheckboxView_ViewBinding;
import p040o.CustomDoubleCircleBorderView;
import p040o.CustomExternalSelector;
import p040o.CustomProfileImageView;
import p040o.CustomProfileImageView_ViewBinding;
import p040o.Group;
import p040o.HmlPinActivity;
import p040o.ListenableFutureTask;
import p040o.access$2300;
import p040o.addDelayedShutdownHook;
import p040o.getCAR$MediaBrowserCompat$ItemReceiver;
import p040o.getCodeline;
import p040o.getLoanoriginationOtpCode;
import p040o.getOtpCode;
import p040o.setBorderWidth;
import p040o.setFilledIconRes;
import p040o.setIconTop;
import p040o.setImageUrl;
import p040o.setLinkText;

public class AddressSearchFragment extends BaseFragment implements getCAR$MediaBrowserCompat$ItemReceiver, SubDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver {
    protected SubDistrictSearchAdapter IconCompatParcelizer;
    public ListenableFutureTask MediaBrowserCompat$CustomActionResultReceiver;
    private CustomDoubleCircleBorderView MediaBrowserCompat$SearchResultReceiver;
    private getCodeline MediaMetadataCompat;
    public ArrayList<addDelayedShutdownHook> RatingCompat;
    @HmlPinActivity
    public CreateAppSpiCall presenter;
    @BindView
    protected RecyclerView recyclerViewAddress;
    @BindView
    protected ImageButton searchClearButton;
    @BindView
    protected EditText searchEditText;
    @BindView
    protected TextView tvAddressLabel;

    public static AddressSearchFragment IconCompatParcelizer(ListenableFutureTask listenableFutureTask) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ADDRESS_SEARCH_DISPLAY", listenableFutureTask);
        AddressSearchFragment addressSearchFragment = new AddressSearchFragment();
        addressSearchFragment.setArguments(bundle);
        return addressSearchFragment;
    }

    public static AddressSearchFragment IconCompatParcelizer(ListenableFutureTask listenableFutureTask, Throwable th) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ADDRESS_SEARCH_DISPLAY", listenableFutureTask);
        bundle.putSerializable("KEY_THROWABLE", th);
        AddressSearchFragment addressSearchFragment = new AddressSearchFragment();
        addressSearchFragment.setArguments(bundle);
        return addressSearchFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof getCodeline) {
            this.MediaMetadataCompat = (getCodeline) context;
        }
    }

    public void onDetach() {
        super.onDetach();
        this.MediaMetadataCompat = null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89762131494203, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ListenableFutureTask listenableFutureTask = (ListenableFutureTask) getArguments().getParcelable("ADDRESS_SEARCH_DISPLAY");
        this.MediaBrowserCompat$CustomActionResultReceiver = listenableFutureTask;
        this.tvAddressLabel.setText(listenableFutureTask.MediaBrowserCompat$CustomActionResultReceiver);
        this.searchEditText.setHint(this.MediaBrowserCompat$CustomActionResultReceiver.read);
        ArrayList<addDelayedShutdownHook> arrayList = new ArrayList<>();
        this.RatingCompat = arrayList;
        arrayList.addAll(this.MediaBrowserCompat$CustomActionResultReceiver.write);
        SubDistrictSearchAdapter subDistrictSearchAdapter = new SubDistrictSearchAdapter(this.RatingCompat, this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        this.IconCompatParcelizer = subDistrictSearchAdapter;
        subDistrictSearchAdapter.MediaBrowserCompat$ItemReceiver = this;
        this.recyclerViewAddress.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) new Group(getContext()));
        this.recyclerViewAddress.setAdapter(this.IconCompatParcelizer);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        EditText editText = this.searchEditText;
        setIconTop IconCompatParcelizer2 = setIconTop.IconCompatParcelizer();
        editText.addTextChangedListener(new TextWatcher(IconCompatParcelizer2) {
            private /* synthetic */ setIconTop IconCompatParcelizer;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            {
                this.IconCompatParcelizer = r2;
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.IconCompatParcelizer.IconCompatParcelizer(charSequence.toString());
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString())) {
                    AddressSearchFragment.this.searchClearButton.setVisibility(8);
                    SubDistrictSearchAdapter subDistrictSearchAdapter = AddressSearchFragment.this.IconCompatParcelizer;
                    List<addDelayedShutdownHook> list = AddressSearchFragment.this.MediaBrowserCompat$CustomActionResultReceiver.write;
                    subDistrictSearchAdapter.write.clear();
                    subDistrictSearchAdapter.write.addAll(list);
                    subDistrictSearchAdapter.IconCompatParcelizer.write();
                    return;
                }
                AddressSearchFragment.this.searchClearButton.setVisibility(0);
            }
        });
        CameraSource.CameraSourceException IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(500, TimeUnit.MILLISECONDS, setLinkText.IconCompatParcelizer());
        this.MediaBrowserCompat$SearchResultReceiver = CameraSource.CameraSourceException.read(new CustomProfileImageView(new getLoanoriginationOtpCode(this), setImageUrl.ERROR_NOT_IMPLEMENTED, setBorderWidth.read()), new CameraSource.CameraSourceException(new CustomExternalSelector(IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver, new setFilledIconRes(getOtpCode.write))).MediaBrowserCompat$ItemReceiver(setLinkText.write()).IconCompatParcelizer(CustomCheckboxView_ViewBinding.write(), CustomProfileImageView_ViewBinding.IconCompatParcelizer));
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Throwable th = (Throwable) getArguments().getSerializable("KEY_THROWABLE");
        if (th != null) {
            write(this.presenter.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    @OnClick
    public void onClearButtonClick() {
        this.searchEditText.setText("");
    }

    public final void MediaBrowserCompat$ItemReceiver(List<addDelayedShutdownHook> list) {
        SubDistrictSearchAdapter subDistrictSearchAdapter = this.IconCompatParcelizer;
        subDistrictSearchAdapter.write.clear();
        subDistrictSearchAdapter.write.addAll(list);
        subDistrictSearchAdapter.IconCompatParcelizer.write();
    }

    /* renamed from: com.scb.phone.view.fragment.address.AddressSearchFragment$5 */
    static /* synthetic */ class C58535 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.CrashlyticsReportJsonTransform$$Lambda$8[] r0 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.PROVINCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.DISTRICT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.SUB_DISTRICT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.CrashlyticsReportJsonTransform$$Lambda$8 r1 = p040o.CrashlyticsReportJsonTransform$$Lambda$8.POSTAL_CODE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.address.AddressSearchFragment.C58535.<clinit>():void");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(addDelayedShutdownHook adddelayedshutdownhook) {
        if (this.MediaMetadataCompat != null) {
            int i = C58535.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.ordinal()];
            if (i == 1) {
                this.MediaMetadataCompat.IconCompatParcelizer(adddelayedshutdownhook);
                this.MediaMetadataCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (i == 2) {
                this.MediaMetadataCompat.read(adddelayedshutdownhook);
                this.MediaMetadataCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (i == 3) {
                this.MediaMetadataCompat.write(adddelayedshutdownhook);
                this.MediaMetadataCompat.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            } else if (i == 4) {
                this.MediaMetadataCompat.write(adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver);
                this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    public class IconCompatParcelizer {
        public IconCompatParcelizer() {
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.MediaBrowserCompat$SearchResultReceiver.write();
    }
}

package com.scb.phone.view.activity.privacymanagement;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ImagesContract;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.privacymanagement.PrivacyConsentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import org.bouncycastle.i18n.MessageBundle;
import p040o.C4495xe0420d5c;
import p040o.FundFactSheetActivity;
import p040o.GoogleMap;
import p040o.GoogleSigninService;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.Lists;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RegularImmutableBiMap;
import p040o.access$2300;
import p040o.alwaysFalse;
import p040o.generateBinaryImagesJsonString;
import p040o.getAddress4FieldName;
import p040o.getAddress4FieldName$MediaBrowserCompat$ItemReceiver;
import p040o.getBackground;
import p040o.getLibraryFile;
import p040o.newOnDeviceIdExtractor;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.onNotNowClick;
import p040o.setTapText;
import p040o.setTileSize;
import p040o.writeUInt64NoTag;

public final class PrivacyManagementLandingActivity extends BaseActivity implements newOnDeviceIdExtractor.write, setTileSize.read {
    private setTileSize MediaBrowserCompat$MediaItem;
    @HmlPinActivity
    public getAddress4FieldName mPresenter;
    @BindView
    public RecyclerView mRecyclerView;
    @BindView
    public TextView mTextView;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79432131493168);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getAddress4FieldName getaddress4fieldname = this.mPresenter;
        if (getaddress4fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getaddress4fieldname.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.privacy_management);
        setTabContainer();
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
        }
        boolean z = false;
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new GoogleSigninService(), -1);
        getAddress4FieldName getaddress4fieldname2 = this.mPresenter;
        if (getaddress4fieldname2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        if (getaddress4fieldname2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getaddress4fieldname2.RatingCompat.AlertController$RecycleListView();
        }
        Lists.CharSequenceAsList charSequenceAsList = getaddress4fieldname2.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity getaddress4fieldname_mediabrowsercompat_customactionresultreceiver = new C4495xe0420d5c(getaddress4fieldname2);
        FundFactSheetActivity read = new getAddress4FieldName.read(getaddress4fieldname2);
        onGetStartedClick.write((Object) getaddress4fieldname_mediabrowsercompat_customactionresultreceiver, "onSuccess");
        onGetStartedClick.write((Object) read, "onError");
        charSequenceAsList.IconCompatParcelizer(charSequenceAsList.IconCompatParcelizer, getaddress4fieldname_mediabrowsercompat_customactionresultreceiver, read, new alwaysFalse.write());
    }

    public final void onDestroy() {
        getAddress4FieldName getaddress4fieldname = this.mPresenter;
        if (getaddress4fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        getaddress4fieldname.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(List<getBackground> list) {
        onGetStartedClick.write((Object) list, "privacyList");
        TextView textView = this.mTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTextView");
        }
        textView.setVisibility(0);
        this.MediaBrowserCompat$MediaItem = new setTileSize(list, this);
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mRecyclerView");
        }
        setTileSize settilesize = this.MediaBrowserCompat$MediaItem;
        if (settilesize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAdapter");
        }
        recyclerView.setAdapter(settilesize);
    }

    public final void IconCompatParcelizer(generateBinaryImagesJsonString generatebinaryimagesjsonstring, getLibraryFile getlibraryfile, String str) {
        onGetStartedClick.write((Object) generatebinaryimagesjsonstring, "type");
        onGetStartedClick.write((Object) getlibraryfile, "flow");
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        PrivacyConsentActivity.IconCompatParcelizer iconCompatParcelizer = PrivacyConsentActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) generatebinaryimagesjsonstring, "type");
        onGetStartedClick.write((Object) getlibraryfile, "flow");
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        PrivacyConsentActivity.IconCompatParcelizer iconCompatParcelizer2 = PrivacyConsentActivity.MediaMetadataCompat;
        Intent MediaBrowserCompat$ItemReceiver = PrivacyConsentActivity.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(context, generatebinaryimagesjsonstring, getlibraryfile, false);
        MediaBrowserCompat$ItemReceiver.putExtra("EXTRA_CONSENT_TITLE", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.putExtra("EXTRA_IS_FROM_PRIVACY_MANAGEMENT_LANDING", true);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public final void write(int i) {
        getAddress4FieldName getaddress4fieldname = this.mPresenter;
        if (getaddress4fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        List<GoogleMap.OnCircleClickListener> list = getaddress4fieldname.IconCompatParcelizer;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrivacyList");
        }
        GoogleMap.OnCircleClickListener onCircleClickListener = list.get(i);
        boolean z = true;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) onCircleClickListener.write, (Object) "REVOKE_CONSENT")) {
            writeUInt64NoTag.IconCompatParcelizer getaddress4fieldname_mediabrowsercompat_itemreceiver = new getAddress4FieldName$MediaBrowserCompat$ItemReceiver(onCircleClickListener);
            if (getaddress4fieldname.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getaddress4fieldname_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getaddress4fieldname.RatingCompat);
                return;
            }
            return;
        }
        onNotNowClick.read read = new onNotNowClick.read();
        read.MediaBrowserCompat$ItemReceiver = null;
        try {
            List<GoogleMap.OnCircleClickListener> list2 = getaddress4fieldname.IconCompatParcelizer;
            if (list2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrivacyList");
            }
            read.MediaBrowserCompat$ItemReceiver = generateBinaryImagesJsonString.valueOf(list2.get(i).write);
            writeUInt64NoTag.IconCompatParcelizer write = new getAddress4FieldName.write(read, onCircleClickListener);
            if (getaddress4fieldname.RatingCompat == null) {
                z = false;
            }
            if (z) {
                write.IconCompatParcelizer(getaddress4fieldname.RatingCompat);
            }
        } catch (IllegalArgumentException unused) {
            RegularImmutableBiMap regularImmutableBiMap = getaddress4fieldname.MediaBrowserCompat$CustomActionResultReceiver;
            getaddress4fieldname.MediaBrowserCompat$ItemReceiver(regularImmutableBiMap.read((String) null, regularImmutableBiMap.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource), access$2300.write.JUST_DISMISS));
        }
    }
}

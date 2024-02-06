package com.scb.phone.view.activity.profile_management.manageaccountinbound;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p040o.C1248xd65c1f32;
import p040o.CheckEligibilityActivity;
import p040o.FundFactSheetActivity;
import p040o.GoogleMap;
import p040o.Group;
import p040o.Guideline;
import p040o.HmlNTBBusinessURLInformationActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCountryShortFieldName;
import p040o.getCountryShortFieldName$MediaBrowserCompat$ItemReceiver;
import p040o.getCountryShortFieldName$MediaBrowserCompat$MediaItem;
import p040o.getStatementPreRequest;
import p040o.getUiOrientation;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.setMinHeight;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class ManageAccountInboundActivity extends BaseActivity implements C1248xd65c1f32 {
    private static ManageAccountInboundActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new ManageAccountInboundActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private getStatementPreRequest MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public FrameLayout errorLayout;
    @HmlPinActivity
    public getCountryShortFieldName presenter;
    @BindView
    public RecyclerView recyclerView;

    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<getUiOrientation, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ ManageAccountInboundActivity write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(ManageAccountInboundActivity manageAccountInboundActivity) {
            super(1);
            this.write = manageAccountInboundActivity;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getUiOrientation getuiorientation = (getUiOrientation) obj;
            onGetStartedClick.write((Object) getuiorientation, "it");
            getCountryShortFieldName getcountryshortfieldname = this.write.presenter;
            if (getcountryshortfieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) getuiorientation, "accountInboundDisplay");
            if (getuiorientation.MediaBrowserCompat$ItemReceiver) {
                getcountryshortfieldname.IconCompatParcelizer(getuiorientation);
            } else {
                writeUInt64NoTag.IconCompatParcelizer getcountryshortfieldname_mediabrowsercompat_mediaitem = new getCountryShortFieldName$MediaBrowserCompat$MediaItem(getuiorientation);
                if (getcountryshortfieldname.RatingCompat != null) {
                    getcountryshortfieldname_mediabrowsercompat_mediaitem.IconCompatParcelizer(getcountryshortfieldname.RatingCompat);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78602131493085);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.manage_account_inbound_title);
        setTabContainer();
        getCountryShortFieldName getcountryshortfieldname = this.presenter;
        if (getcountryshortfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getcountryshortfieldname.MediaBrowserCompat$ItemReceiver(this);
        getCountryShortFieldName getcountryshortfieldname2 = this.presenter;
        if (getcountryshortfieldname2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        GoogleMap.OnMarkerDragListener AppCompatDelegateImpl$ListMenuDecorView = getcountryshortfieldname2.read.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        onGetStartedClick.IconCompatParcelizer((Object) AppCompatDelegateImpl$ListMenuDecorView, "getUserProfileUseCase.userProfile");
        boolean z = true;
        writeUInt64NoTag.IconCompatParcelizer getcountryshortfieldname_mediabrowsercompat_itemreceiver = new getCountryShortFieldName$MediaBrowserCompat$ItemReceiver(AppCompatDelegateImpl$ListMenuDecorView.MediaSessionCompat$ResultReceiverWrapper > 0);
        if (getcountryshortfieldname2.RatingCompat != null) {
            getcountryshortfieldname_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getcountryshortfieldname2.RatingCompat);
        }
        getCountryShortFieldName getcountryshortfieldname3 = this.presenter;
        if (getcountryshortfieldname3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getcountryshortfieldname3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getcountryshortfieldname3.RatingCompat.AlertController$RecycleListView();
        }
        getcountryshortfieldname3.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver();
        getcountryshortfieldname3.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getCountryShortFieldName.read());
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.manage_account_inbound_title);
        setTabContainer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        getStatementPreRequest getstatementprerequest = new getStatementPreRequest(z);
        this.MediaBrowserCompat$SearchResultReceiver = getstatementprerequest;
        getstatementprerequest.read = new read(this);
        Context context = this;
        Group group = new Group(context);
        Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.rv_divider);
        if (write2 != null) {
            if (write2 != null) {
                group.MediaBrowserCompat$CustomActionResultReceiver = write2;
            } else {
                throw new IllegalArgumentException("Drawable cannot be null.");
            }
        }
        RecyclerView recyclerView2 = this.recyclerView;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("recyclerView");
        }
        getStatementPreRequest getstatementprerequest2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (getstatementprerequest2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountInboundAdapter");
        }
        recyclerView2.setAdapter(getstatementprerequest2);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        recyclerView2.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) group);
    }

    public final void write(List<getUiOrientation> list) {
        onGetStartedClick.write((Object) list, "accountInboundDisplayList");
        getStatementPreRequest getstatementprerequest = this.MediaBrowserCompat$SearchResultReceiver;
        if (getstatementprerequest == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountInboundAdapter");
        }
        List<T> write2 = HmlNTBBusinessURLInformationActivity.write(list, new write());
        setMinHeight<T> setminheight = getstatementprerequest.MediaBrowserCompat$ItemReceiver;
        int i = setminheight.MediaBrowserCompat$ItemReceiver + 1;
        setminheight.MediaBrowserCompat$ItemReceiver = i;
        List<T> list2 = setminheight.read;
        if (write2 != list2) {
            if (write2 == null) {
                int size = list2.size();
                setminheight.read = null;
                setminheight.MediaBrowserCompat$CustomActionResultReceiver = Collections.emptyList();
                setminheight.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(0, size);
            } else if (list2 == null) {
                setminheight.read = write2;
                setminheight.MediaBrowserCompat$CustomActionResultReceiver = Collections.unmodifiableList(write2);
                setminheight.MediaBrowserCompat$MediaItem.read(0, write2.size());
            } else {
                setminheight.write.read.execute(new Runnable(list2, write2, i) {
                    final /* synthetic */ int IconCompatParcelizer;
                    final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;
                    final /* synthetic */ List write;

                    {
                        this.write = r2;
                        this.MediaBrowserCompat$CustomActionResultReceiver = r3;
                        this.IconCompatParcelizer = r4;
                    }

                    public final void run() {
                        final Guideline$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = Guideline.MediaBrowserCompat$CustomActionResultReceiver(new Guideline.IconCompatParcelizer() {
                            public final int write() {
                                return C15154.this.write.size();
                            }

                            public final int MediaBrowserCompat$ItemReceiver() {
                                return C15154.this.MediaBrowserCompat$CustomActionResultReceiver.size();
                            }

                            public final boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
                                Object obj = C15154.this.write.get(i);
                                Object obj2 = C15154.this.MediaBrowserCompat$CustomActionResultReceiver.get(i2);
                                if (obj == null || obj2 == null) {
                                    return obj == null && obj2 == null;
                                }
                                return setMinHeight.this.write.MediaBrowserCompat$ItemReceiver.read(obj, obj2);
                            }

                            public final boolean write(int i, int i2) {
                                Object obj = C15154.this.write.get(i);
                                Object obj2 = C15154.this.MediaBrowserCompat$CustomActionResultReceiver.get(i2);
                                if (obj != null && obj2 != null) {
                                    return setMinHeight.this.write.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                throw new AssertionError();
                            }

                            public final Object read(int i, int i2) {
                                Object obj = C15154.this.write.get(i);
                                Object obj2 = C15154.this.MediaBrowserCompat$CustomActionResultReceiver.get(i2);
                                if (obj != null && obj2 != null) {
                                    return null;
                                }
                                throw new AssertionError();
                            }
                        });
                        setMinHeight.this.IconCompatParcelizer.execute(new Runnable() {
                            public final void run() {
                                setDesignInformation setdesigninformation;
                                if (setMinHeight.this.MediaBrowserCompat$ItemReceiver == C15154.this.IconCompatParcelizer) {
                                    setMinHeight setminheight = setMinHeight.this;
                                    List<T> list = C15154.this.MediaBrowserCompat$CustomActionResultReceiver;
                                    Guideline$MediaBrowserCompat$CustomActionResultReceiver guideline$MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver2;
                                    setminheight.read = list;
                                    setminheight.MediaBrowserCompat$CustomActionResultReceiver = Collections.unmodifiableList(list);
                                    CheckExtractActivity checkExtractActivity = setminheight.MediaBrowserCompat$MediaItem;
                                    if (checkExtractActivity instanceof setDesignInformation) {
                                        setdesigninformation = (setDesignInformation) checkExtractActivity;
                                    } else {
                                        setdesigninformation = new setDesignInformation(checkExtractActivity);
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    int i = guideline$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                                    int i2 = guideline$MediaBrowserCompat$CustomActionResultReceiver.read;
                                    for (int size = guideline$MediaBrowserCompat$CustomActionResultReceiver.write.size() - 1; size >= 0; size--) {
                                        Guideline$MediaBrowserCompat$SearchResultReceiver guideline$MediaBrowserCompat$SearchResultReceiver = guideline$MediaBrowserCompat$CustomActionResultReceiver.write.get(size);
                                        int i3 = guideline$MediaBrowserCompat$SearchResultReceiver.read;
                                        int i4 = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver + i3;
                                        int i5 = guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer + i3;
                                        if (i4 < i) {
                                            guideline$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(arrayList, setdesigninformation, i4, i - i4, i4);
                                        }
                                        if (i5 < i2) {
                                            guideline$MediaBrowserCompat$CustomActionResultReceiver.read(arrayList, setdesigninformation, i4, i2 - i5, i5);
                                        }
                                        for (int i6 = i3 - 1; i6 >= 0; i6--) {
                                            if ((guideline$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver[guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver + i6] & 31) == 2) {
                                                int i7 = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                                                guideline$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.read(guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver + i6, guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer + i6);
                                                setdesigninformation.MediaBrowserCompat$CustomActionResultReceiver(i7 + i6, 1, (Object) null);
                                            }
                                        }
                                        i = guideline$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                                        i2 = guideline$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer;
                                    }
                                    setdesigninformation.read();
                                }
                            }
                        });
                    }
                });
            }
        }
        getstatementprerequest.IconCompatParcelizer.write();
    }

    public final void read(getUiOrientation getuiorientation) {
        onGetStartedClick.write((Object) getuiorientation, "accountInboundDisplay");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.manage_account_inbound_confirm_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.manage_account_inbound_confirm_dialog_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.manage_account_inbound_yes_disable), new IconCompatParcelizer(this, getuiorientation));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.manage_account_inbound_no_keep_it), new C5706x6186c42d(this, getuiorientation)).show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ getUiOrientation IconCompatParcelizer;
        private /* synthetic */ ManageAccountInboundActivity write;

        IconCompatParcelizer(ManageAccountInboundActivity manageAccountInboundActivity, getUiOrientation getuiorientation) {
            this.write = manageAccountInboundActivity;
            this.IconCompatParcelizer = getuiorientation;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            getCountryShortFieldName getcountryshortfieldname = this.write.presenter;
            if (getcountryshortfieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getcountryshortfieldname.IconCompatParcelizer(this.IconCompatParcelizer);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FrameLayout frameLayout = this.errorLayout;
        if (frameLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("errorLayout");
        }
        frameLayout.setVisibility(0);
    }

    public final void onDestroy() {
        getCountryShortFieldName getcountryshortfieldname = this.presenter;
        if (getcountryshortfieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getcountryshortfieldname.onDestroy();
        super.onDestroy();
    }

    public static final class write<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((getUiOrientation) t).MediaBrowserCompat$SearchResultReceiver);
            Comparable valueOf2 = Integer.valueOf(((getUiOrientation) t2).MediaBrowserCompat$SearchResultReceiver);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    public static final void read(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, ManageAccountInboundActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}

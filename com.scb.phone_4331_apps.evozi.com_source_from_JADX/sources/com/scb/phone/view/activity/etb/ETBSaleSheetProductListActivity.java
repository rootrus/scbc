package com.scb.phone.view.activity.etb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.deposit.DepositProductCatalogActivity;
import com.scb.phone.view.adapter.etb.ETBSaleSheetSubAccountAdapter;
import com.scb.phone.view.adapter.etb.ETBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C7389pv;
import p040o.C7392py;
import p040o.DataGPUFrame;
import p040o.FrameBufferTexture;
import p040o.GPUFrame;
import p040o.GPUImageHolderImpl;
import p040o.GPUImageHolderImpl_Factory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.doCloseSessions;
import p040o.doOpenSession;
import p040o.ensureAnimationInfo;
import p040o.getArguments;
import p040o.getFirstPassProgram;
import p040o.getNextTransition;
import p040o.getSharedElementEnterTransition;
import p040o.getTag;
import p040o.handleData;
import p040o.newGPUImageHolderImpl;
import p040o.setCancelable;
import p040o.setCardNumber;
import p040o.setTapText;
import p040o.setTextureBuffer;
import p040o.setupDialog;
import p040o.show;
import p040o.throwIfInstanceOf;
import p040o.throwIfUnchecked;
import p040o.writeUInt64NoTag;

public class ETBSaleSheetProductListActivity extends BaseActivity implements ETBSaleSheetSubAccountAdapter.read, setCardNumber {
    private String MediaMetadataCompat;
    @HmlPinActivity
    public getFirstPassProgram presenter;
    @BindView
    RecyclerView recyclerView;
    @BindView
    TextView tvTitle;

    public static Intent write(Context context, doOpenSession doopensession, List<doCloseSessions> list, String str) {
        return new Intent(context, ETBSaleSheetProductListActivity.class).putExtra("com.scb.phone.view.activity.etb.EXTRA_PRODUCT", doopensession).putParcelableArrayListExtra("com.scb.phone.view.activity.etb.EXTRA_SUB_PRODUCT_LIST", new ArrayList(list)).putExtra("com.scb.phone.view.activity.etb.EXTRA_TYPE", str);
    }

    public void onCreate(Bundle bundle) {
        ArrayList arrayList;
        ArrayList arrayList2;
        super.onCreate(bundle);
        setContentView(R.layout.f77792131493004);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.etb_sale_sheet_title);
        boolean z = false;
        this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.MediaMetadataCompat = getIntent().getExtras().getString("com.scb.phone.view.activity.etb.EXTRA_TYPE", "");
        if (getIntent().getParcelableExtra("com.scb.phone.view.activity.etb.EXTRA_PRODUCT_SALESSHEET") == null) {
            arrayList = getIntent().getParcelableArrayListExtra("com.scb.phone.view.activity.etb.EXTRA_PRODUCT_LIST");
            arrayList2 = getIntent().getParcelableArrayListExtra("com.scb.phone.view.activity.etb.EXTRA_SUB_PRODUCT_LIST");
            getIntent().getParcelableExtra("com.scb.phone.view.activity.etb.EXTRA_PRODUCT");
        } else {
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.scb.phone.view.activity.etb.EXTRA_SUB_SALESSHEET_PRODUCT_LIST");
            getIntent().getParcelableExtra("com.scb.phone.view.activity.etb.EXTRA_PRODUCT_SALESSHEET");
            arrayList2 = parcelableArrayListExtra;
            arrayList = null;
        }
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getFirstPassProgram getfirstpassprogram = this.presenter;
        String str = this.MediaMetadataCompat;
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                newGPUImageHolderImpl newgpuimageholderimpl = new newGPUImageHolderImpl(arrayList);
                if (getfirstpassprogram.RatingCompat != null) {
                    newgpuimageholderimpl.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
                }
            } else {
                show show = new show(arrayList);
                GPUImageHolderImpl.C34191 r5 = new writeUInt64NoTag.IconCompatParcelizer((List) new show(show.write, new getNextTransition(show.IconCompatParcelizer, GPUImageHolderImpl.MediaBrowserCompat$ItemReceiver)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                    public final /* synthetic */ Object read() {
                        return new ArrayList();
                    }
                }, new ensureAnimationInfo<List<T>, T>() {
                    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                        ((List) obj).add(obj2);
                    }
                }))) {
                    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    public final void IconCompatParcelizer(Object obj) {
                        ((setCardNumber) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
                    }
                };
                if (getfirstpassprogram.RatingCompat != null) {
                    r5.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
                }
            }
        }
        if (arrayList2 != null) {
            if (arrayList2.size() == 1) {
                setTextureBuffer settexturebuffer = new setTextureBuffer((doCloseSessions) arrayList2.get(0));
                if (getfirstpassprogram.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    settexturebuffer.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
                    return;
                }
                return;
            }
            if (!"2".equals(str)) {
                handleData handledata = handleData.MediaBrowserCompat$ItemReceiver;
                if (getfirstpassprogram.RatingCompat != null) {
                    handledata.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
                }
            } else {
                throwIfInstanceOf throwifinstanceof = throwIfInstanceOf.MediaBrowserCompat$CustomActionResultReceiver;
                if (getfirstpassprogram.RatingCompat != null) {
                    throwifinstanceof.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
                }
            }
            show show2 = new show(arrayList2);
            show show3 = new show(show2.write, new getTag(show2.IconCompatParcelizer, setCancelable.write(GPUImageHolderImpl.C34213.read)));
            GPUFrame gPUFrame = new GPUFrame((List) new show(show3.write, new getNextTransition(show3.IconCompatParcelizer, DataGPUFrame.MediaBrowserCompat$ItemReceiver)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                public final /* synthetic */ Object read() {
                    return new ArrayList();
                }
            }, new ensureAnimationInfo<List<T>, T>() {
                public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                    ((List) obj).add(obj2);
                }
            })));
            if (getfirstpassprogram.RatingCompat != null) {
                z = true;
            }
            if (z) {
                gPUFrame.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
            }
        } else if ("2".equals(str)) {
            FrameBufferTexture frameBufferTexture = FrameBufferTexture.IconCompatParcelizer;
            if (getfirstpassprogram.RatingCompat != null) {
                z = true;
            }
            if (z) {
                frameBufferTexture.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
            }
        }
    }

    public final void write(ETBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver eTBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver) {
        boolean z = true;
        if (eTBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver instanceof write) {
            doOpenSession doopensession = ((write) eTBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver;
            getFirstPassProgram getfirstpassprogram = this.presenter;
            throwIfUnchecked throwifunchecked = new throwIfUnchecked(doopensession);
            if (getfirstpassprogram.RatingCompat == null) {
                z = false;
            }
            if (z) {
                throwifunchecked.IconCompatParcelizer(getfirstpassprogram.RatingCompat);
            }
        } else if (eTBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver instanceof IconCompatParcelizer) {
            doCloseSessions doclosesessions = ((IconCompatParcelizer) eTBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver;
            getFirstPassProgram getfirstpassprogram2 = this.presenter;
            GPUImageHolderImpl_Factory gPUImageHolderImpl_Factory = new GPUImageHolderImpl_Factory(doclosesessions);
            if (getfirstpassprogram2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                gPUImageHolderImpl_Factory.IconCompatParcelizer(getfirstpassprogram2.RatingCompat);
            }
        }
    }

    public final void read(int i) {
        this.tvTitle.setText(getString(i));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(doOpenSession doopensession, List<doCloseSessions> list) {
        write(doopensession, list);
        finish();
    }

    public final void write(doOpenSession doopensession, List<doCloseSessions> list) {
        Intent write2 = write(this, doopensession, list, this.MediaMetadataCompat);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write2).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(String str, String str2) {
        Intent read = DepositProductCatalogActivity.read(this, str, str2);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static class write implements ETBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver {
        doOpenSession MediaBrowserCompat$CustomActionResultReceiver;

        public write(doOpenSession doopensession) {
            this.MediaBrowserCompat$CustomActionResultReceiver = doopensession;
        }

        public final String IconCompatParcelizer() {
            return this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
        }
    }

    public static class IconCompatParcelizer implements ETBSaleSheetSubAccountAdapter$MediaBrowserCompat$ItemReceiver {
        doCloseSessions MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer(doCloseSessions doclosesessions) {
            this.MediaBrowserCompat$ItemReceiver = doclosesessions;
        }

        public final String IconCompatParcelizer() {
            return this.MediaBrowserCompat$ItemReceiver.read;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<doOpenSession> list) {
        show show = new show(list);
        this.recyclerView.setAdapter(new ETBSaleSheetSubAccountAdapter((List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, C7392py.IconCompatParcelizer)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
            public final /* synthetic */ Object read() {
                return new ArrayList();
            }
        }, new ensureAnimationInfo<List<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        })), this));
    }

    public final void MediaBrowserCompat$ItemReceiver(List<doCloseSessions> list) {
        show show = new show(list);
        this.recyclerView.setAdapter(new ETBSaleSheetSubAccountAdapter((List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, C7389pv.MediaBrowserCompat$CustomActionResultReceiver)).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
            public final /* synthetic */ Object read() {
                return new ArrayList();
            }
        }, new ensureAnimationInfo<List<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        })), this));
    }
}

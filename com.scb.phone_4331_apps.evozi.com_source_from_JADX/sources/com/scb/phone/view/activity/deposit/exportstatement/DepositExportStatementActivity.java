package com.scb.phone.view.activity.deposit.exportstatement;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.NumberPicker;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.C10084oI;
import p040o.C1246xea60bf60;
import p040o.C7273oC;
import p040o.C7276oF;
import p040o.CheckCaptureModule_GetUriKtaFactory;
import p040o.CrashlyticsNativeComponent;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MissingNativeComponent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PatternItem;
import p040o.PlaybackStateCompat;
import p040o.ScriptIntrinsicBLAS;
import p040o.VrsImage;
import p040o.adornBoundary;
import p040o.binarize;
import p040o.fromNv21;
import p040o.getICheckDeserializerRtti;
import p040o.immediateCheckedFuture;
import p040o.nativeFromBitmap;
import p040o.nativeKtdxXML;
import p040o.nativeScale;
import p040o.nativeToBitmap;
import p040o.onCheckBoxClick;
import p040o.processPage;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class DepositExportStatementActivity extends BaseActivity implements CheckCaptureModule_GetUriKtaFactory {
    private String AlertController$RecycleListView;
    private ScriptIntrinsicBLAS.Transpose AppCompatActivity = new ScriptIntrinsicBLAS.Transpose();
    private TextView AppCompatDialogFragment;
    private NumberPicker.OnValueChangeListener Keep = new C7276oF(this);
    public String[] MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompat$ResultReceiverWrapper;
    public NumberPicker MediaSessionCompat$Token;
    public int PlaybackStateCompat;
    public String[] PlaybackStateCompat$CustomAction;
    @BindView
    Button btDone;
    @BindView
    CheckBox checkBoxNoteRequest;
    @HmlPinActivity
    public adornBoundary depositExportStatementPresenter;
    @BindView
    ImageView ivLogo;
    @BindView
    ViewGroup rootView;
    @BindView
    TextView rowErrorInline;
    private NumberPicker.OnValueChangeListener setBackgroundResource = new C7273oC(this);
    private NumberPicker setHasDecor;
    @BindView
    TextView tvAccountName;
    @BindView
    TextView tvAccountNumber;
    @BindView
    TextView tvEmail;
    @BindView
    public TextView tvSelectEndMonth;
    @BindView
    public TextView tvSelectStartMonth;
    @BindView
    View viewEndDate;
    @BindView
    View viewStartDate;

    public static void IconCompatParcelizer(Context context, immediateCheckedFuture immediatecheckedfuture, MissingNativeComponent missingNativeComponent) {
        Intent intent = new Intent(context, DepositExportStatementActivity.class);
        intent.putExtra("TAG_DEPOSIT_DISPLAY", immediatecheckedfuture);
        intent.putExtra("TAG_PRE_REQUEST", missingNativeComponent);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77842131493009);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.depositExportStatementPresenter.MediaBrowserCompat$ItemReceiver(this);
        adornBoundary adornboundary = this.depositExportStatementPresenter;
        MissingNativeComponent missingNativeComponent = (MissingNativeComponent) getIntent().getParcelableExtra("TAG_PRE_REQUEST");
        adornboundary.read = missingNativeComponent.MediaBrowserCompat$CustomActionResultReceiver;
        OffsetDateTime offsetDateTime = missingNativeComponent.read;
        OffsetDateTime offsetDateTime2 = missingNativeComponent.write;
        VrsImage vrsImage = new VrsImage(adornboundary);
        boolean z = true;
        if (adornboundary.RatingCompat != null) {
            vrsImage.IconCompatParcelizer(adornboundary.RatingCompat);
        }
        PatternItem patternItem = adornboundary.write;
        patternItem.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime2;
        if (patternItem.write.setCheckable().equalsIgnoreCase("th")) {
            i3 = offsetDateTime.getYear() + 543;
            i4 = offsetDateTime.getMonthValue() - 1;
            i2 = offsetDateTime2.getYear() + 543;
            i = offsetDateTime2.getMonthValue();
        } else {
            i3 = offsetDateTime.getYear();
            i4 = offsetDateTime.getMonthValue() - 1;
            i2 = offsetDateTime2.getYear();
            i = offsetDateTime2.getMonthValue();
        }
        int i5 = i - 1;
        HashMap<String, ArrayList<Calendar>> hashMap = new HashMap<>();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i6 = i2 - i3;
        if (i6 > 1) {
            PatternItem.IconCompatParcelizer(arrayList, i4, 12, i3);
            PatternItem.write(arrayList2, i5, i2);
            hashMap.put(String.valueOf(i3), arrayList);
            hashMap.put(String.valueOf(i2), arrayList2);
            int i7 = 0;
            while (i7 < i6 - 1) {
                ArrayList arrayList3 = new ArrayList();
                int i8 = i3 + 1;
                PatternItem.read(arrayList3, i3);
                hashMap.put(String.valueOf(i8), arrayList3);
                i7++;
                i3 = i8;
            }
        } else if (i2 == i3) {
            PatternItem.IconCompatParcelizer(arrayList, i4, offsetDateTime2.getMonthValue(), i3);
            hashMap.put(String.valueOf(i3), arrayList);
        } else if (i6 == 1) {
            PatternItem.IconCompatParcelizer(arrayList, i4, 12, i3);
            PatternItem.write(arrayList2, i5, i2);
            hashMap.put(String.valueOf(i3), arrayList);
            hashMap.put(String.valueOf(i2), arrayList2);
        }
        adornboundary.MediaBrowserCompat$SearchResultReceiver = hashMap;
        adornBoundary adornboundary2 = this.depositExportStatementPresenter;
        immediateCheckedFuture immediatecheckedfuture = (immediateCheckedFuture) getIntent().getParcelableExtra("TAG_DEPOSIT_DISPLAY");
        adornboundary2.IconCompatParcelizer = immediatecheckedfuture;
        String str2 = immediatecheckedfuture.PlaybackStateCompat;
        adornboundary2.MediaMetadataCompat = str2;
        if (str2 == null || str2.length() == 0) {
            str = immediatecheckedfuture.AppCompatDialogFragment;
        } else {
            str = adornboundary2.MediaMetadataCompat;
        }
        adornboundary2.MediaMetadataCompat = str;
        String str3 = immediatecheckedfuture.MediaBrowserCompat$ItemReceiver;
        binarize binarize = new binarize(adornboundary2.MediaMetadataCompat);
        if (adornboundary2.RatingCompat != null) {
            binarize.IconCompatParcelizer(adornboundary2.RatingCompat);
        }
        fromNv21 fromnv21 = new fromNv21(str3);
        if (adornboundary2.RatingCompat != null) {
            fromnv21.IconCompatParcelizer(adornboundary2.RatingCompat);
        }
        nativeScale nativescale = new nativeScale(adornboundary2);
        if (adornboundary2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nativescale.IconCompatParcelizer(adornboundary2.RatingCompat);
        }
        this.AlertController$RecycleListView = getString(R.string.deposit_dialog_title);
        this.btDone.setEnabled(false);
        setStackedBackground();
        this.AppCompatActivity.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "export_stmt_detail");
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver((Context) this, (int) R.drawable.bankicon_scb, this.ivLogo, getICheckDeserializerRtti.write((Context) this, (int) R.drawable.bankicon_scb).toString(), getResources().getDimensionPixelOffset(R.dimen.f71972131165267), setLastBaselineToBottomHeight.read(getApplicationContext(), R.color.f66402131099796));
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.export_deposite_title_bar);
        setTabContainer();
    }

    public final void IconCompatParcelizer() {
        this.rowErrorInline.setVisibility(0);
        this.viewStartDate.setSelected(true);
        this.viewEndDate.setSelected(true);
        this.btDone.setEnabled(false);
    }

    public final void IconCompatParcelizer(String str) {
        this.tvEmail.setText(str);
    }

    public final void write(String str) {
        this.tvAccountName.setText(str);
    }

    public final void read(String str) {
        this.tvAccountNumber.setText(str);
    }

    public final void read(String[] strArr, String[] strArr2) {
        this.MediaBrowserCompat$MediaItem = strArr;
        this.PlaybackStateCompat$CustomAction = strArr2;
        View inflate = LayoutInflater.from(this).inflate(R.layout.f81912131493417, this.rootView, false);
        this.MediaSessionCompat$Token = (NumberPicker) inflate.findViewById(R.id.month_picker);
        this.setHasDecor = (NumberPicker) inflate.findViewById(R.id.year_picker);
        this.AppCompatDialogFragment = (TextView) inflate.findViewById(R.id.tv_dialog_title);
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(this, 16974374);
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = inflate;
        this.setHasDecor.setMinValue(0);
        this.setHasDecor.setMaxValue(strArr2.length - 1);
        this.setHasDecor.setDisplayedValues(strArr2);
        this.MediaSessionCompat$Token.setMinValue(0);
        this.MediaSessionCompat$Token.setMaxValue(strArr.length - 1);
        this.MediaSessionCompat$Token.setDisplayedValues(strArr);
        PlaybackStateCompat.CustomAction write = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        write.setCancelable(false);
        write.requestWindowFeature(1);
        write.show();
        this.MediaSessionCompat$Token.setOnValueChangedListener(this.Keep);
        this.setHasDecor.setOnValueChangedListener(this.setBackgroundResource);
        inflate.findViewById(R.id.bt_done).setOnClickListener(new C10084oI(this, write, getString(R.string.deposit_export_date_format)));
    }

    public final void MediaBrowserCompat$ItemReceiver(String[] strArr) {
        this.MediaBrowserCompat$MediaItem = strArr;
        this.MediaSessionCompat$Token.setDisplayedValues((String[]) null);
        this.MediaSessionCompat$Token.setMinValue(0);
        this.MediaSessionCompat$Token.setMaxValue(strArr.length - 1);
        this.MediaSessionCompat$Token.setDisplayedValues(strArr);
    }

    public final void write(int i) {
        this.MediaSessionCompat$Token.setValue(i);
        this.Keep.onValueChange(this.MediaSessionCompat$Token, i - 1, i);
    }

    public final void read(int i) {
        this.setHasDecor.setValue(i);
        this.setBackgroundResource.onValueChange(this.setHasDecor, i - 1, i);
    }

    public final void write(CrashlyticsNativeComponent crashlyticsNativeComponent) {
        Intent intent = new Intent(this, ExportStatementSuccessfulActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_DEPOSIT_EXPORT_STATEMENT_DISPLAY", crashlyticsNativeComponent);
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
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.btDone.setEnabled(true);
        this.rowErrorInline.setVisibility(8);
    }

    public final void IconCompatParcelizer(boolean z) {
        this.checkBoxNoteRequest.setTextColor(z ? -9212296 : -3553587);
        this.checkBoxNoteRequest.setEnabled(z);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        String str = this.MediaBrowserCompat$MediaItem[this.MediaSessionCompat$ResultReceiverWrapper];
        String str2 = this.PlaybackStateCompat$CustomAction[this.PlaybackStateCompat];
        this.AppCompatDialogFragment.setText(String.format(this.AlertController$RecycleListView, new Object[]{str, str2}));
    }

    @OnClick
    public void onButtonDoneClick() {
        StringBuilder sb = new StringBuilder();
        sb.append("accountType: ");
        sb.append(this.depositExportStatementPresenter.IconCompatParcelizer());
        boolean z = false;
        onCheckBoxClick.read(sb.toString(), new Object[0]);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("month diff: ");
        sb2.append(this.depositExportStatementPresenter.read());
        onCheckBoxClick.read(sb2.toString(), new Object[0]);
        this.AppCompatActivity.read("request_month", this.depositExportStatementPresenter.read());
        this.AppCompatActivity.read("request_account", this.depositExportStatementPresenter.IconCompatParcelizer());
        this.AppCompatActivity.read("request_annotation", ScriptIntrinsicBLAS.Transpose.MediaBrowserCompat$ItemReceiver(this.checkBoxNoteRequest.isChecked()));
        this.AppCompatActivity.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "export_stmt_request");
        adornBoundary adornboundary = this.depositExportStatementPresenter;
        boolean isChecked = this.checkBoxNoteRequest.isChecked();
        if (adornBoundary.write(adornboundary.MediaBrowserCompat$MediaItem, adornboundary.MediaBrowserCompat$ItemReceiver)) {
            Calendar read = adornboundary.read(adornboundary.MediaBrowserCompat$MediaItem);
            Calendar read2 = adornboundary.read(adornboundary.MediaBrowserCompat$ItemReceiver);
            adornboundary.write.read(new CustomConcurrentHashMap.AbstractSerializationProxy(adornboundary.IconCompatParcelizer.AppCompatViewInflater, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ") {
                public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
                    StringBuffer format = super.format(date, stringBuffer, fieldPosition);
                    return format.insert(format.length() - 2, ":");
                }

                public final Object parseObject(String str, ParsePosition parsePosition) {
                    if (str.length() > 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str.substring(0, str.length() - 3));
                        sb.append(str.substring(str.length() - 2));
                        str = sb.toString();
                    }
                    return super.parse(str, parsePosition);
                }
            }.format(read.getTime()), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ") {
                public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
                    StringBuffer format = super.format(date, stringBuffer, fieldPosition);
                    return format.insert(format.length() - 2, ":");
                }

                public final Object parseObject(String str, ParsePosition parsePosition) {
                    if (str.length() > 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str.substring(0, str.length() - 3));
                        sb.append(str.substring(str.length() - 2));
                        str = sb.toString();
                    }
                    return super.parse(str, parsePosition);
                }
            }.format(read2.getTime()), adornboundary.IconCompatParcelizer.setBackgroundResource.value, isChecked ? "ANNOTATION" : "STANDARD"));
            adornboundary.write.IconCompatParcelizer(new adornBoundary.read(isChecked));
            return;
        }
        nativeToBitmap nativetobitmap = nativeToBitmap.write;
        if (adornboundary.RatingCompat != null) {
            z = true;
        }
        if (z) {
            nativetobitmap.IconCompatParcelizer(adornboundary.RatingCompat);
        }
    }

    @OnClick
    public void onButtonStartCalendarClick() {
        this.MediaBrowserCompat$SearchResultReceiver = true;
        m2877x50fd9e4a();
    }

    @OnClick
    public void onButtonEndCalendarClick() {
        this.MediaBrowserCompat$SearchResultReceiver = false;
        m2877x50fd9e4a();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m2877x50fd9e4a() {
        int i;
        boolean z = false;
        this.btDone.setEnabled(false);
        this.viewStartDate.setSelected(false);
        this.viewEndDate.setSelected(false);
        this.MediaSessionCompat$ResultReceiverWrapper = 0;
        this.PlaybackStateCompat = 0;
        this.rowErrorInline.setVisibility(8);
        adornBoundary adornboundary = this.depositExportStatementPresenter;
        int MediaBrowserCompat$CustomActionResultReceiver = adornboundary.write.MediaBrowserCompat$CustomActionResultReceiver();
        String[] strArr = new String[adornboundary.MediaBrowserCompat$SearchResultReceiver.keySet().size()];
        int i2 = 0;
        for (String str : adornboundary.MediaBrowserCompat$SearchResultReceiver.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        String[] MediaBrowserCompat$ItemReceiver = adornboundary.MediaBrowserCompat$ItemReceiver(String.valueOf(MediaBrowserCompat$CustomActionResultReceiver));
        adornboundary.write(MediaBrowserCompat$ItemReceiver.length > 0, new nativeKtdxXML(MediaBrowserCompat$ItemReceiver, strArr));
        adornBoundary adornboundary2 = this.depositExportStatementPresenter;
        int MediaBrowserCompat$CustomActionResultReceiver2 = adornboundary2.write.MediaBrowserCompat$CustomActionResultReceiver();
        Iterator<String> it = adornboundary2.MediaBrowserCompat$SearchResultReceiver.keySet().iterator();
        int i3 = 0;
        while (it.hasNext() && !it.next().equalsIgnoreCase(String.valueOf(MediaBrowserCompat$CustomActionResultReceiver2))) {
            i3++;
        }
        processPage processpage = new processPage(i3);
        if (adornboundary2.RatingCompat != null) {
            processpage.IconCompatParcelizer(adornboundary2.RatingCompat);
        }
        adornBoundary adornboundary3 = this.depositExportStatementPresenter;
        int MediaBrowserCompat$CustomActionResultReceiver3 = adornboundary3.write.MediaBrowserCompat$CustomActionResultReceiver();
        int monthValue = adornboundary3.write.MediaBrowserCompat$CustomActionResultReceiver.getMonthValue();
        Iterator<String> it2 = adornboundary3.MediaBrowserCompat$SearchResultReceiver.keySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = 0;
                break;
            } else if (it2.next().equalsIgnoreCase(String.valueOf(MediaBrowserCompat$CustomActionResultReceiver3))) {
                Iterator it3 = adornboundary3.MediaBrowserCompat$SearchResultReceiver.get(String.valueOf(MediaBrowserCompat$CustomActionResultReceiver3)).iterator();
                i = 0;
                while (it3.hasNext() && ((Calendar) it3.next()).get(2) != monthValue - 1) {
                    i++;
                }
            }
        }
        nativeFromBitmap nativefrombitmap = new nativeFromBitmap(i);
        if (adornboundary3.RatingCompat != null) {
            z = true;
        }
        if (z) {
            nativefrombitmap.IconCompatParcelizer(adornboundary3.RatingCompat);
        }
    }
}

package com.scb.phone.view.activity.maintenance;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.LogFileManager;
import p040o.QueueFileLogStore;
import p040o.Tables;
import p040o.getEnvManufacturer;
import p040o.getEnvModel;
import p040o.getReasonForRejection;

public class MaintenanceActivity extends BaseActivity implements getReasonForRejection {
    @HmlPinActivity
    public getEnvManufacturer maintenancePresenter;
    @BindView
    TextView tvMaintenanceMessage;

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78592131493084);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        this.maintenancePresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().hasExtra("TAG_DATA")) {
            LogFileManager.DirectoryProvider directoryProvider = (LogFileManager.DirectoryProvider) getIntent().getParcelableExtra("TAG_DATA");
            getEnvManufacturer getenvmanufacturer = this.maintenancePresenter;
            Tables.TransposeTable.CellSet cellSet = getenvmanufacturer.MediaBrowserCompat$ItemReceiver;
            String str3 = directoryProvider.MediaMetadataCompat;
            String str4 = directoryProvider.MediaDescriptionCompat;
            Resources resources = cellSet.MediaBrowserCompat$CustomActionResultReceiver;
            int i = Iterables.C35273.read.scb_purple;
            if (Build.VERSION.SDK_INT >= 23) {
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(Integer.toHexString(resources.getColor(i, (Resources.Theme) null) & 16777215));
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("#");
                sb2.append(Integer.toHexString(resources.getColor(i) & 16777215));
                str = sb2.toString();
            }
            boolean z = false;
            if (str4 != null) {
                str2 = str4.replaceAll("<b>", String.format("<font color='%s'>", new Object[]{str})).replaceAll("</b>", "</font>").replaceAll("<br>", "<br><br>").trim();
            } else {
                str2 = "";
            }
            getEnvModel getenvmodel = new getEnvModel(new QueueFileLogStore(str3, str2));
            if (getenvmanufacturer.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getenvmodel.IconCompatParcelizer(getenvmanufacturer.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(QueueFileLogStore queueFileLogStore) {
        MediaSessionCompat$QueueItem(queueFileLogStore.MediaBrowserCompat$ItemReceiver);
        if (Build.VERSION.SDK_INT >= 24) {
            this.tvMaintenanceMessage.setText(Html.fromHtml(queueFileLogStore.write, 0));
        } else {
            this.tvMaintenanceMessage.setText(Html.fromHtml(queueFileLogStore.write));
        }
    }
}

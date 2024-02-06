package p040o;

import android.content.res.Resources;
import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.deposit.exportstatement.DepositExportStatementActivity;
import org.threeten.p041bp.OffsetDateTime;
import p040o.PlaybackStateCompat;

/* renamed from: o.oI */
public final /* synthetic */ class C10084oI implements View.OnClickListener {
    private final /* synthetic */ PlaybackStateCompat.CustomAction MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ DepositExportStatementActivity read;
    private final /* synthetic */ String write;

    public /* synthetic */ C10084oI(DepositExportStatementActivity depositExportStatementActivity, PlaybackStateCompat.CustomAction customAction, String str) {
        this.read = depositExportStatementActivity;
        this.MediaBrowserCompat$ItemReceiver = customAction;
        this.write = str;
    }

    public final void onClick(View view) {
        DepositExportStatementActivity depositExportStatementActivity = this.read;
        PlaybackStateCompat.CustomAction customAction = this.MediaBrowserCompat$ItemReceiver;
        String str = this.write;
        customAction.dismiss();
        String str2 = depositExportStatementActivity.MediaBrowserCompat$MediaItem[depositExportStatementActivity.MediaSessionCompat$ResultReceiverWrapper];
        String str3 = depositExportStatementActivity.PlaybackStateCompat$CustomAction[depositExportStatementActivity.PlaybackStateCompat];
        boolean z = false;
        if (depositExportStatementActivity.MediaBrowserCompat$SearchResultReceiver) {
            depositExportStatementActivity.MediaDescriptionCompat = true;
            depositExportStatementActivity.tvSelectStartMonth.setText(String.format(str, new Object[]{str2, str3}));
        } else {
            depositExportStatementActivity.MediaMetadataCompat = true;
            depositExportStatementActivity.tvSelectEndMonth.setText(String.format(str, new Object[]{str2, str3}));
        }
        if (depositExportStatementActivity.MediaDescriptionCompat && depositExportStatementActivity.MediaMetadataCompat) {
            String string = depositExportStatementActivity.getString(R.string.deposit_export_success_format);
            adornBoundary adornboundary = depositExportStatementActivity.depositExportStatementPresenter;
            Resources resources = depositExportStatementActivity.getResources();
            adornboundary.MediaDescriptionCompat = String.format(string, new Object[]{CheckCaptureActivity.read(resources, "MMM yyyy", OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(adornboundary.read(adornboundary.MediaBrowserCompat$MediaItem)), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"))), CheckCaptureActivity.read(resources, "MMM yyyy", OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(adornboundary.read(adornboundary.MediaBrowserCompat$ItemReceiver)), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok")))});
            adornBoundary adornboundary2 = depositExportStatementActivity.depositExportStatementPresenter;
            if (adornBoundary.write(adornboundary2.MediaBrowserCompat$MediaItem, adornboundary2.MediaBrowserCompat$ItemReceiver)) {
                fromGrayscale fromgrayscale = fromGrayscale.write;
                if (adornboundary2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    fromgrayscale.IconCompatParcelizer(adornboundary2.RatingCompat);
                    return;
                }
                return;
            }
            nativeToBitmap nativetobitmap = nativeToBitmap.write;
            if (adornboundary2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nativetobitmap.IconCompatParcelizer(adornboundary2.RatingCompat);
            }
        }
    }
}

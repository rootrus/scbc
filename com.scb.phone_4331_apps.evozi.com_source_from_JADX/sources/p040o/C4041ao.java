package p040o;

import android.view.View;
import com.scb.phone.view.activity.demo.ntb.NTBBankingServiceActivity;
import java.util.List;
import p040o.StandardTable;

/* renamed from: o.ao */
public class C4041ao extends writeUInt64NoTag<IImageProcessorListener> {
    public setPasswordVisibilityToggleContentDescription IconCompatParcelizer;
    public TransformationChildLayout MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public getEulerY MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public StandardTable.Column.Values.C38232 MediaMetadataCompat;
    public int read;
    public List<IdManager> write;

    /* renamed from: o.ao$a */
    public final /* synthetic */ class C4043a implements View.OnClickListener {
        private final /* synthetic */ NTBBankingServiceActivity IconCompatParcelizer;

        public /* synthetic */ C4043a(NTBBankingServiceActivity nTBBankingServiceActivity) {
            this.IconCompatParcelizer = nTBBankingServiceActivity;
        }

        public final void onClick(View view) {
            this.IconCompatParcelizer.lambda$showCoachMark$0$NTBBankingServiceActivity(view);
        }
    }

    @HmlPinActivity
    public C4041ao(RegularImmutableBiMap regularImmutableBiMap, getEulerY geteulery, setPasswordVisibilityToggleContentDescription setpasswordvisibilitytogglecontentdescription, TransformationChildLayout transformationChildLayout, StandardTable.Column.Values.C38232 r5) {
        super(regularImmutableBiMap);
        this.MediaDescriptionCompat = geteulery;
        this.IconCompatParcelizer = setpasswordvisibilitytogglecontentdescription;
        this.MediaBrowserCompat$ItemReceiver = transformationChildLayout;
        this.MediaMetadataCompat = r5;
    }

    public void onDestroy() {
        setPasswordVisibilityToggleContentDescription setpasswordvisibilitytogglecontentdescription = this.IconCompatParcelizer;
        if (!setpasswordvisibilitytogglecontentdescription.MediaBrowserCompat$MediaItem.isDisposed()) {
            setpasswordvisibilitytogglecontentdescription.MediaBrowserCompat$MediaItem.dispose();
        }
        TransformationChildLayout transformationChildLayout = this.MediaBrowserCompat$ItemReceiver;
        if (!transformationChildLayout.MediaBrowserCompat$MediaItem.isDisposed()) {
            transformationChildLayout.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4041ao aoVar) {
        if (aoVar.RatingCompat != null) {
            aoVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(C4041ao aoVar) {
        if (aoVar.RatingCompat != null) {
            aoVar.RatingCompat.aj_();
        }
    }
}

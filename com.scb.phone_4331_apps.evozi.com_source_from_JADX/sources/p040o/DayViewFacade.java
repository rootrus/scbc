package p040o;

import com.scb.phone.view.activity.ntb.ekyc.NationalIdActivity;
import com.scb.phone.view.custom.common.DateInputText;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;

/* renamed from: o.DayViewFacade */
public final /* synthetic */ class DayViewFacade implements DateInputText.read {
    private final /* synthetic */ NationalIdActivity write;

    public /* synthetic */ DayViewFacade(NationalIdActivity nationalIdActivity) {
        this.write = nationalIdActivity;
    }

    /* renamed from: o.DayViewFacade$Span */
    public final class Span {
        private static final String[] write = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

        public static void read(NationalIdActivity nationalIdActivity) {
            if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(nationalIdActivity, write)) {
                nationalIdActivity.MediaSessionCompat$QueueItem();
            } else {
                AppCompatRatingBar.write(nationalIdActivity, write, 38);
            }
        }

        public static void MediaBrowserCompat$ItemReceiver(NationalIdActivity nationalIdActivity, int i, int[] iArr) {
            if (i == 38 && ProxySourceAdapter$ItemViewHolder.write(iArr)) {
                nationalIdActivity.MediaSessionCompat$QueueItem();
            }
        }
    }

    public final void read(String str) {
        getFrameSize getframesize = this.write.nationalIdPresenter;
        AutoValue_CrashlyticsReport_FilesPayload.Builder builder = getframesize.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (!str.contains("/")) {
            if (str.length() == 8) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(0, 2));
                sb.append("/");
                sb.append(str.substring(2, 4));
                sb.append("/");
                sb.append(str.substring(4));
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                int i = 0;
                while (str.length() > 0 && i <= 2) {
                    if (i < 2) {
                        if (str.length() > 0 && Integer.valueOf(str.substring(0, 1)).intValue() > 3) {
                            sb2.append(str.charAt(0));
                            sb2.append("/");
                            str = str.substring(1);
                        } else if (str.length() >= 2) {
                            sb2.append(str.substring(0, 2));
                            sb2.append("/");
                            str = str.substring(2);
                        }
                        i++;
                    } else {
                        sb2.append(str);
                        str = "";
                    }
                }
                str = sb2.toString();
            }
        }
        builder.MediaSessionCompat$Token = str;
        lambda$static$0 lambda_static_0 = new lambda$static$0(getframesize);
        if (getframesize.RatingCompat == null) {
            z = false;
        }
        if (z) {
            lambda_static_0.IconCompatParcelizer(getframesize.RatingCompat);
        }
    }
}

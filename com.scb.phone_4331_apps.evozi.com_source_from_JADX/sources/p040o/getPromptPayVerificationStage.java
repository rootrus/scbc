package p040o;

import android.text.TextUtils;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import p040o.Image;

/* renamed from: o.getPromptPayVerificationStage */
public final /* synthetic */ class getPromptPayVerificationStage implements getActivateChequeVerification {
    private final /* synthetic */ EasycashContactInformationFragment write;

    public /* synthetic */ getPromptPayVerificationStage(EasycashContactInformationFragment easycashContactInformationFragment) {
        this.write = easycashContactInformationFragment;
    }

    public final boolean IconCompatParcelizer(String str) {
        Image.C34591 r0 = this.write.presenter;
        if (!TextUtils.isEmpty(str)) {
            str = str.replace("-", "");
        }
        boolean write2 = removeIfFromRandomAccessList.write(str);
        if (write2) {
            r0.MediaSessionCompat$QueueItem.RatingCompat = str;
        } else {
            r0.MediaSessionCompat$QueueItem.RatingCompat = "";
        }
        setEmpty setempty = new setEmpty(r0);
        if (r0.RatingCompat != null) {
            setempty.IconCompatParcelizer(r0.RatingCompat);
        }
        return write2;
    }
}

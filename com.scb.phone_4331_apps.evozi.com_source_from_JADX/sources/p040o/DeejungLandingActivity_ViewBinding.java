package p040o;

import android.view.View;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import p040o.clickSaveSlip;

/* renamed from: o.DeejungLandingActivity_ViewBinding */
public class DeejungLandingActivity_ViewBinding {
    protected final FragmentBuilder_BindHmlExternalAuthenticationFragment IconCompatParcelizer;
    protected final String MediaBrowserCompat$CustomActionResultReceiver;
    private final clickSaveSlip.read MediaBrowserCompat$ItemReceiver;

    protected DeejungLandingActivity_ViewBinding(String str, FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindHmlExternalAuthenticationFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = new clickSaveSlip.read(str, ((FragmentBuilder_BindHmlIssuerInputFragment) FragmentBuilder_BindHmlIssuerLandingFragment.setIcon()).MediaDescriptionCompat);
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity, View view, int i, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, String str, String str2) {
        DeejungTransferLandingActivity deejungTransferLandingActivity2;
        DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity, this.MediaBrowserCompat$CustomActionResultReceiver, view, i, settextappearance, (setTextAppearance<View, DeejungTransferLandingActivity>) null, str, str2);
        clickSaveSlip.read read = this.MediaBrowserCompat$ItemReceiver;
        if (MediaBrowserCompat$ItemReceiver2 != null && settextappearance != null) {
            BaseResponse IconCompatParcelizer2 = FragmentBuilder_BindHmlIssuerLandingFragment.IconCompatParcelizer(read.MediaBrowserCompat$ItemReceiver);
            if (IconCompatParcelizer2 != null) {
                read.IconCompatParcelizer = IconCompatParcelizer2.getCaptures();
            }
            if (read.IconCompatParcelizer != null) {
                int i2 = 0;
                while (true) {
                    Captures[] capturesArr = read.IconCompatParcelizer;
                    if (i2 >= capturesArr.length) {
                        break;
                    }
                    Captures captures = capturesArr[i2];
                    String path = captures.getPath();
                    StringBuilder sb = new StringBuilder();
                    sb.append(MediaBrowserCompat$ItemReceiver2.ParcelableVolumeInfo);
                    sb.append("/");
                    if (path.startsWith(sb.toString()) && (deejungTransferLandingActivity2 = settextappearance.get(captures.getPath())) != null) {
                        try {
                            String write = BankingAgentReviewActivity.write(deejungTransferLandingActivity2.IconCompatParcelizer);
                            String id = captures.getId();
                            if (read.RatingCompat == null) {
                                read.RatingCompat = new clickSaveSlip.read.C10786read(read, (byte) 0);
                            }
                            if (read.write == null) {
                                read.write = new clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
                            }
                            if (read.write.read) {
                                clickSaveSlip$MediaBrowserCompat$CustomActionResultReceiver clicksaveslip_mediabrowsercompat_customactionresultreceiver = read.write;
                                clicksaveslip_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver.clear();
                                clicksaveslip_mediabrowsercompat_customactionresultreceiver.read = false;
                            }
                            read.write.MediaBrowserCompat$ItemReceiver(id, write);
                            clickSaveSlip.read.read.removeCallbacks(read.RatingCompat);
                            clickSaveSlip.read.read.postDelayed(read.RatingCompat, 500);
                        } catch (Exception e) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Error whilst data capturing. ");
                            sb2.append(e.getMessage());
                            MyECouponActivity_ViewBinding.write(sb2.toString());
                        }
                        View view2 = deejungTransferLandingActivity2.IconCompatParcelizer;
                        String id2 = captures.getId();
                        String str3 = read.MediaBrowserCompat$ItemReceiver;
                        FragmentBuilder_BindHmlBusinessOccupationInfoFragment fragmentBuilder_BindHmlBusinessOccupationInfoFragment = read.MediaBrowserCompat$CustomActionResultReceiver;
                        if (!BankingAgentSuccessActivity_ViewBinding.write(view2)) {
                            setTapIcon.MediaBrowserCompat$ItemReceiver(view2, id2, str3, fragmentBuilder_BindHmlBusinessOccupationInfoFragment);
                        }
                    }
                    i2++;
                }
            }
        }
        FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2);
    }

    /* access modifiers changed from: package-private */
    public final void read(DeejungTransferLandingActivity deejungTransferLandingActivity, DeejungTransferLandingActivity deejungTransferLandingActivity2, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        if (deejungTransferLandingActivity2 != null) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity2);
            this.IconCompatParcelizer.read(deejungTransferLandingActivity, deejungTransferLandingActivity2, this.MediaBrowserCompat$CustomActionResultReceiver, settextappearance);
        }
    }
}

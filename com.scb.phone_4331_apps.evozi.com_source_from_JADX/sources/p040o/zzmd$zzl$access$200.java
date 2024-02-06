package p040o;

import com.scb.phone.p035di.ActivityBuilder_BindGiftingSelectRecipientActivity;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingSelectRecipientActivity;
import p040o.Table;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$access$200 */
final class zzmd$zzl$access$200 implements ActivityBuilder_BindGiftingSelectRecipientActivity.IconCompatParcelizer {
    private /* synthetic */ zzmd.zzl IconCompatParcelizer;

    /* synthetic */ zzmd$zzl$access$200(zzmd.zzl zzl) {
        this(zzl, (byte) 0);
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        GiftingSelectRecipientActivity giftingSelectRecipientActivity = (GiftingSelectRecipientActivity) obj;
        onDismiss.MediaBrowserCompat$ItemReceiver(giftingSelectRecipientActivity, this.IconCompatParcelizer.setInitialActivityCount.get());
        zzmd.zzl zzl = this.IconCompatParcelizer;
        zzmd.zzl zzl2 = this.IconCompatParcelizer;
        IServerExtractor.write(giftingSelectRecipientActivity, new getSessionAppSize(new RegularImmutableBiMap(zzmd.zzb.write(zzl.IconCompatParcelizer, zzl.getReenterTransition), this.IconCompatParcelizer.setInitialActivityCount.get()), this.IconCompatParcelizer.equals.get(), this.IconCompatParcelizer.put.get(), this.IconCompatParcelizer.setTitleTextColor.get(), this.IconCompatParcelizer.setInitialActivityCount.get(), this.IconCompatParcelizer.ListMenuItemView.get(), this.IconCompatParcelizer.setSupportButtonTintList.get(), new Table.Cell(zzmd.zzb.write(zzl2.IconCompatParcelizer, zzl2.getReenterTransition), this.IconCompatParcelizer.setInitialActivityCount.get()), this.IconCompatParcelizer.getNextAnim.get(), this.IconCompatParcelizer.AppCompatCheckBox.get()));
        zzmd.zzl zzl3 = this.IconCompatParcelizer;
        IServerExtractor.IconCompatParcelizer((BaseActivity) giftingSelectRecipientActivity, constrainedEntrySet.MediaBrowserCompat$ItemReceiver(zzl3.setHideOnContentScrollEnabled, zzl3.getReenterTransition));
        IServerExtractor.IconCompatParcelizer((BaseActivity) giftingSelectRecipientActivity, this.IconCompatParcelizer.getNextAnim.get());
        IServerExtractor.read(giftingSelectRecipientActivity, this.IconCompatParcelizer.getReenterTransition);
    }

    private zzmd$zzl$access$200(zzmd.zzl zzl, byte b) {
        this.IconCompatParcelizer = zzl;
    }
}

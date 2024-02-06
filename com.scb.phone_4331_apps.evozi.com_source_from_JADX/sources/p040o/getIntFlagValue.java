package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;

/* renamed from: o.getIntFlagValue */
public final /* synthetic */ class getIntFlagValue implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindSummaryFragment write;

    public /* synthetic */ getIntFlagValue(FragmentBuilder_BindSummaryFragment fragmentBuilder_BindSummaryFragment) {
        this.write = fragmentBuilder_BindSummaryFragment;
    }

    public final Object write(Object obj) {
        return this.write.MediaDescriptionCompat.write((drawCharacter) ((SingleDataEntity) obj).getData());
    }
}

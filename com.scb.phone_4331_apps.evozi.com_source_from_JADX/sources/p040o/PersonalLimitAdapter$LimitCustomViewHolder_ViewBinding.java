package p040o;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

/* renamed from: o.PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding */
public class PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding {
    protected PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding(C10432xa04fa290 suitabilitySummaryAdapter$SuitabilitySummarySectionViewHolder_ViewBinding) {
        Class<IvParameterSpec> cls = IvParameterSpec.class;
        Class<PBEParameterSpec> cls2 = PBEParameterSpec.class;
        Class<RC2ParameterSpec> cls3 = RC2ParameterSpec.class;
        Class<RC5ParameterSpec> cls4 = RC5ParameterSpec.class;
        new C10431x67dd7966(suitabilitySummaryAdapter$SuitabilitySummarySectionViewHolder_ViewBinding);
    }

    /* renamed from: o.PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding$write */
    public static class write extends PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding {
        public write() {
            super(new TileAdapter(new SuitabilitySummaryAdapter$SuitabilitySummarySectionViewHolder()));
        }
    }

    /* renamed from: o.PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding$IconCompatParcelizer */
    public static class IconCompatParcelizer extends PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding {
        public IconCompatParcelizer() {
            super(new TileAdapter(new SuitabilitySummaryAdapter$SuitabilitySummaryHeaderViewHolder()));
        }
    }

    @HmlPinActivity
    public PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding() {
    }
}

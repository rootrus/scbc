package p040o;

import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.ActivityBuilder_ContributeEasycashBaseIntroductionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeEasycashBaseIntroductionActivity implements getAllowEnterTransitionOverlap {
    private final /* synthetic */ OffsetDateTime read;

    public /* synthetic */ ActivityBuilder_ContributeEasycashBaseIntroductionActivity(OffsetDateTime offsetDateTime) {
        this.read = offsetDateTime;
    }

    public final Object read(int i) {
        return this.read.minusMonths((long) i);
    }
}

package p040o;

/* renamed from: o.SimulatorTutorialViewPagerAdapter$TutorialItemHolder */
final class SimulatorTutorialViewPagerAdapter$TutorialItemHolder {
    private static InsurersAdapter$InsurersViewHolder_ViewBinding write = new InsurersAdapter$InsurersViewHolder_ViewBinding();

    SimulatorTutorialViewPagerAdapter$TutorialItemHolder() {
    }

    static {
        new SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding();
    }

    static InsurersAdapter$InsurersViewHolder_ViewBinding write(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        return companyItemViewHolder_ViewBinding.write.size() <= 0 ? write : new InsurersAdapter$InsurersViewHolder_ViewBinding(companyItemViewHolder_ViewBinding);
    }
}

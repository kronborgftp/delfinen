package clubmanagement;

public class Contingent {
    private Membership membership;
    private int amount;

    public Contingent(Membership membership) {
        this.membership = membership;
        this.amount = calculateContingent();
    }

    // Getter methods
    public Membership getMembership() {
        return membership;
    }

    public int getAmount() {
        return amount;
    }

    private int calculateContingent() {
        Person member = membership.getMember();
        int baseAmount;

        if (member.getActivityType() == ActivityType.ACTIVE) {
            if (member.getMemberType() == MemberType.JUNIOR) {
                baseAmount = 1000;
            } else if (member.getMemberType() == MemberType.SENIOR) {
                baseAmount = 1600;
                if (member.getAge() > 60) {
                    baseAmount = (int) (baseAmount * 0.75); // 25% discount for seniors over 60
                }
            } else {
                // Handle other active member types as needed
                // For example, add specific conditions and base amounts for other member types
                baseAmount = 1200; // Placeholder value, adjust accordingly
            }
        } else {
            baseAmount = 500; // Passive members
        }

        return baseAmount;
    }

    @Override
    public String toString() {
        return "Contingent{" +
                "membership=" + membership +
                ", amount=" + amount +
                '}';
    }
}




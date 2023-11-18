package clubmanagement;

public class Person {
    private String name;
    private int age;
    private ActivityType activityType;
    private MemberType memberType;

    public Person(String name, int age, ActivityType activityType, MemberType memberType) {
        this.name = name;
        this.age = age;
        this.activityType = activityType;
        this.memberType = memberType;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", activityType=" + activityType +
                ", memberType=" + memberType +
                '}';
    }
}


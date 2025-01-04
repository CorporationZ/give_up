package school.maang.usercreate;

import lombok.Getter;

@Getter
public class User {

    private static final int MIN_AGE = 18;
    private static final String[] VALID_JOBS = {"Google", "Uber", "Amazon"};
    private static final String[] VALID_ADDRESS = {"London", "New York", "Amsterdam"};

    private String name;
    private int age;
    private String job;
    private String address;

    public User(String name, int age, String job, String address) {
        setName(name);
        setAge(age);
        setAddress(address);
        setJob(job);
        System.out.println("User created successfully");
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < MIN_AGE) {
            throw new IllegalArgumentException("Age cannot be less than " + MIN_AGE);
        }
        this.age = age;
    }

    public void setJob(String job) {
        for (String validJob : VALID_JOBS) {
            if (validJob.equals(job)) {
                this.job = job;
                return;
            }
        }
        throw new IllegalArgumentException("Job is not valid");
    }

    public void setAddress(String address) {
        for (String validAddress : VALID_ADDRESS) {
            if (validAddress.equals(address)) {
                this.address = address;
                return;
            }
        }
        throw new IllegalArgumentException("Address is not valid");
    }
}

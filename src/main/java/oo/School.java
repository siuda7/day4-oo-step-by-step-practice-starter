package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {

    private List<Person> schoolMembers = new ArrayList<>();

    public void startSchool() {
        String schoolMemberIntroduceMsg = schoolMembers.stream()
                .map(member -> member.introduce())
                .collect(Collectors.joining(" "));
        System.out.print(schoolMemberIntroduceMsg);
    }

    public School(List<Person> schoolMembers) {
        this.schoolMembers = schoolMembers;
    }
}

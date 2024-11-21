package oo;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Klass> klasses = new ArrayList<>();

    public void startSchool() {
        klasses.stream()
                .forEach(klass -> klass.allMemberIntroduce());
    }

    public School(List<Klass> klasses) {
        this.klasses = klasses;
    }
}

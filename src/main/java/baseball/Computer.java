package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    List<Integer> randomList;

    public Computer() {
        randomList = new ArrayList<>();
        initialize();
    }

    public void initialize() {
        insertRandom();
    }

    public void clearAndInitialize() {
        randomList.clear();
        insertRandom();
    }

    public List<Integer> getRandomList() {
        return randomList;
    }

    private void insertRandom() {
        while (randomList.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!randomList.contains(randomNumber)) {
                randomList.add(randomNumber);
            }
        }
    }
}

package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class NumberGenerator {

    public static final int LOTTO_NUMBER_COUNT = 6;
    public static final int BONUS_NUMBER_COUNT = 1;

    // 중복되지 않는 로또 번호 1~45 까지의 범위의 숫자 6개를 생성한다.
    public List<Integer> createLottoNumber() {
        return Randoms.pickUniqueNumbersInRange(1, 45, LOTTO_NUMBER_COUNT);
    }

}
